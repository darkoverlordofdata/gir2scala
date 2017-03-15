const Lang = imports.lang
const Gtk = imports.gi.Gtk
const Gio = imports.gi.Gio
/**
 * Gjs polyfills & utilities for scalaJs
 */
Object.defineProperties(window, {
    /**
     * Gjs doesn't have a global, just window. Yet there is no gui window, just command line.
     * This is backwards from other engines, and from what scala.js expects.
     * Easy to fix, global is just an alias for window.
     */
    global: {value: window},
    /**
     * console.log / console.error 
     * used by print/println/etc
     */
    console: { value: {
            log: function() {print.apply(null, arguments);},
            error: function() {printerr.apply(null, arguments);}
        }
    },
    /**
     * global Util object
     */
    Util: { value: {
        /**
         * read file in native byte structure format
         */
        readStruct: function(name) {
            const file = Gio.file_new_for_path(name)
            if (file.query_exists(null)) {
            let [success, data, length] = file.load_contents(null)
                return data
            } else {
                return null
            }
        },
        /**
         * Read file as string
         */
        readFile: function(name) {
            return String(Util.readStruct(name))
        },
        /**
         * Write file as string
         */
        writeFile: function(filename, data) {
            const file = Gio.file_new_for_path(filename)

            if (file.query_exists(null)) file.delete(null)
            let file_stream = file.create(Gio.FileCreateFlags.NONE, null)     
            let data_stream = new Gio.DataOutputStream({base_stream: file_stream})
            data_stream.put_string(data, null)
        },
        /**
         * make dir
         */
        mkdir: function(foldername) {
            const file = Gio.file_new_for_path(foldername)
            if (!file.query_exists(null)) {
                print("folder not found "+foldername)
                file.make_directory(null)
            }
        },
        /**
         * create a GtkWinow from a glade template
         */
        createWindow: function(name, tmpl, fields, args={}) {
            const Window = Lang.Class({
                Name: name,
                Extends: Gtk.ApplicationWindow,
                Template: Util.readStruct(tmpl),
                Children: fields,
                _init: function(params) {
                    this.parent(params);
                }
            })
            return new Window(args)
        }
    }
}});

