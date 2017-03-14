const Lang = imports.lang
const Gtk = imports.gi.Gtk
const Gio = imports.gi.Gio

function readFile(name) {
    const file = Gio.file_new_for_path(name)
    if (file.query_exists(null)) {
      let [success, data, length] = file.load_contents(null)
      return data
    } else {
      return null
    }
}

function createWindow(name, tmpl, fields, args={}) {
    const Window = Lang.Class({
        Name: name,
        Extends: Gtk.ApplicationWindow,
        Template: readFile(tmpl),
        Children: fields,
        _init: function(params) {
            this.parent(params);
        },
        vfunc_destroy: function() {
            Gtk.main_quit()
        }
    })
    return new Window(args)
}
