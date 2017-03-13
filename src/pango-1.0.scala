/**
 * Pango.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Pango")
@js.native
object Pango extends js.Object {
    val ANALYSIS_FLAG_CENTERED_BASELINE:Any = js.native
    val ANALYSIS_FLAG_IS_ELLIPSIS:Any = js.native
    val ATTR_INDEX_FROM_TEXT_BEGINNING:Any = js.native
    val ENGINE_TYPE_LANG:String = js.native
    val ENGINE_TYPE_SHAPE:String = js.native
    val GLYPH_EMPTY:Any = js.native
    val GLYPH_INVALID_INPUT:Any = js.native
    val GLYPH_UNKNOWN_FLAG:Any = js.native
    val RENDER_TYPE_NONE:String = js.native
    val SCALE:Any = js.native
    val UNKNOWN_GLYPH_HEIGHT:Any = js.native
    val UNKNOWN_GLYPH_WIDTH:Any = js.native
    def attr_background_alpha_new(alpha: Any):Any = js.native
    def attr_background_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_fallback_new(enable_fallback: Boolean):Any = js.native
    def attr_family_new(family: String):Any = js.native
    def attr_foreground_alpha_new(alpha: Any):Any = js.native
    def attr_foreground_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_gravity_hint_new(hint: Any):Any = js.native
    def attr_gravity_new(gravity: Any):Any = js.native
    def attr_letter_spacing_new(letter_spacing: Any):Any = js.native
    def attr_rise_new(rise: Any):Any = js.native
    def attr_scale_new(scale_factor: Any):Any = js.native
    def attr_stretch_new(stretch: Any):Any = js.native
    def attr_strikethrough_color_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_strikethrough_new(strikethrough: Boolean):Any = js.native
    def attr_style_new(style: Any):Any = js.native
    def attr_type_get_name(type0: Any):String = js.native
    def attr_type_register(name: String):Any = js.native
    def attr_underline_color_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_underline_new(underline: Any):Any = js.native
    def attr_variant_new(variant: Any):Any = js.native
    def attr_weight_new(weight: Any):Any = js.native
    def bidi_type_for_unichar(ch: Any):Any = js.native
    def break0(text: String, length: Any, analysis: Any, attrs: js.Array[Any], attrs_len: Any):Unit = js.native
    def config_key_get(key: String):String = js.native
    def config_key_get_system(key: String):String = js.native
    def default_break(text: String, length: Any, analysis: Any, attrs: Any, attrs_len: Any):Unit = js.native
    def extents_to_pixels(inclusive: Any, nearest: Any):Unit = js.native
    def find_base_dir(text: String, length: Any):Any = js.native
    def find_map(language: Any, engine_type_id: Any, render_type_id: Any):Any = js.native
    def find_paragraph_boundary(text: String, length: Any, paragraph_delimiter_index: Any, next_paragraph_start: Any):Unit = js.native
    def font_description_from_string(str: String):Any = js.native
    def get_lib_subdirectory():String = js.native
    def get_log_attrs(text: String, length: Any, level: Any, language: Any, log_attrs: js.Array[Any], attrs_len: Any):Unit = js.native
    def get_mirror_char(ch: Any, mirrored_ch: Any):Boolean = js.native
    def get_sysconf_subdirectory():String = js.native
    def gravity_get_for_matrix(matrix: Any):Any = js.native
    def gravity_get_for_script(script: Any, base_gravity: Any, hint: Any):Any = js.native
    def gravity_get_for_script_and_width(script: Any, wide: Boolean, base_gravity: Any, hint: Any):Any = js.native
    def gravity_to_rotation(gravity: Any):Any = js.native
    def is_zero_width(ch: Any):Boolean = js.native
    def itemize(context: Any, text: String, start_index: Any, length: Any, attrs: Any, cached_iter: Any):Any = js.native
    def itemize_with_base_dir(context: Any, base_dir: Any, text: String, start_index: Any, length: Any, attrs: Any, cached_iter: Any):Any = js.native
    def language_from_string(language: String):Any = js.native
    def language_get_default():Any = js.native
    def log2vis_get_embedding_levels(text: String, length: Any, pbase_dir: Any):Any = js.native
    def lookup_aliases(fontname: String, families: js.Array[String], n_families: Any):Unit = js.native
    def markup_parser_finish(context: Any, attr_list: Any, text: String, accel_char: Any):Boolean = js.native
    def markup_parser_new(accel_marker: Any):Any = js.native
    def module_register(module: Any):Unit = js.native
    def parse_enum(type0: Any, str: String, value: Any, warn: Boolean, possible_values: String):Boolean = js.native
    def parse_markup(markup_text: String, length: Any, accel_marker: Any, attr_list: Any, text: String, accel_char: Any):Boolean = js.native
    def parse_stretch(str: String, stretch: Any, warn: Boolean):Boolean = js.native
    def parse_style(str: String, style: Any, warn: Boolean):Boolean = js.native
    def parse_variant(str: String, variant: Any, warn: Boolean):Boolean = js.native
    def parse_weight(str: String, weight: Any, warn: Boolean):Boolean = js.native
    def quantize_line_geometry(thickness: Any, position: Any):Unit = js.native
    def read_line(stream: Object, str: Any):Any = js.native
    def reorder_items(logical_items: Any):Any = js.native
    def scan_int(pos: String, out: Any):Boolean = js.native
    def scan_string(pos: String, out: Any):Boolean = js.native
    def scan_word(pos: String, out: Any):Boolean = js.native
    def script_for_unichar(ch: Any):Any = js.native
    def script_get_sample_language(script: Any):Any = js.native
    def shape(text: String, length: Any, analysis: Any, glyphs: Any):Unit = js.native
    def shape_full(item_text: String, item_length: Any, paragraph_text: String, paragraph_length: Any, analysis: Any, glyphs: Any):Unit = js.native
    def skip_space(pos: String):Boolean = js.native
    def split_file_list(str: String):js.Array[String] = js.native
    def trim_string(str: String):String = js.native
    def unichar_direction(ch: Any):Any = js.native
    def units_from_double(d: Any):Any = js.native
    def units_to_double(i: Any):Any = js.native
    def version():Any = js.native
    def version_check(required_major: Any, required_minor: Any, required_micro: Any):String = js.native
    def version_string():String = js.native
    @js.native
    object Alignment extends js.Object {
        val LEFT:js.Dynamic = js.native
        val CENTER:js.Dynamic = js.native
        val RIGHT:js.Dynamic = js.native
    }
    @js.native
    object AttrType extends js.Object {
        val INVALID:js.Dynamic = js.native
        val LANGUAGE:js.Dynamic = js.native
        val FAMILY:js.Dynamic = js.native
        val STYLE:js.Dynamic = js.native
        val WEIGHT:js.Dynamic = js.native
        val VARIANT:js.Dynamic = js.native
        val STRETCH:js.Dynamic = js.native
        val SIZE:js.Dynamic = js.native
        val FONT_DESC:js.Dynamic = js.native
        val FOREGROUND:js.Dynamic = js.native
        val BACKGROUND:js.Dynamic = js.native
        val UNDERLINE:js.Dynamic = js.native
        val STRIKETHROUGH:js.Dynamic = js.native
        val RISE:js.Dynamic = js.native
        val SHAPE:js.Dynamic = js.native
        val SCALE:js.Dynamic = js.native
        val FALLBACK:js.Dynamic = js.native
        val LETTER_SPACING:js.Dynamic = js.native
        val UNDERLINE_COLOR:js.Dynamic = js.native
        val STRIKETHROUGH_COLOR:js.Dynamic = js.native
        val ABSOLUTE_SIZE:js.Dynamic = js.native
        val GRAVITY:js.Dynamic = js.native
        val GRAVITY_HINT:js.Dynamic = js.native
        val FONT_FEATURES:js.Dynamic = js.native
        val FOREGROUND_ALPHA:js.Dynamic = js.native
        val BACKGROUND_ALPHA:js.Dynamic = js.native
    }
    @js.native
    object BidiType extends js.Object {
        val L:js.Dynamic = js.native
        val LRE:js.Dynamic = js.native
        val LRO:js.Dynamic = js.native
        val R:js.Dynamic = js.native
        val AL:js.Dynamic = js.native
        val RLE:js.Dynamic = js.native
        val RLO:js.Dynamic = js.native
        val PDF:js.Dynamic = js.native
        val EN:js.Dynamic = js.native
        val ES:js.Dynamic = js.native
        val ET:js.Dynamic = js.native
        val AN:js.Dynamic = js.native
        val CS:js.Dynamic = js.native
        val NSM:js.Dynamic = js.native
        val BN:js.Dynamic = js.native
        val B:js.Dynamic = js.native
        val S:js.Dynamic = js.native
        val WS:js.Dynamic = js.native
        val ON:js.Dynamic = js.native
    }
    @js.native
    object CoverageLevel extends js.Object {
        val NONE:js.Dynamic = js.native
        val FALLBACK:js.Dynamic = js.native
        val APPROXIMATE:js.Dynamic = js.native
        val EXACT:js.Dynamic = js.native
    }
    @js.native
    object Direction extends js.Object {
        val LTR:js.Dynamic = js.native
        val RTL:js.Dynamic = js.native
        val TTB_LTR:js.Dynamic = js.native
        val TTB_RTL:js.Dynamic = js.native
        val WEAK_LTR:js.Dynamic = js.native
        val WEAK_RTL:js.Dynamic = js.native
        val NEUTRAL:js.Dynamic = js.native
    }
    @js.native
    object EllipsizeMode extends js.Object {
        val NONE:js.Dynamic = js.native
        val START:js.Dynamic = js.native
        val MIDDLE:js.Dynamic = js.native
        val END:js.Dynamic = js.native
    }
    @js.native
    object Gravity extends js.Object {
        val SOUTH:js.Dynamic = js.native
        val EAST:js.Dynamic = js.native
        val NORTH:js.Dynamic = js.native
        val WEST:js.Dynamic = js.native
        val AUTO:js.Dynamic = js.native
    }
    @js.native
    object GravityHint extends js.Object {
        val NATURAL:js.Dynamic = js.native
        val STRONG:js.Dynamic = js.native
        val LINE:js.Dynamic = js.native
    }
    @js.native
    object RenderPart extends js.Object {
        val FOREGROUND:js.Dynamic = js.native
        val BACKGROUND:js.Dynamic = js.native
        val UNDERLINE:js.Dynamic = js.native
        val STRIKETHROUGH:js.Dynamic = js.native
    }
    @js.native
    object Script extends js.Object {
        val INVALID_CODE:js.Dynamic = js.native
        val COMMON:js.Dynamic = js.native
        val INHERITED:js.Dynamic = js.native
        val ARABIC:js.Dynamic = js.native
        val ARMENIAN:js.Dynamic = js.native
        val BENGALI:js.Dynamic = js.native
        val BOPOMOFO:js.Dynamic = js.native
        val CHEROKEE:js.Dynamic = js.native
        val COPTIC:js.Dynamic = js.native
        val CYRILLIC:js.Dynamic = js.native
        val DESERET:js.Dynamic = js.native
        val DEVANAGARI:js.Dynamic = js.native
        val ETHIOPIC:js.Dynamic = js.native
        val GEORGIAN:js.Dynamic = js.native
        val GOTHIC:js.Dynamic = js.native
        val GREEK:js.Dynamic = js.native
        val GUJARATI:js.Dynamic = js.native
        val GURMUKHI:js.Dynamic = js.native
        val HAN:js.Dynamic = js.native
        val HANGUL:js.Dynamic = js.native
        val HEBREW:js.Dynamic = js.native
        val HIRAGANA:js.Dynamic = js.native
        val KANNADA:js.Dynamic = js.native
        val KATAKANA:js.Dynamic = js.native
        val KHMER:js.Dynamic = js.native
        val LAO:js.Dynamic = js.native
        val LATIN:js.Dynamic = js.native
        val MALAYALAM:js.Dynamic = js.native
        val MONGOLIAN:js.Dynamic = js.native
        val MYANMAR:js.Dynamic = js.native
        val OGHAM:js.Dynamic = js.native
        val OLD_ITALIC:js.Dynamic = js.native
        val ORIYA:js.Dynamic = js.native
        val RUNIC:js.Dynamic = js.native
        val SINHALA:js.Dynamic = js.native
        val SYRIAC:js.Dynamic = js.native
        val TAMIL:js.Dynamic = js.native
        val TELUGU:js.Dynamic = js.native
        val THAANA:js.Dynamic = js.native
        val THAI:js.Dynamic = js.native
        val TIBETAN:js.Dynamic = js.native
        val CANADIAN_ABORIGINAL:js.Dynamic = js.native
        val YI:js.Dynamic = js.native
        val TAGALOG:js.Dynamic = js.native
        val HANUNOO:js.Dynamic = js.native
        val BUHID:js.Dynamic = js.native
        val TAGBANWA:js.Dynamic = js.native
        val BRAILLE:js.Dynamic = js.native
        val CYPRIOT:js.Dynamic = js.native
        val LIMBU:js.Dynamic = js.native
        val OSMANYA:js.Dynamic = js.native
        val SHAVIAN:js.Dynamic = js.native
        val LINEAR_B:js.Dynamic = js.native
        val TAI_LE:js.Dynamic = js.native
        val UGARITIC:js.Dynamic = js.native
        val NEW_TAI_LUE:js.Dynamic = js.native
        val BUGINESE:js.Dynamic = js.native
        val GLAGOLITIC:js.Dynamic = js.native
        val TIFINAGH:js.Dynamic = js.native
        val SYLOTI_NAGRI:js.Dynamic = js.native
        val OLD_PERSIAN:js.Dynamic = js.native
        val KHAROSHTHI:js.Dynamic = js.native
        val UNKNOWN:js.Dynamic = js.native
        val BALINESE:js.Dynamic = js.native
        val CUNEIFORM:js.Dynamic = js.native
        val PHOENICIAN:js.Dynamic = js.native
        val PHAGS_PA:js.Dynamic = js.native
        val NKO:js.Dynamic = js.native
        val KAYAH_LI:js.Dynamic = js.native
        val LEPCHA:js.Dynamic = js.native
        val REJANG:js.Dynamic = js.native
        val SUNDANESE:js.Dynamic = js.native
        val SAURASHTRA:js.Dynamic = js.native
        val CHAM:js.Dynamic = js.native
        val OL_CHIKI:js.Dynamic = js.native
        val VAI:js.Dynamic = js.native
        val CARIAN:js.Dynamic = js.native
        val LYCIAN:js.Dynamic = js.native
        val LYDIAN:js.Dynamic = js.native
        val BATAK:js.Dynamic = js.native
        val BRAHMI:js.Dynamic = js.native
        val MANDAIC:js.Dynamic = js.native
        val CHAKMA:js.Dynamic = js.native
        val MEROITIC_CURSIVE:js.Dynamic = js.native
        val MEROITIC_HIEROGLYPHS:js.Dynamic = js.native
        val MIAO:js.Dynamic = js.native
        val SHARADA:js.Dynamic = js.native
        val SORA_SOMPENG:js.Dynamic = js.native
        val TAKRI:js.Dynamic = js.native
    }
    @js.native
    object Stretch extends js.Object {
        val ULTRA_CONDENSED:js.Dynamic = js.native
        val EXTRA_CONDENSED:js.Dynamic = js.native
        val CONDENSED:js.Dynamic = js.native
        val SEMI_CONDENSED:js.Dynamic = js.native
        val NORMAL:js.Dynamic = js.native
        val SEMI_EXPANDED:js.Dynamic = js.native
        val EXPANDED:js.Dynamic = js.native
        val EXTRA_EXPANDED:js.Dynamic = js.native
        val ULTRA_EXPANDED:js.Dynamic = js.native
    }
    @js.native
    object Style extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val OBLIQUE:js.Dynamic = js.native
        val ITALIC:js.Dynamic = js.native
    }
    @js.native
    object TabAlign extends js.Object {
        val LEFT:js.Dynamic = js.native
    }
    @js.native
    object Underline extends js.Object {
        val NONE:js.Dynamic = js.native
        val SINGLE:js.Dynamic = js.native
        val DOUBLE:js.Dynamic = js.native
        val LOW:js.Dynamic = js.native
        val ERROR:js.Dynamic = js.native
    }
    @js.native
    object Variant extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val SMALL_CAPS:js.Dynamic = js.native
    }
    @js.native
    object Weight extends js.Object {
        val THIN:js.Dynamic = js.native
        val ULTRALIGHT:js.Dynamic = js.native
        val LIGHT:js.Dynamic = js.native
        val SEMILIGHT:js.Dynamic = js.native
        val BOOK:js.Dynamic = js.native
        val NORMAL:js.Dynamic = js.native
        val MEDIUM:js.Dynamic = js.native
        val SEMIBOLD:js.Dynamic = js.native
        val BOLD:js.Dynamic = js.native
        val ULTRABOLD:js.Dynamic = js.native
        val HEAVY:js.Dynamic = js.native
        val ULTRAHEAVY:js.Dynamic = js.native
    }
    @js.native
    object WrapMode extends js.Object {
        val WORD:js.Dynamic = js.native
        val CHAR:js.Dynamic = js.native
        val WORD_CHAR:js.Dynamic = js.native
    }
    @js.native
    object FontMask extends js.Object {
        val FAMILY:js.Dynamic = js.native
        val STYLE:js.Dynamic = js.native
        val VARIANT:js.Dynamic = js.native
        val WEIGHT:js.Dynamic = js.native
        val STRETCH:js.Dynamic = js.native
        val SIZE:js.Dynamic = js.native
        val GRAVITY:js.Dynamic = js.native
    }
    @js.native
    class Context extends GObject.Object {
        def this(config: js.Any) = this()
        def changed():Unit = js.native
        def get_base_dir():Any = js.native
        def get_base_gravity():Any = js.native
        def get_font_description():Any = js.native
        def get_font_map():Any = js.native
        def get_gravity():Any = js.native
        def get_gravity_hint():Any = js.native
        def get_language():Any = js.native
        def get_matrix():Any = js.native
        def get_metrics(desc: Any, language: Any):Any = js.native
        def get_serial():Any = js.native
        def list_families(families: js.Array[Any], n_families: Any):Unit = js.native
        def load_font(desc: Any):Any = js.native
        def load_fontset(desc: Any, language: Any):Any = js.native
        def set_base_dir(direction: Any):Unit = js.native
        def set_base_gravity(gravity: Any):Unit = js.native
        def set_font_description(desc: Any):Unit = js.native
        def set_font_map(font_map: Any):Unit = js.native
        def set_gravity_hint(hint: Any):Unit = js.native
        def set_language(language: Any):Unit = js.native
        def set_matrix(matrix: Any):Unit = js.native
    }
    @js.native
    class Engine extends GObject.Object {
    }
    @js.native
    class EngineLang extends Engine {
    }
    @js.native
    class EngineShape extends Engine {
    }
    @js.native
    class Font extends GObject.Object {
        def describe():Any = js.native
        def describe_with_absolute_size():Any = js.native
        def find_shaper(language: Any, ch: Any):Any = js.native
        def get_coverage(language: Any):Any = js.native
        def get_font_map():Any = js.native
        def get_glyph_extents(glyph: Any, ink_rect: Any, logical_rect: Any):Unit = js.native
        def get_metrics(language: Any):Any = js.native
    }
    @js.native
    object Font extends js.Object {
        def descriptions_free(descs: js.Array[Any], n_descs: Any):Unit = js.native
    }
    @js.native
    class FontFace extends GObject.Object {
        def describe():Any = js.native
        def get_face_name():String = js.native
        def is_synthesized():Boolean = js.native
        def list_sizes(sizes: js.Array[Any], n_sizes: Any):Unit = js.native
    }
    @js.native
    class FontFamily extends GObject.Object {
        def get_name():String = js.native
        def is_monospace():Boolean = js.native
        def list_faces(faces: js.Array[Any], n_faces: Any):Unit = js.native
    }
    @js.native
    class FontMap extends GObject.Object {
        def changed():Unit = js.native
        def create_context():Any = js.native
        def get_serial():Any = js.native
        def get_shape_engine_type():String = js.native
        def list_families(families: js.Array[Any], n_families: Any):Unit = js.native
        def load_font(context: Any, desc: Any):Any = js.native
        def load_fontset(context: Any, desc: Any, language: Any):Any = js.native
    }
    @js.native
    class Fontset extends GObject.Object {
        def foreach(func: Any, data: Object):Unit = js.native
        def get_font(wc: Any):Any = js.native
        def get_metrics():Any = js.native
    }
    @js.native
    class FontsetSimple extends Fontset {
        def this(config: js.Any) = this()
        def append(font: Any):Unit = js.native
        def size():Any = js.native
    }
    @js.native
    class Layout extends GObject.Object {
        def this(config: js.Any) = this()
        def context_changed():Unit = js.native
        def copy():Any = js.native
        def get_alignment():Any = js.native
        def get_attributes():Any = js.native
        def get_auto_dir():Boolean = js.native
        def get_baseline():Any = js.native
        def get_character_count():Any = js.native
        def get_context():Any = js.native
        def get_cursor_pos(index0: Any, strong_pos: Any, weak_pos: Any):Unit = js.native
        def get_ellipsize():Any = js.native
        def get_extents(ink_rect: Any, logical_rect: Any):Unit = js.native
        def get_font_description():Any = js.native
        def get_height():Any = js.native
        def get_indent():Any = js.native
        def get_iter():Any = js.native
        def get_justify():Boolean = js.native
        def get_line(line: Any):Any = js.native
        def get_line_count():Any = js.native
        def get_line_readonly(line: Any):Any = js.native
        def get_lines():Any = js.native
        def get_lines_readonly():Any = js.native
        def get_log_attrs(attrs: js.Array[Any], n_attrs: Any):Unit = js.native
        def get_log_attrs_readonly(n_attrs: Any):js.Array[Any] = js.native
        def get_pixel_extents(ink_rect: Any, logical_rect: Any):Unit = js.native
        def get_pixel_size(width: Any, height: Any):Unit = js.native
        def get_serial():Any = js.native
        def get_single_paragraph_mode():Boolean = js.native
        def get_size(width: Any, height: Any):Unit = js.native
        def get_spacing():Any = js.native
        def get_tabs():Any = js.native
        def get_text():String = js.native
        def get_unknown_glyphs_count():Any = js.native
        def get_width():Any = js.native
        def get_wrap():Any = js.native
        def index_to_line_x(index0: Any, trailing: Boolean, line: Any, x_pos: Any):Unit = js.native
        def index_to_pos(index0: Any, pos: Any):Unit = js.native
        def is_ellipsized():Boolean = js.native
        def is_wrapped():Boolean = js.native
        def move_cursor_visually(strong: Boolean, old_index: Any, old_trailing: Any, direction: Any, new_index: Any, new_trailing: Any):Unit = js.native
        def set_alignment(alignment: Any):Unit = js.native
        def set_attributes(attrs: Any):Unit = js.native
        def set_auto_dir(auto_dir: Boolean):Unit = js.native
        def set_ellipsize(ellipsize: Any):Unit = js.native
        def set_font_description(desc: Any):Unit = js.native
        def set_height(height: Any):Unit = js.native
        def set_indent(indent: Any):Unit = js.native
        def set_justify(justify: Boolean):Unit = js.native
        def set_markup(markup: String, length: Any):Unit = js.native
        def set_markup_with_accel(markup: String, length: Any, accel_marker: Any, accel_char: Any):Unit = js.native
        def set_single_paragraph_mode(setting: Boolean):Unit = js.native
        def set_spacing(spacing: Any):Unit = js.native
        def set_tabs(tabs: Any):Unit = js.native
        def set_text(text: String, length: Any):Unit = js.native
        def set_width(width: Any):Unit = js.native
        def set_wrap(wrap: Any):Unit = js.native
        def xy_to_index(x: Any, y: Any, index0: Any, trailing: Any):Boolean = js.native
    }
    @js.native
    class Renderer extends GObject.Object {
        def activate():Unit = js.native
        def deactivate():Unit = js.native
        def draw_error_underline(x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def draw_glyph(font: Any, glyph: Any, x: Any, y: Any):Unit = js.native
        def draw_glyph_item(text: String, glyph_item: Any, x: Any, y: Any):Unit = js.native
        def draw_glyphs(font: Any, glyphs: Any, x: Any, y: Any):Unit = js.native
        def draw_layout(layout: Any, x: Any, y: Any):Unit = js.native
        def draw_layout_line(line: Any, x: Any, y: Any):Unit = js.native
        def draw_rectangle(part: Any, x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def draw_trapezoid(part: Any, y10: Any, x11: Any, x21: Any, y2: Any, x12: Any, x22: Any):Unit = js.native
        def get_alpha(part: Any):Any = js.native
        def get_color(part: Any):Any = js.native
        def get_layout():Any = js.native
        def get_layout_line():Any = js.native
        def get_matrix():Any = js.native
        def part_changed(part: Any):Unit = js.native
        def set_alpha(part: Any, alpha: Any):Unit = js.native
        def set_color(part: Any, color: Any):Unit = js.native
        def set_matrix(matrix: Any):Unit = js.native
    }
}