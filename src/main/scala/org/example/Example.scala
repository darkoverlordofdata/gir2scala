package org.example

import scala.scalajs.js
import js.Dynamic.{ literal => l, global => g }
import org.gnome.GLib
import org.gnome.Gtk
import org.gnome.Gio

class Example() {
    val DATADIR = "/home/bruce/gjs/gir2scala/share/example"
    val APP_FOLDER = "/example"
    val USER_DATA_DIR = GLib.get_user_data_dir()+APP_FOLDER
    val THEMES = Array(
        "elementary",
        "Adwaita"
    )

    val application = new Gtk.Application(l(flags = Gio.ApplicationFlags.FLAGS_NONE))
    lazy val appWindow = new AppWindow(this, l(application = this.application))

    application.connect("activate", ()=> {
        buildUI()
        appWindow.setConfig(getConfig())
        appWindow.buildUI()
        appWindow.window.present()
    })

    def buildUI():Unit = {
        val menu = new Gio.Menu()
        menu.append("New", "app.new")
        menu.append("About", "app.about")
        menu.append("Quit", "app.quit")
        application.set_app_menu(menu)

        val newAction = new Gio.SimpleAction(l( name = "new" ))
        newAction.connect("activate", () => showNew())
        application.add_action(newAction)

        val aboutAction = new Gio.SimpleAction(l( name = "about" ))
        aboutAction.connect("activate", () => showAbout())
        application.add_action(aboutAction)

        val quitAction = new Gio.SimpleAction(l( name = "quit" ))
        quitAction.connect("activate", () => appWindow.window.destroy())
        application.add_action(quitAction)
       
    }

    def showAbout():Unit = {
        val about = new Gtk.AboutDialog()
        about.set_logo_icon_name(null)
        about.set_transient_for(appWindow.window)
        about.set_program_name("Ouroboros")
        about.set_version("1.0")
        about.set_comments("By anonymous medieval illuminator;  Fol. 196 of Codex Parisinus graecus 2327, a copy (made by Theodoros Pelecanos (Pelekanos) of Corfu in Khandak, Iraklio, Crete in 1478) of a lost manuscript of an early medieval tract which was attributed to Synosius (Synesius) of Cyrene (d. 412).The text of the tract is attributed to Stephanus of Alexandria (7th century).cf.Public Domain,")
        about.set_website("https://commons.wikimedia.org/w/index.php?curid=2856329")
        about.set_website_label("source")
        about.set_authors(js.Array("bruce davidson"))
        about.run()
        about.destroy()
        
    }
    
    def showNew():Unit = {
        // this.appWindow.server["reset"](DATADIR)
        // this.appWindow.setUrl(`http://${this.appWindow.server.info.host}:${this.appWindow.server.info.port}/index.html`)
        // this.setConfigValue("base", DATADIR)
        // this.setConfigValue("url", "index.html")

    }
    
    def data2Config(data:String): Config = {
        val config = new Config()
        if (data != null && data != "null") {
            val p = g.JSON.parse(data)
            config.appName = p.appName.asInstanceOf[String]
            config.base = p.base.asInstanceOf[String]
            config.url = p.url.asInstanceOf[String]
            config.darkTheme = p.darkTheme.asInstanceOf[Boolean]
            config.themeName = p.themeName.asInstanceOf[String]
        }
        return config        

    }
    def getConfig():Config = {
        g.Util.mkdir(USER_DATA_DIR)
        val config = data2Config(g.Util.readFile(USER_DATA_DIR + "/config.json").asInstanceOf[String])
        val gtkSettings = Gtk.Settings.get_default().asInstanceOf[js.Dynamic]
        if (config.darkTheme)
            gtkSettings.gtk_application_prefer_dark_theme = true
        else
            gtkSettings.gtk_application_prefer_dark_theme = false
        gtkSettings.gtk_theme_name = config.themeName
        return config        
    }

    def setConfig(config:Config):Unit = {
        g.Util.writeFile(USER_DATA_DIR + "/config.json", config.toString())
    }

