package org.example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import js.Dynamic.{ literal => l }
import org.gnome.Gtk
import org.gnome.Gio
import org.gnome.Lang

object Util {
    
    def readFile(filename: String): String = {
        val file = Gio.File.new_for_path(filename)
        if (file.query_exists(null)) {
            val Seq(success, data, length) = file.load_contents(null)
            return data.toString
        } else {
            return null
        }
    }

    def mkdir(foldername: String): Unit = {
        val file = Gio.File.new_for_path(foldername)
        if (!file.query_exists(null)) {
            g.print("folder not found "+foldername)
            file.make_directory(null)
        }
    }


    def writeFile(filename: String, data: String): Unit = {
        val file = Gio.File.new_for_path(filename)

        if (file.query_exists(null)) {
            file.delete(null)
        }
        val file_stream = file.create(Gio.FileCreateFlags.NONE, null)     
        val data_stream = new Gio.DataOutputStream(l(base_stream= "file_stream"))
        data_stream.put_string(data, null)
    }

    def loadTemplate(template:js.Dynamic):js.Any = {
        return Lang.Class(l(
            Name= template("name"),
            Extends= template("extends"),
            Template= readFile(template("path").toString),
            Children= template("fields"),
            _init= (parent: js.Dynamic, params:js.Dynamic) => {
                return parent(params)
            }
        ))
    }
}


