package org.example

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => l }
import org.gnome.Gtk
import org.gnome.Gio
import org.gnome.WebKit

class Config {
    var appName = "Example"
    var url = ""
    var base = ""
    var darkTheme = true   
    var themeName = "elementary"
    override def toString():String = {
        g.JSON.stringify(l(
            appName = appName,
            url = url,
            base = base,
            darkTheme = darkTheme,
            themeName = themeName
        ), null, 2).toString()
    }
}

@js.native
trait IAppWindow extends Gtk.ApplicationWindow {
  var back: Gtk.Button
  var refresh: Gtk.Button
  var url: Gtk.Entry
  var client: Gtk.ScrolledWindow
  var status: Gtk.Statusbar
    
}
class AppWindow(parent: Example, params: js.Dynamic) {
    var config:Config = new Config()
    config.appName = "Example"

    val DATADIR = "/home/bruce/gjs/gir2scala/share/example"
    /**
     * loads the glade template
     */
    val window =  (g.Util.createWindow("AppWindow", s"${DATADIR}/main.ui",
        js.Array("back","refresh","url","client","status"), params)).asInstanceOf[IAppWindow]

    lazy val headerbar = new Gtk.HeaderBar(l(
        title = config.appName,
        show_close_button = true
    ))
    
    lazy val webView = new WebKit.WebView()

    Gtk.Window.set_default_icon_from_file(s"${DATADIR}/about.jpg")
    window.set_icon_from_file(s"${DATADIR}/icon.jpg")
    
    def setConfig(config:Config):Unit = {
        this.config = config
    }

    def setUrl(url:String):Unit = {
        webView.load_uri(url)
        window.url.set_text(url)
    }

    def buildUI():Unit = {
        headerbar.pack_start(buildOpen())
        headerbar.pack_start(parent.buildPrefs(this))
        window.client.add(webView)
        window.back.connect("clicked", (button:Any) => webView.go_back() )
        window.refresh.connect("clicked", (button:Any) => webView.reload() )
        window.url.connect("activate", (button:Any) => webView.load_uri(window.url.get_text()))
        window.set_default_size(940, 720)
        window.set_titlebar(headerbar)
        window.show_all()
    }

    def buildOpen():Gtk.Widget = {
        val openButton = new Gtk.Button()
        openButton.add(new Gtk.Image(l(
            icon_name = "document-open-symbolic",
            icon_size = Gtk.IconSize.SMALL_TOOLBAR
        )))
        openButton.connect("clicked", ()=> {
            val chooser = new Gtk.FileChooserDialog(l(
                title = "Select Project File",
                action = Gtk.FileChooserAction.OPEN,
                transient_for = this.window,
                modal = true
            ))
            chooser.set_select_multiple(false)
            chooser.add_button("Open", Gtk.ResponseType.OK)
            chooser.add_button("Cancel", Gtk.ResponseType.CANCEL)
            chooser.set_default_response(Gtk.ResponseType.OK)
            chooser.connect("response", (dialog:js.Dynamic, response:js.Dynamic) => {
                //val filename = dialog.get_filenames()[0]
                val filename = dialog.get_filename()
                println(filename)
                dialog.destroy()
                val file = Gio.file_new_for_path(filename.toString()).asInstanceOf[js.Dynamic]
                parent.setConfigValue("url", file.get_basename().toString())
                parent.setConfigValue("base", file.get_parent().get_path().toString())
                //server["reset"](file.get_parent().get_path())
                //setUrl(`http://${this.server.info.host}:${this.server.info.port}/${file.get_basename()}`)
            })
            chooser.run()
            
        })
        
        return openButton
    }

}

