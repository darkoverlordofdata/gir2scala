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
    def add_io_watch(async_context: Any, chan: Any, condition: Any, function0: Any, data: Object):Any = js.native
    def add_timeout(async_context: Any, interval0: Any, function0: Any, data: Object):Any = js.native
    def cookie_parse(header: String, origin: Any):Any = js.native
    def cookies_free(cookies: Any):Unit = js.native
    def cookies_from_request(msg: Any):Any = js.native
    def cookies_from_response(msg: Any):Any = js.native
    def cookies_to_cookie_header(cookies: Any):String = js.native
    def cookies_to_request(cookies: Any, msg: Any):Unit = js.native
    def cookies_to_response(cookies: Any, msg: Any):Unit = js.native
    def form_decode(encoded_form: String):Any = js.native
    def form_decode_multipart(msg: Any, file_control_name: String, filename: String, content_type0: String, file: Any):Any = js.native
    def form_encode(first_field: String, rest:Any*):String = js.native
    def form_encode_datalist(form_data_set: Any):String = js.native
    def form_encode_hash(form_data_set: Any):String = js.native
    def form_encode_valist(first_field: String, args: Any):String = js.native
    def form_request_new(method: String, uri: String, first_field: String, rest:Any*):Any = js.native
    def form_request_new_from_datalist(method: String, uri: String, form_data_set: Any):Any = js.native
    def form_request_new_from_hash(method: String, uri: String, form_data_set: Any):Any = js.native
    def form_request_new_from_multipart(uri: String, multipart: Any):Any = js.native
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
    def headers_parse_request(str: String, len: Any, req_headers: Any, req_method: String, req_path: String, ver: Any):Any = js.native
    def headers_parse_response(str: String, len: Any, headers: Any, ver: Any, status_code: Any, reason_phrase: String):Boolean = js.native
    def headers_parse_status_line(status_line: String, ver: Any, status_code: Any, reason_phrase: String):Boolean = js.native
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
    def websocket_client_prepare_handshake(msg: Any, origin: String, protocols: js.Array[String]):Unit = js.native
    def websocket_client_verify_handshake(msg: Any):Boolean = js.native
    def websocket_error_get_quark():Any = js.native
    def websocket_server_check_handshake(msg: Any, origin: String, protocols: js.Array[String]):Boolean = js.native
    def websocket_server_process_handshake(msg: Any, expected_origin: String, protocols: js.Array[String]):Boolean = js.native
    def xmlrpc_build_fault(fault_code: Any, fault_format: String, rest:Any*):String = js.native
    def xmlrpc_build_method_call(method_name: String, params: js.Array[Any], n_params: Any):String = js.native
    def xmlrpc_build_method_response(value: Any):String = js.native
    def xmlrpc_build_request(method_name: String, params: Any):String = js.native
    def xmlrpc_build_response(value: Any):String = js.native
    def xmlrpc_error_quark():Any = js.native
    def xmlrpc_extract_method_call(method_call: String, length: Any, method_name: String, rest:Any*):Boolean = js.native
    def xmlrpc_extract_method_response(method_response: String, length: Any, error: Any, type0: Any, rest:Any*):Boolean = js.native
    def xmlrpc_fault_quark():Any = js.native
    def xmlrpc_message_new(uri: String, method_name: String, params: Any):Any = js.native
    def xmlrpc_message_set_fault(msg: Any, fault_code: Any, fault_format: String, rest:Any*):Unit = js.native
    def xmlrpc_message_set_response(msg: Any, value: Any):Boolean = js.native
    def xmlrpc_parse_method_call(method_call: String, length: Any, method_name: String, params: Any):Boolean = js.native
    def xmlrpc_parse_method_response(method_response: String, length: Any, value: Any):Boolean = js.native
    def xmlrpc_parse_request(method_call: String, length: Any, params: Any):String = js.native
    def xmlrpc_parse_response(method_response: String, length: Any, signature: String):Any = js.native
    def xmlrpc_request_new(uri: String, method_name: String, rest:Any*):Any = js.native
    def xmlrpc_set_fault(msg: Any, fault_code: Any, fault_format: String, rest:Any*):Unit = js.native
    def xmlrpc_set_response(msg: Any, type0: Any, rest:Any*):Unit = js.native
    def xmlrpc_variant_get_datetime(variant: Any):Any = js.native
    def xmlrpc_variant_new_datetime(date: Any):Any = js.native
    @js.native
    object AddressFamily extends js.Object {
        val INVALID:js.Dynamic = js.native
        val IPV4:js.Dynamic = js.native
        val IPV6:js.Dynamic = js.native
    }
    @js.native
    object CacheResponse extends js.Object {
        val FRESH:js.Dynamic = js.native
        val NEEDS_VALIDATION:js.Dynamic = js.native
        val STALE:js.Dynamic = js.native
    }
    @js.native
    object CacheType extends js.Object {
        val SINGLE_USER:js.Dynamic = js.native
        val SHARED:js.Dynamic = js.native
    }
    @js.native
    object ConnectionState extends js.Object {
        val NEW:js.Dynamic = js.native
        val CONNECTING:js.Dynamic = js.native
        val IDLE:js.Dynamic = js.native
        val IN_USE:js.Dynamic = js.native
        val REMOTE_DISCONNECTED:js.Dynamic = js.native
        val DISCONNECTED:js.Dynamic = js.native
    }
    @js.native
    object CookieJarAcceptPolicy extends js.Object {
        val ALWAYS:js.Dynamic = js.native
        val NEVER:js.Dynamic = js.native
        val NO_THIRD_PARTY:js.Dynamic = js.native
    }
    @js.native
    object DateFormat extends js.Object {
        val HTTP:js.Dynamic = js.native
        val COOKIE:js.Dynamic = js.native
        val RFC2822:js.Dynamic = js.native
        val ISO8601_COMPACT:js.Dynamic = js.native
        val ISO8601_FULL:js.Dynamic = js.native
        val ISO8601:js.Dynamic = js.native
        val ISO8601_XMLRPC:js.Dynamic = js.native
    }
    @js.native
    object Encoding extends js.Object {
        val UNRECOGNIZED:js.Dynamic = js.native
        val NONE:js.Dynamic = js.native
        val CONTENT_LENGTH:js.Dynamic = js.native
        val EOF:js.Dynamic = js.native
        val CHUNKED:js.Dynamic = js.native
        val BYTERANGES:js.Dynamic = js.native
    }
    @js.native
    object HTTPVersion extends js.Object {
        val HTTP_1_0:js.Dynamic = js.native
        val HTTP_1_1:js.Dynamic = js.native
    }
    @js.native
    object KnownStatusCode extends js.Object {
        val NONE:js.Dynamic = js.native
        val CANCELLED:js.Dynamic = js.native
        val CANT_RESOLVE:js.Dynamic = js.native
        val CANT_RESOLVE_PROXY:js.Dynamic = js.native
        val CANT_CONNECT:js.Dynamic = js.native
        val CANT_CONNECT_PROXY:js.Dynamic = js.native
        val SSL_FAILED:js.Dynamic = js.native
        val IO_ERROR:js.Dynamic = js.native
        val MALFORMED:js.Dynamic = js.native
        val TRY_AGAIN:js.Dynamic = js.native
        val TOO_MANY_REDIRECTS:js.Dynamic = js.native
        val TLS_FAILED:js.Dynamic = js.native
        val CONTINUE:js.Dynamic = js.native
        val SWITCHING_PROTOCOLS:js.Dynamic = js.native
        val PROCESSING:js.Dynamic = js.native
        val OK:js.Dynamic = js.native
        val CREATED:js.Dynamic = js.native
        val ACCEPTED:js.Dynamic = js.native
        val NON_AUTHORITATIVE:js.Dynamic = js.native
        val NO_CONTENT:js.Dynamic = js.native
        val RESET_CONTENT:js.Dynamic = js.native
        val PARTIAL_CONTENT:js.Dynamic = js.native
        val MULTI_STATUS:js.Dynamic = js.native
        val MULTIPLE_CHOICES:js.Dynamic = js.native
        val MOVED_PERMANENTLY:js.Dynamic = js.native
        val FOUND:js.Dynamic = js.native
        val MOVED_TEMPORARILY:js.Dynamic = js.native
        val SEE_OTHER:js.Dynamic = js.native
        val NOT_MODIFIED:js.Dynamic = js.native
        val USE_PROXY:js.Dynamic = js.native
        val NOT_APPEARING_IN_THIS_PROTOCOL:js.Dynamic = js.native
        val TEMPORARY_REDIRECT:js.Dynamic = js.native
        val BAD_REQUEST:js.Dynamic = js.native
        val UNAUTHORIZED:js.Dynamic = js.native
        val PAYMENT_REQUIRED:js.Dynamic = js.native
        val FORBIDDEN:js.Dynamic = js.native
        val NOT_FOUND:js.Dynamic = js.native
        val METHOD_NOT_ALLOWED:js.Dynamic = js.native
        val NOT_ACCEPTABLE:js.Dynamic = js.native
        val PROXY_AUTHENTICATION_REQUIRED:js.Dynamic = js.native
        val PROXY_UNAUTHORIZED:js.Dynamic = js.native
        val REQUEST_TIMEOUT:js.Dynamic = js.native
        val CONFLICT:js.Dynamic = js.native
        val GONE:js.Dynamic = js.native
        val LENGTH_REQUIRED:js.Dynamic = js.native
        val PRECONDITION_FAILED:js.Dynamic = js.native
        val REQUEST_ENTITY_TOO_LARGE:js.Dynamic = js.native
        val REQUEST_URI_TOO_LONG:js.Dynamic = js.native
        val UNSUPPORTED_MEDIA_TYPE:js.Dynamic = js.native
        val REQUESTED_RANGE_NOT_SATISFIABLE:js.Dynamic = js.native
        val INVALID_RANGE:js.Dynamic = js.native
        val EXPECTATION_FAILED:js.Dynamic = js.native
        val UNPROCESSABLE_ENTITY:js.Dynamic = js.native
        val LOCKED:js.Dynamic = js.native
        val FAILED_DEPENDENCY:js.Dynamic = js.native
        val INTERNAL_SERVER_ERROR:js.Dynamic = js.native
        val NOT_IMPLEMENTED:js.Dynamic = js.native
        val BAD_GATEWAY:js.Dynamic = js.native
        val SERVICE_UNAVAILABLE:js.Dynamic = js.native
        val GATEWAY_TIMEOUT:js.Dynamic = js.native
        val HTTP_VERSION_NOT_SUPPORTED:js.Dynamic = js.native
        val INSUFFICIENT_STORAGE:js.Dynamic = js.native
        val NOT_EXTENDED:js.Dynamic = js.native
    }
    @js.native
    object LoggerLogLevel extends js.Object {
        val NONE:js.Dynamic = js.native
        val MINIMAL:js.Dynamic = js.native
        val HEADERS:js.Dynamic = js.native
        val BODY:js.Dynamic = js.native
    }
    @js.native
    object Any extends js.Object {
        val STATIC:js.Dynamic = js.native
        val TAKE:js.Dynamic = js.native
        val COPY:js.Dynamic = js.native
        val TEMPORARY:js.Dynamic = js.native
    }
    @js.native
    object MessageHeadersType extends js.Object {
        val REQUEST:js.Dynamic = js.native
        val RESPONSE:js.Dynamic = js.native
        val MULTIPART:js.Dynamic = js.native
    }
    @js.native
    object MessagePriority extends js.Object {
        val VERY_LOW:js.Dynamic = js.native
        val LOW:js.Dynamic = js.native
        val NORMAL:js.Dynamic = js.native
        val HIGH:js.Dynamic = js.native
        val VERY_HIGH:js.Dynamic = js.native
    }
    @js.native
    object RequestError extends js.Object {
        val BAD_URI:js.Dynamic = js.native
        val UNSUPPORTED_URI_SCHEME:js.Dynamic = js.native
        val PARSING:js.Dynamic = js.native
        val ENCODING:js.Dynamic = js.native
    }
    @js.native
    object RequesterError extends js.Object {
        val BAD_URI:js.Dynamic = js.native
        val UNSUPPORTED_URI_SCHEME:js.Dynamic = js.native
    }
    @js.native
    object SocketIOStatus extends js.Object {
        val OK:js.Dynamic = js.native
        val WOULD_BLOCK:js.Dynamic = js.native
        val EOF:js.Dynamic = js.native
        val ERROR:js.Dynamic = js.native
    }
    @js.native
    object Status extends js.Object {
        val NONE:js.Dynamic = js.native
        val CANCELLED:js.Dynamic = js.native
        val CANT_RESOLVE:js.Dynamic = js.native
        val CANT_RESOLVE_PROXY:js.Dynamic = js.native
        val CANT_CONNECT:js.Dynamic = js.native
        val CANT_CONNECT_PROXY:js.Dynamic = js.native
        val SSL_FAILED:js.Dynamic = js.native
        val IO_ERROR:js.Dynamic = js.native
        val MALFORMED:js.Dynamic = js.native
        val TRY_AGAIN:js.Dynamic = js.native
        val TOO_MANY_REDIRECTS:js.Dynamic = js.native
        val TLS_FAILED:js.Dynamic = js.native
        val CONTINUE:js.Dynamic = js.native
        val SWITCHING_PROTOCOLS:js.Dynamic = js.native
        val PROCESSING:js.Dynamic = js.native
        val OK:js.Dynamic = js.native
        val CREATED:js.Dynamic = js.native
        val ACCEPTED:js.Dynamic = js.native
        val NON_AUTHORITATIVE:js.Dynamic = js.native
        val NO_CONTENT:js.Dynamic = js.native
        val RESET_CONTENT:js.Dynamic = js.native
        val PARTIAL_CONTENT:js.Dynamic = js.native
        val MULTI_STATUS:js.Dynamic = js.native
        val MULTIPLE_CHOICES:js.Dynamic = js.native
        val MOVED_PERMANENTLY:js.Dynamic = js.native
        val FOUND:js.Dynamic = js.native
        val MOVED_TEMPORARILY:js.Dynamic = js.native
        val SEE_OTHER:js.Dynamic = js.native
        val NOT_MODIFIED:js.Dynamic = js.native
        val USE_PROXY:js.Dynamic = js.native
        val NOT_APPEARING_IN_THIS_PROTOCOL:js.Dynamic = js.native
        val TEMPORARY_REDIRECT:js.Dynamic = js.native
        val BAD_REQUEST:js.Dynamic = js.native
        val UNAUTHORIZED:js.Dynamic = js.native
        val PAYMENT_REQUIRED:js.Dynamic = js.native
        val FORBIDDEN:js.Dynamic = js.native
        val NOT_FOUND:js.Dynamic = js.native
        val METHOD_NOT_ALLOWED:js.Dynamic = js.native
        val NOT_ACCEPTABLE:js.Dynamic = js.native
        val PROXY_AUTHENTICATION_REQUIRED:js.Dynamic = js.native
        val PROXY_UNAUTHORIZED:js.Dynamic = js.native
        val REQUEST_TIMEOUT:js.Dynamic = js.native
        val CONFLICT:js.Dynamic = js.native
        val GONE:js.Dynamic = js.native
        val LENGTH_REQUIRED:js.Dynamic = js.native
        val PRECONDITION_FAILED:js.Dynamic = js.native
        val REQUEST_ENTITY_TOO_LARGE:js.Dynamic = js.native
        val REQUEST_URI_TOO_LONG:js.Dynamic = js.native
        val UNSUPPORTED_MEDIA_TYPE:js.Dynamic = js.native
        val REQUESTED_RANGE_NOT_SATISFIABLE:js.Dynamic = js.native
        val INVALID_RANGE:js.Dynamic = js.native
        val EXPECTATION_FAILED:js.Dynamic = js.native
        val UNPROCESSABLE_ENTITY:js.Dynamic = js.native
        val LOCKED:js.Dynamic = js.native
        val FAILED_DEPENDENCY:js.Dynamic = js.native
        val INTERNAL_SERVER_ERROR:js.Dynamic = js.native
        val NOT_IMPLEMENTED:js.Dynamic = js.native
        val BAD_GATEWAY:js.Dynamic = js.native
        val SERVICE_UNAVAILABLE:js.Dynamic = js.native
        val GATEWAY_TIMEOUT:js.Dynamic = js.native
        val HTTP_VERSION_NOT_SUPPORTED:js.Dynamic = js.native
        val INSUFFICIENT_STORAGE:js.Dynamic = js.native
        val NOT_EXTENDED:js.Dynamic = js.native
    }
    @js.native
    object TLDError extends js.Object {
        val INVALID_HOSTNAME:js.Dynamic = js.native
        val IS_IP_ADDRESS:js.Dynamic = js.native
        val NOT_ENOUGH_DOMAINS:js.Dynamic = js.native
        val NO_BASE_DOMAIN:js.Dynamic = js.native
    }
    @js.native
    object WebsocketCloseCode extends js.Object {
        val NORMAL:js.Dynamic = js.native
        val GOING_AWAY:js.Dynamic = js.native
        val PROTOCOL_ERROR:js.Dynamic = js.native
        val UNSUPPORTED_DATA:js.Dynamic = js.native
        val NO_STATUS:js.Dynamic = js.native
        val ABNORMAL:js.Dynamic = js.native
        val BAD_DATA:js.Dynamic = js.native
        val POLICY_VIOLATION:js.Dynamic = js.native
        val TOO_BIG:js.Dynamic = js.native
        val NO_EXTENSION:js.Dynamic = js.native
        val SERVER_ERROR:js.Dynamic = js.native
        val TLS_HANDSHAKE:js.Dynamic = js.native
    }
    @js.native
    object WebsocketConnectionType extends js.Object {
        val UNKNOWN:js.Dynamic = js.native
        val CLIENT:js.Dynamic = js.native
        val SERVER:js.Dynamic = js.native
    }
    @js.native
    object WebsocketDataType extends js.Object {
        val TEXT:js.Dynamic = js.native
        val BINARY:js.Dynamic = js.native
    }
    @js.native
    object WebsocketError extends js.Object {
        val FAILED:js.Dynamic = js.native
        val NOT_WEBSOCKET:js.Dynamic = js.native
        val BAD_HANDSHAKE:js.Dynamic = js.native
        val BAD_ORIGIN:js.Dynamic = js.native
    }
    @js.native
    object WebsocketState extends js.Object {
        val OPEN:js.Dynamic = js.native
        val CLOSING:js.Dynamic = js.native
        val CLOSED:js.Dynamic = js.native
    }
    @js.native
    object XMLRPCError extends js.Object {
        val ARGUMENTS:js.Dynamic = js.native
        val RETVAL:js.Dynamic = js.native
    }
    @js.native
    object XMLRPCFault extends js.Object {
        val PARSE_ERROR_NOT_WELL_FORMED:js.Dynamic = js.native
        val PARSE_ERROR_UNSUPPORTED_ENCODING:js.Dynamic = js.native
        val PARSE_ERROR_INVALID_CHARACTER_FOR_ENCODING:js.Dynamic = js.native
        val SERVER_ERROR_INVALID_XML_RPC:js.Dynamic = js.native
        val SERVER_ERROR_REQUESTED_METHOD_NOT_FOUND:js.Dynamic = js.native
        val SERVER_ERROR_INVALID_METHOD_PARAMETERS:js.Dynamic = js.native
        val SERVER_ERROR_INTERNAL_XML_RPC_ERROR:js.Dynamic = js.native
        val APPLICATION_ERROR:js.Dynamic = js.native
        val SYSTEM_ERROR:js.Dynamic = js.native
        val TRANSPORT_ERROR:js.Dynamic = js.native
    }
    @js.native
    object Cacheability extends js.Object {
        val CACHEABLE:js.Dynamic = js.native
        val UNCACHEABLE:js.Dynamic = js.native
        val INVALIDATES:js.Dynamic = js.native
        val VALIDATES:js.Dynamic = js.native
    }
    @js.native
    object Expectation extends js.Object {
        val UNRECOGNIZED:js.Dynamic = js.native
        val CONTINUE:js.Dynamic = js.native
    }
    @js.native
    object MessageFlags extends js.Object {
        val NO_REDIRECT:js.Dynamic = js.native
        val CAN_REBUILD:js.Dynamic = js.native
        val OVERWRITE_CHUNKS:js.Dynamic = js.native
        val CONTENT_DECODED:js.Dynamic = js.native
        val CERTIFICATE_TRUSTED:js.Dynamic = js.native
        val NEW_CONNECTION:js.Dynamic = js.native
        val IDEMPOTENT:js.Dynamic = js.native
        val IGNORE_CONNECTION_LIMITS:js.Dynamic = js.native
    }
    @js.native
    object ServerListenOptions extends js.Object {
        val HTTPS:js.Dynamic = js.native
        val IPV4_ONLY:js.Dynamic = js.native
        val IPV6_ONLY:js.Dynamic = js.native
    }
    @js.native
    class Address extends GObject.Object {
        def this(config: js.Any) = this()
        def equal_by_ip(addr2: Any):Boolean = js.native
        def equal_by_name(addr2: Any):Boolean = js.native
        def get_gsockaddr():Any = js.native
        def get_name():String = js.native
        def get_physical():String = js.native
        def get_port():Any = js.native
        def get_sockaddr(len: Any):Object = js.native
        def hash_by_ip():Any = js.native
        def hash_by_name():Any = js.native
        def is_resolved():Boolean = js.native
        def resolve_async(async_context: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def resolve_sync(cancellable: Any):Any = js.native
    }
    @js.native
    object Address extends js.Object {
        def new_any(family: Any, port: Any):Address = js.native
        def new_from_sockaddr(sa: Object, len: Any):Address = js.native
    }
    @js.native
    class Auth extends GObject.Object {
        def this(config: js.Any) = this()
        def authenticate(username: String, password: String):Unit = js.native
        def free_protection_space(space: Any):Unit = js.native
        def get_authorization(msg: Any):String = js.native
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
        def is_ready(msg: Any):Boolean = js.native
        def save_password(username: String, password: String):Unit = js.native
        def update(msg: Any, auth_header: String):Boolean = js.native
    }
    @js.native
    class AuthBasic extends Auth {
    }
    @js.native
    class AuthDigest extends Auth {
    }
    @js.native
    class AuthDomain extends GObject.Object {
        def accepts(msg: Any):String = js.native
        def add_path(path: String):Unit = js.native
        def basic_set_auth_callback(callback: Any, user_data: Object, dnotify: Any):Unit = js.native
        def challenge(msg: Any):Unit = js.native
        def check_password(msg: Any, username: String, password: String):Boolean = js.native
        def covers(msg: Any):Boolean = js.native
        def digest_set_auth_callback(callback: Any, user_data: Object, dnotify: Any):Unit = js.native
        def get_realm():String = js.native
        def remove_path(path: String):Unit = js.native
        def set_filter(filter: Any, filter_data: Object, dnotify: Any):Unit = js.native
        def set_generic_auth_callback(auth_callback: Any, auth_data: Object, dnotify: Any):Unit = js.native
        def try_generic_auth_callback(msg: Any, username: String):Boolean = js.native
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
        def use_auth(uri: Any, auth: Any):Unit = js.native
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
        def sniff(msg: Any, buffer: Any, params: Any):String = js.native
    }
    @js.native
    class CookieJar extends GObject.Object {
        def this(config: js.Any) = this()
        def add_cookie(cookie: Any):Unit = js.native
        def add_cookie_with_first_party(first_party: Any, cookie: Any):Unit = js.native
        def all_cookies():Any = js.native
        def delete_cookie(cookie: Any):Unit = js.native
        def get_accept_policy():Any = js.native
        def get_cookie_list(uri: Any, for_http: Boolean):Any = js.native
        def get_cookies(uri: Any, for_http: Boolean):String = js.native
        def is_persistent():Boolean = js.native
        def save():Unit = js.native
        def set_accept_policy(policy: Any):Unit = js.native
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
        def attach(session: Any):Unit = js.native
        def detach(session: Any):Unit = js.native
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
        def get_address():Any = js.native
        def get_first_party():Any = js.native
        def get_flags():Any = js.native
        def get_http_version():Any = js.native
        def get_https_status(certificate: Any, errors: Any):Boolean = js.native
        def get_priority():Any = js.native
        def get_soup_request():Any = js.native
        def get_uri():Any = js.native
        def got_body():Unit = js.native
        def got_chunk(chunk: Any):Unit = js.native
        def got_headers():Unit = js.native
        def got_informational():Unit = js.native
        def is_keepalive():Boolean = js.native
        def restarted():Unit = js.native
        def set_chunk_allocator(allocator: Any, user_data: Object, destroy_notify: Any):Unit = js.native
        def set_first_party(first_party: Any):Unit = js.native
        def set_flags(flags: Any):Unit = js.native
        def set_http_version(version: Any):Unit = js.native
        def set_priority(priority: Any):Unit = js.native
        def set_redirect(status_code: Any, redirect_uri: String):Unit = js.native
        def set_request(content_type0: String, req_use: Any, req_body: js.Array[Any], req_length: Any):Unit = js.native
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
        def next_part(cancellable: Any):Any = js.native
        def next_part_async(io_priority: Any, cancellable: Any, callback: Any, data: Object):Unit = js.native
        def next_part_finish(result: Any):Any = js.native
    }
    @js.native
    class ProxyResolverDefault extends GObject.Object {
    }
    @js.native
    class Request extends GObject.Object {
        def get_content_length():Any = js.native
        def get_content_type():String = js.native
        def get_session():Any = js.native
        def get_uri():Any = js.native
        def send(cancellable: Any):Any = js.native
        def send_async(cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def send_finish(result: Any):Any = js.native
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
        def get_message():Any = js.native
    }
    @js.native
    class Requester extends GObject.Object {
        def this(config: js.Any) = this()
        def request(uri_string: String):Any = js.native
        def request_uri(uri: Any):Any = js.native
    }
    @js.native
    class Server extends GObject.Object {
        def this(config: js.Any) = this()
        def accept_iostream(stream: Any, local_addr: Any, remote_addr: Any):Boolean = js.native
        def add_auth_domain(auth_domain: Any):Unit = js.native
        def add_early_handler(path: String, callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_handler(path: String, callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def add_websocket_handler(path: String, origin: String, protocols: js.Array[String], callback: Any, user_data: Object, destroy: Any):Unit = js.native
        def disconnect():Unit = js.native
        def get_async_context():Any = js.native
        def get_listener():Any = js.native
        def get_listeners():Any = js.native
        def get_port():Any = js.native
        def get_uris():Any = js.native
        def is_https():Boolean = js.native
        def listen(address: Any, options: Any):Boolean = js.native
        def listen_all(port: Any, options: Any):Boolean = js.native
        def listen_fd(fd: Any, options: Any):Boolean = js.native
        def listen_local(port: Any, options: Any):Boolean = js.native
        def listen_socket(socket: Any, options: Any):Boolean = js.native
        def pause_message(msg: Any):Unit = js.native
        def quit():Unit = js.native
        def remove_auth_domain(auth_domain: Any):Unit = js.native
        def remove_handler(path: String):Unit = js.native
        def run():Unit = js.native
        def run_async():Unit = js.native
        def set_ssl_cert_file(ssl_cert_file: String, ssl_key_file: String):Boolean = js.native
        def unpause_message(msg: Any):Unit = js.native
    }
    @js.native
    class Session extends GObject.Object {
        def this(config: js.Any) = this()
        def abort():Unit = js.native
        def add_feature(feature: Any):Unit = js.native
        def add_feature_by_type(feature_type0: Any):Unit = js.native
        def cancel_message(msg: Any, status_code: Any):Unit = js.native
        def get_async_context():Any = js.native
        def get_feature(feature_type0: Any):Any = js.native
        def get_feature_for_message(feature_type0: Any, msg: Any):Any = js.native
        def get_features(feature_type0: Any):Any = js.native
        def has_feature(feature_type0: Any):Boolean = js.native
        def pause_message(msg: Any):Unit = js.native
        def prefetch_dns(hostname: String, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def prepare_for_uri(uri: Any):Unit = js.native
        def queue_message(msg: Any, callback: Any, user_data: Object):Unit = js.native
        def redirect_message(msg: Any):Boolean = js.native
        def remove_feature(feature: Any):Unit = js.native
        def remove_feature_by_type(feature_type0: Any):Unit = js.native
        def request(uri_string: String):Any = js.native
        def request_http(method: String, uri_string: String):Any = js.native
        def request_http_uri(method: String, uri: Any):Any = js.native
        def request_uri(uri: Any):Any = js.native
        def requeue_message(msg: Any):Unit = js.native
        def send(msg: Any, cancellable: Any):Any = js.native
        def send_async(msg: Any, cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def send_finish(result: Any):Any = js.native
        def send_message(msg: Any):Any = js.native
        def steal_connection(msg: Any):Any = js.native
        def unpause_message(msg: Any):Unit = js.native
        def websocket_connect_async(msg: Any, origin: String, protocols: js.Array[String], cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def websocket_connect_finish(result: Any):Any = js.native
        def would_redirect(msg: Any):Boolean = js.native
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
        def connect_async(cancellable: Any, callback: Any, user_data: Object):Unit = js.native
        def connect_sync(cancellable: Any):Any = js.native
        def disconnect():Unit = js.native
        def get_fd():Any = js.native
        def get_local_address():Any = js.native
        def get_remote_address():Any = js.native
        def is_connected():Boolean = js.native
        def is_ssl():Boolean = js.native
        def listen():Boolean = js.native
        def read(buffer: js.Array[Any], len: Any, nread: Any, cancellable: Any):Any = js.native
        def read_until(buffer: js.Array[Any], len: Any, boundary: Object, boundary_len: Any, nread: Any, got_boundary: Boolean, cancellable: Any):Any = js.native
        def start_proxy_ssl(ssl_host: String, cancellable: Any):Boolean = js.native
        def start_ssl(cancellable: Any):Boolean = js.native
        def write(buffer: js.Array[Any], len: Any, nwrote: Any, cancellable: Any):Any = js.native
    }
    @js.native
    class WebsocketConnection extends GObject.Object {
        def this(config: js.Any) = this()
        def close(code: Any, data: String):Unit = js.native
        def get_close_code():Any = js.native
        def get_close_data():String = js.native
        def get_connection_type():Any = js.native
        def get_io_stream():Any = js.native
        def get_origin():String = js.native
        def get_protocol():String = js.native
        def get_state():Any = js.native
        def get_uri():Any = js.native
        def send_binary(data: js.Array[Any], length: Any):Unit = js.native
        def send_text(text: String):Unit = js.native
    }
}