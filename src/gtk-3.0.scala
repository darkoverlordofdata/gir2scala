/**
 * Gtk.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Gtk")
@js.native
object Gtk extends js.Object {
    val BINARY_AGE:Any = js.native
    val INPUT_ERROR:Any = js.native
    val INTERFACE_AGE:Any = js.native
    val LEVEL_BAR_OFFSET_HIGH:String = js.native
    val LEVEL_BAR_OFFSET_LOW:String = js.native
    val MAJOR_VERSION:Any = js.native
    val MAX_COMPOSE_LEN:Any = js.native
    val MICRO_VERSION:Any = js.native
    val MINOR_VERSION:Any = js.native
    val PAPER_NAME_A3:String = js.native
    val PAPER_NAME_A4:String = js.native
    val PAPER_NAME_A5:String = js.native
    val PAPER_NAME_B5:String = js.native
    val PAPER_NAME_EXECUTIVE:String = js.native
    val PAPER_NAME_LEGAL:String = js.native
    val PAPER_NAME_LETTER:String = js.native
    val PATH_PRIO_MASK:Any = js.native
    val PRINT_SETTINGS_COLLATE:String = js.native
    val PRINT_SETTINGS_DEFAULT_SOURCE:String = js.native
    val PRINT_SETTINGS_DITHER:String = js.native
    val PRINT_SETTINGS_DUPLEX:String = js.native
    val PRINT_SETTINGS_FINISHINGS:String = js.native
    val PRINT_SETTINGS_MEDIA_TYPE:String = js.native
    val PRINT_SETTINGS_NUMBER_UP:String = js.native
    val PRINT_SETTINGS_NUMBER_UP_LAYOUT:String = js.native
    val PRINT_SETTINGS_N_COPIES:String = js.native
    val PRINT_SETTINGS_ORIENTATION:String = js.native
    val PRINT_SETTINGS_OUTPUT_BASENAME:String = js.native
    val PRINT_SETTINGS_OUTPUT_BIN:String = js.native
    val PRINT_SETTINGS_OUTPUT_DIR:String = js.native
    val PRINT_SETTINGS_OUTPUT_FILE_FORMAT:String = js.native
    val PRINT_SETTINGS_OUTPUT_URI:String = js.native
    val PRINT_SETTINGS_PAGE_RANGES:String = js.native
    val PRINT_SETTINGS_PAGE_SET:String = js.native
    val PRINT_SETTINGS_PAPER_FORMAT:String = js.native
    val PRINT_SETTINGS_PAPER_HEIGHT:String = js.native
    val PRINT_SETTINGS_PAPER_WIDTH:String = js.native
    val PRINT_SETTINGS_PRINTER:String = js.native
    val PRINT_SETTINGS_PRINTER_LPI:String = js.native
    val PRINT_SETTINGS_PRINT_PAGES:String = js.native
    val PRINT_SETTINGS_QUALITY:String = js.native
    val PRINT_SETTINGS_RESOLUTION:String = js.native
    val PRINT_SETTINGS_RESOLUTION_X:String = js.native
    val PRINT_SETTINGS_RESOLUTION_Y:String = js.native
    val PRINT_SETTINGS_REVERSE:String = js.native
    val PRINT_SETTINGS_SCALE:String = js.native
    val PRINT_SETTINGS_USE_COLOR:String = js.native
    val PRINT_SETTINGS_WIN32_DRIVER_EXTRA:String = js.native
    val PRINT_SETTINGS_WIN32_DRIVER_VERSION:String = js.native
    val PRIORITY_RESIZE:Any = js.native
    val STOCK_ABOUT:String = js.native
    val STOCK_ADD:String = js.native
    val STOCK_APPLY:String = js.native
    val STOCK_BOLD:String = js.native
    val STOCK_CANCEL:String = js.native
    val STOCK_CAPS_LOCK_WARNING:String = js.native
    val STOCK_CDROM:String = js.native
    val STOCK_CLEAR:String = js.native
    val STOCK_CLOSE:String = js.native
    val STOCK_COLOR_PICKER:String = js.native
    val STOCK_CONNECT:String = js.native
    val STOCK_CONVERT:String = js.native
    val STOCK_COPY:String = js.native
    val STOCK_CUT:String = js.native
    val STOCK_DELETE:String = js.native
    val STOCK_DIALOG_AUTHENTICATION:String = js.native
    val STOCK_DIALOG_ERROR:String = js.native
    val STOCK_DIALOG_INFO:String = js.native
    val STOCK_DIALOG_QUESTION:String = js.native
    val STOCK_DIALOG_WARNING:String = js.native
    val STOCK_DIRECTORY:String = js.native
    val STOCK_DISCARD:String = js.native
    val STOCK_DISCONNECT:String = js.native
    val STOCK_DND:String = js.native
    val STOCK_DND_MULTIPLE:String = js.native
    val STOCK_EDIT:String = js.native
    val STOCK_EXECUTE:String = js.native
    val STOCK_FILE:String = js.native
    val STOCK_FIND:String = js.native
    val STOCK_FIND_AND_REPLACE:String = js.native
    val STOCK_FLOPPY:String = js.native
    val STOCK_FULLSCREEN:String = js.native
    val STOCK_GOTO_BOTTOM:String = js.native
    val STOCK_GOTO_FIRST:String = js.native
    val STOCK_GOTO_LAST:String = js.native
    val STOCK_GOTO_TOP:String = js.native
    val STOCK_GO_BACK:String = js.native
    val STOCK_GO_DOWN:String = js.native
    val STOCK_GO_FORWARD:String = js.native
    val STOCK_GO_UP:String = js.native
    val STOCK_HARDDISK:String = js.native
    val STOCK_HELP:String = js.native
    val STOCK_HOME:String = js.native
    val STOCK_INDENT:String = js.native
    val STOCK_INDEX:String = js.native
    val STOCK_INFO:String = js.native
    val STOCK_ITALIC:String = js.native
    val STOCK_JUMP_TO:String = js.native
    val STOCK_JUSTIFY_CENTER:String = js.native
    val STOCK_JUSTIFY_FILL:String = js.native
    val STOCK_JUSTIFY_LEFT:String = js.native
    val STOCK_JUSTIFY_RIGHT:String = js.native
    val STOCK_LEAVE_FULLSCREEN:String = js.native
    val STOCK_MEDIA_FORWARD:String = js.native
    val STOCK_MEDIA_NEXT:String = js.native
    val STOCK_MEDIA_PAUSE:String = js.native
    val STOCK_MEDIA_PLAY:String = js.native
    val STOCK_MEDIA_PREVIOUS:String = js.native
    val STOCK_MEDIA_RECORD:String = js.native
    val STOCK_MEDIA_REWIND:String = js.native
    val STOCK_MEDIA_STOP:String = js.native
    val STOCK_MISSING_IMAGE:String = js.native
    val STOCK_NETWORK:String = js.native
    val STOCK_NEW:String = js.native
    val STOCK_NO:String = js.native
    val STOCK_OK:String = js.native
    val STOCK_OPEN:String = js.native
    val STOCK_ORIENTATION_LANDSCAPE:String = js.native
    val STOCK_ORIENTATION_PORTRAIT:String = js.native
    val STOCK_ORIENTATION_REVERSE_LANDSCAPE:String = js.native
    val STOCK_ORIENTATION_REVERSE_PORTRAIT:String = js.native
    val STOCK_PAGE_SETUP:String = js.native
    val STOCK_PASTE:String = js.native
    val STOCK_PREFERENCES:String = js.native
    val STOCK_PRINT:String = js.native
    val STOCK_PRINT_ERROR:String = js.native
    val STOCK_PRINT_PAUSED:String = js.native
    val STOCK_PRINT_PREVIEW:String = js.native
    val STOCK_PRINT_REPORT:String = js.native
    val STOCK_PRINT_WARNING:String = js.native
    val STOCK_PROPERTIES:String = js.native
    val STOCK_QUIT:String = js.native
    val STOCK_REDO:String = js.native
    val STOCK_REFRESH:String = js.native
    val STOCK_REMOVE:String = js.native
    val STOCK_REVERT_TO_SAVED:String = js.native
    val STOCK_SAVE:String = js.native
    val STOCK_SAVE_AS:String = js.native
    val STOCK_SELECT_ALL:String = js.native
    val STOCK_SELECT_COLOR:String = js.native
    val STOCK_SELECT_FONT:String = js.native
    val STOCK_SORT_ASCENDING:String = js.native
    val STOCK_SORT_DESCENDING:String = js.native
    val STOCK_SPELL_CHECK:String = js.native
    val STOCK_STOP:String = js.native
    val STOCK_STRIKETHROUGH:String = js.native
    val STOCK_UNDELETE:String = js.native
    val STOCK_UNDERLINE:String = js.native
    val STOCK_UNDO:String = js.native
    val STOCK_UNINDENT:String = js.native
    val STOCK_YES:String = js.native
    val STOCK_ZOOM_100:String = js.native
    val STOCK_ZOOM_FIT:String = js.native
    val STOCK_ZOOM_IN:String = js.native
    val STOCK_ZOOM_OUT:String = js.native
    val STYLE_CLASS_ACCELERATOR:String = js.native
    val STYLE_CLASS_ARROW:String = js.native
    val STYLE_CLASS_BACKGROUND:String = js.native
    val STYLE_CLASS_BOTTOM:String = js.native
    val STYLE_CLASS_BUTTON:String = js.native
    val STYLE_CLASS_CALENDAR:String = js.native
    val STYLE_CLASS_CELL:String = js.native
    val STYLE_CLASS_CHECK:String = js.native
    val STYLE_CLASS_COMBOBOX_ENTRY:String = js.native
    val STYLE_CLASS_CONTEXT_MENU:String = js.native
    val STYLE_CLASS_CSD:String = js.native
    val STYLE_CLASS_CURSOR_HANDLE:String = js.native
    val STYLE_CLASS_DEFAULT:String = js.native
    val STYLE_CLASS_DESTRUCTIVE_ACTION:String = js.native
    val STYLE_CLASS_DIM_LABEL:String = js.native
    val STYLE_CLASS_DND:String = js.native
    val STYLE_CLASS_DOCK:String = js.native
    val STYLE_CLASS_ENTRY:String = js.native
    val STYLE_CLASS_ERROR:String = js.native
    val STYLE_CLASS_EXPANDER:String = js.native
    val STYLE_CLASS_FLAT:String = js.native
    val STYLE_CLASS_FRAME:String = js.native
    val STYLE_CLASS_GRIP:String = js.native
    val STYLE_CLASS_HEADER:String = js.native
    val STYLE_CLASS_HIGHLIGHT:String = js.native
    val STYLE_CLASS_HORIZONTAL:String = js.native
    val STYLE_CLASS_IMAGE:String = js.native
    val STYLE_CLASS_INFO:String = js.native
    val STYLE_CLASS_INLINE_TOOLBAR:String = js.native
    val STYLE_CLASS_INSERTION_CURSOR:String = js.native
    val STYLE_CLASS_LABEL:String = js.native
    val STYLE_CLASS_LEFT:String = js.native
    val STYLE_CLASS_LEVEL_BAR:String = js.native
    val STYLE_CLASS_LINKED:String = js.native
    val STYLE_CLASS_LIST:String = js.native
    val STYLE_CLASS_LIST_ROW:String = js.native
    val STYLE_CLASS_MARK:String = js.native
    val STYLE_CLASS_MENU:String = js.native
    val STYLE_CLASS_MENUBAR:String = js.native
    val STYLE_CLASS_MENUITEM:String = js.native
    val STYLE_CLASS_MESSAGE_DIALOG:String = js.native
    val STYLE_CLASS_MONOSPACE:String = js.native
    val STYLE_CLASS_NEEDS_ATTENTION:String = js.native
    val STYLE_CLASS_NOTEBOOK:String = js.native
    val STYLE_CLASS_OSD:String = js.native
    val STYLE_CLASS_OVERSHOOT:String = js.native
    val STYLE_CLASS_PANE_SEPARATOR:String = js.native
    val STYLE_CLASS_PAPER:String = js.native
    val STYLE_CLASS_POPOVER:String = js.native
    val STYLE_CLASS_POPUP:String = js.native
    val STYLE_CLASS_PRIMARY_TOOLBAR:String = js.native
    val STYLE_CLASS_PROGRESSBAR:String = js.native
    val STYLE_CLASS_PULSE:String = js.native
    val STYLE_CLASS_QUESTION:String = js.native
    val STYLE_CLASS_RADIO:String = js.native
    val STYLE_CLASS_RAISED:String = js.native
    val STYLE_CLASS_READ_ONLY:String = js.native
    val STYLE_CLASS_RIGHT:String = js.native
    val STYLE_CLASS_RUBBERBAND:String = js.native
    val STYLE_CLASS_SCALE:String = js.native
    val STYLE_CLASS_SCALE_HAS_MARKS_ABOVE:String = js.native
    val STYLE_CLASS_SCALE_HAS_MARKS_BELOW:String = js.native
    val STYLE_CLASS_SCROLLBAR:String = js.native
    val STYLE_CLASS_SCROLLBARS_JUNCTION:String = js.native
    val STYLE_CLASS_SEPARATOR:String = js.native
    val STYLE_CLASS_SIDEBAR:String = js.native
    val STYLE_CLASS_SLIDER:String = js.native
    val STYLE_CLASS_SPINBUTTON:String = js.native
    val STYLE_CLASS_SPINNER:String = js.native
    val STYLE_CLASS_STATUSBAR:String = js.native
    val STYLE_CLASS_SUBTITLE:String = js.native
    val STYLE_CLASS_SUGGESTED_ACTION:String = js.native
    val STYLE_CLASS_TITLE:String = js.native
    val STYLE_CLASS_TITLEBAR:String = js.native
    val STYLE_CLASS_TOOLBAR:String = js.native
    val STYLE_CLASS_TOOLTIP:String = js.native
    val STYLE_CLASS_TOP:String = js.native
    val STYLE_CLASS_TOUCH_SELECTION:String = js.native
    val STYLE_CLASS_TROUGH:String = js.native
    val STYLE_CLASS_UNDERSHOOT:String = js.native
    val STYLE_CLASS_VERTICAL:String = js.native
    val STYLE_CLASS_VIEW:String = js.native
    val STYLE_CLASS_WARNING:String = js.native
    val STYLE_CLASS_WIDE:String = js.native
    val STYLE_PROPERTY_BACKGROUND_COLOR:String = js.native
    val STYLE_PROPERTY_BACKGROUND_IMAGE:String = js.native
    val STYLE_PROPERTY_BORDER_COLOR:String = js.native
    val STYLE_PROPERTY_BORDER_RADIUS:String = js.native
    val STYLE_PROPERTY_BORDER_STYLE:String = js.native
    val STYLE_PROPERTY_BORDER_WIDTH:String = js.native
    val STYLE_PROPERTY_COLOR:String = js.native
    val STYLE_PROPERTY_FONT:String = js.native
    val STYLE_PROPERTY_MARGIN:String = js.native
    val STYLE_PROPERTY_PADDING:String = js.native
    val STYLE_PROVIDER_PRIORITY_APPLICATION:Any = js.native
    val STYLE_PROVIDER_PRIORITY_FALLBACK:Any = js.native
    val STYLE_PROVIDER_PRIORITY_SETTINGS:Any = js.native
    val STYLE_PROVIDER_PRIORITY_THEME:Any = js.native
    val STYLE_PROVIDER_PRIORITY_USER:Any = js.native
    val STYLE_REGION_COLUMN:String = js.native
    val STYLE_REGION_COLUMN_HEADER:String = js.native
    val STYLE_REGION_ROW:String = js.native
    val STYLE_REGION_TAB:String = js.native
    val TEXT_VIEW_PRIORITY_VALIDATE:Any = js.native
    val TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID:Any = js.native
    val TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID:Any = js.native
    def accel_groups_activate(object0: Any, accel_key: Any, accel_mods: Any):Boolean = js.native
    def accel_groups_from_object(object0: Any):Any = js.native
    def accelerator_get_default_mod_mask():Any = js.native
    def accelerator_get_label(accelerator_key: Any, accelerator_mods: Any):String = js.native
    def accelerator_get_label_with_keycode(display: Any, accelerator_key: Any, keycode: Any, accelerator_mods: Any):String = js.native
    def accelerator_name(accelerator_key: Any, accelerator_mods: Any):String = js.native
    def accelerator_name_with_keycode(display: Any, accelerator_key: Any, keycode: Any, accelerator_mods: Any):String = js.native
    def accelerator_parse(accelerator: String, accelerator_key: Any, accelerator_mods: Any):Unit = js.native
    def accelerator_parse_with_keycode(accelerator: String, accelerator_key: Any, accelerator_codes: js.Array[Any], accelerator_mods: Any):Unit = js.native
    def accelerator_set_default_mod_mask(default_mod_mask: Any):Unit = js.native
    def accelerator_valid(keyval0: Any, modifiers: Any):Boolean = js.native
    def alternative_dialog_button_order(screen: Any):Boolean = js.native
    def binding_entry_add_signal_from_string(binding_set: Any, signal_desc: String):Any = js.native
    def binding_entry_add_signall(binding_set: Any, keyval0: Any, modifiers: Any, signal_name: String, binding_args: Any):Unit = js.native
    def binding_entry_remove(binding_set: Any, keyval0: Any, modifiers: Any):Unit = js.native
    def binding_entry_skip(binding_set: Any, keyval0: Any, modifiers: Any):Unit = js.native
    def binding_set_by_class(object_class: Object):Any = js.native
    def binding_set_find(set_name: String):Any = js.native
    def binding_set_new(set_name: String):Any = js.native
    def bindings_activate(object0: Any, keyval0: Any, modifiers: Any):Boolean = js.native
    def bindings_activate_event(object0: Any, event: Any):Boolean = js.native
    def builder_error_quark():Any = js.native
    def cairo_should_draw_window(cr: Any, window: Any):Boolean = js.native
    def cairo_transform_to_window(cr: Any, widget: Any, window: Any):Unit = js.native
    def check_version(required_major: Any, required_minor: Any, required_micro: Any):String = js.native
    def css_provider_error_quark():Any = js.native
    def device_grab_add(widget: Any, device: Any, block_others: Boolean):Unit = js.native
    def device_grab_remove(widget: Any, device: Any):Unit = js.native
    def disable_setlocale():Unit = js.native
    def distribute_natural_allocation(extra_space: Any, n_requested_sizes: Any, sizes: Any):Any = js.native
    def drag_cancel(context: Any):Unit = js.native
    def drag_finish(context: Any, success: Boolean, del: Boolean, time0: Any):Unit = js.native
    def drag_get_source_widget(context: Any):Any = js.native
    def drag_set_icon_default(context: Any):Unit = js.native
    def drag_set_icon_gicon(context: Any, icon: Any, hot_x: Any, hot_y: Any):Unit = js.native
    def drag_set_icon_name(context: Any, icon_name: String, hot_x: Any, hot_y: Any):Unit = js.native
    def drag_set_icon_pixbuf(context: Any, pixbuf: Any, hot_x: Any, hot_y: Any):Unit = js.native
    def drag_set_icon_stock(context: Any, stock_id: String, hot_x: Any, hot_y: Any):Unit = js.native
    def drag_set_icon_surface(context: Any, surface: Any):Unit = js.native
    def drag_set_icon_widget(context: Any, widget: Any, hot_x: Any, hot_y: Any):Unit = js.native
    def draw_insertion_cursor(widget: Any, cr: Any, location: Any, is_primary: Boolean, direction: Any, draw_arrow: Boolean):Unit = js.native
    def events_pending():Boolean = js.native
    def false0():Boolean = js.native
    def file_chooser_error_quark():Any = js.native
    def get_binary_age():Any = js.native
    def get_current_event():Any = js.native
    def get_current_event_device():Any = js.native
    def get_current_event_state(state: Any):Boolean = js.native
    def get_current_event_time():Any = js.native
    def get_debug_flags():Any = js.native
    def get_default_language():Any = js.native
    def get_event_widget(event: Any):Any = js.native
    def get_interface_age():Any = js.native
    def get_locale_direction():Any = js.native
    def get_major_version():Any = js.native
    def get_micro_version():Any = js.native
    def get_minor_version():Any = js.native
    def get_option_group(open_default_display: Boolean):Any = js.native
    def grab_get_current():Any = js.native
    def icon_size_from_name(name: String):Any = js.native
    def icon_size_get_name(size: Any):String = js.native
    def icon_size_lookup(size: Any, width: Any, height: Any):Boolean = js.native
    def icon_size_lookup_for_settings(settings: Any, size: Any, width: Any, height: Any):Boolean = js.native
    def icon_size_register(name: String, width: Any, height: Any):Any = js.native
    def icon_size_register_alias(alias: String, target: Any):Unit = js.native
    def icon_theme_error_quark():Any = js.native
    def init(args:Any*):Unit = js.native
    def init_check(args:Any*):Boolean = js.native
    def init_with_args(args:Any*):Boolean = js.native
    def key_snooper_install(snooper: Any, func_data: Object):Any = js.native
    def key_snooper_remove(snooper_handler_id: Any):Unit = js.native
    def main():Unit = js.native
    def main_do_event(event: Any):Unit = js.native
    def main_iteration():Boolean = js.native
    def main_iteration_do(blocking: Boolean):Boolean = js.native
    def main_level():Any = js.native
    def main_quit():Unit = js.native
    def paint_arrow(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, arrow_type0: Any, fill: Boolean, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_box(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_box_gap(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any, gap_side: Any, gap_x: Any, gap_width: Any):Unit = js.native
    def paint_check(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_diamond(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_expander(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, x: Any, y: Any, expander_style: Any):Unit = js.native
    def paint_extension(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any, gap_side: Any):Unit = js.native
    def paint_flat_box(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_focus(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_handle(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any, orientation: Any):Unit = js.native
    def paint_hline(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, x1: Any, x2: Any, y: Any):Unit = js.native
    def paint_layout(style: Any, cr: Any, state_type0: Any, use_text: Boolean, widget: Any, detail: String, x: Any, y: Any, layout: Any):Unit = js.native
    def paint_option(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_resize_grip(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, edge: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_shadow(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_shadow_gap(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any, gap_side: Any, gap_x: Any, gap_width: Any):Unit = js.native
    def paint_slider(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any, orientation: Any):Unit = js.native
    def paint_spinner(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, step: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_tab(style: Any, cr: Any, state_type0: Any, shadow_type0: Any, widget: Any, detail: String, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def paint_vline(style: Any, cr: Any, state_type0: Any, widget: Any, detail: String, y10: Any, y20: Any, x: Any):Unit = js.native
    def paper_size_get_default():String = js.native
    def paper_size_get_paper_sizes(include_custom: Boolean):Any = js.native
    def parse_args(args:Any*):Boolean = js.native
    def print_error_quark():Any = js.native
    def print_run_page_setup_dialog(parent: Any, page_setup: Any, settings: Any):Any = js.native
    def print_run_page_setup_dialog_async(parent: Any, page_setup: Any, settings: Any, done_cb: Any, data: Object):Unit = js.native
    def propagate_event(widget: Any, event: Any):Unit = js.native
    def rc_add_default_file(filename: Any):Unit = js.native
    def rc_find_module_in_path(module_file: String):Any = js.native
    def rc_find_pixmap_in_path(settings: Any, scanner: Any, pixmap_file: String):Any = js.native
    def rc_get_default_files():js.Array[Any] = js.native
    def rc_get_im_module_file():Any = js.native
    def rc_get_im_module_path():Any = js.native
    def rc_get_module_dir():Any = js.native
    def rc_get_style(widget: Any):Any = js.native
    def rc_get_style_by_paths(settings: Any, widget_path: String, class_path: String, type0: Any):Any = js.native
    def rc_get_theme_dir():String = js.native
    def rc_parse(filename: String):Unit = js.native
    def rc_parse_color(scanner: Any, color: Any):Any = js.native
    def rc_parse_color_full(scanner: Any, style: Any, color: Any):Any = js.native
    def rc_parse_priority(scanner: Any, priority: Any):Any = js.native
    def rc_parse_state(scanner: Any, state: Any):Any = js.native
    def rc_parse_string(rc_string: String):Unit = js.native
    def rc_property_parse_border(pspec: Any, gstring: Any, property_value: Any):Boolean = js.native
    def rc_property_parse_color(pspec: Any, gstring: Any, property_value: Any):Boolean = js.native
    def rc_property_parse_enum(pspec: Any, gstring: Any, property_value: Any):Boolean = js.native
    def rc_property_parse_flags(pspec: Any, gstring: Any, property_value: Any):Boolean = js.native
    def rc_property_parse_requisition(pspec: Any, gstring: Any, property_value: Any):Boolean = js.native
    def rc_reparse_all():Boolean = js.native
    def rc_reparse_all_for_settings(settings: Any, force_load: Boolean):Boolean = js.native
    def rc_reset_styles(settings: Any):Unit = js.native
    def rc_scanner_new():Any = js.native
    def rc_set_default_files(filenames: js.Array[Any]):Unit = js.native
    def recent_chooser_error_quark():Any = js.native
    def recent_manager_error_quark():Any = js.native
    def render_activity(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_arrow(context: Any, cr: Any, angle: Any, x: Any, y: Any, size: Any):Unit = js.native
    def render_background(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_check(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_expander(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_extension(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any, gap_side: Any):Unit = js.native
    def render_focus(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_frame(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_frame_gap(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any, gap_side: Any, xy0_gap: Any, xy1_gap: Any):Unit = js.native
    def render_handle(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_icon(context: Any, cr: Any, pixbuf: Any, x: Any, y: Any):Unit = js.native
    def render_icon_pixbuf(context: Any, source: Any, size: Any):Any = js.native
    def render_icon_surface(context: Any, cr: Any, surface: Any, x: Any, y: Any):Unit = js.native
    def render_insertion_cursor(context: Any, cr: Any, x: Any, y: Any, layout: Any, index: Any, direction: Any):Unit = js.native
    def render_layout(context: Any, cr: Any, x: Any, y: Any, layout: Any):Unit = js.native
    def render_line(context: Any, cr: Any, x0: Any, y0: Any, x1: Any, y1: Any):Unit = js.native
    def render_option(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
    def render_slider(context: Any, cr: Any, x: Any, y: Any, width: Any, height: Any, orientation: Any):Unit = js.native
    def rgb_to_hsv(r: Any, g: Any, b: Any, h: Any, s: Any, v: Any):Unit = js.native
    def selection_add_target(widget: Any, selection: Any, target: Any, info: Any):Unit = js.native
    def selection_add_targets(widget: Any, selection: Any, targets: js.Array[Any], ntargets: Any):Unit = js.native
    def selection_clear_targets(widget: Any, selection: Any):Unit = js.native
    def selection_convert(widget: Any, selection: Any, target: Any, time0: Any):Boolean = js.native
    def selection_owner_set(widget: Any, selection: Any, time0: Any):Boolean = js.native
    def selection_owner_set_for_display(display: Any, widget: Any, selection: Any, time0: Any):Boolean = js.native
    def selection_remove_all(widget: Any):Unit = js.native
    def set_debug_flags(flags: Any):Unit = js.native
    def show_about_dialog(parent: Any, first_property_name: String, rest:Any*):Unit = js.native
    def show_uri(screen: Any, uri: String, timestamp: Any):Boolean = js.native
    def stock_add(items: js.Array[Any], n_items: Any):Unit = js.native
    def stock_add_static(items: js.Array[Any], n_items: Any):Unit = js.native
    def stock_list_ids():Any = js.native
    def stock_lookup(stock_id: String, item: Any):Boolean = js.native
    def stock_set_translate_func(domain: String, func: Any, data: Object, notify: Any):Unit = js.native
    def target_table_free(targets: js.Array[Any], n_targets: Any):Unit = js.native
    def target_table_new_from_list(list: Any, n_targets: Any):js.Array[Any] = js.native
    def targets_include_image(targets: js.Array[Any], n_targets: Any, writable: Boolean):Boolean = js.native
    def targets_include_rich_text(targets: js.Array[Any], n_targets: Any, buffer: Any):Boolean = js.native
    def targets_include_text(targets: js.Array[Any], n_targets: Any):Boolean = js.native
    def targets_include_uri(targets: js.Array[Any], n_targets: Any):Boolean = js.native
    def test_create_simple_window(window_title: String, dialog_text: String):Any = js.native
    def test_create_widget(widget_type0: Any, first_property_name: String, rest:Any*):Any = js.native
    def test_display_button_window(window_title: String, dialog_text: String, rest:Any*):Any = js.native
    def test_find_label(widget: Any, label_pattern: String):Any = js.native
    def test_find_sibling(base_widget: Any, widget_type0: Any):Any = js.native
    def test_find_widget(widget: Any, label_pattern: String, widget_type0: Any):Any = js.native
    def test_init(argcp: Any, argvp: js.Array[String], rest:Any*):Unit = js.native
    def test_list_all_types(n_types: Any):js.Array[Any] = js.native
    def test_register_all_types():Unit = js.native
    def test_slider_get_value(widget: Any):Any = js.native
    def test_slider_set_perc(widget: Any, percentage: Any):Unit = js.native
    def test_spin_button_click(spinner: Any, button: Any, upwards: Boolean):Boolean = js.native
    def test_text_get(widget: Any):String = js.native
    def test_text_set(widget: Any, string: String):Unit = js.native
    def test_widget_click(widget: Any, button: Any, modifiers: Any):Boolean = js.native
    def test_widget_send_key(widget: Any, keyval0: Any, modifiers: Any):Boolean = js.native
    def test_widget_wait_for_draw(widget: Any):Unit = js.native
    def tree_get_row_drag_data(selection_data: Any, tree_model: Any, path: Any):Boolean = js.native
    def tree_row_reference_deleted(proxy: Any, path: Any):Unit = js.native
    def tree_row_reference_inserted(proxy: Any, path: Any):Unit = js.native
    def tree_row_reference_reordered(proxy: Any, path: Any, iter: Any, new_order: js.Array[Any]):Unit = js.native
    def tree_set_row_drag_data(selection_data: Any, tree_model: Any, path: Any):Boolean = js.native
    def true0():Boolean = js.native
    @js.native
    object Align extends js.Object {
        val FILL:js.Dynamic = js.native
        val START:js.Dynamic = js.native
        val END:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val BASELINE:js.Dynamic = js.native
    }
    @js.native
    object ArrowPlacement extends js.Object {
        val BOTH:js.Dynamic = js.native
        val START:js.Dynamic = js.native
        val END:js.Dynamic = js.native
    }
    @js.native
    object ArrowType extends js.Object {
        val UP:js.Dynamic = js.native
        val DOWN:js.Dynamic = js.native
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
        val NONE:js.Dynamic = js.native
    }
    @js.native
    object AssistantPageType extends js.Object {
        val CONTENT:js.Dynamic = js.native
        val INTRO:js.Dynamic = js.native
        val CONFIRM:js.Dynamic = js.native
        val SUMMARY:js.Dynamic = js.native
        val PROGRESS:js.Dynamic = js.native
        val CUSTOM:js.Dynamic = js.native
    }
    @js.native
    object BaselinePosition extends js.Object {
        val TOP:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val BOTTOM:js.Dynamic = js.native
    }
    @js.native
    object BorderStyle extends js.Object {
        val NONE:js.Dynamic = js.native
        val SOLID:js.Dynamic = js.native
        val INSET:js.Dynamic = js.native
        val OUTSET:js.Dynamic = js.native
        val HIDDEN:js.Dynamic = js.native
        val DOTTED:js.Dynamic = js.native
        val DASHED:js.Dynamic = js.native
        val DOUBLE:js.Dynamic = js.native
        val GROOVE:js.Dynamic = js.native
        val RIDGE:js.Dynamic = js.native
    }
    @js.native
    object BuilderError extends js.Object {
        val INVALID_TYPE_FUNCTION:js.Dynamic = js.native
        val UNHANDLED_TAG:js.Dynamic = js.native
        val MISSING_ATTRIBUTE:js.Dynamic = js.native
        val INVALID_ATTRIBUTE:js.Dynamic = js.native
        val INVALID_TAG:js.Dynamic = js.native
        val MISSING_PROPERTY_VALUE:js.Dynamic = js.native
        val INVALID_VALUE:js.Dynamic = js.native
        val VERSION_MISMATCH:js.Dynamic = js.native
        val DUPLICATE_ID:js.Dynamic = js.native
        val OBJECT_TYPE_REFUSED:js.Dynamic = js.native
        val TEMPLATE_MISMATCH:js.Dynamic = js.native
        val INVALID_PROPERTY:js.Dynamic = js.native
        val INVALID_SIGNAL:js.Dynamic = js.native
        val INVALID_ID:js.Dynamic = js.native
    }
    @js.native
    object ButtonBoxStyle extends js.Object {
        val SPREAD:js.Dynamic = js.native
        val EDGE:js.Dynamic = js.native
        val START:js.Dynamic = js.native
        val END:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val EXPAND:js.Dynamic = js.native
    }
    @js.native
    object ButtonRole extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val CHECK:js.Dynamic = js.native
        val RADIO:js.Dynamic = js.native
    }
    @js.native
    object ButtonsType extends js.Object {
        val NONE:js.Dynamic = js.native
        val OK:js.Dynamic = js.native
        val CLOSE:js.Dynamic = js.native
        val CANCEL:js.Dynamic = js.native
        val YES_NO:js.Dynamic = js.native
        val OK_CANCEL:js.Dynamic = js.native
    }
    @js.native
    object CellRendererAccelMode extends js.Object {
        val GTK:js.Dynamic = js.native
        val OTHER:js.Dynamic = js.native
        val MODIFIER_TAP:js.Dynamic = js.native
    }
    @js.native
    object CellRendererMode extends js.Object {
        val INERT:js.Dynamic = js.native
        val ACTIVATABLE:js.Dynamic = js.native
        val EDITABLE:js.Dynamic = js.native
    }
    @js.native
    object CornerType extends js.Object {
        val TOP_LEFT:js.Dynamic = js.native
        val BOTTOM_LEFT:js.Dynamic = js.native
        val TOP_RIGHT:js.Dynamic = js.native
        val BOTTOM_RIGHT:js.Dynamic = js.native
    }
    @js.native
    object CssProviderError extends js.Object {
        val FAILED:js.Dynamic = js.native
        val SYNTAX:js.Dynamic = js.native
        val IMPORT:js.Dynamic = js.native
        val NAME:js.Dynamic = js.native
        val DEPRECATED:js.Dynamic = js.native
        val UNKNOWN_VALUE:js.Dynamic = js.native
    }
    @js.native
    object CssSectionType extends js.Object {
        val DOCUMENT:js.Dynamic = js.native
        val IMPORT:js.Dynamic = js.native
        val COLOR_DEFINITION:js.Dynamic = js.native
        val BINDING_SET:js.Dynamic = js.native
        val RULESET:js.Dynamic = js.native
        val SELECTOR:js.Dynamic = js.native
        val DECLARATION:js.Dynamic = js.native
        val VALUE:js.Dynamic = js.native
        val KEYFRAMES:js.Dynamic = js.native
    }
    @js.native
    object DeleteType extends js.Object {
        val CHARS:js.Dynamic = js.native
        val WORD_ENDS:js.Dynamic = js.native
        val WORDS:js.Dynamic = js.native
        val DISPLAY_LINES:js.Dynamic = js.native
        val DISPLAY_LINE_ENDS:js.Dynamic = js.native
        val PARAGRAPH_ENDS:js.Dynamic = js.native
        val PARAGRAPHS:js.Dynamic = js.native
        val WHITESPACE:js.Dynamic = js.native
    }
    @js.native
    object DirectionType extends js.Object {
        val TAB_FORWARD:js.Dynamic = js.native
        val TAB_BACKWARD:js.Dynamic = js.native
        val UP:js.Dynamic = js.native
        val DOWN:js.Dynamic = js.native
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
    }
    @js.native
    object DragResult extends js.Object {
        val SUCCESS:js.Dynamic = js.native
        val NO_TARGET:js.Dynamic = js.native
        val USER_CANCELLED:js.Dynamic = js.native
        val TIMEOUT_EXPIRED:js.Dynamic = js.native
        val GRAB_BROKEN:js.Dynamic = js.native
        val ERROR:js.Dynamic = js.native
    }
    @js.native
    object EntryIconPosition extends js.Object {
        val PRIMARY:js.Dynamic = js.native
        val SECONDARY:js.Dynamic = js.native
    }
    @js.native
    object EventSequenceState extends js.Object {
        val NONE:js.Dynamic = js.native
        val CLAIMED:js.Dynamic = js.native
        val DENIED:js.Dynamic = js.native
    }
    @js.native
    object ExpanderStyle extends js.Object {
        val COLLAPSED:js.Dynamic = js.native
        val SEMI_COLLAPSED:js.Dynamic = js.native
        val SEMI_EXPANDED:js.Dynamic = js.native
        val EXPANDED:js.Dynamic = js.native
    }
    @js.native
    object FileChooserAction extends js.Object {
        val OPEN:js.Dynamic = js.native
        val SAVE:js.Dynamic = js.native
        val SELECT_FOLDER:js.Dynamic = js.native
        val CREATE_FOLDER:js.Dynamic = js.native
    }
    @js.native
    object FileChooserConfirmation extends js.Object {
        val CONFIRM:js.Dynamic = js.native
        val ACCEPT_FILENAME:js.Dynamic = js.native
        val SELECT_AGAIN:js.Dynamic = js.native
    }
    @js.native
    object FileChooserError extends js.Object {
        val NONEXISTENT:js.Dynamic = js.native
        val BAD_FILENAME:js.Dynamic = js.native
        val ALREADY_EXISTS:js.Dynamic = js.native
        val INCOMPLETE_HOSTNAME:js.Dynamic = js.native
    }
    @js.native
    object IMPreeditStyle extends js.Object {
        val NOTHING:js.Dynamic = js.native
        val CALLBACK:js.Dynamic = js.native
        val NONE:js.Dynamic = js.native
    }
    @js.native
    object IMStatusStyle extends js.Object {
        val NOTHING:js.Dynamic = js.native
        val CALLBACK:js.Dynamic = js.native
        val NONE:js.Dynamic = js.native
    }
    @js.native
    object IconSize extends js.Object {
        val INVALID:js.Dynamic = js.native
        val MENU:js.Dynamic = js.native
        val SMALL_TOOLBAR:js.Dynamic = js.native
        val LARGE_TOOLBAR:js.Dynamic = js.native
        val BUTTON:js.Dynamic = js.native
        val DND:js.Dynamic = js.native
        val DIALOG:js.Dynamic = js.native
    }
    @js.native
    object IconThemeError extends js.Object {
        val NOT_FOUND:js.Dynamic = js.native
        val FAILED:js.Dynamic = js.native
    }
    @js.native
    object IconViewDropPosition extends js.Object {
        val NO_DROP:js.Dynamic = js.native
        val DROP_INTO:js.Dynamic = js.native
        val DROP_LEFT:js.Dynamic = js.native
        val DROP_RIGHT:js.Dynamic = js.native
        val DROP_ABOVE:js.Dynamic = js.native
        val DROP_BELOW:js.Dynamic = js.native
    }
    @js.native
    object ImageType extends js.Object {
        val EMPTY:js.Dynamic = js.native
        val PIXBUF:js.Dynamic = js.native
        val STOCK:js.Dynamic = js.native
        val ICON_SET:js.Dynamic = js.native
        val ANIMATION:js.Dynamic = js.native
        val ICON_NAME:js.Dynamic = js.native
        val GICON:js.Dynamic = js.native
        val SURFACE:js.Dynamic = js.native
    }
    @js.native
    object InputPurpose extends js.Object {
        val FREE_FORM:js.Dynamic = js.native
        val ALPHA:js.Dynamic = js.native
        val DIGITS:js.Dynamic = js.native
        val NUMBER:js.Dynamic = js.native
        val PHONE:js.Dynamic = js.native
        val URL:js.Dynamic = js.native
        val EMAIL:js.Dynamic = js.native
        val NAME:js.Dynamic = js.native
        val PASSWORD:js.Dynamic = js.native
        val PIN:js.Dynamic = js.native
    }
    @js.native
    object Justification extends js.Object {
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val FILL:js.Dynamic = js.native
    }
    @js.native
    object LevelBarMode extends js.Object {
        val CONTINUOUS:js.Dynamic = js.native
        val DISCRETE:js.Dynamic = js.native
    }
    @js.native
    object License extends js.Object {
        val UNKNOWN:js.Dynamic = js.native
        val CUSTOM:js.Dynamic = js.native
        val GPL_2_0:js.Dynamic = js.native
        val GPL_3_0:js.Dynamic = js.native
        val LGPL_2_1:js.Dynamic = js.native
        val LGPL_3_0:js.Dynamic = js.native
        val BSD:js.Dynamic = js.native
        val MIT_X11:js.Dynamic = js.native
        val ARTISTIC:js.Dynamic = js.native
        val GPL_2_0_ONLY:js.Dynamic = js.native
        val GPL_3_0_ONLY:js.Dynamic = js.native
        val LGPL_2_1_ONLY:js.Dynamic = js.native
        val LGPL_3_0_ONLY:js.Dynamic = js.native
    }
    @js.native
    object MenuDirectionType extends js.Object {
        val PARENT:js.Dynamic = js.native
        val CHILD:js.Dynamic = js.native
        val NEXT:js.Dynamic = js.native
        val PREV:js.Dynamic = js.native
    }
    @js.native
    object MessageType extends js.Object {
        val INFO:js.Dynamic = js.native
        val WARNING:js.Dynamic = js.native
        val QUESTION:js.Dynamic = js.native
        val ERROR:js.Dynamic = js.native
        val OTHER:js.Dynamic = js.native
    }
    @js.native
    object MovementStep extends js.Object {
        val LOGICAL_POSITIONS:js.Dynamic = js.native
        val VISUAL_POSITIONS:js.Dynamic = js.native
        val WORDS:js.Dynamic = js.native
        val DISPLAY_LINES:js.Dynamic = js.native
        val DISPLAY_LINE_ENDS:js.Dynamic = js.native
        val PARAGRAPHS:js.Dynamic = js.native
        val PARAGRAPH_ENDS:js.Dynamic = js.native
        val PAGES:js.Dynamic = js.native
        val BUFFER_ENDS:js.Dynamic = js.native
        val HORIZONTAL_PAGES:js.Dynamic = js.native
    }
    @js.native
    object NotebookTab extends js.Object {
        val FIRST:js.Dynamic = js.native
        val LAST:js.Dynamic = js.native
    }
    @js.native
    object NumberUpLayout extends js.Object {
        val LRTB:js.Dynamic = js.native
        val LRBT:js.Dynamic = js.native
        val RLTB:js.Dynamic = js.native
        val RLBT:js.Dynamic = js.native
        val TBLR:js.Dynamic = js.native
        val TBRL:js.Dynamic = js.native
        val BTLR:js.Dynamic = js.native
        val BTRL:js.Dynamic = js.native
    }
    @js.native
    object Orientation extends js.Object {
        val HORIZONTAL:js.Dynamic = js.native
        val VERTICAL:js.Dynamic = js.native
    }
    @js.native
    object PackDirection extends js.Object {
        val LTR:js.Dynamic = js.native
        val RTL:js.Dynamic = js.native
        val TTB:js.Dynamic = js.native
        val BTT:js.Dynamic = js.native
    }
    @js.native
    object PackType extends js.Object {
        val START:js.Dynamic = js.native
        val END:js.Dynamic = js.native
    }
    @js.native
    object PageOrientation extends js.Object {
        val PORTRAIT:js.Dynamic = js.native
        val LANDSCAPE:js.Dynamic = js.native
        val REVERSE_PORTRAIT:js.Dynamic = js.native
        val REVERSE_LANDSCAPE:js.Dynamic = js.native
    }
    @js.native
    object PageSet extends js.Object {
        val ALL:js.Dynamic = js.native
        val EVEN:js.Dynamic = js.native
        val ODD:js.Dynamic = js.native
    }
    @js.native
    object PanDirection extends js.Object {
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
        val UP:js.Dynamic = js.native
        val DOWN:js.Dynamic = js.native
    }
    @js.native
    object PathPriorityType extends js.Object {
        val LOWEST:js.Dynamic = js.native
        val GTK:js.Dynamic = js.native
        val APPLICATION:js.Dynamic = js.native
        val THEME:js.Dynamic = js.native
        val RC:js.Dynamic = js.native
        val HIGHEST:js.Dynamic = js.native
    }
    @js.native
    object PathType extends js.Object {
        val WIDGET:js.Dynamic = js.native
        val WIDGET_CLASS:js.Dynamic = js.native
        val CLASS:js.Dynamic = js.native
    }
    @js.native
    object PolicyType extends js.Object {
        val ALWAYS:js.Dynamic = js.native
        val AUTOMATIC:js.Dynamic = js.native
        val NEVER:js.Dynamic = js.native
        val EXTERNAL:js.Dynamic = js.native
    }
    @js.native
    object PositionType extends js.Object {
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
        val TOP:js.Dynamic = js.native
        val BOTTOM:js.Dynamic = js.native
    }
    @js.native
    object PrintDuplex extends js.Object {
        val SIMPLEX:js.Dynamic = js.native
        val HORIZONTAL:js.Dynamic = js.native
        val VERTICAL:js.Dynamic = js.native
    }
    @js.native
    object PrintError extends js.Object {
        val GENERAL:js.Dynamic = js.native
        val INTERNAL_ERROR:js.Dynamic = js.native
        val NOMEM:js.Dynamic = js.native
        val INVALID_FILE:js.Dynamic = js.native
    }
    @js.native
    object PrintOperationAction extends js.Object {
        val PRINT_DIALOG:js.Dynamic = js.native
        val PRINT:js.Dynamic = js.native
        val PREVIEW:js.Dynamic = js.native
        val EXPORT:js.Dynamic = js.native
    }
    @js.native
    object PrintOperationResult extends js.Object {
        val ERROR:js.Dynamic = js.native
        val APPLY:js.Dynamic = js.native
        val CANCEL:js.Dynamic = js.native
        val IN_PROGRESS:js.Dynamic = js.native
    }
    @js.native
    object PrintPages extends js.Object {
        val ALL:js.Dynamic = js.native
        val CURRENT:js.Dynamic = js.native
        val RANGES:js.Dynamic = js.native
        val SELECTION:js.Dynamic = js.native
    }
    @js.native
    object PrintQuality extends js.Object {
        val LOW:js.Dynamic = js.native
        val NORMAL:js.Dynamic = js.native
        val HIGH:js.Dynamic = js.native
        val DRAFT:js.Dynamic = js.native
    }
    @js.native
    object PrintStatus extends js.Object {
        val INITIAL:js.Dynamic = js.native
        val PREPARING:js.Dynamic = js.native
        val GENERATING_DATA:js.Dynamic = js.native
        val SENDING_DATA:js.Dynamic = js.native
        val PENDING:js.Dynamic = js.native
        val PENDING_ISSUE:js.Dynamic = js.native
        val PRINTING:js.Dynamic = js.native
        val FINISHED:js.Dynamic = js.native
        val FINISHED_ABORTED:js.Dynamic = js.native
    }
    @js.native
    object PropagationPhase extends js.Object {
        val NONE:js.Dynamic = js.native
        val CAPTURE:js.Dynamic = js.native
        val BUBBLE:js.Dynamic = js.native
        val TARGET:js.Dynamic = js.native
    }
    @js.native
    object RcTokenType extends js.Object {
        val INVALID:js.Dynamic = js.native
        val INCLUDE:js.Dynamic = js.native
        val NORMAL:js.Dynamic = js.native
        val ACTIVE:js.Dynamic = js.native
        val PRELIGHT:js.Dynamic = js.native
        val SELECTED:js.Dynamic = js.native
        val INSENSITIVE:js.Dynamic = js.native
        val FG:js.Dynamic = js.native
        val BG:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val BASE:js.Dynamic = js.native
        val XTHICKNESS:js.Dynamic = js.native
        val YTHICKNESS:js.Dynamic = js.native
        val FONT:js.Dynamic = js.native
        val FONTSET:js.Dynamic = js.native
        val FONT_NAME:js.Dynamic = js.native
        val BG_PIXMAP:js.Dynamic = js.native
        val PIXMAP_PATH:js.Dynamic = js.native
        val STYLE:js.Dynamic = js.native
        val BINDING:js.Dynamic = js.native
        val BIND:js.Dynamic = js.native
        val WIDGET:js.Dynamic = js.native
        val WIDGET_CLASS:js.Dynamic = js.native
        val CLASS:js.Dynamic = js.native
        val LOWEST:js.Dynamic = js.native
        val GTK:js.Dynamic = js.native
        val APPLICATION:js.Dynamic = js.native
        val THEME:js.Dynamic = js.native
        val RC:js.Dynamic = js.native
        val HIGHEST:js.Dynamic = js.native
        val ENGINE:js.Dynamic = js.native
        val MODULE_PATH:js.Dynamic = js.native
        val IM_MODULE_PATH:js.Dynamic = js.native
        val IM_MODULE_FILE:js.Dynamic = js.native
        val STOCK:js.Dynamic = js.native
        val LTR:js.Dynamic = js.native
        val RTL:js.Dynamic = js.native
        val COLOR:js.Dynamic = js.native
        val UNBIND:js.Dynamic = js.native
        val LAST:js.Dynamic = js.native
    }
    @js.native
    object RecentChooserError extends js.Object {
        val NOT_FOUND:js.Dynamic = js.native
        val INVALID_URI:js.Dynamic = js.native
    }
    @js.native
    object RecentManagerError extends js.Object {
        val NOT_FOUND:js.Dynamic = js.native
        val INVALID_URI:js.Dynamic = js.native
        val INVALID_ENCODING:js.Dynamic = js.native
        val NOT_REGISTERED:js.Dynamic = js.native
        val READ:js.Dynamic = js.native
        val WRITE:js.Dynamic = js.native
        val UNKNOWN:js.Dynamic = js.native
    }
    @js.native
    object RecentSortType extends js.Object {
        val NONE:js.Dynamic = js.native
        val MRU:js.Dynamic = js.native
        val LRU:js.Dynamic = js.native
        val CUSTOM:js.Dynamic = js.native
    }
    @js.native
    object ReliefStyle extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val HALF:js.Dynamic = js.native
        val NONE:js.Dynamic = js.native
    }
    @js.native
    object ResizeMode extends js.Object {
        val PARENT:js.Dynamic = js.native
        val QUEUE:js.Dynamic = js.native
        val IMMEDIATE:js.Dynamic = js.native
    }
    @js.native
    object ResponseType extends js.Object {
        val NONE:js.Dynamic = js.native
        val REJECT:js.Dynamic = js.native
        val ACCEPT:js.Dynamic = js.native
        val DELETE_EVENT:js.Dynamic = js.native
        val OK:js.Dynamic = js.native
        val CANCEL:js.Dynamic = js.native
        val CLOSE:js.Dynamic = js.native
        val YES:js.Dynamic = js.native
        val NO:js.Dynamic = js.native
        val APPLY:js.Dynamic = js.native
        val HELP:js.Dynamic = js.native
    }
    @js.native
    object RevealerTransitionType extends js.Object {
        val NONE:js.Dynamic = js.native
        val CROSSFADE:js.Dynamic = js.native
        val SLIDE_RIGHT:js.Dynamic = js.native
        val SLIDE_LEFT:js.Dynamic = js.native
        val SLIDE_UP:js.Dynamic = js.native
        val SLIDE_DOWN:js.Dynamic = js.native
    }
    @js.native
    object ScrollStep extends js.Object {
        val STEPS:js.Dynamic = js.native
        val PAGES:js.Dynamic = js.native
        val ENDS:js.Dynamic = js.native
        val HORIZONTAL_STEPS:js.Dynamic = js.native
        val HORIZONTAL_PAGES:js.Dynamic = js.native
        val HORIZONTAL_ENDS:js.Dynamic = js.native
    }
    @js.native
    object ScrollType extends js.Object {
        val NONE:js.Dynamic = js.native
        val JUMP:js.Dynamic = js.native
        val STEP_BACKWARD:js.Dynamic = js.native
        val STEP_FORWARD:js.Dynamic = js.native
        val PAGE_BACKWARD:js.Dynamic = js.native
        val PAGE_FORWARD:js.Dynamic = js.native
        val STEP_UP:js.Dynamic = js.native
        val STEP_DOWN:js.Dynamic = js.native
        val PAGE_UP:js.Dynamic = js.native
        val PAGE_DOWN:js.Dynamic = js.native
        val STEP_LEFT:js.Dynamic = js.native
        val STEP_RIGHT:js.Dynamic = js.native
        val PAGE_LEFT:js.Dynamic = js.native
        val PAGE_RIGHT:js.Dynamic = js.native
        val START:js.Dynamic = js.native
        val END:js.Dynamic = js.native
    }
    @js.native
    object ScrollablePolicy extends js.Object {
        val MINIMUM:js.Dynamic = js.native
        val NATURAL:js.Dynamic = js.native
    }
    @js.native
    object SelectionMode extends js.Object {
        val NONE:js.Dynamic = js.native
        val SINGLE:js.Dynamic = js.native
        val BROWSE:js.Dynamic = js.native
        val MULTIPLE:js.Dynamic = js.native
    }
    @js.native
    object SensitivityType extends js.Object {
        val AUTO:js.Dynamic = js.native
        val ON:js.Dynamic = js.native
        val OFF:js.Dynamic = js.native
    }
    @js.native
    object ShadowType extends js.Object {
        val NONE:js.Dynamic = js.native
        val IN:js.Dynamic = js.native
        val OUT:js.Dynamic = js.native
        val ETCHED_IN:js.Dynamic = js.native
        val ETCHED_OUT:js.Dynamic = js.native
    }
    @js.native
    object SizeGroupMode extends js.Object {
        val NONE:js.Dynamic = js.native
        val HORIZONTAL:js.Dynamic = js.native
        val VERTICAL:js.Dynamic = js.native
        val BOTH:js.Dynamic = js.native
    }
    @js.native
    object SizeRequestMode extends js.Object {
        val HEIGHT_FOR_WIDTH:js.Dynamic = js.native
        val WIDTH_FOR_HEIGHT:js.Dynamic = js.native
        val CONSTANT_SIZE:js.Dynamic = js.native
    }
    @js.native
    object SortType extends js.Object {
        val ASCENDING:js.Dynamic = js.native
        val DESCENDING:js.Dynamic = js.native
    }
    @js.native
    object SpinButtonUpdatePolicy extends js.Object {
        val ALWAYS:js.Dynamic = js.native
        val IF_VALID:js.Dynamic = js.native
    }
    @js.native
    object SpinType extends js.Object {
        val STEP_FORWARD:js.Dynamic = js.native
        val STEP_BACKWARD:js.Dynamic = js.native
        val PAGE_FORWARD:js.Dynamic = js.native
        val PAGE_BACKWARD:js.Dynamic = js.native
        val HOME:js.Dynamic = js.native
        val END:js.Dynamic = js.native
        val USER_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object StackTransitionType extends js.Object {
        val NONE:js.Dynamic = js.native
        val CROSSFADE:js.Dynamic = js.native
        val SLIDE_RIGHT:js.Dynamic = js.native
        val SLIDE_LEFT:js.Dynamic = js.native
        val SLIDE_UP:js.Dynamic = js.native
        val SLIDE_DOWN:js.Dynamic = js.native
        val SLIDE_LEFT_RIGHT:js.Dynamic = js.native
        val SLIDE_UP_DOWN:js.Dynamic = js.native
        val OVER_UP:js.Dynamic = js.native
        val OVER_DOWN:js.Dynamic = js.native
        val OVER_LEFT:js.Dynamic = js.native
        val OVER_RIGHT:js.Dynamic = js.native
        val UNDER_UP:js.Dynamic = js.native
        val UNDER_DOWN:js.Dynamic = js.native
        val UNDER_LEFT:js.Dynamic = js.native
        val UNDER_RIGHT:js.Dynamic = js.native
        val OVER_UP_DOWN:js.Dynamic = js.native
        val OVER_DOWN_UP:js.Dynamic = js.native
        val OVER_LEFT_RIGHT:js.Dynamic = js.native
        val OVER_RIGHT_LEFT:js.Dynamic = js.native
    }
    @js.native
    object StateType extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val ACTIVE:js.Dynamic = js.native
        val PRELIGHT:js.Dynamic = js.native
        val SELECTED:js.Dynamic = js.native
        val INSENSITIVE:js.Dynamic = js.native
        val INCONSISTENT:js.Dynamic = js.native
        val FOCUSED:js.Dynamic = js.native
    }
    @js.native
    object TextBufferTargetInfo extends js.Object {
        val BUFFER_CONTENTS:js.Dynamic = js.native
        val RICH_TEXT:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
    }
    @js.native
    object TextDirection extends js.Object {
        val NONE:js.Dynamic = js.native
        val LTR:js.Dynamic = js.native
        val RTL:js.Dynamic = js.native
    }
    @js.native
    object TextExtendSelection extends js.Object {
        val WORD:js.Dynamic = js.native
        val LINE:js.Dynamic = js.native
    }
    @js.native
    object TextViewLayer extends js.Object {
        val BELOW:js.Dynamic = js.native
        val ABOVE:js.Dynamic = js.native
    }
    @js.native
    object TextWindowType extends js.Object {
        val PRIVATE:js.Dynamic = js.native
        val WIDGET:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
        val TOP:js.Dynamic = js.native
        val BOTTOM:js.Dynamic = js.native
    }
    @js.native
    object ToolbarSpaceStyle extends js.Object {
        val EMPTY:js.Dynamic = js.native
        val LINE:js.Dynamic = js.native
    }
    @js.native
    object ToolbarStyle extends js.Object {
        val ICONS:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val BOTH:js.Dynamic = js.native
        val BOTH_HORIZ:js.Dynamic = js.native
    }
    @js.native
    object TreeViewColumnSizing extends js.Object {
        val GROW_ONLY:js.Dynamic = js.native
        val AUTOSIZE:js.Dynamic = js.native
        val FIXED:js.Dynamic = js.native
    }
    @js.native
    object TreeViewDropPosition extends js.Object {
        val BEFORE:js.Dynamic = js.native
        val AFTER:js.Dynamic = js.native
        val INTO_OR_BEFORE:js.Dynamic = js.native
        val INTO_OR_AFTER:js.Dynamic = js.native
    }
    @js.native
    object TreeViewGridLines extends js.Object {
        val NONE:js.Dynamic = js.native
        val HORIZONTAL:js.Dynamic = js.native
        val VERTICAL:js.Dynamic = js.native
        val BOTH:js.Dynamic = js.native
    }
    @js.native
    object Unit extends js.Object {
        val NONE:js.Dynamic = js.native
        val POINTS:js.Dynamic = js.native
        val INCH:js.Dynamic = js.native
        val MM:js.Dynamic = js.native
    }
    @js.native
    object WidgetHelpType extends js.Object {
        val TOOLTIP:js.Dynamic = js.native
        val WHATS_THIS:js.Dynamic = js.native
    }
    @js.native
    object WindowPosition extends js.Object {
        val NONE:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val MOUSE:js.Dynamic = js.native
        val CENTER_ALWAYS:js.Dynamic = js.native
        val CENTER_ON_PARENT:js.Dynamic = js.native
    }
    @js.native
    object WindowType extends js.Object {
        val TOPLEVEL:js.Dynamic = js.native
        val POPUP:js.Dynamic = js.native
    }
    @js.native
    object WrapMode extends js.Object {
        val NONE:js.Dynamic = js.native
        val CHAR:js.Dynamic = js.native
        val WORD:js.Dynamic = js.native
        val WORD_CHAR:js.Dynamic = js.native
    }
    @js.native
    object AccelFlags extends js.Object {
        val VISIBLE:js.Dynamic = js.native
        val LOCKED:js.Dynamic = js.native
        val MASK:js.Dynamic = js.native
    }
    @js.native
    object ApplicationInhibitFlags extends js.Object {
        val LOGOUT:js.Dynamic = js.native
        val SWITCH:js.Dynamic = js.native
        val SUSPEND:js.Dynamic = js.native
        val IDLE:js.Dynamic = js.native
    }
    @js.native
    object AttachOptions extends js.Object {
        val EXPAND:js.Dynamic = js.native
        val SHRINK:js.Dynamic = js.native
        val FILL:js.Dynamic = js.native
    }
    @js.native
    object CalendarDisplayOptions extends js.Object {
        val SHOW_HEADING:js.Dynamic = js.native
        val SHOW_DAY_NAMES:js.Dynamic = js.native
        val NO_MONTH_CHANGE:js.Dynamic = js.native
        val SHOW_WEEK_NUMBERS:js.Dynamic = js.native
        val SHOW_DETAILS:js.Dynamic = js.native
    }
    @js.native
    object CellRendererState extends js.Object {
        val SELECTED:js.Dynamic = js.native
        val PRELIT:js.Dynamic = js.native
        val INSENSITIVE:js.Dynamic = js.native
        val SORTED:js.Dynamic = js.native
        val FOCUSED:js.Dynamic = js.native
        val EXPANDABLE:js.Dynamic = js.native
        val EXPANDED:js.Dynamic = js.native
    }
    @js.native
    object DebugFlag extends js.Object {
        val MISC:js.Dynamic = js.native
        val PLUGSOCKET:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val TREE:js.Dynamic = js.native
        val UPDATES:js.Dynamic = js.native
        val KEYBINDINGS:js.Dynamic = js.native
        val MULTIHEAD:js.Dynamic = js.native
        val MODULES:js.Dynamic = js.native
        val GEOMETRY:js.Dynamic = js.native
        val ICONTHEME:js.Dynamic = js.native
        val PRINTING:js.Dynamic = js.native
        val BUILDER:js.Dynamic = js.native
        val SIZE_REQUEST:js.Dynamic = js.native
        val NO_CSS_CACHE:js.Dynamic = js.native
        val BASELINES:js.Dynamic = js.native
        val PIXEL_CACHE:js.Dynamic = js.native
        val NO_PIXEL_CACHE:js.Dynamic = js.native
        val INTERACTIVE:js.Dynamic = js.native
        val TOUCHSCREEN:js.Dynamic = js.native
        val ACTIONS:js.Dynamic = js.native
    }
    @js.native
    object DestDefaults extends js.Object {
        val MOTION:js.Dynamic = js.native
        val HIGHLIGHT:js.Dynamic = js.native
        val DROP:js.Dynamic = js.native
        val ALL:js.Dynamic = js.native
    }
    @js.native
    object DialogFlags extends js.Object {
        val MODAL:js.Dynamic = js.native
        val DESTROY_WITH_PARENT:js.Dynamic = js.native
        val USE_HEADER_BAR:js.Dynamic = js.native
    }
    @js.native
    object FileFilterFlags extends js.Object {
        val FILENAME:js.Dynamic = js.native
        val URI:js.Dynamic = js.native
        val DISPLAY_NAME:js.Dynamic = js.native
        val MIME_TYPE:js.Dynamic = js.native
    }
    @js.native
    object IconLookupFlags extends js.Object {
        val NO_SVG:js.Dynamic = js.native
        val FORCE_SVG:js.Dynamic = js.native
        val USE_BUILTIN:js.Dynamic = js.native
        val GENERIC_FALLBACK:js.Dynamic = js.native
        val FORCE_SIZE:js.Dynamic = js.native
        val FORCE_REGULAR:js.Dynamic = js.native
        val FORCE_SYMBOLIC:js.Dynamic = js.native
        val DIR_LTR:js.Dynamic = js.native
        val DIR_RTL:js.Dynamic = js.native
    }
    @js.native
    object InputHints extends js.Object {
        val NONE:js.Dynamic = js.native
        val SPELLCHECK:js.Dynamic = js.native
        val NO_SPELLCHECK:js.Dynamic = js.native
        val WORD_COMPLETION:js.Dynamic = js.native
        val LOWERCASE:js.Dynamic = js.native
        val UPPERCASE_CHARS:js.Dynamic = js.native
        val UPPERCASE_WORDS:js.Dynamic = js.native
        val UPPERCASE_SENTENCES:js.Dynamic = js.native
        val INHIBIT_OSK:js.Dynamic = js.native
        val VERTICAL_WRITING:js.Dynamic = js.native
    }
    @js.native
    object JunctionSides extends js.Object {
        val NONE:js.Dynamic = js.native
        val CORNER_TOPLEFT:js.Dynamic = js.native
        val CORNER_TOPRIGHT:js.Dynamic = js.native
        val CORNER_BOTTOMLEFT:js.Dynamic = js.native
        val CORNER_BOTTOMRIGHT:js.Dynamic = js.native
        val TOP:js.Dynamic = js.native
        val BOTTOM:js.Dynamic = js.native
        val LEFT:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
    }
    @js.native
    object PlacesOpenFlags extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val NEW_TAB:js.Dynamic = js.native
        val NEW_WINDOW:js.Dynamic = js.native
    }
    @js.native
    object RcFlags extends js.Object {
        val FG:js.Dynamic = js.native
        val BG:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val BASE:js.Dynamic = js.native
    }
    @js.native
    object RecentFilterFlags extends js.Object {
        val URI:js.Dynamic = js.native
        val DISPLAY_NAME:js.Dynamic = js.native
        val MIME_TYPE:js.Dynamic = js.native
        val APPLICATION:js.Dynamic = js.native
        val GROUP:js.Dynamic = js.native
        val AGE:js.Dynamic = js.native
    }
    @js.native
    object RegionFlags extends js.Object {
        val EVEN:js.Dynamic = js.native
        val ODD:js.Dynamic = js.native
        val FIRST:js.Dynamic = js.native
        val LAST:js.Dynamic = js.native
        val ONLY:js.Dynamic = js.native
        val SORTED:js.Dynamic = js.native
    }
    @js.native
    object StateFlags extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val ACTIVE:js.Dynamic = js.native
        val PRELIGHT:js.Dynamic = js.native
        val SELECTED:js.Dynamic = js.native
        val INSENSITIVE:js.Dynamic = js.native
        val INCONSISTENT:js.Dynamic = js.native
        val FOCUSED:js.Dynamic = js.native
        val BACKDROP:js.Dynamic = js.native
        val DIR_LTR:js.Dynamic = js.native
        val DIR_RTL:js.Dynamic = js.native
        val LINK:js.Dynamic = js.native
        val VISITED:js.Dynamic = js.native
        val CHECKED:js.Dynamic = js.native
    }
    @js.native
    object TargetFlags extends js.Object {
        val SAME_APP:js.Dynamic = js.native
        val SAME_WIDGET:js.Dynamic = js.native
        val OTHER_APP:js.Dynamic = js.native
        val OTHER_WIDGET:js.Dynamic = js.native
    }
    @js.native
    object TextSearchFlags extends js.Object {
        val VISIBLE_ONLY:js.Dynamic = js.native
        val TEXT_ONLY:js.Dynamic = js.native
        val CASE_INSENSITIVE:js.Dynamic = js.native
    }
    @js.native
    object ToolPaletteDragTargets extends js.Object {
        val ITEMS:js.Dynamic = js.native
        val GROUPS:js.Dynamic = js.native
    }
    @js.native
    object TreeModelFlags extends js.Object {
        val ITERS_PERSIST:js.Dynamic = js.native
        val LIST_ONLY:js.Dynamic = js.native
    }
    @js.native
    object UIManagerItemType extends js.Object {
        val AUTO:js.Dynamic = js.native
        val MENUBAR:js.Dynamic = js.native
        val MENU:js.Dynamic = js.native
        val TOOLBAR:js.Dynamic = js.native
        val PLACEHOLDER:js.Dynamic = js.native
        val POPUP:js.Dynamic = js.native
        val MENUITEM:js.Dynamic = js.native
        val TOOLITEM:js.Dynamic = js.native
        val SEPARATOR:js.Dynamic = js.native
        val ACCELERATOR:js.Dynamic = js.native
        val POPUP_WITH_ACCELS:js.Dynamic = js.native
    }
    @js.native
    class AboutDialog extends Dialog {
        def this(config: js.Any) = this()
        def add_credit_section(section_name: String, people: js.Array[String]):Unit = js.native
        def get_artists():js.Array[String] = js.native
        def get_authors():js.Array[String] = js.native
        def get_comments():String = js.native
        def get_copyright():String = js.native
        def get_documenters():js.Array[String] = js.native
        def get_license():String = js.native
        def get_license_type():Any = js.native
        def get_logo():Any = js.native
        def get_logo_icon_name():String = js.native
        def get_program_name():String = js.native
        def get_translator_credits():String = js.native
        def get_version():String = js.native
        def get_website():String = js.native
        def get_website_label():String = js.native
        def get_wrap_license():Boolean = js.native
        def set_artists(artists: js.Array[String]):Unit = js.native
        def set_authors(authors: js.Array[String]):Unit = js.native
        def set_comments(comments: String):Unit = js.native
        def set_copyright(copyright: String):Unit = js.native
        def set_documenters(documenters: js.Array[String]):Unit = js.native
        def set_license(license: String):Unit = js.native
        def set_license_type(license_type0: Any):Unit = js.native
        def set_logo(logo: Any):Unit = js.native
        def set_logo_icon_name(icon_name: String):Unit = js.native
        def set_program_name(name: String):Unit = js.native
        def set_translator_credits(translator_credits: String):Unit = js.native
        def set_version(version: String):Unit = js.native
        def set_website(website: String):Unit = js.native
        def set_website_label(website_label: String):Unit = js.native
        def set_wrap_license(wrap_license: Boolean):Unit = js.native
    }
    @js.native
    class AccelGroup extends GObject.Object {
        def this(config: js.Any) = this()
        def activate(accel_quark: Any, acceleratable: Any, accel_key: Any, accel_mods: Any):Boolean = js.native
        def connect(accel_key: Any, accel_mods: Any, accel_flags: Any, closure: Any):Unit = js.native
        def connect_by_path(accel_path: String, closure: Any):Unit = js.native
        def disconnect(closure: Any):Boolean = js.native
        def disconnect_key(accel_key: Any, accel_mods: Any):Boolean = js.native
        def find(find_func: Any, data: Object):Any = js.native
        def get_is_locked():Boolean = js.native
        def get_modifier_mask():Any = js.native
        def lock():Unit = js.native
        def query(accel_key: Any, accel_mods: Any, n_entries: Any):js.Array[Any] = js.native
        def unlock():Unit = js.native
    }
    @js.native
    object AccelGroup extends js.Object {
        def from_accel_closure(closure: Any):Any = js.native
    }
    @js.native
    class AccelLabel extends Label {
        def this(config: js.Any) = this()
        def get_accel(accelerator_key: Any, accelerator_mods: Any):Unit = js.native
        def get_accel_widget():Any = js.native
        def get_accel_width():Any = js.native
        def refetch():Boolean = js.native
        def set_accel(accelerator_key: Any, accelerator_mods: Any):Unit = js.native
        def set_accel_closure(accel_closure: Any):Unit = js.native
        def set_accel_widget(accel_widget: Any):Unit = js.native
    }
    @js.native
    class AccelMap extends GObject.Object {
    }
    @js.native
    object AccelMap extends js.Object {
        def add_entry(accel_path: String, accel_key: Any, accel_mods: Any):Unit = js.native
        def add_filter(filter_pattern: String):Unit = js.native
        def change_entry(accel_path: String, accel_key: Any, accel_mods: Any, replace: Boolean):Boolean = js.native
        def foreach(data: Object, foreach_func: Any):Unit = js.native
        def foreach_unfiltered(data: Object, foreach_func: Any):Unit = js.native
        def get():Any = js.native
        def load(file_name: Any):Unit = js.native
        def load_fd(fd: Any):Unit = js.native
        def load_scanner(scanner: Any):Unit = js.native
        def lock_path(accel_path: String):Unit = js.native
        def lookup_entry(accel_path: String, key: Any):Boolean = js.native
        def save(file_name: Any):Unit = js.native
        def save_fd(fd: Any):Unit = js.native
        def unlock_path(accel_path: String):Unit = js.native
    }
    @js.native
    class Accessible extends Atk.Object {
        def connect_widget_destroyed():Unit = js.native
        def get_widget():Any = js.native
        def set_widget(widget: Any):Unit = js.native
    }
    @js.native
    class Action extends GObject.Object {
        def this(config: js.Any) = this()
        def activate():Unit = js.native
        def block_activate():Unit = js.native
        def connect_accelerator():Unit = js.native
        def create_icon(icon_size: Any):Any = js.native
        def create_menu():Any = js.native
        def create_menu_item():Any = js.native
        def create_tool_item():Any = js.native
        def disconnect_accelerator():Unit = js.native
        def get_accel_closure():Any = js.native
        def get_accel_path():String = js.native
        def get_always_show_image():Boolean = js.native
        def get_gicon():Any = js.native
        def get_icon_name():String = js.native
        def get_is_important():Boolean = js.native
        def get_label():String = js.native
        def get_name():String = js.native
        def get_proxies():Any = js.native
        def get_sensitive():Boolean = js.native
        def get_short_label():String = js.native
        def get_stock_id():String = js.native
        def get_tooltip():String = js.native
        def get_visible():Boolean = js.native
        def get_visible_horizontal():Boolean = js.native
        def get_visible_vertical():Boolean = js.native
        def is_sensitive():Boolean = js.native
        def is_visible():Boolean = js.native
        def set_accel_group(accel_group: Any):Unit = js.native
        def set_accel_path(accel_path: String):Unit = js.native
        def set_always_show_image(always_show: Boolean):Unit = js.native
        def set_gicon(icon: Any):Unit = js.native
        def set_icon_name(icon_name: String):Unit = js.native
        def set_is_important(is_important: Boolean):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_sensitive(sensitive: Boolean):Unit = js.native
        def set_short_label(short_label: String):Unit = js.native
        def set_stock_id(stock_id: String):Unit = js.native
        def set_tooltip(tooltip: String):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
        def set_visible_horizontal(visible_horizontal: Boolean):Unit = js.native
        def set_visible_vertical(visible_vertical: Boolean):Unit = js.native
        def unblock_activate():Unit = js.native
    }
    @js.native
    class ActionBar extends Bin {
        def this(config: js.Any) = this()
        def get_center_widget():Any = js.native
        def pack_end(child: Any):Unit = js.native
        def pack_start(child: Any):Unit = js.native
        def set_center_widget(center_widget: Any):Unit = js.native
    }
    @js.native
    class ActionGroup extends GObject.Object {
        def this(config: js.Any) = this()
        def add_action(action: Any):Unit = js.native
        def add_action_with_accel(action: Any, accelerator: String):Unit = js.native
        def add_actions(entries: js.Array[Any], n_entries: Any, user_data: Object):Unit = js.native
        def add_actions_full(entries: js.Array[Any], n_entries: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_radio_actions(entries: js.Array[Any], n_entries: Any, value: Any, on_change: Any, user_data: Object):Unit = js.native
        def add_radio_actions_full(entries: js.Array[Any], n_entries: Any, value: Any, on_change: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_toggle_actions(entries: js.Array[Any], n_entries: Any, user_data: Object):Unit = js.native
        def add_toggle_actions_full(entries: js.Array[Any], n_entries: Any, user_data: Object, destroy: Any):Unit = js.native
        def get_accel_group():Any = js.native
        def get_action(action_name: String):Any = js.native
        def get_name():String = js.native
        def get_sensitive():Boolean = js.native
        def get_visible():Boolean = js.native
        def list_actions():Any = js.native
        def remove_action(action: Any):Unit = js.native
        def set_accel_group(accel_group: Any):Unit = js.native
        def set_sensitive(sensitive: Boolean):Unit = js.native
        def set_translate_func(func: Any, data: Object, notify: Any):Unit = js.native
        def set_translation_domain(domain: String):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
        def translate_string(string: String):String = js.native
    }
    @js.native
    class Adjustment extends GObject.InitiallyUnowned {
        def this(config: js.Any) = this()
        def changed():Unit = js.native
        def clamp_page(lower: Any, upper: Any):Unit = js.native
        def configure(value: Any, lower: Any, upper: Any, step_increment: Any, page_increment: Any, page_size: Any):Unit = js.native
        def get_lower():Any = js.native
        def get_minimum_increment():Any = js.native
        def get_page_increment():Any = js.native
        def get_page_size():Any = js.native
        def get_step_increment():Any = js.native
        def get_upper():Any = js.native
        def get_value():Any = js.native
        def set_lower(lower: Any):Unit = js.native
        def set_page_increment(page_increment: Any):Unit = js.native
        def set_page_size(page_size: Any):Unit = js.native
        def set_step_increment(step_increment: Any):Unit = js.native
        def set_upper(upper: Any):Unit = js.native
        def set_value(value: Any):Unit = js.native
        def value_changed():Unit = js.native
    }
    @js.native
    class Alignment extends Bin {
        def this(config: js.Any) = this()
        def get_padding(padding_top: Any, padding_bottom: Any, padding_left: Any, padding_right: Any):Unit = js.native
        def set(xalign: Any, yalign: Any, xscale: Any, yscale: Any):Unit = js.native
        def set_padding(padding_top: Any, padding_bottom: Any, padding_left: Any, padding_right: Any):Unit = js.native
    }
    @js.native
    class AppChooserButton extends ComboBox {
        def this(config: js.Any) = this()
        def append_custom_item(name: String, label: String, icon: Any):Unit = js.native
        def append_separator():Unit = js.native
        def get_heading():String = js.native
        def get_show_default_item():Boolean = js.native
        def get_show_dialog_item():Boolean = js.native
        def set_active_custom_item(name: String):Unit = js.native
        def set_heading(heading: String):Unit = js.native
        def set_show_default_item(setting: Boolean):Unit = js.native
        def set_show_dialog_item(setting: Boolean):Unit = js.native
    }
    @js.native
    class AppChooserDialog extends Dialog {
        def this(config: js.Any) = this()
        def get_heading():String = js.native
        def get_widget():Any = js.native
        def set_heading(heading: String):Unit = js.native
    }
    @js.native
    object AppChooserDialog extends js.Object {
        def new_for_content_type(parent: Any, flags: Any, content_type0: String):AppChooserDialog = js.native
    }
    @js.native
    class AppChooserWidget extends Box {
        def this(config: js.Any) = this()
        def get_default_text():String = js.native
        def get_show_all():Boolean = js.native
        def get_show_default():Boolean = js.native
        def get_show_fallback():Boolean = js.native
        def get_show_other():Boolean = js.native
        def get_show_recommended():Boolean = js.native
        def set_default_text(text: String):Unit = js.native
        def set_show_all(setting: Boolean):Unit = js.native
        def set_show_default(setting: Boolean):Unit = js.native
        def set_show_fallback(setting: Boolean):Unit = js.native
        def set_show_other(setting: Boolean):Unit = js.native
        def set_show_recommended(setting: Boolean):Unit = js.native
    }
    @js.native
    class Application extends Gio.Application {
        def this(config: js.Any) = this()
        def add_action(action:Any):Unit = js.native
        def add_accelerator(accelerator: String, action_name: String, parameter: Any):Unit = js.native
        def add_window(window: Any):Unit = js.native
        def get_accels_for_action(detailed_action_name: String):js.Array[String] = js.native
        def get_actions_for_accel(accel: String):js.Array[String] = js.native
        def get_active_window():Any = js.native
        def get_app_menu():Any = js.native
        def get_menu_by_id(id: String):Any = js.native
        def get_menubar():Any = js.native
        def get_window_by_id(id: Any):Any = js.native
        def get_windows():Any = js.native
        def inhibit(window: Any, flags: Any, reason: String):Any = js.native
        def is_inhibited(flags: Any):Boolean = js.native
        def list_action_descriptions():js.Array[String] = js.native
        def prefers_app_menu():Boolean = js.native
        def remove_accelerator(action_name: String, parameter: Any):Unit = js.native
        def remove_window(window: Any):Unit = js.native
        def set_accels_for_action(detailed_action_name: String, accels: js.Array[String]):Unit = js.native
        def set_app_menu(app_menu: Any):Unit = js.native
        def set_menubar(menubar: Any):Unit = js.native
        def uninhibit(cookie: Any):Unit = js.native
    }
    @js.native
    class ApplicationWindow extends Window {
        def this(config: js.Any) = this()
        def get_id():Any = js.native
        def get_show_menubar():Boolean = js.native
        def set_show_menubar(show_menubar: Boolean):Unit = js.native
    }
    @js.native
    class Arrow extends Misc {
        def this(config: js.Any) = this()
        def set(arrow_type0: Any, shadow_type0: Any):Unit = js.native
    }
    @js.native
    class ArrowAccessible extends WidgetAccessible {
    }
    @js.native
    class AspectFrame extends Frame {
        def this(config: js.Any) = this()
        def set(xalign: Any, yalign: Any, ratio: Any, obey_child: Boolean):Unit = js.native
    }
    @js.native
    class Assistant extends Window {
        def this(config: js.Any) = this()
        def add_action_widget(child: Any):Unit = js.native
        def append_page(page: Any):Any = js.native
        def commit():Unit = js.native
        def get_current_page():Any = js.native
        def get_n_pages():Any = js.native
        def get_nth_page(page_num: Any):Any = js.native
        def get_page_complete(page: Any):Boolean = js.native
        def get_page_has_padding(page: Any):Boolean = js.native
        def get_page_header_image(page: Any):Any = js.native
        def get_page_side_image(page: Any):Any = js.native
        def get_page_title(page: Any):String = js.native
        def get_page_type(page: Any):Any = js.native
        def insert_page(page: Any, position: Any):Any = js.native
        def next_page():Unit = js.native
        def prepend_page(page: Any):Any = js.native
        def previous_page():Unit = js.native
        def remove_action_widget(child: Any):Unit = js.native
        def remove_page(page_num: Any):Unit = js.native
        def set_current_page(page_num: Any):Unit = js.native
        def set_forward_page_func(page_func: Any, data: Object, destroy: Any):Unit = js.native
        def set_page_complete(page: Any, complete: Boolean):Unit = js.native
        def set_page_has_padding(page: Any, has_padding: Boolean):Unit = js.native
        def set_page_header_image(page: Any, pixbuf: Any):Unit = js.native
        def set_page_side_image(page: Any, pixbuf: Any):Unit = js.native
        def set_page_title(page: Any, title: String):Unit = js.native
        def set_page_type(page: Any, type0: Any):Unit = js.native
        def update_buttons_state():Unit = js.native
    }
    @js.native
    class Bin extends Container {
        def get_child():Any = js.native
    }
    @js.native
    class BooleanCellAccessible extends RendererCellAccessible {
    }
    @js.native
    class Box extends Container {
        def this(config: js.Any) = this()
        def get_baseline_position():Any = js.native
        def get_center_widget():Any = js.native
        def get_homogeneous():Boolean = js.native
        def get_spacing():Any = js.native
        def pack_end(child: Any, expand: Boolean, fill: Boolean, padding: Any):Unit = js.native
        def pack_start(child: Any, expand: Boolean, fill: Boolean, padding: Any):Unit = js.native
        def query_child_packing(child: Any, expand: Boolean, fill: Boolean, padding: Any, pack_type0: Any):Unit = js.native
        def reorder_child(child: Any, position: Any):Unit = js.native
        def set_baseline_position(position: Any):Unit = js.native
        def set_center_widget(widget: Any):Unit = js.native
        def set_child_packing(child: Any, expand: Boolean, fill: Boolean, padding: Any, pack_type0: Any):Unit = js.native
        def set_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
    }
    @js.native
    class Builder extends GObject.Object {
        def this(config: js.Any) = this()
        def add_callback_symbol(callback_name: String, callback_symbol: Any):Unit = js.native
        def add_callback_symbols(first_callback_name: String, first_callback_symbol: Any, rest:Any*):Unit = js.native
        def add_from_file(filename: String):Any = js.native
        def add_from_resource(resource_path: String):Any = js.native
        def add_from_string(buffer: String, length: Any):Any = js.native
        def add_objects_from_file(filename: String, object_ids: js.Array[String]):Any = js.native
        def add_objects_from_resource(resource_path: String, object_ids: js.Array[String]):Any = js.native
        def add_objects_from_string(buffer: String, length: Any, object_ids: js.Array[String]):Any = js.native
        def connect_signals(user_data: Object):Unit = js.native
        def connect_signals_full(func: Any, user_data: Object):Unit = js.native
        def expose_object(name: String, object0: Any):Unit = js.native
        def get_application():Any = js.native
        def get_object(name: String):Any = js.native
        def get_objects():Any = js.native
        def get_translation_domain():String = js.native
        def get_type_from_name(type_name: String):Any = js.native
        def lookup_callback_symbol(callback_name: String):Any = js.native
        def set_application(application: Any):Unit = js.native
        def set_translation_domain(domain: String):Unit = js.native
        def value_from_string(pspec: Any, string: String, value: Any):Boolean = js.native
        def value_from_string_type(type0: Any, string: String, value: Any):Boolean = js.native
    }
    @js.native
    object Builder extends js.Object {
        def new_from_file(filename: String):Builder = js.native
        def new_from_resource(resource_path: String):Builder = js.native
        def new_from_string(string: String, length: Any):Builder = js.native
    }
    @js.native
    class Button extends Bin {
        def this(config: js.Any) = this()
        def clicked():Unit = js.native
        def enter():Unit = js.native
        def get_alignment(xalign: Any, yalign: Any):Unit = js.native
        def get_always_show_image():Boolean = js.native
        def get_event_window():Any = js.native
        def get_focus_on_click():Boolean = js.native
        def get_image():Any = js.native
        def get_image_position():Any = js.native
        def get_label():String = js.native
        def get_relief():Any = js.native
        def get_use_stock():Boolean = js.native
        def get_use_underline():Boolean = js.native
        def leave():Unit = js.native
        def pressed():Unit = js.native
        def released():Unit = js.native
        def set_alignment(xalign: Any, yalign: Any):Unit = js.native
        def set_always_show_image(always_show: Boolean):Unit = js.native
        def set_focus_on_click(focus_on_click: Boolean):Unit = js.native
        def set_image(image: Any):Unit = js.native
        def set_image_position(position: Any):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_relief(relief: Any):Unit = js.native
        def set_use_stock(use_stock: Boolean):Unit = js.native
        def set_use_underline(use_underline: Boolean):Unit = js.native
    }
    @js.native
    object Button extends js.Object {
        def new_from_icon_name(icon_name: String, size: Any):Button = js.native
        def new_from_stock(stock_id: String):Button = js.native
        def new_with_label(label: String):Button = js.native
        def new_with_mnemonic(label: String):Button = js.native
    }
    @js.native
    class ButtonAccessible extends ContainerAccessible {
    }
    @js.native
    class ButtonBox extends Box {
        def this(config: js.Any) = this()
        def get_child_non_homogeneous(child: Any):Boolean = js.native
        def get_child_secondary(child: Any):Boolean = js.native
        def get_layout():Any = js.native
        def set_child_non_homogeneous(child: Any, non_homogeneous: Boolean):Unit = js.native
        def set_child_secondary(child: Any, is_secondary: Boolean):Unit = js.native
        def set_layout(layout_style: Any):Unit = js.native
    }
    @js.native
    class Calendar extends Widget {
        def this(config: js.Any) = this()
        def clear_marks():Unit = js.native
        def get_date(year: Any, month: Any, day: Any):Unit = js.native
        def get_day_is_marked(day: Any):Boolean = js.native
        def get_detail_height_rows():Any = js.native
        def get_detail_width_chars():Any = js.native
        def get_display_options():Any = js.native
        def mark_day(day: Any):Unit = js.native
        def select_day(day: Any):Unit = js.native
        def select_month(month: Any, year: Any):Unit = js.native
        def set_detail_func(func: Any, data: Object, destroy: Any):Unit = js.native
        def set_detail_height_rows(rows: Any):Unit = js.native
        def set_detail_width_chars(chars: Any):Unit = js.native
        def set_display_options(flags: Any):Unit = js.native
        def unmark_day(day: Any):Unit = js.native
    }
    @js.native
    class CellAccessible extends Accessible {
    }
    @js.native
    class CellArea extends GObject.InitiallyUnowned {
        def activate(context: Any, widget: Any, cell_area: Any, flags: Any, edit_only: Boolean):Boolean = js.native
        def activate_cell(widget: Any, renderer: Any, event: Any, cell_area: Any, flags: Any):Boolean = js.native
        def add(renderer: Any):Unit = js.native
        def add_focus_sibling(renderer: Any, sibling: Any):Unit = js.native
        def add_with_properties(renderer: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def apply_attributes(tree_model: Any, iter: Any, is_expander: Boolean, is_expanded: Boolean):Unit = js.native
        def attribute_connect(renderer: Any, attribute: String, column: Any):Unit = js.native
        def attribute_disconnect(renderer: Any, attribute: String):Unit = js.native
        def attribute_get_column(renderer: Any, attribute: String):Any = js.native
        def cell_get(renderer: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def cell_get_property(renderer: Any, property_name: String, value: Any):Unit = js.native
        def cell_get_valist(renderer: Any, first_property_name: String, var_args: Any):Unit = js.native
        def cell_set(renderer: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def cell_set_property(renderer: Any, property_name: String, value: Any):Unit = js.native
        def cell_set_valist(renderer: Any, first_property_name: String, var_args: Any):Unit = js.native
        def copy_context(context: Any):Any = js.native
        def create_context():Any = js.native
        def event(context: Any, widget: Any, event: Any, cell_area: Any, flags: Any):Any = js.native
        def focus(direction: Any):Boolean = js.native
        def foreach(callback: Any, callback_data: Object):Unit = js.native
        def foreach_alloc(context: Any, widget: Any, cell_area: Any, background_area: Any, callback: Any, callback_data: Object):Unit = js.native
        def get_cell_allocation(context: Any, widget: Any, renderer: Any, cell_area: Any, allocation: Any):Unit = js.native
        def get_cell_at_position(context: Any, widget: Any, cell_area: Any, x: Any, y: Any, alloc_area: Any):Any = js.native
        def get_current_path_string():String = js.native
        def get_edit_widget():Any = js.native
        def get_edited_cell():Any = js.native
        def get_focus_cell():Any = js.native
        def get_focus_from_sibling(renderer: Any):Any = js.native
        def get_focus_siblings(renderer: Any):Any = js.native
        def get_preferred_height(context: Any, widget: Any, minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_height_for_width(context: Any, widget: Any, width: Any, minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_width(context: Any, widget: Any, minimum_width: Any, natural_width: Any):Unit = js.native
        def get_preferred_width_for_height(context: Any, widget: Any, height: Any, minimum_width: Any, natural_width: Any):Unit = js.native
        def get_request_mode():Any = js.native
        def has_renderer(renderer: Any):Boolean = js.native
        def inner_cell_area(widget: Any, cell_area: Any, inner_area: Any):Unit = js.native
        def is_activatable():Boolean = js.native
        def is_focus_sibling(renderer: Any, sibling: Any):Boolean = js.native
        def remove(renderer: Any):Unit = js.native
        def remove_focus_sibling(renderer: Any, sibling: Any):Unit = js.native
        def render(context: Any, widget: Any, cr: Any, background_area: Any, cell_area: Any, flags: Any, paint_focus: Boolean):Unit = js.native
        def request_renderer(renderer: Any, orientation: Any, widget: Any, for_size: Any, minimum_size: Any, natural_size: Any):Unit = js.native
        def set_focus_cell(renderer: Any):Unit = js.native
        def stop_editing(canceled: Boolean):Unit = js.native
    }
    @js.native
    class CellAreaBox extends CellArea {
        def this(config: js.Any) = this()
        def get_spacing():Any = js.native
        def pack_end(renderer: Any, expand: Boolean, align: Boolean, fixed: Boolean):Unit = js.native
        def pack_start(renderer: Any, expand: Boolean, align: Boolean, fixed: Boolean):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
    }
    @js.native
    class CellAreaContext extends GObject.Object {
        def allocate(width: Any, height: Any):Unit = js.native
        def get_allocation(width: Any, height: Any):Unit = js.native
        def get_area():Any = js.native
        def get_preferred_height(minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_height_for_width(width: Any, minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_width(minimum_width: Any, natural_width: Any):Unit = js.native
        def get_preferred_width_for_height(height: Any, minimum_width: Any, natural_width: Any):Unit = js.native
        def push_preferred_height(minimum_height: Any, natural_height: Any):Unit = js.native
        def push_preferred_width(minimum_width: Any, natural_width: Any):Unit = js.native
        def reset():Unit = js.native
    }
    @js.native
    class CellRenderer extends GObject.InitiallyUnowned {
        def activate(event: Any, widget: Any, path: String, background_area: Any, cell_area: Any, flags: Any):Boolean = js.native
        def get_aligned_area(widget: Any, flags: Any, cell_area: Any, aligned_area: Any):Unit = js.native
        def get_alignment(xalign: Any, yalign: Any):Unit = js.native
        def get_fixed_size(width: Any, height: Any):Unit = js.native
        def get_padding(xpad: Any, ypad: Any):Unit = js.native
        def get_preferred_height(widget: Any, minimum_size: Any, natural_size: Any):Unit = js.native
        def get_preferred_height_for_width(widget: Any, width: Any, minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_size(widget: Any, minimum_size: Any, natural_size: Any):Unit = js.native
        def get_preferred_width(widget: Any, minimum_size: Any, natural_size: Any):Unit = js.native
        def get_preferred_width_for_height(widget: Any, height: Any, minimum_width: Any, natural_width: Any):Unit = js.native
        def get_request_mode():Any = js.native
        def get_sensitive():Boolean = js.native
        def get_size(widget: Any, cell_area: Any, x_offset: Any, y_offset: Any, width: Any, height: Any):Unit = js.native
        def get_state(widget: Any, cell_state: Any):Any = js.native
        def get_visible():Boolean = js.native
        def is_activatable():Boolean = js.native
        def render(cr: Any, widget: Any, background_area: Any, cell_area: Any, flags: Any):Unit = js.native
        def set_alignment(xalign: Any, yalign: Any):Unit = js.native
        def set_fixed_size(width: Any, height: Any):Unit = js.native
        def set_padding(xpad: Any, ypad: Any):Unit = js.native
        def set_sensitive(sensitive: Boolean):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
        def start_editing(event: Any, widget: Any, path: String, background_area: Any, cell_area: Any, flags: Any):Any = js.native
        def stop_editing(canceled: Boolean):Unit = js.native
    }
    @js.native
    class CellRendererAccel extends CellRendererText {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererCombo extends CellRendererText {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererPixbuf extends CellRenderer {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererProgress extends CellRenderer {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererSpin extends CellRendererText {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererSpinner extends CellRenderer {
        def this(config: js.Any) = this()
    }
    @js.native
    class CellRendererText extends CellRenderer {
        def this(config: js.Any) = this()
        def set_fixed_height_from_font(number_of_rows: Any):Unit = js.native
    }
    @js.native
    class CellRendererToggle extends CellRenderer {
        def this(config: js.Any) = this()
        def get_activatable():Boolean = js.native
        def get_active():Boolean = js.native
        def get_radio():Boolean = js.native
        def set_activatable(setting: Boolean):Unit = js.native
        def set_active(setting: Boolean):Unit = js.native
        def set_radio(radio: Boolean):Unit = js.native
    }
    @js.native
    class CellView extends Widget {
        def this(config: js.Any) = this()
        def get_displayed_row():Any = js.native
        def get_draw_sensitive():Boolean = js.native
        def get_fit_model():Boolean = js.native
        def get_model():Any = js.native
        def get_size_of_row(path: Any, requisition: Any):Boolean = js.native
        def set_background_color(color: Any):Unit = js.native
        def set_background_rgba(rgba: Any):Unit = js.native
        def set_displayed_row(path: Any):Unit = js.native
        def set_draw_sensitive(draw_sensitive: Boolean):Unit = js.native
        def set_fit_model(fit_model: Boolean):Unit = js.native
        def set_model(model: Any):Unit = js.native
    }
    @js.native
    object CellView extends js.Object {
        def new_with_context(area: Any, context: Any):CellView = js.native
        def new_with_markup(markup: String):CellView = js.native
        def new_with_pixbuf(pixbuf: Any):CellView = js.native
        def new_with_text(text: String):CellView = js.native
    }
    @js.native
    class CheckButton extends ToggleButton {
        def this(config: js.Any) = this()
    }
    @js.native
    object CheckButton extends js.Object {
        def new_with_label(args:Any*):CheckButton = js.native
        def new_with_mnemonic(label: String):CheckButton = js.native
    }
    @js.native
    class CheckMenuItem extends MenuItem {
        def this(config: js.Any) = this()
        def get_active():Boolean = js.native
        def get_draw_as_radio():Boolean = js.native
        def get_inconsistent():Boolean = js.native
        def set_active(is_active: Boolean):Unit = js.native
        def set_draw_as_radio(draw_as_radio: Boolean):Unit = js.native
        def set_inconsistent(setting: Boolean):Unit = js.native
        def toggled():Unit = js.native
    }
    @js.native
    object CheckMenuItem extends js.Object {
        def new_with_label(args:Any*):CheckMenuItem = js.native
        def new_with_mnemonic(label: String):CheckMenuItem = js.native
    }
    @js.native
    class CheckMenuItemAccessible extends MenuItemAccessible {
    }
    @js.native
    class Clipboard extends GObject.Object {
        def clear():Unit = js.native
        def get_display():Any = js.native
        def get_owner():Any = js.native
        def request_contents(target: Any, callback: Any, user_data: Object):Unit = js.native
        def request_image(callback: Any, user_data: Object):Unit = js.native
        def request_rich_text(buffer: Any, callback: Any, user_data: Object):Unit = js.native
        def request_targets(callback: Any, user_data: Object):Unit = js.native
        def request_text(callback: Any, user_data: Object):Unit = js.native
        def request_uris(callback: Any, user_data: Object):Unit = js.native
        def set_can_store(targets: js.Array[Any], n_targets: Any):Unit = js.native
        def set_image(pixbuf: Any):Unit = js.native
        def set_text(text: String, len: Any):Unit = js.native
        def set_with_data(targets: js.Array[Any], n_targets: Any, get_func: Any, clear_func: Any, user_data: Object):Boolean = js.native
        def set_with_owner(targets: js.Array[Any], n_targets: Any, get_func: Any, clear_func: Any, owner: Any):Boolean = js.native
        def store():Unit = js.native
        def wait_for_contents(target: Any):Any = js.native
        def wait_for_image():Any = js.native
        def wait_for_rich_text(buffer: Any, format: Any, length: Any):js.Array[Any] = js.native
        def wait_for_targets(targets: js.Array[Any], n_targets: Any):Boolean = js.native
        def wait_for_text():String = js.native
        def wait_for_uris():js.Array[String] = js.native
        def wait_is_image_available():Boolean = js.native
        def wait_is_rich_text_available(buffer: Any):Boolean = js.native
        def wait_is_target_available(target: Any):Boolean = js.native
        def wait_is_text_available():Boolean = js.native
        def wait_is_uris_available():Boolean = js.native
    }
    @js.native
    object Clipboard extends js.Object {
        def get(selection: Any):Any = js.native
        def get_default(display: Any):Any = js.native
        def get_for_display(display: Any, selection: Any):Any = js.native
    }
    @js.native
    class ColorButton extends Button {
        def this(config: js.Any) = this()
        def get_alpha():Any = js.native
        def get_color(color: Any):Unit = js.native
        def get_rgba(rgba: Any):Unit = js.native
        def get_title():String = js.native
        def get_use_alpha():Boolean = js.native
        def set_alpha(alpha: Any):Unit = js.native
        def set_color(color: Any):Unit = js.native
        def set_rgba(rgba: Any):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_use_alpha(use_alpha: Boolean):Unit = js.native
    }
    @js.native
    object ColorButton extends js.Object {
        def new_with_color(color: Any):ColorButton = js.native
        def new_with_rgba(rgba: Any):ColorButton = js.native
    }
    @js.native
    class ColorChooserDialog extends Dialog {
        def this(config: js.Any) = this()
    }
    @js.native
    class ColorChooserWidget extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    class ColorSelection extends Box {
        def this(config: js.Any) = this()
        def get_current_alpha():Any = js.native
        def get_current_color(color: Any):Unit = js.native
        def get_current_rgba(rgba: Any):Unit = js.native
        def get_has_opacity_control():Boolean = js.native
        def get_has_palette():Boolean = js.native
        def get_previous_alpha():Any = js.native
        def get_previous_color(color: Any):Unit = js.native
        def get_previous_rgba(rgba: Any):Unit = js.native
        def is_adjusting():Boolean = js.native
        def set_current_alpha(alpha: Any):Unit = js.native
        def set_current_color(color: Any):Unit = js.native
        def set_current_rgba(rgba: Any):Unit = js.native
        def set_has_opacity_control(has_opacity: Boolean):Unit = js.native
        def set_has_palette(has_palette: Boolean):Unit = js.native
        def set_previous_alpha(alpha: Any):Unit = js.native
        def set_previous_color(color: Any):Unit = js.native
        def set_previous_rgba(rgba: Any):Unit = js.native
    }
    @js.native
    object ColorSelection extends js.Object {
        def palette_from_string(str: String, colors: js.Array[Any], n_colors: Any):Boolean = js.native
        def palette_to_string(colors: js.Array[Any], n_colors: Any):String = js.native
        def set_change_palette_with_screen_hook(func: Any):Any = js.native
    }
    @js.native
    class ColorSelectionDialog extends Dialog {
        def this(config: js.Any) = this()
        def get_color_selection():Any = js.native
    }
    @js.native
    class ComboBox extends Bin {
        def this(config: js.Any) = this()
        def get_active():Any = js.native
        def get_active_id():String = js.native
        def get_active_iter(iter: Any):Boolean = js.native
        def get_add_tearoffs():Boolean = js.native
        def get_button_sensitivity():Any = js.native
        def get_column_span_column():Any = js.native
        def get_entry_text_column():Any = js.native
        def get_focus_on_click():Boolean = js.native
        def get_has_entry():Boolean = js.native
        def get_id_column():Any = js.native
        def get_model():Any = js.native
        def get_popup_accessible():Any = js.native
        def get_popup_fixed_width():Boolean = js.native
        def get_row_separator_func():Any = js.native
        def get_row_span_column():Any = js.native
        def get_title():String = js.native
        def get_wrap_width():Any = js.native
        def popdown():Unit = js.native
        def popup():Unit = js.native
        def popup_for_device(device: Any):Unit = js.native
        def set_active(index0: Any):Unit = js.native
        def set_active_id(active_id: String):Boolean = js.native
        def set_active_iter(iter: Any):Unit = js.native
        def set_add_tearoffs(add_tearoffs: Boolean):Unit = js.native
        def set_button_sensitivity(sensitivity: Any):Unit = js.native
        def set_column_span_column(column_span: Any):Unit = js.native
        def set_entry_text_column(text_column: Any):Unit = js.native
        def set_focus_on_click(focus_on_click: Boolean):Unit = js.native
        def set_id_column(id_column: Any):Unit = js.native
        def set_model(model: Any):Unit = js.native
        def set_popup_fixed_width(fixed: Boolean):Unit = js.native
        def set_row_separator_func(func: Any, data: Object, destroy: Any):Unit = js.native
        def set_row_span_column(row_span: Any):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_wrap_width(width: Any):Unit = js.native
    }
    @js.native
    object ComboBox extends js.Object {
        def new_with_area(area: Any):ComboBox = js.native
        def new_with_area_and_entry(area: Any):ComboBox = js.native
        def new_with_entry():ComboBox = js.native
        def new_with_model(model: Any):ComboBox = js.native
        def new_with_model_and_entry(model: Any):ComboBox = js.native
    }
    @js.native
    class ComboBoxAccessible extends ContainerAccessible {
    }
    @js.native
    class ComboBoxText extends ComboBox {
        def this(config: js.Any) = this()
        def append(id: String, text: String):Unit = js.native
        def append_text(text: String):Unit = js.native
        def get_active_text():String = js.native
        def insert(position: Any, id: String, text: String):Unit = js.native
        def insert_text(position: Any, text: String):Unit = js.native
        def prepend(id: String, text: String):Unit = js.native
        def prepend_text(text: String):Unit = js.native
        override def remove(args:Any*):Unit = js.native

        def remove_all():Unit = js.native
    }
    @js.native
    object ComboBoxText extends js.Object {
        def new_with_entry():ComboBoxText = js.native
    }
    @js.native
    class Container extends Widget {
        def add(widget: Any):Unit = js.native
        def add_with_properties(widget: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def check_resize():Unit = js.native
        def child_get(child: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def child_get_property(child: Any, property_name: String, value: Any):Unit = js.native
        def child_get_valist(child: Any, first_property_name: String, var_args: Any):Unit = js.native
        override def child_notify(args:Any*):Unit = js.native

        def child_notify_by_pspec(child: Any, pspec: Any):Unit = js.native
        def child_set(child: Any, first_prop_name: String, rest:Any*):Unit = js.native
        def child_set_property(child: Any, property_name: String, value: Any):Unit = js.native
        def child_set_valist(child: Any, first_property_name: String, var_args: Any):Unit = js.native
        def child_type():Any = js.native
        def forall(callback: Any, callback_data: Object):Unit = js.native
        def foreach(callback: Any, callback_data: Object):Unit = js.native
        def get_border_width():Any = js.native
        def get_children():Any = js.native
        def get_focus_chain(focusable_widgets: Any):Boolean = js.native
        def get_focus_child():Any = js.native
        def get_focus_hadjustment():Any = js.native
        def get_focus_vadjustment():Any = js.native
        def get_path_for_child(child: Any):Any = js.native
        def get_resize_mode():Any = js.native
        def propagate_draw(child: Any, cr: Any):Unit = js.native
        def remove(args:Any*):Unit = js.native

        def resize_children():Unit = js.native
        def set_border_width(border_width: Any):Unit = js.native
        def set_focus_chain(focusable_widgets: Any):Unit = js.native
        def set_focus_child(child: Any):Unit = js.native
        def set_focus_hadjustment(adjustment: Any):Unit = js.native
        def set_focus_vadjustment(adjustment: Any):Unit = js.native
        def set_reallocate_redraws(needs_redraws: Boolean):Unit = js.native
        def set_resize_mode(resize_mode: Any):Unit = js.native
        def unset_focus_chain():Unit = js.native
    }
    @js.native
    class ContainerAccessible extends WidgetAccessible {
    }
    @js.native
    class ContainerCellAccessible extends CellAccessible {
        def this(config: js.Any) = this()
        def add_child(child: Any):Unit = js.native
        def get_children():Any = js.native
        def remove_child(child: Any):Unit = js.native
    }
    @js.native
    class CssProvider extends GObject.Object {
        def this(config: js.Any) = this()
        def load_from_data(args:Any*):Boolean = js.native

        def load_from_file(file: Any):Boolean = js.native
        def load_from_path(path: String):Boolean = js.native
        def load_from_resource(resource_path: String):Unit = js.native
        def to_string():String = js.native
    }
    @js.native
    object CssProvider extends js.Object {
        def get_default():Any = js.native
        def get_named(name: String, variant: String):Any = js.native
    }
    @js.native
    class Dialog extends Window {
        def this(config: js.Any) = this()
        def add_action_widget(child: Any, response_id: Any):Unit = js.native
        def add_button(button_text: String, response_id: Any):Any = js.native
        def add_buttons(first_button_text: String, rest:Any*):Unit = js.native
        def get_action_area():Any = js.native
        def get_content_area():Any = js.native
        def get_header_bar():Any = js.native
        def get_response_for_widget(widget: Any):Any = js.native
        def get_widget_for_response(response_id: Any):Any = js.native
        def response(response_id: Any):Unit = js.native
        def run():Any = js.native
        def set_alternative_button_order(first_response_id: Any, rest:Any*):Unit = js.native
        def set_alternative_button_order_from_array(n_params: Any, new_order: js.Array[Any]):Unit = js.native
        def set_default_response(response_id: Any):Unit = js.native
        def set_response_sensitive(response_id: Any, setting: Boolean):Unit = js.native
    }
    @js.native
    object Dialog extends js.Object {
        def new_with_buttons(title: String, parent: Any, flags: Any, first_button_text: String, rest:Any*):Dialog = js.native
    }
    @js.native
    class DrawingArea extends Widget {
        def this(config: js.Any) = this()
    }
    @js.native
    class Entry extends Widget {
        def this(config: js.Any) = this()
        def get_activates_default():Boolean = js.native
        def get_alignment():Any = js.native
        def get_attributes():Any = js.native
        def get_buffer():Any = js.native
        def get_completion():Any = js.native
        def get_current_icon_drag_source():Any = js.native
        def get_cursor_hadjustment():Any = js.native
        def get_has_frame():Boolean = js.native
        def get_icon_activatable(icon_pos: Any):Boolean = js.native
        def get_icon_area(icon_pos: Any, icon_area: Any):Unit = js.native
        def get_icon_at_pos(x: Any, y: Any):Any = js.native
        def get_icon_gicon(icon_pos: Any):Any = js.native
        def get_icon_name(icon_pos: Any):String = js.native
        def get_icon_pixbuf(icon_pos: Any):Any = js.native
        def get_icon_sensitive(icon_pos: Any):Boolean = js.native
        def get_icon_stock(icon_pos: Any):String = js.native
        def get_icon_storage_type(icon_pos: Any):Any = js.native
        def get_icon_tooltip_markup(icon_pos: Any):String = js.native
        def get_icon_tooltip_text(icon_pos: Any):String = js.native
        def get_inner_border():Any = js.native
        def get_input_hints():Any = js.native
        def get_input_purpose():Any = js.native
        def get_invisible_char():Any = js.native
        def get_layout():Any = js.native
        def get_layout_offsets(x: Any, y: Any):Unit = js.native
        def get_max_length():Any = js.native
        def get_max_width_chars():Any = js.native
        def get_overwrite_mode():Boolean = js.native
        def get_placeholder_text():String = js.native
        def get_progress_fraction():Any = js.native
        def get_progress_pulse_step():Any = js.native
        def get_tabs():Any = js.native
        def get_text():String = js.native
        def get_text_area(text_area: Any):Unit = js.native
        def get_text_length():Any = js.native
        def get_visibility():Boolean = js.native
        def get_width_chars():Any = js.native
        def grab_focus_without_selecting():Unit = js.native
        def im_context_filter_keypress(event: Any):Boolean = js.native
        def layout_index_to_text_index(layout_index: Any):Any = js.native
        def progress_pulse():Unit = js.native
        def reset_im_context():Unit = js.native
        def set_activates_default(setting: Boolean):Unit = js.native
        def set_alignment(xalign: Any):Unit = js.native
        def set_attributes(attrs: Any):Unit = js.native
        def set_buffer(buffer: Any):Unit = js.native
        def set_completion(completion: Any):Unit = js.native
        def set_cursor_hadjustment(adjustment: Any):Unit = js.native
        def set_has_frame(setting: Boolean):Unit = js.native
        def set_icon_activatable(icon_pos: Any, activatable: Boolean):Unit = js.native
        def set_icon_drag_source(icon_pos: Any, target_list: Any, actions: Any):Unit = js.native
        def set_icon_from_gicon(icon_pos: Any, icon: Any):Unit = js.native
        def set_icon_from_icon_name(icon_pos: Any, icon_name: String):Unit = js.native
        def set_icon_from_pixbuf(icon_pos: Any, pixbuf: Any):Unit = js.native
        def set_icon_from_stock(icon_pos: Any, stock_id: String):Unit = js.native
        def set_icon_sensitive(icon_pos: Any, sensitive: Boolean):Unit = js.native
        def set_icon_tooltip_markup(icon_pos: Any, tooltip: String):Unit = js.native
        def set_icon_tooltip_text(icon_pos: Any, tooltip: String):Unit = js.native
        def set_inner_border(border: Any):Unit = js.native
        def set_input_hints(hints: Any):Unit = js.native
        def set_input_purpose(purpose: Any):Unit = js.native
        def set_invisible_char(ch: Any):Unit = js.native
        def set_max_length(max: Any):Unit = js.native
        def set_max_width_chars(n_chars: Any):Unit = js.native
        def set_overwrite_mode(overwrite: Boolean):Unit = js.native
        def set_placeholder_text(text: String):Unit = js.native
        def set_progress_fraction(fraction: Any):Unit = js.native
        def set_progress_pulse_step(fraction: Any):Unit = js.native
        def set_tabs(tabs: Any):Unit = js.native
        def set_text(text: String):Unit = js.native
        def set_visibility(visible: Boolean):Unit = js.native
        def set_width_chars(n_chars: Any):Unit = js.native
        def text_index_to_layout_index(text_index: Any):Any = js.native
        def unset_invisible_char():Unit = js.native
    }
    @js.native
    object Entry extends js.Object {
        def new_with_buffer(buffer: Any):Entry = js.native
    }
    @js.native
    class EntryAccessible extends WidgetAccessible {
    }
    @js.native
    class EntryBuffer extends GObject.Object {
        def this(config: js.Any) = this()
        def delete_text(position: Any, n_chars: Any):Any = js.native
        def emit_deleted_text(position: Any, n_chars: Any):Unit = js.native
        def emit_inserted_text(position: Any, chars: String, n_chars: Any):Unit = js.native
        def get_bytes():Any = js.native
        def get_length():Any = js.native
        def get_max_length():Any = js.native
        def get_text():String = js.native
        def insert_text(position: Any, chars: String, n_chars: Any):Any = js.native
        def set_max_length(max_length: Any):Unit = js.native
        def set_text(chars: String, n_chars: Any):Unit = js.native
    }
    @js.native
    class EntryCompletion extends GObject.Object {
        def this(config: js.Any) = this()
        def complete():Unit = js.native
        def compute_prefix(key: String):String = js.native
        def delete_action(index0: Any):Unit = js.native
        def get_completion_prefix():String = js.native
        def get_entry():Any = js.native
        def get_inline_completion():Boolean = js.native
        def get_inline_selection():Boolean = js.native
        def get_minimum_key_length():Any = js.native
        def get_model():Any = js.native
        def get_popup_completion():Boolean = js.native
        def get_popup_set_width():Boolean = js.native
        def get_popup_single_match():Boolean = js.native
        def get_text_column():Any = js.native
        def insert_action_markup(index0: Any, markup: String):Unit = js.native
        def insert_action_text(index0: Any, text: String):Unit = js.native
        def insert_prefix():Unit = js.native
        def set_inline_completion(inline_completion: Boolean):Unit = js.native
        def set_inline_selection(inline_selection: Boolean):Unit = js.native
        def set_match_func(func: Any, func_data: Object, func_notify: Any):Unit = js.native
        def set_minimum_key_length(length: Any):Unit = js.native
        def set_model(model: Any):Unit = js.native
        def set_popup_completion(popup_completion: Boolean):Unit = js.native
        def set_popup_set_width(popup_set_width: Boolean):Unit = js.native
        def set_popup_single_match(popup_single_match: Boolean):Unit = js.native
        def set_text_column(column: Any):Unit = js.native
    }
    @js.native
    object EntryCompletion extends js.Object {
        def new_with_area(area: Any):EntryCompletion = js.native
    }
    @js.native
    class EntryIconAccessible extends Atk.Object {
    }
    @js.native
    class EventBox extends Bin {
        def this(config: js.Any) = this()
        def get_above_child():Boolean = js.native
        def get_visible_window():Boolean = js.native
        def set_above_child(above_child: Boolean):Unit = js.native
        def set_visible_window(visible_window: Boolean):Unit = js.native
    }
    @js.native
    class EventController extends GObject.Object {
        def get_propagation_phase():Any = js.native
        def get_widget():Any = js.native
        def handle_event(event: Any):Boolean = js.native
        def reset():Unit = js.native
        def set_propagation_phase(phase: Any):Unit = js.native
    }
    @js.native
    class Expander extends Bin {
        def this(config: js.Any) = this()
        def get_expanded():Boolean = js.native
        def get_label():String = js.native
        def get_label_fill():Boolean = js.native
        def get_label_widget():Any = js.native
        def get_resize_toplevel():Boolean = js.native
        def get_spacing():Any = js.native
        def get_use_markup():Boolean = js.native
        def get_use_underline():Boolean = js.native
        def set_expanded(expanded: Boolean):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_label_fill(label_fill: Boolean):Unit = js.native
        def set_label_widget(label_widget: Any):Unit = js.native
        def set_resize_toplevel(resize_toplevel: Boolean):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
        def set_use_markup(use_markup: Boolean):Unit = js.native
        def set_use_underline(use_underline: Boolean):Unit = js.native
    }
    @js.native
    object Expander extends js.Object {
        def new_with_mnemonic(label: String):Expander = js.native
    }
    @js.native
    class ExpanderAccessible extends ContainerAccessible {
    }
    @js.native
    class FileChooserButton extends Box {
        def this(config: js.Any) = this()
        def get_focus_on_click():Boolean = js.native
        def get_title():String = js.native
        def get_width_chars():Any = js.native
        def set_focus_on_click(focus_on_click: Boolean):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_width_chars(n_chars: Any):Unit = js.native
    }
    @js.native
    object FileChooserButton extends js.Object {
        def new_with_dialog(dialog: Any):FileChooserButton = js.native
    }
    @js.native
    class FileChooserDialog extends Dialog {
        def this(config: js.Any) = this()
        def set_select_multiple(select:Boolean):Unit = js.native
    }
    @js.native
    class FileChooserWidget extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    class FileFilter extends GObject.InitiallyUnowned {
        def this(config: js.Any) = this()
        def add_custom(needed: Any, func: Any, data: Object, notify: Any):Unit = js.native
        def add_mime_type(mime_type0: String):Unit = js.native
        def add_pattern(pattern: String):Unit = js.native
        def add_pixbuf_formats():Unit = js.native
        def filter(filter_info: Any):Boolean = js.native
        def get_name():String = js.native
        def get_needed():Any = js.native
        def set_name(name: String):Unit = js.native
    }
    @js.native
    class Fixed extends Container {
        def this(config: js.Any) = this()
        def move(widget: Any, x: Any, y: Any):Unit = js.native
        def put(widget: Any, x: Any, y: Any):Unit = js.native
    }
    @js.native
    class FlowBox extends Container {
        def this(config: js.Any) = this()
        def bind_model(model: Any, create_widget_func: Any, user_data: Object, user_data_free_func: Any):Unit = js.native
        def get_activate_on_single_click():Boolean = js.native
        def get_child_at_index(idx: Any):Any = js.native
        def get_column_spacing():Any = js.native
        def get_homogeneous():Boolean = js.native
        def get_max_children_per_line():Any = js.native
        def get_min_children_per_line():Any = js.native
        def get_row_spacing():Any = js.native
        def get_selected_children():Any = js.native
        def get_selection_mode():Any = js.native
        def insert(widget: Any, position: Any):Unit = js.native
        def invalidate_filter():Unit = js.native
        def invalidate_sort():Unit = js.native
        def select_all():Unit = js.native
        def select_child(child: Any):Unit = js.native
        def selected_foreach(func: Any, data: Object):Unit = js.native
        def set_activate_on_single_click(single: Boolean):Unit = js.native
        def set_column_spacing(spacing: Any):Unit = js.native
        def set_filter_func(filter_func: Any, user_data: Object, destroy: Any):Unit = js.native
        def set_hadjustment(adjustment: Any):Unit = js.native
        def set_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_max_children_per_line(n_children: Any):Unit = js.native
        def set_min_children_per_line(n_children: Any):Unit = js.native
        def set_row_spacing(spacing: Any):Unit = js.native
        def set_selection_mode(mode: Any):Unit = js.native
        def set_sort_func(sort_func: Any, user_data: Object, destroy: Any):Unit = js.native
        def set_vadjustment(adjustment: Any):Unit = js.native
        def unselect_all():Unit = js.native
        def unselect_child(child: Any):Unit = js.native
    }
    @js.native
    class FlowBoxAccessible extends ContainerAccessible {
    }
    @js.native
    class FlowBoxChild extends Bin {
        def this(config: js.Any) = this()
        def changed():Unit = js.native
        def get_index():Any = js.native
        def is_selected():Boolean = js.native
    }
    @js.native
    class FlowBoxChildAccessible extends ContainerAccessible {
    }
    @js.native
    class FontButton extends Button {
        def this(config: js.Any) = this()
        def get_font_name():String = js.native
        def get_show_size():Boolean = js.native
        def get_show_style():Boolean = js.native
        def get_title():String = js.native
        def get_use_font():Boolean = js.native
        def get_use_size():Boolean = js.native
        def set_font_name(fontname: String):Boolean = js.native
        def set_show_size(show_size: Boolean):Unit = js.native
        def set_show_style(show_style: Boolean):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_use_font(use_font: Boolean):Unit = js.native
        def set_use_size(use_size: Boolean):Unit = js.native
    }
    @js.native
    object FontButton extends js.Object {
        def new_with_font(fontname: String):FontButton = js.native
    }
    @js.native
    class FontChooserDialog extends Dialog {
        def this(config: js.Any) = this()
    }
    @js.native
    class FontChooserWidget extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    class FontSelection extends Box {
        def this(config: js.Any) = this()
        def get_face():Any = js.native
        def get_face_list():Any = js.native
        def get_family():Any = js.native
        def get_family_list():Any = js.native
        def get_font_name():String = js.native
        def get_preview_entry():Any = js.native
        def get_preview_text():String = js.native
        def get_size():Any = js.native
        def get_size_entry():Any = js.native
        def get_size_list():Any = js.native
        def set_font_name(fontname: String):Boolean = js.native
        def set_preview_text(text: String):Unit = js.native
    }
    @js.native
    class FontSelectionDialog extends Dialog {
        def this(config: js.Any) = this()
        def get_cancel_button():Any = js.native
        def get_font_name():String = js.native
        def get_font_selection():Any = js.native
        def get_ok_button():Any = js.native
        def get_preview_text():String = js.native
        def set_font_name(fontname: String):Boolean = js.native
        def set_preview_text(text: String):Unit = js.native
    }
    @js.native
    class Frame extends Bin {
        def this(config: js.Any) = this()
        def get_label():String = js.native
        def get_label_align(xalign: Any, yalign: Any):Unit = js.native
        def get_label_widget():Any = js.native
        def get_shadow_type():Any = js.native
        def set_label(label: String):Unit = js.native
        def set_label_align(xalign: Any, yalign: Any):Unit = js.native
        def set_label_widget(label_widget: Any):Unit = js.native
        def set_shadow_type(type0: Any):Unit = js.native
    }
    @js.native
    class FrameAccessible extends ContainerAccessible {
    }
    @js.native
    class GLArea extends Widget {
        def this(config: js.Any) = this()
        def attach_buffers():Unit = js.native
        def get_auto_render():Boolean = js.native
        def get_context():Any = js.native
        def get_error():Any = js.native
        def get_has_alpha():Boolean = js.native
        def get_has_depth_buffer():Boolean = js.native
        def get_has_stencil_buffer():Boolean = js.native
        def get_required_version(major: Any, minor: Any):Unit = js.native
        def make_current():Unit = js.native
        def queue_render():Unit = js.native
        def set_auto_render(auto_render: Boolean):Unit = js.native
        def set_error(error: Any):Unit = js.native
        def set_has_alpha(has_alpha: Boolean):Unit = js.native
        def set_has_depth_buffer(has_depth_buffer: Boolean):Unit = js.native
        def set_has_stencil_buffer(has_stencil_buffer: Boolean):Unit = js.native
        def set_required_version(major: Any, minor: Any):Unit = js.native
    }
    @js.native
    class Gesture extends EventController {
        def get_bounding_box(rect: Any):Boolean = js.native
        def get_bounding_box_center(x: Any, y: Any):Boolean = js.native
        def get_device():Any = js.native
        def get_group():Any = js.native
        def get_last_event(sequence: Any):Any = js.native
        def get_last_updated_sequence():Any = js.native
        def get_point(sequence: Any, x: Any, y: Any):Boolean = js.native
        def get_sequence_state(sequence: Any):Any = js.native
        def get_sequences():Any = js.native
        def get_window():Any = js.native
        def group(gesture: Any):Unit = js.native
        def handles_sequence(sequence: Any):Boolean = js.native
        def is_active():Boolean = js.native
        def is_grouped_with(other: Any):Boolean = js.native
        def is_recognized():Boolean = js.native
        def set_sequence_state(sequence: Any, state: Any):Boolean = js.native
        def set_state(state: Any):Boolean = js.native
        def set_window(window: Any):Unit = js.native
        def ungroup():Unit = js.native
    }
    @js.native
    class GestureDrag extends GestureSingle {
        def this(config: js.Any) = this()
        def get_offset(x: Any, y: Any):Boolean = js.native
        def get_start_point(x: Any, y: Any):Boolean = js.native
    }
    @js.native
    class GestureLongPress extends GestureSingle {
        def this(config: js.Any) = this()
    }
    @js.native
    class GestureMultiPress extends GestureSingle {
        def this(config: js.Any) = this()
        def get_area(rect: Any):Boolean = js.native
        def set_area(rect: Any):Unit = js.native
    }
    @js.native
    class GesturePan extends GestureDrag {
        def this(config: js.Any) = this()
        def get_orientation():Any = js.native
        def set_orientation(orientation: Any):Unit = js.native
    }
    @js.native
    class GestureRotate extends Gesture {
        def this(config: js.Any) = this()
        def get_angle_delta():Any = js.native
    }
    @js.native
    class GestureSingle extends Gesture {
        def get_button():Any = js.native
        def get_current_button():Any = js.native
        def get_current_sequence():Any = js.native
        def get_exclusive():Boolean = js.native
        def get_touch_only():Boolean = js.native
        def set_button(button: Any):Unit = js.native
        def set_exclusive(exclusive: Boolean):Unit = js.native
        def set_touch_only(touch_only: Boolean):Unit = js.native
    }
    @js.native
    class GestureSwipe extends GestureSingle {
        def this(config: js.Any) = this()
        def get_velocity(velocity_x: Any, velocity_y: Any):Boolean = js.native
    }
    @js.native
    class GestureZoom extends Gesture {
        def this(config: js.Any) = this()
        def get_scale_delta():Any = js.native
    }
    @js.native
    class Grid extends Container {
        def this(config: js.Any) = this()
        def attach(child: Any, left: Any, top: Any, width: Any, height: Any):Unit = js.native
        def attach_next_to(child: Any, sibling: Any, side: Any, width: Any, height: Any):Unit = js.native
        def get_baseline_row():Any = js.native
        def get_child_at(left: Any, top: Any):Any = js.native
        def get_column_homogeneous():Boolean = js.native
        def get_column_spacing():Any = js.native
        def get_row_baseline_position(row: Any):Any = js.native
        def get_row_homogeneous():Boolean = js.native
        def get_row_spacing():Any = js.native
        def insert_column(position: Any):Unit = js.native
        def insert_next_to(sibling: Any, side: Any):Unit = js.native
        def insert_row(position: Any):Unit = js.native
        def remove_column(position: Any):Unit = js.native
        def remove_row(position: Any):Unit = js.native
        def set_baseline_row(row: Any):Unit = js.native
        def set_column_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_column_spacing(spacing: Any):Unit = js.native
        def set_row_baseline_position(row: Any, pos: Any):Unit = js.native
        def set_row_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_row_spacing(spacing: Any):Unit = js.native
    }
    @js.native
    class HBox extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    class HButtonBox extends ButtonBox {
        def this(config: js.Any) = this()
    }
    @js.native
    class HPaned extends Paned {
        def this(config: js.Any) = this()
    }
    @js.native
    class HSV extends Widget {
        def this(config: js.Any) = this()
        def get_color(h: Any, s: Any, v: Any):Unit = js.native
        def get_metrics(size: Any, ring_width: Any):Unit = js.native
        def is_adjusting():Boolean = js.native
        def set_color(h: Any, s: Any, v: Any):Unit = js.native
        def set_metrics(size: Any, ring_width: Any):Unit = js.native
    }
    @js.native
    object HSV extends js.Object {
        def to_rgb(h: Any, s: Any, v: Any, r: Any, g: Any, b: Any):Unit = js.native
    }
    @js.native
    class HScale extends Scale {
        def this(config: js.Any) = this()
    }
    @js.native
    object HScale extends js.Object {
        def new_with_range(min: Any, max: Any, step: Any):HScale = js.native
    }
    @js.native
    class HScrollbar extends Scrollbar {
        def this(config: js.Any) = this()
    }
    @js.native
    class HSeparator extends Separator {
        def this(config: js.Any) = this()
    }
    @js.native
    class HandleBox extends Bin {
        def this(config: js.Any) = this()
        def get_child_detached():Boolean = js.native
        def get_handle_position():Any = js.native
        def get_shadow_type():Any = js.native
        def get_snap_edge():Any = js.native
        def set_handle_position(position: Any):Unit = js.native
        def set_shadow_type(type0: Any):Unit = js.native
        def set_snap_edge(edge: Any):Unit = js.native
    }
    @js.native
    class HeaderBar extends Container {
        def this(config: js.Any) = this()
        def get_custom_title():Any = js.native
        def get_decoration_layout():String = js.native
        def get_has_subtitle():Boolean = js.native
        def get_show_close_button():Boolean = js.native
        def get_subtitle():String = js.native
        def get_title():String = js.native
        def pack_end(child: Any):Unit = js.native
        def pack_start(child: Any):Unit = js.native
        def set_custom_title(title_widget: Any):Unit = js.native
        def set_decoration_layout(layout: String):Unit = js.native
        def set_has_subtitle(setting: Boolean):Unit = js.native
        def set_show_close_button(setting: Boolean):Unit = js.native
        def set_subtitle(subtitle: String):Unit = js.native
        def set_title(title: String):Unit = js.native
    }
    @js.native
    class IMContext extends GObject.Object {
        def delete_surrounding(offset: Any, n_chars: Any):Boolean = js.native
        def filter_keypress(event: Any):Boolean = js.native
        def focus_in():Unit = js.native
        def focus_out():Unit = js.native
        def get_preedit_string(str: String, attrs: Any, cursor_pos: Any):Unit = js.native
        def get_surrounding(text: String, cursor_index: Any):Boolean = js.native
        def reset():Unit = js.native
        def set_client_window(window: Any):Unit = js.native
        def set_cursor_location(area: Any):Unit = js.native
        def set_surrounding(text: String, len: Any, cursor_index: Any):Unit = js.native
        def set_use_preedit(use_preedit: Boolean):Unit = js.native
    }
    @js.native
    class IMContextSimple extends IMContext {
        def this(config: js.Any) = this()
        def add_table(data: js.Array[Any], max_seq_len: Any, n_seqs: Any):Unit = js.native
    }
    @js.native
    class IMMulticontext extends IMContext {
        def this(config: js.Any) = this()
        def append_menuitems(menushell: Any):Unit = js.native
        def get_context_id():String = js.native
        def set_context_id(context_id: String):Unit = js.native
    }
    @js.native
    class IconFactory extends GObject.Object {
        def this(config: js.Any) = this()
        def add(stock_id: String, icon_set: Any):Unit = js.native
        def add_default():Unit = js.native
        def lookup(stock_id: String):Any = js.native
        def remove_default():Unit = js.native
    }
    @js.native
    object IconFactory extends js.Object {
        def lookup_default(stock_id: String):Any = js.native
    }
    @js.native
    class IconInfo extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Any = js.native
        def free():Unit = js.native
        def get_attach_points(points: js.Array[Any], n_points: Any):Boolean = js.native
        def get_base_scale():Any = js.native
        def get_base_size():Any = js.native
        def get_builtin_pixbuf():Any = js.native
        def get_display_name():String = js.native
        def get_embedded_rect(rectangle: Any):Boolean = js.native
        def get_filename():Any = js.native
        def is_symbolic():Boolean = js.native
        def load_icon():Any = js.native
        def load_icon_async(cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def load_icon_finish(res: Any):Any = js.native
        def load_surface(for_window: Any):Any = js.native
        def load_symbolic(fg: Any, success_color: Any, warning_color: Any, error_color: Any, was_symbolic: Boolean):Any = js.native
        def load_symbolic_async(fg: Any, success_color: Any, warning_color: Any, error_color: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def load_symbolic_finish(res: Any, was_symbolic: Boolean):Any = js.native
        def load_symbolic_for_context(context: Any, was_symbolic: Boolean):Any = js.native
        def load_symbolic_for_context_async(context: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def load_symbolic_for_context_finish(res: Any, was_symbolic: Boolean):Any = js.native
        def load_symbolic_for_style(style: Any, state: Any, was_symbolic: Boolean):Any = js.native
        def set_raw_coordinates(raw_coordinates: Boolean):Unit = js.native
    }
    @js.native
    object IconInfo extends js.Object {
        def new_for_pixbuf(icon_theme: Any, pixbuf: Any):IconInfo = js.native
    }
    @js.native
    class IconTheme extends GObject.Object {
        def this(config: js.Any) = this()
        def add_resource_path(path: String):Unit = js.native
        def append_search_path(path: Any):Unit = js.native
        def choose_icon(icon_names: js.Array[String], size: Any, flags: Any):Any = js.native
        def choose_icon_for_scale(icon_names: js.Array[String], size: Any, scale: Any, flags: Any):Any = js.native
        def get_example_icon_name():String = js.native
        def get_icon_sizes(icon_name: String):js.Array[Any] = js.native
        def get_search_path(path: js.Array[Any], n_elements: Any):Unit = js.native
        def has_icon(icon_name: String):Boolean = js.native
        def list_contexts():Any = js.native
        def list_icons(context: String):Any = js.native
        def load_icon(icon_name: String, size: Any, flags: Any):Any = js.native
        def load_icon_for_scale(icon_name: String, size: Any, scale: Any, flags: Any):Any = js.native
        def load_surface(icon_name: String, size: Any, scale: Any, for_window: Any, flags: Any):Any = js.native
        def lookup_by_gicon(icon: Any, size: Any, flags: Any):Any = js.native
        def lookup_by_gicon_for_scale(icon: Any, size: Any, scale: Any, flags: Any):Any = js.native
        def lookup_icon(icon_name: String, size: Any, flags: Any):Any = js.native
        def lookup_icon_for_scale(icon_name: String, size: Any, scale: Any, flags: Any):Any = js.native
        def prepend_search_path(path: Any):Unit = js.native
        def rescan_if_needed():Boolean = js.native
        def set_custom_theme(theme_name: String):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
        def set_search_path(path: js.Array[Any], n_elements: Any):Unit = js.native
    }
    @js.native
    object IconTheme extends js.Object {
        def add_builtin_icon(icon_name: String, size: Any, pixbuf: Any):Unit = js.native
        def get_default():Any = js.native
        def get_for_screen(screen: Any):Any = js.native
    }
    @js.native
    class IconView extends Container {
        def this(config: js.Any) = this()
        def convert_widget_to_bin_window_coords(wx: Any, wy: Any, bx: Any, by: Any):Unit = js.native
        def create_drag_icon(path: Any):Any = js.native
        def enable_model_drag_dest(targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def enable_model_drag_source(start_button_mask: Any, targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def get_activate_on_single_click():Boolean = js.native
        def get_cell_rect(path: Any, cell: Any, rect: Any):Boolean = js.native
        def get_column_spacing():Any = js.native
        def get_columns():Any = js.native
        def get_cursor(path: Any, cell: Any):Boolean = js.native
        def get_dest_item_at_pos(drag_x: Any, drag_y: Any, path: Any, pos: Any):Boolean = js.native
        def get_drag_dest_item(path: Any, pos: Any):Unit = js.native
        def get_item_at_pos(x: Any, y: Any, path: Any, cell: Any):Boolean = js.native
        def get_item_column(path: Any):Any = js.native
        def get_item_orientation():Any = js.native
        def get_item_padding():Any = js.native
        def get_item_row(path: Any):Any = js.native
        def get_item_width():Any = js.native
        def get_margin():Any = js.native
        def get_markup_column():Any = js.native
        def get_model():Any = js.native
        def get_path_at_pos(x: Any, y: Any):Any = js.native
        def get_pixbuf_column():Any = js.native
        def get_reorderable():Boolean = js.native
        def get_row_spacing():Any = js.native
        def get_selected_items():Any = js.native
        def get_selection_mode():Any = js.native
        def get_spacing():Any = js.native
        def get_text_column():Any = js.native
        def get_tooltip_column():Any = js.native
        def get_tooltip_context(x: Any, y: Any, keyboard_tip: Boolean, model: Any, path: Any, iter: Any):Boolean = js.native
        def get_visible_range(start_path: Any, end_path: Any):Boolean = js.native
        def item_activated(path: Any):Unit = js.native
        def path_is_selected(path: Any):Boolean = js.native
        def scroll_to_path(path: Any, use_align: Boolean, row_align: Any, col_align: Any):Unit = js.native
        def select_all():Unit = js.native
        def select_path(path: Any):Unit = js.native
        def selected_foreach(func: Any, data: Object):Unit = js.native
        def set_activate_on_single_click(single: Boolean):Unit = js.native
        def set_column_spacing(column_spacing: Any):Unit = js.native
        def set_columns(columns: Any):Unit = js.native
        def set_cursor(path: Any, cell: Any, start_editing: Boolean):Unit = js.native
        def set_drag_dest_item(path: Any, pos: Any):Unit = js.native
        def set_item_orientation(orientation: Any):Unit = js.native
        def set_item_padding(item_padding: Any):Unit = js.native
        def set_item_width(item_width: Any):Unit = js.native
        def set_margin(margin: Any):Unit = js.native
        def set_markup_column(column: Any):Unit = js.native
        def set_model(model: Any):Unit = js.native
        def set_pixbuf_column(column: Any):Unit = js.native
        def set_reorderable(reorderable: Boolean):Unit = js.native
        def set_row_spacing(row_spacing: Any):Unit = js.native
        def set_selection_mode(mode: Any):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
        def set_text_column(column: Any):Unit = js.native
        def set_tooltip_cell(tooltip: Any, path: Any, cell: Any):Unit = js.native
        def set_tooltip_column(column: Any):Unit = js.native
        def set_tooltip_item(tooltip: Any, path: Any):Unit = js.native
        def unselect_all():Unit = js.native
        def unselect_path(path: Any):Unit = js.native
        def unset_model_drag_dest():Unit = js.native
        def unset_model_drag_source():Unit = js.native
    }
    @js.native
    object IconView extends js.Object {
        def new_with_area(area: Any):IconView = js.native
        def new_with_model(model: Any):IconView = js.native
    }
    @js.native
    class IconViewAccessible extends ContainerAccessible {
    }
    @js.native
    class Image extends Misc {
        def this(config: js.Any) = this()
        def clear():Unit = js.native
        def get_animation():Any = js.native
        def get_gicon(gicon: Any, size: Any):Unit = js.native
        def get_icon_name(icon_name: String, size: Any):Unit = js.native
        def get_icon_set(icon_set: Any, size: Any):Unit = js.native
        def get_pixbuf():Any = js.native
        def get_pixel_size():Any = js.native
        def get_stock(stock_id: String, size: Any):Unit = js.native
        def get_storage_type():Any = js.native
        def set_from_animation(animation: Any):Unit = js.native
        def set_from_file(filename: Any):Unit = js.native
        def set_from_gicon(icon: Any, size: Any):Unit = js.native
        def set_from_icon_name(icon_name: String, size: Any):Unit = js.native
        def set_from_icon_set(icon_set: Any, size: Any):Unit = js.native
        def set_from_pixbuf(pixbuf: Any):Unit = js.native
        def set_from_resource(resource_path: String):Unit = js.native
        def set_from_stock(stock_id: String, size: Any):Unit = js.native
        def set_from_surface(surface: Any):Unit = js.native
        def set_pixel_size(pixel_size: Any):Unit = js.native
    }
    @js.native
    object Image extends js.Object {
        def new_from_animation(animation: Any):Image = js.native
        def new_from_file(filename: Any):Image = js.native
        def new_from_gicon(icon: Any, size: Any):Image = js.native
        def new_from_icon_name(icon_name: String, size: Any):Image = js.native
        def new_from_icon_set(icon_set: Any, size: Any):Image = js.native
        def new_from_pixbuf(pixbuf: Any):Image = js.native
        def new_from_resource(resource_path: String):Image = js.native
        def new_from_stock(stock_id: String, size: Any):Image = js.native
        def new_from_surface(surface: Any):Image = js.native
    }
    @js.native
    class ImageAccessible extends WidgetAccessible {
    }
    @js.native
    class ImageCellAccessible extends RendererCellAccessible {
    }
    @js.native
    class ImageMenuItem extends MenuItem {
        def this(config: js.Any) = this()
        def get_always_show_image():Boolean = js.native
        def get_image():Any = js.native
        def get_use_stock():Boolean = js.native
        def set_accel_group(accel_group: Any):Unit = js.native
        def set_always_show_image(always_show: Boolean):Unit = js.native
        def set_image(image: Any):Unit = js.native
        def set_use_stock(use_stock: Boolean):Unit = js.native
    }
    @js.native
    object ImageMenuItem extends js.Object {
        def new_from_stock(stock_id: String, accel_group: Any):ImageMenuItem = js.native
        def new_with_label(label: String):ImageMenuItem = js.native
        def new_with_mnemonic(label: String):ImageMenuItem = js.native
    }
    @js.native
    class InfoBar extends Box {
        def this(config: js.Any) = this()
        def add_action_widget(child: Any, response_id: Any):Unit = js.native
        def add_button(button_text: String, response_id: Any):Any = js.native
        def add_buttons(first_button_text: String, rest:Any*):Unit = js.native
        def get_action_area():Any = js.native
        def get_content_area():Any = js.native
        def get_message_type():Any = js.native
        def get_show_close_button():Boolean = js.native
        def response(response_id: Any):Unit = js.native
        def set_default_response(response_id: Any):Unit = js.native
        def set_message_type(message_type0: Any):Unit = js.native
        def set_response_sensitive(response_id: Any, setting: Boolean):Unit = js.native
        def set_show_close_button(setting: Boolean):Unit = js.native
    }
    @js.native
    object InfoBar extends js.Object {
        def new_with_buttons(first_button_text: String, rest:Any*):InfoBar = js.native
    }
    @js.native
    class Invisible extends Widget {
        def this(config: js.Any) = this()
        override def get_screen():Any = js.native
        def set_screen(screen: Any):Unit = js.native
    }
    @js.native
    object Invisible extends js.Object {
        def new_for_screen(screen: Any):Invisible = js.native
    }
    @js.native
    class Label extends Misc {
        def this(config: js.Any) = this()
        def get_angle():Any = js.native
        def get_attributes():Any = js.native
        def get_current_uri():String = js.native
        def get_ellipsize():Any = js.native
        def get_justify():Any = js.native
        def get_label():String = js.native
        def get_layout():Any = js.native
        def get_layout_offsets(x: Any, y: Any):Unit = js.native
        def get_line_wrap():Boolean = js.native
        def get_line_wrap_mode():Any = js.native
        def get_lines():Any = js.native
        def get_max_width_chars():Any = js.native
        def get_mnemonic_keyval():Any = js.native
        def get_mnemonic_widget():Any = js.native
        def get_selectable():Boolean = js.native
        def get_selection_bounds(start: Any, end: Any):Boolean = js.native
        def get_single_line_mode():Boolean = js.native
        def get_text():String = js.native
        def get_track_visited_links():Boolean = js.native
        def get_use_markup():Boolean = js.native
        def get_use_underline():Boolean = js.native
        def get_width_chars():Any = js.native
        def get_xalign():Any = js.native
        def get_yalign():Any = js.native
        def select_region(start_offset: Any, end_offset: Any):Unit = js.native
        def set_angle(angle: Any):Unit = js.native
        def set_attributes(attrs: Any):Unit = js.native
        def set_ellipsize(mode: Any):Unit = js.native
        def set_justify(jtype0: Any):Unit = js.native
        def set_label(str: String):Unit = js.native
        def set_line_wrap(wrap: Boolean):Unit = js.native
        def set_line_wrap_mode(wrap_mode: Any):Unit = js.native
        def set_lines(lines: Any):Unit = js.native
        def set_markup(str: String):Unit = js.native
        def set_markup_with_mnemonic(str: String):Unit = js.native
        def set_max_width_chars(n_chars: Any):Unit = js.native
        def set_mnemonic_widget(widget: Any):Unit = js.native
        def set_pattern(pattern: String):Unit = js.native
        def set_selectable(setting: Boolean):Unit = js.native
        def set_single_line_mode(single_line_mode: Boolean):Unit = js.native
        def set_text(str: String):Unit = js.native
        def set_text_with_mnemonic(str: String):Unit = js.native
        def set_track_visited_links(track_links: Boolean):Unit = js.native
        def set_use_markup(setting: Boolean):Unit = js.native
        def set_use_underline(setting: Boolean):Unit = js.native
        def set_width_chars(n_chars: Any):Unit = js.native
        def set_xalign(xalign: Any):Unit = js.native
        def set_yalign(yalign: Any):Unit = js.native
    }
    @js.native
    object Label extends js.Object {
        def new_with_mnemonic(str: String):Label = js.native
    }
    @js.native
    class LabelAccessible extends WidgetAccessible {
    }
    @js.native
    class Layout extends Container {
        def this(config: js.Any) = this()
        def get_bin_window():Any = js.native
        def get_hadjustment():Any = js.native
        def get_size(width: Any, height: Any):Unit = js.native
        def get_vadjustment():Any = js.native
        def move(child_widget: Any, x: Any, y: Any):Unit = js.native
        def put(child_widget: Any, x: Any, y: Any):Unit = js.native
        def set_hadjustment(adjustment: Any):Unit = js.native
        def set_size(width: Any, height: Any):Unit = js.native
        def set_vadjustment(adjustment: Any):Unit = js.native
    }
    @js.native
    class LevelBar extends Widget {
        def this(config: js.Any) = this()
        def add_offset_value(name: String, value: Any):Unit = js.native
        def get_inverted():Boolean = js.native
        def get_max_value():Any = js.native
        def get_min_value():Any = js.native
        def get_mode():Any = js.native
        def get_offset_value(name: String, value: Any):Boolean = js.native
        def get_value():Any = js.native
        def remove_offset_value(name: String):Unit = js.native
        def set_inverted(inverted: Boolean):Unit = js.native
        def set_max_value(value: Any):Unit = js.native
        def set_min_value(value: Any):Unit = js.native
        def set_mode(mode: Any):Unit = js.native
        def set_value(value: Any):Unit = js.native
    }
    @js.native
    object LevelBar extends js.Object {
        def new_for_interval(min_value: Any, max_value: Any):LevelBar = js.native
    }
    @js.native
    class LevelBarAccessible extends WidgetAccessible {
    }
    @js.native
    class LinkButton extends Button {
        def this(config: js.Any) = this()
        def get_uri():String = js.native
        def get_visited():Boolean = js.native
        def set_uri(uri: String):Unit = js.native
        def set_visited(visited: Boolean):Unit = js.native
    }
    @js.native
    object LinkButton extends js.Object {
        def new_with_label(args:Any*):LinkButton = js.native
    }
    @js.native
    class LinkButtonAccessible extends ButtonAccessible {
    }
    @js.native
    class ListBox extends Container {
        def this(config: js.Any) = this()
        def bind_model(model: Any, create_widget_func: Any, user_data: Object, user_data_free_func: Any):Unit = js.native
        def drag_highlight_row(row: Any):Unit = js.native
        def drag_unhighlight_row():Unit = js.native
        def get_activate_on_single_click():Boolean = js.native
        def get_adjustment():Any = js.native
        def get_row_at_index(index0: Any):Any = js.native
        def get_row_at_y(y: Any):Any = js.native
        def get_selected_row():Any = js.native
        def get_selected_rows():Any = js.native
        def get_selection_mode():Any = js.native
        def insert(child: Any, position: Any):Unit = js.native
        def invalidate_filter():Unit = js.native
        def invalidate_headers():Unit = js.native
        def invalidate_sort():Unit = js.native
        def prepend(child: Any):Unit = js.native
        def select_all():Unit = js.native
        def select_row(row: Any):Unit = js.native
        def selected_foreach(func: Any, data: Object):Unit = js.native
        def set_activate_on_single_click(single: Boolean):Unit = js.native
        def set_adjustment(adjustment: Any):Unit = js.native
        def set_filter_func(filter_func: Any, user_data: Object, destroy: Any):Unit = js.native
        def set_header_func(update_header: Any, user_data: Object, destroy: Any):Unit = js.native
        def set_placeholder(placeholder: Any):Unit = js.native
        def set_selection_mode(mode: Any):Unit = js.native
        def set_sort_func(sort_func: Any, user_data: Object, destroy: Any):Unit = js.native
        def unselect_all():Unit = js.native
        def unselect_row(row: Any):Unit = js.native
    }
    @js.native
    class ListBoxAccessible extends ContainerAccessible {
    }
    @js.native
    class ListBoxRow extends Bin {
        def this(config: js.Any) = this()
        def changed():Unit = js.native
        def get_activatable():Boolean = js.native
        def get_header():Any = js.native
        def get_index():Any = js.native
        def get_selectable():Boolean = js.native
        def is_selected():Boolean = js.native
        def set_activatable(activatable: Boolean):Unit = js.native
        def set_header(header: Any):Unit = js.native
        def set_selectable(selectable: Boolean):Unit = js.native
    }
    @js.native
    class ListBoxRowAccessible extends ContainerAccessible {
    }
    @js.native
    class ListStore extends GObject.Object {
        def this(config: js.Any) = this()
        def get_value(iter:Any, index:Number):Any = js.native
        def append():Any = js.native

        def clear():Unit = js.native
        def insert(iter: Any, position: Any):Unit = js.native
        def insert_after(iter: Any, sibling: Any):Unit = js.native
        def insert_before(iter: Any, sibling: Any):Unit = js.native
        def insert_with_values(iter: Any, position: Any, rest:Any*):Unit = js.native
        def insert_with_valuesv(iter: Any, position: Any, columns: js.Array[Any], values: js.Array[Any], n_values: Any):Unit = js.native
        def iter_is_valid(iter: Any):Boolean = js.native
        def move_after(iter: Any, position: Any):Unit = js.native
        def move_before(iter: Any, position: Any):Unit = js.native
        def prepend(iter: Any):Unit = js.native
        def remove(iter: Any):Boolean = js.native
        def reorder(new_order: js.Array[Any]):Unit = js.native
        def set(iter: Any, rest:Any*):Unit = js.native
        def set_column_types(types:js.Array[Any]):Unit = js.native

        def set_valist(iter: Any, var_args: Any):Unit = js.native
        def set_value(iter: Any, column: Any, value: Any):Unit = js.native
        def set_valuesv(iter: Any, columns: js.Array[Any], values: js.Array[Any], n_values: Any):Unit = js.native
        def swap(a: Any, b: Any):Unit = js.native
    }
    @js.native
    object ListStore extends js.Object {
        def newv(args:Any*):ListStore = js.native
    }
    @js.native
    class LockButton extends Button {
        def this(config: js.Any) = this()
        def get_permission():Any = js.native
        def set_permission(permission: Any):Unit = js.native
    }
    @js.native
    class LockButtonAccessible extends ButtonAccessible {
    }
    @js.native
    class Menu extends MenuShell {
        def this(config: js.Any) = this()
        def attach(child: Any, left_attach: Any, right_attach: Any, top_attach: Any, bottom_attach: Any):Unit = js.native
        def attach_to_widget(attach_widget: Any, detacher: Any):Unit = js.native
        def detach():Unit = js.native
        def get_accel_group():Any = js.native
        def get_accel_path():String = js.native
        def get_active():Any = js.native
        def get_attach_widget():Any = js.native
        def get_monitor():Any = js.native
        def get_reserve_toggle_size():Boolean = js.native
        def get_tearoff_state():Boolean = js.native
        def get_title():String = js.native
        def popdown():Unit = js.native
        def popup(parent_menu_shell: Any, parent_menu_item: Any, func: Any, data: Object, button: Any, activate_time: Any):Unit = js.native
        def popup_for_device(device: Any, parent_menu_shell: Any, parent_menu_item: Any, func: Any, data: Object, destroy: Any, button: Any, activate_time: Any):Unit = js.native
        def reorder_child(child: Any, position: Any):Unit = js.native
        def reposition():Unit = js.native
        def set_accel_group(accel_group: Any):Unit = js.native
        def set_accel_path(accel_path: String):Unit = js.native
        def set_active(index: Any):Unit = js.native
        def set_monitor(monitor_num: Any):Unit = js.native
        def set_reserve_toggle_size(reserve_toggle_size: Boolean):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
        def set_tearoff_state(torn_off: Boolean):Unit = js.native
        def set_title(title: String):Unit = js.native
    }
    @js.native
    object Menu extends js.Object {
        def get_for_attach_widget(widget: Any):Any = js.native
        def new_from_model(model: Any):Menu = js.native
    }
    @js.native
    class MenuAccessible extends MenuShellAccessible {
    }
    @js.native
    class MenuBar extends MenuShell {
        def this(config: js.Any) = this()
        def get_child_pack_direction():Any = js.native
        def get_pack_direction():Any = js.native
        def set_child_pack_direction(child_pack_dir: Any):Unit = js.native
        def set_pack_direction(pack_dir: Any):Unit = js.native
    }
    @js.native
    object MenuBar extends js.Object {
        def new_from_model(model: Any):MenuBar = js.native
    }
    @js.native
    class MenuButton extends ToggleButton {
        def this(config: js.Any) = this()
        def get_align_widget():Any = js.native
        override def get_direction():Number = js.native

        def get_menu_model():Any = js.native
        def get_popover():Any = js.native
        def get_popup():Any = js.native
        def get_use_popover():Boolean = js.native
        def set_align_widget(align_widget: Any):Unit = js.native
        override def set_direction(dir:Number):Unit = js.native

        def set_menu_model(menu_model: Any):Unit = js.native
        def set_popover(popover: Any):Unit = js.native
        def set_popup(menu: Any):Unit = js.native
        def set_use_popover(use_popover: Boolean):Unit = js.native
    }
    @js.native
    class MenuButtonAccessible extends ToggleButtonAccessible {
    }
    @js.native
    class MenuItem extends Bin {
        def this(config: js.Any) = this()
        override def activate():Any = js.native

        def deselect():Unit = js.native
        def get_accel_path():String = js.native
        def get_label():String = js.native
        def get_reserve_indicator():Boolean = js.native
        def get_right_justified():Boolean = js.native
        def get_submenu():Any = js.native
        def get_use_underline():Boolean = js.native
        def select():Unit = js.native
        def set_accel_path(accel_path: String):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_reserve_indicator(reserve: Boolean):Unit = js.native
        def set_right_justified(right_justified: Boolean):Unit = js.native
        def set_submenu(submenu: Any):Unit = js.native
        def set_use_underline(setting: Boolean):Unit = js.native
        def toggle_size_allocate(allocation: Any):Unit = js.native
        def toggle_size_request(requisition: Any):Unit = js.native
    }
    @js.native
    object MenuItem extends js.Object {
        def new_with_label(label: String):MenuItem = js.native
        def new_with_mnemonic(label: String):MenuItem = js.native
    }
    @js.native
    class MenuItemAccessible extends ContainerAccessible {
    }
    @js.native
    class MenuShell extends Container {
        def activate_item(menu_item: Any, force_deactivate: Boolean):Unit = js.native
        def append(child: Any):Unit = js.native
        def bind_model(model: Any, action_namespace: String, with_separators: Boolean):Unit = js.native
        def cancel():Unit = js.native
        def deactivate():Unit = js.native
        def deselect():Unit = js.native
        def get_parent_shell():Any = js.native
        def get_selected_item():Any = js.native
        def get_take_focus():Boolean = js.native
        def insert(child: Any, position: Any):Unit = js.native
        def prepend(child: Any):Unit = js.native
        def select_first(search_sensitive: Boolean):Unit = js.native
        def select_item(menu_item: Any):Unit = js.native
        def set_take_focus(take_focus: Boolean):Unit = js.native
    }
    @js.native
    class MenuShellAccessible extends ContainerAccessible {
    }
    @js.native
    class MenuToolButton extends ToolButton {
        def this(config: js.Any) = this()
        def get_menu():Any = js.native
        def set_arrow_tooltip_markup(markup: String):Unit = js.native
        def set_arrow_tooltip_text(text: String):Unit = js.native
        def set_menu(menu: Any):Unit = js.native
    }
    @js.native
    object MenuToolButton extends js.Object {
        def new_from_stock(stock_id: String):MenuToolButton = js.native
    }
    @js.native
    class MessageDialog extends Dialog {
        def this(config: js.Any) = this()
        def format_secondary_markup(message_format: String, rest:Any*):Unit = js.native
        def format_secondary_text(message_format: String, rest:Any*):Unit = js.native
        def get_image():Any = js.native
        def get_message_area():Any = js.native
        def set_image(image: Any):Unit = js.native
        def set_markup(str: String):Unit = js.native
    }
    @js.native
    object MessageDialog extends js.Object {
        def new_with_markup(parent: Any, flags: Any, type0: Any, buttons: Any, message_format: String, rest:Any*):MessageDialog = js.native
    }
    @js.native
    class Misc extends Widget {
        def get_alignment(xalign: Any, yalign: Any):Unit = js.native
        def get_padding(xpad: Any, ypad: Any):Unit = js.native
        def set_alignment(xalign: Any, yalign: Any):Unit = js.native
        def set_padding(xpad: Any, ypad: Any):Unit = js.native
    }
    @js.native
    class ModelButton extends Button {
        def this(config: js.Any) = this()
    }
    @js.native
    class MountOperation extends Gio.MountOperation {
        def this(config: js.Any) = this()
        def get_parent():Any = js.native
        def get_screen():Any = js.native
        def is_showing():Boolean = js.native
        def set_parent(parent: Any):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
    }
    @js.native
    class Notebook extends Container {
        def this(config: js.Any) = this()
        def append_page(child: Any, tab_label: Any):Any = js.native
        def append_page_menu(child: Any, tab_label: Any, menu_label: Any):Any = js.native
        def detach_tab(child: Any):Unit = js.native
        def get_action_widget(pack_type0: Any):Any = js.native
        def get_current_page():Any = js.native
        def get_group_name():String = js.native
        def get_menu_label(child: Any):Any = js.native
        def get_menu_label_text(child: Any):String = js.native
        def get_n_pages():Any = js.native
        def get_nth_page(page_num: Any):Any = js.native
        def get_scrollable():Boolean = js.native
        def get_show_border():Boolean = js.native
        def get_show_tabs():Boolean = js.native
        def get_tab_detachable(child: Any):Boolean = js.native
        def get_tab_hborder():Any = js.native
        def get_tab_label(child: Any):Any = js.native
        def get_tab_label_text(child: Any):String = js.native
        def get_tab_pos():Any = js.native
        def get_tab_reorderable(child: Any):Boolean = js.native
        def get_tab_vborder():Any = js.native
        def insert_page(child: Any, tab_label: Any, position: Any):Any = js.native
        def insert_page_menu(child: Any, tab_label: Any, menu_label: Any, position: Any):Any = js.native
        def next_page():Unit = js.native
        def page_num(child: Any):Any = js.native
        def popup_disable():Unit = js.native
        def popup_enable():Unit = js.native
        def prepend_page(child: Any, tab_label: Any):Any = js.native
        def prepend_page_menu(child: Any, tab_label: Any, menu_label: Any):Any = js.native
        def prev_page():Unit = js.native
        def remove_page(page_num: Any):Unit = js.native
        def reorder_child(child: Any, position: Any):Unit = js.native
        def set_action_widget(widget: Any, pack_type0: Any):Unit = js.native
        def set_current_page(page_num: Any):Unit = js.native
        def set_group_name(group_name: String):Unit = js.native
        def set_menu_label(child: Any, menu_label: Any):Unit = js.native
        def set_menu_label_text(child: Any, menu_text: String):Unit = js.native
        def set_scrollable(scrollable: Boolean):Unit = js.native
        def set_show_border(show_border: Boolean):Unit = js.native
        def set_show_tabs(show_tabs: Boolean):Unit = js.native
        def set_tab_detachable(child: Any, detachable: Boolean):Unit = js.native
        def set_tab_label(child: Any, tab_label: Any):Unit = js.native
        def set_tab_label_text(child: Any, tab_text: String):Unit = js.native
        def set_tab_pos(pos: Any):Unit = js.native
        def set_tab_reorderable(child: Any, reorderable: Boolean):Unit = js.native
    }
    @js.native
    class NotebookAccessible extends ContainerAccessible {
    }
    @js.native
    class NotebookPageAccessible extends Atk.Object {
        def this(config: js.Any) = this()
        def invalidate():Unit = js.native
    }
    @js.native
    class NumerableIcon extends Gio.EmblemedIcon {
        def get_background_gicon():Any = js.native
        def get_background_icon_name():String = js.native
        def get_count():Any = js.native
        def get_label():String = js.native
        def get_style_context():Any = js.native
        def set_background_gicon(icon: Any):Unit = js.native
        def set_background_icon_name(icon_name: String):Unit = js.native
        def set_count(count: Any):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_style_context(style: Any):Unit = js.native
    }
    @js.native
    object NumerableIcon extends js.Object {
        def new_with_style_context(base_icon: Any, context: Any):Any = js.native
    }
    @js.native
    class OffscreenWindow extends Window {
        def this(config: js.Any) = this()
        def get_pixbuf():Any = js.native
        def get_surface():Any = js.native
    }
    @js.native
    class Overlay extends Bin {
        def this(config: js.Any) = this()
        def add_overlay(widget: Any):Unit = js.native
        def get_overlay_pass_through(widget: Any):Boolean = js.native
        def reorder_overlay(child: Any, position: Any):Unit = js.native
        def set_overlay_pass_through(widget: Any, pass_through: Boolean):Unit = js.native
    }
    @js.native
    class PageSetup extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Any = js.native
        def get_bottom_margin(unit: Any):Any = js.native
        def get_left_margin(unit: Any):Any = js.native
        def get_orientation():Any = js.native
        def get_page_height(unit: Any):Any = js.native
        def get_page_width(unit: Any):Any = js.native
        def get_paper_height(unit: Any):Any = js.native
        def get_paper_size():Any = js.native
        def get_paper_width(unit: Any):Any = js.native
        def get_right_margin(unit: Any):Any = js.native
        def get_top_margin(unit: Any):Any = js.native
        def load_file(file_name: Any):Boolean = js.native
        def load_key_file(key_file: Any, group_name: String):Boolean = js.native
        def set_bottom_margin(margin: Any, unit: Any):Unit = js.native
        def set_left_margin(margin: Any, unit: Any):Unit = js.native
        def set_orientation(orientation: Any):Unit = js.native
        def set_paper_size(size: Any):Unit = js.native
        def set_paper_size_and_default_margins(size: Any):Unit = js.native
        def set_right_margin(margin: Any, unit: Any):Unit = js.native
        def set_top_margin(margin: Any, unit: Any):Unit = js.native
        def to_file(file_name: Any):Boolean = js.native
        def to_key_file(key_file: Any, group_name: String):Unit = js.native
    }
    @js.native
    object PageSetup extends js.Object {
        def new_from_file(file_name: Any):PageSetup = js.native
        def new_from_key_file(key_file: Any, group_name: String):PageSetup = js.native
    }
    @js.native
    class Paned extends Container {
        def this(config: js.Any) = this()
        def add1(child: Any):Unit = js.native
        def add2(child: Any):Unit = js.native
        def get_child1():Any = js.native
        def get_child2():Any = js.native
        def get_handle_window():Any = js.native
        def get_position():Any = js.native
        def get_wide_handle():Boolean = js.native
        def pack1(child: Any, resize: Boolean, shrink: Boolean):Unit = js.native
        def pack2(child: Any, resize: Boolean, shrink: Boolean):Unit = js.native
        def set_position(position: Any):Unit = js.native
        def set_wide_handle(wide: Boolean):Unit = js.native
    }
    @js.native
    class PanedAccessible extends ContainerAccessible {
    }
    @js.native
    class PlacesSidebar extends ScrolledWindow {
        def this(config: js.Any) = this()
        def add_shortcut(location: Any):Unit = js.native
        def get_local_only():Boolean = js.native
        def get_location():Any = js.native
        def get_nth_bookmark(n: Any):Any = js.native
        def get_open_flags():Any = js.native
        def get_show_connect_to_server():Boolean = js.native
        def get_show_desktop():Boolean = js.native
        def get_show_enter_location():Boolean = js.native
        def get_show_other_locations():Boolean = js.native
        def get_show_recent():Boolean = js.native
        def get_show_trash():Boolean = js.native
        def list_shortcuts():Any = js.native
        def remove_shortcut(location: Any):Unit = js.native
        def set_drop_targets_visible(visible: Boolean, context: Any):Unit = js.native
        def set_local_only(local_only: Boolean):Unit = js.native
        def set_location(location: Any):Unit = js.native
        def set_open_flags(flags: Any):Unit = js.native
        def set_show_connect_to_server(show_connect_to_server: Boolean):Unit = js.native
        def set_show_desktop(show_desktop: Boolean):Unit = js.native
        def set_show_enter_location(show_enter_location: Boolean):Unit = js.native
        def set_show_other_locations(show_other_locations: Boolean):Unit = js.native
        def set_show_recent(show_recent: Boolean):Unit = js.native
        def set_show_trash(show_trash: Boolean):Unit = js.native
    }
    @js.native
    class Plug extends Window {
        def this(config: js.Any) = this()
        def construct(socket_id: Any):Unit = js.native
        def construct_for_display(display: Any, socket_id: Any):Unit = js.native
        def get_embedded():Boolean = js.native
        def get_id():Any = js.native
        def get_socket_window():Any = js.native
    }
    @js.native
    object Plug extends js.Object {
        def new_for_display(display: Any, socket_id: Any):Plug = js.native
    }
    @js.native
    class Popover extends Bin {
        def this(config: js.Any) = this()
        def bind_model(model: Any, action_namespace: String):Unit = js.native
        def get_default_widget():Any = js.native
        def get_modal():Boolean = js.native
        def get_pointing_to(rect: Any):Boolean = js.native
        def get_position():Any = js.native
        def get_relative_to():Any = js.native
        def get_transitions_enabled():Boolean = js.native
        def set_default_widget(widget: Any):Unit = js.native
        def set_modal(modal: Boolean):Unit = js.native
        def set_pointing_to(rect: Any):Unit = js.native
        def set_position(position: Any):Unit = js.native
        def set_relative_to(relative_to: Any):Unit = js.native
        def set_transitions_enabled(transitions_enabled: Boolean):Unit = js.native
    }
    @js.native
    object Popover extends js.Object {
        def new_from_model(relative_to: Any, model: Any):Popover = js.native
    }
    @js.native
    class PopoverAccessible extends ContainerAccessible {
    }
    @js.native
    class PopoverMenu extends Popover {
        def this(config: js.Any) = this()
        def open_submenu(name: String):Unit = js.native
    }
    @js.native
    class PrintContext extends GObject.Object {
        def create_pango_context():Any = js.native
        def create_pango_layout():Any = js.native
        def get_cairo_context():Any = js.native
        def get_dpi_x():Any = js.native
        def get_dpi_y():Any = js.native
        def get_hard_margins(top: Any, bottom: Any, left: Any, right: Any):Boolean = js.native
        def get_height():Any = js.native
        def get_page_setup():Any = js.native
        def get_pango_fontmap():Any = js.native
        def get_width():Any = js.native
        def set_cairo_context(cr: Any, dpi_x: Any, dpi_y: Any):Unit = js.native
    }
    @js.native
    class PrintOperation extends GObject.Object {
        def this(config: js.Any) = this()
        def cancel():Unit = js.native
        def draw_page_finish():Unit = js.native
        def get_default_page_setup():Any = js.native
        def get_embed_page_setup():Boolean = js.native
        def get_error():Unit = js.native
        def get_has_selection():Boolean = js.native
        def get_n_pages_to_print():Any = js.native
        def get_print_settings():Any = js.native
        def get_status():Any = js.native
        def get_status_string():String = js.native
        def get_support_selection():Boolean = js.native
        def is_finished():Boolean = js.native
        def run(action: Any, parent: Any):Any = js.native
        def set_allow_async(allow_async: Boolean):Unit = js.native
        def set_current_page(current_page: Any):Unit = js.native
        def set_custom_tab_label(label: String):Unit = js.native
        def set_default_page_setup(default_page_setup: Any):Unit = js.native
        def set_defer_drawing():Unit = js.native
        def set_embed_page_setup(embed: Boolean):Unit = js.native
        def set_export_filename(filename: Any):Unit = js.native
        def set_has_selection(has_selection: Boolean):Unit = js.native
        def set_job_name(job_name: String):Unit = js.native
        def set_n_pages(n_pages: Any):Unit = js.native
        def set_print_settings(print_settings: Any):Unit = js.native
        def set_show_progress(show_progress: Boolean):Unit = js.native
        def set_support_selection(support_selection: Boolean):Unit = js.native
        def set_track_print_status(track_status: Boolean):Unit = js.native
        def set_unit(unit: Any):Unit = js.native
        def set_use_full_page(full_page: Boolean):Unit = js.native
    }
    @js.native
    class PrintSettings extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Any = js.native
        def foreach(func: Any, user_data: Object):Unit = js.native
        def get(key: String):String = js.native
        def get_bool(key: String):Boolean = js.native
        def get_collate():Boolean = js.native
        def get_default_source():String = js.native
        def get_dither():String = js.native
        def get_double(key: String):Any = js.native
        def get_double_with_default(key: String, def0: Any):Any = js.native
        def get_duplex():Any = js.native
        def get_finishings():String = js.native
        def get_int(key: String):Any = js.native
        def get_int_with_default(key: String, def0: Any):Any = js.native
        def get_length(key: String, unit: Any):Any = js.native
        def get_media_type():String = js.native
        def get_n_copies():Any = js.native
        def get_number_up():Any = js.native
        def get_number_up_layout():Any = js.native
        def get_orientation():Any = js.native
        def get_output_bin():String = js.native
        def get_page_ranges(num_ranges: Any):js.Array[Any] = js.native
        def get_page_set():Any = js.native
        def get_paper_height(unit: Any):Any = js.native
        def get_paper_size():Any = js.native
        def get_paper_width(unit: Any):Any = js.native
        def get_print_pages():Any = js.native
        def get_printer():String = js.native
        def get_printer_lpi():Any = js.native
        def get_quality():Any = js.native
        def get_resolution():Any = js.native
        def get_resolution_x():Any = js.native
        def get_resolution_y():Any = js.native
        def get_reverse():Boolean = js.native
        def get_scale():Any = js.native
        def get_use_color():Boolean = js.native
        def has_key(key: String):Boolean = js.native
        def load_file(file_name: Any):Boolean = js.native
        def load_key_file(key_file: Any, group_name: String):Boolean = js.native
        def set(key: String, value: String):Unit = js.native
        def set_bool(key: String, value: Boolean):Unit = js.native
        def set_collate(collate: Boolean):Unit = js.native
        def set_default_source(default_source: String):Unit = js.native
        def set_dither(dither: String):Unit = js.native
        def set_double(key: String, value: Any):Unit = js.native
        def set_duplex(duplex: Any):Unit = js.native
        def set_finishings(finishings: String):Unit = js.native
        def set_int(key: String, value: Any):Unit = js.native
        def set_length(key: String, value: Any, unit: Any):Unit = js.native
        def set_media_type(media_type0: String):Unit = js.native
        def set_n_copies(num_copies: Any):Unit = js.native
        def set_number_up(number_up: Any):Unit = js.native
        def set_number_up_layout(number_up_layout: Any):Unit = js.native
        def set_orientation(orientation: Any):Unit = js.native
        def set_output_bin(output_bin: String):Unit = js.native
        def set_page_ranges(page_ranges: js.Array[Any], num_ranges: Any):Unit = js.native
        def set_page_set(page_set: Any):Unit = js.native
        def set_paper_height(height: Any, unit: Any):Unit = js.native
        def set_paper_size(paper_size: Any):Unit = js.native
        def set_paper_width(width: Any, unit: Any):Unit = js.native
        def set_print_pages(pages: Any):Unit = js.native
        def set_printer(printer: String):Unit = js.native
        def set_printer_lpi(lpi: Any):Unit = js.native
        def set_quality(quality: Any):Unit = js.native
        def set_resolution(resolution: Any):Unit = js.native
        def set_resolution_xy(resolution_x: Any, resolution_y: Any):Unit = js.native
        def set_reverse(reverse: Boolean):Unit = js.native
        def set_scale(scale: Any):Unit = js.native
        def set_use_color(use_color: Boolean):Unit = js.native
        def to_file(file_name: Any):Boolean = js.native
        def to_key_file(key_file: Any, group_name: String):Unit = js.native
        def unset(key: String):Unit = js.native
    }
    @js.native
    object PrintSettings extends js.Object {
        def new_from_file(file_name: Any):PrintSettings = js.native
        def new_from_key_file(key_file: Any, group_name: String):PrintSettings = js.native
    }
    @js.native
    class ProgressBar extends Widget {
        def this(config: js.Any) = this()
        def get_ellipsize():Any = js.native
        def get_fraction():Any = js.native
        def get_inverted():Boolean = js.native
        def get_pulse_step():Any = js.native
        def get_show_text():Boolean = js.native
        def get_text():String = js.native
        def pulse():Unit = js.native
        def set_ellipsize(mode: Any):Unit = js.native
        def set_fraction(fraction: Any):Unit = js.native
        def set_inverted(inverted: Boolean):Unit = js.native
        def set_pulse_step(fraction: Any):Unit = js.native
        def set_show_text(show_text: Boolean):Unit = js.native
        def set_text(text: String):Unit = js.native
    }
    @js.native
    class ProgressBarAccessible extends WidgetAccessible {
    }
    @js.native
    class RadioAction extends ToggleAction {
        def this(config: js.Any) = this()
        def get_current_value():Any = js.native
        def get_group():Any = js.native
        def join_group(group_source: Any):Unit = js.native
        def set_current_value(current_value: Any):Unit = js.native
        def set_group(group: Any):Unit = js.native
    }
    @js.native
    class RadioButton extends CheckButton {
        def this(config: js.Any) = this()
        def get_group():Any = js.native
        def join_group(group_source: Any):Unit = js.native
        def set_group(group: Any):Unit = js.native
    }
    @js.native
    object RadioButton extends js.Object {
        def new_from_widget(radio_group_member: Any):RadioButton = js.native
        def new_with_label(args:Any*):RadioButton = js.native
        def new_with_label_from_widget(radio_group_member: Any, label: String):RadioButton = js.native
        def new_with_mnemonic(args:Any*):RadioButton = js.native
        def new_with_mnemonic_from_widget(radio_group_member: Any, label: String):RadioButton = js.native
    }
    @js.native
    class RadioButtonAccessible extends ToggleButtonAccessible {
    }
    @js.native
    class RadioMenuItem extends CheckMenuItem {
        def this(config: js.Any) = this()
        def get_group():Any = js.native
        def join_group(group_source: Any):Unit = js.native
        def set_group(group: Any):Unit = js.native
    }
    @js.native
    object RadioMenuItem extends js.Object {
        def new_from_widget(group: Any):RadioMenuItem = js.native
        def new_with_label(args:Any*):RadioMenuItem = js.native
        def new_with_label_from_widget(group: Any, label: String):RadioMenuItem = js.native
        def new_with_mnemonic(args:Any*):RadioMenuItem = js.native
        def new_with_mnemonic_from_widget(group: Any, label: String):RadioMenuItem = js.native
    }
    @js.native
    class RadioMenuItemAccessible extends CheckMenuItemAccessible {
    }
    @js.native
    class RadioToolButton extends ToggleToolButton {
        def this(config: js.Any) = this()
        def get_group():Any = js.native
        def set_group(group: Any):Unit = js.native
    }
    @js.native
    object RadioToolButton extends js.Object {
        def new_from_stock(args:Any*):RadioToolButton = js.native
        def new_from_widget(group: Any):RadioToolButton = js.native
        def new_with_stock_from_widget(group: Any, stock_id: String):RadioToolButton = js.native
    }
    @js.native
    class Range extends Widget {
        def get_adjustment():Any = js.native
        def get_fill_level():Any = js.native
        def get_flippable():Boolean = js.native
        def get_inverted():Boolean = js.native
        def get_lower_stepper_sensitivity():Any = js.native
        def get_min_slider_size():Any = js.native
        def get_range_rect(range_rect: Any):Unit = js.native
        def get_restrict_to_fill_level():Boolean = js.native
        def get_round_digits():Any = js.native
        def get_show_fill_level():Boolean = js.native
        def get_slider_range(slider_start: Any, slider_end: Any):Unit = js.native
        def get_slider_size_fixed():Boolean = js.native
        def get_upper_stepper_sensitivity():Any = js.native
        def get_value():Any = js.native
        def set_adjustment(adjustment: Any):Unit = js.native
        def set_fill_level(fill_level: Any):Unit = js.native
        def set_flippable(flippable: Boolean):Unit = js.native
        def set_increments(step: Any, page: Any):Unit = js.native
        def set_inverted(setting: Boolean):Unit = js.native
        def set_lower_stepper_sensitivity(sensitivity: Any):Unit = js.native
        def set_min_slider_size(min_size: Any):Unit = js.native
        def set_range(min: Any, max: Any):Unit = js.native
        def set_restrict_to_fill_level(restrict_to_fill_level: Boolean):Unit = js.native
        def set_round_digits(round_digits: Any):Unit = js.native
        def set_show_fill_level(show_fill_level: Boolean):Unit = js.native
        def set_slider_size_fixed(size_fixed: Boolean):Unit = js.native
        def set_upper_stepper_sensitivity(sensitivity: Any):Unit = js.native
        def set_value(value: Any):Unit = js.native
    }
    @js.native
    class RangeAccessible extends WidgetAccessible {
    }
    @js.native
    class RcStyle extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Any = js.native
    }
    @js.native
    class RecentAction extends Action {
        def this(config: js.Any) = this()
        def get_show_numbers():Boolean = js.native
        def set_show_numbers(show_numbers: Boolean):Unit = js.native
    }
    @js.native
    object RecentAction extends js.Object {
        def new_for_manager(name: String, label: String, tooltip: String, stock_id: String, manager: Any):RecentAction = js.native
    }
    @js.native
    class RecentChooserDialog extends Dialog {
        def this(config: js.Any) = this()
    }
    @js.native
    object RecentChooserDialog extends js.Object {
        def new_for_manager(title: String, parent: Any, manager: Any, first_button_text: String, rest:Any*):RecentChooserDialog = js.native
    }
    @js.native
    class RecentChooserMenu extends Menu {
        def this(config: js.Any) = this()
        def get_show_numbers():Boolean = js.native
        def set_show_numbers(show_numbers: Boolean):Unit = js.native
    }
    @js.native
    object RecentChooserMenu extends js.Object {
        def new_for_manager(manager: Any):RecentChooserMenu = js.native
    }
    @js.native
    class RecentChooserWidget extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    object RecentChooserWidget extends js.Object {
        def new_for_manager(manager: Any):RecentChooserWidget = js.native
    }
    @js.native
    class RecentFilter extends GObject.InitiallyUnowned {
        def this(config: js.Any) = this()
        def add_age(days: Any):Unit = js.native
        def add_application(application: String):Unit = js.native
        def add_custom(needed: Any, func: Any, data: Object, data_destroy: Any):Unit = js.native
        def add_group(group: String):Unit = js.native
        def add_mime_type(mime_type0: String):Unit = js.native
        def add_pattern(pattern: String):Unit = js.native
        def add_pixbuf_formats():Unit = js.native
        def filter(filter_info: Any):Boolean = js.native
        def get_name():String = js.native
        def get_needed():Any = js.native
        def set_name(name: String):Unit = js.native
    }
    @js.native
    class RecentManager extends GObject.Object {
        def this(config: js.Any) = this()
        def add_full(uri: String, recent_data: Any):Boolean = js.native
        def add_item(uri: String):Boolean = js.native
        def get_items():Any = js.native
        def has_item(uri: String):Boolean = js.native
        def lookup_item(uri: String):Any = js.native
        def move_item(uri: String, new_uri: String):Boolean = js.native
        def purge_items():Any = js.native
        def remove_item(uri: String):Boolean = js.native
    }
    @js.native
    object RecentManager extends js.Object {
        def get_default():Any = js.native
    }
    @js.native
    class RendererCellAccessible extends CellAccessible {
        def this(config: js.Any) = this()
    }
    @js.native
    class Revealer extends Bin {
        def this(config: js.Any) = this()
        def get_child_revealed():Boolean = js.native
        def get_reveal_child():Boolean = js.native
        def get_transition_duration():Any = js.native
        def get_transition_type():Any = js.native
        def set_reveal_child(reveal_child: Boolean):Unit = js.native
        def set_transition_duration(duration: Any):Unit = js.native
        def set_transition_type(transition: Any):Unit = js.native
    }
    @js.native
    class Scale extends Range {
        def this(config: js.Any) = this()
        def add_mark(value: Any, position: Any, markup: String):Unit = js.native
        def clear_marks():Unit = js.native
        def get_digits():Any = js.native
        def get_draw_value():Boolean = js.native
        def get_has_origin():Boolean = js.native
        def get_layout():Any = js.native
        def get_layout_offsets(x: Any, y: Any):Unit = js.native
        def get_value_pos():Any = js.native
        def set_digits(digits: Any):Unit = js.native
        def set_draw_value(draw_value: Boolean):Unit = js.native
        def set_has_origin(has_origin: Boolean):Unit = js.native
        def set_value_pos(pos: Any):Unit = js.native
    }
    @js.native
    object Scale extends js.Object {
        def new_with_range(orientation: Any, min: Any, max: Any, step: Any):Scale = js.native
    }
    @js.native
    class ScaleAccessible extends RangeAccessible {
    }
    @js.native
    class ScaleButton extends Button {
        def this(config: js.Any) = this()
        def get_adjustment():Any = js.native
        def get_minus_button():Any = js.native
        def get_plus_button():Any = js.native
        def get_popup():Any = js.native
        def get_value():Any = js.native
        def set_adjustment(adjustment: Any):Unit = js.native
        def set_icons(icons: js.Array[String]):Unit = js.native
        def set_value(value: Any):Unit = js.native
    }
    @js.native
    class ScaleButtonAccessible extends ButtonAccessible {
    }
    @js.native
    class Scrollbar extends Range {
        def this(config: js.Any) = this()
    }
    @js.native
    class ScrolledWindow extends Bin {
        def this(config: js.Any) = this()
        def add_with_viewport(child: Any):Unit = js.native
        def get_capture_button_press():Boolean = js.native
        def get_hadjustment():Any = js.native
        def get_hscrollbar():Any = js.native
        def get_kinetic_scrolling():Boolean = js.native
        def get_min_content_height():Any = js.native
        def get_min_content_width():Any = js.native
        def get_overlay_scrolling():Boolean = js.native
        def get_placement():Any = js.native
        def get_policy(hscrollbar_policy: Any, vscrollbar_policy: Any):Unit = js.native
        def get_shadow_type():Any = js.native
        def get_vadjustment():Any = js.native
        def get_vscrollbar():Any = js.native
        def set_capture_button_press(capture_button_press: Boolean):Unit = js.native
        def set_hadjustment(hadjustment: Any):Unit = js.native
        def set_kinetic_scrolling(kinetic_scrolling: Boolean):Unit = js.native
        def set_min_content_height(height: Any):Unit = js.native
        def set_min_content_width(width: Any):Unit = js.native
        def set_overlay_scrolling(overlay_scrolling: Boolean):Unit = js.native
        def set_placement(window_placement: Any):Unit = js.native
        def set_policy(hscrollbar_policy: Any, vscrollbar_policy: Any):Unit = js.native
        def set_shadow_type(type0: Any):Unit = js.native
        def set_vadjustment(vadjustment: Any):Unit = js.native
        def unset_placement():Unit = js.native
    }
    @js.native
    class ScrolledWindowAccessible extends ContainerAccessible {
    }
    @js.native
    class SearchBar extends Bin {
        def this(config: js.Any) = this()
        def connect_entry(entry: Any):Unit = js.native
        def get_search_mode():Boolean = js.native
        def get_show_close_button():Boolean = js.native
        def handle_event(event: Any):Boolean = js.native
        def set_search_mode(search_mode: Boolean):Unit = js.native
        def set_show_close_button(visible: Boolean):Unit = js.native
    }
    @js.native
    class SearchEntry extends Entry {
        def this(config: js.Any) = this()
        def handle_event(event: Any):Boolean = js.native
    }
    @js.native
    class Separator extends Widget {
        def this(config: js.Any) = this()
    }
    @js.native
    class SeparatorMenuItem extends MenuItem {
        def this(config: js.Any) = this()
    }
    @js.native
    class SeparatorToolItem extends ToolItem {
        def this(config: js.Any) = this()
        def get_draw():Boolean = js.native
        def set_draw(draw: Boolean):Unit = js.native
    }
    @js.native
    class Settings extends GObject.Object {
        var gtk_application_prefer_dark_theme:Boolean = js.native
        var gtk_theme_name:String = js.native
        def set_double_property(name: String, v_double: Any, origin: String):Unit = js.native
        def set_long_property(name: String, v_long: Any, origin: String):Unit = js.native
        def set_property_value(name: String, svalue: Any):Unit = js.native
        def set_string_property(name: String, v_string: String, origin: String):Unit = js.native
    }
    @js.native
    object Settings extends js.Object {
        def get_default():Any = js.native
        def get_for_screen(screen: Any):Any = js.native
        def install_property(pspec: Any):Unit = js.native
        def install_property_parser(pspec: Any, parser: Any):Unit = js.native
    }
    @js.native
    class SizeGroup extends GObject.Object {
        def this(config: js.Any) = this()
        def add_widget(widget: Any):Unit = js.native
        def get_ignore_hidden():Boolean = js.native
        def get_mode():Any = js.native
        def get_widgets():Any = js.native
        def remove_widget(widget: Any):Unit = js.native
        def set_ignore_hidden(ignore_hidden: Boolean):Unit = js.native
        def set_mode(mode: Any):Unit = js.native
    }
    @js.native
    class Socket extends Container {
        def this(config: js.Any) = this()
        def add_id(window: Any):Unit = js.native
        def get_id():Any = js.native
        def get_plug_window():Any = js.native
    }
    @js.native
    class SpinButton extends Entry {
        def this(config: js.Any) = this()
        def configure(adjustment: Any, climb_rate: Any, digits: Any):Unit = js.native
        def get_adjustment():Any = js.native
        def get_digits():Any = js.native
        def get_increments(step: Any, page: Any):Unit = js.native
        def get_numeric():Boolean = js.native
        def get_range(min: Any, max: Any):Unit = js.native
        def get_snap_to_ticks():Boolean = js.native
        def get_update_policy():Any = js.native
        def get_value():Any = js.native
        def get_value_as_int():Any = js.native
        def get_wrap():Boolean = js.native
        def set_adjustment(adjustment: Any):Unit = js.native
        def set_digits(digits: Any):Unit = js.native
        def set_increments(step: Any, page: Any):Unit = js.native
        def set_numeric(numeric: Boolean):Unit = js.native
        def set_range(min: Any, max: Any):Unit = js.native
        def set_snap_to_ticks(snap_to_ticks: Boolean):Unit = js.native
        def set_update_policy(policy: Any):Unit = js.native
        def set_value(value: Any):Unit = js.native
        def set_wrap(wrap: Boolean):Unit = js.native
        def spin(direction: Any, increment: Any):Unit = js.native
        def update():Unit = js.native
    }
    @js.native
    object SpinButton extends js.Object {
        def new_with_range(min: Any, max: Any, step: Any):SpinButton = js.native
    }
    @js.native
    class SpinButtonAccessible extends EntryAccessible {
    }
    @js.native
    class Spinner extends Widget {
        def this(config: js.Any) = this()
        def start():Unit = js.native
        def stop():Unit = js.native
    }
    @js.native
    class SpinnerAccessible extends WidgetAccessible {
    }
    @js.native
    class Stack extends Container {
        def this(config: js.Any) = this()
        def add_named(child: Any, name: String):Unit = js.native
        def add_titled(child: Any, name: String, title: String):Unit = js.native
        def get_child_by_name(name: String):Any = js.native
        def get_hhomogeneous():Boolean = js.native
        def get_homogeneous():Boolean = js.native
        def get_interpolate_size():Boolean = js.native
        def get_transition_duration():Any = js.native
        def get_transition_running():Boolean = js.native
        def get_transition_type():Any = js.native
        def get_vhomogeneous():Boolean = js.native
        def get_visible_child():Any = js.native
        def get_visible_child_name():String = js.native
        def set_hhomogeneous(hhomogeneous: Boolean):Unit = js.native
        def set_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_interpolate_size(interpolate_size: Boolean):Unit = js.native
        def set_transition_duration(duration: Any):Unit = js.native
        def set_transition_type(transition: Any):Unit = js.native
        def set_vhomogeneous(vhomogeneous: Boolean):Unit = js.native
        def set_visible_child(child: Any):Unit = js.native
        def set_visible_child_full(name: String, transition: Any):Unit = js.native
        def set_visible_child_name(name: String):Unit = js.native
    }
    @js.native
    class StackSidebar extends Bin {
        def this(config: js.Any) = this()
        def get_stack():Any = js.native
        def set_stack(stack: Any):Unit = js.native
    }
    @js.native
    class StackSwitcher extends Box {
        def this(config: js.Any) = this()
        def get_stack():Any = js.native
        def set_stack(stack: Any):Unit = js.native
    }
    @js.native
    class StatusIcon extends GObject.Object {
        def this(config: js.Any) = this()
        def get_geometry(screen: Any, area: Any, orientation: Any):Boolean = js.native
        def get_gicon():Any = js.native
        def get_has_tooltip():Boolean = js.native
        def get_icon_name():String = js.native
        def get_pixbuf():Any = js.native
        def get_screen():Any = js.native
        def get_size():Any = js.native
        def get_stock():String = js.native
        def get_storage_type():Any = js.native
        def get_title():String = js.native
        def get_tooltip_markup():String = js.native
        def get_tooltip_text():String = js.native
        def get_visible():Boolean = js.native
        def get_x11_window_id():Any = js.native
        def is_embedded():Boolean = js.native
        def set_from_file(filename: Any):Unit = js.native
        def set_from_gicon(icon: Any):Unit = js.native
        def set_from_icon_name(icon_name: String):Unit = js.native
        def set_from_pixbuf(pixbuf: Any):Unit = js.native
        def set_from_stock(stock_id: String):Unit = js.native
        def set_has_tooltip(has_tooltip: Boolean):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_tooltip_markup(markup: String):Unit = js.native
        def set_tooltip_text(text: String):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
    }
    @js.native
    object StatusIcon extends js.Object {
        def position_menu(menu: Any, x: Any, y: Any, push_in: Boolean, user_data: Any):Unit = js.native
        def new_from_file(filename: Any):StatusIcon = js.native
        def new_from_gicon(icon: Any):StatusIcon = js.native
        def new_from_icon_name(icon_name: String):StatusIcon = js.native
        def new_from_pixbuf(pixbuf: Any):StatusIcon = js.native
        def new_from_stock(stock_id: String):StatusIcon = js.native
    }
    @js.native
    class Statusbar extends Box {
        def this(config: js.Any) = this()
        def get_context_id(context_description: String):Any = js.native
        def get_message_area():Any = js.native
        def pop(context_id: Any):Unit = js.native
        def push(context_id: Any, text: String):Any = js.native
        override def remove(args:Any*):Unit = js.native

        def remove_all(context_id: Any):Unit = js.native
    }
    @js.native
    class StatusbarAccessible extends ContainerAccessible {
    }
    @js.native
    class Style extends GObject.Object {
        def this(config: js.Any) = this()
        def apply_default_background(cr: Any, window: Any, state_type0: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def attach(window: Any):Any = js.native
        def copy():Any = js.native
        def detach():Unit = js.native
        def get(widget_type0: Any, first_property_name: String, rest:Any*):Unit = js.native
        def get_style_property(widget_type0: Any, property_name: String, value: Any):Unit = js.native
        override def get_valist(args:Any*):Unit = js.native

        def has_context():Boolean = js.native
        def lookup_color(color_name: String, color: Any):Boolean = js.native
        def lookup_icon_set(stock_id: String):Any = js.native
        def render_icon(source: Any, direction: Any, state: Any, size: Any, widget: Any, detail: String):Any = js.native
        def set_background(window: Any, state_type0: Any):Unit = js.native
    }
    @js.native
    class StyleContext extends GObject.Object {
        def this(config: js.Any) = this()
        def add_class(class_name: String):Unit = js.native
        def add_provider(provider: Any, priority: Any):Unit = js.native
        def add_region(region_name: String, flags: Any):Unit = js.native
        def cancel_animations(region_id: Object):Unit = js.native
        def get(state: Any, rest:Any*):Unit = js.native
        def get_background_color(state: Any, color: Any):Unit = js.native
        def get_border(state: Any, border: Any):Unit = js.native
        def get_border_color(state: Any, color: Any):Unit = js.native
        def get_color(state: Any, color: Any):Unit = js.native
        def get_direction():Any = js.native
        def get_font(state: Any):Any = js.native
        def get_frame_clock():Any = js.native
        def get_junction_sides():Any = js.native
        def get_margin(state: Any, margin: Any):Unit = js.native
        def get_padding(state: Any, padding: Any):Unit = js.native
        def get_parent():Any = js.native
        def get_path():Any = js.native
        override def get_property(args:Any*):Any = js.native

        def get_scale():Any = js.native
        def get_screen():Any = js.native
        def get_section(property: String):Any = js.native
        def get_state():Any = js.native
        def get_style(args:Any*):Unit = js.native
        def get_style_property(property_name: String, value: Any):Unit = js.native
        def get_style_valist(args: Any):Unit = js.native
        override def get_valist(args:Any*):Unit = js.native

        def has_class(class_name: String):Boolean = js.native
        def has_region(region_name: String, flags_return: Any):Boolean = js.native
        def invalidate():Unit = js.native
        def list_classes():Any = js.native
        def list_regions():Any = js.native
        def lookup_color(color_name: String, color: Any):Boolean = js.native
        def lookup_icon_set(stock_id: String):Any = js.native
        def notify_state_change(window: Any, region_id: Object, state: Any, state_value: Boolean):Unit = js.native
        def pop_animatable_region():Unit = js.native
        def push_animatable_region(region_id: Object):Unit = js.native
        def remove_class(class_name: String):Unit = js.native
        def remove_provider(provider: Any):Unit = js.native
        def remove_region(region_name: String):Unit = js.native
        def restore():Unit = js.native
        def save():Unit = js.native
        def scroll_animations(window: Any, dx: Any, dy: Any):Unit = js.native
        def set_background(window: Any):Unit = js.native
        def set_direction(direction: Any):Unit = js.native
        def set_frame_clock(frame_clock: Any):Unit = js.native
        def set_junction_sides(sides: Any):Unit = js.native
        def set_parent(parent: Any):Unit = js.native
        def set_path(path: Any):Unit = js.native
        def set_scale(scale: Any):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
        def set_state(flags: Any):Unit = js.native
        def state_is_running(state: Any, progress: Any):Boolean = js.native
    }
    @js.native
    object StyleContext extends js.Object {
        def add_provider_for_screen(screen: Any, provider: Any, priority: Any):Unit = js.native
        def remove_provider_for_screen(screen: Any, provider: Any):Unit = js.native
        def reset_widgets(screen: Any):Unit = js.native
    }
    @js.native
    class StyleProperties extends GObject.Object {
        def this(config: js.Any) = this()
        def clear():Unit = js.native
        def get(state: Any, rest:Any*):Unit = js.native
        override def get_property(args:Any*):Any = js.native

        override def get_valist(args:Any*):Unit = js.native

        def lookup_color(name: String):Any = js.native
        def map_color(name: String, color: Any):Unit = js.native
        def merge(props_to_merge: Any, replace: Boolean):Unit = js.native
        def set(state: Any, rest:Any*):Unit = js.native
        override def set_property(args:Any*):Unit = js.native

        override def set_valist(args:Any*):Unit = js.native

        def unset_property(property: String, state: Any):Unit = js.native
    }
    @js.native
    object StyleProperties extends js.Object {
        def lookup_property(property_name: String, parse_func: Any, pspec: Any):Boolean = js.native
        def register_property(parse_func: Any, pspec: Any):Unit = js.native
    }
    @js.native
    class Switch extends Widget {
        def this(config: js.Any) = this()
        def get_active():Boolean = js.native
        override def get_state():Number = js.native

        def set_active(is_active: Boolean):Unit = js.native
        override def set_state(state:Number):Unit = js.native

    }
    @js.native
    class SwitchAccessible extends WidgetAccessible {
    }
    @js.native
    class Table extends Container {
        def this(config: js.Any) = this()
        def attach(child: Any, left_attach: Any, right_attach: Any, top_attach: Any, bottom_attach: Any, xoptions: Any, yoptions: Any, xpadding: Any, ypadding: Any):Unit = js.native
        def attach_defaults(widget: Any, left_attach: Any, right_attach: Any, top_attach: Any, bottom_attach: Any):Unit = js.native
        def get_col_spacing(column: Any):Any = js.native
        def get_default_col_spacing():Any = js.native
        def get_default_row_spacing():Any = js.native
        def get_homogeneous():Boolean = js.native
        def get_row_spacing(row: Any):Any = js.native
        def get_size(rows: Any, columns: Any):Unit = js.native
        def resize(rows: Any, columns: Any):Unit = js.native
        def set_col_spacing(column: Any, spacing: Any):Unit = js.native
        def set_col_spacings(spacing: Any):Unit = js.native
        def set_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_row_spacing(row: Any, spacing: Any):Unit = js.native
        def set_row_spacings(spacing: Any):Unit = js.native
    }
    @js.native
    class TearoffMenuItem extends MenuItem {
        def this(config: js.Any) = this()
    }
    @js.native
    class TextBuffer extends GObject.Object {
        def this(config: js.Any) = this()
        def add_mark(mark: Any, where: Any):Unit = js.native
        def add_selection_clipboard(clipboard: Any):Unit = js.native
        def apply_tag(tag: Any, start: Any, end: Any):Unit = js.native
        def apply_tag_by_name(name: String, start: Any, end: Any):Unit = js.native
        def backspace(iter: Any, interactive: Boolean, default_editable: Boolean):Boolean = js.native
        def begin_user_action():Unit = js.native
        def copy_clipboard(clipboard: Any):Unit = js.native
        def create_child_anchor(iter: Any):Any = js.native
        def create_mark(mark_name: String, where: Any, left_gravity: Boolean):Any = js.native
        def create_tag(tag_name: String, first_property_name: String, rest:Any*):Any = js.native
        def cut_clipboard(clipboard: Any, default_editable: Boolean):Unit = js.native
        def delete(start: Any, end: Any):Unit = js.native
        def delete_interactive(start_iter: Any, end_iter: Any, default_editable: Boolean):Boolean = js.native
        def delete_mark(mark: Any):Unit = js.native
        def delete_mark_by_name(name: String):Unit = js.native
        def delete_selection(interactive: Boolean, default_editable: Boolean):Boolean = js.native
        def deserialize(content_buffer: Any, format: Any, iter: Any, data: js.Array[Any], length: Any):Boolean = js.native
        def deserialize_get_can_create_tags(format: Any):Boolean = js.native
        def deserialize_set_can_create_tags(format: Any, can_create_tags: Boolean):Unit = js.native
        def end_user_action():Unit = js.native
        def get_bounds(start: Any, end: Any):Unit = js.native
        def get_char_count():Any = js.native
        def get_copy_target_list():Any = js.native
        def get_deserialize_formats(n_formats: Any):js.Array[Any] = js.native
        def get_end_iter(iter: Any):Unit = js.native
        def get_has_selection():Boolean = js.native
        def get_insert():Any = js.native
        def get_iter_at_child_anchor(iter: Any, anchor: Any):Unit = js.native
        def get_iter_at_line(iter: Any, line_number: Any):Unit = js.native
        def get_iter_at_line_index(iter: Any, line_number: Any, byte_index: Any):Unit = js.native
        def get_iter_at_line_offset(iter: Any, line_number: Any, char_offset: Any):Unit = js.native
        def get_iter_at_mark(iter: Any, mark: Any):Unit = js.native
        def get_iter_at_offset(iter: Any, char_offset: Any):Unit = js.native
        def get_line_count():Any = js.native
        def get_mark(name: String):Any = js.native
        def get_modified():Boolean = js.native
        def get_paste_target_list():Any = js.native
        def get_selection_bound():Any = js.native
        def get_selection_bounds(start: Any, end: Any):Boolean = js.native
        def get_serialize_formats(n_formats: Any):js.Array[Any] = js.native
        def get_slice(start: Any, end: Any, include_hidden_chars: Boolean):String = js.native
        def get_start_iter(iter: Any):Unit = js.native
        def get_tag_table():Any = js.native
        def get_text(start: Any, end: Any, include_hidden_chars: Boolean):String = js.native
        def insert(iter: Any, text: String, len: Any):Unit = js.native
        def insert_at_cursor(text: String, len: Any):Unit = js.native
        def insert_child_anchor(iter: Any, anchor: Any):Unit = js.native
        def insert_interactive(iter: Any, text: String, len: Any, default_editable: Boolean):Boolean = js.native
        def insert_interactive_at_cursor(text: String, len: Any, default_editable: Boolean):Boolean = js.native
        def insert_markup(iter: Any, markup: String, len: Any):Unit = js.native
        def insert_pixbuf(iter: Any, pixbuf: Any):Unit = js.native
        def insert_range(iter: Any, start: Any, end: Any):Unit = js.native
        def insert_range_interactive(iter: Any, start: Any, end: Any, default_editable: Boolean):Boolean = js.native
        def insert_with_tags(iter: Any, text: String, len: Any, first_tag: Any, rest:Any*):Unit = js.native
        def insert_with_tags_by_name(iter: Any, text: String, len: Any, first_tag_name: String, rest:Any*):Unit = js.native
        def move_mark(mark: Any, where: Any):Unit = js.native
        def move_mark_by_name(name: String, where: Any):Unit = js.native
        def paste_clipboard(clipboard: Any, override_location: Any, default_editable: Boolean):Unit = js.native
        def place_cursor(where: Any):Unit = js.native
        def register_deserialize_format(mime_type0: String, function0: Any, user_data: Object, user_data_destroy: Any):Any = js.native
        def register_deserialize_tagset(tagset_name: String):Any = js.native
        def register_serialize_format(mime_type0: String, function0: Any, user_data: Object, user_data_destroy: Any):Any = js.native
        def register_serialize_tagset(tagset_name: String):Any = js.native
        def remove_all_tags(start: Any, end: Any):Unit = js.native
        def remove_selection_clipboard(clipboard: Any):Unit = js.native
        def remove_tag(tag: Any, start: Any, end: Any):Unit = js.native
        def remove_tag_by_name(name: String, start: Any, end: Any):Unit = js.native
        def select_range(ins: Any, bound: Any):Unit = js.native
        def serialize(content_buffer: Any, format: Any, start: Any, end: Any, length: Any):js.Array[Any] = js.native
        def set_modified(setting: Boolean):Unit = js.native
        def set_text(text: String, len: Any):Unit = js.native
        def unregister_deserialize_format(format: Any):Unit = js.native
        def unregister_serialize_format(format: Any):Unit = js.native
    }
    @js.native
    class TextCellAccessible extends RendererCellAccessible {
    }
    @js.native
    class TextChildAnchor extends GObject.Object {
        def this(config: js.Any) = this()
        def get_deleted():Boolean = js.native
        def get_widgets():Any = js.native
    }
    @js.native
    class TextMark extends GObject.Object {
        def this(config: js.Any) = this()
        def get_buffer():Any = js.native
        def get_deleted():Boolean = js.native
        def get_left_gravity():Boolean = js.native
        def get_name():String = js.native
        def get_visible():Boolean = js.native
        def set_visible(setting: Boolean):Unit = js.native
    }
    @js.native
    class TextTag extends GObject.Object {
        def this(config: js.Any) = this()
        def event(event_object0: Any, event: Any, iter: Any):Boolean = js.native
        def get_priority():Any = js.native
        def set_priority(priority: Any):Unit = js.native
    }
    @js.native
    class TextTagTable extends GObject.Object {
        def this(config: js.Any) = this()
        def add(tag: Any):Boolean = js.native
        def foreach(func: Any, data: Object):Unit = js.native
        def get_size():Any = js.native
        def lookup(name: String):Any = js.native
        def remove(tag: Any):Unit = js.native
    }
    @js.native
    class TextView extends Container {
        def this(config: js.Any) = this()
        def add_child_at_anchor(child: Any, anchor: Any):Unit = js.native
        def add_child_in_window(child: Any, which_window: Any, xpos: Any, ypos: Any):Unit = js.native
        def backward_display_line(iter: Any):Boolean = js.native
        def backward_display_line_start(iter: Any):Boolean = js.native
        def buffer_to_window_coords(win: Any, buffer_x: Any, buffer_y: Any, window_x: Any, window_y: Any):Unit = js.native
        def forward_display_line(iter: Any):Boolean = js.native
        def forward_display_line_end(iter: Any):Boolean = js.native
        def get_accepts_tab():Boolean = js.native
        def get_border_window_size(type0: Any):Any = js.native
        def get_bottom_margin():Any = js.native
        def get_buffer():Any = js.native
        def get_cursor_locations(iter: Any, strong: Any, weak: Any):Unit = js.native
        def get_cursor_visible():Boolean = js.native
        def get_default_attributes():Any = js.native
        def get_editable():Boolean = js.native
        def get_hadjustment():Any = js.native
        def get_indent():Any = js.native
        def get_input_hints():Any = js.native
        def get_input_purpose():Any = js.native
        def get_iter_at_location(iter: Any, x: Any, y: Any):Unit = js.native
        def get_iter_at_position(iter: Any, trailing: Any, x: Any, y: Any):Unit = js.native
        def get_iter_location(iter: Any, location: Any):Unit = js.native
        def get_justification():Any = js.native
        def get_left_margin():Any = js.native
        def get_line_at_y(target_iter: Any, y: Any, line_top: Any):Unit = js.native
        def get_line_yrange(iter: Any, y: Any, height: Any):Unit = js.native
        def get_monospace():Boolean = js.native
        def get_overwrite():Boolean = js.native
        def get_pixels_above_lines():Any = js.native
        def get_pixels_below_lines():Any = js.native
        def get_pixels_inside_wrap():Any = js.native
        def get_right_margin():Any = js.native
        def get_tabs():Any = js.native
        def get_top_margin():Any = js.native
        def get_vadjustment():Any = js.native
        def get_visible_rect(visible_rect: Any):Unit = js.native
        override def get_window(win:Number):Gdk.Window = js.native

        def get_window_type(window: Any):Any = js.native
        def get_wrap_mode():Any = js.native
        def im_context_filter_keypress(event: Any):Boolean = js.native
        def move_child(child: Any, xpos: Any, ypos: Any):Unit = js.native
        def move_mark_onscreen(mark: Any):Boolean = js.native
        def move_visually(iter: Any, count: Any):Boolean = js.native
        def place_cursor_onscreen():Boolean = js.native
        def reset_im_context():Unit = js.native
        def scroll_mark_onscreen(mark: Any):Unit = js.native
        def scroll_to_iter(iter: Any, within_margin: Any, use_align: Boolean, xalign: Any, yalign: Any):Boolean = js.native
        def scroll_to_mark(mark: Any, within_margin: Any, use_align: Boolean, xalign: Any, yalign: Any):Unit = js.native
        def set_accepts_tab(accepts_tab: Boolean):Unit = js.native
        def set_border_window_size(type0: Any, size: Any):Unit = js.native
        def set_bottom_margin(bottom_margin: Any):Unit = js.native
        def set_buffer(buffer: Any):Unit = js.native
        def set_cursor_visible(setting: Boolean):Unit = js.native
        def set_editable(setting: Boolean):Unit = js.native
        def set_indent(indent: Any):Unit = js.native
        def set_input_hints(hints: Any):Unit = js.native
        def set_input_purpose(purpose: Any):Unit = js.native
        def set_justification(justification: Any):Unit = js.native
        def set_left_margin(left_margin: Any):Unit = js.native
        def set_monospace(monospace: Boolean):Unit = js.native
        def set_overwrite(overwrite: Boolean):Unit = js.native
        def set_pixels_above_lines(pixels_above_lines: Any):Unit = js.native
        def set_pixels_below_lines(pixels_below_lines: Any):Unit = js.native
        def set_pixels_inside_wrap(pixels_inside_wrap: Any):Unit = js.native
        def set_right_margin(right_margin: Any):Unit = js.native
        def set_tabs(tabs: Any):Unit = js.native
        def set_top_margin(top_margin: Any):Unit = js.native
        def set_wrap_mode(wrap_mode: Any):Unit = js.native
        def starts_display_line(iter: Any):Boolean = js.native
        def window_to_buffer_coords(win: Any, window_x: Any, window_y: Any, buffer_x: Any, buffer_y: Any):Unit = js.native
    }
    @js.native
    object TextView extends js.Object {
        def new_with_buffer(buffer: Any):TextView = js.native
    }
    @js.native
    class TextViewAccessible extends ContainerAccessible {
    }
    @js.native
    class ThemingEngine extends GObject.Object {
        def get(state: Any, rest:Any*):Unit = js.native
        def get_background_color(state: Any, color: Any):Unit = js.native
        def get_border(state: Any, border: Any):Unit = js.native
        def get_border_color(state: Any, color: Any):Unit = js.native
        def get_color(state: Any, color: Any):Unit = js.native
        def get_direction():Any = js.native
        def get_font(state: Any):Any = js.native
        def get_junction_sides():Any = js.native
        def get_margin(state: Any, margin: Any):Unit = js.native
        def get_padding(state: Any, padding: Any):Unit = js.native
        def get_path():Any = js.native
        override def get_property(args:Any*):Any = js.native

        def get_screen():Any = js.native
        def get_state():Any = js.native
        def get_style(args:Any*):Unit = js.native
        def get_style_property(property_name: String, value: Any):Unit = js.native
        def get_style_valist(args: Any):Unit = js.native
        override def get_valist(args:Any*):Unit = js.native

        def has_class(style_class: String):Boolean = js.native
        def has_region(style_region: String, flags: Any):Boolean = js.native
        def lookup_color(color_name: String, color: Any):Boolean = js.native
        def state_is_running(state: Any, progress: Any):Boolean = js.native
    }
    @js.native
    object ThemingEngine extends js.Object {
        def load(name: String):Any = js.native
        def register_property(name_space: String, parse_func: Any, pspec: Any):Unit = js.native
    }
    @js.native
    class ToggleAction extends Action {
        def this(config: js.Any) = this()
        def get_active():Boolean = js.native
        def get_draw_as_radio():Boolean = js.native
        def set_active(is_active: Boolean):Unit = js.native
        def set_draw_as_radio(draw_as_radio: Boolean):Unit = js.native
        def toggled():Unit = js.native
    }
    @js.native
    class ToggleButton extends Button {
        def this(config: js.Any) = this()
        def get_active():Boolean = js.native
        def get_inconsistent():Boolean = js.native
        def get_mode():Boolean = js.native
        def set_active(is_active: Boolean):Unit = js.native
        def set_inconsistent(setting: Boolean):Unit = js.native
        def set_mode(draw_indicator: Boolean):Unit = js.native
        def toggled():Unit = js.native
    }
    @js.native
    object ToggleButton extends js.Object {
        def new_with_label(label: String):ToggleButton = js.native
        def new_with_mnemonic(label: String):ToggleButton = js.native
    }
    @js.native
    class ToggleButtonAccessible extends ButtonAccessible {
    }
    @js.native
    class ToggleToolButton extends ToolButton {
        def this(config: js.Any) = this()
        def get_active():Boolean = js.native
        def set_active(is_active: Boolean):Unit = js.native
    }
    @js.native
    object ToggleToolButton extends js.Object {
        def new_from_stock(args:Any*):ToggleToolButton = js.native
    }
    @js.native
    class ToolButton extends ToolItem {
        def this(config: js.Any) = this()
        def get_icon_name():String = js.native
        def get_icon_widget():Any = js.native
        def get_label():String = js.native
        def get_label_widget():Any = js.native
        def get_stock_id():String = js.native
        def get_use_underline():Boolean = js.native
        def set_icon_name(icon_name: String):Unit = js.native
        def set_icon_widget(icon_widget: Any):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_label_widget(label_widget: Any):Unit = js.native
        def set_stock_id(stock_id: String):Unit = js.native
        def set_use_underline(use_underline: Boolean):Unit = js.native
    }
    @js.native
    object ToolButton extends js.Object {
        def new_from_stock(stock_id: String):ToolButton = js.native
    }
    @js.native
    class ToolItem extends Bin {
        def this(config: js.Any) = this()
        def get_ellipsize_mode():Any = js.native
        def get_expand():Boolean = js.native
        def get_homogeneous():Boolean = js.native
        def get_icon_size():Any = js.native
        def get_is_important():Boolean = js.native
        def get_orientation():Any = js.native
        def get_proxy_menu_item(menu_item_id: String):Any = js.native
        def get_relief_style():Any = js.native
        def get_text_alignment():Any = js.native
        def get_text_orientation():Any = js.native
        def get_text_size_group():Any = js.native
        def get_toolbar_style():Any = js.native
        def get_use_drag_window():Boolean = js.native
        def get_visible_horizontal():Boolean = js.native
        def get_visible_vertical():Boolean = js.native
        def rebuild_menu():Unit = js.native
        def retrieve_proxy_menu_item():Any = js.native
        def set_expand(expand: Boolean):Unit = js.native
        def set_homogeneous(homogeneous: Boolean):Unit = js.native
        def set_is_important(is_important: Boolean):Unit = js.native
        def set_proxy_menu_item(menu_item_id: String, menu_item: Any):Unit = js.native
        override def set_tooltip_markup(markup: String):Unit = js.native
        override def set_tooltip_text(text: String):Unit = js.native
        def set_use_drag_window(use_drag_window: Boolean):Unit = js.native
        def set_visible_horizontal(visible_horizontal: Boolean):Unit = js.native
        def set_visible_vertical(visible_vertical: Boolean):Unit = js.native
        def toolbar_reconfigured():Unit = js.native
    }
    @js.native
    class ToolItemGroup extends Container {
        def this(config: js.Any) = this()
        def get_collapsed():Boolean = js.native
        def get_drop_item(x: Any, y: Any):Any = js.native
        def get_ellipsize():Any = js.native
        def get_header_relief():Any = js.native
        def get_item_position(item: Any):Any = js.native
        def get_label():String = js.native
        def get_label_widget():Any = js.native
        def get_n_items():Any = js.native
        def get_nth_item(index: Any):Any = js.native
        def insert(item: Any, position: Any):Unit = js.native
        def set_collapsed(collapsed: Boolean):Unit = js.native
        def set_ellipsize(ellipsize: Any):Unit = js.native
        def set_header_relief(style: Any):Unit = js.native
        def set_item_position(item: Any, position: Any):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_label_widget(label_widget: Any):Unit = js.native
    }
    @js.native
    class ToolPalette extends Container {
        def this(config: js.Any) = this()
        def add_drag_dest(widget: Any, flags: Any, targets: Any, actions: Any):Unit = js.native
        def get_drag_item(selection: Any):Any = js.native
        def get_drop_group(x: Any, y: Any):Any = js.native
        def get_drop_item(x: Any, y: Any):Any = js.native
        def get_exclusive(group: Any):Boolean = js.native
        def get_expand(group: Any):Boolean = js.native
        def get_group_position(group: Any):Any = js.native
        def get_hadjustment():Any = js.native
        def get_icon_size():Any = js.native
        override def get_style():Number = js.native

        def get_vadjustment():Any = js.native
        def set_drag_source(targets: Any):Unit = js.native
        def set_exclusive(group: Any, exclusive: Boolean):Unit = js.native
        def set_expand(group: Any, expand: Boolean):Unit = js.native
        def set_group_position(group: Any, position: Any):Unit = js.native
        def set_icon_size(icon_size: Any):Unit = js.native
        override def set_style(style:Number):Unit = js.native

        def unset_icon_size():Unit = js.native
        def unset_style():Unit = js.native
    }
    @js.native
    object ToolPalette extends js.Object {
        def get_drag_target_group():Any = js.native
        def get_drag_target_item():Any = js.native
    }
    @js.native
    class Toolbar extends Container {
        def this(config: js.Any) = this()
        def get_drop_index(x: Any, y: Any):Any = js.native
        def get_icon_size():Any = js.native
        def get_item_index(item: Any):Any = js.native
        def get_n_items():Any = js.native
        def get_nth_item(n: Any):Any = js.native
        def get_relief_style():Any = js.native
        def get_show_arrow():Boolean = js.native
        override def get_style():Number = js.native

        def insert(item: Any, pos: Any):Unit = js.native
        def set_drop_highlight_item(tool_item: Any, index0: Any):Unit = js.native
        def set_icon_size(icon_size: Any):Unit = js.native
        def set_show_arrow(show_arrow: Boolean):Unit = js.native
        override def set_style(style:Number):Unit = js.native

        def unset_icon_size():Unit = js.native
        def unset_style():Unit = js.native
    }
    @js.native
    class Tooltip extends GObject.Object {
        def set_custom(custom_widget: Any):Unit = js.native
        def set_icon(pixbuf: Any):Unit = js.native
        def set_icon_from_gicon(gicon: Any, size: Any):Unit = js.native
        def set_icon_from_icon_name(icon_name: String, size: Any):Unit = js.native
        def set_icon_from_stock(stock_id: String, size: Any):Unit = js.native
        def set_markup(markup: String):Unit = js.native
        def set_text(text: String):Unit = js.native
        def set_tip_area(rect: Any):Unit = js.native
    }
    @js.native
    object Tooltip extends js.Object {
        def trigger_tooltip_query(display: Any):Unit = js.native
    }
    @js.native
    class ToplevelAccessible extends Atk.Object {
        def get_children():Any = js.native
    }
    @js.native
    class TreeModelFilter extends GObject.Object {
        def clear_cache():Unit = js.native
        def convert_child_iter_to_iter(filter_iter: Any, child_iter: Any):Boolean = js.native
        def convert_child_path_to_path(child_path: Any):Any = js.native
        def convert_iter_to_child_iter(child_iter: Any, filter_iter: Any):Unit = js.native
        def convert_path_to_child_path(filter_path: Any):Any = js.native
        def get_model():Any = js.native
        def refilter():Unit = js.native
        def set_modify_func(n_columns: Any, types: js.Array[Any], func: Any, data: Object, destroy: Any):Unit = js.native
        def set_visible_column(column: Any):Unit = js.native
        def set_visible_func(func: Any, data: Object, destroy: Any):Unit = js.native
    }
    @js.native
    class TreeModelSort extends GObject.Object {
        def clear_cache():Unit = js.native
        def convert_child_iter_to_iter(sort_iter: Any, child_iter: Any):Boolean = js.native
        def convert_child_path_to_path(child_path: Any):Any = js.native
        def convert_iter_to_child_iter(child_iter: Any, sorted_iter: Any):Unit = js.native
        def convert_path_to_child_path(sorted_path: Any):Any = js.native
        def get_model():Any = js.native
        def iter_is_valid(iter: Any):Boolean = js.native
        def reset_default_sort_func():Unit = js.native
    }
    @js.native
    class TreeSelection extends GObject.Object {
        def count_selected_rows():Any = js.native
        def get_mode():Any = js.native
        def get_select_function():Any = js.native
        def get_selected():Any = js.native

        def get_selected_rows(model: Any):Any = js.native
        def get_tree_view():Any = js.native
        def get_user_data():Object = js.native
        def iter_is_selected(iter: Any):Boolean = js.native
        def path_is_selected(path: Any):Boolean = js.native
        def select_all():Unit = js.native
        def select_iter(iter: Any):Unit = js.native
        def select_path(path: Any):Unit = js.native
        def select_range(start_path: Any, end_path: Any):Unit = js.native
        def selected_foreach(func: Any, data: Object):Unit = js.native
        def set_mode(type0: Any):Unit = js.native
        def set_select_function(func: Any, data: Object, destroy: Any):Unit = js.native
        def unselect_all():Unit = js.native
        def unselect_iter(iter: Any):Unit = js.native
        def unselect_path(path: Any):Unit = js.native
        def unselect_range(start_path: Any, end_path: Any):Unit = js.native
    }
    @js.native
    class TreeStore extends GObject.Object {
        def this(config: js.Any) = this()
        def append(iter: Any, parent: Any):Unit = js.native
        def clear():Unit = js.native
        def insert(iter: Any, parent: Any, position: Any):Unit = js.native
        def insert_after(iter: Any, parent: Any, sibling: Any):Unit = js.native
        def insert_before(iter: Any, parent: Any, sibling: Any):Unit = js.native
        def insert_with_values(iter: Any, parent: Any, position: Any, rest:Any*):Unit = js.native
        def insert_with_valuesv(iter: Any, parent: Any, position: Any, columns: js.Array[Any], values: js.Array[Any], n_values: Any):Unit = js.native
        def is_ancestor(iter: Any, descendant: Any):Boolean = js.native
        def iter_depth(iter: Any):Any = js.native
        def iter_is_valid(iter: Any):Boolean = js.native
        def move_after(iter: Any, position: Any):Unit = js.native
        def move_before(iter: Any, position: Any):Unit = js.native
        def prepend(iter: Any, parent: Any):Unit = js.native
        def remove(iter: Any):Boolean = js.native
        def reorder(parent: Any, new_order: js.Array[Any]):Unit = js.native
        def set(iter: Any, rest:Any*):Unit = js.native
        def set_column_types(n_columns: Any, types: js.Array[Any]):Unit = js.native
        def set_valist(iter: Any, var_args: Any):Unit = js.native
        def set_value(iter: Any, column: Any, value: Any):Unit = js.native
        def set_valuesv(iter: Any, columns: js.Array[Any], values: js.Array[Any], n_values: Any):Unit = js.native
        def swap(a: Any, b: Any):Unit = js.native
    }
    @js.native
    object TreeStore extends js.Object {
        def newv(args:Any*):TreeStore = js.native
    }
    @js.native
    class TreeView extends Container {
        def this(config: js.Any) = this()
        def append_column(column: Any):Any = js.native
        def collapse_all():Unit = js.native
        def collapse_row(path: Any):Boolean = js.native
        def columns_autosize():Unit = js.native
        def convert_bin_window_to_tree_coords(bx: Any, by: Any, tx: Any, ty: Any):Unit = js.native
        def convert_bin_window_to_widget_coords(bx: Any, by: Any, wx: Any, wy: Any):Unit = js.native
        def convert_tree_to_bin_window_coords(tx: Any, ty: Any, bx: Any, by: Any):Unit = js.native
        def convert_tree_to_widget_coords(tx: Any, ty: Any, wx: Any, wy: Any):Unit = js.native
        def convert_widget_to_bin_window_coords(wx: Any, wy: Any, bx: Any, by: Any):Unit = js.native
        def convert_widget_to_tree_coords(wx: Any, wy: Any, tx: Any, ty: Any):Unit = js.native
        def create_row_drag_icon(path: Any):Any = js.native
        def enable_model_drag_dest(targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def enable_model_drag_source(start_button_mask: Any, targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def expand_all():Unit = js.native
        def expand_row(path: Any, open_all: Boolean):Boolean = js.native
        def expand_to_path(path: Any):Unit = js.native
        def get_activate_on_single_click():Boolean = js.native
        def get_background_area(path: Any, column: Any, rect: Any):Unit = js.native
        def get_bin_window():Any = js.native
        def get_cell_area(path: Any, column: Any, rect: Any):Unit = js.native
        def get_column(n: Any):Any = js.native
        def get_columns():Any = js.native
        def get_cursor(path: Any, focus_column: Any):Unit = js.native
        def get_dest_row_at_pos(drag_x: Any, drag_y: Any, path: Any, pos: Any):Boolean = js.native
        def get_drag_dest_row(path: Any, pos: Any):Unit = js.native
        def get_enable_search():Boolean = js.native
        def get_enable_tree_lines():Boolean = js.native
        def get_expander_column():Any = js.native
        def get_fixed_height_mode():Boolean = js.native
        def get_grid_lines():Any = js.native
        def get_hadjustment():Any = js.native
        def get_headers_clickable():Boolean = js.native
        def get_headers_visible():Boolean = js.native
        def get_hover_expand():Boolean = js.native
        def get_hover_selection():Boolean = js.native
        def get_level_indentation():Any = js.native
        def get_model():Any = js.native
        def get_n_columns():Any = js.native
        def get_path_at_pos(x: Any, y: Any, path: Any, column: Any, cell_x: Any, cell_y: Any):Boolean = js.native
        def get_reorderable():Boolean = js.native
        def get_row_separator_func():Any = js.native
        def get_rubber_banding():Boolean = js.native
        def get_rules_hint():Boolean = js.native
        def get_search_column():Any = js.native
        def get_search_entry():Any = js.native
        def get_search_equal_func():Any = js.native
        def get_search_position_func():Any = js.native
        def get_selection():Any = js.native
        def get_show_expanders():Boolean = js.native
        def get_tooltip_column():Any = js.native
        def get_tooltip_context(x: Any, y: Any, keyboard_tip: Boolean, model: Any, path: Any, iter: Any):Boolean = js.native
        def get_vadjustment():Any = js.native
        def get_visible_range(start_path: Any, end_path: Any):Boolean = js.native
        def get_visible_rect(visible_rect: Any):Unit = js.native
        def insert_column(column: Any, position: Any):Any = js.native
        def insert_column_with_attributes(position: Any, title: String, cell: Any, rest:Any*):Any = js.native
        def insert_column_with_data_func(position: Any, title: String, cell: Any, func: Any, data: Object, dnotify: Any):Any = js.native
        def is_blank_at_pos(x: Any, y: Any, path: Any, column: Any, cell_x: Any, cell_y: Any):Boolean = js.native
        def is_rubber_banding_active():Boolean = js.native
        def map_expanded_rows(func: Any, data: Object):Unit = js.native
        def move_column_after(column: Any, base_column: Any):Unit = js.native
        def remove_column(column: Any):Any = js.native
        def row_activated(path: Any, column: Any):Unit = js.native
        def row_expanded(path: Any):Boolean = js.native
        def scroll_to_cell(path: Any, column: Any, use_align: Boolean, row_align: Any, col_align: Any):Unit = js.native
        def scroll_to_point(tree_x: Any, tree_y: Any):Unit = js.native
        def set_activate_on_single_click(single: Boolean):Unit = js.native
        def set_column_drag_function(func: Any, user_data: Object, destroy: Any):Unit = js.native
        def set_cursor(path: Any, focus_column: Any, start_editing: Boolean):Unit = js.native
        def set_cursor_on_cell(path: Any, focus_column: Any, focus_cell: Any, start_editing: Boolean):Unit = js.native
        def set_destroy_count_func(func: Any, data: Object, destroy: Any):Unit = js.native
        def set_drag_dest_row(path: Any, pos: Any):Unit = js.native
        def set_enable_search(enable_search: Boolean):Unit = js.native
        def set_enable_tree_lines(enabled: Boolean):Unit = js.native
        def set_expander_column(column: Any):Unit = js.native
        def set_fixed_height_mode(enable: Boolean):Unit = js.native
        def set_grid_lines(grid_lines: Any):Unit = js.native
        def set_hadjustment(adjustment: Any):Unit = js.native
        def set_headers_clickable(setting: Boolean):Unit = js.native
        def set_headers_visible(headers_visible: Boolean):Unit = js.native
        def set_hover_expand(expand: Boolean):Unit = js.native
        def set_hover_selection(hover: Boolean):Unit = js.native
        def set_level_indentation(indentation: Any):Unit = js.native
        def set_model(model: Any):Unit = js.native
        def set_reorderable(reorderable: Boolean):Unit = js.native
        def set_row_separator_func(func: Any, data: Object, destroy: Any):Unit = js.native
        def set_rubber_banding(enable: Boolean):Unit = js.native
        def set_rules_hint(setting: Boolean):Unit = js.native
        def set_search_column(column: Any):Unit = js.native
        def set_search_entry(entry: Any):Unit = js.native
        def set_search_equal_func(search_equal_func: Any, search_user_data: Object, search_destroy: Any):Unit = js.native
        def set_search_position_func(func: Any, data: Object, destroy: Any):Unit = js.native
        def set_show_expanders(enabled: Boolean):Unit = js.native
        def set_tooltip_cell(tooltip: Any, path: Any, column: Any, cell: Any):Unit = js.native
        def set_tooltip_column(column: Any):Unit = js.native
        def set_tooltip_row(tooltip: Any, path: Any):Unit = js.native
        def set_vadjustment(adjustment: Any):Unit = js.native
        def unset_rows_drag_dest():Unit = js.native
        def unset_rows_drag_source():Unit = js.native
    }
    @js.native
    object TreeView extends js.Object {
        def new_with_model(model: Any):TreeView = js.native
    }
    @js.native
    class TreeViewAccessible extends ContainerAccessible {
    }
    @js.native
    class TreeViewColumn extends GObject.InitiallyUnowned {
        def this(config: js.Any) = this()
        def add_attribute(cell_renderer: Any, attribute: String, column: Any):Unit = js.native
        def cell_get_position(cell_renderer: Any, x_offset: Any, width: Any):Boolean = js.native
        def cell_get_size(cell_area: Any, x_offset: Any, y_offset: Any, width: Any, height: Any):Unit = js.native
        def cell_is_visible():Boolean = js.native
        def cell_set_cell_data(tree_model: Any, iter: Any, is_expander: Boolean, is_expanded: Boolean):Unit = js.native
        def clear():Unit = js.native
        def clear_attributes(cell_renderer: Any):Unit = js.native
        def clicked():Unit = js.native
        def focus_cell(cell: Any):Unit = js.native
        def get_alignment():Any = js.native
        def get_button():Any = js.native
        def get_clickable():Boolean = js.native
        def get_expand():Boolean = js.native
        def get_fixed_width():Any = js.native
        def get_max_width():Any = js.native
        def get_min_width():Any = js.native
        def get_reorderable():Boolean = js.native
        def get_resizable():Boolean = js.native
        def get_sizing():Any = js.native
        def get_sort_column_id():Any = js.native
        def get_sort_indicator():Boolean = js.native
        def get_sort_order():Any = js.native
        def get_spacing():Any = js.native
        def get_title():String = js.native
        def get_tree_view():Any = js.native
        def get_visible():Boolean = js.native
        def get_widget():Any = js.native
        def get_width():Any = js.native
        def get_x_offset():Any = js.native
        def pack_end(cell: Any, expand: Boolean):Unit = js.native
        def pack_start(cell: Any, expand: Boolean):Unit = js.native
        def queue_resize():Unit = js.native
        def set_alignment(xalign: Any):Unit = js.native
        def set_attributes(cell_renderer: Any, rest:Any*):Unit = js.native
        def set_cell_data_func(cell_renderer: Any, func: Any, func_data: Object, destroy: Any):Unit = js.native
        def set_clickable(clickable: Boolean):Unit = js.native
        def set_expand(expand: Boolean):Unit = js.native
        def set_fixed_width(fixed_width: Any):Unit = js.native
        def set_max_width(max_width: Any):Unit = js.native
        def set_min_width(min_width: Any):Unit = js.native
        def set_reorderable(reorderable: Boolean):Unit = js.native
        def set_resizable(resizable: Boolean):Unit = js.native
        def set_sizing(type0: Any):Unit = js.native
        def set_sort_column_id(sort_column_id: Any):Unit = js.native
        def set_sort_indicator(setting: Boolean):Unit = js.native
        def set_sort_order(order: Any):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
        def set_widget(widget: Any):Unit = js.native
    }
    @js.native
    object TreeViewColumn extends js.Object {
        def new_with_area(area: Any):TreeViewColumn = js.native
        def new_with_attributes(title: String, cell: Any, rest:Any*):TreeViewColumn = js.native
    }
    @js.native
    class UIManager extends GObject.Object {
        def this(config: js.Any) = this()
        def add_ui(merge_id: Any, path: String, name: String, action: String, type0: Any, top: Boolean):Unit = js.native
        def add_ui_from_file(filename: Any):Any = js.native
        def add_ui_from_resource(resource_path: String):Any = js.native
        def add_ui_from_string(buffer: String, length: Any):Any = js.native
        def ensure_update():Unit = js.native
        def get_accel_group():Any = js.native
        def get_action(path: String):Any = js.native
        def get_action_groups():Any = js.native
        def get_add_tearoffs():Boolean = js.native
        def get_toplevels(types: Any):Any = js.native
        def get_ui():String = js.native
        def get_widget(path: String):Any = js.native
        def insert_action_group(action_group: Any, pos: Any):Unit = js.native
        def new_merge_id():Any = js.native
        def remove_action_group(action_group: Any):Unit = js.native
        def remove_ui(merge_id: Any):Unit = js.native
        def set_add_tearoffs(add_tearoffs: Boolean):Unit = js.native
    }
    @js.native
    class VBox extends Box {
        def this(config: js.Any) = this()
    }
    @js.native
    class VButtonBox extends ButtonBox {
        def this(config: js.Any) = this()
    }
    @js.native
    class VPaned extends Paned {
        def this(config: js.Any) = this()
    }
    @js.native
    class VScale extends Scale {
        def this(config: js.Any) = this()
    }
    @js.native
    object VScale extends js.Object {
        def new_with_range(min: Any, max: Any, step: Any):VScale = js.native
    }
    @js.native
    class VScrollbar extends Scrollbar {
        def this(config: js.Any) = this()
    }
    @js.native
    class VSeparator extends Separator {
        def this(config: js.Any) = this()
    }
    @js.native
    class Viewport extends Bin {
        def this(config: js.Any) = this()
        def get_bin_window():Any = js.native
        def get_hadjustment():Any = js.native
        def get_shadow_type():Any = js.native
        def get_vadjustment():Any = js.native
        def get_view_window():Any = js.native
        def set_hadjustment(adjustment: Any):Unit = js.native
        def set_shadow_type(type0: Any):Unit = js.native
        def set_vadjustment(adjustment: Any):Unit = js.native
    }
    @js.native
    class VolumeButton extends ScaleButton {
        def this(config: js.Any) = this()
    }
    @js.native
    class Widget extends GObject.InitiallyUnowned {
        def this(config: js.Any) = this()
        def activate():Any = js.native

        def add_accelerator(accel_signal: String, accel_group: Any, accel_key: Any, accel_mods: Any, accel_flags: Any):Unit = js.native
        def add_device_events(device: Any, events: Any):Unit = js.native
        def add_events(events: Any):Unit = js.native
        def add_mnemonic_label(label: Any):Unit = js.native
        def add_tick_callback(callback: Any, user_data: Object, notify: Any):Any = js.native
        def can_activate_accel(signal_id: Any):Boolean = js.native
        def child_focus(direction: Any):Boolean = js.native
        def child_notify(args:Any*):Unit = js.native

        def class_path(path_length: Any, path: String, path_reversed: String):Unit = js.native
        def compute_expand(orientation: Any):Boolean = js.native
        def create_pango_context():Any = js.native
        def create_pango_layout(text: String):Any = js.native
        def destroy():Unit = js.native
        def destroyed(widget_pointer: Any):Unit = js.native
        def device_is_shadowed(device: Any):Boolean = js.native
        def drag_begin(targets: Any, actions: Any, button: Any, event: Any):Any = js.native
        def drag_begin_with_coordinates(targets: Any, actions: Any, button: Any, event: Any, x: Any, y: Any):Any = js.native
        def drag_check_threshold(start_x: Any, start_y: Any, current_x: Any, current_y: Any):Boolean = js.native
        def drag_dest_add_image_targets():Unit = js.native
        def drag_dest_add_text_targets():Unit = js.native
        def drag_dest_add_uri_targets():Unit = js.native
        def drag_dest_find_target(context: Any, target_list: Any):Any = js.native
        def drag_dest_get_target_list():Any = js.native
        def drag_dest_get_track_motion():Boolean = js.native
        def drag_dest_set(flags: Any, targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def drag_dest_set_proxy(proxy_window: Any, protocol: Any, use_coordinates: Boolean):Unit = js.native
        def drag_dest_set_target_list(target_list: Any):Unit = js.native
        def drag_dest_set_track_motion(track_motion: Boolean):Unit = js.native
        def drag_dest_unset():Unit = js.native
        def drag_get_data(context: Any, target: Any, time0: Any):Unit = js.native
        def drag_highlight():Unit = js.native
        def drag_source_add_image_targets():Unit = js.native
        def drag_source_add_text_targets():Unit = js.native
        def drag_source_add_uri_targets():Unit = js.native
        def drag_source_get_target_list():Any = js.native
        def drag_source_set(start_button_mask: Any, targets: js.Array[Any], n_targets: Any, actions: Any):Unit = js.native
        def drag_source_set_icon_gicon(icon: Any):Unit = js.native
        def drag_source_set_icon_name(icon_name: String):Unit = js.native
        def drag_source_set_icon_pixbuf(pixbuf: Any):Unit = js.native
        def drag_source_set_icon_stock(stock_id: String):Unit = js.native
        def drag_source_set_target_list(target_list: Any):Unit = js.native
        def drag_source_unset():Unit = js.native
        def drag_unhighlight():Unit = js.native
        def draw(cr: Any):Unit = js.native
        def ensure_style():Unit = js.native
        def error_bell():Unit = js.native
        def event(event: Any):Boolean = js.native
        def freeze_child_notify():Unit = js.native
        def get_accessible():Any = js.native
        def get_action_group(prefix: String):Any = js.native
        def get_allocated_baseline():Any = js.native
        def get_allocated_height():Any = js.native
        def get_allocated_width():Any = js.native
        def get_allocation(allocation: Any):Unit = js.native
        def get_ancestor(widget_type0: Any):Any = js.native
        def get_app_paintable():Boolean = js.native
        def get_can_default():Boolean = js.native
        def get_can_focus():Boolean = js.native
        def get_child_requisition(requisition: Any):Unit = js.native
        def get_child_visible():Boolean = js.native
        def get_clip(clip: Any):Unit = js.native
        def get_clipboard(selection: Any):Any = js.native
        def get_composite_name():String = js.native
        def get_device_enabled(device: Any):Boolean = js.native
        def get_device_events(device: Any):Any = js.native
        def get_direction():Number = js.native

        def get_display():Any = js.native
        def get_double_buffered():Boolean = js.native
        def get_events():Any = js.native
        def get_font_map():Any = js.native
        def get_font_options():Any = js.native
        def get_frame_clock():Any = js.native
        def get_halign():Any = js.native
        def get_has_tooltip():Boolean = js.native
        def get_has_window():Boolean = js.native
        def get_hexpand():Boolean = js.native
        def get_hexpand_set():Boolean = js.native
        def get_mapped():Boolean = js.native
        def get_margin_bottom():Any = js.native
        def get_margin_end():Any = js.native
        def get_margin_left():Any = js.native
        def get_margin_right():Any = js.native
        def get_margin_start():Any = js.native
        def get_margin_top():Any = js.native
        def get_modifier_mask(intent: Any):Any = js.native
        def get_modifier_style():Any = js.native
        def get_name():String = js.native
        def get_no_show_all():Boolean = js.native
        def get_opacity():Any = js.native
        def get_pango_context():Any = js.native
        def get_parent():Any = js.native
        def get_parent_window():Any = js.native
        def get_path():Any = js.native
        def get_pointer(x: Any, y: Any):Unit = js.native
        def get_preferred_height(minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_height_and_baseline_for_width(width: Any, minimum_height: Any, natural_height: Any, minimum_baseline: Any, natural_baseline: Any):Unit = js.native
        def get_preferred_height_for_width(width: Any, minimum_height: Any, natural_height: Any):Unit = js.native
        def get_preferred_size(minimum_size: Any, natural_size: Any):Unit = js.native
        def get_preferred_width(minimum_width: Any, natural_width: Any):Unit = js.native
        def get_preferred_width_for_height(height: Any, minimum_width: Any, natural_width: Any):Unit = js.native
        def get_realized():Boolean = js.native
        def get_receives_default():Boolean = js.native
        def get_request_mode():Any = js.native
        def get_requisition(requisition: Any):Unit = js.native
        def get_root_window():Any = js.native
        def get_scale_factor():Any = js.native
        def get_screen():Any = js.native
        def get_sensitive():Boolean = js.native
        def get_settings():Any = js.native

        def get_size_request(width: Any, height: Any):Unit = js.native
        def get_state():Number = js.native

        def get_state_flags():Any = js.native
        def get_style():Number = js.native

        def get_style_context():Any = js.native
        def get_support_multidevice():Boolean = js.native
        def get_template_child(widget_type0: Any, name: String):Any = js.native
        def get_tooltip_markup():String = js.native
        def get_tooltip_text():String = js.native
        def get_tooltip_window():Any = js.native
        def get_toplevel():Any = js.native
        def get_valign():Any = js.native
        def get_valign_with_baseline():Any = js.native
        def get_vexpand():Boolean = js.native
        def get_vexpand_set():Boolean = js.native
        def get_visible():Boolean = js.native
        def get_visual():Any = js.native
        def get_window(win:Number):Gdk.Window = js.native

        def grab_add():Unit = js.native
        def grab_default():Unit = js.native
        def grab_focus():Unit = js.native
        def grab_remove():Unit = js.native
        def has_default():Boolean = js.native
        def has_focus():Boolean = js.native
        def has_grab():Boolean = js.native
        def has_rc_style():Boolean = js.native
        def has_screen():Boolean = js.native
        def has_visible_focus():Boolean = js.native
        def hide():Unit = js.native
        def hide_on_delete():Boolean = js.native
        def in_destruction():Boolean = js.native
        def init_template():Unit = js.native
        def input_shape_combine_region(region: Any):Unit = js.native
        def insert_action_group(name: String, group: Any):Unit = js.native
        def intersect(area: Any, intersection: Any):Boolean = js.native
        def is_ancestor(ancestor: Any):Boolean = js.native
        def is_composited():Boolean = js.native
        def is_drawable():Boolean = js.native
        def is_focus():Boolean = js.native
        def is_sensitive():Boolean = js.native
        def is_toplevel():Boolean = js.native
        def is_visible():Boolean = js.native
        def keynav_failed(direction: Any):Boolean = js.native
        def list_accel_closures():Any = js.native
        def list_action_prefixes():js.Array[String] = js.native
        def list_mnemonic_labels():Any = js.native
        def map():Unit = js.native
        def mnemonic_activate(group_cycling: Boolean):Boolean = js.native
        def modify_base(state: Any, color: Any):Unit = js.native
        def modify_bg(state: Any, color: Any):Unit = js.native
        def modify_cursor(primary: Any, secondary: Any):Unit = js.native
        def modify_fg(state: Any, color: Any):Unit = js.native
        def modify_font(font_desc: Any):Unit = js.native
        def modify_style(style: Any):Unit = js.native
        def modify_text(state: Any, color: Any):Unit = js.native
        def override_background_color(state: Any, color: Any):Unit = js.native
        def override_color(state: Any, color: Any):Unit = js.native
        def override_cursor(cursor: Any, secondary_cursor: Any):Unit = js.native
        def override_font(font_desc: Any):Unit = js.native
        def override_symbolic_color(name: String, color: Any):Unit = js.native
        def path(path_length: Any, path: String, path_reversed: String):Unit = js.native
        def queue_compute_expand():Unit = js.native
        def queue_draw():Unit = js.native
        def queue_draw_area(x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def queue_draw_region(region: Any):Unit = js.native
        def queue_resize():Unit = js.native
        def queue_resize_no_redraw():Unit = js.native
        def realize():Unit = js.native
        def region_intersect(region: Any):Any = js.native
        def register_window(window: Any):Unit = js.native
        def remove_accelerator(accel_group: Any, accel_key: Any, accel_mods: Any):Boolean = js.native
        def remove_mnemonic_label(label: Any):Unit = js.native
        def remove_tick_callback(id: Any):Unit = js.native
        def render_icon(stock_id: String, size: Any, detail: String):Any = js.native
        def render_icon_pixbuf(stock_id: String, size: Any):Any = js.native
        def reparent(new_parent: Any):Unit = js.native
        def reset_rc_styles():Unit = js.native
        def reset_style():Unit = js.native
        def send_expose(event: Any):Any = js.native
        def send_focus_change(event: Any):Boolean = js.native
        def set_accel_path(accel_path: String, accel_group: Any):Unit = js.native
        def set_allocation(allocation: Any):Unit = js.native
        def set_app_paintable(app_paintable: Boolean):Unit = js.native
        def set_can_default(can_default: Boolean):Unit = js.native
        def set_can_focus(can_focus: Boolean):Unit = js.native
        def set_child_visible(is_visible: Boolean):Unit = js.native
        def set_clip(clip: Any):Unit = js.native
        def set_composite_name(name: String):Unit = js.native
        def set_device_enabled(device: Any, enabled: Boolean):Unit = js.native
        def set_device_events(device: Any, events: Any):Unit = js.native
        def set_direction(dir:Number):Unit = js.native

        def set_double_buffered(double_buffered: Boolean):Unit = js.native
        def set_events(events: Any):Unit = js.native
        def set_font_map(font_map: Any):Unit = js.native
        def set_font_options(options: Any):Unit = js.native
        def set_halign(align: Any):Unit = js.native
        def set_has_tooltip(has_tooltip: Boolean):Unit = js.native
        def set_has_window(has_window: Boolean):Unit = js.native
        def set_hexpand(expand: Boolean):Unit = js.native
        def set_hexpand_set(set: Boolean):Unit = js.native
        def set_mapped(mapped: Boolean):Unit = js.native
        def set_margin_bottom(margin: Any):Unit = js.native
        def set_margin_end(margin: Any):Unit = js.native
        def set_margin_left(margin: Any):Unit = js.native
        def set_margin_right(margin: Any):Unit = js.native
        def set_margin_start(margin: Any):Unit = js.native
        def set_margin_top(margin: Any):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_no_show_all(no_show_all: Boolean):Unit = js.native
        def set_opacity(opacity: Any):Unit = js.native
        def set_parent(parent: Any):Unit = js.native
        def set_parent_window(parent_window: Any):Unit = js.native
        def set_realized(realized: Boolean):Unit = js.native
        def set_receives_default(receives_default: Boolean):Unit = js.native
        def set_redraw_on_allocate(redraw_on_allocate: Boolean):Unit = js.native
        def set_sensitive(sensitive: Boolean):Unit = js.native
        def set_size_request(width: Any, height: Any):Unit = js.native
        def set_state(state:Number):Unit = js.native

        def set_state_flags(flags: Any, clear: Boolean):Unit = js.native
        def set_style(style:Number):Unit = js.native

        def set_support_multidevice(support_multidevice: Boolean):Unit = js.native
        def set_tooltip_markup(markup: String):Unit = js.native
        def set_tooltip_text(text: String):Unit = js.native
        def set_tooltip_window(custom_window: Any):Unit = js.native
        def set_valign(align: Any):Unit = js.native
        def set_vexpand(expand: Boolean):Unit = js.native
        def set_vexpand_set(set: Boolean):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
        def set_visual(visual: Any):Unit = js.native
        def set_window(window: Any):Unit = js.native
        def shape_combine_region(region: Any):Unit = js.native
        def show():Unit = js.native
        def show_all():Unit = js.native
        def show_now():Unit = js.native
        def size_allocate(allocation: Any):Unit = js.native
        def size_allocate_with_baseline(allocation: Any, baseline: Any):Unit = js.native
        def size_request(requisition: Any):Unit = js.native
        def style_attach():Unit = js.native
        def style_get(first_property_name: String, rest:Any*):Unit = js.native
        def style_get_property(property_name: String, value: Any):Unit = js.native
        def style_get_valist(first_property_name: String, var_args: Any):Unit = js.native
        def thaw_child_notify():Unit = js.native
        def translate_coordinates(dest_widget: Any, src_x: Any, src_y: Any, dest_x: Any, dest_y: Any):Boolean = js.native
        def trigger_tooltip_query():Unit = js.native
        def unmap():Unit = js.native
        def unparent():Unit = js.native
        def unrealize():Unit = js.native
        def unregister_window(window: Any):Unit = js.native
        def unset_state_flags(flags: Any):Unit = js.native
    }
    @js.native
    object Widget extends js.Object {
        def get_default_direction():Any = js.native
        def get_default_style():Any = js.native
        def pop_composite_child():Unit = js.native
        def push_composite_child():Unit = js.native
        def set_default_direction(dir: Any):Unit = js.native
    }
    @js.native
    class WidgetAccessible extends Accessible {
    }
    @js.native
    class Window extends Bin {
        def this(config: js.Any) = this()
        def activate_default():Boolean = js.native
        def activate_focus():Boolean = js.native
        def activate_key(event: Any):Boolean = js.native
        def add_accel_group(accel_group: Any):Unit = js.native
        def add_mnemonic(keyval0: Any, target: Any):Unit = js.native
        def begin_move_drag(button: Any, root_x: Any, root_y: Any, timestamp: Any):Unit = js.native
        def begin_resize_drag(edge: Any, button: Any, root_x: Any, root_y: Any, timestamp: Any):Unit = js.native
        def close():Unit = js.native
        def deiconify():Unit = js.native
        def fullscreen():Unit = js.native
        def fullscreen_on_monitor(screen: Any, monitor: Any):Unit = js.native
        def get_accept_focus():Boolean = js.native
        def get_application():Any = js.native
        def get_attached_to():Any = js.native
        def get_decorated():Boolean = js.native
        def get_default_size(width: Any, height: Any):Unit = js.native
        def get_default_widget():Any = js.native
        def get_deletable():Boolean = js.native
        def get_destroy_with_parent():Boolean = js.native
        def get_focus():Any = js.native
        def get_focus_on_map():Boolean = js.native
        def get_focus_visible():Boolean = js.native
        def get_gravity():Any = js.native
        def get_group():Any = js.native
        def get_has_resize_grip():Boolean = js.native
        def get_hide_titlebar_when_maximized():Boolean = js.native
        def get_icon():Any = js.native
        def get_icon_list():Any = js.native
        def get_icon_name():String = js.native
        def get_mnemonic_modifier():Any = js.native
        def get_mnemonics_visible():Boolean = js.native
        def get_modal():Boolean = js.native
        override def get_opacity():Any = js.native
        def get_position(root_x: Any, root_y: Any):Unit = js.native
        def get_resizable():Boolean = js.native
        def get_resize_grip_area(rect: Any):Boolean = js.native
        def get_role():String = js.native
        override def get_screen():Any = js.native
        def get_size(width: Any, height: Any):Unit = js.native
        def get_skip_pager_hint():Boolean = js.native
        def get_skip_taskbar_hint():Boolean = js.native
        def get_title():String = js.native
        def get_titlebar():Any = js.native
        def get_transient_for():Any = js.native
        def get_type_hint():Any = js.native
        def get_urgency_hint():Boolean = js.native
        def get_window_type():Any = js.native
        def has_group():Boolean = js.native
        def has_toplevel_focus():Boolean = js.native
        def iconify():Unit = js.native
        def is_active():Boolean = js.native
        def is_maximized():Boolean = js.native
        def maximize():Unit = js.native
        def mnemonic_activate(args:Any*):Boolean = js.native

        def move(x: Any, y: Any):Unit = js.native
        def parse_geometry(geometry: String):Boolean = js.native
        def present():Unit = js.native
        def present_with_time(timestamp: Any):Unit = js.native
        def propagate_key_event(event: Any):Boolean = js.native
        def remove_accel_group(accel_group: Any):Unit = js.native
        def remove_mnemonic(keyval0: Any, target: Any):Unit = js.native
        def reshow_with_initial_size():Unit = js.native
        def resize(width: Any, height: Any):Unit = js.native
        def resize_grip_is_visible():Boolean = js.native
        def resize_to_geometry(width: Any, height: Any):Unit = js.native
        def set_accept_focus(setting: Boolean):Unit = js.native
        def set_application(application: Any):Unit = js.native
        def set_attached_to(attach_widget: Any):Unit = js.native
        def set_decorated(setting: Boolean):Unit = js.native
        def set_default(default_widget: Any):Unit = js.native
        def set_default_geometry(width: Any, height: Any):Unit = js.native
        def set_default_size(width: Any, height: Any):Unit = js.native
        def set_deletable(setting: Boolean):Unit = js.native
        def set_destroy_with_parent(setting: Boolean):Unit = js.native
        def set_focus(focus: Any):Unit = js.native
        def set_focus_on_map(setting: Boolean):Unit = js.native
        def set_focus_visible(setting: Boolean):Unit = js.native
        def set_geometry_hints(geometry_widget: Any, geometry: Any, geom_mask: Any):Unit = js.native
        def set_gravity(gravity: Any):Unit = js.native
        def set_has_resize_grip(value: Boolean):Unit = js.native
        def set_has_user_ref_count(setting: Boolean):Unit = js.native
        def set_hide_titlebar_when_maximized(setting: Boolean):Unit = js.native
        def set_icon(icon: Any):Unit = js.native
        def set_icon_from_file(filename: Any):Boolean = js.native
        def set_icon_list(list: Any):Unit = js.native
        def set_icon_name(name: String):Unit = js.native
        def set_keep_above(setting: Boolean):Unit = js.native
        def set_keep_below(setting: Boolean):Unit = js.native
        def set_mnemonic_modifier(modifier: Any):Unit = js.native
        def set_mnemonics_visible(setting: Boolean):Unit = js.native
        def set_modal(modal: Boolean):Unit = js.native
        override def set_opacity(opacity: Any):Unit = js.native
        def set_position(position: Any):Unit = js.native
        def set_resizable(resizable: Boolean):Unit = js.native
        def set_role(role: String):Unit = js.native
        def set_screen(screen: Any):Unit = js.native
        def set_skip_pager_hint(setting: Boolean):Unit = js.native
        def set_skip_taskbar_hint(setting: Boolean):Unit = js.native
        def set_startup_id(startup_id: String):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_titlebar(titlebar: Any):Unit = js.native
        def set_transient_for(parent: Any):Unit = js.native
        def set_type_hint(hint: Any):Unit = js.native
        def set_urgency_hint(setting: Boolean):Unit = js.native
        def set_wmclass(wmclass_name: String, wmclass_class: String):Unit = js.native
        def stick():Unit = js.native
        def unfullscreen():Unit = js.native
        def unmaximize():Unit = js.native
        def unstick():Unit = js.native
    }
    @js.native
    object Window extends js.Object {
        def get_default_icon_list():Any = js.native
        def get_default_icon_name():String = js.native
        def list_toplevels():Any = js.native
        def set_auto_startup_notification(setting: Boolean):Unit = js.native
        def set_default_icon(icon: Any):Unit = js.native
        def set_default_icon_from_file(filename: Any):Boolean = js.native
        def set_default_icon_list(list: Any):Unit = js.native
        def set_default_icon_name(name: String):Unit = js.native
        def set_interactive_debugging(enable: Boolean):Unit = js.native
    }
    @js.native
    class WindowAccessible extends ContainerAccessible {
    }
    @js.native
    class WindowGroup extends GObject.Object {
        def this(config: js.Any) = this()
        def add_window(window: Any):Unit = js.native
        def get_current_device_grab(device: Any):Any = js.native
        def get_current_grab():Any = js.native
        def list_windows():Any = js.native
        def remove_window(window: Any):Unit = js.native
    }
}