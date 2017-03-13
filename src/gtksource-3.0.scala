/**
 * GtkSource.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.GtkSource")
@js.native
object GtkSource extends js.Object {
    def completion_error_quark():Any = js.native
    def encoding_get_all():Any = js.native
    def encoding_get_current():Any = js.native
    def encoding_get_default_candidates():Any = js.native
    def encoding_get_from_charset(charset: String):Any = js.native
    def encoding_get_utf8():Any = js.native
    def file_loader_error_quark():Any = js.native
    def file_saver_error_quark():Any = js.native
    def utils_escape_search_text(text: String):String = js.native
    def utils_unescape_search_text(text: String):String = js.native
    @js.native
    object BackgroundPatternType extends js.Object {
        val NONE:js.Dynamic = js.native
        val GRID:js.Dynamic = js.native
    }
    @js.native
    object BracketMatchType extends js.Object {
        val NONE:js.Dynamic = js.native
        val OUT_OF_RANGE:js.Dynamic = js.native
        val NOT_FOUND:js.Dynamic = js.native
        val FOUND:js.Dynamic = js.native
    }
    @js.native
    object ChangeCaseType extends js.Object {
        val LOWER:js.Dynamic = js.native
        val UPPER:js.Dynamic = js.native
        val TOGGLE:js.Dynamic = js.native
        val TITLE:js.Dynamic = js.native
    }
    @js.native
    object CompletionError extends js.Object {
        val ALREADY_BOUND:js.Dynamic = js.native
        val NOT_BOUND:js.Dynamic = js.native
    }
    @js.native
    object CompressionType extends js.Object {
        val NONE:js.Dynamic = js.native
        val GZIP:js.Dynamic = js.native
    }
    @js.native
    object FileLoaderError extends js.Object {
        val TOO_BIG:js.Dynamic = js.native
        val ENCODING_AUTO_DETECTION_FAILED:js.Dynamic = js.native
        val CONVERSION_FALLBACK:js.Dynamic = js.native
    }
    @js.native
    object FileSaverError extends js.Object {
        val INVALID_CHARS:js.Dynamic = js.native
        val EXTERNALLY_MODIFIED:js.Dynamic = js.native
    }
    @js.native
    object GutterRendererAlignmentMode extends js.Object {
        val CELL:js.Dynamic = js.native
        val FIRST:js.Dynamic = js.native
        val LAST:js.Dynamic = js.native
    }
    @js.native
    object NewlineType extends js.Object {
        val LF:js.Dynamic = js.native
        val CR:js.Dynamic = js.native
        val CR_LF:js.Dynamic = js.native
    }
    @js.native
    object SmartHomeEndType extends js.Object {
        val DISABLED:js.Dynamic = js.native
        val BEFORE:js.Dynamic = js.native
        val AFTER:js.Dynamic = js.native
        val ALWAYS:js.Dynamic = js.native
    }
    @js.native
    object ViewGutterPosition extends js.Object {
        val LINES:js.Dynamic = js.native
        val MARKS:js.Dynamic = js.native
    }
    @js.native
    object CompletionActivation extends js.Object {
        val NONE:js.Dynamic = js.native
        val INTERACTIVE:js.Dynamic = js.native
        val USER_REQUESTED:js.Dynamic = js.native
    }
    @js.native
    object DrawSpacesFlags extends js.Object {
        val SPACE:js.Dynamic = js.native
        val TAB:js.Dynamic = js.native
        val NEWLINE:js.Dynamic = js.native
        val NBSP:js.Dynamic = js.native
        val LEADING:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val TRAILING:js.Dynamic = js.native
        val ALL:js.Dynamic = js.native
    }
    @js.native
    object FileSaverFlags extends js.Object {
        val NONE:js.Dynamic = js.native
        val IGNORE_INVALID_CHARS:js.Dynamic = js.native
        val IGNORE_MODIFICATION_TIME:js.Dynamic = js.native
        val CREATE_BACKUP:js.Dynamic = js.native
    }
    @js.native
    object GutterRendererState extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val CURSOR:js.Dynamic = js.native
        val PRELIT:js.Dynamic = js.native
        val SELECTED:js.Dynamic = js.native
    }
    @js.native
    object SortFlags extends js.Object {
        val NONE:js.Dynamic = js.native
        val CASE_SENSITIVE:js.Dynamic = js.native
        val REVERSE_ORDER:js.Dynamic = js.native
        val REMOVE_DUPLICATES:js.Dynamic = js.native
    }
    @js.native
    class Buffer extends Gtk.TextBuffer {
        def this(config: js.Any) = this()
        def backward_iter_to_source_mark(iter: Any, category: String):Boolean = js.native
        def begin_not_undoable_action():Unit = js.native
        def can_redo():Boolean = js.native
        def can_undo():Boolean = js.native
        def change_case(case_type0: Any, start: Any, end: Any):Unit = js.native
        def create_source_mark(name: String, category: String, where: Any):Any = js.native
        def end_not_undoable_action():Unit = js.native
        def ensure_highlight(start: Any, end: Any):Unit = js.native
        def forward_iter_to_source_mark(iter: Any, category: String):Boolean = js.native
        def get_context_classes_at_iter(iter: Any):js.Array[String] = js.native
        def get_highlight_matching_brackets():Boolean = js.native
        def get_highlight_syntax():Boolean = js.native
        def get_implicit_trailing_newline():Boolean = js.native
        def get_language():Any = js.native
        def get_max_undo_levels():Any = js.native
        def get_source_marks_at_iter(iter: Any, category: String):Any = js.native
        def get_source_marks_at_line(line: Any, category: String):Any = js.native
        def get_style_scheme():Any = js.native
        def get_undo_manager():Any = js.native
        def iter_backward_to_context_class_toggle(iter: Any, context_class: String):Boolean = js.native
        def iter_forward_to_context_class_toggle(iter: Any, context_class: String):Boolean = js.native
        def iter_has_context_class(iter: Any, context_class: String):Boolean = js.native
        def join_lines(start: Any, end: Any):Unit = js.native
        def redo():Unit = js.native
        def remove_source_marks(start: Any, end: Any, category: String):Unit = js.native
        def set_highlight_matching_brackets(highlight: Boolean):Unit = js.native
        def set_highlight_syntax(highlight: Boolean):Unit = js.native
        def set_implicit_trailing_newline(implicit_trailing_newline: Boolean):Unit = js.native
        def set_language(language: Any):Unit = js.native
        def set_max_undo_levels(max_undo_levels: Any):Unit = js.native
        def set_style_scheme(scheme: Any):Unit = js.native
        def set_undo_manager(manager: Any):Unit = js.native
        def sort_lines(start: Any, end: Any, flags: Any, column: Any):Unit = js.native
        def undo():Unit = js.native
    }
    @js.native
    object Buffer extends js.Object {
        def new_with_language(language: Any):Buffer = js.native
    }
    @js.native
    class Completion extends GObject.Object {
        def add_provider(provider: Any):Boolean = js.native
        def block_interactive():Unit = js.native
        def create_context(position: Any):Any = js.native
        def get_info_window():Any = js.native
        def get_providers():Any = js.native
        def get_view():Any = js.native
        def hide():Unit = js.native
        def move_window(iter: Any):Unit = js.native
        def remove_provider(provider: Any):Boolean = js.native
        def show(providers: Any, context: Any):Boolean = js.native
        def unblock_interactive():Unit = js.native
    }
    @js.native
    class CompletionContext extends GObject.InitiallyUnowned {
        def add_proposals(provider: Any, proposals: Any, finished: Boolean):Unit = js.native
        def get_activation():Any = js.native
        def get_iter(iter: Any):Boolean = js.native
    }
    @js.native
    class CompletionInfo extends Gtk.Window {
        def this(config: js.Any) = this()
        def get_widget():Any = js.native
        def move_to_iter(view: Any, iter: Any):Unit = js.native
        def set_widget(widget: Any):Unit = js.native
    }
    @js.native
    class CompletionItem extends GObject.Object {
        def this(config: js.Any) = this()
    }
    @js.native
    object CompletionItem extends js.Object {
        def new_from_stock(label: String, text: String, stock: String, info: String):CompletionItem = js.native
        def new_with_markup(markup: String, text: String, icon: Any, info: String):CompletionItem = js.native
    }
    @js.native
    class CompletionWords extends GObject.Object {
        def this(config: js.Any) = this()
        def register(buffer: Any):Unit = js.native
        def unregister(buffer: Any):Unit = js.native
    }
    @js.native
    class File extends GObject.Object {
        def this(config: js.Any) = this()
        def check_file_on_disk():Unit = js.native
        def get_compression_type():Any = js.native
        def get_encoding():Any = js.native
        def get_location():Any = js.native
        def get_newline_type():Any = js.native
        def is_deleted():Boolean = js.native
        def is_externally_modified():Boolean = js.native
        def is_local():Boolean = js.native
        def is_readonly():Boolean = js.native
        def set_location(location: Any):Unit = js.native
        def set_mount_operation_factory(callback: Any, user_data: Object, notify: Any):Unit = js.native
    }
    @js.native
    class FileLoader extends GObject.Object {
        def this(config: js.Any) = this()
        def get_buffer():Any = js.native
        def get_compression_type():Any = js.native
        def get_encoding():Any = js.native
        def get_file():Any = js.native
        def get_input_stream():Any = js.native
        def get_location():Any = js.native
        def get_newline_type():Any = js.native
        def load_async(io_priority: Any, cancellable: Any, progress_callback: Any, progress_callback_data: Object, progress_callback_notify: Any, callback: Any, user_data: Object):Unit = js.native
        def load_finish(result: Any):Boolean = js.native
        def set_candidate_encodings(candidate_encodings: Any):Unit = js.native
    }
    @js.native
    object FileLoader extends js.Object {
        def new_from_stream(buffer: Any, file: Any, stream: Any):FileLoader = js.native
    }
    @js.native
    class FileSaver extends GObject.Object {
        def this(config: js.Any) = this()
        def get_buffer():Any = js.native
        def get_compression_type():Any = js.native
        def get_encoding():Any = js.native
        def get_file():Any = js.native
        def get_flags():Any = js.native
        def get_location():Any = js.native
        def get_newline_type():Any = js.native
        def save_async(io_priority: Any, cancellable: Any, progress_callback: Any, progress_callback_data: Object, progress_callback_notify: Any, callback: Any, user_data: Object):Unit = js.native
        def save_finish(result: Any):Boolean = js.native
        def set_compression_type(compression_type0: Any):Unit = js.native
        def set_encoding(encoding: Any):Unit = js.native
        def set_flags(flags: Any):Unit = js.native
        def set_newline_type(newline_type0: Any):Unit = js.native
    }
    @js.native
    object FileSaver extends js.Object {
        def new_with_target(buffer: Any, file: Any, target_location: Any):FileSaver = js.native
    }
    @js.native
    class Gutter extends GObject.Object {
        def get_padding(xpad: Any, ypad: Any):Unit = js.native
        def get_renderer_at_pos(x: Any, y: Any):Any = js.native
        def get_window():Any = js.native
        def insert(renderer: Any, position: Any):Boolean = js.native
        def queue_draw():Unit = js.native
        def remove(renderer: Any):Unit = js.native
        def reorder(renderer: Any, position: Any):Unit = js.native
        def set_padding(xpad: Any, ypad: Any):Unit = js.native
    }
    @js.native
    class GutterRenderer extends GObject.InitiallyUnowned {
        def activate(iter: Any, area: Any, event: Any):Unit = js.native
        def begin(cr: Any, background_area: Any, cell_area: Any, start: Any, end: Any):Unit = js.native
        def draw(cr: Any, background_area: Any, cell_area: Any, start: Any, end: Any, state: Any):Unit = js.native
        def end():Unit = js.native
        def get_alignment(xalign: Any, yalign: Any):Unit = js.native
        def get_alignment_mode():Any = js.native
        def get_background(color: Any):Boolean = js.native
        def get_padding(xpad: Any, ypad: Any):Unit = js.native
        def get_size():Any = js.native
        def get_view():Any = js.native
        def get_visible():Boolean = js.native
        def get_window_type():Any = js.native
        def query_activatable(iter: Any, area: Any, event: Any):Boolean = js.native
        def query_data(start: Any, end: Any, state: Any):Unit = js.native
        def query_tooltip(iter: Any, area: Any, x: Any, y: Any, tooltip: Any):Boolean = js.native
        def queue_draw():Unit = js.native
        def set_alignment(xalign: Any, yalign: Any):Unit = js.native
        def set_alignment_mode(mode: Any):Unit = js.native
        def set_background(color: Any):Unit = js.native
        def set_padding(xpad: Any, ypad: Any):Unit = js.native
        def set_size(size: Any):Unit = js.native
        def set_visible(visible: Boolean):Unit = js.native
    }
    @js.native
    class GutterRendererPixbuf extends GutterRenderer {
        def this(config: js.Any) = this()
        def get_gicon():Any = js.native
        def get_icon_name():String = js.native
        def get_pixbuf():Any = js.native
        def get_stock_id():String = js.native
        def set_gicon(icon: Any):Unit = js.native
        def set_icon_name(icon_name: String):Unit = js.native
        def set_pixbuf(pixbuf: Any):Unit = js.native
        def set_stock_id(stock_id: String):Unit = js.native
    }
    @js.native
    class GutterRendererText extends GutterRenderer {
        def this(config: js.Any) = this()
        def measure(text: String, width: Any, height: Any):Unit = js.native
        def measure_markup(markup: String, width: Any, height: Any):Unit = js.native
        def set_markup(markup: String, length: Any):Unit = js.native
        def set_text(text: String, length: Any):Unit = js.native
    }
    @js.native
    class Language extends GObject.Object {
        def get_globs():js.Array[String] = js.native
        def get_hidden():Boolean = js.native
        def get_id():String = js.native
        def get_metadata(name: String):String = js.native
        def get_mime_types():js.Array[String] = js.native
        def get_name():String = js.native
        def get_section():String = js.native
        def get_style_fallback(style_id: String):String = js.native
        def get_style_ids():js.Array[String] = js.native
        def get_style_name(style_id: String):String = js.native
    }
    @js.native
    class LanguageManager extends GObject.Object {
        def this(config: js.Any) = this()
        def get_language(id: String):Any = js.native
        def get_language_ids():js.Array[String] = js.native
        def get_search_path():js.Array[String] = js.native
        def guess_language(filename: String, content_type0: String):Any = js.native
        def set_search_path(dirs: js.Array[String]):Unit = js.native
    }
    @js.native
    object LanguageManager extends js.Object {
        def get_default():Any = js.native
    }
    @js.native
    class Map extends View {
        def this(config: js.Any) = this()
        def get_view():Any = js.native
        def set_view(view: Any):Unit = js.native
    }
    @js.native
    class Mark extends Gtk.TextMark {
        def this(config: js.Any) = this()
        def get_category():String = js.native
        def next(category: String):Any = js.native
        def prev(category: String):Any = js.native
    }
    @js.native
    class MarkAttributes extends GObject.Object {
        def this(config: js.Any) = this()
        def get_background(background: Any):Boolean = js.native
        def get_gicon():Any = js.native
        def get_icon_name():String = js.native
        def get_pixbuf():Any = js.native
        def get_stock_id():String = js.native
        def get_tooltip_markup(mark: Any):String = js.native
        def get_tooltip_text(mark: Any):String = js.native
        def render_icon(widget: Any, size: Any):Any = js.native
        def set_background(background: Any):Unit = js.native
        def set_gicon(gicon: Any):Unit = js.native
        def set_icon_name(icon_name: String):Unit = js.native
        def set_pixbuf(pixbuf: Any):Unit = js.native
        def set_stock_id(stock_id: String):Unit = js.native
    }
    @js.native
    class PrintCompositor extends GObject.Object {
        def this(config: js.Any) = this()
        def draw_page(context: Any, page_nr: Any):Unit = js.native
        def get_body_font_name():String = js.native
        def get_bottom_margin(unit: Any):Any = js.native
        def get_buffer():Any = js.native
        def get_footer_font_name():String = js.native
        def get_header_font_name():String = js.native
        def get_highlight_syntax():Boolean = js.native
        def get_left_margin(unit: Any):Any = js.native
        def get_line_numbers_font_name():String = js.native
        def get_n_pages():Any = js.native
        def get_pagination_progress():Any = js.native
        def get_print_footer():Boolean = js.native
        def get_print_header():Boolean = js.native
        def get_print_line_numbers():Any = js.native
        def get_right_margin(unit: Any):Any = js.native
        def get_tab_width():Any = js.native
        def get_top_margin(unit: Any):Any = js.native
        def get_wrap_mode():Any = js.native
        def paginate(context: Any):Boolean = js.native
        def set_body_font_name(font_name: String):Unit = js.native
        def set_bottom_margin(margin: Any, unit: Any):Unit = js.native
        def set_footer_font_name(font_name: String):Unit = js.native
        def set_footer_format(separator: Boolean, left: String, center: String, right: String):Unit = js.native
        def set_header_font_name(font_name: String):Unit = js.native
        def set_header_format(separator: Boolean, left: String, center: String, right: String):Unit = js.native
        def set_highlight_syntax(highlight: Boolean):Unit = js.native
        def set_left_margin(margin: Any, unit: Any):Unit = js.native
        def set_line_numbers_font_name(font_name: String):Unit = js.native
        def set_print_footer(print: Boolean):Unit = js.native
        def set_print_header(print: Boolean):Unit = js.native
        def set_print_line_numbers(interval0: Any):Unit = js.native
        def set_right_margin(margin: Any, unit: Any):Unit = js.native
        def set_tab_width(width: Any):Unit = js.native
        def set_top_margin(margin: Any, unit: Any):Unit = js.native
        def set_wrap_mode(wrap_mode: Any):Unit = js.native
    }
    @js.native
    object PrintCompositor extends js.Object {
        def new_from_view(view: Any):PrintCompositor = js.native
    }
    @js.native
    class SearchContext extends GObject.Object {
        def this(config: js.Any) = this()
        def backward(iter: Any, match_start: Any, match_end: Any):Boolean = js.native
        def backward_async(iter: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def backward_finish(result: Any, match_start: Any, match_end: Any):Boolean = js.native
        def forward(iter: Any, match_start: Any, match_end: Any):Boolean = js.native
        def forward_async(iter: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def forward_finish(result: Any, match_start: Any, match_end: Any):Boolean = js.native
        def get_buffer():Any = js.native
        def get_highlight():Boolean = js.native
        def get_match_style():Any = js.native
        def get_occurrence_position(match_start: Any, match_end: Any):Any = js.native
        def get_occurrences_count():Any = js.native
        def get_regex_error():Any = js.native
        def get_settings():Any = js.native
        def replace(match_start: Any, match_end: Any, replace: String, replace_length: Any):Boolean = js.native
        def replace_all(replace: String, replace_length: Any):Any = js.native
        def set_highlight(highlight: Boolean):Unit = js.native
        def set_match_style(match_style: Any):Unit = js.native
        def set_settings(settings: Any):Unit = js.native
    }
    @js.native
    class SearchSettings extends GObject.Object {
        def this(config: js.Any) = this()
        def get_at_word_boundaries():Boolean = js.native
        def get_case_sensitive():Boolean = js.native
        def get_regex_enabled():Boolean = js.native
        def get_search_text():String = js.native
        def get_wrap_around():Boolean = js.native
        def set_at_word_boundaries(at_word_boundaries: Boolean):Unit = js.native
        def set_case_sensitive(case_sensitive: Boolean):Unit = js.native
        def set_regex_enabled(regex_enabled: Boolean):Unit = js.native
        def set_search_text(search_text: String):Unit = js.native
        def set_wrap_around(wrap_around: Boolean):Unit = js.native
    }
    @js.native
    class Style extends GObject.Object {
        def copy():Any = js.native
    }
    @js.native
    class StyleScheme extends GObject.Object {
        def get_authors():js.Array[String] = js.native
        def get_description():String = js.native
        def get_filename():String = js.native
        def get_id():String = js.native
        def get_name():String = js.native
        def get_style(style_id: String):Any = js.native
    }
    @js.native
    class StyleSchemeChooserButton extends Gtk.Button {
        def this(config: js.Any) = this()
    }
    @js.native
    class StyleSchemeChooserWidget extends Gtk.Bin {
        def this(config: js.Any) = this()
    }
    @js.native
    class StyleSchemeManager extends GObject.Object {
        def this(config: js.Any) = this()
        def append_search_path(path: String):Unit = js.native
        def force_rescan():Unit = js.native
        def get_scheme(scheme_id: String):Any = js.native
        def get_scheme_ids():js.Array[String] = js.native
        def get_search_path():js.Array[String] = js.native
        def prepend_search_path(path: String):Unit = js.native
        def set_search_path(path: js.Array[String]):Unit = js.native
    }
    @js.native
    object StyleSchemeManager extends js.Object {
        def get_default():Any = js.native
    }
    @js.native
    class View extends Gtk.TextView {
        def this(config: js.Any) = this()
        def get_auto_indent():Boolean = js.native
        def get_background_pattern():Any = js.native
        def get_completion():Any = js.native
        def get_draw_spaces():Any = js.native
        def get_gutter(window_type0: Any):Any = js.native
        def get_highlight_current_line():Boolean = js.native
        def get_indent_on_tab():Boolean = js.native
        def get_indent_width():Any = js.native
        def get_insert_spaces_instead_of_tabs():Boolean = js.native
        def get_mark_attributes(category: String, priority: Any):Any = js.native
        def get_right_margin_position():Any = js.native
        def get_show_line_marks():Boolean = js.native
        def get_show_line_numbers():Boolean = js.native
        def get_show_right_margin():Boolean = js.native
        def get_smart_backspace():Boolean = js.native
        def get_smart_home_end():Any = js.native
        def get_tab_width():Any = js.native
        def get_visual_column(iter: Any):Any = js.native
        def indent_lines(start: Any, end: Any):Unit = js.native
        def set_auto_indent(enable: Boolean):Unit = js.native
        def set_background_pattern(background_pattern: Any):Unit = js.native
        def set_draw_spaces(flags: Any):Unit = js.native
        def set_highlight_current_line(highlight: Boolean):Unit = js.native
        def set_indent_on_tab(enable: Boolean):Unit = js.native
        def set_indent_width(width: Any):Unit = js.native
        def set_insert_spaces_instead_of_tabs(enable: Boolean):Unit = js.native
        def set_mark_attributes(category: String, attributes: Any, priority: Any):Unit = js.native
        def set_right_margin_position(pos: Any):Unit = js.native
        def set_show_line_marks(show: Boolean):Unit = js.native
        def set_show_line_numbers(show: Boolean):Unit = js.native
        def set_show_right_margin(show: Boolean):Unit = js.native
        def set_smart_backspace(smart_backspace: Boolean):Unit = js.native
        def set_smart_home_end(smart_home_end: Any):Unit = js.native
        def set_tab_width(width: Any):Unit = js.native
        def unindent_lines(start: Any, end: Any):Unit = js.native
    }
    @js.native
    object View extends js.Object {
        def new_with_buffer(buffer: Any):View = js.native
    }
}