/**
 * WebKit.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.WebKit")
@js.native
object WebKit extends js.Object {
    val MAJOR_VERSION:Any = js.native
    val MICRO_VERSION:Any = js.native
    val MINOR_VERSION:Any = js.native
    val USER_AGENT_MAJOR_VERSION:Any = js.native
    val USER_AGENT_MINOR_VERSION:Any = js.native
    def application_cache_get_database_directory_path():String = js.native
    def application_cache_get_maximum_size():Any = js.native
    def application_cache_set_maximum_size(size: Any):Unit = js.native
    def check_version(major: Any, minor: Any, micro: Any):Boolean = js.native
    def context_menu_item_get_action(item: Gtk.MenuItem):Double = js.native
    def geolocation_policy_allow(decision: GeolocationPolicyDecision):Unit = js.native
    def geolocation_policy_deny(decision: GeolocationPolicyDecision):Unit = js.native
    def get_cache_model():Double = js.native
    def get_default_session():Soup.Session = js.native
    def get_default_web_database_quota():Any = js.native
    def get_favicon_database():FaviconDatabase = js.native
    def get_icon_database():IconDatabase = js.native
    def get_security_policy_for_uri_scheme(scheme: String):Double = js.native
    def get_text_checker():GObject.Object = js.native
    def get_web_database_directory_path():String = js.native
    def get_web_plugin_database():WebPluginDatabase = js.native
    def major_version():Any = js.native
    def micro_version():Any = js.native
    def minor_version():Any = js.native
    def network_error_quark():Any = js.native
    def plugin_error_quark():Any = js.native
    def policy_error_quark():Any = js.native
    def remove_all_web_databases():Unit = js.native
    def set_cache_model(cache_model: Double):Unit = js.native
    def set_default_web_database_quota(defaultQuota: Any):Unit = js.native
    def set_security_policy_for_uri_scheme(scheme: String, policy: Double):Unit = js.native
    def set_text_checker(checker: GObject.Object):Unit = js.native
    def set_web_database_directory_path(path: String):Unit = js.native
    @js.native
    object CacheModel extends js.Object {
        val DEFAULT:Double = js.native
        val DOCUMENT_VIEWER:Double = js.native
        val WEB_BROWSER:Double = js.native
        val DOCUMENT_BROWSER:Double = js.native
    }
    @js.native
    object ContextMenuAction extends js.Object {
        val NO_ACTION:Double = js.native
        val OPEN_LINK:Double = js.native
        val OPEN_LINK_IN_NEW_WINDOW:Double = js.native
        val DOWNLOAD_LINK_TO_DISK:Double = js.native
        val COPY_LINK_TO_CLIPBOARD:Double = js.native
        val OPEN_IMAGE_IN_NEW_WINDOW:Double = js.native
        val DOWNLOAD_IMAGE_TO_DISK:Double = js.native
        val COPY_IMAGE_TO_CLIPBOARD:Double = js.native
        val COPY_IMAGE_URL_TO_CLIPBOARD:Double = js.native
        val OPEN_FRAME_IN_NEW_WINDOW:Double = js.native
        val GO_BACK:Double = js.native
        val GO_FORWARD:Double = js.native
        val STOP:Double = js.native
        val RELOAD:Double = js.native
        val COPY:Double = js.native
        val CUT:Double = js.native
        val PASTE:Double = js.native
        val DELETE:Double = js.native
        val SELECT_ALL:Double = js.native
        val INPUT_METHODS:Double = js.native
        val UNICODE:Double = js.native
        val SPELLING_GUESS:Double = js.native
        val NO_GUESSES_FOUND:Double = js.native
        val IGNORE_SPELLING:Double = js.native
        val LEARN_SPELLING:Double = js.native
        val IGNORE_GRAMMAR:Double = js.native
        val FONT_MENU:Double = js.native
        val BOLD:Double = js.native
        val ITALIC:Double = js.native
        val UNDERLINE:Double = js.native
        val OUTLINE:Double = js.native
        val INSPECT_ELEMENT:Double = js.native
        val OPEN_MEDIA_IN_NEW_WINDOW:Double = js.native
        val COPY_MEDIA_LINK_TO_CLIPBOARD:Double = js.native
        val TOGGLE_MEDIA_CONTROLS:Double = js.native
        val TOGGLE_MEDIA_LOOP:Double = js.native
        val ENTER_VIDEO_FULLSCREEN:Double = js.native
        val MEDIA_PLAY_PAUSE:Double = js.native
        val MEDIA_MUTE:Double = js.native
    }
    @js.native
    object DownloadError extends js.Object {
        val CANCELLED_BY_USER:Double = js.native
        val DESTINATION:Double = js.native
        val NETWORK:Double = js.native
    }
    @js.native
    object DownloadStatus extends js.Object {
        val ERROR:Double = js.native
        val CREATED:Double = js.native
        val STARTED:Double = js.native
        val CANCELLED:Double = js.native
        val FINISHED:Double = js.native
    }
    @js.native
    object EditingBehavior extends js.Object {
        val MAC:Double = js.native
        val WINDOWS:Double = js.native
        val UNIX:Double = js.native
    }
    @js.native
    object InsertAction extends js.Object {
        val TYPED:Double = js.native
        val PASTED:Double = js.native
        val DROPPED:Double = js.native
    }
    @js.native
    object LoadStatus extends js.Object {
        val PROVISIONAL:Double = js.native
        val COMMITTED:Double = js.native
        val FINISHED:Double = js.native
        val FIRST_VISUALLY_NON_EMPTY_LAYOUT:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object NavigationResponse extends js.Object {
        val ACCEPT:Double = js.native
        val IGNORE:Double = js.native
        val DOWNLOAD:Double = js.native
    }
    @js.native
    object NetworkError extends js.Object {
        val FAILED:Double = js.native
        val TRANSPORT:Double = js.native
        val UNKNOWN_PROTOCOL:Double = js.native
        val CANCELLED:Double = js.native
        val FILE_DOES_NOT_EXIST:Double = js.native
    }
    @js.native
    object PluginError extends js.Object {
        val FAILED:Double = js.native
        val CANNOT_FIND_PLUGIN:Double = js.native
        val CANNOT_LOAD_PLUGIN:Double = js.native
        val JAVA_UNAVAILABLE:Double = js.native
        val CONNECTION_CANCELLED:Double = js.native
        val WILL_HANDLE_LOAD:Double = js.native
    }
    @js.native
    object PolicyError extends js.Object {
        val FAILED:Double = js.native
        val CANNOT_SHOW_MIME_TYPE:Double = js.native
        val CANNOT_SHOW_URL:Double = js.native
        val FRAME_LOAD_INTERRUPTED_BY_POLICY_CHANGE:Double = js.native
        val CANNOT_USE_RESTRICTED_PORT:Double = js.native
    }
    @js.native
    object SelectionAffinity extends js.Object {
        val UPSTREAM:Double = js.native
        val DOWNSTREAM:Double = js.native
    }
    @js.native
    object WebNavigationReason extends js.Object {
        val LINK_CLICKED:Double = js.native
        val FORM_SUBMITTED:Double = js.native
        val BACK_FORWARD:Double = js.native
        val RELOAD:Double = js.native
        val FORM_RESUBMITTED:Double = js.native
        val OTHER:Double = js.native
    }
    @js.native
    object WebViewTargetInfo extends js.Object {
        val HTML:Double = js.native
        val TEXT:Double = js.native
        val IMAGE:Double = js.native
        val URI_LIST:Double = js.native
        val NETSCAPE_URL:Double = js.native
    }
    @js.native
    object WebViewViewMode extends js.Object {
        val WINDOWED:Double = js.native
        val FLOATING:Double = js.native
        val FULLSCREEN:Double = js.native
        val MAXIMIZED:Double = js.native
        val MINIMIZED:Double = js.native
    }
    @js.native
    object HitTestResultContext extends js.Object {
        val DOCUMENT:Double = js.native
        val LINK:Double = js.native
        val IMAGE:Double = js.native
        val MEDIA:Double = js.native
        val SELECTION:Double = js.native
        val EDITABLE:Double = js.native
    }
    @js.native
    object SecurityPolicy extends js.Object {
        val LOCAL:Double = js.native
        val NO_ACCESS_TO_OTHER_SCHEME:Double = js.native
        val DISPLAY_ISOLATED:Double = js.native
        val SECURE:Double = js.native
        val CORS_ENABLED:Double = js.native
        val EMPTY_DOCUMENT:Double = js.native
    }
    @js.native
    class DOMAttr extends DOMNode {
        def get_is_id():Boolean = js.native
        def get_name():String = js.native
        def get_owner_element():DOMElement = js.native
        def get_specified():Boolean = js.native
        def get_value():String = js.native
        def set_value(value: String):Unit = js.native
    }
    @js.native
    class DOMAudioTrack extends DOMObject {
        def get_enabled():Boolean = js.native
        def get_id():String = js.native
        def get_kind():String = js.native
        def get_label():String = js.native
        def get_language():String = js.native
        def set_enabled(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMAudioTrackList extends DOMObject {
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_length():Any = js.native
        def get_track_by_id(id: String):DOMAudioTrack = js.native
        def item(index: Any):DOMAudioTrack = js.native
    }
    @js.native
    class DOMBarInfo extends DOMObject {
    }
    @js.native
    object DOMBarInfo extends js.Object {
        def get_visible(self: Object):Boolean = js.native
    }
    @js.native
    class DOMBarProp extends DOMObject {
        def get_visible():Boolean = js.native
    }
    @js.native
    class DOMBatteryManager extends DOMObject {
        def dispatch_event(event: DOMEvent):Boolean = js.native
        def get_charging():Boolean = js.native
        def get_charging_time():Any = js.native
        def get_discharging_time():Any = js.native
        def get_level():Any = js.native
    }
    @js.native
    class DOMBlob extends DOMObject {
        def get_size():Any = js.native
        def slice(start: Any, end: Any, contentType: String):DOMBlob = js.native
        def webkit_slice(start: Any, end: Any, content_type0: String):DOMBlob = js.native
    }
    @js.native
    class DOMCDATASection extends DOMText {
    }
    @js.native
    class DOMCSSRule extends DOMObject {
        def get_css_text():String = js.native
        def get_parent_rule():DOMCSSRule = js.native
        def get_parent_style_sheet():DOMCSSStyleSheet = js.native
        def set_css_text(value: String):Unit = js.native
    }
    @js.native
    class DOMCSSRuleList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMCSSRule = js.native
    }
    @js.native
    class DOMCSSStyleDeclaration extends DOMObject {
        def get_css_text():String = js.native
        def get_length():Any = js.native
        def get_parent_rule():DOMCSSRule = js.native
        def get_property_css_value(propertyName: String):DOMCSSValue = js.native
        def get_property_priority(propertyName: String):String = js.native
        def get_property_shorthand(propertyName: String):String = js.native
        def get_property_value(propertyName: String):String = js.native
        def is_property_implicit(propertyName: String):Boolean = js.native
        def item(index: Any):String = js.native
        def remove_property(propertyName: String):String = js.native
        def set_css_text(value: String):Unit = js.native
        override def set_property(args:Any*):Unit = js.native

    }
    @js.native
    class DOMCSSStyleSheet extends DOMStyleSheet {
        def add_rule(selector: String, style: String, index: Any):Any = js.native
        def delete_rule(index: Any):Unit = js.native
        def get_css_rules():DOMCSSRuleList = js.native
        def get_owner_rule():DOMCSSRule = js.native
        def get_rules():DOMCSSRuleList = js.native
        def insert_rule(rule: String, index: Any):Any = js.native
        def remove_rule(index: Any):Unit = js.native
    }
    @js.native
    class DOMCSSValue extends DOMObject {
        def get_css_text():String = js.native
        def get_css_value_type():Any = js.native
        def set_css_text(value: String):Unit = js.native
    }
    @js.native
    class DOMCharacterData extends DOMNode {
        def append_data(data: String):Unit = js.native
        def delete_data(offset: Any, length: Any):Unit = js.native
        def get_data():String = js.native
        def get_length():Any = js.native
        def insert_data(offset: Any, data: String):Unit = js.native
        def remove():Unit = js.native
        override def replace_data(args:Any*):Any = js.native

        def set_data(value: String):Unit = js.native
        def substring_data(offset: Any, length: Any):String = js.native
    }
    @js.native
    class DOMComment extends DOMCharacterData {
    }
    @js.native
    class DOMConsole extends DOMObject {
        def get_memory():Object = js.native
        def group_end():Unit = js.native
        def time(title: String):Unit = js.native
    }
    @js.native
    class DOMDOMApplicationCache extends DOMObject {
        def abort():Unit = js.native
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_status():Any = js.native
        def swap_cache():Unit = js.native
        def update():Unit = js.native
    }
    @js.native
    class DOMDOMImplementation extends DOMObject {
        def create_css_style_sheet(title: String, media: String):DOMCSSStyleSheet = js.native
        def create_document(namespaceURI: String, qualifiedName: String, doctype0: DOMDocumentType):DOMDocument = js.native
        def create_document_type(qualifiedName: String, publicId: String, systemId: String):DOMDocumentType = js.native
        def create_html_document(title: String):DOMHTMLDocument = js.native
        def has_feature(feature: String, version: String):Boolean = js.native
    }
    @js.native
    class DOMDOMMimeType extends DOMObject {
        def get_description():String = js.native
        def get_enabled_plugin():DOMDOMPlugin = js.native
        def get_suffixes():String = js.native
    }
    @js.native
    class DOMDOMMimeTypeArray extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMDOMMimeType = js.native
        def named_item(name: String):DOMDOMMimeType = js.native
    }
    @js.native
    class DOMDOMNamedFlowCollection extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMWebKitNamedFlow = js.native
        def named_item(name: String):DOMWebKitNamedFlow = js.native
    }
    @js.native
    class DOMDOMPlugin extends DOMObject {
        def get_description():String = js.native
        def get_filename():String = js.native
        def get_length():Any = js.native
        def get_name():String = js.native
        def item(index: Any):DOMDOMMimeType = js.native
        def named_item(name: String):DOMDOMMimeType = js.native
    }
    @js.native
    class DOMDOMPluginArray extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMDOMPlugin = js.native
        def named_item(name: String):DOMDOMPlugin = js.native
        def refresh(reload: Boolean):Unit = js.native
    }
    @js.native
    class DOMDOMSecurityPolicy extends DOMObject {
        def allows_connection_to(url: String):Boolean = js.native
        def allows_font_from(url: String):Boolean = js.native
        def allows_form_action(url: String):Boolean = js.native
        def allows_frame_from(url: String):Boolean = js.native
        def allows_image_from(url: String):Boolean = js.native
        def allows_media_from(url: String):Boolean = js.native
        def allows_object_from(url: String):Boolean = js.native
        def allows_plugin_type(type0: String):Boolean = js.native
        def allows_script_from(url: String):Boolean = js.native
        def allows_style_from(url: String):Boolean = js.native
        def get_allows_eval():Boolean = js.native
        def get_allows_inline_script():Boolean = js.native
        def get_allows_inline_style():Boolean = js.native
        def get_is_active():Boolean = js.native
        def get_report_ur_is():DOMDOMStringList = js.native
    }
    @js.native
    class DOMDOMSelection extends DOMObject {
        def add_range(range: DOMRange):Unit = js.native
        def collapse(node: DOMNode, index: Any):Unit = js.native
        def collapse_to_end():Unit = js.native
        def collapse_to_start():Unit = js.native
        def contains_node(node: DOMNode, allowPartial: Boolean):Boolean = js.native
        def delete_from_document():Unit = js.native
        def empty():Unit = js.native
        def extend(node: DOMNode, offset: Any):Unit = js.native
        def get_anchor_node():DOMNode = js.native
        def get_anchor_offset():Any = js.native
        def get_base_node():DOMNode = js.native
        def get_base_offset():Any = js.native
        def get_extent_node():DOMNode = js.native
        def get_extent_offset():Any = js.native
        def get_focus_node():DOMNode = js.native
        def get_focus_offset():Any = js.native
        def get_is_collapsed():Boolean = js.native
        def get_range_at(index: Any):DOMRange = js.native
        def get_range_count():Any = js.native
        def modify(alter: String, direction: String, granularity: String):Unit = js.native
        def remove_all_ranges():Unit = js.native
        def select_all_children(node: DOMNode):Unit = js.native
        def set_base_and_extent(baseNode: DOMNode, baseOffset: Any, extentNode: DOMNode, extentOffset: Any):Unit = js.native
        def set_position(node: DOMNode, offset: Any):Unit = js.native
    }
    @js.native
    class DOMDOMSettableTokenList extends DOMDOMTokenList {
        def get_value():String = js.native
        def set_value(value: String):Unit = js.native
    }
    @js.native
    class DOMDOMStringList extends DOMObject {
        def contains(string: String):Boolean = js.native
        def get_length():Any = js.native
        def item(index: Any):String = js.native
    }
    @js.native
    class DOMDOMStringMap extends DOMObject {
    }
    @js.native
    class DOMDOMTokenList extends DOMObject {
        def add(tokens: String):Unit = js.native
        def contains(token: String):Boolean = js.native
        def get_length():Any = js.native
        def item(index: Any):String = js.native
        def remove(tokens: String):Unit = js.native
        def toggle(token: String, force: Boolean):Boolean = js.native
    }
    @js.native
    class DOMDOMWindow extends DOMObject {
        def alert(message: String):Unit = js.native
        def atob(string: String):String = js.native
        def blur():Unit = js.native
        def btoa(string: String):String = js.native
        def cancel_animation_frame(id: Any):Unit = js.native
        def capture_events():Unit = js.native
        def clear_interval(handle: Any):Unit = js.native
        def clear_timeout(handle: Any):Unit = js.native
        def close():Unit = js.native
        def confirm(message: String):Boolean = js.native
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def find(string: String, caseSensitive: Boolean, backwards: Boolean, wrap: Boolean, wholeWord: Boolean, searchInFrames: Boolean, showDialog: Boolean):Boolean = js.native
        def focus():Unit = js.native
        def get_application_cache():DOMDOMApplicationCache = js.native
        def get_client_information():DOMNavigator = js.native
        def get_closed():Boolean = js.native
        def get_computed_style(element: DOMElement, pseudoElement: String):DOMCSSStyleDeclaration = js.native
        def get_console():DOMConsole = js.native
        def get_css():DOMDOMWindowCSS = js.native
        def get_default_status():String = js.native
        def get_device_pixel_ratio():Any = js.native
        def get_document():DOMDocument = js.native
        def get_frame_element():DOMElement = js.native
        def get_frames():DOMDOMWindow = js.native
        def get_history():DOMHistory = js.native
        def get_inner_height():Any = js.native
        def get_inner_width():Any = js.native
        def get_length():Any = js.native
        def get_local_storage():DOMStorage = js.native
        def get_locationbar():DOMBarProp = js.native
        def get_menubar():DOMBarProp = js.native
        def get_name():String = js.native
        def get_navigator():DOMNavigator = js.native
        def get_offscreen_buffering():Boolean = js.native
        def get_opener():DOMDOMWindow = js.native
        def get_outer_height():Any = js.native
        def get_outer_width():Any = js.native
        def get_page_x_offset():Any = js.native
        def get_page_y_offset():Any = js.native
        def get_parent():DOMDOMWindow = js.native
        def get_performance():DOMPerformance = js.native
        def get_personalbar():DOMBarProp = js.native
        def get_screen():DOMScreen = js.native
        def get_screen_left():Any = js.native
        def get_screen_top():Any = js.native
        def get_screen_x():Any = js.native
        def get_screen_y():Any = js.native
        def get_scroll_x():Any = js.native
        def get_scroll_y():Any = js.native
        def get_scrollbars():DOMBarProp = js.native
        def get_selection():DOMDOMSelection = js.native
        def get_self():DOMDOMWindow = js.native
        def get_session_storage():DOMStorage = js.native
        def get_status():String = js.native
        def get_statusbar():DOMBarProp = js.native
        def get_style_media():DOMStyleMedia = js.native
        def get_toolbar():DOMBarProp = js.native
        def get_top():DOMDOMWindow = js.native
        def get_webkit_storage_info():DOMStorageInfo = js.native
        def get_window():DOMDOMWindow = js.native
        def match_media(query: String):DOMMediaQueryList = js.native
        def move_by(x: Any, y: Any):Unit = js.native
        def move_to(x: Any, y: Any):Unit = js.native
        def print():Unit = js.native
        def prompt(message: String, defaultValue: String):String = js.native
        def release_events():Unit = js.native
        def resize_by(x: Any, y: Any):Unit = js.native
        def resize_to(width: Any, height: Any):Unit = js.native
        def scroll(x: Any, y: Any):Unit = js.native
        def scroll_by(x: Any, y: Any):Unit = js.native
        def scroll_to(x: Any, y: Any):Unit = js.native
        def set_default_status(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_status(value: String):Unit = js.native
        def stop():Unit = js.native
        def webkit_cancel_animation_frame(id: Any):Unit = js.native
        def webkit_cancel_request_animation_frame(id: Any):Unit = js.native
        def webkit_convert_point_from_node_to_page(node: DOMNode, p: DOMWebKitPoint):DOMWebKitPoint = js.native
        def webkit_convert_point_from_page_to_node(node: DOMNode, p: DOMWebKitPoint):DOMWebKitPoint = js.native
    }
    @js.native
    class DOMDOMWindowCSS extends DOMObject {
        def supports(property: String, value: String):Boolean = js.native
    }
    @js.native
    class DOMDatabase extends DOMObject {
        def get_version():String = js.native
    }
    @js.native
    class DOMDocument extends DOMNode {
        def adopt_node(source: DOMNode):DOMNode = js.native
        def caret_range_from_point(x: Any, y: Any):DOMRange = js.native
        def create_attribute(name: String):DOMAttr = js.native
        def create_attribute_ns(namespaceURI: String, qualifiedName: String):DOMAttr = js.native
        def create_cdata_section(data: String):DOMCDATASection = js.native
        def create_comment(data: String):DOMComment = js.native
        def create_css_style_declaration():DOMCSSStyleDeclaration = js.native
        def create_document_fragment():DOMDocumentFragment = js.native
        def create_element(tagName: String):DOMElement = js.native
        def create_element_ns(namespaceURI: String, qualifiedName: String):DOMElement = js.native
        def create_entity_reference(name: String):DOMEntityReference = js.native
        def create_event(eventType: String):DOMEvent = js.native
        def create_expression(expression: String, resolver: DOMXPathNSResolver):DOMXPathExpression = js.native
        def create_node_iterator(root: DOMNode, whatToShow: Any, filter: DOMNodeFilter, expandEntityReferences: Boolean):DOMNodeIterator = js.native
        def create_ns_resolver(nodeResolver: DOMNode):DOMXPathNSResolver = js.native
        def create_processing_instruction(target: String, data: String):DOMProcessingInstruction = js.native
        def create_range():DOMRange = js.native
        def create_text_node(data: String):DOMText = js.native
        def create_touch(window: DOMDOMWindow, target: Any, identifier: Any, pageX: Any, pageY: Any, screenX: Any, screenY: Any, webkitRadiusX: Any, webkitRadiusY: Any, webkitRotationAngle: Any, webkitForce: Any):DOMTouch = js.native
        def create_tree_walker(root: DOMNode, whatToShow: Any, filter: DOMNodeFilter, expandEntityReferences: Boolean):DOMTreeWalker = js.native
        def element_from_point(x: Any, y: Any):DOMElement = js.native
        def evaluate(expression: String, contextNode: DOMNode, resolver: DOMXPathNSResolver, type0: Any, inResult: DOMXPathResult):DOMXPathResult = js.native
        def exec_command(command: String, userInterface: Boolean, value: String):Boolean = js.native
        def get_anchors():DOMHTMLCollection = js.native
        def get_applets():DOMHTMLCollection = js.native
        def get_body():DOMHTMLElement = js.native
        def get_character_set():String = js.native
        def get_charset():String = js.native
        def get_compat_mode():String = js.native
        def get_cookie():String = js.native
        def get_current_script():DOMHTMLScriptElement = js.native
        def get_default_charset():String = js.native
        def get_default_view():DOMDOMWindow = js.native
        def get_doctype():DOMDocumentType = js.native
        def get_document_element():DOMElement = js.native
        def get_document_uri():String = js.native
        def get_domain():String = js.native
        def get_element_by_id(elementId: String):DOMElement = js.native
        def get_elements_by_class_name(tagname: String):DOMNodeList = js.native
        def get_elements_by_name(elementName: String):DOMNodeList = js.native
        def get_elements_by_tag_name(tagname: String):DOMNodeList = js.native
        def get_elements_by_tag_name_ns(namespaceURI: String, localName: String):DOMNodeList = js.native
        def get_forms():DOMHTMLCollection = js.native
        def get_head():DOMHTMLHeadElement = js.native
        def get_hidden():Boolean = js.native
        def get_images():DOMHTMLCollection = js.native
        def get_implementation():DOMDOMImplementation = js.native
        def get_input_encoding():String = js.native
        def get_last_modified():String = js.native
        def get_links():DOMHTMLCollection = js.native
        def get_override_style(element: DOMElement, pseudoElement: String):DOMCSSStyleDeclaration = js.native
        def get_preferred_stylesheet_set():String = js.native
        def get_ready_state():String = js.native
        def get_referrer():String = js.native
        def get_security_policy():DOMDOMSecurityPolicy = js.native
        def get_selected_stylesheet_set():String = js.native
        def get_style_sheets():DOMStyleSheetList = js.native
        def get_title():String = js.native
        def get_url():String = js.native
        def get_visibility_state():String = js.native
        def get_webkit_current_full_screen_element():DOMElement = js.native
        def get_webkit_full_screen_keyboard_input_allowed():Boolean = js.native
        def get_webkit_fullscreen_element():DOMElement = js.native
        def get_webkit_fullscreen_enabled():Boolean = js.native
        def get_webkit_hidden():Boolean = js.native
        def get_webkit_is_full_screen():Boolean = js.native
        def get_webkit_pointer_lock_element():DOMElement = js.native
        def get_webkit_visibility_state():String = js.native
        def get_xml_encoding():String = js.native
        def get_xml_standalone():Boolean = js.native
        def get_xml_version():String = js.native
        def import_node(importedNode: DOMNode, deep: Boolean):DOMNode = js.native
        def query_command_enabled(command: String):Boolean = js.native
        def query_command_indeterm(command: String):Boolean = js.native
        def query_command_state(command: String):Boolean = js.native
        def query_command_supported(command: String):Boolean = js.native
        def query_command_value(command: String):String = js.native
        def query_selector(selectors: String):DOMElement = js.native
        def query_selector_all(selectors: String):DOMNodeList = js.native
        def set_body(value: DOMHTMLElement):Unit = js.native
        def set_charset(value: String):Unit = js.native
        def set_cookie(value: String):Unit = js.native
        def set_document_uri(value: String):Unit = js.native
        def set_selected_stylesheet_set(value: String):Unit = js.native
        def set_title(value: String):Unit = js.native
        def set_xml_standalone(value: Boolean):Unit = js.native
        def set_xml_version(value: String):Unit = js.native
        def webkit_cancel_full_screen():Unit = js.native
        def webkit_exit_fullscreen():Unit = js.native
        def webkit_exit_pointer_lock():Unit = js.native
        def webkit_get_named_flows():DOMDOMNamedFlowCollection = js.native
    }
    @js.native
    class DOMDocumentFragment extends DOMNode {
        def query_selector(selectors: String):DOMElement = js.native
        def query_selector_all(selectors: String):DOMNodeList = js.native
    }
    @js.native
    class DOMDocumentType extends DOMNode {
        def get_entities():DOMNamedNodeMap = js.native
        def get_internal_subset():String = js.native
        def get_name():String = js.native
        def get_notations():DOMNamedNodeMap = js.native
        def get_public_id():String = js.native
        def get_system_id():String = js.native
        def remove():Unit = js.native
    }
    @js.native
    class DOMElement extends DOMNode {
        def blur():Unit = js.native
        def focus():Unit = js.native
        def get_attribute(name: String):String = js.native
        def get_attribute_node(name: String):DOMAttr = js.native
        def get_attribute_node_ns(namespaceURI: String, localName: String):DOMAttr = js.native
        def get_attribute_ns(namespaceURI: String, localName: String):String = js.native
        override def get_attributes():DOMNamedNodeMap = js.native
        def get_child_element_count():Any = js.native
        def get_class_list():DOMDOMTokenList = js.native
        def get_class_name():String = js.native
        def get_client_height():Any = js.native
        def get_client_left():Any = js.native
        def get_client_top():Any = js.native
        def get_client_width():Any = js.native
        def get_elements_by_class_name(name: String):DOMNodeList = js.native
        def get_elements_by_tag_name(name: String):DOMNodeList = js.native
        def get_elements_by_tag_name_ns(namespaceURI: String, localName: String):DOMNodeList = js.native
        def get_first_element_child():DOMElement = js.native
        def get_id():String = js.native
        def get_last_element_child():DOMElement = js.native
        def get_next_element_sibling():DOMElement = js.native
        def get_offset_height():Any = js.native
        def get_offset_left():Any = js.native
        def get_offset_parent():DOMElement = js.native
        def get_offset_top():Any = js.native
        def get_offset_width():Any = js.native
        def get_previous_element_sibling():DOMElement = js.native
        def get_scroll_height():Any = js.native
        def get_scroll_left():Any = js.native
        def get_scroll_top():Any = js.native
        def get_scroll_width():Any = js.native
        def get_style():DOMCSSStyleDeclaration = js.native
        def get_tag_name():String = js.native
        def get_webkit_region_overflow():String = js.native
        def get_webkit_region_overset():String = js.native
        def has_attribute(name: String):Boolean = js.native
        def has_attribute_ns(namespaceURI: String, localName: String):Boolean = js.native
        override def has_attributes():Boolean = js.native
        def query_selector(selectors: String):DOMElement = js.native
        def query_selector_all(selectors: String):DOMNodeList = js.native
        def remove(index:Number):Unit = js.native

        def remove_attribute(name: String):Unit = js.native
        def remove_attribute_node(oldAttr: DOMAttr):DOMAttr = js.native
        def remove_attribute_ns(namespaceURI: String, localName: String):Unit = js.native
        def scroll_by_lines(lines: Any):Unit = js.native
        def scroll_by_pages(pages: Any):Unit = js.native
        def scroll_into_view(alignWithTop: Boolean):Unit = js.native
        def scroll_into_view_if_needed(centerIfNeeded: Boolean):Unit = js.native
        def set_attribute(name: String, value: String):Unit = js.native
        def set_attribute_node(newAttr: DOMAttr):DOMAttr = js.native
        def set_attribute_node_ns(newAttr: DOMAttr):DOMAttr = js.native
        def set_attribute_ns(namespaceURI: String, qualifiedName: String, value: String):Unit = js.native
        def set_class_name(value: String):Unit = js.native
        def set_id(value: String):Unit = js.native
        def set_scroll_left(value: Any):Unit = js.native
        def set_scroll_top(value: Any):Unit = js.native
        def webkit_matches_selector(selectors: String):Boolean = js.native
        def webkit_request_full_screen(flags: Any):Unit = js.native
        def webkit_request_fullscreen():Unit = js.native
        def webkit_request_pointer_lock():Unit = js.native
    }
    @js.native
    class DOMEntityReference extends DOMNode {
    }
    @js.native
    class DOMEvent extends DOMObject {
        def get_bubbles():Boolean = js.native
        def get_cancel_bubble():Boolean = js.native
        def get_cancelable():Boolean = js.native
        def get_current_target():Any = js.native
        def get_default_prevented():Boolean = js.native
        def get_event_phase():Any = js.native
        def get_return_value():Boolean = js.native
        def get_src_element():Any = js.native
        def get_target():Any = js.native
        def get_time_stamp():Any = js.native
        def init_event(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean):Unit = js.native
        def prevent_default():Unit = js.native
        def set_cancel_bubble(value: Boolean):Unit = js.native
        def set_return_value(value: Boolean):Unit = js.native
        def stop_immediate_propagation():Unit = js.native
        def stop_propagation():Unit = js.native
    }
    @js.native
    class DOMFile extends DOMBlob {
        def get_name():String = js.native
        def get_webkit_relative_path():String = js.native
    }
    @js.native
    class DOMFileList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMFile = js.native
    }
    @js.native
    class DOMGamepad extends DOMObject {
        def get_id():String = js.native
        def get_index():Any = js.native
        def get_timestamp():Any = js.native
    }
    @js.native
    class DOMGamepadList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMGamepad = js.native
    }
    @js.native
    class DOMGeolocation extends DOMObject {
        def clear_watch(watchID: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLAnchorElement extends DOMHTMLElement {
        def get_charset():String = js.native
        def get_coords():String = js.native
        def get_download():String = js.native
        def get_hash():String = js.native
        def get_host():String = js.native
        def get_hostname():String = js.native
        def get_href():String = js.native
        def get_hreflang():String = js.native
        def get_name():String = js.native
        def get_origin():String = js.native
        def get_pathname():String = js.native
        def get_ping():String = js.native
        def get_port():String = js.native
        def get_protocol():String = js.native
        def get_rel():String = js.native
        def get_rev():String = js.native
        def get_search():String = js.native
        def get_shape():String = js.native
        def get_target():String = js.native
        def get_text():String = js.native
        def set_charset(value: String):Unit = js.native
        def set_coords(value: String):Unit = js.native
        def set_download(value: String):Unit = js.native
        def set_hash(value: String):Unit = js.native
        def set_host(value: String):Unit = js.native
        def set_hostname(value: String):Unit = js.native
        def set_href(value: String):Unit = js.native
        def set_hreflang(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_pathname(value: String):Unit = js.native
        def set_ping(value: String):Unit = js.native
        def set_port(value: String):Unit = js.native
        def set_protocol(value: String):Unit = js.native
        def set_rel(value: String):Unit = js.native
        def set_rev(value: String):Unit = js.native
        def set_search(value: String):Unit = js.native
        def set_shape(value: String):Unit = js.native
        def set_target(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLAppletElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_alt():String = js.native
        def get_archive():String = js.native
        def get_code():String = js.native
        def get_code_base():String = js.native
        def get_height():String = js.native
        def get_hspace():Any = js.native
        def get_name():String = js.native
        def get_object():String = js.native
        def get_vspace():Any = js.native
        def get_width():String = js.native
        def set_align(value: String):Unit = js.native
        def set_alt(value: String):Unit = js.native
        def set_archive(value: String):Unit = js.native
        def set_code(value: String):Unit = js.native
        def set_code_base(value: String):Unit = js.native
        def set_height(value: String):Unit = js.native
        def set_hspace(value: Any):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_object(value: String):Unit = js.native
        def set_vspace(value: Any):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLAreaElement extends DOMHTMLElement {
        def get_alt():String = js.native
        def get_coords():String = js.native
        def get_hash():String = js.native
        def get_host():String = js.native
        def get_hostname():String = js.native
        def get_href():String = js.native
        def get_no_href():Boolean = js.native
        def get_pathname():String = js.native
        def get_ping():String = js.native
        def get_port():String = js.native
        def get_protocol():String = js.native
        def get_search():String = js.native
        def get_shape():String = js.native
        def get_target():String = js.native
        def set_alt(value: String):Unit = js.native
        def set_coords(value: String):Unit = js.native
        def set_href(value: String):Unit = js.native
        def set_no_href(value: Boolean):Unit = js.native
        def set_ping(value: String):Unit = js.native
        def set_shape(value: String):Unit = js.native
        def set_target(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLAudioElement extends DOMHTMLMediaElement {
    }
    @js.native
    class DOMHTMLBRElement extends DOMHTMLElement {
        def get_clear():String = js.native
        def set_clear(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLBaseElement extends DOMHTMLElement {
        def get_href():String = js.native
        def get_target():String = js.native
        def set_href(value: String):Unit = js.native
        def set_target(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLBaseFontElement extends DOMHTMLElement {
        def get_color():String = js.native
        def get_face():String = js.native
        def get_size():Any = js.native
        def set_color(value: String):Unit = js.native
        def set_face(value: String):Unit = js.native
        def set_size(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLBodyElement extends DOMHTMLElement {
        def get_a_link():String = js.native
        def get_background():String = js.native
        def get_bg_color():String = js.native
        def get_link():String = js.native
        def get_text():String = js.native
        def get_v_link():String = js.native
        def set_a_link(value: String):Unit = js.native
        def set_background(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_link(value: String):Unit = js.native
        def set_text(value: String):Unit = js.native
        def set_v_link(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLButtonElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_autofocus():Boolean = js.native
        def get_disabled():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_form_action():String = js.native
        def get_form_enctype():String = js.native
        def get_form_method():String = js.native
        def get_form_no_validate():Boolean = js.native
        def get_form_target():String = js.native
        def get_labels():DOMNodeList = js.native
        def get_name():String = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_value():String = js.native
        def get_will_validate():Boolean = js.native
        def set_autofocus(value: Boolean):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_form_action(value: String):Unit = js.native
        def set_form_enctype(value: String):Unit = js.native
        def set_form_method(value: String):Unit = js.native
        def set_form_no_validate(value: Boolean):Unit = js.native
        def set_form_target(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_value(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLCanvasElement extends DOMHTMLElement {
        def get_height():Any = js.native
        def get_width():Any = js.native
        def set_height(value: Any):Unit = js.native
        def set_width(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLCollection extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMNode = js.native
        def named_item(name: String):DOMNode = js.native
    }
    @js.native
    class DOMHTMLDListElement extends DOMHTMLElement {
        def get_compact():Boolean = js.native
        def set_compact(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLDetailsElement extends DOMHTMLElement {
        def get_open():Boolean = js.native
        def set_open(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLDirectoryElement extends DOMHTMLElement {
        def get_compact():Boolean = js.native
        def set_compact(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLDivElement extends DOMHTMLElement {
        def get_align():String = js.native
        def set_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLDocument extends DOMDocument {
        def capture_events():Unit = js.native
        def clear():Unit = js.native
        def close():Unit = js.native
        def get_active_element():DOMElement = js.native
        def get_alink_color():String = js.native
        def get_bg_color():String = js.native
        override def get_compat_mode():String = js.native
        def get_design_mode():String = js.native
        def get_dir():String = js.native
        def get_embeds():DOMHTMLCollection = js.native
        def get_fg_color():String = js.native
        def get_height():Any = js.native
        def get_link_color():String = js.native
        def get_plugins():DOMHTMLCollection = js.native
        def get_scripts():DOMHTMLCollection = js.native
        def get_vlink_color():String = js.native
        def get_width():Any = js.native
        def has_focus():Boolean = js.native
        def open():Unit = js.native
        def release_events():Unit = js.native
        def set_alink_color(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_design_mode(value: String):Unit = js.native
        def set_dir(value: String):Unit = js.native
        def set_fg_color(value: String):Unit = js.native
        def set_link_color(value: String):Unit = js.native
        def set_vlink_color(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLElement extends DOMElement {
        def click():Unit = js.native
        def get_access_key():String = js.native
        def get_children():DOMHTMLCollection = js.native
        override def get_class_list():DOMDOMTokenList = js.native
        override def get_class_name():String = js.native
        def get_content_editable():String = js.native
        def get_dir():String = js.native
        def get_draggable():Boolean = js.native
        def get_hidden():Boolean = js.native
        override def get_id():String = js.native
        def get_inner_html():String = js.native
        def get_inner_text():String = js.native
        def get_is_content_editable():Boolean = js.native
        def get_item_id():String = js.native
        def get_item_prop():DOMDOMSettableTokenList = js.native
        def get_item_ref():DOMDOMSettableTokenList = js.native
        def get_item_scope():Boolean = js.native
        def get_item_type():Object = js.native
        def get_lang():String = js.native
        def get_outer_html():String = js.native
        def get_outer_text():String = js.native
        def get_spellcheck():Boolean = js.native
        def get_tab_index():Any = js.native
        def get_title():String = js.native
        def get_translate():Boolean = js.native
        def get_webkitdropzone():String = js.native
        def insert_adjacent_element(where: String, element: DOMElement):DOMElement = js.native
        def insert_adjacent_html(where: String, html: String):Unit = js.native
        def insert_adjacent_text(where: String, text: String):Unit = js.native
        def set_access_key(value: String):Unit = js.native
        override def set_class_name(value: String):Unit = js.native
        def set_content_editable(value: String):Unit = js.native
        def set_dir(value: String):Unit = js.native
        def set_draggable(value: Boolean):Unit = js.native
        def set_hidden(value: Boolean):Unit = js.native
        override def set_id(value: String):Unit = js.native
        def set_inner_html(value: String):Unit = js.native
        def set_inner_text(value: String):Unit = js.native
        def set_item_id(value: String):Unit = js.native
        def set_item_scope(value: Boolean):Unit = js.native
        def set_lang(value: String):Unit = js.native
        def set_outer_html(value: String):Unit = js.native
        def set_outer_text(value: String):Unit = js.native
        def set_spellcheck(value: Boolean):Unit = js.native
        def set_tab_index(value: Any):Unit = js.native
        def set_title(value: String):Unit = js.native
        def set_translate(value: Boolean):Unit = js.native
        def set_webkitdropzone(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLEmbedElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_height():Any = js.native
        def get_name():String = js.native
        def get_src():String = js.native
        def get_width():Any = js.native
        def set_align(value: String):Unit = js.native
        def set_height(value: Any):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_width(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLFieldSetElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_disabled():Boolean = js.native
        def get_elements():DOMHTMLCollection = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_name():String = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_will_validate():Boolean = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_name(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLFontElement extends DOMHTMLElement {
        def get_color():String = js.native
        def get_face():String = js.native
        def get_size():String = js.native
        def set_color(value: String):Unit = js.native
        def set_face(value: String):Unit = js.native
        def set_size(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLFormElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def dispatch_form_change():Unit = js.native
        def dispatch_form_input():Unit = js.native
        def get_accept_charset():String = js.native
        def get_action():String = js.native
        def get_autocapitalize():String = js.native
        def get_autocomplete():String = js.native
        def get_autocorrect():Boolean = js.native
        def get_elements():DOMHTMLCollection = js.native
        def get_encoding():String = js.native
        def get_enctype():String = js.native
        def get_length():Any = js.native
        def get_method():String = js.native
        def get_name():String = js.native
        def get_no_validate():Boolean = js.native
        def get_target():String = js.native
        def reset():Unit = js.native
        def set_accept_charset(value: String):Unit = js.native
        def set_action(value: String):Unit = js.native
        def set_autocapitalize(value: String):Unit = js.native
        def set_autocomplete(value: String):Unit = js.native
        def set_autocorrect(value: Boolean):Unit = js.native
        def set_encoding(value: String):Unit = js.native
        def set_enctype(value: String):Unit = js.native
        def set_method(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_no_validate(value: Boolean):Unit = js.native
        def set_target(value: String):Unit = js.native
        def submit():Unit = js.native
    }
    @js.native
    class DOMHTMLFrameElement extends DOMHTMLElement {
        def get_content_document():DOMDocument = js.native
        def get_content_window():DOMDOMWindow = js.native
        def get_frame_border():String = js.native
        def get_height():Any = js.native
        def get_long_desc():String = js.native
        def get_margin_height():String = js.native
        def get_margin_width():String = js.native
        def get_name():String = js.native
        def get_no_resize():Boolean = js.native
        def get_scrolling():String = js.native
        def get_src():String = js.native
        def get_width():Any = js.native
        def set_frame_border(value: String):Unit = js.native
        def set_long_desc(value: String):Unit = js.native
        def set_margin_height(value: String):Unit = js.native
        def set_margin_width(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_no_resize(value: Boolean):Unit = js.native
        def set_scrolling(value: String):Unit = js.native
        def set_src(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLFrameSetElement extends DOMHTMLElement {
        def get_cols():String = js.native
        def get_rows():String = js.native
        def set_cols(value: String):Unit = js.native
        def set_rows(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLHRElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_no_shade():Boolean = js.native
        def get_size():String = js.native
        def get_width():String = js.native
        def set_align(value: String):Unit = js.native
        def set_no_shade(value: Boolean):Unit = js.native
        def set_size(value: String):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLHeadElement extends DOMHTMLElement {
        def get_profile():String = js.native
        def set_profile(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLHeadingElement extends DOMHTMLElement {
        def get_align():String = js.native
        def set_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLHtmlElement extends DOMHTMLElement {
        def get_manifest():String = js.native
        def get_version():String = js.native
        def set_manifest(value: String):Unit = js.native
        def set_version(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLIFrameElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_content_document():DOMDocument = js.native
        def get_content_window():DOMDOMWindow = js.native
        def get_frame_border():String = js.native
        def get_height():String = js.native
        def get_long_desc():String = js.native
        def get_margin_height():String = js.native
        def get_margin_width():String = js.native
        def get_name():String = js.native
        def get_sandbox():String = js.native
        def get_scrolling():String = js.native
        def get_seamless():Boolean = js.native
        def get_src():String = js.native
        def get_srcdoc():String = js.native
        def get_width():String = js.native
        def set_align(value: String):Unit = js.native
        def set_frame_border(value: String):Unit = js.native
        def set_height(value: String):Unit = js.native
        def set_long_desc(value: String):Unit = js.native
        def set_margin_height(value: String):Unit = js.native
        def set_margin_width(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_sandbox(value: String):Unit = js.native
        def set_scrolling(value: String):Unit = js.native
        def set_seamless(value: Boolean):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_srcdoc(value: String):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLImageElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_alt():String = js.native
        def get_border():String = js.native
        def get_complete():Boolean = js.native
        def get_cross_origin():String = js.native
        def get_height():Any = js.native
        def get_hspace():Any = js.native
        def get_is_map():Boolean = js.native
        def get_long_desc():String = js.native
        def get_lowsrc():String = js.native
        def get_name():String = js.native
        def get_natural_height():Any = js.native
        def get_natural_width():Any = js.native
        def get_src():String = js.native
        def get_srcset():String = js.native
        def get_use_map():String = js.native
        def get_vspace():Any = js.native
        def get_width():Any = js.native
        def get_x():Any = js.native
        def get_y():Any = js.native
        def set_align(value: String):Unit = js.native
        def set_alt(value: String):Unit = js.native
        def set_border(value: String):Unit = js.native
        def set_cross_origin(value: String):Unit = js.native
        def set_height(value: Any):Unit = js.native
        def set_hspace(value: Any):Unit = js.native
        def set_is_map(value: Boolean):Unit = js.native
        def set_long_desc(value: String):Unit = js.native
        def set_lowsrc(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_srcset(value: String):Unit = js.native
        def set_use_map(value: String):Unit = js.native
        def set_vspace(value: Any):Unit = js.native
        def set_width(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLInputElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_accept():String = js.native
        def get_align():String = js.native
        def get_alt():String = js.native
        def get_autocapitalize():String = js.native
        def get_autocomplete():String = js.native
        def get_autocorrect():Boolean = js.native
        def get_autofocus():Boolean = js.native
        def get_capture():String = js.native
        def get_checked():Boolean = js.native
        def get_default_checked():Boolean = js.native
        def get_default_value():String = js.native
        def get_dir_name():String = js.native
        def get_disabled():Boolean = js.native
        def get_files():DOMFileList = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_form_action():String = js.native
        def get_form_enctype():String = js.native
        def get_form_method():String = js.native
        def get_form_no_validate():Boolean = js.native
        def get_form_target():String = js.native
        def get_height():Any = js.native
        def get_incremental():Boolean = js.native
        def get_indeterminate():Boolean = js.native
        def get_labels():DOMNodeList = js.native
        def get_list():DOMHTMLElement = js.native
        def get_max():String = js.native
        def get_max_length():Any = js.native
        def get_min():String = js.native
        def get_multiple():Boolean = js.native
        def get_name():String = js.native
        def get_pattern():String = js.native
        def get_placeholder():String = js.native
        def get_read_only():Boolean = js.native
        def get_required():Boolean = js.native
        def get_size():Any = js.native
        def get_src():String = js.native
        def get_step():String = js.native
        def get_use_map():String = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_value():String = js.native
        def get_value_as_number():Any = js.native
        def get_webkit_grammar():Boolean = js.native
        def get_webkit_speech():Boolean = js.native
        def get_webkitdirectory():Boolean = js.native
        def get_width():Any = js.native
        def get_will_validate():Boolean = js.native
        def is_edited():Boolean = js.native
        def select():Unit = js.native
        def set_accept(value: String):Unit = js.native
        def set_align(value: String):Unit = js.native
        def set_alt(value: String):Unit = js.native
        def set_autocapitalize(value: String):Unit = js.native
        def set_autocomplete(value: String):Unit = js.native
        def set_autocorrect(value: Boolean):Unit = js.native
        def set_autofocus(value: Boolean):Unit = js.native
        def set_capture(value: String):Unit = js.native
        def set_checked(value: Boolean):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_default_checked(value: Boolean):Unit = js.native
        def set_default_value(value: String):Unit = js.native
        def set_dir_name(value: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_files(value: DOMFileList):Unit = js.native
        def set_form_action(value: String):Unit = js.native
        def set_form_enctype(value: String):Unit = js.native
        def set_form_method(value: String):Unit = js.native
        def set_form_no_validate(value: Boolean):Unit = js.native
        def set_form_target(value: String):Unit = js.native
        def set_height(value: Any):Unit = js.native
        def set_incremental(value: Boolean):Unit = js.native
        def set_indeterminate(value: Boolean):Unit = js.native
        def set_max(value: String):Unit = js.native
        def set_max_length(value: Any):Unit = js.native
        def set_min(value: String):Unit = js.native
        def set_multiple(value: Boolean):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_pattern(value: String):Unit = js.native
        def set_placeholder(value: String):Unit = js.native
        def set_range_text(replacement: String, start: Any, end: Any, selectionMode: String):Unit = js.native
        def set_read_only(value: Boolean):Unit = js.native
        def set_required(value: Boolean):Unit = js.native
        def set_size(value: Any):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_step(value: String):Unit = js.native
        def set_use_map(value: String):Unit = js.native
        def set_value(value: String):Unit = js.native
        def set_value_as_number(value: Any):Unit = js.native
        def set_value_for_user(value: String):Unit = js.native
        def set_webkit_grammar(value: Boolean):Unit = js.native
        def set_webkit_speech(value: Boolean):Unit = js.native
        def set_webkitdirectory(value: Boolean):Unit = js.native
        def set_width(value: Any):Unit = js.native
        def step_down(n: Any):Unit = js.native
        def step_up(n: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLKeygenElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_autofocus():Boolean = js.native
        def get_challenge():String = js.native
        def get_disabled():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_keytype():String = js.native
        def get_labels():DOMNodeList = js.native
        def get_name():String = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_will_validate():Boolean = js.native
        def set_autofocus(value: Boolean):Unit = js.native
        def set_challenge(value: String):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_keytype(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLLIElement extends DOMHTMLElement {
        def get_value():Any = js.native
        def set_value(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLLabelElement extends DOMHTMLElement {
        def get_control():DOMHTMLElement = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_html_for():String = js.native
        def set_html_for(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLLegendElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_form():DOMHTMLFormElement = js.native
        def set_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLLinkElement extends DOMHTMLElement {
        def get_charset():String = js.native
        def get_disabled():Boolean = js.native
        def get_href():String = js.native
        def get_hreflang():String = js.native
        def get_media():String = js.native
        def get_rel():String = js.native
        def get_rev():String = js.native
        def get_sheet():DOMStyleSheet = js.native
        def get_target():String = js.native
        def set_charset(value: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_href(value: String):Unit = js.native
        def set_hreflang(value: String):Unit = js.native
        def set_media(value: String):Unit = js.native
        def set_rel(value: String):Unit = js.native
        def set_rev(value: String):Unit = js.native
        def set_target(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLMapElement extends DOMHTMLElement {
        def get_areas():DOMHTMLCollection = js.native
        def get_name():String = js.native
        def set_name(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLMarqueeElement extends DOMHTMLElement {
        def get_behavior():String = js.native
        def get_bg_color():String = js.native
        def get_direction():String = js.native
        def get_height():String = js.native
        def get_hspace():Any = js.native
        def get_loop():Any = js.native
        def get_scroll_amount():Any = js.native
        def get_scroll_delay():Any = js.native
        def get_true_speed():Boolean = js.native
        def get_vspace():Any = js.native
        def get_width():String = js.native
        def set_behavior(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_direction(value: String):Unit = js.native
        def set_height(value: String):Unit = js.native
        def set_hspace(value: Any):Unit = js.native
        def set_loop(value: Any):Unit = js.native
        def set_scroll_amount(value: Any):Unit = js.native
        def set_scroll_delay(value: Any):Unit = js.native
        def set_true_speed(value: Boolean):Unit = js.native
        def set_vspace(value: Any):Unit = js.native
        def set_width(value: String):Unit = js.native
        def start():Unit = js.native
        def stop():Unit = js.native
    }
    @js.native
    class DOMHTMLMediaElement extends DOMHTMLElement {
        def add_text_track(kind: String, label: String, language: String):DOMTextTrack = js.native
        def can_play_type(type0: String):String = js.native
        def fast_seek(time: Any):Unit = js.native
        def get_audio_tracks():DOMAudioTrackList = js.native
        def get_autoplay():Boolean = js.native
        def get_buffered():DOMTimeRanges = js.native
        def get_controller():DOMMediaController = js.native
        def get_controls():Boolean = js.native
        def get_current_src():String = js.native
        def get_current_time():Any = js.native
        def get_default_muted():Boolean = js.native
        def get_default_playback_rate():Any = js.native
        def get_duration():Any = js.native
        def get_ended():Boolean = js.native
        def get_error():DOMMediaError = js.native
        def get_initial_time():Any = js.native
        def get_loop():Boolean = js.native
        def get_media_group():String = js.native
        def get_muted():Boolean = js.native
        def get_network_state():Any = js.native
        def get_paused():Boolean = js.native
        def get_playback_rate():Any = js.native
        def get_played():DOMTimeRanges = js.native
        def get_preload():String = js.native
        def get_ready_state():Any = js.native
        def get_seekable():DOMTimeRanges = js.native
        def get_seeking():Boolean = js.native
        def get_src():String = js.native
        def get_start_time():Any = js.native
        def get_text_tracks():DOMTextTrackList = js.native
        def get_video_tracks():DOMVideoTrackList = js.native
        def get_volume():Any = js.native
        def get_webkit_audio_decoded_byte_count():Any = js.native
        def get_webkit_closed_captions_visible():Boolean = js.native
        def get_webkit_current_playback_target_is_wireless():Boolean = js.native
        def get_webkit_has_closed_captions():Boolean = js.native
        def get_webkit_preserves_pitch():Boolean = js.native
        def get_webkit_video_decoded_byte_count():Any = js.native
        def load():Unit = js.native
        def pause():Unit = js.native
        def play():Unit = js.native
        def set_autoplay(value: Boolean):Unit = js.native
        def set_controls(value: Boolean):Unit = js.native
        def set_current_time(value: Any):Unit = js.native
        def set_default_muted(value: Boolean):Unit = js.native
        def set_default_playback_rate(value: Any):Unit = js.native
        def set_loop(value: Boolean):Unit = js.native
        def set_media_group(value: String):Unit = js.native
        def set_muted(value: Boolean):Unit = js.native
        def set_playback_rate(value: Any):Unit = js.native
        def set_preload(value: String):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_volume(value: Any):Unit = js.native
        def set_webkit_closed_captions_visible(value: Boolean):Unit = js.native
        def set_webkit_preserves_pitch(value: Boolean):Unit = js.native
        def webkit_show_playback_target_picker():Unit = js.native
    }
    @js.native
    class DOMHTMLMenuElement extends DOMHTMLElement {
        def get_compact():Boolean = js.native
        def set_compact(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLMetaElement extends DOMHTMLElement {
        def get_content():String = js.native
        def get_http_equiv():String = js.native
        def get_name():String = js.native
        def get_scheme():String = js.native
        def set_content(value: String):Unit = js.native
        def set_http_equiv(value: String):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_scheme(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLModElement extends DOMHTMLElement {
        def get_cite():String = js.native
        def get_date_time():String = js.native
        def set_cite(value: String):Unit = js.native
        def set_date_time(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLOListElement extends DOMHTMLElement {
        def get_compact():Boolean = js.native
        def get_reversed():Boolean = js.native
        def get_start():Any = js.native
        def set_compact(value: Boolean):Unit = js.native
        def set_reversed(value: Boolean):Unit = js.native
        def set_start(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLObjectElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_align():String = js.native
        def get_archive():String = js.native
        def get_border():String = js.native
        def get_code():String = js.native
        def get_code_base():String = js.native
        def get_code_type():String = js.native
        def get_content_document():DOMDocument = js.native
        def get_data():String = js.native
        def get_declare():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_height():String = js.native
        def get_hspace():Any = js.native
        def get_name():String = js.native
        def get_standby():String = js.native
        def get_use_map():String = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_vspace():Any = js.native
        def get_width():String = js.native
        def get_will_validate():Boolean = js.native
        def set_align(value: String):Unit = js.native
        def set_archive(value: String):Unit = js.native
        def set_border(value: String):Unit = js.native
        def set_code(value: String):Unit = js.native
        def set_code_base(value: String):Unit = js.native
        def set_code_type(value: String):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_data(value: String):Unit = js.native
        def set_declare(value: Boolean):Unit = js.native
        def set_height(value: String):Unit = js.native
        def set_hspace(value: Any):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_standby(value: String):Unit = js.native
        def set_use_map(value: String):Unit = js.native
        def set_vspace(value: Any):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLOptGroupElement extends DOMHTMLElement {
        def get_disabled():Boolean = js.native
        def get_label():String = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_label(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLOptionElement extends DOMHTMLElement {
        def get_default_selected():Boolean = js.native
        def get_disabled():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_index():Any = js.native
        def get_label():String = js.native
        def get_selected():Boolean = js.native
        def get_text():String = js.native
        def get_value():String = js.native
        def set_default_selected(value: Boolean):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_label(value: String):Unit = js.native
        def set_selected(value: Boolean):Unit = js.native
        def set_value(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLOptionsCollection extends DOMHTMLCollection {
        override def get_length():Any = js.native
        def get_selected_index():Any = js.native
        override def named_item(name: String):DOMNode = js.native
        def set_selected_index(value: Any):Unit = js.native
    }
    @js.native
    class DOMHTMLParagraphElement extends DOMHTMLElement {
        def get_align():String = js.native
        def set_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLParamElement extends DOMHTMLElement {
        def get_name():String = js.native
        def get_value():String = js.native
        def get_value_type():String = js.native
        def set_name(value: String):Unit = js.native
        def set_value(value: String):Unit = js.native
        def set_value_type(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLPreElement extends DOMHTMLElement {
        def get_width():Any = js.native
        def get_wrap():Boolean = js.native
        def set_width(value: Any):Unit = js.native
        def set_wrap(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLPropertiesCollection extends DOMHTMLCollection {
    }
    @js.native
    object DOMHTMLPropertiesCollection extends js.Object {
        def get_length(self: Object):Any = js.native
        def get_names(self: Object):DOMDOMStringList = js.native
        def item(self: Object, index: Any):DOMNode = js.native
        def named_item(self: Object, name: String):Object = js.native
    }
    @js.native
    class DOMHTMLQuoteElement extends DOMHTMLElement {
        def get_cite():String = js.native
        def set_cite(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLScriptElement extends DOMHTMLElement {
        def get_async():Boolean = js.native
        def get_charset():String = js.native
        def get_cross_origin():String = js.native
        def get_defer():Boolean = js.native
        def get_event():String = js.native
        def get_html_for():String = js.native
        def get_nonce():String = js.native
        def get_src():String = js.native
        def get_text():String = js.native
        def set_async(value: Boolean):Unit = js.native
        def set_charset(value: String):Unit = js.native
        def set_cross_origin(value: String):Unit = js.native
        def set_defer(value: Boolean):Unit = js.native
        def set_event(value: String):Unit = js.native
        def set_html_for(value: String):Unit = js.native
        def set_nonce(value: String):Unit = js.native
        def set_src(value: String):Unit = js.native
        def set_text(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLSelectElement extends DOMHTMLElement {
        def add(element: DOMHTMLElement, before: DOMHTMLElement):Unit = js.native
        def check_validity():Boolean = js.native
        def get_autofocus():Boolean = js.native
        def get_disabled():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_labels():DOMNodeList = js.native
        def get_length():Any = js.native
        def get_multiple():Boolean = js.native
        def get_name():String = js.native
        def get_options():DOMHTMLOptionsCollection = js.native
        def get_required():Boolean = js.native
        def get_selected_index():Any = js.native
        def get_selected_options():DOMHTMLCollection = js.native
        def get_size():Any = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_value():String = js.native
        def get_will_validate():Boolean = js.native
        def item(index: Any):DOMNode = js.native
        def named_item(name: String):DOMNode = js.native
        override def remove(index:Number):Unit = js.native

        def set_autofocus(value: Boolean):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_length(value: Any):Unit = js.native
        def set_multiple(value: Boolean):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_required(value: Boolean):Unit = js.native
        def set_selected_index(value: Any):Unit = js.native
        def set_size(value: Any):Unit = js.native
        def set_value(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLStyleElement extends DOMHTMLElement {
        def get_disabled():Boolean = js.native
        def get_media():String = js.native
        def get_scoped():Boolean = js.native
        def get_sheet():DOMStyleSheet = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_media(value: String):Unit = js.native
        def set_scoped(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLTableCaptionElement extends DOMHTMLElement {
        def get_align():String = js.native
        def set_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTableCellElement extends DOMHTMLElement {
        def get_abbr():String = js.native
        def get_align():String = js.native
        def get_axis():String = js.native
        def get_bg_color():String = js.native
        def get_cell_index():Any = js.native
        def get_ch():String = js.native
        def get_ch_off():String = js.native
        def get_col_span():Any = js.native
        def get_headers():String = js.native
        def get_height():String = js.native
        def get_no_wrap():Boolean = js.native
        def get_row_span():Any = js.native
        def get_scope():String = js.native
        def get_v_align():String = js.native
        def get_width():String = js.native
        def set_abbr(value: String):Unit = js.native
        def set_align(value: String):Unit = js.native
        def set_axis(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_ch(value: String):Unit = js.native
        def set_ch_off(value: String):Unit = js.native
        def set_col_span(value: Any):Unit = js.native
        def set_headers(value: String):Unit = js.native
        def set_height(value: String):Unit = js.native
        def set_no_wrap(value: Boolean):Unit = js.native
        def set_row_span(value: Any):Unit = js.native
        def set_scope(value: String):Unit = js.native
        def set_v_align(value: String):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTableColElement extends DOMHTMLElement {
        def get_align():String = js.native
        def get_ch():String = js.native
        def get_ch_off():String = js.native
        def get_span():Any = js.native
        def get_v_align():String = js.native
        def get_width():String = js.native
        def set_align(value: String):Unit = js.native
        def set_ch(value: String):Unit = js.native
        def set_ch_off(value: String):Unit = js.native
        def set_span(value: Any):Unit = js.native
        def set_v_align(value: String):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTableElement extends DOMHTMLElement {
        def create_caption():DOMHTMLElement = js.native
        def create_t_body():DOMHTMLElement = js.native
        def create_t_foot():DOMHTMLElement = js.native
        def create_t_head():DOMHTMLElement = js.native
        def delete_caption():Unit = js.native
        def delete_row(index: Any):Unit = js.native
        def delete_t_foot():Unit = js.native
        def delete_t_head():Unit = js.native
        def get_align():String = js.native
        def get_bg_color():String = js.native
        def get_border():String = js.native
        def get_caption():DOMHTMLTableCaptionElement = js.native
        def get_cell_padding():String = js.native
        def get_cell_spacing():String = js.native
        def get_frame():String = js.native
        def get_rows():DOMHTMLCollection = js.native
        def get_rules():String = js.native
        def get_summary():String = js.native
        def get_t_bodies():DOMHTMLCollection = js.native
        def get_t_foot():DOMHTMLTableSectionElement = js.native
        def get_t_head():DOMHTMLTableSectionElement = js.native
        def get_width():String = js.native
        def insert_row(index: Any):DOMHTMLElement = js.native
        def set_align(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_border(value: String):Unit = js.native
        def set_caption(value: DOMHTMLTableCaptionElement):Unit = js.native
        def set_cell_padding(value: String):Unit = js.native
        def set_cell_spacing(value: String):Unit = js.native
        def set_frame(value: String):Unit = js.native
        def set_rules(value: String):Unit = js.native
        def set_summary(value: String):Unit = js.native
        def set_t_foot(value: DOMHTMLTableSectionElement):Unit = js.native
        def set_t_head(value: DOMHTMLTableSectionElement):Unit = js.native
        def set_width(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTableRowElement extends DOMHTMLElement {
        def delete_cell(index: Any):Unit = js.native
        def get_align():String = js.native
        def get_bg_color():String = js.native
        def get_cells():DOMHTMLCollection = js.native
        def get_ch():String = js.native
        def get_ch_off():String = js.native
        def get_row_index():Any = js.native
        def get_section_row_index():Any = js.native
        def get_v_align():String = js.native
        def insert_cell(index: Any):DOMHTMLElement = js.native
        def set_align(value: String):Unit = js.native
        def set_bg_color(value: String):Unit = js.native
        def set_ch(value: String):Unit = js.native
        def set_ch_off(value: String):Unit = js.native
        def set_v_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTableSectionElement extends DOMHTMLElement {
        def delete_row(index: Any):Unit = js.native
        def get_align():String = js.native
        def get_ch():String = js.native
        def get_ch_off():String = js.native
        def get_rows():DOMHTMLCollection = js.native
        def get_v_align():String = js.native
        def insert_row(index: Any):DOMHTMLElement = js.native
        def set_align(value: String):Unit = js.native
        def set_ch(value: String):Unit = js.native
        def set_ch_off(value: String):Unit = js.native
        def set_v_align(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTextAreaElement extends DOMHTMLElement {
        def check_validity():Boolean = js.native
        def get_autocapitalize():String = js.native
        def get_autocorrect():Boolean = js.native
        def get_autofocus():Boolean = js.native
        def get_cols():Any = js.native
        def get_default_value():String = js.native
        def get_dir_name():String = js.native
        def get_disabled():Boolean = js.native
        def get_form():DOMHTMLFormElement = js.native
        def get_labels():DOMNodeList = js.native
        def get_max_length():Any = js.native
        def get_name():String = js.native
        def get_placeholder():String = js.native
        def get_read_only():Boolean = js.native
        def get_required():Boolean = js.native
        def get_rows():Any = js.native
        def get_selection_direction():String = js.native
        def get_selection_end():Any = js.native
        def get_selection_start():Any = js.native
        def get_text_length():Any = js.native
        def get_validation_message():String = js.native
        def get_validity():DOMValidityState = js.native
        def get_value():String = js.native
        def get_will_validate():Boolean = js.native
        def get_wrap():String = js.native
        def is_edited():Boolean = js.native
        def select():Unit = js.native
        def set_autocapitalize(value: String):Unit = js.native
        def set_autocorrect(value: Boolean):Unit = js.native
        def set_autofocus(value: Boolean):Unit = js.native
        def set_cols(value: Any):Unit = js.native
        def set_custom_validity(error: String):Unit = js.native
        def set_default_value(value: String):Unit = js.native
        def set_dir_name(value: String):Unit = js.native
        def set_disabled(value: Boolean):Unit = js.native
        def set_max_length(value: Any):Unit = js.native
        def set_name(value: String):Unit = js.native
        def set_placeholder(value: String):Unit = js.native
        def set_range_text(replacement: String, start: Any, end: Any, selectionMode: String):Unit = js.native
        def set_read_only(value: Boolean):Unit = js.native
        def set_required(value: Boolean):Unit = js.native
        def set_rows(value: Any):Unit = js.native
        def set_selection_direction(value: String):Unit = js.native
        def set_selection_end(value: Any):Unit = js.native
        def set_selection_range(start: Any, end: Any, direction: String):Unit = js.native
        def set_selection_start(value: Any):Unit = js.native
        def set_value(value: String):Unit = js.native
        def set_wrap(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLTitleElement extends DOMHTMLElement {
        def get_text():String = js.native
        def set_text(value: String):Unit = js.native
    }
    @js.native
    class DOMHTMLUListElement extends DOMHTMLElement {
        def get_compact():Boolean = js.native
        def set_compact(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMHTMLVideoElement extends DOMHTMLMediaElement {
        def get_height():Any = js.native
        def get_poster():String = js.native
        def get_video_height():Any = js.native
        def get_video_width():Any = js.native
        def get_webkit_decoded_frame_count():Any = js.native
        def get_webkit_displaying_fullscreen():Boolean = js.native
        def get_webkit_dropped_frame_count():Any = js.native
        def get_webkit_supports_fullscreen():Boolean = js.native
        def get_webkit_wireless_video_playback_disabled():Boolean = js.native
        def get_width():Any = js.native
        def set_height(value: Any):Unit = js.native
        def set_poster(value: String):Unit = js.native
        def set_webkit_wireless_video_playback_disabled(value: Boolean):Unit = js.native
        def set_width(value: Any):Unit = js.native
        def webkit_enter_full_screen():Unit = js.native
        def webkit_enter_fullscreen():Unit = js.native
        def webkit_exit_full_screen():Unit = js.native
        def webkit_exit_fullscreen():Unit = js.native
    }
    @js.native
    class DOMHistory extends DOMObject {
        def back():Unit = js.native
        def forward():Unit = js.native
        def get_length():Any = js.native
        def go(distance: Any):Unit = js.native
    }
    @js.native
    class DOMKeyboardEvent extends DOMUIEvent {
        def get_alt_graph_key():Boolean = js.native
        def get_alt_key():Boolean = js.native
        def get_ctrl_key():Boolean = js.native
        def get_key_identifier():String = js.native
        def get_key_location():Any = js.native
        def get_meta_key():Boolean = js.native
        def get_modifier_state(keyIdentifierArg: String):Boolean = js.native
        def get_shift_key():Boolean = js.native
        def init_keyboard_event(type0: String, canBubble: Boolean, cancelable: Boolean, view: DOMDOMWindow, keyIdentifier: String, location: Any, ctrlKey: Boolean, altKey: Boolean, shiftKey: Boolean, metaKey: Boolean, altGraphKey: Boolean):Unit = js.native
    }
    @js.native
    class DOMLocation extends DOMObject {
        def get_ancestor_origins():DOMDOMStringList = js.native
        def get_hash():String = js.native
        def get_host():String = js.native
        def get_hostname():String = js.native
        def get_href():String = js.native
        def get_origin():String = js.native
        def get_pathname():String = js.native
        def get_port():String = js.native
        def get_protocol():String = js.native
        def get_search():String = js.native
    }
    @js.native
    class DOMMediaController extends DOMObject {
        def get_buffered():DOMTimeRanges = js.native
        def get_current_time():Any = js.native
        def get_default_playback_rate():Any = js.native
        def get_duration():Any = js.native
        def get_muted():Boolean = js.native
        def get_paused():Boolean = js.native
        def get_playback_rate():Any = js.native
        def get_playback_state():String = js.native
        def get_played():DOMTimeRanges = js.native
        def get_seekable():DOMTimeRanges = js.native
        def get_volume():Any = js.native
        def pause():Unit = js.native
        def play():Unit = js.native
        def set_current_time(value: Any):Unit = js.native
        def set_default_playback_rate(value: Any):Unit = js.native
        def set_muted(value: Boolean):Unit = js.native
        def set_playback_rate(value: Any):Unit = js.native
        def set_volume(value: Any):Unit = js.native
        def unpause():Unit = js.native
    }
    @js.native
    class DOMMediaError extends DOMObject {
        def get_code():Any = js.native
    }
    @js.native
    class DOMMediaList extends DOMObject {
        def append_medium(newMedium: String):Unit = js.native
        def delete_medium(oldMedium: String):Unit = js.native
        def get_length():Any = js.native
        def get_media_text():String = js.native
        def item(index: Any):String = js.native
        def set_media_text(value: String):Unit = js.native
    }
    @js.native
    class DOMMediaQueryList extends DOMObject {
        def get_matches():Boolean = js.native
        def get_media():String = js.native
    }
    @js.native
    class DOMMemoryInfo extends DOMObject {
    }
    @js.native
    object DOMMemoryInfo extends js.Object {
        def get_js_heap_size_limit(self: Object):Any = js.native
        def get_total_js_heap_size(self: Object):Any = js.native
        def get_used_js_heap_size(self: Object):Any = js.native
    }
    @js.native
    class DOMMessagePort extends DOMObject {
    }
    @js.native
    class DOMMicroDataItemValue extends DOMObject {
    }
    @js.native
    class DOMMouseEvent extends DOMUIEvent {
        def get_alt_key():Boolean = js.native
        def get_button():Any = js.native
        def get_client_x():Any = js.native
        def get_client_y():Any = js.native
        def get_ctrl_key():Boolean = js.native
        def get_from_element():DOMNode = js.native
        def get_meta_key():Boolean = js.native
        def get_offset_x():Any = js.native
        def get_offset_y():Any = js.native
        def get_related_target():Any = js.native
        def get_screen_x():Any = js.native
        def get_screen_y():Any = js.native
        def get_shift_key():Boolean = js.native
        def get_to_element():DOMNode = js.native
        def get_webkit_movement_x():Any = js.native
        def get_webkit_movement_y():Any = js.native
        def get_x():Any = js.native
        def get_y():Any = js.native
        def init_mouse_event(type0: String, canBubble: Boolean, cancelable: Boolean, view: DOMDOMWindow, detail: Any, screenX: Any, screenY: Any, clientX: Any, clientY: Any, ctrlKey: Boolean, altKey: Boolean, shiftKey: Boolean, metaKey: Boolean, button: Any, relatedTarget: Any):Unit = js.native
    }
    @js.native
    class DOMNamedNodeMap extends DOMObject {
        def get_length():Any = js.native
        def get_named_item(name: String):DOMNode = js.native
        def get_named_item_ns(namespaceURI: String, localName: String):DOMNode = js.native
        def item(index: Any):DOMNode = js.native
        def remove_named_item(name: String):DOMNode = js.native
        def remove_named_item_ns(namespaceURI: String, localName: String):DOMNode = js.native
        def set_named_item(node: DOMNode):DOMNode = js.native
        def set_named_item_ns(node: DOMNode):DOMNode = js.native
    }
    @js.native
    class DOMNavigator extends DOMObject {
        def get_app_code_name():String = js.native
        def get_app_name():String = js.native
        def get_app_version():String = js.native
        def get_cookie_enabled():Boolean = js.native
        def get_geolocation():DOMGeolocation = js.native
        def get_language():String = js.native
        def get_mime_types():DOMDOMMimeTypeArray = js.native
        def get_on_line():Boolean = js.native
        def get_platform():String = js.native
        def get_plugins():DOMDOMPluginArray = js.native
        def get_product():String = js.native
        def get_product_sub():String = js.native
        def get_storage_updates():Unit = js.native
        def get_user_agent():String = js.native
        def get_vendor():String = js.native
        def get_vendor_sub():String = js.native
        def get_webkit_battery():DOMBatteryManager = js.native
        def get_webkit_persistent_storage():DOMStorageQuota = js.native
        def get_webkit_temporary_storage():DOMStorageQuota = js.native
        def is_protocol_handler_registered(scheme: String, url: String):String = js.native
        def java_enabled():Boolean = js.native
        def register_protocol_handler(scheme: String, url: String, title: String):Unit = js.native
        def unregister_protocol_handler(scheme: String, url: String):Unit = js.native
        def webkit_get_gamepads():DOMGamepadList = js.native
    }
    @js.native
    class DOMNode extends DOMObject {
        def append_child(newChild: DOMNode):DOMNode = js.native
        def clone_node(deep: Boolean):DOMNode = js.native
        def compare_document_position(other: DOMNode):Any = js.native
        def contains(other: DOMNode):Boolean = js.native
        def dispatch_event(event: DOMEvent):Boolean = js.native
        def get_attributes():DOMNamedNodeMap = js.native
        def get_base_uri():String = js.native
        def get_child_nodes():DOMNodeList = js.native
        def get_first_child():DOMNode = js.native
        def get_last_child():DOMNode = js.native
        def get_local_name():String = js.native
        def get_namespace_uri():String = js.native
        def get_next_sibling():DOMNode = js.native
        def get_node_name():String = js.native
        def get_node_type():Any = js.native
        def get_node_value():String = js.native
        def get_owner_document():DOMDocument = js.native
        def get_parent_element():DOMElement = js.native
        def get_parent_node():DOMNode = js.native
        def get_prefix():String = js.native
        def get_previous_sibling():DOMNode = js.native
        def get_text_content():String = js.native
        def has_attributes():Boolean = js.native
        def has_child_nodes():Boolean = js.native
        def insert_before(newChild: DOMNode, refChild: DOMNode):DOMNode = js.native
        def is_default_namespace(namespaceURI: String):Boolean = js.native
        def is_equal_node(other: DOMNode):Boolean = js.native
        def is_same_node(other: DOMNode):Boolean = js.native
        def is_supported(feature: String, version: String):Boolean = js.native
        def lookup_namespace_uri(prefix: String):String = js.native
        def lookup_prefix(namespaceURI: String):String = js.native
        def normalize():Unit = js.native
        def remove_child(oldChild: DOMNode):DOMNode = js.native
        def replace_child(newChild: DOMNode, oldChild: DOMNode):DOMNode = js.native
        def set_node_value(value: String):Unit = js.native
        def set_prefix(value: String):Unit = js.native
        def set_text_content(value: String):Unit = js.native
    }
    @js.native
    class DOMNodeFilter extends DOMObject {
        def accept_node(n: DOMNode):Any = js.native
    }
    @js.native
    class DOMNodeIterator extends DOMObject {
        def detach():Unit = js.native
        def get_expand_entity_references():Boolean = js.native
        def get_filter():DOMNodeFilter = js.native
        def get_pointer_before_reference_node():Boolean = js.native
        def get_reference_node():DOMNode = js.native
        def get_root():DOMNode = js.native
        def get_what_to_show():Any = js.native
        def next_node():DOMNode = js.native
        def previous_node():DOMNode = js.native
    }
    @js.native
    class DOMNodeList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMNode = js.native
    }
    @js.native
    class DOMObject extends GObject.Object {
    }
    @js.native
    class DOMPerformance extends DOMObject {
        def get_memory():Object = js.native
        def get_navigation():DOMPerformanceNavigation = js.native
        def get_timing():DOMPerformanceTiming = js.native
        def now():Any = js.native
    }
    @js.native
    class DOMPerformanceEntry extends DOMObject {
        def get_duration():Any = js.native
        def get_entry_type():String = js.native
        def get_name():String = js.native
        def get_start_time():Any = js.native
    }
    @js.native
    class DOMPerformanceEntryList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMPerformanceEntry = js.native
    }
    @js.native
    class DOMPerformanceNavigation extends DOMObject {
        def get_redirect_count():Any = js.native
    }
    @js.native
    class DOMPerformanceTiming extends DOMObject {
        def get_connect_end():Any = js.native
        def get_connect_start():Any = js.native
        def get_dom_complete():Any = js.native
        def get_dom_content_loaded_event_end():Any = js.native
        def get_dom_content_loaded_event_start():Any = js.native
        def get_dom_interactive():Any = js.native
        def get_dom_loading():Any = js.native
        def get_domain_lookup_end():Any = js.native
        def get_domain_lookup_start():Any = js.native
        def get_fetch_start():Any = js.native
        def get_load_event_end():Any = js.native
        def get_load_event_start():Any = js.native
        def get_navigation_start():Any = js.native
        def get_redirect_end():Any = js.native
        def get_redirect_start():Any = js.native
        def get_request_start():Any = js.native
        def get_response_end():Any = js.native
        def get_response_start():Any = js.native
        def get_secure_connection_start():Any = js.native
        def get_unload_event_end():Any = js.native
        def get_unload_event_start():Any = js.native
    }
    @js.native
    class DOMProcessingInstruction extends DOMCharacterData {
        override def get_data():String = js.native
        def get_sheet():DOMStyleSheet = js.native
        def get_target():String = js.native
        override def set_data(value: String):Unit = js.native
    }
    @js.native
    class DOMPropertyNodeList extends DOMNodeList {
    }
    @js.native
    object DOMPropertyNodeList extends js.Object {
        def get_length(self: Object):Any = js.native
        def item(self: Object, index: Any):DOMNode = js.native
    }
    @js.native
    class DOMRange extends DOMObject {
        def clone_contents():DOMDocumentFragment = js.native
        def clone_range():DOMRange = js.native
        def collapse(toStart: Boolean):Unit = js.native
        def compare_boundary_points(how: Any, sourceRange: DOMRange):Any = js.native
        def compare_node(refNode: DOMNode):Any = js.native
        def compare_point(refNode: DOMNode, offset: Any):Any = js.native
        def create_contextual_fragment(html: String):DOMDocumentFragment = js.native
        def delete_contents():Unit = js.native
        def detach():Unit = js.native
        def expand(unit: String):Unit = js.native
        def extract_contents():DOMDocumentFragment = js.native
        def get_collapsed():Boolean = js.native
        def get_common_ancestor_container():DOMNode = js.native
        def get_end_container():DOMNode = js.native
        def get_end_offset():Any = js.native
        def get_start_container():DOMNode = js.native
        def get_start_offset():Any = js.native
        def get_text():String = js.native
        def insert_node(newNode: DOMNode):Unit = js.native
        def intersects_node(refNode: DOMNode):Boolean = js.native
        def is_point_in_range(refNode: DOMNode, offset: Any):Boolean = js.native
        def select_node(refNode: DOMNode):Unit = js.native
        def select_node_contents(refNode: DOMNode):Unit = js.native
        def set_end(refNode: DOMNode, offset: Any):Unit = js.native
        def set_end_after(refNode: DOMNode):Unit = js.native
        def set_end_before(refNode: DOMNode):Unit = js.native
        def set_start(refNode: DOMNode, offset: Any):Unit = js.native
        def set_start_after(refNode: DOMNode):Unit = js.native
        def set_start_before(refNode: DOMNode):Unit = js.native
        def surround_contents(newParent: DOMNode):Unit = js.native
        def to_string():String = js.native
    }
    @js.native
    class DOMScreen extends DOMObject {
        def get_avail_height():Any = js.native
        def get_avail_left():Any = js.native
        def get_avail_top():Any = js.native
        def get_avail_width():Any = js.native
        def get_color_depth():Any = js.native
        def get_height():Any = js.native
        def get_pixel_depth():Any = js.native
        def get_width():Any = js.native
    }
    @js.native
    class DOMShadowRoot extends DOMDocumentFragment {
        def element_from_point(x: Any, y: Any):DOMElement = js.native
        def get_active_element():DOMElement = js.native
        def get_apply_author_styles():Boolean = js.native
        def get_element_by_id(elementId: String):DOMElement = js.native
        def get_elements_by_class_name(className: String):DOMNodeList = js.native
        def get_elements_by_tag_name(tagName: String):DOMNodeList = js.native
        def get_elements_by_tag_name_ns(namespaceURI: String, localName: String):DOMNodeList = js.native
        def get_inner_html():String = js.native
        def get_reset_style_inheritance():Boolean = js.native
        def get_selection():DOMDOMSelection = js.native
        def set_apply_author_styles(value: Boolean):Unit = js.native
        def set_inner_html(value: String):Unit = js.native
        def set_reset_style_inheritance(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMStorage extends DOMObject {
        def clear():Unit = js.native
        def get_item(key: String):String = js.native
        def get_length():Any = js.native
        def key(index: Any):String = js.native
        def remove_item(key: String):Unit = js.native
        def set_item(key: String, data: String):Unit = js.native
    }
    @js.native
    class DOMStorageInfo extends DOMObject {
    }
    @js.native
    class DOMStorageQuota extends DOMObject {
    }
    @js.native
    class DOMStyleMedia extends DOMObject {
        def match_medium(mediaquery: String):Boolean = js.native
    }
    @js.native
    class DOMStyleSheet extends DOMObject {
        def get_disabled():Boolean = js.native
        def get_href():String = js.native
        def get_media():DOMMediaList = js.native
        def get_owner_node():DOMNode = js.native
        def get_parent_style_sheet():DOMStyleSheet = js.native
        def get_title():String = js.native
        def set_disabled(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMStyleSheetList extends DOMObject {
        def get_length():Any = js.native
        def item(index: Any):DOMStyleSheet = js.native
    }
    @js.native
    class DOMText extends DOMCharacterData {
        def get_whole_text():String = js.native
        def replace_whole_text(content: String):DOMText = js.native
        def split_text(offset: Any):DOMText = js.native
    }
    @js.native
    class DOMTextTrack extends DOMObject {
        def add_cue(cue: DOMTextTrackCue):Unit = js.native
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_active_cues():DOMTextTrackCueList = js.native
        def get_cues():DOMTextTrackCueList = js.native
        def get_id():String = js.native
        def get_kind():String = js.native
        def get_label():String = js.native
        def get_language():String = js.native
        def get_mode():String = js.native
        def remove_cue(cue: DOMTextTrackCue):Unit = js.native
        def set_mode(value: String):Unit = js.native
    }
    @js.native
    class DOMTextTrackCue extends DOMObject {
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_align():String = js.native
        def get_cue_as_html():DOMDocumentFragment = js.native
        def get_end_time():Any = js.native
        def get_id():String = js.native
        def get_line():Any = js.native
        def get_pause_on_exit():Boolean = js.native
        def get_position():Any = js.native
        def get_size():Any = js.native
        def get_snap_to_lines():Boolean = js.native
        def get_start_time():Any = js.native
        def get_text():String = js.native
        def get_track():DOMTextTrack = js.native
        def get_vertical():String = js.native
        def set_align(value: String):Unit = js.native
        def set_end_time(value: Any):Unit = js.native
        def set_id(value: String):Unit = js.native
        def set_line(value: Any):Unit = js.native
        def set_pause_on_exit(value: Boolean):Unit = js.native
        def set_position(value: Any):Unit = js.native
        def set_size(value: Any):Unit = js.native
        def set_snap_to_lines(value: Boolean):Unit = js.native
        def set_start_time(value: Any):Unit = js.native
        def set_text(value: String):Unit = js.native
        def set_vertical(value: String):Unit = js.native
    }
    @js.native
    class DOMTextTrackCueList extends DOMObject {
        def get_cue_by_id(id: String):DOMTextTrackCue = js.native
        def get_length():Any = js.native
        def item(index: Any):DOMTextTrackCue = js.native
    }
    @js.native
    class DOMTextTrackList extends DOMObject {
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_length():Any = js.native
        def get_track_by_id(id: String):DOMTextTrack = js.native
        def item(index: Any):DOMTextTrack = js.native
    }
    @js.native
    class DOMTimeRanges extends DOMObject {
        def end(index: Any):Any = js.native
        def get_length():Any = js.native
        def start(index: Any):Any = js.native
    }
    @js.native
    class DOMTouch extends DOMObject {
        def get_client_x():Any = js.native
        def get_client_y():Any = js.native
        def get_identifier():Any = js.native
        def get_page_x():Any = js.native
        def get_page_y():Any = js.native
        def get_screen_x():Any = js.native
        def get_screen_y():Any = js.native
        def get_target():Any = js.native
        def get_webkit_force():Any = js.native
        def get_webkit_radius_x():Any = js.native
        def get_webkit_radius_y():Any = js.native
        def get_webkit_rotation_angle():Any = js.native
    }
    @js.native
    class DOMTrackEvent extends DOMEvent {
    }
    @js.native
    class DOMTreeWalker extends DOMObject {
        def first_child():DOMNode = js.native
        def get_current_node():DOMNode = js.native
        def get_expand_entity_references():Boolean = js.native
        def get_filter():DOMNodeFilter = js.native
        def get_root():DOMNode = js.native
        def get_what_to_show():Any = js.native
        def last_child():DOMNode = js.native
        def next_node():DOMNode = js.native
        def next_sibling():DOMNode = js.native
        def parent_node():DOMNode = js.native
        def previous_node():DOMNode = js.native
        def previous_sibling():DOMNode = js.native
        def set_current_node(value: DOMNode):Unit = js.native
    }
    @js.native
    class DOMUIEvent extends DOMEvent {
        def get_char_code():Any = js.native
        def get_detail():Any = js.native
        def get_key_code():Any = js.native
        def get_layer_x():Any = js.native
        def get_layer_y():Any = js.native
        def get_page_x():Any = js.native
        def get_page_y():Any = js.native
        def get_view():DOMDOMWindow = js.native
        def get_which():Any = js.native
        def init_ui_event(type0: String, canBubble: Boolean, cancelable: Boolean, view: DOMDOMWindow, detail: Any):Unit = js.native
    }
    @js.native
    class DOMValidityState extends DOMObject {
        def get_bad_input():Boolean = js.native
        def get_custom_error():Boolean = js.native
        def get_pattern_mismatch():Boolean = js.native
        def get_range_overflow():Boolean = js.native
        def get_range_underflow():Boolean = js.native
        def get_step_mismatch():Boolean = js.native
        def get_too_long():Boolean = js.native
        def get_type_mismatch():Boolean = js.native
        def get_valid():Boolean = js.native
        def get_value_missing():Boolean = js.native
    }
    @js.native
    class DOMVideoPlaybackQuality extends DOMObject {
        def get_corrupted_video_frames():Any = js.native
        def get_creation_time():Any = js.native
        def get_dropped_video_frames():Any = js.native
        def get_total_frame_delay():Any = js.native
        def get_total_video_frames():Any = js.native
    }
    @js.native
    class DOMVideoTrack extends DOMObject {
        def get_id():String = js.native
        def get_kind():String = js.native
        def get_label():String = js.native
        def get_language():String = js.native
        def get_selected():Boolean = js.native
        def set_selected(value: Boolean):Unit = js.native
    }
    @js.native
    class DOMVideoTrackList extends DOMObject {
        def dispatch_event(evt: DOMEvent):Boolean = js.native
        def get_length():Any = js.native
        def get_track_by_id(id: String):DOMVideoTrack = js.native
        def item(index: Any):DOMVideoTrack = js.native
    }
    @js.native
    class DOMWebKitNamedFlow extends DOMObject {
        def dispatch_event(event: DOMEvent):Boolean = js.native
        def get_content():DOMNodeList = js.native
        def get_content_nodes():DOMNodeList = js.native
        def get_first_empty_region_index():Any = js.native
        def get_name():String = js.native
        def get_overflow():Boolean = js.native
        def get_overset():Boolean = js.native
        def get_regions():DOMNodeList = js.native
        def get_regions_by_content(contentNode: DOMNode):DOMNodeList = js.native
        def get_regions_by_content_node(content_node: DOMNode):DOMNodeList = js.native
    }
    @js.native
    class DOMWebKitPoint extends DOMObject {
        def get_x():Any = js.native
        def get_y():Any = js.native
        def set_x(value: Any):Unit = js.native
        def set_y(value: Any):Unit = js.native
    }
    @js.native
    class DOMWheelEvent extends DOMMouseEvent {
        def get_delta_mode():Any = js.native
        def get_delta_x():Any = js.native
        def get_delta_y():Any = js.native
        def get_delta_z():Any = js.native
        def get_webkit_direction_inverted_from_device():Boolean = js.native
        def get_wheel_delta():Any = js.native
        def get_wheel_delta_x():Any = js.native
        def get_wheel_delta_y():Any = js.native
        def init_wheel_event(wheelDeltaX: Any, wheelDeltaY: Any, view: DOMDOMWindow, screenX: Any, screenY: Any, clientX: Any, clientY: Any, ctrlKey: Boolean, altKey: Boolean, shiftKey: Boolean, metaKey: Boolean):Unit = js.native
    }
    @js.native
    class DOMXPathExpression extends DOMObject {
        def evaluate(contextNode: DOMNode, type0: Any, inResult: DOMXPathResult):DOMXPathResult = js.native
    }
    @js.native
    class DOMXPathNSResolver extends DOMObject {
        def lookup_namespace_uri(prefix: String):String = js.native
    }
    @js.native
    class DOMXPathResult extends DOMObject {
        def get_Boolean_value():Boolean = js.native
        def get_invalid_iterator_state():Boolean = js.native
        def get_number_value():Any = js.native
        def get_result_type():Any = js.native
        def get_single_node_value():DOMNode = js.native
        def get_snapshot_length():Any = js.native
        def get_string_value():String = js.native
        def iterate_next():DOMNode = js.native
        def snapshot_item(index: Any):DOMNode = js.native
    }
    @js.native
    class Download extends GObject.Object {
        def this(config: js.Any) = this()
        def cancel():Unit = js.native
        def get_current_size():Any = js.native
        def get_destination_uri():String = js.native
        def get_elapsed_time():Any = js.native
        def get_network_request():NetworkRequest = js.native
        def get_network_response():NetworkResponse = js.native
        def get_progress():Any = js.native
        def get_status():Double = js.native
        def get_suggested_filename():String = js.native
        def get_total_size():Any = js.native
        def get_uri():String = js.native
        def set_destination_uri(destination_uri: String):Unit = js.native
        def start():Unit = js.native
    }
    @js.native
    class FaviconDatabase extends GObject.Object {
        def clear():Unit = js.native
        def get_favicon_pixbuf(page_uri: String, width: Any, height: Any, cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def get_favicon_pixbuf_finish(result: Any):Any = js.native
        def get_favicon_uri(page_uri: String):String = js.native
        def get_path():String = js.native
        def set_path(path: String):Unit = js.native
        def try_get_favicon_pixbuf(page_uri: String, width: Any, height: Any):Any = js.native
    }
    @js.native
    class FileChooserRequest extends GObject.Object {
        def get_mime_types():js.Array[String] = js.native
        def get_mime_types_filter():Gtk.FileFilter = js.native
        def get_select_multiple():Boolean = js.native
        def get_selected_files():js.Array[String] = js.native
        def select_files(files: js.Array[String]):Unit = js.native
    }
    @js.native
    class GeolocationPolicyDecision extends GObject.Object {
    }
    @js.native
    class HitTestResult extends GObject.Object {
    }
    @js.native
    class IconDatabase extends GObject.Object {
        def clear():Unit = js.native
        def get_icon_pixbuf(page_uri: String):Any = js.native
        def get_icon_uri(page_uri: String):String = js.native
        def get_path():String = js.native
        def set_path(path: String):Unit = js.native
    }
    @js.native
    class NetworkRequest extends GObject.Object {
        def this(config: js.Any) = this()
        def get_message():Soup.Message = js.native
        def get_uri():String = js.native
        def set_uri(uri: String):Unit = js.native
    }
    @js.native
    class NetworkResponse extends GObject.Object {
        def this(config: js.Any) = this()
        def get_message():Soup.Message = js.native
        def get_suggested_filename():String = js.native
        def get_uri():String = js.native
        def set_uri(uri: String):Unit = js.native
    }
    @js.native
    class SecurityOrigin extends GObject.Object {
        def get_all_web_databases():Any = js.native
        def get_host():String = js.native
        def get_port():Any = js.native
        def get_protocol():String = js.native
        def get_web_database_quota():Any = js.native
        def get_web_database_usage():Any = js.native
        def set_web_database_quota(quota: Any):Unit = js.native
    }
    @js.native
    class SoupAuthDialog extends GObject.Object {
    }
    @js.native
    class ViewportAttributes extends GObject.Object {
        def recompute():Unit = js.native
    }
    @js.native
    class WebBackForwardList extends GObject.Object {
        def this(config: js.Any) = this()
        def add_item(history_item: WebHistoryItem):Unit = js.native
        def clear():Unit = js.native
        def contains_item(history_item: WebHistoryItem):Boolean = js.native
        def get_back_item():WebHistoryItem = js.native
        def get_back_length():Any = js.native
        def get_back_list_with_limit(limit: Any):Any = js.native
        def get_current_item():WebHistoryItem = js.native
        def get_forward_item():WebHistoryItem = js.native
        def get_forward_length():Any = js.native
        def get_forward_list_with_limit(limit: Any):Any = js.native
        def get_limit():Any = js.native
        def get_nth_item(index: Any):WebHistoryItem = js.native
        def go_back():Unit = js.native
        def go_forward():Unit = js.native
        def go_to_item(history_item: WebHistoryItem):Unit = js.native
        def set_limit(limit: Any):Unit = js.native
    }
    @js.native
    object WebBackForwardList extends js.Object {
        def new_with_web_view(web_view: WebView):WebBackForwardList = js.native
    }
    @js.native
    class WebDataSource extends GObject.Object {
        def this(config: js.Any) = this()
        def get_data():Any = js.native
        def get_encoding():String = js.native
        def get_initial_request():NetworkRequest = js.native
        def get_main_resource():WebResource = js.native
        def get_request():NetworkRequest = js.native
        def get_subresources():Any = js.native
        def get_unreachable_uri():String = js.native
        def get_web_frame():WebFrame = js.native
        def is_loading():Boolean = js.native
    }
    @js.native
    object WebDataSource extends js.Object {
        def new_with_request(request: NetworkRequest):WebDataSource = js.native
    }
    @js.native
    class WebDatabase extends GObject.Object {
        def get_display_name():String = js.native
        def get_expected_size():Any = js.native
        def get_filename():String = js.native
        def get_name():String = js.native
        def get_security_origin():SecurityOrigin = js.native
        def get_size():Any = js.native
        def remove():Unit = js.native
    }
    @js.native
    class WebFrame extends GObject.Object {
        def this(config: js.Any) = this()
        def find_frame(name: String):WebFrame = js.native
        def get_data_source():WebDataSource = js.native
        def get_dom_document():DOMDocument = js.native
        def get_global_context():Any = js.native
        def get_horizontal_scrollbar_policy():Double = js.native
        def get_load_status():Double = js.native
        def get_name():String = js.native
        def get_network_response():NetworkResponse = js.native
        def get_parent():WebFrame = js.native
        def get_provisional_data_source():WebDataSource = js.native
        def get_range_for_word_around_caret():DOMRange = js.native
        def get_security_origin():SecurityOrigin = js.native
        def get_title():String = js.native
        def get_uri():String = js.native
        def get_vertical_scrollbar_policy():Double = js.native
        def get_web_view():WebView = js.native
        def load_alternate_string(content: String, base_url: String, unreachable_url: String):Unit = js.native
        def load_request(request: NetworkRequest):Unit = js.native
        def load_string(content: String, mime_type0: String, encoding: String, base_uri: String):Unit = js.native
        def load_uri(uri: String):Unit = js.native
        def print():Unit = js.native
        def print_full(operation: Gtk.PrintOperation, action: Double):Double = js.native
        def reload():Unit = js.native
        def replace_selection(text: String):Unit = js.native
        def stop_loading():Unit = js.native
    }
    @js.native
    class WebHistoryItem extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():WebHistoryItem = js.native
        def get_alternate_title():String = js.native
        def get_last_visited_time():Any = js.native
        def get_original_uri():String = js.native
        def get_title():String = js.native
        def get_uri():String = js.native
        def set_alternate_title(title: String):Unit = js.native
    }
    @js.native
    object WebHistoryItem extends js.Object {
        def new_with_data(uri: String, title: String):WebHistoryItem = js.native
    }
    @js.native
    class WebInspector extends GObject.Object {
        def close():Unit = js.native
        def get_inspected_uri():String = js.native
        def get_web_view():WebView = js.native
        def inspect_coordinates(x: Any, y: Any):Unit = js.native
        def inspect_node(node: DOMNode):Unit = js.native
        def show():Unit = js.native
    }
    @js.native
    class WebNavigationAction extends GObject.Object {
        def get_button():Any = js.native
        def get_modifier_state():Any = js.native
        def get_original_uri():String = js.native
        def get_reason():Double = js.native
        def get_target_frame():String = js.native
        def set_original_uri(originalUri: String):Unit = js.native
        def set_reason(reason: Double):Unit = js.native
    }
    @js.native
    class WebPlugin extends GObject.Object {
        def get_description():String = js.native
        def get_enabled():Boolean = js.native
        def get_mimetypes():Any = js.native
        def get_name():String = js.native
        def get_path():String = js.native
        def set_enabled(enabled: Boolean):Unit = js.native
    }
    @js.native
    class WebPluginDatabase extends GObject.Object {
        def get_plugin_for_mimetype(mime_type0: String):WebPlugin = js.native
        def get_plugins():Any = js.native
        def refresh():Unit = js.native
    }
    @js.native
    object WebPluginDatabase extends js.Object {
        def plugins_list_free(list: Any):Unit = js.native
    }
    @js.native
    class WebPolicyDecision extends GObject.Object {
        def download():Unit = js.native
        def ignore():Unit = js.native
        def use():Unit = js.native
    }
    @js.native
    class WebResource extends GObject.Object {
        def this(config: js.Any) = this()
        def get_data():Any = js.native
        def get_encoding():String = js.native
        def get_frame_name():String = js.native
        def get_mime_type():String = js.native
        def get_uri():String = js.native
    }
    @js.native
    class WebSettings extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():WebSettings = js.native
        def get_user_agent():String = js.native
    }
    @js.native
    class WebView extends Gtk.Container {
        def this(config: js.Any) = this()
        def can_copy_clipboard():Boolean = js.native
        def can_cut_clipboard():Boolean = js.native
        def can_go_back():Boolean = js.native
        def can_go_back_or_forward(steps: Any):Boolean = js.native
        def can_go_forward():Boolean = js.native
        def can_paste_clipboard():Boolean = js.native
        def can_redo():Boolean = js.native
        def can_show_mime_type(mime_type0: String):Boolean = js.native
        def can_undo():Boolean = js.native
        def copy_clipboard():Unit = js.native
        def cut_clipboard():Unit = js.native
        def delete_selection():Unit = js.native
        def execute_script(script: String):Unit = js.native
        def get_back_forward_list():WebBackForwardList = js.native
        def get_copy_target_list():Any = js.native
        def get_custom_encoding():String = js.native
        def get_dom_document():DOMDocument = js.native
        def get_editable():Boolean = js.native
        def get_encoding():String = js.native
        def get_focused_frame():WebFrame = js.native
        def get_full_content_zoom():Boolean = js.native
        def get_hit_test_result(event: Any):HitTestResult = js.native
        def get_icon_pixbuf():Any = js.native
        def get_icon_uri():String = js.native
        def get_inspector():WebInspector = js.native
        def get_load_status():Double = js.native
        def get_main_frame():WebFrame = js.native
        def get_paste_target_list():Any = js.native
        def get_progress():Any = js.native
        override def get_settings():Any = js.native

        def get_snapshot():Any = js.native
        def get_title():String = js.native
        def get_transparent():Boolean = js.native
        def get_uri():String = js.native
        def get_view_mode():Double = js.native
        def get_view_source_mode():Boolean = js.native
        def get_viewport_attributes():ViewportAttributes = js.native
        def get_window_features():WebWindowFeatures = js.native
        def get_zoom_level():Any = js.native
        def go_back():Unit = js.native
        def go_back_or_forward(steps: Any):Unit = js.native
        def go_forward():Unit = js.native
        def go_to_back_forward_item(item: WebHistoryItem):Boolean = js.native
        def has_selection():Boolean = js.native
        def load_html_string(content: String, base_uri: String):Unit = js.native
        def load_request(request: NetworkRequest):Unit = js.native
        def load_string(content: String, mime_type0: String, encoding: String, base_uri: String):Unit = js.native
        def load_uri(uri: String):Unit = js.native
        def mark_text_matches(string: String, case_sensitive: Boolean, limit: Any):Any = js.native
        def move_cursor(step: Double, count: Any):Unit = js.native
        def open(uri: String):Unit = js.native
        def paste_clipboard():Unit = js.native
        def redo():Unit = js.native
        def reload():Unit = js.native
        def reload_bypass_cache():Unit = js.native
        def search_text(text: String, case_sensitive: Boolean, forward: Boolean, wrap: Boolean):Boolean = js.native
        def select_all():Unit = js.native
        def set_custom_encoding(encoding: String):Unit = js.native
        def set_editable(flag: Boolean):Unit = js.native
        def set_full_content_zoom(full_content_zoom: Boolean):Unit = js.native
        def set_highlight_text_matches(highlight: Boolean):Unit = js.native
        def set_maintains_back_forward_list(flag: Boolean):Unit = js.native
        def set_settings(settings: WebSettings):Unit = js.native
        def set_transparent(flag: Boolean):Unit = js.native
        def set_view_mode(mode: Double):Unit = js.native
        def set_view_source_mode(view_source_mode: Boolean):Unit = js.native
        def set_zoom_level(zoom_level: Any):Unit = js.native
        def stop_loading():Unit = js.native
        def try_get_favicon_pixbuf(width: Any, height: Any):Any = js.native
        def undo():Unit = js.native
        def unmark_text_matches():Unit = js.native
        def zoom_in():Unit = js.native
        def zoom_out():Unit = js.native
    }
    @js.native
    class WebWindowFeatures extends GObject.Object {
        def this(config: js.Any) = this()
        def equal(features2: WebWindowFeatures):Boolean = js.native
    }
}