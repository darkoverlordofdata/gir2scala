/**
 * Atk.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Atk")
@js.native
object Atk extends js.Object {
    val BINARY_AGE:Any = js.native
    val INTERFACE_AGE:Any = js.native
    val MAJOR_VERSION:Any = js.native
    val MICRO_VERSION:Any = js.native
    val MINOR_VERSION:Any = js.native
    val VERSION_MIN_REQUIRED:Any = js.native
    def add_focus_tracker(focus_tracker: Any):Any = js.native
    def add_global_event_listener(listener: Any, event_type0: String):Any = js.native
    def add_key_event_listener(listener: Any, data: Object):Any = js.native
    def attribute_set_free(attrib_set: Any):Unit = js.native
    def focus_tracker_init(init: Any):Unit = js.native
    def focus_tracker_notify(object0: Any):Unit = js.native
    def get_binary_age():Any = js.native
    def get_default_registry():Any = js.native
    def get_focus_object():Any = js.native
    def get_interface_age():Any = js.native
    def get_major_version():Any = js.native
    def get_micro_version():Any = js.native
    def get_minor_version():Any = js.native
    def get_root():Any = js.native
    def get_toolkit_name():String = js.native
    def get_toolkit_version():String = js.native
    def get_version():String = js.native
    def relation_type_for_name(name: String):Any = js.native
    def relation_type_get_name(type0: Any):String = js.native
    def relation_type_register(name: String):Any = js.native
    def remove_focus_tracker(tracker_id: Any):Unit = js.native
    def remove_global_event_listener(listener_id: Any):Unit = js.native
    def remove_key_event_listener(listener_id: Any):Unit = js.native
    def role_for_name(name: String):Any = js.native
    def role_get_localized_name(role: Any):String = js.native
    def role_get_name(role: Any):String = js.native
    def role_register(name: String):Any = js.native
    def state_type_for_name(name: String):Any = js.native
    def state_type_get_name(type0: Any):String = js.native
    def state_type_register(name: String):Any = js.native
    def text_attribute_for_name(name: String):Any = js.native
    def text_attribute_get_name(attr: Any):String = js.native
    def text_attribute_get_value(attr: Any, index0: Any):String = js.native
    def text_attribute_register(name: String):Any = js.native
    def text_free_ranges(ranges: js.Array[Any]):Unit = js.native
    def value_type_get_localized_name(value_type0: Any):String = js.native
    def value_type_get_name(value_type0: Any):String = js.native
    @js.native
    object CoordType extends js.Object {
        val SCREEN:js.Dynamic = js.native
        val WINDOW:js.Dynamic = js.native
    }
    @js.native
    object KeyEventType extends js.Object {
        val PRESS:js.Dynamic = js.native
        val RELEASE:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object Layer extends js.Object {
        val INVALID:js.Dynamic = js.native
        val BACKGROUND:js.Dynamic = js.native
        val CANVAS:js.Dynamic = js.native
        val WIDGET:js.Dynamic = js.native
        val MDI:js.Dynamic = js.native
        val POPUP:js.Dynamic = js.native
        val OVERLAY:js.Dynamic = js.native
        val WINDOW:js.Dynamic = js.native
    }
    @js.native
    object RelationType extends js.Object {
        val NULL:js.Dynamic = js.native
        val CONTROLLED_BY:js.Dynamic = js.native
        val CONTROLLER_FOR:js.Dynamic = js.native
        val LABEL_FOR:js.Dynamic = js.native
        val LABELLED_BY:js.Dynamic = js.native
        val MEMBER_OF:js.Dynamic = js.native
        val NODE_CHILD_OF:js.Dynamic = js.native
        val FLOWS_TO:js.Dynamic = js.native
        val FLOWS_FROM:js.Dynamic = js.native
        val SUBWINDOW_OF:js.Dynamic = js.native
        val EMBEDS:js.Dynamic = js.native
        val EMBEDDED_BY:js.Dynamic = js.native
        val POPUP_FOR:js.Dynamic = js.native
        val PARENT_WINDOW_OF:js.Dynamic = js.native
        val DESCRIBED_BY:js.Dynamic = js.native
        val DESCRIPTION_FOR:js.Dynamic = js.native
        val NODE_PARENT_OF:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object Role extends js.Object {
        val INVALID:js.Dynamic = js.native
        val ACCELERATOR_LABEL:js.Dynamic = js.native
        val ALERT:js.Dynamic = js.native
        val ANIMATION:js.Dynamic = js.native
        val ARROW:js.Dynamic = js.native
        val CALENDAR:js.Dynamic = js.native
        val CANVAS:js.Dynamic = js.native
        val CHECK_BOX:js.Dynamic = js.native
        val CHECK_MENU_ITEM:js.Dynamic = js.native
        val COLOR_CHOOSER:js.Dynamic = js.native
        val COLUMN_HEADER:js.Dynamic = js.native
        val COMBO_BOX:js.Dynamic = js.native
        val DATE_EDITOR:js.Dynamic = js.native
        val DESKTOP_ICON:js.Dynamic = js.native
        val DESKTOP_FRAME:js.Dynamic = js.native
        val DIAL:js.Dynamic = js.native
        val DIALOG:js.Dynamic = js.native
        val DIRECTORY_PANE:js.Dynamic = js.native
        val DRAWING_AREA:js.Dynamic = js.native
        val FILE_CHOOSER:js.Dynamic = js.native
        val FILLER:js.Dynamic = js.native
        val FONT_CHOOSER:js.Dynamic = js.native
        val FRAME:js.Dynamic = js.native
        val GLASS_PANE:js.Dynamic = js.native
        val HTML_CONTAINER:js.Dynamic = js.native
        val ICON:js.Dynamic = js.native
        val IMAGE:js.Dynamic = js.native
        val INTERNAL_FRAME:js.Dynamic = js.native
        val LABEL:js.Dynamic = js.native
        val LAYERED_PANE:js.Dynamic = js.native
        val LIST:js.Dynamic = js.native
        val LIST_ITEM:js.Dynamic = js.native
        val MENU:js.Dynamic = js.native
        val MENU_BAR:js.Dynamic = js.native
        val MENU_ITEM:js.Dynamic = js.native
        val OPTION_PANE:js.Dynamic = js.native
        val PAGE_TAB:js.Dynamic = js.native
        val PAGE_TAB_LIST:js.Dynamic = js.native
        val PANEL:js.Dynamic = js.native
        val PASSWORD_TEXT:js.Dynamic = js.native
        val POPUP_MENU:js.Dynamic = js.native
        val PROGRESS_BAR:js.Dynamic = js.native
        val PUSH_BUTTON:js.Dynamic = js.native
        val RADIO_BUTTON:js.Dynamic = js.native
        val RADIO_MENU_ITEM:js.Dynamic = js.native
        val ROOT_PANE:js.Dynamic = js.native
        val ROW_HEADER:js.Dynamic = js.native
        val SCROLL_BAR:js.Dynamic = js.native
        val SCROLL_PANE:js.Dynamic = js.native
        val SEPARATOR:js.Dynamic = js.native
        val SLIDER:js.Dynamic = js.native
        val SPLIT_PANE:js.Dynamic = js.native
        val SPIN_BUTTON:js.Dynamic = js.native
        val STATUSBAR:js.Dynamic = js.native
        val TABLE:js.Dynamic = js.native
        val TABLE_CELL:js.Dynamic = js.native
        val TABLE_COLUMN_HEADER:js.Dynamic = js.native
        val TABLE_ROW_HEADER:js.Dynamic = js.native
        val TEAR_OFF_MENU_ITEM:js.Dynamic = js.native
        val TERMINAL:js.Dynamic = js.native
        val TEXT:js.Dynamic = js.native
        val TOGGLE_BUTTON:js.Dynamic = js.native
        val TOOL_BAR:js.Dynamic = js.native
        val TOOL_TIP:js.Dynamic = js.native
        val TREE:js.Dynamic = js.native
        val TREE_TABLE:js.Dynamic = js.native
        val UNKNOWN:js.Dynamic = js.native
        val VIEWPORT:js.Dynamic = js.native
        val WINDOW:js.Dynamic = js.native
        val HEADER:js.Dynamic = js.native
        val FOOTER:js.Dynamic = js.native
        val PARAGRAPH:js.Dynamic = js.native
        val RULER:js.Dynamic = js.native
        val APPLICATION:js.Dynamic = js.native
        val AUTOCOMPLETE:js.Dynamic = js.native
        val EDIT_BAR:js.Dynamic = js.native
        val EMBEDDED:js.Dynamic = js.native
        val ENTRY:js.Dynamic = js.native
        val CHART:js.Dynamic = js.native
        val CAPTION:js.Dynamic = js.native
        val DOCUMENT_FRAME:js.Dynamic = js.native
        val HEADING:js.Dynamic = js.native
        val PAGE:js.Dynamic = js.native
        val SECTION:js.Dynamic = js.native
        val REDUNDANT_OBJECT:js.Dynamic = js.native
        val FORM:js.Dynamic = js.native
        val LINK:js.Dynamic = js.native
        val INPUT_METHOD_WINDOW:js.Dynamic = js.native
        val TABLE_ROW:js.Dynamic = js.native
        val TREE_ITEM:js.Dynamic = js.native
        val DOCUMENT_SPREADSHEET:js.Dynamic = js.native
        val DOCUMENT_PRESENTATION:js.Dynamic = js.native
        val DOCUMENT_TEXT:js.Dynamic = js.native
        val DOCUMENT_WEB:js.Dynamic = js.native
        val DOCUMENT_EMAIL:js.Dynamic = js.native
        val COMMENT:js.Dynamic = js.native
        val LIST_BOX:js.Dynamic = js.native
        val GROUPING:js.Dynamic = js.native
        val IMAGE_MAP:js.Dynamic = js.native
        val NOTIFICATION:js.Dynamic = js.native
        val INFO_BAR:js.Dynamic = js.native
        val LEVEL_BAR:js.Dynamic = js.native
        val TITLE_BAR:js.Dynamic = js.native
        val BLOCK_QUOTE:js.Dynamic = js.native
        val AUDIO:js.Dynamic = js.native
        val VIDEO:js.Dynamic = js.native
        val DEFINITION:js.Dynamic = js.native
        val ARTICLE:js.Dynamic = js.native
        val LANDMARK:js.Dynamic = js.native
        val LOG:js.Dynamic = js.native
        val MARQUEE:js.Dynamic = js.native
        val MATH:js.Dynamic = js.native
        val RATING:js.Dynamic = js.native
        val TIMER:js.Dynamic = js.native
        val DESCRIPTION_LIST:js.Dynamic = js.native
        val DESCRIPTION_TERM:js.Dynamic = js.native
        val DESCRIPTION_VALUE:js.Dynamic = js.native
        val STATIC:js.Dynamic = js.native
        val MATH_FRACTION:js.Dynamic = js.native
        val MATH_ROOT:js.Dynamic = js.native
        val SUBSCRIPT:js.Dynamic = js.native
        val SUPERSCRIPT:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object StateType extends js.Object {
        val INVALID:js.Dynamic = js.native
        val ACTIVE:js.Dynamic = js.native
        val ARMED:js.Dynamic = js.native
        val BUSY:js.Dynamic = js.native
        val CHECKED:js.Dynamic = js.native
        val DEFUNCT:js.Dynamic = js.native
        val EDITABLE:js.Dynamic = js.native
        val ENABLED:js.Dynamic = js.native
        val EXPANDABLE:js.Dynamic = js.native
        val EXPANDED:js.Dynamic = js.native
        val FOCUSABLE:js.Dynamic = js.native
        val FOCUSED:js.Dynamic = js.native
        val HORIZONTAL:js.Dynamic = js.native
        val ICONIFIED:js.Dynamic = js.native
        val MODAL:js.Dynamic = js.native
        val MULTI_LINE:js.Dynamic = js.native
        val MULTISELECTABLE:js.Dynamic = js.native
        val OPAQUE:js.Dynamic = js.native
        val PRESSED:js.Dynamic = js.native
        val RESIZABLE:js.Dynamic = js.native
        val SELECTABLE:js.Dynamic = js.native
        val SELECTED:js.Dynamic = js.native
        val SENSITIVE:js.Dynamic = js.native
        val SHOWING:js.Dynamic = js.native
        val SINGLE_LINE:js.Dynamic = js.native
        val STALE:js.Dynamic = js.native
        val TRANSIENT:js.Dynamic = js.native
        val VERTICAL:js.Dynamic = js.native
        val VISIBLE:js.Dynamic = js.native
        val MANAGES_DESCENDANTS:js.Dynamic = js.native
        val INDETERMINATE:js.Dynamic = js.native
        val TRUNCATED:js.Dynamic = js.native
        val REQUIRED:js.Dynamic = js.native
        val INVALID_ENTRY:js.Dynamic = js.native
        val SUPPORTS_AUTOCOMPLETION:js.Dynamic = js.native
        val SELECTABLE_TEXT:js.Dynamic = js.native
        val DEFAULT:js.Dynamic = js.native
        val ANIMATED:js.Dynamic = js.native
        val VISITED:js.Dynamic = js.native
        val CHECKABLE:js.Dynamic = js.native
        val HAS_POPUP:js.Dynamic = js.native
        val HAS_TOOLTIP:js.Dynamic = js.native
        val READ_ONLY:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object TextAttribute extends js.Object {
        val INVALID:js.Dynamic = js.native
        val LEFT_MARGIN:js.Dynamic = js.native
        val RIGHT_MARGIN:js.Dynamic = js.native
        val INDENT:js.Dynamic = js.native
        val INVISIBLE:js.Dynamic = js.native
        val EDITABLE:js.Dynamic = js.native
        val PIXELS_ABOVE_LINES:js.Dynamic = js.native
        val PIXELS_BELOW_LINES:js.Dynamic = js.native
        val PIXELS_INSIDE_WRAP:js.Dynamic = js.native
        val BG_FULL_HEIGHT:js.Dynamic = js.native
        val RISE:js.Dynamic = js.native
        val UNDERLINE:js.Dynamic = js.native
        val STRIKETHROUGH:js.Dynamic = js.native
        val SIZE:js.Dynamic = js.native
        val SCALE:js.Dynamic = js.native
        val WEIGHT:js.Dynamic = js.native
        val LANGUAGE:js.Dynamic = js.native
        val FAMILY_NAME:js.Dynamic = js.native
        val BG_COLOR:js.Dynamic = js.native
        val FG_COLOR:js.Dynamic = js.native
        val BG_STIPPLE:js.Dynamic = js.native
        val FG_STIPPLE:js.Dynamic = js.native
        val WRAP_MODE:js.Dynamic = js.native
        val DIRECTION:js.Dynamic = js.native
        val JUSTIFICATION:js.Dynamic = js.native
        val STRETCH:js.Dynamic = js.native
        val VARIANT:js.Dynamic = js.native
        val STYLE:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object TextBoundary extends js.Object {
        val CHAR:js.Dynamic = js.native
        val WORD_START:js.Dynamic = js.native
        val WORD_END:js.Dynamic = js.native
        val SENTENCE_START:js.Dynamic = js.native
        val SENTENCE_END:js.Dynamic = js.native
        val LINE_START:js.Dynamic = js.native
        val LINE_END:js.Dynamic = js.native
    }
    @js.native
    object TextClipType extends js.Object {
        val NONE:js.Dynamic = js.native
        val MIN:js.Dynamic = js.native
        val MAX:js.Dynamic = js.native
        val BOTH:js.Dynamic = js.native
    }
    @js.native
    object TextGranularity extends js.Object {
        val CHAR:js.Dynamic = js.native
        val WORD:js.Dynamic = js.native
        val SENTENCE:js.Dynamic = js.native
        val LINE:js.Dynamic = js.native
        val PARAGRAPH:js.Dynamic = js.native
    }
    @js.native
    object ValueType extends js.Object {
        val VERY_WEAK:js.Dynamic = js.native
        val WEAK:js.Dynamic = js.native
        val ACCEPTABLE:js.Dynamic = js.native
        val STRONG:js.Dynamic = js.native
        val VERY_STRONG:js.Dynamic = js.native
        val VERY_LOW:js.Dynamic = js.native
        val LOW:js.Dynamic = js.native
        val MEDIUM:js.Dynamic = js.native
        val HIGH:js.Dynamic = js.native
        val VERY_HIGH:js.Dynamic = js.native
        val VERY_BAD:js.Dynamic = js.native
        val BAD:js.Dynamic = js.native
        val GOOD:js.Dynamic = js.native
        val VERY_GOOD:js.Dynamic = js.native
        val BEST:js.Dynamic = js.native
        val LAST_DEFINED:js.Dynamic = js.native
    }
    @js.native
    object HyperlinkStateFlags extends js.Object {
        val INLINE:js.Dynamic = js.native
    }
    @js.native
    class GObjectAccessible extends GObject.Object {
        def get_object():Any = js.native
    }
    @js.native
    object GObjectAccessible extends js.Object {
        def for_object(obj: Any):Any = js.native
    }
    @js.native
    class Hyperlink extends GObject.Object {
        def get_end_index():Any = js.native
        def get_n_anchors():Any = js.native
        def get_object(i: Any):Any = js.native
        def get_start_index():Any = js.native
        def get_uri(i: Any):String = js.native
        def is_inline():Boolean = js.native
        def is_selected_link():Boolean = js.native
        def is_valid():Boolean = js.native
    }
    @js.native
    class Misc extends GObject.Object {
        def threads_enter():Unit = js.native
        def threads_leave():Unit = js.native
    }
    @js.native
    object Misc extends js.Object {
        def get_instance():Any = js.native
    }
    @js.native
    class NoOpObject extends GObject.Object {
        def this(config: js.Any) = this()
    }
    @js.native
    class NoOpObjectFactory extends ObjectFactory {
        def this(config: js.Any) = this()
    }
    @js.native
    class Object extends GObject.Object {
        def add_relationship(relationship: Any, target: Any):Boolean = js.native
        def connect_property_change_handler(handler: Any):Any = js.native
        def get_attributes():Any = js.native
        def get_description():String = js.native
        def get_index_in_parent():Any = js.native
        def get_layer():Any = js.native
        def get_mdi_zorder():Any = js.native
        def get_n_accessible_children():Any = js.native
        def get_name():String = js.native
        def get_object_locale():String = js.native
        def get_parent():Any = js.native
        def get_role():Any = js.native
        def initialize(data: Object):Unit = js.native
        def notify_state_change(state: Any, value: Boolean):Unit = js.native
        def peek_parent():Any = js.native
        def ref_accessible_child(i: Any):Any = js.native
        def ref_relation_set():Any = js.native
        def ref_state_set():Any = js.native
        def remove_property_change_handler(handler_id: Any):Unit = js.native
        def remove_relationship(relationship: Any, target: Any):Boolean = js.native
        def set_description(description: String):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_parent(parent: Any):Unit = js.native
        def set_role(role: Any):Unit = js.native
    }
    @js.native
    class ObjectFactory extends GObject.Object {
        def create_accessible(obj: Any):Any = js.native
        def get_accessible_type():Any = js.native
        def invalidate():Unit = js.native
    }
    @js.native
    class Plug extends GObject.Object {
        def this(config: js.Any) = this()
        def get_id():String = js.native
    }
    @js.native
    class Registry extends GObject.Object {
        def get_factory(type0: Any):Any = js.native
        def get_factory_type(type0: Any):Any = js.native
        def set_factory_type(type0: Any, factory_type0: Any):Unit = js.native
    }
    @js.native
    class Relation extends GObject.Object {
        def this(config: js.Any) = this()
        def add_target(target: Any):Unit = js.native
        def get_relation_type():Any = js.native
        def get_target():js.Array[Any] = js.native
        def remove_target(target: Any):Boolean = js.native
    }
    @js.native
    class RelationSet extends GObject.Object {
        def this(config: js.Any) = this()
        def add(relation: Any):Unit = js.native
        def add_relation_by_type(relationship: Any, target: Any):Unit = js.native
        def contains(relationship: Any):Boolean = js.native
        def contains_target(relationship: Any, target: Any):Boolean = js.native
        def get_n_relations():Any = js.native
        def get_relation(i: Any):Any = js.native
        def get_relation_by_type(relationship: Any):Any = js.native
        def remove(relation: Any):Unit = js.native
    }
    @js.native
    class Socket extends GObject.Object {
        def this(config: js.Any) = this()
        def embed(plug_id: String):Unit = js.native
        def is_occupied():Boolean = js.native
    }
    @js.native
    class StateSet extends GObject.Object {
        def this(config: js.Any) = this()
        def add_state(type0: Any):Boolean = js.native
        def add_states(types: js.Array[Any], n_types: Any):Unit = js.native
        def and_sets(compare_set: Any):Any = js.native
        def clear_states():Unit = js.native
        def contains_state(type0: Any):Boolean = js.native
        def contains_states(types: js.Array[Any], n_types: Any):Boolean = js.native
        def is_empty():Boolean = js.native
        def or_sets(compare_set: Any):Any = js.native
        def remove_state(type0: Any):Boolean = js.native
        def xor_sets(compare_set: Any):Any = js.native
    }
    @js.native
    class Util extends GObject.Object {
    }
}