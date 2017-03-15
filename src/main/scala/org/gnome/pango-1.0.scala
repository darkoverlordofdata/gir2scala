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
    def attr_gravity_hint_new(hint: Double):Any = js.native
    def attr_gravity_new(gravity: Double):Any = js.native
    def attr_letter_spacing_new(letter_spacing: Any):Any = js.native
    def attr_rise_new(rise: Any):Any = js.native
    def attr_scale_new(scale_factor: Any):Any = js.native
    def attr_stretch_new(stretch: Double):Any = js.native
    def attr_strikethrough_color_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_strikethrough_new(strikethrough: Boolean):Any = js.native
    def attr_style_new(style: Double):Any = js.native
    def attr_type_get_name(type0: Double):String = js.native
    def attr_type_register(name: String):Double = js.native
    def attr_underline_color_new(red: Any, green: Any, blue: Any):Any = js.native
    def attr_underline_new(underline: Double):Any = js.native
    def attr_variant_new(variant: Double):Any = js.native
    def attr_weight_new(weight: Double):Any = js.native
    def bidi_type_for_unichar(ch: Any):Double = js.native
    def break0(text: String, length: Any, analysis: Any, attrs: js.Array[Any], attrs_len: Any):Unit = js.native
    def config_key_get(key: String):String = js.native
    def config_key_get_system(key: String):String = js.native
    def default_break(text: String, length: Any, analysis: Any, attrs: Any, attrs_len: Any):Unit = js.native
    def extents_to_pixels(inclusive: Any, nearest: Any):Unit = js.native
    def find_base_dir(text: String, length: Any):Double = js.native
    def find_map(language: Any, engine_type_id: Any, render_type_id: Any):Any = js.native
    def find_paragraph_boundary(text: String, length: Any, paragraph_delimiter_index: Any, next_paragraph_start: Any):Unit = js.native
    def font_description_from_string(str: String):Any = js.native
    def get_lib_subdirectory():String = js.native
    def get_log_attrs(text: String, length: Any, level: Any, language: Any, log_attrs: js.Array[Any], attrs_len: Any):Unit = js.native
    def get_mirror_char(ch: Any, mirrored_ch: Any):Boolean = js.native
    def get_sysconf_subdirectory():String = js.native
    def gravity_get_for_matrix(matrix: Any):Double = js.native
    def gravity_get_for_script(script: Double, base_gravity: Double, hint: Double):Double = js.native
    def gravity_get_for_script_and_width(script: Double, wide: Boolean, base_gravity: Double, hint: Double):Double = js.native
    def gravity_to_rotation(gravity: Double):Any = js.native
    def is_zero_width(ch: Any):Boolean = js.native
    def itemize(context: Context, text: String, start_index: Any, length: Any, attrs: Any, cached_iter: Any):Any = js.native
    def itemize_with_base_dir(context: Context, base_dir: Double, text: String, start_index: Any, length: Any, attrs: Any, cached_iter: Any):Any = js.native
    def language_from_string(language: String):Any = js.native
    def language_get_default():Any = js.native
    def log2vis_get_embedding_levels(text: String, length: Any, pbase_dir: Double):Any = js.native
    def lookup_aliases(fontname: String, families: js.Array[String], n_families: Any):Unit = js.native
    def markup_parser_finish(context: Any, attr_list: Any, text: String, accel_char: Any):Boolean = js.native
    def markup_parser_new(accel_marker: Any):Any = js.native
    def module_register(module: Any):Unit = js.native
    def parse_enum(type0: Any, str: String, value: Any, warn: Boolean, possible_values: String):Boolean = js.native
    def parse_markup(markup_text: String, length: Any, accel_marker: Any, attr_list: Any, text: String, accel_char: Any):Boolean = js.native
    def parse_stretch(str: String, stretch: Double, warn: Boolean):Boolean = js.native
    def parse_style(str: String, style: Double, warn: Boolean):Boolean = js.native
    def parse_variant(str: String, variant: Double, warn: Boolean):Boolean = js.native
    def parse_weight(str: String, weight: Double, warn: Boolean):Boolean = js.native
    def quantize_line_geometry(thickness: Any, position: Any):Unit = js.native
    def read_line(stream: Object, str: Any):Any = js.native
    def reorder_items(logical_items: Any):Any = js.native
    def scan_int(pos: String, out: Any):Boolean = js.native
    def scan_string(pos: String, out: Any):Boolean = js.native
    def scan_word(pos: String, out: Any):Boolean = js.native
    def script_for_unichar(ch: Any):Double = js.native
    def script_get_sample_language(script: Double):Any = js.native
    def shape(text: String, length: Any, analysis: Any, glyphs: Any):Unit = js.native
    def shape_full(item_text: String, item_length: Any, paragraph_text: String, paragraph_length: Any, analysis: Any, glyphs: Any):Unit = js.native
    def skip_space(pos: String):Boolean = js.native
    def split_file_list(str: String):js.Array[String] = js.native
    def trim_string(str: String):String = js.native
    def unichar_direction(ch: Any):Double = js.native
    def units_from_double(d: Any):Any = js.native
    def units_to_double(i: Any):Any = js.native
    def version():Any = js.native
    def version_check(required_major: Any, required_minor: Any, required_micro: Any):String = js.native
    def version_string():String = js.native
    @js.native
    object Alignment extends js.Object {
        val LEFT:Double = js.native
        val CENTER:Double = js.native
        val RIGHT:Double = js.native
    }
    @js.native
    object AttrType extends js.Object {
        val INVALID:Double = js.native
        val LANGUAGE:Double = js.native
        val FAMILY:Double = js.native
        val STYLE:Double = js.native
        val WEIGHT:Double = js.native
        val VARIANT:Double = js.native
        val STRETCH:Double = js.native
        val SIZE:Double = js.native
        val FONT_DESC:Double = js.native
        val FOREGROUND:Double = js.native
        val BACKGROUND:Double = js.native
        val UNDERLINE:Double = js.native
        val STRIKETHROUGH:Double = js.native
        val RISE:Double = js.native
        val SHAPE:Double = js.native
        val SCALE:Double = js.native
        val FALLBACK:Double = js.native
        val LETTER_SPACING:Double = js.native
        val UNDERLINE_COLOR:Double = js.native
        val STRIKETHROUGH_COLOR:Double = js.native
        val ABSOLUTE_SIZE:Double = js.native
        val GRAVITY:Double = js.native
        val GRAVITY_HINT:Double = js.native
        val FONT_FEATURES:Double = js.native
        val FOREGROUND_ALPHA:Double = js.native
        val BACKGROUND_ALPHA:Double = js.native
    }
    @js.native
    object BidiType extends js.Object {
        val L:Double = js.native
        val LRE:Double = js.native
        val LRO:Double = js.native
        val R:Double = js.native
        val AL:Double = js.native
        val RLE:Double = js.native
        val RLO:Double = js.native
        val PDF:Double = js.native
        val EN:Double = js.native
        val ES:Double = js.native
        val ET:Double = js.native
        val AN:Double = js.native
        val CS:Double = js.native
        val NSM:Double = js.native
        val BN:Double = js.native
        val B:Double = js.native
        val S:Double = js.native
        val WS:Double = js.native
        val ON:Double = js.native
    }
    @js.native
    object CoverageLevel extends js.Object {
        val NONE:Double = js.native
        val FALLBACK:Double = js.native
        val APPROXIMATE:Double = js.native
        val EXACT:Double = js.native
    }
    @js.native
    object Direction extends js.Object {
        val LTR:Double = js.native
        val RTL:Double = js.native
        val TTB_LTR:Double = js.native
        val TTB_RTL:Double = js.native
        val WEAK_LTR:Double = js.native
        val WEAK_RTL:Double = js.native
        val NEUTRAL:Double = js.native
    }
    @js.native
    object EllipsizeMode extends js.Object {
        val NONE:Double = js.native
        val START:Double = js.native
        val MIDDLE:Double = js.native
        val END:Double = js.native
    }
    @js.native
    object Gravity extends js.Object {
        val SOUTH:Double = js.native
        val EAST:Double = js.native
        val NORTH:Double = js.native
        val WEST:Double = js.native
        val AUTO:Double = js.native
    }
    @js.native
    object GravityHint extends js.Object {
        val NATURAL:Double = js.native
        val STRONG:Double = js.native
        val LINE:Double = js.native
    }
    @js.native
    object RenderPart extends js.Object {
        val FOREGROUND:Double = js.native
        val BACKGROUND:Double = js.native
        val UNDERLINE:Double = js.native
        val STRIKETHROUGH:Double = js.native
    }
    @js.native
    object Script extends js.Object {
        val INVALID_CODE:Double = js.native
        val COMMON:Double = js.native
        val INHERITED:Double = js.native
        val ARABIC:Double = js.native
        val ARMENIAN:Double = js.native
        val BENGALI:Double = js.native
        val BOPOMOFO:Double = js.native
        val CHEROKEE:Double = js.native
        val COPTIC:Double = js.native
        val CYRILLIC:Double = js.native
        val DESERET:Double = js.native
        val DEVANAGARI:Double = js.native
        val ETHIOPIC:Double = js.native
        val GEORGIAN:Double = js.native
        val GOTHIC:Double = js.native
        val GREEK:Double = js.native
        val GUJARATI:Double = js.native
        val GURMUKHI:Double = js.native
        val HAN:Double = js.native
        val HANGUL:Double = js.native
        val HEBREW:Double = js.native
        val HIRAGANA:Double = js.native
        val KANNADA:Double = js.native
        val KATAKANA:Double = js.native
        val KHMER:Double = js.native
        val LAO:Double = js.native
        val LATIN:Double = js.native
        val MALAYALAM:Double = js.native
        val MONGOLIAN:Double = js.native
        val MYANMAR:Double = js.native
        val OGHAM:Double = js.native
        val OLD_ITALIC:Double = js.native
        val ORIYA:Double = js.native
        val RUNIC:Double = js.native
        val SINHALA:Double = js.native
        val SYRIAC:Double = js.native
        val TAMIL:Double = js.native
        val TELUGU:Double = js.native
        val THAANA:Double = js.native
        val THAI:Double = js.native
        val TIBETAN:Double = js.native
        val CANADIAN_ABORIGINAL:Double = js.native
        val YI:Double = js.native
        val TAGALOG:Double = js.native
        val HANUNOO:Double = js.native
        val BUHID:Double = js.native
        val TAGBANWA:Double = js.native
        val BRAILLE:Double = js.native
        val CYPRIOT:Double = js.native
        val LIMBU:Double = js.native
        val OSMANYA:Double = js.native
        val SHAVIAN:Double = js.native
        val LINEAR_B:Double = js.native
        val TAI_LE:Double = js.native
        val UGARITIC:Double = js.native
        val NEW_TAI_LUE:Double = js.native
        val BUGINESE:Double = js.native
        val GLAGOLITIC:Double = js.native
        val TIFINAGH:Double = js.native
        val SYLOTI_NAGRI:Double = js.native
        val OLD_PERSIAN:Double = js.native
        val KHAROSHTHI:Double = js.native
        val UNKNOWN:Double = js.native
        val BALINESE:Double = js.native
        val CUNEIFORM:Double = js.native
        val PHOENICIAN:Double = js.native
        val PHAGS_PA:Double = js.native
        val NKO:Double = js.native
        val KAYAH_LI:Double = js.native
        val LEPCHA:Double = js.native
        val REJANG:Double = js.native
        val SUNDANESE:Double = js.native
        val SAURASHTRA:Double = js.native
        val CHAM:Double = js.native
        val OL_CHIKI:Double = js.native
        val VAI:Double = js.native
        val CARIAN:Double = js.native
        val LYCIAN:Double = js.native
        val LYDIAN:Double = js.native
        val BATAK:Double = js.native
        val BRAHMI:Double = js.native
        val MANDAIC:Double = js.native
        val CHAKMA:Double = js.native
        val MEROITIC_CURSIVE:Double = js.native
        val MEROITIC_HIEROGLYPHS:Double = js.native
        val MIAO:Double = js.native
        val SHARADA:Double = js.native
        val SORA_SOMPENG:Double = js.native
        val TAKRI:Double = js.native
    }
    @js.native
    object Stretch extends js.Object {
        val ULTRA_CONDENSED:Double = js.native
        val EXTRA_CONDENSED:Double = js.native
        val CONDENSED:Double = js.native
        val SEMI_CONDENSED:Double = js.native
        val NORMAL:Double = js.native
        val SEMI_EXPANDED:Double = js.native
        val EXPANDED:Double = js.native
        val EXTRA_EXPANDED:Double = js.native
        val ULTRA_EXPANDED:Double = js.native
    }
    @js.native
    object Style extends js.Object {
        val NORMAL:Double = js.native
        val OBLIQUE:Double = js.native
        val ITALIC:Double = js.native
    }
    @js.native
    object TabAlign extends js.Object {
        val LEFT:Double = js.native
    }
    @js.native
    object Underline extends js.Object {
        val NONE:Double = js.native
        val SINGLE:Double = js.native
        val DOUBLE:Double = js.native
        val LOW:Double = js.native
        val ERROR:Double = js.native
    }
    @js.native
    object Variant extends js.Object {
        val NORMAL:Double = js.native
        val SMALL_CAPS:Double = js.native
    }
    @js.native
    object Weight extends js.Object {
        val THIN:Double = js.native
        val ULTRALIGHT:Double = js.native
        val LIGHT:Double = js.native
        val SEMILIGHT:Double = js.native
        val BOOK:Double = js.native
        val NORMAL:Double = js.native
        val MEDIUM:Double = js.native
        val SEMIBOLD:Double = js.native
        val BOLD:Double = js.native
        val ULTRABOLD:Double = js.native
        val HEAVY:Double = js.native
        val ULTRAHEAVY:Double = js.native
    }
    @js.native
    object WrapMode extends js.Object {
        val WORD:Double = js.native
        val CHAR:Double = js.native
        val WORD_CHAR:Double = js.native
    }
    @js.native
    object FontMask extends js.Object {
        val FAMILY:Double = js.native
        val STYLE:Double = js.native
        val VARIANT:Double = js.native
        val WEIGHT:Double = js.native
        val STRETCH:Double = js.native
        val SIZE:Double = js.native
        val GRAVITY:Double = js.native
    }
    @js.native
    class Context extends GObject.Object {
        def this(config: js.Any) = this()
        def changed():Unit = js.native
        def get_base_dir():Double = js.native
        def get_base_gravity():Double = js.native
        def get_font_description():Any = js.native
        def get_font_map():FontMap = js.native
        def get_gravity():Double = js.native
        def get_gravity_hint():Double = js.native
        def get_language():Any = js.native
        def get_matrix():Any = js.native
        def get_metrics(desc: Any, language: Any):Any = js.native
        def get_serial():Any = js.native
        def list_families(families: js.Array[FontFamily], n_families: Any):Unit = js.native
        def load_font(desc: Any):Font = js.native
        def load_fontset(desc: Any, language: Any):Fontset = js.native
        def set_base_dir(direction: Double):Unit = js.native
        def set_base_gravity(gravity: Double):Unit = js.native
        def set_font_description(desc: Any):Unit = js.native
        def set_font_map(font_map: FontMap):Unit = js.native
        def set_gravity_hint(hint: Double):Unit = js.native
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
        def find_shaper(language: Any, ch: Any):EngineShape = js.native
        def get_coverage(language: Any):Any = js.native
        def get_font_map():FontMap = js.native
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
        def list_faces(faces: js.Array[FontFace], n_faces: Any):Unit = js.native
    }
    @js.native
    class FontMap extends GObject.Object {
        def changed():Unit = js.native
        def create_context():Context = js.native
        def get_serial():Any = js.native
        def get_shape_engine_type():String = js.native
        def list_families(families: js.Array[FontFamily], n_families: Any):Unit = js.native
        def load_font(context: Context, desc: Any):Font = js.native
        def load_fontset(context: Context, desc: Any, language: Any):Fontset = js.native
    }
    @js.native
    class Fontset extends GObject.Object {
        def foreach(func: Any, data: Object):Unit = js.native
        def get_font(wc: Any):Font = js.native
        def get_metrics():Any = js.native
    }
    @js.native
    class FontsetSimple extends Fontset {
        def this(config: js.Any) = this()
        def append(font: Font):Unit = js.native
        def size():Any = js.native
    }
    @js.native
    class Layout extends GObject.Object {
        def this(config: js.Any) = this()
        def context_changed():Unit = js.native
        def copy():Layout = js.native
        def get_alignment():Double = js.native
        def get_attributes():Any = js.native
        def get_auto_dir():Boolean = js.native
        def get_baseline():Any = js.native
        def get_character_count():Any = js.native
        def get_context():Context = js.native
        def get_cursor_pos(index0: Any, strong_pos: Any, weak_pos: Any):Unit = js.native
        def get_ellipsize():Double = js.native
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
        def get_wrap():Double = js.native
        def index_to_line_x(index0: Any, trailing: Boolean, line: Any, x_pos: Any):Unit = js.native
        def index_to_pos(index0: Any, pos: Any):Unit = js.native
        def is_ellipsized():Boolean = js.native
        def is_wrapped():Boolean = js.native
        def move_cursor_visually(strong: Boolean, old_index: Any, old_trailing: Any, direction: Any, new_index: Any, new_trailing: Any):Unit = js.native
        def set_alignment(alignment: Double):Unit = js.native
        def set_attributes(attrs: Any):Unit = js.native
        def set_auto_dir(auto_dir: Boolean):Unit = js.native
        def set_ellipsize(ellipsize: Double):Unit = js.native
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
        def set_wrap(wrap: Double):Unit = js.native
        def xy_to_index(x: Any, y: Any, index0: Any, trailing: Any):Boolean = js.native
    }
    @js.native
    class Renderer extends GObject.Object {
        def activate():Unit = js.native
        def deactivate():Unit = js.native
        def draw_error_underline(x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def draw_glyph(font: Font, glyph: Any, x: Any, y: Any):Unit = js.native
        def draw_glyph_item(text: String, glyph_item: Any, x: Any, y: Any):Unit = js.native
        def draw_glyphs(font: Font, glyphs: Any, x: Any, y: Any):Unit = js.native
        def draw_layout(layout: Layout, x: Any, y: Any):Unit = js.native
        def draw_layout_line(line: Any, x: Any, y: Any):Unit = js.native
        def draw_rectangle(part: Double, x: Any, y: Any, width: Any, height: Any):Unit = js.native
        def draw_trapezoid(part: Double, y10: Any, x11: Any, x21: Any, y2: Any, x12: Any, x22: Any):Unit = js.native
        def get_alpha(part: Double):Any = js.native
        def get_color(part: Double):Any = js.native
        def get_layout():Layout = js.native
        def get_layout_line():Any = js.native
        def get_matrix():Any = js.native
        def part_changed(part: Double):Unit = js.native
        def set_alpha(part: Double, alpha: Any):Unit = js.native
        def set_color(part: Double, color: Any):Unit = js.native
        def set_matrix(matrix: Any):Unit = js.native
    }
}