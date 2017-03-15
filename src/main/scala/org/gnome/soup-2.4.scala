/**
 * Soup.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Soup")
@js.native
object Soup extends js.Object {
    val ADDRESS_ANY_PORT:Any = js.native
    val ADDRESS_FAMILY:String = js.native
    val ADDRESS_NAME:String = js.native
    val ADDRESS_PHYSICAL:String = js.native
    val ADDRESS_PORT:String = js.native
    val ADDRESS_PROTOCOL:String = js.native
    val ADDRESS_SOCKADDR:String = js.native
    val AUTH_DOMAIN_ADD_PATH:String = js.native
    val AUTH_DOMAIN_BASIC_AUTH_CALLBACK:String = js.native
    val AUTH_DOMAIN_BASIC_AUTH_DATA:String = js.native
    val AUTH_DOMAIN_BASIC_H:Any = js.native
    val AUTH_DOMAIN_DIGEST_AUTH_CALLBACK:String = js.native
    val AUTH_DOMAIN_DIGEST_AUTH_DATA:String = js.native
    val AUTH_DOMAIN_DIGEST_H:Any = js.native
    val AUTH_DOMAIN_FILTER:String = js.native
    val AUTH_DOMAIN_FILTER_DATA:String = js.native
    val AUTH_DOMAIN_GENERIC_AUTH_CALLBACK:String = js.native
    val AUTH_DOMAIN_GENERIC_AUTH_DATA:String = js.native
    val AUTH_DOMAIN_H:Any = js.native
    val AUTH_DOMAIN_PROXY:String = js.native
    val AUTH_DOMAIN_REALM:String = js.native
    val AUTH_DOMAIN_REMOVE_PATH:String = js.native
    val AUTH_H:Any = js.native
    val AUTH_HOST:String = js.native
    val AUTH_IS_AUTHENTICATED:String = js.native
    val AUTH_IS_FOR_PROXY:String = js.native
    val AUTH_MANAGER_H:Any = js.native
    val AUTH_REALM:String = js.native
    val AUTH_SCHEME_NAME:String = js.native
    val CACHE_H:Any = js.native
    val CHAR_HTTP_CTL:Any = js.native
    val CHAR_HTTP_SEPARATOR:Any = js.native
    val CHAR_URI_GEN_DELIMS:Any = js.native
    val CHAR_URI_PERCENT_ENCODED:Any = js.native
    val CHAR_URI_SUB_DELIMS:Any = js.native
    val CONTENT_DECODER_H:Any = js.native
    val CONTENT_SNIFFER_H:Any = js.native
    val COOKIE_H:Any = js.native
    val COOKIE_JAR_ACCEPT_POLICY:String = js.native
    val COOKIE_JAR_DB_FILENAME:String = js.native
    val COOKIE_JAR_DB_H:Any = js.native
    val COOKIE_JAR_H:Any = js.native
    val COOKIE_JAR_READ_ONLY:String = js.native
    val COOKIE_JAR_TEXT_FILENAME:String = js.native
    val COOKIE_JAR_TEXT_H:Any = js.native
    val COOKIE_MAX_AGE_ONE_DAY:Any = js.native
    val COOKIE_MAX_AGE_ONE_HOUR:Any = js.native
    val COOKIE_MAX_AGE_ONE_WEEK:Any = js.native
    val COOKIE_MAX_AGE_ONE_YEAR:Any = js.native
    val DATE_H:Any = js.native
    val FORM_H:Any = js.native
    val FORM_MIME_TYPE_MULTIPART:String = js.native
    val FORM_MIME_TYPE_URLENCODED:String = js.native
    val HEADERS_H:Any = js.native
    val LOGGER_H:Any = js.native
    val MESSAGE_BODY_H:Any = js.native
    val MESSAGE_FIRST_PARTY:String = js.native
    val MESSAGE_FLAGS:String = js.native
    val MESSAGE_H:Any = js.native
    val MESSAGE_HEADERS_H:Any = js.native
    val MESSAGE_HTTP_VERSION:String = js.native
    val MESSAGE_METHOD:String = js.native
    val MESSAGE_PRIORITY:String = js.native
    val MESSAGE_REASON_PHRASE:String = js.native
    val MESSAGE_REQUEST_BODY:String = js.native
    val MESSAGE_REQUEST_BODY_DATA:String = js.native
    val MESSAGE_REQUEST_HEADERS:String = js.native
    val MESSAGE_RESPONSE_BODY:String = js.native
    val MESSAGE_RESPONSE_BODY_DATA:String = js.native
    val MESSAGE_RESPONSE_HEADERS:String = js.native
    val MESSAGE_SERVER_SIDE:String = js.native
    val MESSAGE_STATUS_CODE:String = js.native
    val MESSAGE_TLS_CERTIFICATE:String = js.native
    val MESSAGE_TLS_ERRORS:String = js.native
    val MESSAGE_URI:String = js.native
    val METHOD_H:Any = js.native
    val MISC_H:Any = js.native
    val MULTIPART_H:Any = js.native
    val MULTIPART_INPUT_STREAM_H:Any = js.native
    val PASSWORD_MANAGER_H:Any = js.native
    val PROXY_RESOLVER_DEFAULT_H:Any = js.native
    val PROXY_URI_RESOLVER_H:Any = js.native
    val REQUESTER_H:Any = js.native
    val REQUEST_DATA_H:Any = js.native
    val REQUEST_FILE_H:Any = js.native
    val REQUEST_H:Any = js.native
    val REQUEST_HTTP_H:Any = js.native
    val REQUEST_SESSION:String = js.native
    val REQUEST_URI:String = js.native
    val SERVER_ASYNC_CONTEXT:String = js.native
    val SERVER_H:Any = js.native
    val SERVER_HTTPS_ALIASES:String = js.native
    val SERVER_HTTP_ALIASES:String = js.native
    val SERVER_INTERFACE:String = js.native
    val SERVER_PORT:String = js.native
    val SERVER_RAW_PATHS:String = js.native
    val SERVER_SERVER_HEADER:String = js.native
    val SERVER_SSL_CERT_FILE:String = js.native
    val SERVER_SSL_KEY_FILE:String = js.native
    val SERVER_TLS_CERTIFICATE:String = js.native
    val SESSION_ACCEPT_LANGUAGE:String = js.native
    val SESSION_ACCEPT_LANGUAGE_AUTO:String = js.native
    val SESSION_ADD_FEATURE:String = js.native
    val SESSION_ADD_FEATURE_BY_TYPE:String = js.native
    val SESSION_ASYNC_CONTEXT:String = js.native
    val SESSION_ASYNC_H:Any = js.native
    val SESSION_FEATURE_H:Any = js.native
    val SESSION_H:Any = js.native
    val SESSION_HTTPS_ALIASES:String = js.native
    val SESSION_HTTP_ALIASES:String = js.native
    val SESSION_IDLE_TIMEOUT:String = js.native
    val SESSION_LOCAL_ADDRESS:String = js.native
    val SESSION_MAX_CONNS:String = js.native
    val SESSION_MAX_CONNS_PER_HOST:String = js.native
    val SESSION_PROXY_RESOLVER:String = js.native
    val SESSION_PROXY_URI:String = js.native
    val SESSION_REMOVE_FEATURE_BY_TYPE:String = js.native
    val SESSION_SSL_CA_FILE:String = js.native
    val SESSION_SSL_STRICT:String = js.native
    val SESSION_SSL_USE_SYSTEM_CA_FILE:String = js.native
    val SESSION_SYNC_H:Any = js.native
    val SESSION_TIMEOUT:String = js.native
    val SESSION_TLS_DATABASE:String = js.native
    val SESSION_TLS_INTERACTION:String = js.native
    val SESSION_USER_AGENT:String = js.native
    val SESSION_USE_NTLM:String = js.native
    val SESSION_USE_THREAD_CONTEXT:String = js.native
    val SOCKET_ASYNC_CONTEXT:String = js.native
    val SOCKET_FLAG_NONBLOCKING:String = js.native
    val SOCKET_H:Any = js.native
    val SOCKET_IS_SERVER:String = js.native
    val SOCKET_LOCAL_ADDRESS:String = js.native
    val SOCKET_REMOTE_ADDRESS:String = js.native
    val SOCKET_SSL_CREDENTIALS:String = js.native
    val SOCKET_SSL_FALLBACK:String = js.native
    val SOCKET_SSL_STRICT:String = js.native
    val SOCKET_TIMEOUT:String = js.native
    val SOCKET_TLS_CERTIFICATE:String = js.native
    val SOCKET_TLS_ERRORS:String = js.native
    val SOCKET_TRUSTED_CERTIFICATE:String = js.native
    val SOCKET_USE_THREAD_CONTEXT:String = js.native
    val STATUS_H:Any = js.native
    val TYPES_H:Any = js.native
    val URI_H:Any = js.native
    val VALUE_UTILS_H:Any = js.native
    val XMLRPC_H:Any = js.native
    val XMLRPC_OLD_H:Any = js.native
    def add_completion(async_context: Any, function0: Any, data: Object):Any = js.native
    def add_idle(async_context: Any, function0: Any, data: Object):Any = js.native
    def add_io_watch(async_context: Any, chan: Any, condition: Double, function0: Any, data: Object):Any = js.native
    def add_timeout(async_context: Any, interval0: Any, function0: Any, data: Object):Any = js.native
    def cookie_parse(header: String, origin: Any):Any = js.native
    def cookies_free(cookies: Any):Unit = js.native
    def cookies_from_request(msg: Message):Any = js.native
    def cookies_from_response(msg: Message):Any = js.native
    def cookies_to_cookie_header(cookies: Any):String = js.native
    def cookies_to_request(cookies: Any, msg: Message):Unit = js.native
    def cookies_to_response(cookies: Any, msg: Message):Unit = js.native
    def form_decode(encoded_form: String):Any = js.native
    def form_decode_multipart(msg: Message, file_control_name: String, filename: String, content_type0: String, file: Any):Any = js.native
    def form_encode(first_field: String, rest:Any*):String = js.native
    def form_encode_datalist(form_data_set: Any):String = js.native
    def form_encode_hash(form_data_set: Any):String = js.native
    def form_encode_valist(first_field: String, args: Any):String = js.native
    def form_request_new(method: String, uri: String, first_field: String, rest:Any*):Message = js.native
    def form_request_new_from_datalist(method: String, uri: String, form_data_set: Any):Message = js.native
    def form_request_new_from_hash(method: String, uri: String, form_data_set: Any):Message = js.native
    def form_request_new_from_multipart(uri: String, multipart: Any):Message = js.native
    def header_contains(header: String, token: String):Boolean = js.native
    def header_free_list(list: Any):Unit = js.native
    def header_free_param_list(param_list: Any):Unit = js.native
    def header_g_string_append_param(string: Any, name: String, value: String):Unit = js.native
    def header_g_string_append_param_quoted(string: Any, name: String, value: String):Unit = js.native
    def header_parse_list(header: String):Any = js.native
    def header_parse_param_list(header: String):Any = js.native
    def header_parse_quality_list(header: String, unacceptable: Any):Any = js.native
    def header_parse_semi_param_list(header: String):Any = js.native
    def headers_parse(str: String, len: Any, dest: Any):Boolean = js.native
    def headers_parse_request(str: String, len: Any, req_headers: Any, req_method: String, req_path: String, ver: Double):Any = js.native
    def headers_parse_response(str: String, len: Any, headers: Any, ver: Double, status_code: Any, reason_phrase: String):Boolean = js.native
    def headers_parse_status_line(status_line: String, ver: Double, status_code: Any, reason_phrase: String):Boolean = js.native
    def http_error_quark():Any = js.native
    def message_headers_iter_init(iter: Any, hdrs: Any):Unit = js.native
    def request_error_quark():Any = js.native
    def requester_error_quark():Any = js.native
    def status_get_phrase(status_code: Any):String = js.native
    def status_proxify(status_code: Any):Any = js.native
    def str_case_equal(v1: Object, v2: Object):Boolean = js.native
    def str_case_hash(key: Object):Any = js.native
    def tld_domain_is_public_suffix(domain: String):Boolean = js.native
    def tld_error_quark():Any = js.native
    def tld_get_base_domain(hostname: String):String = js.native
    def uri_decode(part: String):String = js.native
    def uri_encode(part: String, escape_extra: String):String = js.native
    def uri_normalize(part: String, unescape_extra: String):String = js.native
    def value_array_append(array: Any, type0: Any, rest:Any*):Unit = js.native
    def value_array_append_vals(array: Any, first_type0: Any, rest:Any*):Unit = js.native
    def value_array_from_args(args: Any):Any = js.native
    def value_array_get_nth(array: Any, index0: Any, type0: Any, rest:Any*):Boolean = js.native
    def value_array_insert(array: Any, index0: Any, type0: Any, rest:Any*):Unit = js.native
    def value_array_new():Any = js.native
    def value_array_new_with_vals(first_type0: Any, rest:Any*):Any = js.native
    def value_array_to_args(array: Any, args: Any):Boolean = js.native
    def value_hash_insert(hash: Any, key: String, type0: Any, rest:Any*):Unit = js.native
    def value_hash_insert_vals(hash: Any, first_key: String, rest:Any*):Unit = js.native
    def value_hash_insert_value(hash: Any, key: String, value: Any):Unit = js.native
    def value_hash_lookup(hash: Any, key: String, type0: Any, rest:Any*):Boolean = js.native
    def value_hash_lookup_vals(hash: Any, first_key: String, rest:Any*):Boolean = js.native
    def value_hash_new():Any = js.native
    def value_hash_new_with_vals(first_key: String, rest:Any*):Any = js.native
    def websocket_client_prepare_handshake(msg: Message, origin: String, protocols: js.Array[String]):Unit = js.native
    def websocket_client_verify_handshake(msg: Message):Boolean = js.native
    def websocket_error_get_quark():Any = js.native
    def websocket_server_check_handshake(msg: Message, origin: String, protocols: js.Array[String]):Boolean = js.native
    def websocket_server_process_handshake(msg: Message, expected_origin: String, protocols: js.Array[String]):Boolean = js.native
    def xmlrpc_build_fault(fault_code: Any, fault_format: String, rest:Any*):String = js.native
    def xmlrpc_build_method_call(method_name: String, params: js.Array[Any], n_params: Any):String = js.native
    def xmlrpc_build_method_response(value: Any):String = js.native
    def xmlrpc_build_request(method_name: String, params: Any):String = js.native
    def xmlrpc_build_response(value: Any):String = js.native
    def xmlrpc_error_quark():Any = js.native
    def xmlrpc_extract_method_call(method_call: String, length: Any, method_name: String, rest:Any*):Boolean = js.native
    def xmlrpc_extract_method_response(method_response: String, length: Any, error: Any, type0: Any, rest:Any*):Boolean = js.native
    def xmlrpc_fault_quark():Any = js.native
    def xmlrpc_message_new(uri: String, method_name: String, params: Any):Message = js.native
    def xmlrpc_message_set_fault(msg: Message, fault_code: Any, fault_format: String, rest:Any*):Unit = js.native
    def xmlrpc_message_set_response(msg: Message, value: Any):Boolean = js.native
    def xmlrpc_parse_method_call(method_call: String, length: Any, method_name: String, params: Any):Boolean = js.native
    def xmlrpc_parse_method_response(method_response: String, length: Any, value: Any):Boolean = js.native
    def xmlrpc_parse_request(method_call: String, length: Any, params: Any):String = js.native
    def xmlrpc_parse_response(method_response: String, length: Any, signature: String):Any = js.native
    def xmlrpc_request_new(uri: String, method_name: String, rest:Any*):Message = js.native
    def xmlrpc_set_fault(msg: Message, fault_code: Any, fault_format: String, rest:Any*):Unit = js.native
    def xmlrpc_set_response(msg: Message, type0: Any, rest:Any*):Unit = js.native
    def xmlrpc_variant_get_datetime(variant: Any):Any = js.native
    def xmlrpc_variant_new_datetime(date: Any):Any = js.native
    @js.native
    object AddressFamily extends js.Object {
        val INVALID:Double = js.native
        val IPV4:Double = js.native
        val IPV6:Double = js.native
    }
    @js.native
    object CacheResponse extends js.Object {
        val FRESH:Double = js.native
        val NEEDS_VALIDATION:Double = js.native
        val STALE:Double = js.native
    }
    @js.native
    object CacheType extends js.Object {
        val SINGLE_USER:Double = js.native
        val SHARED:Double = js.native
    }
    @js.native
    object ConnectionState extends js.Object {
        val NEW:Double = js.native
        val CONNECTING:Double = js.native
        val IDLE:Double = js.native
        val IN_USE:Double = js.native
        val REMOTE_DISCONNECTED:Double = js.native
        val DISCONNECTED:Double = js.native
    }
    @js.native
    object CookieJarAcceptPolicy extends js.Object {
        val ALWAYS:Double = js.native
        val NEVER:Double = js.native
        val NO_THIRD_PARTY:Double = js.native
    }
    @js.native
    object DateFormat extends js.Object {
        val HTTP:Double = js.native
        val COOKIE:Double = js.native
        val RFC2822:Double = js.native
        val ISO8601_COMPACT:Double = js.native
        val ISO8601_FULL:Double = js.native
        val ISO8601:Double = js.native
        val ISO8601_XMLRPC:Double = js.native
    }
    @js.native
    object Encoding extends js.Object {
        val UNRECOGNIZED:Double = js.native
        val NONE:Double = js.native
        val CONTENT_LENGTH:Double = js.native
        val EOF:Double = js.native
        val CHUNKED:Double = js.native
        val BYTERANGES:Double = js.native
    }
    @js.native
    object HTTPVersion extends js.Object {
        val HTTP_1_0:Double = js.native
        val HTTP_1_1:Double = js.native
    }
    @js.native
    object KnownStatusCode extends js.Object {
        val NONE:Double = js.native
        val CANCELLED:Double = js.native
        val CANT_RESOLVE:Double = js.native
        val CANT_RESOLVE_PROXY:Double = js.native
        val CANT_CONNECT:Double = js.native
        val CANT_CONNECT_PROXY:Double = js.native
        val SSL_FAILED:Double = js.native
        val IO_ERROR:Double = js.native
        val MALFORMED:Double = js.native
        val TRY_AGAIN:Double = js.native
        val TOO_MANY_REDIRECTS:Double = js.native
        val TLS_FAILED:Double = js.native
        val CONTINUE:Double = js.native
        val SWITCHING_PROTOCOLS:Double = js.native
        val PROCESSING:Double = js.native
        val OK:Double = js.native
        val CREATED:Double = js.native
        val ACCEPTED:Double = js.native
        val NON_AUTHORITATIVE:Double = js.native
        val NO_CONTENT:Double = js.native
        val RESET_CONTENT:Double = js.native
        val PARTIAL_CONTENT:Double = js.native
        val MULTI_STATUS:Double = js.native
        val MULTIPLE_CHOICES:Double = js.native
        val MOVED_PERMANENTLY:Double = js.native
        val FOUND:Double = js.native
        val MOVED_TEMPORARILY:Double = js.native
        val SEE_OTHER:Double = js.native
        val NOT_MODIFIED:Double = js.native
        val USE_PROXY:Double = js.native
        val NOT_APPEARING_IN_THIS_PROTOCOL:Double = js.native
        val TEMPORARY_REDIRECT:Double = js.native
        val BAD_REQUEST:Double = js.native
        val UNAUTHORIZED:Double = js.native
        val PAYMENT_REQUIRED:Double = js.native
        val FORBIDDEN:Double = js.native
        val NOT_FOUND:Double = js.native
        val METHOD_NOT_ALLOWED:Double = js.native
        val NOT_ACCEPTABLE:Double = js.native
        val PROXY_AUTHENTICATION_REQUIRED:Double = js.native
        val PROXY_UNAUTHORIZED:Double = js.native
        val REQUEST_TIMEOUT:Double = js.native
        val CONFLICT:Double = js.native
        val GONE:Double = js.native
        val LENGTH_REQUIRED:Double = js.native
        val PRECONDITION_FAILED:Double = js.native
        val REQUEST_ENTITY_TOO_LARGE:Double = js.native
        val REQUEST_URI_TOO_LONG:Double = js.native
        val UNSUPPORTED_MEDIA_TYPE:Double = js.native
        val REQUESTED_RANGE_NOT_SATISFIABLE:Double = js.native
        val INVALID_RANGE:Double = js.native
        val EXPECTATION_FAILED:Double = js.native
        val UNPROCESSABLE_ENTITY:Double = js.native
        val LOCKED:Double = js.native
        val FAILED_DEPENDENCY:Double = js.native
        val INTERNAL_SERVER_ERROR:Double = js.native
        val NOT_IMPLEMENTED:Double = js.native
        val BAD_GATEWAY:Double = js.native
        val SERVICE_UNAVAILABLE:Double = js.native
        val GATEWAY_TIMEOUT:Double = js.native
        val HTTP_VERSION_NOT_SUPPORTED:Double = js.native
        val INSUFFICIENT_STORAGE:Double = js.native
        val NOT_EXTENDED:Double = js.native
    }
    @js.native
    object LoggerLogLevel extends js.Object {
        val NONE:Double = js.native
        val MINIMAL:Double = js.native
        val HEADERS:Double = js.native
        val BODY:Double = js.native
    }
    @js.native
    object Any extends js.Object {
        val STATIC:Double = js.native
        val TAKE:Double = js.native
        val COPY:Double = js.native
        val TEMPORARY:Double = js.native
    }
    @js.native
    object MessageHeadersType extends js.Object {
        val REQUEST:Double = js.native
        val RESPONSE:Double = js.native
        val MULTIPART:Double = js.native
    }
    @js.native
    object MessagePriority extends js.Object {
        val VERY_LOW:Double = js.native
        val LOW:Double = js.native
        val NORMAL:Double = js.native
        val HIGH:Double = js.native
        val VERY_HIGH:Double = js.native
    }
    @js.native
    object RequestError extends js.Object {
        val BAD_URI:Double = js.native
        val UNSUPPORTED_URI_SCHEME:Double = js.native
        val PARSING:Double = js.native
        val ENCODING:Double = js.native
    }
    @js.native
    object RequesterError extends js.Object {
        val BAD_URI:Double = js.native
        val UNSUPPORTED_URI_SCHEME:Double = js.native
    }
    @js.native
    object SocketIOStatus extends js.Object {
        val OK:Double = js.native
        val WOULD_BLOCK:Double = js.native
        val EOF:Double = js.native
        val ERROR:Double = js.native
    }
    @js.native
    object Status extends js.Object {
        val NONE:Double = js.native
        val CANCELLED:Double = js.native
        val CANT_RESOLVE:Double = js.native
        val CANT_RESOLVE_PROXY:Double = js.native
        val CANT_CONNECT:Double = js.native
        val CANT_CONNECT_PROXY:Double = js.native
        val SSL_FAILED:Double = js.native
        val IO_ERROR:Double = js.native
        val MALFORMED:Double = js.native
        val TRY_AGAIN:Double = js.native
        val TOO_MANY_REDIRECTS:Double = js.native
        val TLS_FAILED:Double = js.native
        val CONTINUE:Double = js.native
        val SWITCHING_PROTOCOLS:Double = js.native
        val PROCESSING:Double = js.native
        val OK:Double = js.native
        val CREATED:Double = js.native
        val ACCEPTED:Double = js.native
        val NON_AUTHORITATIVE:Double = js.native
        val NO_CONTENT:Double = js.native
        val RESET_CONTENT:Double = js.native
        val PARTIAL_CONTENT:Double = js.native
        val MULTI_STATUS:Double = js.native
        val MULTIPLE_CHOICES:Double = js.native
        val MOVED_PERMANENTLY:Double = js.native
        val FOUND:Double = js.native
        val MOVED_TEMPORARILY:Double = js.native
        val SEE_OTHER:Double = js.native
        val NOT_MODIFIED:Double = js.native
        val USE_PROXY:Double = js.native
        val NOT_APPEARING_IN_THIS_PROTOCOL:Double = js.native
        val TEMPORARY_REDIRECT:Double = js.native
        val BAD_REQUEST:Double = js.native
        val UNAUTHORIZED:Double = js.native
        val PAYMENT_REQUIRED:Double = js.native
        val FORBIDDEN:Double = js.native
        val NOT_FOUND:Double = js.native
        val METHOD_NOT_ALLOWED:Double = js.native
        val NOT_ACCEPTABLE:Double = js.native
        val PROXY_AUTHENTICATION_REQUIRED:Double = js.native
        val PROXY_UNAUTHORIZED:Double = js.native
        val REQUEST_TIMEOUT:Double = js.native
        val CONFLICT:Double = js.native
        val GONE:Double = js.native
        val LENGTH_REQUIRED:Double = js.native
        val PRECONDITION_FAILED:Double = js.native
        val REQUEST_ENTITY_TOO_LARGE:Double = js.native
        val REQUEST_URI_TOO_LONG:Double = js.native
        val UNSUPPORTED_MEDIA_TYPE:Double = js.native
        val REQUESTED_RANGE_NOT_SATISFIABLE:Double = js.native
        val INVALID_RANGE:Double = js.native
        val EXPECTATION_FAILED:Double = js.native
        val UNPROCESSABLE_ENTITY:Double = js.native
        val LOCKED:Double = js.native
        val FAILED_DEPENDENCY:Double = js.native
        val INTERNAL_SERVER_ERROR:Double = js.native
        val NOT_IMPLEMENTED:Double = js.native
        val BAD_GATEWAY:Double = js.native
        val SERVICE_UNAVAILABLE:Double = js.native
        val GATEWAY_TIMEOUT:Double = js.native
        val HTTP_VERSION_NOT_SUPPORTED:Double = js.native
        val INSUFFICIENT_STORAGE:Double = js.native
        val NOT_EXTENDED:Double = js.native
    }
    @js.native
    object TLDError extends js.Object {
        val INVALID_HOSTNAME:Double = js.native
        val IS_IP_ADDRESS:Double = js.native
        val NOT_ENOUGH_DOMAINS:Double = js.native
        val NO_BASE_DOMAIN:Double = js.native
    }
    @js.native
    object WebsocketCloseCode extends js.Object {
        val NORMAL:Double = js.native
        val GOING_AWAY:Double = js.native
        val PROTOCOL_ERROR:Double = js.native
        val UNSUPPORTED_DATA:Double = js.native
        val NO_STATUS:Double = js.native
        val ABNORMAL:Double = js.native
        val BAD_DATA:Double = js.native
        val POLICY_VIOLATION:Double = js.native
        val TOO_BIG:Double = js.native
        val NO_EXTENSION:Double = js.native
        val SERVER_ERROR:Double = js.native
        val TLS_HANDSHAKE:Double = js.native
    }
    @js.native
    object WebsocketConnectionType extends js.Object {
        val UNKNOWN:Double = js.native
        val CLIENT:Double = js.native
        val SERVER:Double = js.native
    }
    @js.native
    object WebsocketDataType extends js.Object {
        val TEXT:Double = js.native
        val BINARY:Double = js.native
    }
    @js.native
    object WebsocketError extends js.Object {
        val FAILED:Double = js.native
        val NOT_WEBSOCKET:Double = js.native
        val BAD_HANDSHAKE:Double = js.native
        val BAD_ORIGIN:Double = js.native
    }
    @js.native
    object WebsocketState extends js.Object {
        val OPEN:Double = js.native
        val CLOSING:Double = js.native
        val CLOSED:Double = js.native
    }
    @js.native
    object XMLRPCError extends js.Object {
        val ARGUMENTS:Double = js.native
        val RETVAL:Double = js.native
    }
    @js.native
    object XMLRPCFault extends js.Object {
        val PARSE_ERROR_NOT_WELL_FORMED:Double = js.native
        val PARSE_ERROR_UNSUPPORTED_ENCODING:Double = js.native
        val PARSE_ERROR_INVALID_CHARACTER_FOR_ENCODING:Double = js.native
        val SERVER_ERROR_INVALID_XML_RPC:Double = js.native
        val SERVER_ERROR_REQUESTED_METHOD_NOT_FOUND:Double = js.native
        val SERVER_ERROR_INVALID_METHOD_PARAMETERS:Double = js.native
        val SERVER_ERROR_INTERNAL_XML_RPC_ERROR:Double = js.native
        val APPLICATION_ERROR:Double = js.native
        val SYSTEM_ERROR:Double = js.native
        val TRANSPORT_ERROR:Double = js.native
    }
    @js.native
    object Cacheability extends js.Object {
        val CACHEABLE:Double = js.native
        val UNCACHEABLE:Double = js.native
        val INVALIDATES:Double = js.native
        val VALIDATES:Double = js.native
    }
    @js.native
    object Expectation extends js.Object {
        val UNRECOGNIZED:Double = js.native
        val CONTINUE:Double = js.native
    }
    @js.native
    object MessageFlags extends js.Object {
        val NO_REDIRECT:Double = js.native
        val CAN_REBUILD:Double = js.native
        val OVERWRITE_CHUNKS:Double = js.native
        val CONTENT_DECODED:Double = js.native
        val CERTIFICATE_TRUSTED:Double = js.native
        val NEW_CONNECTION:Double = js.native
        val IDEMPOTENT:Double = js.native
        val IGNORE_CONNECTION_LIMITS:Double = js.native
    }
    @js.native
    object ServerListenOptions extends js.Object {
        val HTTPS:Double = js.native
        val IPV4_ONLY:Double = js.native
        val IPV6_ONLY:Double = js.native
    }
    @js.native
    class Address extends GObject.Object {
        def this(config: js.Any) = this()
        def equal_by_ip(addr2: Address):Boolean = js.native
        def equal_by_name(addr2: Address):Boolean = js.native
        def get_gsockaddr():Gio.SocketAddress = js.native
        def get_name():String = js.native
        def get_physical():String = js.native
        def get_port():Any = js.native
        def get_sockaddr(len: Any):Object = js.native
        def hash_by_ip():Any = js.native
        def hash_by_name():Any = js.native
        def is_resolved():Boolean = js.native
        def resolve_async(async_context: Any, cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def resolve_sync(cancellable: Gio.Cancellable):Any = js.native
    }
    @js.native
    object Address extends js.Object {
        def new_any(family: Double, port: Any):Address = js.native
        def new_from_sockaddr(sa: Object, len: Any):Address = js.native
    }
    @js.native
    class Auth extends GObject.Object {
        def this(config: js.Any) = this()
        def authenticate(username: String, password: String):Unit = js.native
        def free_protection_space(space: Any):Unit = js.native
        def get_authorization(msg: Message):String = js.native
        def get_host():String = js.native
        def get_info():String = js.native
        def get_protection_space(source_uri: Any):Any = js.native
        def get_realm():String = js.native
        def get_saved_password(user: String):String = js.native
        def get_saved_users():Any = js.native
        def get_scheme_name():String = js.native
        def has_saved_password(username: String, password: String):Unit = js.native
        def is_authenticated():Boolean = js.native
        def is_for_proxy():Boolean = js.native
        def is_ready(msg: Message):Boolean = js.native
        def save_password(username: String, password: String):Unit = js.native
        def update(msg: Message, auth_header: String):Boolean = js.native
    }
    @js.native
    class AuthBasic extends Auth {
    }
    @js.native
    class AuthDigest extends Auth {
    }
    @js.native
    class AuthDomain extends GObject.Object {
        def accepts(msg: Message):String = js.native
        def add_path(path: String):Unit = js.native
        def basic_set_auth_callback(callback: Any, user_data: Object, dnotify: Any):Unit = js.native
        def challenge(msg: Message):Unit = js.native
        def check_password(msg: Message, username: String, password: String):Boolean = js.native
        def covers(msg: Message):Boolean = js.native
        def digest_set_auth_callback(callback: Any, user_data: Object, dnotify: Any):Unit = js.native
        def get_realm():String = js.native
        def remove_path(path: String):Unit = js.native
        def set_filter(filter: Any, filter_data: Object, dnotify: Any):Unit = js.native
        def set_generic_auth_callback(auth_callback: Any, auth_data: Object, dnotify: Any):Unit = js.native
        def try_generic_auth_callback(msg: Message, username: String):Boolean = js.native
    }
    @js.native
    class AuthDomainBasic extends AuthDomain {
        def this(config: js.Any) = this()
    }
    @js.native
    class AuthDomainDigest extends AuthDomain {
        def this(config: js.Any) = this()
    }
    @js.native
    object AuthDomainDigest extends js.Object {
        def encode_password(username: String, realm: String, password: String):String = js.native
    }
    @js.native
    class AuthManager extends GObject.Object {
        def use_auth(uri: Any, auth: Auth):Unit = js.native
    }
    @js.native
    class AuthNTLM extends Auth {
    }
    @js.native
    class Cache extends GObject.Object {
        def this(config: js.Any) = this()
        def clear():Unit = js.native
        def dump():Unit = js.native
        def flush():Unit = js.native
        def get_max_size():Any = js.native
        def load():Unit = js.native
        def set_max_size(max_size: Any):Unit = js.native
    }
    @js.native
    class ContentDecoder extends GObject.Object {
    }
    @js.native
    class ContentSniffer extends GObject.Object {
        def this(config: js.Any) = this()
        def get_buffer_size():Any = js.native
        def sniff(msg: Message, buffer: Any, params: Any):String = js.native
    }
    @js.native
    class CookieJar extends GObject.Object {
        def this(config: js.Any) = this()
        def add_cookie(cookie: Any):Unit = js.native
        def add_cookie_with_first_party(first_party: Any, cookie: Any):Unit = js.native
        def all_cookies():Any = js.native
        def delete_cookie(cookie: Any):Unit = js.native
        def get_accept_policy():Double = js.native
        def get_cookie_list(uri: Any, for_http: Boolean):Any = js.native
        def get_cookies(uri: Any, for_http: Boolean):String = js.native
        def is_persistent():Boolean = js.native
        def save():Unit = js.native
        def set_accept_policy(policy: Double):Unit = js.native
        def set_cookie(uri: Any, cookie: String):Unit = js.native
        def set_cookie_with_first_party(uri: Any, first_party: Any, cookie: String):Unit = js.native
    }
    @js.native
    class CookieJarDB extends CookieJar {
        def this(config: js.Any) = this()
    }
    @js.native
    class CookieJarText extends CookieJar {
        def this(config: js.Any) = this()
    }
    @js.native
    class Logger extends GObject.Object {
        def this(config: js.Any) = this()
        def attach(session: Session):Unit = js.native
        def detach(session: Session):Unit = js.native
        def set_printer(printer: Any, printer_data: Object, destroy: Any):Unit = js.native
        def set_request_filter(request_filter: Any, filter_data: Object, destroy: Any):Unit = js.native
        def set_response_filter(response_filter: Any, filter_data: Object, destroy: Any):Unit = js.native
    }
    @js.native
    class Message extends GObject.Object {
        def this(config: js.Any) = this()
        def add_header_handler(signal: String, header: String, callback: Any, user_data: Object):Any = js.native
        def add_status_code_handler(signal: String, status_code: Any, callback: Any, user_data: Object):Any = js.native
        def content_sniffed(content_type0: String, params: Any):Unit = js.native
        def disable_feature(feature_type0: Any):Unit = js.native
        def finished():Unit = js.native
        def get_address():Address = js.native
        def get_first_party():Any = js.native
        def get_flags():Double = js.native
        def get_http_version():Double = js.native
        def get_https_status(certificate: Gio.TlsCertificate, errors: Double):Boolean = js.native
        def get_priority():Double = js.native
        def get_soup_request():Request = js.native
        def get_uri():Any = js.native
        def got_body():Unit = js.native
        def got_chunk(chunk: Any):Unit = js.native
        def got_headers():Unit = js.native
        def got_informational():Unit = js.native
        def is_keepalive():Boolean = js.native
        def restarted():Unit = js.native
        def set_chunk_allocator(allocator: Any, user_data: Object, destroy_notify: Any):Unit = js.native
        def set_first_party(first_party: Any):Unit = js.native
        def set_flags(flags: Double):Unit = js.native
        def set_http_version(version: Double):Unit = js.native
        def set_priority(priority: Double):Unit = js.native
        def set_redirect(status_code: Any, redirect_uri: String):Unit = js.native
        def set_request(content_type0: String, req_use: Double, req_body: js.Array[Any], req_length: Any):Unit = js.native
        def set_response(content_type0:String, resp_use: Any, resp_body:String, resp_length:Number):Unit = js.native

        def set_status(status_code: Any):Unit = js.native
        def set_status_full(status_code: Any, reason_phrase: String):Unit = js.native
        def set_uri(uri: Any):Unit = js.native
        def starting():Unit = js.native
        def wrote_body():Unit = js.native
        def wrote_body_data(chunk: Any):Unit = js.native
        def wrote_chunk():Unit = js.native
        def wrote_headers():Unit = js.native
        def wrote_informational():Unit = js.native
    }
    @js.native
    object Message extends js.Object {
        def new_from_uri(method: String, uri: Any):Message = js.native
    }
    @js.native
    class MultipartInputStream extends Gio.FilterInputStream {
        def this(config: js.Any) = this()
        def get_headers():Any = js.native
        def next_part(cancellable: Gio.Cancellable):Gio.InputStream = js.native
        def next_part_async(io_priority: Any, cancellable: Gio.Cancellable, callback: Any, data: Object):Unit = js.native
        def next_part_finish(result: Any):Gio.InputStream = js.native
    }
    @js.native
    class ProxyResolverDefault extends GObject.Object {
    }
    @js.native
    class Request extends GObject.Object {
        def get_content_length():Any = js.native
        def get_content_type():String = js.native
        def get_session():Session = js.native
        def get_uri():Any = js.native
        def send(cancellable: Gio.Cancellable):Gio.InputStream = js.native
        def send_async(cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def send_finish(result: Any):Gio.InputStream = js.native
    }
    @js.native
    class RequestData extends Request {
    }
    @js.native
    class RequestFile extends Request {
        def get_file():Any = js.native
    }
    @js.native
    class RequestHTTP extends Request {
        def get_message():Message = js.native
    }
    @js.native
    class Requester extends GObject.Object {
        def this(config: js.Any) = this()
        def request(uri_string: String):Request = js.native
        def request_uri(uri: Any):Request = js.native
    }
    @js.native
    class Server extends GObject.Object {
        def this(config: js.Any) = this()
        def accept_iostream(stream: Gio.IOStream, local_addr: Gio.SocketAddress, remote_addr: Gio.SocketAddress):Boolean = js.native
        def add_auth_domain(auth_domain: AuthDomain):Unit = js.native
        def add_early_handler(path: String, callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_handler(path: String, callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_websocket_handler(path: String, origin: String, protocols: js.Array[String], callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def disconnect():Unit = js.native
        def get_async_context():Any = js.native
        def get_listener():Socket = js.native
        def get_listeners():Any = js.native
        def get_port():Any = js.native
        def get_uris():Any = js.native
        def is_https():Boolean = js.native
        def listen(address: Gio.SocketAddress, options: Double):Boolean = js.native
        def listen_all(port: Any, options: Double):Boolean = js.native
        def listen_fd(fd: Any, options: Double):Boolean = js.native
        def listen_local(port: Any, options: Double):Boolean = js.native
        def listen_socket(socket: Gio.Socket, options: Double):Boolean = js.native
        def pause_message(msg: Message):Unit = js.native
        def quit():Unit = js.native
        def remove_auth_domain(auth_domain: AuthDomain):Unit = js.native
        def remove_handler(path: String):Unit = js.native
        def run():Unit = js.native
        def run_async():Unit = js.native
        def set_ssl_cert_file(ssl_cert_file: String, ssl_key_file: String):Boolean = js.native
        def unpause_message(msg: Message):Unit = js.native
    }
    @js.native
    class Session extends GObject.Object {
        def this(config: js.Any) = this()
        def abort():Unit = js.native
        def add_feature(feature: Any):Unit = js.native
        def add_feature_by_type(feature_type0: Any):Unit = js.native
        def cancel_message(msg: Message, status_code: Any):Unit = js.native
        def get_async_context():Any = js.native
        def get_feature(feature_type0: Any):Any = js.native
        def get_feature_for_message(feature_type0: Any, msg: Message):Any = js.native
        def get_features(feature_type0: Any):Any = js.native
        def has_feature(feature_type0: Any):Boolean = js.native
        def pause_message(msg: Message):Unit = js.native
        def prefetch_dns(hostname: String, cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def prepare_for_uri(uri: Any):Unit = js.native
        def queue_message(msg: Message, callback: Any, user_data: Object):Unit = js.native
        def redirect_message(msg: Message):Boolean = js.native
        def remove_feature(feature: Any):Unit = js.native
        def remove_feature_by_type(feature_type0: Any):Unit = js.native
        def request(uri_string: String):Request = js.native
        def request_http(method: String, uri_string: String):RequestHTTP = js.native
        def request_http_uri(method: String, uri: Any):RequestHTTP = js.native
        def request_uri(uri: Any):Request = js.native
        def requeue_message(msg: Message):Unit = js.native
        def send(msg: Message, cancellable: Gio.Cancellable):Gio.InputStream = js.native
        def send_async(msg: Message, cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def send_finish(result: Any):Gio.InputStream = js.native
        def send_message(msg: Message):Any = js.native
        def steal_connection(msg: Message):Gio.IOStream = js.native
        def unpause_message(msg: Message):Unit = js.native
        def websocket_connect_async(msg: Message, origin: String, protocols: js.Array[String], cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def websocket_connect_finish(result: Any):WebsocketConnection = js.native
        def would_redirect(msg: Message):Boolean = js.native
    }
    @js.native
    object Session extends js.Object {
        def new_with_options(optname1: String, rest:Any*):Session = js.native
    }
    @js.native
    class SessionAsync extends Session {
        def this(config: js.Any) = this()
    }
    @js.native
    object SessionAsync extends js.Object {
        def new_with_options(optname1: String, rest:Any*):SessionAsync = js.native
    }
    @js.native
    class SessionSync extends Session {
        def this(config: js.Any) = this()
    }
    @js.native
    object SessionSync extends js.Object {
        def new_with_options(optname1: String, rest:Any*):SessionSync = js.native
    }
    @js.native
    class Socket extends GObject.Object {
        def this(config: js.Any) = this()
        def connect_async(cancellable: Gio.Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_sync(cancellable: Gio.Cancellable):Any = js.native
        def disconnect():Unit = js.native
        def get_fd():Any = js.native
        def get_local_address():Address = js.native
        def get_remote_address():Address = js.native
        def is_connected():Boolean = js.native
        def is_ssl():Boolean = js.native
        def listen():Boolean = js.native
        def read(buffer: js.Array[Any], len: Any, nread: Any, cancellable: Gio.Cancellable):Double = js.native
        def read_until(buffer: js.Array[Any], len: Any, boundary: Object, boundary_len: Any, nread: Any, got_boundary: Boolean, cancellable: Gio.Cancellable):Double = js.native
        def start_proxy_ssl(ssl_host: String, cancellable: Gio.Cancellable):Boolean = js.native
        def start_ssl(cancellable: Gio.Cancellable):Boolean = js.native
        def write(buffer: js.Array[Any], len: Any, nwrote: Any, cancellable: Gio.Cancellable):Double = js.native
    }
    @js.native
    class WebsocketConnection extends GObject.Object {
        def this(config: js.Any) = this()
        def close(code: Any, data: String):Unit = js.native
        def get_close_code():Any = js.native
        def get_close_data():String = js.native
        def get_connection_type():Double = js.native
        def get_io_stream():Gio.IOStream = js.native
        def get_origin():String = js.native
        def get_protocol():String = js.native
        def get_state():Double = js.native
        def get_uri():Any = js.native
        def send_binary(data: js.Array[Any], length: Any):Unit = js.native
        def send_text(text: String):Unit = js.native
    }
}