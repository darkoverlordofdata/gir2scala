package org.example

import scala.scalajs.js
import scala.scalajs.js.JSApp
import js.Dynamic.{ literal => l, global => g, newInstance => newInstance }
import org.gnome.Gtk
import org.gnome.Gio

object Main extends JSApp {

  def main(): Unit = {
    // val app = new Example()
    // app.application.run(null)
    println("Holo Mundo!")

    Gtk.init(null)

    g.imports.searchPath.push("./bin")
    //val window =  g.imports.window.newWindow()

    val window =  g.imports.window.createWindow("AppWindow", 
        "/home/bruce/gjs/ouroboros/share/ouroboros/main.ui",
        js.Array("back","refresh","url","client","status")
    )



    // val builder = new Gtk.Builder()
    // builder.add_from_file("/home/bruce/gjs/gir2scala/share/example/test.glade")

    // val button = builder.get_object("button1").asInstanceOf[Gtk.Button]
    // button.connect("clicked", (b:Gtk.Button) => {
    //   println("clicked!")
    // })

    // val window = builder.get_object("window1").asInstanceOf[Gtk.ApplicationWindow]
    // window.connect("destroy", (w:Any) => {
    //   Gtk.main_quit()
    // })

    window.show_all()
    Gtk.main()



    }
  
}
