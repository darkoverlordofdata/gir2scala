package org.example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import js.Dynamic.{ literal => l }
import org.gnome.Gtk

class AppWindow (val parent: Ouroboros, val params: js.Any) {

    lazy val window = new Gtk.ApplicationWindow(params)
    lazy val headerbar = new Gtk.HeaderBar(l(title = "Ouroboros", show_close_button = true))

    def buildUI() {
        headerbar.pack_start(buildOpen())
        window.set_default_size(940, 729)
        window.set_titlebar(headerbar)
        window.show_all()
    }

    def buildOpen():Gtk.Button = {
        val openButton = new Gtk.Button()
        openButton.add(new Gtk.Image(l(
            icon_name   = "document-open-symbolic",
            icon_size   = Gtk.IconSize.SMALL_TOOLBAR
        )))
        openButton.connect("clicked", () => {
            val chooser = new Gtk.FileChooserDialog(l(
                title           = "Select Project File",
                action          = Gtk.FileChooserAction.OPEN,
                transient_for   = this.window,
                modal           = true
            ))
            chooser.set_select_multiple(false)
            chooser.add_button("Open", Gtk.ResponseType.OK)
            chooser.add_button("Cancel", Gtk.ResponseType.CANCEL)
            chooser.set_default_response(Gtk.ResponseType.OK)
            chooser.connect("response", (dialog:js.Dynamic, response:js.Dynamic) => {
                val filename = dialog.get_filenames()(0)
                dialog.destroy()
                // val file = Gio.file_new_for_path(filename)
                // parent.setConfigValue("url", file.get_basename())
                // parent.setConfigValue("base", file.get_parent().get_path())
                // server['reset'](file.get_parent().get_path())
                // setUrl(`http://${this.server.info.host}:${this.server.info.port}/${file.get_basename()}`)
            })
            chooser.run()
        })
        return openButton
        
    }

    def setConfig(config:Any) {

    }

}
