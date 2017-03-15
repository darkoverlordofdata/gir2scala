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
    def focus_tracker_notify(object0: Object):Unit = js.native
    def get_binary_age():Any = js.native
    def get_default_registry():Registry = js.native
    def get_focus_object():Object = js.native
    def get_interface_age():Any = js.native
    def get_major_version():Any = js.native
    def get_micro_version():Any = js.native
    def get_minor_version():Any = js.native
    def get_root():Object = js.native
    def get_toolkit_name():String = js.native
    def get_toolkit_version():String = js.native
    def get_version():String = js.native
    def relation_type_for_name(name: String):Double = js.native
    def relation_type_get_name(type0: Double):String = js.native
    def relation_type_register(name: String):Double = js.native
    def remove_focus_tracker(tracker_id: Any):Unit = js.native
    def remove_global_event_listener(listener_id: Any):Unit = js.native
    def remove_key_event_listener(listener_id: Any):Unit = js.native
    def role_for_name(name: String):Double = js.native
    def role_get_localized_name(role: Double):String = js.native
    def role_get_name(role: Double):String = js.native
    def role_register(name: String):Double = js.native
    def state_type_for_name(name: String):Double = js.native
    def state_type_get_name(type0: Double):String = js.native
    def state_type_register(name: String):Double = js.native
    def text_attribute_for_name(name: String):Double = js.native
    def text_attribute_get_name(attr: Double):String = js.native
    def text_attribute_get_value(attr: Double, index0: Any):String = js.native
    def text_attribute_register(name: String):Double = js.native
    def text_free_ranges(ranges: js.Array[Any]):Unit = js.native
    def value_type_get_localized_name(value_type0: Double):String = js.native
    def value_type_get_name(value_type0: Double):String = js.native
    @js.native
    object CoordType extends js.Object {
        val SCREEN:Double = js.native
        val WINDOW:Double = js.native
    }
    @js.native
    object KeyEventType extends js.Object {
        val PRESS:Double = js.native
        val RELEASE:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object Layer extends js.Object {
        val INVALID:Double = js.native
        val BACKGROUND:Double = js.native
        val CANVAS:Double = js.native
        val WIDGET:Double = js.native
        val MDI:Double = js.native
        val POPUP:Double = js.native
        val OVERLAY:Double = js.native
        val WINDOW:Double = js.native
    }
    @js.native
    object RelationType extends js.Object {
        val NULL:Double = js.native
        val CONTROLLED_BY:Double = js.native
        val CONTROLLER_FOR:Double = js.native
        val LABEL_FOR:Double = js.native
        val LABELLED_BY:Double = js.native
        val MEMBER_OF:Double = js.native
        val NODE_CHILD_OF:Double = js.native
        val FLOWS_TO:Double = js.native
        val FLOWS_FROM:Double = js.native
        val SUBWINDOW_OF:Double = js.native
        val EMBEDS:Double = js.native
        val EMBEDDED_BY:Double = js.native
        val POPUP_FOR:Double = js.native
        val PARENT_WINDOW_OF:Double = js.native
        val DESCRIBED_BY:Double = js.native
        val DESCRIPTION_FOR:Double = js.native
        val NODE_PARENT_OF:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object Role extends js.Object {
        val INVALID:Double = js.native
        val ACCELERATOR_LABEL:Double = js.native
        val ALERT:Double = js.native
        val ANIMATION:Double = js.native
        val ARROW:Double = js.native
        val CALENDAR:Double = js.native
        val CANVAS:Double = js.native
        val CHECK_BOX:Double = js.native
        val CHECK_MENU_ITEM:Double = js.native
        val COLOR_CHOOSER:Double = js.native
        val COLUMN_HEADER:Double = js.native
        val COMBO_BOX:Double = js.native
        val DATE_EDITOR:Double = js.native
        val DESKTOP_ICON:Double = js.native
        val DESKTOP_FRAME:Double = js.native
        val DIAL:Double = js.native
        val DIALOG:Double = js.native
        val DIRECTORY_PANE:Double = js.native
        val DRAWING_AREA:Double = js.native
        val FILE_CHOOSER:Double = js.native
        val FILLER:Double = js.native
        val FONT_CHOOSER:Double = js.native
        val FRAME:Double = js.native
        val GLASS_PANE:Double = js.native
        val HTML_CONTAINER:Double = js.native
        val ICON:Double = js.native
        val IMAGE:Double = js.native
        val INTERNAL_FRAME:Double = js.native
        val LABEL:Double = js.native
        val LAYERED_PANE:Double = js.native
        val LIST:Double = js.native
        val LIST_ITEM:Double = js.native
        val MENU:Double = js.native
        val MENU_BAR:Double = js.native
        val MENU_ITEM:Double = js.native
        val OPTION_PANE:Double = js.native
        val PAGE_TAB:Double = js.native
        val PAGE_TAB_LIST:Double = js.native
        val PANEL:Double = js.native
        val PASSWORD_TEXT:Double = js.native
        val POPUP_MENU:Double = js.native
        val PROGRESS_BAR:Double = js.native
        val PUSH_BUTTON:Double = js.native
        val RADIO_BUTTON:Double = js.native
        val RADIO_MENU_ITEM:Double = js.native
        val ROOT_PANE:Double = js.native
        val ROW_HEADER:Double = js.native
        val SCROLL_BAR:Double = js.native
        val SCROLL_PANE:Double = js.native
        val SEPARATOR:Double = js.native
        val SLIDER:Double = js.native
        val SPLIT_PANE:Double = js.native
        val SPIN_BUTTON:Double = js.native
        val STATUSBAR:Double = js.native
        val TABLE:Double = js.native
        val TABLE_CELL:Double = js.native
        val TABLE_COLUMN_HEADER:Double = js.native
        val TABLE_ROW_HEADER:Double = js.native
        val TEAR_OFF_MENU_ITEM:Double = js.native
        val TERMINAL:Double = js.native
        val TEXT:Double = js.native
        val TOGGLE_BUTTON:Double = js.native
        val TOOL_BAR:Double = js.native
        val TOOL_TIP:Double = js.native
        val TREE:Double = js.native
        val TREE_TABLE:Double = js.native
        val UNKNOWN:Double = js.native
        val VIEWPORT:Double = js.native
        val WINDOW:Double = js.native
        val HEADER:Double = js.native
        val FOOTER:Double = js.native
        val PARAGRAPH:Double = js.native
        val RULER:Double = js.native
        val APPLICATION:Double = js.native
        val AUTOCOMPLETE:Double = js.native
        val EDIT_BAR:Double = js.native
        val EMBEDDED:Double = js.native
        val ENTRY:Double = js.native
        val CHART:Double = js.native
        val CAPTION:Double = js.native
        val DOCUMENT_FRAME:Double = js.native
        val HEADING:Double = js.native
        val PAGE:Double = js.native
        val SECTION:Double = js.native
        val REDUNDANT_OBJECT:Double = js.native
        val FORM:Double = js.native
        val LINK:Double = js.native
        val INPUT_METHOD_WINDOW:Double = js.native
        val TABLE_ROW:Double = js.native
        val TREE_ITEM:Double = js.native
        val DOCUMENT_SPREADSHEET:Double = js.native
        val DOCUMENT_PRESENTATION:Double = js.native
        val DOCUMENT_TEXT:Double = js.native
        val DOCUMENT_WEB:Double = js.native
        val DOCUMENT_EMAIL:Double = js.native
        val COMMENT:Double = js.native
        val LIST_BOX:Double = js.native
        val GROUPING:Double = js.native
        val IMAGE_MAP:Double = js.native
        val NOTIFICATION:Double = js.native
        val INFO_BAR:Double = js.native
        val LEVEL_BAR:Double = js.native
        val TITLE_BAR:Double = js.native
        val BLOCK_QUOTE:Double = js.native
        val AUDIO:Double = js.native
        val VIDEO:Double = js.native
        val DEFINITION:Double = js.native
        val ARTICLE:Double = js.native
        val LANDMARK:Double = js.native
        val LOG:Double = js.native
        val MARQUEE:Double = js.native
        val MATH:Double = js.native
        val RATING:Double = js.native
        val TIMER:Double = js.native
        val DESCRIPTION_LIST:Double = js.native
        val DESCRIPTION_TERM:Double = js.native
        val DESCRIPTION_VALUE:Double = js.native
        val STATIC:Double = js.native
        val MATH_FRACTION:Double = js.native
        val MATH_ROOT:Double = js.native
        val SUBSCRIPT:Double = js.native
        val SUPERSCRIPT:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object StateType extends js.Object {
        val INVALID:Double = js.native
        val ACTIVE:Double = js.native
        val ARMED:Double = js.native
        val BUSY:Double = js.native
        val CHECKED:Double = js.native
        val DEFUNCT:Double = js.native
        val EDITABLE:Double = js.native
        val ENABLED:Double = js.native
        val EXPANDABLE:Double = js.native
        val EXPANDED:Double = js.native
        val FOCUSABLE:Double = js.native
        val FOCUSED:Double = js.native
        val HORIZONTAL:Double = js.native
        val ICONIFIED:Double = js.native
        val MODAL:Double = js.native
        val MULTI_LINE:Double = js.native
        val MULTISELECTABLE:Double = js.native
        val OPAQUE:Double = js.native
        val PRESSED:Double = js.native
        val RESIZABLE:Double = js.native
        val SELECTABLE:Double = js.native
        val SELECTED:Double = js.native
        val SENSITIVE:Double = js.native
        val SHOWING:Double = js.native
        val SINGLE_LINE:Double = js.native
        val STALE:Double = js.native
        val TRANSIENT:Double = js.native
        val VERTICAL:Double = js.native
        val VISIBLE:Double = js.native
        val MANAGES_DESCENDANTS:Double = js.native
        val INDETERMINATE:Double = js.native
        val TRUNCATED:Double = js.native
        val REQUIRED:Double = js.native
        val INVALID_ENTRY:Double = js.native
        val SUPPORTS_AUTOCOMPLETION:Double = js.native
        val SELECTABLE_TEXT:Double = js.native
        val DEFAULT:Double = js.native
        val ANIMATED:Double = js.native
        val VISITED:Double = js.native
        val CHECKABLE:Double = js.native
        val HAS_POPUP:Double = js.native
        val HAS_TOOLTIP:Double = js.native
        val READ_ONLY:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object TextAttribute extends js.Object {
        val INVALID:Double = js.native
        val LEFT_MARGIN:Double = js.native
        val RIGHT_MARGIN:Double = js.native
        val INDENT:Double = js.native
        val INVISIBLE:Double = js.native
        val EDITABLE:Double = js.native
        val PIXELS_ABOVE_LINES:Double = js.native
        val PIXELS_BELOW_LINES:Double = js.native
        val PIXELS_INSIDE_WRAP:Double = js.native
        val BG_FULL_HEIGHT:Double = js.native
        val RISE:Double = js.native
        val UNDERLINE:Double = js.native
        val STRIKETHROUGH:Double = js.native
        val SIZE:Double = js.native
        val SCALE:Double = js.native
        val WEIGHT:Double = js.native
        val LANGUAGE:Double = js.native
        val FAMILY_NAME:Double = js.native
        val BG_COLOR:Double = js.native
        val FG_COLOR:Double = js.native
        val BG_STIPPLE:Double = js.native
        val FG_STIPPLE:Double = js.native
        val WRAP_MODE:Double = js.native
        val DIRECTION:Double = js.native
        val JUSTIFICATION:Double = js.native
        val STRETCH:Double = js.native
        val VARIANT:Double = js.native
        val STYLE:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object TextBoundary extends js.Object {
        val CHAR:Double = js.native
        val WORD_START:Double = js.native
        val WORD_END:Double = js.native
        val SENTENCE_START:Double = js.native
        val SENTENCE_END:Double = js.native
        val LINE_START:Double = js.native
        val LINE_END:Double = js.native
    }
    @js.native
    object TextClipType extends js.Object {
        val NONE:Double = js.native
        val MIN:Double = js.native
        val MAX:Double = js.native
        val BOTH:Double = js.native
    }
    @js.native
    object TextGranularity extends js.Object {
        val CHAR:Double = js.native
        val WORD:Double = js.native
        val SENTENCE:Double = js.native
        val LINE:Double = js.native
        val PARAGRAPH:Double = js.native
    }
    @js.native
    object ValueType extends js.Object {
        val VERY_WEAK:Double = js.native
        val WEAK:Double = js.native
        val ACCEPTABLE:Double = js.native
        val STRONG:Double = js.native
        val VERY_STRONG:Double = js.native
        val VERY_LOW:Double = js.native
        val LOW:Double = js.native
        val MEDIUM:Double = js.native
        val HIGH:Double = js.native
        val VERY_HIGH:Double = js.native
        val VERY_BAD:Double = js.native
        val BAD:Double = js.native
        val GOOD:Double = js.native
        val VERY_GOOD:Double = js.native
        val BEST:Double = js.native
        val LAST_DEFINED:Double = js.native
    }
    @js.native
    object HyperlinkStateFlags extends js.Object {
        val INLINE:Double = js.native
    }
    @js.native
    class GObjectAccessible extends GObject.Object {
        def get_object():GObject.Object = js.native
    }
    @js.native
    object GObjectAccessible extends js.Object {
        def for_object(obj: GObject.Object):Object = js.native
    }
    @js.native
    class Hyperlink extends GObject.Object {
        def get_end_index():Any = js.native
        def get_n_anchors():Any = js.native
        def get_object(i: Any):Object = js.native
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
        def get_instance():Misc = js.native
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
        def add_relationship(relationship: Double, target: Object):Boolean = js.native
        def connect_property_change_handler(handler: Any):Any = js.native
        def get_attributes():Any = js.native
        def get_description():String = js.native
        def get_index_in_parent():Any = js.native
        def get_layer():Double = js.native
        def get_mdi_zorder():Any = js.native
        def get_n_accessible_children():Any = js.native
        def get_name():String = js.native
        def get_object_locale():String = js.native
        def get_parent():Object = js.native
        def get_role():Double = js.native
        def initialize(data: Object):Unit = js.native
        def notify_state_change(state: Any, value: Boolean):Unit = js.native
        def peek_parent():Object = js.native
        def ref_accessible_child(i: Any):Object = js.native
        def ref_relation_set():RelationSet = js.native
        def ref_state_set():StateSet = js.native
        def remove_property_change_handler(handler_id: Any):Unit = js.native
        def remove_relationship(relationship: Double, target: Object):Boolean = js.native
        def set_description(description: String):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_parent(parent: Object):Unit = js.native
        def set_role(role: Double):Unit = js.native
    }
    @js.native
    class ObjectFactory extends GObject.Object {
        def create_accessible(obj: GObject.Object):Object = js.native
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
        def get_factory(type0: Any):ObjectFactory = js.native
        def get_factory_type(type0: Any):Any = js.native
        def set_factory_type(type0: Any, factory_type0: Any):Unit = js.native
    }
    @js.native
    class Relation extends GObject.Object {
        def this(config: js.Any) = this()
        def add_target(target: Object):Unit = js.native
        def get_relation_type():Double = js.native
        def get_target():js.Array[Object] = js.native
        def remove_target(target: Object):Boolean = js.native
    }
    @js.native
    class RelationSet extends GObject.Object {
        def this(config: js.Any) = this()
        def add(relation: Relation):Unit = js.native
        def add_relation_by_type(relationship: Double, target: Object):Unit = js.native
        def contains(relationship: Double):Boolean = js.native
        def contains_target(relationship: Double, target: Object):Boolean = js.native
        def get_n_relations():Any = js.native
        def get_relation(i: Any):Relation = js.native
        def get_relation_by_type(relationship: Double):Relation = js.native
        def remove(relation: Relation):Unit = js.native
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
        def add_state(type0: Double):Boolean = js.native
        def add_states(types: js.Array[Double], n_types: Any):Unit = js.native
        def and_sets(compare_set: StateSet):StateSet = js.native
        def clear_states():Unit = js.native
        def contains_state(type0: Double):Boolean = js.native
        def contains_states(types: js.Array[Double], n_types: Any):Boolean = js.native
        def is_empty():Boolean = js.native
        def or_sets(compare_set: StateSet):StateSet = js.native
        def remove_state(type0: Double):Boolean = js.native
        def xor_sets(compare_set: StateSet):StateSet = js.native
    }
    @js.native
    class Util extends GObject.Object {
    }
}