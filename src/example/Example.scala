package org.example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import js.Dynamic.{ literal => l }
import org.gnome.Gtk
import org.gnome.Gio

class Example {

    val application = new Gtk.Application(
        l(  
            flags           = Gio.ApplicationFlags.FLAGS_NONE,
            application_id  = "com.darkoverlordofdata.example"
        )
    )

    lazy val appWindow = new AppWindow(this,
        l(  
            title           = "Example",
            application     = application, 
            window_position = Gtk.WindowPosition.CENTER
        )
    )

    lazy val window = appWindow.window

    application.connect("activate", () => {
        buildUI()
        appWindow.setConfig(getConfig())
        appWindow.buildUI()
        window.present()
    })

    def getConfig():Any = {
        return null
    }

    def buildUI():Unit = {
        val menu = new Gio.Menu()
        menu.append("New", "app.new")
        menu.append("About", "app.about")
        menu.append("Quit", "app.quit")
        application.set_app_menu(menu)

        val newAction = new Gio.SimpleAction(l("name" -> "new"))
        newAction.connect("activate", () => this.showNew())
        application.add_action(newAction)

        val aboutAction = new Gio.SimpleAction(l("name" -> "about"))
        aboutAction.connect("activate", () => this.showAbout())
        application.add_action(aboutAction)

        val quitAction = new Gio.SimpleAction(l("name" -> "quit"))
        quitAction.connect("activate", () => this.window.destroy())
        application.add_action(quitAction)
        
    }

    def showNew():Unit = {
    // this.appWindow.server['reset'](DATADIR)
    // this.appWindow.setUrl(`http://${this.appWindow.server.info.host}:${this.appWindow.server.info.port}/index.html`)
    // this.setConfigValue('base', DATADIR)
    // this.setConfigValue('url', 'index.html')
    }

    /**
    * About dialog
    */
    def showAbout():Unit = {
        val about = new Gtk.AboutDialog()
        about.set_logo_icon_name(null)
        about.set_transient_for(this.window)
        about.set_program_name("Example")
        about.set_version("1.0")

        about.set_website("https://commons.wikimedia.org/w/index.php?curid=2856329")
        about.set_website_label("source")
        about.set_authors(js.Array("bruce davidson"))
        about.run()
        about.destroy()
    }



}