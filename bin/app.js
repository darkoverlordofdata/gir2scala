// Generated by CoffeeScript 1.11.1
var App, AppWindow, GLib, Gio, Gtk, Lang, app, readFile;

Lang = imports.lang;

GLib = imports.gi.GLib;

Gio = imports.gi.Gio;

Gtk = imports.gi.Gtk;

readFile = function(filename) {
  var data, file, length, ref, success;
  file = Gio.file_new_for_path(filename);
  ref = file.load_contents(null), success = ref[0], data = ref[1], length = ref[2];
  return data;
};

App = Lang.Class({
  Name: 'App',
  Extends: Gtk.Application,
  _init: function() {
    this.parent();
  },
  vfunc_activate: function() {
    this.window = new AppWindow({
      application: this
    });
    this.window.present();
  }
});


AppWindow = Lang.Class({
  Name: 'AppWindow',
  Extends: Gtk.ApplicationWindow,
  Template: readFile("/home/bruce/gjs/ouroboros/share/ouroboros/main.ui"),
  Children: ["back","refresh","url","client","status"],
  _init: function(params) {
    this.parent(params);
    // this.label.set_text('Hello, World!');
    // this.button.connect('clicked', this.onClose.bind(this));
  },
  onClose: function() {
    this.application.quit();
  }
});

app = new App();

app.run(ARGV);