    def setConfigValue(name: String, value: String):Unit = {
        if (value == "") return
        val config = data2Config(g.Util.readFile(USER_DATA_DIR + "/config.json").asInstanceOf[String])
        val gtkSettings = Gtk.Settings.get_default().asInstanceOf[js.Dynamic]

        name match {
            case "base" => {
                if (config.base == value) return
                config.base = value
                setConfig(config)
                appWindow.setConfig(config)
            }
            case "url" => {
                if (config.url == value) return
                config.url = value
                setConfig(config)
                appWindow.setConfig(config)
            }
            case "darkTheme" => {
                val b = if (value == "true") true else false
                gtkSettings.gtk_application_prefer_dark_theme = b
                if (config.darkTheme == b) return                
                config.darkTheme = b
                setConfig(config)
                appWindow.setConfig(config)
            }
            case "themeName" => {
                gtkSettings.gtk_theme_name = value
                if (config.themeName == value) return
                config.themeName = value
                setConfig(config)
                appWindow.setConfig(config)
            }
        }
    }

    def buildPrefs(ctx:AppWindow):Gtk.Widget = {
        val grid = new Gtk.Grid(l(
            column_spacing = 10,
            row_spacing = 10,
            margin = 10
        ))
        grid.set_column_homogeneous(true)
        /**
         * Dark Theme?
         */
        val darkLabel = new Gtk.Label(l( label = "Dark theme:" ))
        darkLabel.set_halign(Gtk.Align.END)

        val darkEntry = new Gtk.Switch(l(
            state = ctx.config.darkTheme, 
            valign = Gtk.Align.CENTER
        ))
        darkEntry.connect("state-set", () => setConfigValue("darkTheme", darkEntry.get_active().toString()))

        grid.attach(darkLabel, 0, 0, 1, 1)
        grid.attach_next_to(darkEntry, darkLabel, Gtk.PositionType.RIGHT, 2, 1)
        /**
         * Theme Name
         */
        val themeLabel = new Gtk.Label(l(label = "Theme name:"))
        themeLabel.set_halign(Gtk.Align.END)

        val themeSelect = new Gtk.ComboBoxText()
        var i = 0
        for (theme <- THEMES) {
            themeSelect.insert(i, theme, theme)
            i += 1
        }
        themeSelect.set_active_id(ctx.config.themeName)
        themeSelect.connect("changed", () => setConfigValue("themeName", themeSelect.get_active_text()))

        grid.attach(themeLabel, 0, 1, 1, 1)
        grid.attach_next_to(themeSelect, themeLabel, Gtk.PositionType.RIGHT, 2, 1)

        /**
         * Base
         */
        val baseLabel = new Gtk.Label(l(label = "Base path:"))
        baseLabel.set_halign(Gtk.Align.END)

        val baseText = new Gtk.Entry()
        baseText.set_text(ctx.config.base)
        // baseText.connect("changed", () => this.setConfigValue("base", baseText.get_text()))
        grid.attach(baseLabel, 0, 2, 1, 1)
        grid.attach_next_to(baseText, baseLabel, Gtk.PositionType.RIGHT, 2, 1)

        /**
         * Url
         */
        val urlLabel = new Gtk.Label(l(label = "Url path:"))
        urlLabel.set_halign(Gtk.Align.END)

        val urlText = new Gtk.Entry()
        urlText.set_text(ctx.config.url)
        // urlText.connect("changed", () => this.setConfigValue("url", urlText.get_text()))
        grid.attach(urlLabel, 0, 3, 1, 1)
        grid.attach_next_to(urlText, urlLabel, Gtk.PositionType.RIGHT, 2, 1)


        /**
         * Attach menu
         */
        val menubutton = new Gtk.ToggleButton()
        menubutton.add(new Gtk.Image(l(
            icon_name = "open-menu-symbolic",
            icon_size = Gtk.IconSize.SMALL_TOOLBAR
        )))
        var menu = new Gtk.Popover()
        menu.set_relative_to(menubutton)
        menu.connect("closed", () => if (menubutton.get_active()) menubutton.set_active(false) else null)
        menubutton.connect("clicked", () => if (menubutton.get_active()) menu.show_all() else null)
        menu.add(grid)
        return menubutton
    }
}
