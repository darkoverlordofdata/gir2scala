/**
 * GLib.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.GLib")
@js.native
object GLib extends js.Object {
    val ANALYZER_ANALYZING:Any = js.native
    val ASCII_DTOSTR_BUF_SIZE:Any = js.native
    val BIG_ENDIAN:Any = js.native
    val CSET_A_2_Z:String = js.native
    val CSET_DIGITS:String = js.native
    val CSET_a_2_z:String = js.native
    val DATALIST_FLAGS_MASK:Any = js.native
    val DATE_BAD_DAY:Any = js.native
    val DATE_BAD_JULIAN:Any = js.native
    val DATE_BAD_YEAR:Any = js.native
    val DIR_SEPARATOR:Any = js.native
    val DIR_SEPARATOR_S:String = js.native
    val E:Any = js.native
    val GINT16_FORMAT:String = js.native
    val GINT16_MODIFIER:String = js.native
    val GINT32_FORMAT:String = js.native
    val GINT32_MODIFIER:String = js.native
    val GINT64_FORMAT:String = js.native
    val GINT64_MODIFIER:String = js.native
    val GINTPTR_FORMAT:String = js.native
    val GINTPTR_MODIFIER:String = js.native
    val GNUC_FUNCTION:String = js.native
    val GNUC_PRETTY_FUNCTION:String = js.native
    val GSIZE_FORMAT:String = js.native
    val GSIZE_MODIFIER:String = js.native
    val GSSIZE_FORMAT:String = js.native
    val GSSIZE_MODIFIER:String = js.native
    val GUINT16_FORMAT:String = js.native
    val GUINT32_FORMAT:String = js.native
    val GUINT64_FORMAT:String = js.native
    val GUINTPTR_FORMAT:String = js.native
    val HAVE_GINT64:Any = js.native
    val HAVE_GNUC_VARARGS:Any = js.native
    val HAVE_GNUC_VISIBILITY:Any = js.native
    val HAVE_GROWING_STACK:Any = js.native
    val HAVE_ISO_VARARGS:Any = js.native
    val HOOK_FLAG_USER_SHIFT:Any = js.native
    val IEEE754_DOUBLE_BIAS:Any = js.native
    val IEEE754_FLOAT_BIAS:Any = js.native
    val KEY_FILE_DESKTOP_GROUP:String = js.native
    val KEY_FILE_DESKTOP_KEY_ACTIONS:String = js.native
    val KEY_FILE_DESKTOP_KEY_CATEGORIES:String = js.native
    val KEY_FILE_DESKTOP_KEY_COMMENT:String = js.native
    val KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE:String = js.native
    val KEY_FILE_DESKTOP_KEY_EXEC:String = js.native
    val KEY_FILE_DESKTOP_KEY_FULLNAME:String = js.native
    val KEY_FILE_DESKTOP_KEY_GENERIC_NAME:String = js.native
    val KEY_FILE_DESKTOP_KEY_GETTEXT_DOMAIN:String = js.native
    val KEY_FILE_DESKTOP_KEY_HIDDEN:String = js.native
    val KEY_FILE_DESKTOP_KEY_ICON:String = js.native
    val KEY_FILE_DESKTOP_KEY_KEYWORDS:String = js.native
    val KEY_FILE_DESKTOP_KEY_MIME_TYPE:String = js.native
    val KEY_FILE_DESKTOP_KEY_NAME:String = js.native
    val KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN:String = js.native
    val KEY_FILE_DESKTOP_KEY_NO_DISPLAY:String = js.native
    val KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN:String = js.native
    val KEY_FILE_DESKTOP_KEY_PATH:String = js.native
    val KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY:String = js.native
    val KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS:String = js.native
    val KEY_FILE_DESKTOP_KEY_TERMINAL:String = js.native
    val KEY_FILE_DESKTOP_KEY_TRY_EXEC:String = js.native
    val KEY_FILE_DESKTOP_KEY_TYPE:String = js.native
    val KEY_FILE_DESKTOP_KEY_URL:String = js.native
    val KEY_FILE_DESKTOP_KEY_VERSION:String = js.native
    val KEY_FILE_DESKTOP_TYPE_APPLICATION:String = js.native
    val KEY_FILE_DESKTOP_TYPE_DIRECTORY:String = js.native
    val KEY_FILE_DESKTOP_TYPE_LINK:String = js.native
    val LITTLE_ENDIAN:Any = js.native
    val LN10:Any = js.native
    val LN2:Any = js.native
    val LOG_2_BASE_10:Any = js.native
    val LOG_DOMAIN:Any = js.native
    val LOG_FATAL_MASK:Any = js.native
    val LOG_LEVEL_USER_SHIFT:Any = js.native
    val MAJOR_VERSION:Any = js.native
    val MAXINT16:Any = js.native
    val MAXINT32:Any = js.native
    val MAXINT64:Any = js.native
    val MAXINT8:Any = js.native
    val MAXUINT16:Any = js.native
    val MAXUINT32:Any = js.native
    val MAXUINT64:Any = js.native
    val MAXUINT8:Any = js.native
    val MICRO_VERSION:Any = js.native
    val MININT16:Any = js.native
    val MININT32:Any = js.native
    val MININT64:Any = js.native
    val MININT8:Any = js.native
    val MINOR_VERSION:Any = js.native
    val MODULE_SUFFIX:String = js.native
    val OPTION_REMAINING:String = js.native
    val PDP_ENDIAN:Any = js.native
    val PI:Any = js.native
    val PI_2:Any = js.native
    val PI_4:Any = js.native
    val POLLFD_FORMAT:String = js.native
    val PRIORITY_DEFAULT:Any = js.native
    val PRIORITY_DEFAULT_IDLE:Any = js.native
    val PRIORITY_HIGH:Any = js.native
    val PRIORITY_HIGH_IDLE:Any = js.native
    val PRIORITY_LOW:Any = js.native
    val SEARCHPATH_SEPARATOR:Any = js.native
    val SEARCHPATH_SEPARATOR_S:String = js.native
    val SIZEOF_LONG:Any = js.native
    val SIZEOF_SIZE_T:Any = js.native
    val SIZEOF_SSIZE_T:Any = js.native
    val SIZEOF_VOID_P:Any = js.native
    val SOURCE_CONTINUE:Boolean = js.native
    val SOURCE_REMOVE:Boolean = js.native
    val SQRT2:Any = js.native
    val STR_DELIMITERS:String = js.native
    val SYSDEF_AF_INET:Any = js.native
    val SYSDEF_AF_INET6:Any = js.native
    val SYSDEF_AF_UNIX:Any = js.native
    val SYSDEF_MSG_DONTROUTE:Any = js.native
    val SYSDEF_MSG_OOB:Any = js.native
    val SYSDEF_MSG_PEEK:Any = js.native
    val TIME_SPAN_DAY:Any = js.native
    val TIME_SPAN_HOUR:Any = js.native
    val TIME_SPAN_MILLISECOND:Any = js.native
    val TIME_SPAN_MINUTE:Any = js.native
    val TIME_SPAN_SECOND:Any = js.native
    val UNICHAR_MAX_DECOMPOSITION_LENGTH:Any = js.native
    val URI_RESERVED_CHARS_GENERIC_DELIMITERS:String = js.native
    val URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS:String = js.native
    val USEC_PER_SEC:Any = js.native
    val VA_COPY_AS_ARRAY:Any = js.native
    val VERSION_MIN_REQUIRED:Any = js.native
    val WIN32_MSG_HANDLE:Any = js.native
    def access(filename: String, mode: Any):Any = js.native
    def ascii_digit_value(c: Any):Any = js.native
    def ascii_dtostr(buffer: String, buf_len: Any, d: Any):String = js.native
    def ascii_formatd(buffer: String, buf_len: Any, format: String, d: Any):String = js.native
    def ascii_strcasecmp(s1: String, s2: String):Any = js.native
    def ascii_strdown(str: String, len: Any):String = js.native
    def ascii_strncasecmp(s1: String, s2: String, n: Any):Any = js.native
    def ascii_strtod(nptr: String, endptr: String):Any = js.native
    def ascii_strtoll(nptr: String, endptr: String, base: Any):Any = js.native
    def ascii_strtoull(nptr: String, endptr: String, base: Any):Any = js.native
    def ascii_strup(str: String, len: Any):String = js.native
    def ascii_tolower(c: Any):Any = js.native
    def ascii_toupper(c: Any):Any = js.native
    def ascii_xdigit_value(c: Any):Any = js.native
    def assert_warning(log_domain: String, file: String, line: Any, pretty_function: String, expression: String):Unit = js.native
    def assertion_message(domain: String, file: String, line: Any, func: String, message: String):Unit = js.native
    def assertion_message_cmpnum(domain: String, file: String, line: Any, func: String, expr: String, arg1: Any, cmp: String, arg2: Any, numtype0: Any):Unit = js.native
    def assertion_message_cmpstr(domain: String, file: String, line: Any, func: String, expr: String, arg1: String, cmp: String, arg2: String):Unit = js.native
    def assertion_message_error(domain: String, file: String, line: Any, func: String, expr: String, error: Any, error_domain: Any, error_code: Any):Unit = js.native
    def assertion_message_expr(domain: String, file: String, line: Any, func: String, expr: String):Unit = js.native
    def atexit(func: Any):Unit = js.native
    def atomic_int_add(atomic: Any, val0: Any):Any = js.native
    def atomic_int_and(atomic: Any, val0: Any):Any = js.native
    def atomic_int_compare_and_exchange(atomic: Any, oldval0: Any, newval0: Any):Boolean = js.native
    def atomic_int_dec_and_test(atomic: Any):Boolean = js.native
    def atomic_int_exchange_and_add(atomic: Any, val0: Any):Any = js.native
    def atomic_int_get(atomic: Any):Any = js.native
    def atomic_int_inc(atomic: Any):Unit = js.native
    def atomic_int_or(atomic: Any, val0: Any):Any = js.native
    def atomic_int_set(atomic: Any, newval0: Any):Unit = js.native
    def atomic_int_xor(atomic: Any, val0: Any):Any = js.native
    def atomic_pointer_add(atomic: Object, val0: Any):Any = js.native
    def atomic_pointer_and(atomic: Object, val0: Any):Any = js.native
    def atomic_pointer_compare_and_exchange(atomic: Object, oldval0: Object, newval0: Object):Boolean = js.native
    def atomic_pointer_get(atomic: Object):Object = js.native
    def atomic_pointer_or(atomic: Object, val0: Any):Any = js.native
    def atomic_pointer_set(atomic: Object, newval0: Object):Unit = js.native
    def atomic_pointer_xor(atomic: Object, val0: Any):Any = js.native
    def base64_decode(text: String, out_len: Any):js.Array[Any] = js.native
    def base64_decode_inplace(text: js.Array[Any], out_len: Any):Any = js.native
    def base64_decode_step(in0: js.Array[Any], len: Any, out: js.Array[Any], state: Any, save: Any):Any = js.native
    def base64_encode(data: js.Array[Any], len: Any):String = js.native
    def base64_encode_close(break_lines: Boolean, out: js.Array[Any], state: Any, save: Any):Any = js.native
    def base64_encode_step(in0: js.Array[Any], len: Any, break_lines: Boolean, out: js.Array[Any], state: Any, save: Any):Any = js.native
    def basename(file_name: String):String = js.native
    def bit_lock(address: Any, lock_bit: Any):Unit = js.native
    def bit_nth_lsf(mask: Any, nth_bit: Any):Any = js.native
    def bit_nth_msf(mask: Any, nth_bit: Any):Any = js.native
    def bit_storage(number: Any):Any = js.native
    def bit_trylock(address: Any, lock_bit: Any):Boolean = js.native
    def bit_unlock(address: Any, lock_bit: Any):Unit = js.native
    def bookmark_file_error_quark():Any = js.native
    def build_filename(first_element: String, rest:Any*):String = js.native
    def build_filenamev(args: js.Array[String]):String = js.native
    def build_path(separator: String, first_element: String, rest:Any*):String = js.native
    def build_pathv(separator: String, args: js.Array[String]):String = js.native
    def byte_array_free(array: js.Array[Any], free_segment: Boolean):Any = js.native
    def byte_array_free_to_bytes(array: js.Array[Any]):Any = js.native
    def byte_array_new():js.Array[Any] = js.native
    def byte_array_new_take(data: js.Array[Any], len: Any):js.Array[Any] = js.native
    def byte_array_unref(array: js.Array[Any]):Unit = js.native
    def chdir(path: String):Any = js.native
    def check_version(required_major: Any, required_minor: Any, required_micro: Any):String = js.native
    def checksum_type_get_length(checksum_type0: Double):Any = js.native
    def child_watch_add(pid: Any, function0: Any, data: Object):Any = js.native
    def child_watch_add_full(priority: Any, pid: Any, function0: Any, data: Object, notify: Any):Any = js.native
    def child_watch_source_new(pid: Any):Any = js.native
    def clear_error():Unit = js.native
    def clear_pointer(pp: Object, destroy: Any):Unit = js.native
    def close(fd: Any):Boolean = js.native
    def compute_checksum_for_bytes(checksum_type0: Double, data: Any):String = js.native
    def compute_checksum_for_data(checksum_type0: Double, data: js.Array[Any], length: Any):String = js.native
    def compute_checksum_for_string(checksum_type0: Double, str: String, length: Any):String = js.native
    def compute_hmac_for_data(digest_type0: Double, key: js.Array[Any], key_len: Any, data: Any, length: Any):String = js.native
    def compute_hmac_for_string(digest_type0: Double, key: js.Array[Any], key_len: Any, str: String, length: Any):String = js.native
    def convert(str: String, len: Any, to_codeset: String, from_codeset: String, bytes_read: Any, bytes_written: Any):String = js.native
    def convert_error_quark():Any = js.native
    def convert_with_fallback(str: String, len: Any, to_codeset: String, from_codeset: String, fallback: String, bytes_read: Any, bytes_written: Any):String = js.native
    def convert_with_iconv(str: String, len: Any, converter: Any, bytes_read: Any, bytes_written: Any):String = js.native
    def datalist_clear(datalist: Any):Unit = js.native
    def datalist_foreach(datalist: Any, func: Any, user_data: Object):Unit = js.native
    def datalist_get_data(datalist: Any, key: String):Object = js.native
    def datalist_get_flags(datalist: Any):Any = js.native
    def datalist_id_dup_data(datalist: Any, key_id: Any, dup_func: Any, user_data: Object):Object = js.native
    def datalist_id_get_data(datalist: Any, key_id: Any):Object = js.native
    def datalist_id_remove_no_notify(datalist: Any, key_id: Any):Object = js.native
    def datalist_id_replace_data(datalist: Any, key_id: Any, oldval0: Object, newval0: Object, destroy: Any, old_destroy: Any):Boolean = js.native
    def datalist_id_set_data_full(datalist: Any, key_id: Any, data: Object, destroy_func: Any):Unit = js.native
    def datalist_init(datalist: Any):Unit = js.native
    def datalist_set_flags(datalist: Any, flags: Any):Unit = js.native
    def datalist_unset_flags(datalist: Any, flags: Any):Unit = js.native
    def dataset_destroy(dataset_location: Object):Unit = js.native
    def dataset_foreach(dataset_location: Object, func: Any, user_data: Object):Unit = js.native
    def dataset_id_get_data(dataset_location: Object, key_id: Any):Object = js.native
    def dataset_id_remove_no_notify(dataset_location: Object, key_id: Any):Object = js.native
    def dataset_id_set_data_full(dataset_location: Object, key_id: Any, data: Object, destroy_func: Any):Unit = js.native
    def date_get_days_in_month(month: Double, year: Any):Any = js.native
    def date_get_monday_weeks_in_year(year: Any):Any = js.native
    def date_get_sunday_weeks_in_year(year: Any):Any = js.native
    def date_is_leap_year(year: Any):Boolean = js.native
    def date_strftime(s: String, slen: Any, format: String, date: Any):Any = js.native
    def date_time_compare(dt1: Object, dt2: Object):Any = js.native
    def date_time_equal(dt1: Object, dt2: Object):Boolean = js.native
    def date_time_hash(datetime: Object):Any = js.native
    def date_valid_day(day: Any):Boolean = js.native
    def date_valid_dmy(day: Any, month: Double, year: Any):Boolean = js.native
    def date_valid_julian(julian_date: Any):Boolean = js.native
    def date_valid_month(month: Double):Boolean = js.native
    def date_valid_weekday(weekday: Double):Boolean = js.native
    def date_valid_year(year: Any):Boolean = js.native
    def dcgettext(domain: String, msgid: String, category: Any):String = js.native
    def dgettext(domain: String, msgid: String):String = js.native
    def dir_make_tmp(tmpl: Any):Any = js.native
    def direct_equal(v1: Object, v2: Object):Boolean = js.native
    def direct_hash(v: Object):Any = js.native
    def dngettext(domain: String, msgid: String, msgid_plural: String, n: Any):String = js.native
    def double_equal(v1: Object, v2: Object):Boolean = js.native
    def double_hash(v: Object):Any = js.native
    def dpgettext(domain: String, msgctxtid: String, msgidoffset: Any):String = js.native
    def dpgettext2(domain: String, context: String, msgid: String):String = js.native
    def environ_getenv(envp: js.Array[String], variable: String):String = js.native
    def environ_setenv(envp: js.Array[String], variable: String, value: String, overwrite: Boolean):js.Array[String] = js.native
    def environ_unsetenv(envp: js.Array[String], variable: String):js.Array[String] = js.native
    def file_error_from_errno(err_no: Any):Double = js.native
    def file_error_quark():Any = js.native
    def file_get_contents(filename: Any, contents: js.Array[Any], length: Any):Boolean = js.native
    def file_open_tmp(tmpl: Any, name_used: Any):Any = js.native
    def file_read_link(filename: String):String = js.native
    def file_set_contents(filename: Any, contents: js.Array[Any], length: Any):Boolean = js.native
    def file_test(filename: String, test: Double):Boolean = js.native
    def filename_display_basename(filename: String):String = js.native
    def filename_display_name(filename: String):String = js.native
    def filename_from_uri(uri: String, hostname: String):Any = js.native
    def filename_from_utf8(utf8string: String, len: Any, bytes_read: Any, bytes_written: Any):js.Array[Any] = js.native
    def filename_to_uri(filename: String, hostname: String):String = js.native
    def filename_to_utf8(opsysstring: String, len: Any, bytes_read: Any, bytes_written: Any):String = js.native
    def find_program_in_path(program: String):String = js.native
    def format_size(size: Any):String = js.native
    def format_size_for_display(size: Any):String = js.native
    def format_size_full(size: Any, flags: Double):String = js.native
    def fprintf(file: Object, format: String, rest:Any*):Any = js.native
    def free(mem: Object):Unit = js.native
    def get_application_name():String = js.native
    def get_charset(charset: String):Boolean = js.native
    def get_codeset():String = js.native
    def get_current_dir():String = js.native
    def get_current_time(result: Any):Unit = js.native
    def get_environ():js.Array[String] = js.native
    def get_filename_charsets(charsets: String):Boolean = js.native
    def get_home_dir():String = js.native
    def get_host_name():String = js.native
    def get_language_names():js.Array[String] = js.native
    def get_locale_variants(locale: String):js.Array[String] = js.native
    def get_monotonic_time():Any = js.native
    def get_num_processors():Any = js.native
    def get_prgname():String = js.native
    def get_real_name():String = js.native
    def get_real_time():Any = js.native
    def get_system_config_dirs():js.Array[String] = js.native
    def get_system_data_dirs():js.Array[String] = js.native
    def get_tmp_dir():String = js.native
    def get_user_cache_dir():String = js.native
    def get_user_config_dir():String = js.native
    def get_user_data_dir():String = js.native
    def get_user_name():String = js.native
    def get_user_runtime_dir():String = js.native
    def get_user_special_dir(directory: Double):String = js.native
    def getenv(variable: String):String = js.native
    def hash_table_add(hash_table: Any, key: Object):Boolean = js.native
    def hash_table_contains(hash_table: Any, key: Object):Boolean = js.native
    def hash_table_destroy(hash_table: Any):Unit = js.native
    def hash_table_insert(hash_table: Any, key: Object, value: Object):Boolean = js.native
    def hash_table_lookup_extended(hash_table: Any, lookup_key: Object, orig_key: Object, value: Object):Boolean = js.native
    def hash_table_remove(hash_table: Any, key: Object):Boolean = js.native
    def hash_table_remove_all(hash_table: Any):Unit = js.native
    def hash_table_replace(hash_table: Any, key: Object, value: Object):Boolean = js.native
    def hash_table_size(hash_table: Any):Any = js.native
    def hash_table_steal(hash_table: Any, key: Object):Boolean = js.native
    def hash_table_steal_all(hash_table: Any):Unit = js.native
    def hash_table_unref(hash_table: Any):Unit = js.native
    def hook_destroy(hook_list: Any, hook_id: Any):Boolean = js.native
    def hook_destroy_link(hook_list: Any, hook: Any):Unit = js.native
    def hook_free(hook_list: Any, hook: Any):Unit = js.native
    def hook_insert_before(hook_list: Any, sibling: Any, hook: Any):Unit = js.native
    def hook_prepend(hook_list: Any, hook: Any):Unit = js.native
    def hook_unref(hook_list: Any, hook: Any):Unit = js.native
    def hostname_is_ascii_encoded(hostname: String):Boolean = js.native
    def hostname_is_ip_address(hostname: String):Boolean = js.native
    def hostname_is_non_ascii(hostname: String):Boolean = js.native
    def hostname_to_ascii(hostname: String):String = js.native
    def hostname_to_unicode(hostname: String):String = js.native
    def iconv(converter: Any, inbuf: String, inbytes_left: Any, outbuf: String, outbytes_left: Any):Any = js.native
    def idle_add(function0: Any, data: Object):Any = js.native
    def idle_add_full(priority: Any, function0: Any, data: Object, notify: Any):Any = js.native
    def idle_remove_by_data(data: Object):Boolean = js.native
    def idle_source_new():Any = js.native
    def int64_equal(v1: Object, v2: Object):Boolean = js.native
    def int64_hash(v: Object):Any = js.native
    def int_equal(v1: Object, v2: Object):Boolean = js.native
    def int_hash(v: Object):Any = js.native
    def intern_static_string(string: String):String = js.native
    def intern_string(string: String):String = js.native
    def io_add_watch(channel: Any, condition: Double, func: Any, user_data: Object):Any = js.native
    def io_add_watch_full(channel: Any, priority: Any, condition: Double, func: Any, user_data: Object, notify: Any):Any = js.native
    def io_channel_error_from_errno(en: Any):Double = js.native
    def io_channel_error_quark():Any = js.native
    def io_create_watch(channel: Any, condition: Double):Any = js.native
    def key_file_error_quark():Any = js.native
    def listenv():js.Array[String] = js.native
    def locale_from_utf8(utf8string: String, len: Any, bytes_read: Any, bytes_written: Any):String = js.native
    def locale_to_utf8(opsysstring: String, len: Any, bytes_read: Any, bytes_written: Any):String = js.native
    def log(log_domain: String, log_level: Double, format: String, rest:Any*):Unit = js.native
    def log_default_handler(log_domain: String, log_level: Double, message: String, unused_data: Object):Unit = js.native
    def log_remove_handler(log_domain: String, handler_id: Any):Unit = js.native
    def log_set_always_fatal(fatal_mask: Double):Double = js.native
    def log_set_default_handler(log_func: Any, user_data: Object):Any = js.native
    def log_set_fatal_mask(log_domain: String, fatal_mask: Double):Double = js.native
    def log_set_handler(log_domain: String, log_levels: Double, log_func: Any, user_data: Object):Any = js.native
    def log_set_handler_full(log_domain: String, log_levels: Double, log_func: Any, user_data: Object, destroy: Any):Any = js.native
    def logv(log_domain: String, log_level: Double, format: String, args: Any):Unit = js.native
    def main_context_default():Any = js.native
    def main_context_get_thread_default():Any = js.native
    def main_context_ref_thread_default():Any = js.native
    def main_current_source():Any = js.native
    def main_depth():Any = js.native
    def malloc(n_bytes: Any):Object = js.native
    def malloc0(n_bytes: Any):Object = js.native
    def malloc0_n(n_blocks: Any, n_block_bytes: Any):Object = js.native
    def malloc_n(n_blocks: Any, n_block_bytes: Any):Object = js.native
    def markup_collect_attributes(element_name: String, attribute_names: String, attribute_values: String, error: Any, first_type0: Double, first_attr: String, rest:Any*):Boolean = js.native
    def markup_error_quark():Any = js.native
    def markup_escape_text(text: String, length: Any):String = js.native
    def markup_printf_escaped(format: String, rest:Any*):String = js.native
    def markup_vprintf_escaped(format: String, args: Any):String = js.native
    def mem_is_system_malloc():Boolean = js.native
    def mem_profile():Unit = js.native
    def mem_set_vtable(vtable: Any):Unit = js.native
    def memdup(mem: Object, byte_size: Any):Object = js.native
    def mkdir_with_parents(pathname: String, mode: Any):Any = js.native
    def mkdtemp(tmpl: Any):String = js.native
    def mkdtemp_full(tmpl: Any, mode: Any):String = js.native
    def mkstemp(tmpl: Any):Any = js.native
    def mkstemp_full(tmpl: Any, flags: Any, mode: Any):Any = js.native
    def nullify_pointer(nullify_location: Object):Unit = js.native
    def on_error_query(prg_name: String):Unit = js.native
    def on_error_stack_trace(prg_name: String):Unit = js.native
    def once_init_enter(location: Object):Boolean = js.native
    def once_init_leave(location: Object, result: Any):Unit = js.native
    def option_error_quark():Any = js.native
    def parse_debug_string(string: String, keys: js.Array[Any], nkeys: Any):Any = js.native
    def path_get_basename(file_name: String):String = js.native
    def path_get_dirname(file_name: String):String = js.native
    def path_is_absolute(file_name: String):Boolean = js.native
    def path_skip_root(file_name: String):String = js.native
    def pattern_match(pspec: Any, string_length: Any, string: String, string_reversed: String):Boolean = js.native
    def pattern_match_simple(pattern: String, string: String):Boolean = js.native
    def pattern_match_string(pspec: Any, string: String):Boolean = js.native
    def pointer_bit_lock(address: Object, lock_bit: Any):Unit = js.native
    def pointer_bit_trylock(address: Object, lock_bit: Any):Boolean = js.native
    def pointer_bit_unlock(address: Object, lock_bit: Any):Unit = js.native
    def poll(fds: Any, nfds: Any, timeout: Any):Any = js.native
    def prefix_error(err: Any, format: String, rest:Any*):Unit = js.native
    def print(format: String, rest:Any*):Unit = js.native
    def printerr(format: String, rest:Any*):Unit = js.native
    def printf(format: String, rest:Any*):Any = js.native
    def printf_string_upper_bound(format: String, args: Any):Any = js.native
    def propagate_error(dest: Any, src: Any):Unit = js.native
    def propagate_prefixed_error(dest: Any, src: Any, format: String, rest:Any*):Unit = js.native
    def qsort_with_data(pbase: Object, total_elems: Any, size: Any, compare_func: Any, user_data: Object):Unit = js.native
    def quark_from_static_string(string: String):Any = js.native
    def quark_from_string(string: String):Any = js.native
    def quark_to_string(quark: Any):String = js.native
    def quark_try_string(string: String):Any = js.native
    def random_double():Any = js.native
    def random_double_range(begin: Any, end: Any):Any = js.native
    def random_int():Any = js.native
    def random_int_range(begin: Any, end: Any):Any = js.native
    def random_set_seed(seed: Any):Unit = js.native
    def realloc(mem: Object, n_bytes: Any):Object = js.native
    def realloc_n(mem: Object, n_blocks: Any, n_block_bytes: Any):Object = js.native
    def regex_check_replacement(replacement: String, has_references: Boolean):Boolean = js.native
    def regex_error_quark():Any = js.native
    def regex_escape_nul(string: String, length: Any):String = js.native
    def regex_escape_string(string: js.Array[String], length: Any):String = js.native
    def regex_match_simple(pattern: String, string: String, compile_options: Double, match_options: Double):Boolean = js.native
    def regex_split_simple(pattern: String, string: String, compile_options: Double, match_options: Double):js.Array[String] = js.native
    def reload_user_special_dirs_cache():Unit = js.native
    def return_if_fail_warning(log_domain: String, pretty_function: String, expression: String):Unit = js.native
    def rmdir(filename: String):Any = js.native
    def sequence_move(src: Any, dest: Any):Unit = js.native
    def sequence_move_range(dest: Any, begin: Any, end: Any):Unit = js.native
    def sequence_remove(iter: Any):Unit = js.native
    def sequence_remove_range(begin: Any, end: Any):Unit = js.native
    def sequence_set(iter: Any, data: Object):Unit = js.native
    def sequence_swap(a: Any, b: Any):Unit = js.native
    def set_application_name(application_name: String):Unit = js.native
    def set_error(err: Any, domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
    def set_error_literal(err: Any, domain: Any, code: Any, message: String):Unit = js.native
    def set_prgname(prgname: String):Unit = js.native
    def set_print_handler(func: Any):Any = js.native
    def set_printerr_handler(func: Any):Any = js.native
    def setenv(variable: String, value: String, overwrite: Boolean):Boolean = js.native
    def shell_error_quark():Any = js.native
    def shell_parse_argv(command_line: String, argcp: Any, argvp: js.Array[String]):Boolean = js.native
    def shell_quote(unquoted_string: String):String = js.native
    def shell_unquote(quoted_string: String):String = js.native
    def slice_alloc(block_size: Any):Object = js.native
    def slice_alloc0(block_size: Any):Object = js.native
    def slice_copy(block_size: Any, mem_block: Object):Object = js.native
    def slice_free1(block_size: Any, mem_block: Object):Unit = js.native
    def slice_free_chain_with_offset(block_size: Any, mem_chain: Object, next_offset: Any):Unit = js.native
    def slice_get_config(ckey: Double):Any = js.native
    def slice_get_config_state(ckey: Double, address: Any, n_values: Any):Any = js.native
    def slice_set_config(ckey: Double, value: Any):Unit = js.native
    def snprintf(string: String, n: Any, format: String, rest:Any*):Any = js.native
    def source_remove(tag: Any):Boolean = js.native
    def source_remove_by_funcs_user_data(funcs: Any, user_data: Object):Boolean = js.native
    def source_remove_by_user_data(user_data: Object):Boolean = js.native
    def source_set_name_by_id(tag: Any, name: String):Unit = js.native
    def spaced_primes_closest(num: Any):Any = js.native
    def spawn_async(working_directory: String, argv: js.Array[String], envp: js.Array[String], flags: Double, child_setup: Any, user_data: Object, child_pid: Any):Boolean = js.native
    def spawn_async_with_pipes(working_directory: String, argv: js.Array[String], envp: js.Array[String], flags: Double, child_setup: Any, user_data: Object, child_pid: Any, standard_input: Any, standard_output: Any, standard_error: Any):Boolean = js.native
    def spawn_check_exit_status(exit_status: Any):Boolean = js.native
    def spawn_close_pid(pid: Any):Unit = js.native
    def spawn_command_line_async(command_line: String):Boolean = js.native
    def spawn_command_line_sync(command_line: String, standard_output: js.Array[Any], standard_error: js.Array[Any], exit_status: Any):Boolean = js.native
    def spawn_error_quark():Any = js.native
    def spawn_exit_error_quark():Any = js.native
    def spawn_sync(working_directory: String, argv: js.Array[String], envp: js.Array[String], flags: Double, child_setup: Any, user_data: Object, standard_output: js.Array[Any], standard_error: js.Array[Any], exit_status: Any):Boolean = js.native
    def sprintf(string: String, format: String, rest:Any*):Any = js.native
    def stpcpy(dest: String, src: String):String = js.native
    def str_equal(v1: Object, v2: Object):Boolean = js.native
    def str_has_prefix(str: String, prefix: String):Boolean = js.native
    def str_has_suffix(str: String, suffix: String):Boolean = js.native
    def str_hash(v: Object):Any = js.native
    def str_is_ascii(str: String):Boolean = js.native
    def str_match_string(search_term: String, potential_hit: String, accept_alternates: Boolean):Boolean = js.native
    def str_to_ascii(str: String, from_locale: String):String = js.native
    def str_tokenize_and_fold(string: String, translit_locale: String, ascii_alternates: js.Array[String]):js.Array[String] = js.native
    def strcanon(string: String, valid_chars: String, substitutor: Any):String = js.native
    def strcasecmp(s1: String, s2: String):Any = js.native
    def strchomp(string: String):String = js.native
    def strchug(string: String):String = js.native
    def strcmp0(str1: String, str2: String):Any = js.native
    def strcompress(source: String):String = js.native
    def strconcat(string1: String, rest:Any*):String = js.native
    def strdelimit(string: String, delimiters: String, new_delimiter: Any):String = js.native
    def strdown(string: String):String = js.native
    def strdup(str: String):String = js.native
    def strdup_printf(format: String, rest:Any*):String = js.native
    def strdup_vprintf(format: String, args: Any):String = js.native
    def strdupv(str_array: String):js.Array[String] = js.native
    def strerror(errnum: Any):String = js.native
    def strescape(source: String, exceptions: String):String = js.native
    def strfreev(str_array: String):Unit = js.native
    def string_new(init: String):Any = js.native
    def string_new_len(init: String, len: Any):Any = js.native
    def string_sized_new(dfl_size: Any):Any = js.native
    def strip_context(msgid: String, msgval0: String):String = js.native
    def strjoin(separator: String, rest:Any*):String = js.native
    def strjoinv(separator: String, str_array: String):String = js.native
    def strlcat(dest: String, src: String, dest_size: Any):Any = js.native
    def strlcpy(dest: String, src: String, dest_size: Any):Any = js.native
    def strncasecmp(s1: String, s2: String, n: Any):Any = js.native
    def strndup(str: String, n: Any):String = js.native
    def strnfill(length: Any, fill_char: Any):String = js.native
    def strreverse(string: String):String = js.native
    def strrstr(haystack: String, needle: String):String = js.native
    def strrstr_len(haystack: String, haystack_len: Any, needle: String):String = js.native
    def strsignal(signum: Any):String = js.native
    def strsplit(string: String, delimiter: String, max_tokens: Any):js.Array[String] = js.native
    def strsplit_set(string: String, delimiters: String, max_tokens: Any):js.Array[String] = js.native
    def strstr_len(haystack: String, haystack_len: Any, needle: String):String = js.native
    def strtod(nptr: String, endptr: String):Any = js.native
    def strup(string: String):String = js.native
    def strv_contains(strv: String, str: String):Boolean = js.native
    def strv_get_type():Any = js.native
    def strv_length(str_array: String):Any = js.native
    def test_add_data_func(testpath: String, test_data: Object, test_func: Any):Unit = js.native
    def test_add_data_func_full(testpath: String, test_data: Object, test_func: Any, data_free_func: Any):Unit = js.native
    def test_add_func(testpath: String, test_func: Any):Unit = js.native
    def test_add_vtable(testpath: String, data_size: Any, test_data: Object, data_setup: Any, data_test: Any, data_teardown: Any):Unit = js.native
    def test_assert_expected_messages_internal(domain: String, file: String, line: Any, func: String):Unit = js.native
    def test_bug(bug_uri_snippet: String):Unit = js.native
    def test_bug_base(uri_pattern: String):Unit = js.native
    def test_build_filename(file_type0: Double, first_path: String, rest:Any*):String = js.native
    def test_create_case(test_name: String, data_size: Any, test_data: Object, data_setup: Any, data_test: Any, data_teardown: Any):Any = js.native
    def test_create_suite(suite_name: String):Any = js.native
    def test_expect_message(log_domain: String, log_level: Double, pattern: String):Unit = js.native
    def test_fail():Unit = js.native
    def test_failed():Boolean = js.native
    def test_get_dir(file_type0: Double):String = js.native
    def test_get_filename(file_type0: Double, first_path: String, rest:Any*):String = js.native
    def test_get_root():Any = js.native
    def test_incomplete(msg: String):Unit = js.native
    def test_init(argc: Any, argv: String, rest:Any*):Unit = js.native
    def test_log_set_fatal_handler(log_func: Any, user_data: Object):Unit = js.native
    def test_log_type_name(log_type0: Double):String = js.native
    def test_maximized_result(maximized_quantity: Any, format: String, rest:Any*):Unit = js.native
    def test_message(format: String, rest:Any*):Unit = js.native
    def test_minimized_result(minimized_quantity: Any, format: String, rest:Any*):Unit = js.native
    def test_queue_destroy(destroy_func: Any, destroy_data: Object):Unit = js.native
    def test_queue_free(gfree_pointer: Object):Unit = js.native
    def test_rand_double():Any = js.native
    def test_rand_double_range(range_start: Any, range_end: Any):Any = js.native
    def test_rand_int():Any = js.native
    def test_rand_int_range(begin: Any, end: Any):Any = js.native
    def test_run():Any = js.native
    def test_run_suite(suite: Any):Any = js.native
    def test_set_nonfatal_assertions():Unit = js.native
    def test_skip(msg: String):Unit = js.native
    def test_subprocess():Boolean = js.native
    def test_timer_elapsed():Any = js.native
    def test_timer_last():Any = js.native
    def test_timer_start():Unit = js.native
    def test_trap_assertions(domain: String, file: String, line: Any, func: String, assertion_flags: Any, pattern: String):Unit = js.native
    def test_trap_fork(usec_timeout: Any, test_trap_flags: Double):Boolean = js.native
    def test_trap_has_passed():Boolean = js.native
    def test_trap_reached_timeout():Boolean = js.native
    def test_trap_subprocess(test_path: String, usec_timeout: Any, test_flags: Double):Unit = js.native
    def thread_error_quark():Any = js.native
    def thread_exit(retval0: Object):Unit = js.native
    def thread_pool_get_max_idle_time():Any = js.native
    def thread_pool_get_max_unused_threads():Any = js.native
    def thread_pool_get_num_unused_threads():Any = js.native
    def thread_pool_set_max_idle_time(interval0: Any):Unit = js.native
    def thread_pool_set_max_unused_threads(max_threads: Any):Unit = js.native
    def thread_pool_stop_unused_threads():Unit = js.native
    def thread_self():Any = js.native
    def thread_yield():Unit = js.native
    def time_val_from_iso8601(iso_date: String, time0: Any):Boolean = js.native
    def timeout_add(interval0: Any, function0: Any, data: Object):Any = js.native
    def timeout_add_full(priority: Any, interval0: Any, function0: Any, data: Object, notify: Any):Any = js.native
    def timeout_add_seconds(interval0: Any, function0: Any, data: Object):Any = js.native
    def timeout_add_seconds_full(priority: Any, interval0: Any, function0: Any, data: Object, notify: Any):Any = js.native
    def timeout_source_new(interval0: Any):Any = js.native
    def timeout_source_new_seconds(interval0: Any):Any = js.native
    def trash_stack_height(stack_p: Any):Any = js.native
    def trash_stack_push(stack_p: Any, data_p: Object):Unit = js.native
    def try_malloc(n_bytes: Any):Object = js.native
    def try_malloc0(n_bytes: Any):Object = js.native
    def try_malloc0_n(n_blocks: Any, n_block_bytes: Any):Object = js.native
    def try_malloc_n(n_blocks: Any, n_block_bytes: Any):Object = js.native
    def try_realloc(mem: Object, n_bytes: Any):Object = js.native
    def try_realloc_n(mem: Object, n_blocks: Any, n_block_bytes: Any):Object = js.native
    def ucs4_to_utf16(str: Any, len: Any, items_read: Any, items_written: Any):Any = js.native
    def ucs4_to_utf8(str: Any, len: Any, items_read: Any, items_written: Any):String = js.native
    def unichar_break_type(c: Any):Double = js.native
    def unichar_combining_class(uc: Any):Any = js.native
    def unichar_compose(a: Any, b: Any, ch: Any):Boolean = js.native
    def unichar_decompose(ch: Any, a: Any, b: Any):Boolean = js.native
    def unichar_digit_value(c: Any):Any = js.native
    def unichar_fully_decompose(ch: Any, compat: Boolean, result: Any, result_len: Any):Any = js.native
    def unichar_get_mirror_char(ch: Any, mirrored_ch: Any):Boolean = js.native
    def unichar_get_script(ch: Any):Double = js.native
    def unichar_isalnum(c: Any):Boolean = js.native
    def unichar_isalpha(c: Any):Boolean = js.native
    def unichar_iscntrl(c: Any):Boolean = js.native
    def unichar_isdefined(c: Any):Boolean = js.native
    def unichar_isdigit(c: Any):Boolean = js.native
    def unichar_isgraph(c: Any):Boolean = js.native
    def unichar_islower(c: Any):Boolean = js.native
    def unichar_ismark(c: Any):Boolean = js.native
    def unichar_isprint(c: Any):Boolean = js.native
    def unichar_ispunct(c: Any):Boolean = js.native
    def unichar_isspace(c: Any):Boolean = js.native
    def unichar_istitle(c: Any):Boolean = js.native
    def unichar_isupper(c: Any):Boolean = js.native
    def unichar_iswide(c: Any):Boolean = js.native
    def unichar_iswide_cjk(c: Any):Boolean = js.native
    def unichar_isxdigit(c: Any):Boolean = js.native
    def unichar_iszerowidth(c: Any):Boolean = js.native
    def unichar_to_utf8(c: Any, outbuf: String):Any = js.native
    def unichar_tolower(c: Any):Any = js.native
    def unichar_totitle(c: Any):Any = js.native
    def unichar_toupper(c: Any):Any = js.native
    def unichar_type(c: Any):Double = js.native
    def unichar_validate(ch: Any):Boolean = js.native
    def unichar_xdigit_value(c: Any):Any = js.native
    def unicode_canonical_decomposition(ch: Any, result_len: Any):Any = js.native
    def unicode_canonical_ordering(string: Any, len: Any):Unit = js.native
    def unicode_script_from_iso15924(iso15924: Any):Double = js.native
    def unicode_script_to_iso15924(script: Double):Any = js.native
    def unix_error_quark():Any = js.native
    def unix_fd_add(fd: Any, condition: Double, function0: Any, user_data: Object):Any = js.native
    def unix_fd_add_full(priority: Any, fd: Any, condition: Double, function0: Any, user_data: Object, notify: Any):Any = js.native
    def unix_fd_source_new(fd: Any, condition: Double):Any = js.native
    def unix_open_pipe(fds: Any, flags: Any):Boolean = js.native
    def unix_set_fd_nonblocking(fd: Any, nonblock: Boolean):Boolean = js.native
    def unix_signal_add(signum: Any, handler: Any, user_data: Object):Any = js.native
    def unix_signal_add_full(priority: Any, signum: Any, handler: Any, user_data: Object, notify: Any):Any = js.native
    def unix_signal_source_new(signum: Any):Any = js.native
    def unlink(filename: String):Any = js.native
    def unsetenv(variable: String):Unit = js.native
    def uri_escape_string(unescaped: String, reserved_chars_allowed: String, allow_utf8: Boolean):String = js.native
    def uri_list_extract_uris(uri_list: String):js.Array[String] = js.native
    def uri_parse_scheme(uri: String):String = js.native
    def uri_unescape_segment(escaped_string: String, escaped_string_end: String, illegal_characters: String):String = js.native
    def uri_unescape_string(escaped_string: String, illegal_characters: String):String = js.native
    def usleep(microseconds: Any):Unit = js.native
    def utf16_to_ucs4(str: Any, len: Any, items_read: Any, items_written: Any):Any = js.native
    def utf16_to_utf8(str: Any, len: Any, items_read: Any, items_written: Any):String = js.native
    def utf8_casefold(str: String, len: Any):String = js.native
    def utf8_collate(str1: String, str2: String):Any = js.native
    def utf8_collate_key(str: String, len: Any):String = js.native
    def utf8_collate_key_for_filename(str: String, len: Any):String = js.native
    def utf8_find_next_char(p: String, end: String):String = js.native
    def utf8_find_prev_char(str: String, p: String):String = js.native
    def utf8_get_char(p: String):Any = js.native
    def utf8_get_char_validated(p: String, max_len: Any):Any = js.native
    def utf8_normalize(str: String, len: Any, mode: Double):String = js.native
    def utf8_offset_to_pointer(str: String, offset: Any):String = js.native
    def utf8_pointer_to_offset(str: String, pos: String):Any = js.native
    def utf8_prev_char(p: String):String = js.native
    def utf8_strchr(p: String, len: Any, c: Any):String = js.native
    def utf8_strdown(str: String, len: Any):String = js.native
    def utf8_strlen(p: String, max: Any):Any = js.native
    def utf8_strncpy(dest: String, src: String, n: Any):String = js.native
    def utf8_strrchr(p: String, len: Any, c: Any):String = js.native
    def utf8_strreverse(str: String, len: Any):String = js.native
    def utf8_strup(str: String, len: Any):String = js.native
    def utf8_substring(str: String, start_pos: Any, end_pos: Any):String = js.native
    def utf8_to_ucs4(str: String, len: Any, items_read: Any, items_written: Any):Any = js.native
    def utf8_to_ucs4_fast(str: String, len: Any, items_written: Any):Any = js.native
    def utf8_to_utf16(str: String, len: Any, items_read: Any, items_written: Any):Any = js.native
    def utf8_validate(str: js.Array[Any], max_len: Any, end: String):Boolean = js.native
    def variant_get_gtype():Any = js.native
    def variant_is_object_path(string: String):Boolean = js.native
    def variant_is_signature(string: String):Boolean = js.native
    def variant_parse(type0: Any, text: String, limit: String, endptr: String):Any = js.native
    def variant_parse_error_print_context(error: Any, source_str: String):String = js.native
    def variant_parse_error_quark():Any = js.native
    def variant_parser_get_error_quark():Any = js.native
    def variant_type_checked_(arg0: String):Any = js.native
    def variant_type_string_is_valid(type_string: String):Boolean = js.native
    def variant_type_string_scan(string: String, limit: String, endptr: String):Boolean = js.native
    def vasprintf(string: String, format: String, args: Any):Any = js.native
    def vfprintf(file: Object, format: String, args: Any):Any = js.native
    def vprintf(format: String, args: Any):Any = js.native
    def vsnprintf(string: String, n: Any, format: String, args: Any):Any = js.native
    def vsprintf(string: String, format: String, args: Any):Any = js.native
    def warn_message(domain: String, file: String, line: Any, func: String, warnexpr: String):Unit = js.native
    @js.native
    object BookmarkFileError extends js.Object {
        val INVALID_URI:Double = js.native
        val INVALID_VALUE:Double = js.native
        val APP_NOT_REGISTERED:Double = js.native
        val URI_NOT_FOUND:Double = js.native
        val READ:Double = js.native
        val UNKNOWN_ENCODING:Double = js.native
        val WRITE:Double = js.native
        val FILE_NOT_FOUND:Double = js.native
    }
    @js.native
    object ChecksumType extends js.Object {
        val MD5:Double = js.native
        val SHA1:Double = js.native
        val SHA256:Double = js.native
        val SHA512:Double = js.native
    }
    @js.native
    object ConvertError extends js.Object {
        val NO_CONVERSION:Double = js.native
        val ILLEGAL_SEQUENCE:Double = js.native
        val FAILED:Double = js.native
        val PARTIAL_INPUT:Double = js.native
        val BAD_URI:Double = js.native
        val NOT_ABSOLUTE_PATH:Double = js.native
        val NO_MEMORY:Double = js.native
    }
    @js.native
    object DateDMY extends js.Object {
        val DAY:Double = js.native
        val MONTH:Double = js.native
        val YEAR:Double = js.native
    }
    @js.native
    object DateMonth extends js.Object {
        val BAD_MONTH:Double = js.native
        val JANUARY:Double = js.native
        val FEBRUARY:Double = js.native
        val MARCH:Double = js.native
        val APRIL:Double = js.native
        val MAY:Double = js.native
        val JUNE:Double = js.native
        val JULY:Double = js.native
        val AUGUST:Double = js.native
        val SEPTEMBER:Double = js.native
        val OCTOBER:Double = js.native
        val NOVEMBER:Double = js.native
        val DECEMBER:Double = js.native
    }
    @js.native
    object DateWeekday extends js.Object {
        val BAD_WEEKDAY:Double = js.native
        val MONDAY:Double = js.native
        val TUESDAY:Double = js.native
        val WEDNESDAY:Double = js.native
        val THURSDAY:Double = js.native
        val FRIDAY:Double = js.native
        val SATURDAY:Double = js.native
        val SUNDAY:Double = js.native
    }
    @js.native
    object ErrorType extends js.Object {
        val UNKNOWN:Double = js.native
        val UNEXP_EOF:Double = js.native
        val UNEXP_EOF_IN_STRING:Double = js.native
        val UNEXP_EOF_IN_COMMENT:Double = js.native
        val NON_DIGIT_IN_CONST:Double = js.native
        val DIGIT_RADIX:Double = js.native
        val FLOAT_RADIX:Double = js.native
        val FLOAT_MALFORMED:Double = js.native
    }
    @js.native
    object FileError extends js.Object {
        val EXIST:Double = js.native
        val ISDIR:Double = js.native
        val ACCES:Double = js.native
        val NAMETOOLONG:Double = js.native
        val NOENT:Double = js.native
        val NOTDIR:Double = js.native
        val NXIO:Double = js.native
        val NODEV:Double = js.native
        val ROFS:Double = js.native
        val TXTBSY:Double = js.native
        val FAULT:Double = js.native
        val LOOP:Double = js.native
        val NOSPC:Double = js.native
        val NOMEM:Double = js.native
        val MFILE:Double = js.native
        val NFILE:Double = js.native
        val BADF:Double = js.native
        val INVAL:Double = js.native
        val PIPE:Double = js.native
        val AGAIN:Double = js.native
        val INTR:Double = js.native
        val IO:Double = js.native
        val PERM:Double = js.native
        val NOSYS:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object IOChannelError extends js.Object {
        val FBIG:Double = js.native
        val INVAL:Double = js.native
        val IO:Double = js.native
        val ISDIR:Double = js.native
        val NOSPC:Double = js.native
        val NXIO:Double = js.native
        val OVERFLOW:Double = js.native
        val PIPE:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object IOError extends js.Object {
        val NONE:Double = js.native
        val AGAIN:Double = js.native
        val INVAL:Double = js.native
        val UNKNOWN:Double = js.native
    }
    @js.native
    object IOStatus extends js.Object {
        val ERROR:Double = js.native
        val NORMAL:Double = js.native
        val EOF:Double = js.native
        val AGAIN:Double = js.native
    }
    @js.native
    object KeyFileError extends js.Object {
        val UNKNOWN_ENCODING:Double = js.native
        val PARSE:Double = js.native
        val NOT_FOUND:Double = js.native
        val KEY_NOT_FOUND:Double = js.native
        val GROUP_NOT_FOUND:Double = js.native
        val INVALID_VALUE:Double = js.native
    }
    @js.native
    object MarkupError extends js.Object {
        val BAD_UTF8:Double = js.native
        val EMPTY:Double = js.native
        val PARSE:Double = js.native
        val UNKNOWN_ELEMENT:Double = js.native
        val UNKNOWN_ATTRIBUTE:Double = js.native
        val INVALID_CONTENT:Double = js.native
        val MISSING_ATTRIBUTE:Double = js.native
    }
    @js.native
    object NormalizeMode extends js.Object {
        val DEFAULT:Double = js.native
        val NFD:Double = js.native
        val DEFAULT_COMPOSE:Double = js.native
        val NFC:Double = js.native
        val ALL:Double = js.native
        val NFKD:Double = js.native
        val ALL_COMPOSE:Double = js.native
        val NFKC:Double = js.native
    }
    @js.native
    object OnceStatus extends js.Object {
        val NOTCALLED:Double = js.native
        val PROGRESS:Double = js.native
        val READY:Double = js.native
    }
    @js.native
    object OptionArg extends js.Object {
        val NONE:Double = js.native
        val STRING:Double = js.native
        val INT:Double = js.native
        val CALLBACK:Double = js.native
        val FILENAME:Double = js.native
        val STRING_ARRAY:Double = js.native
        val FILENAME_ARRAY:Double = js.native
        val DOUBLE:Double = js.native
        val INT64:Double = js.native
    }
    @js.native
    object OptionError extends js.Object {
        val UNKNOWN_OPTION:Double = js.native
        val BAD_VALUE:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object RegexError extends js.Object {
        val COMPILE:Double = js.native
        val OPTIMIZE:Double = js.native
        val REPLACE:Double = js.native
        val MATCH:Double = js.native
        val INTERNAL:Double = js.native
        val STRAY_BACKSLASH:Double = js.native
        val MISSING_CONTROL_CHAR:Double = js.native
        val UNRECOGNIZED_ESCAPE:Double = js.native
        val QUANTIFIERS_OUT_OF_ORDER:Double = js.native
        val QUANTIFIER_TOO_BIG:Double = js.native
        val UNTERMINATED_CHARACTER_CLASS:Double = js.native
        val INVALID_ESCAPE_IN_CHARACTER_CLASS:Double = js.native
        val RANGE_OUT_OF_ORDER:Double = js.native
        val NOTHING_TO_REPEAT:Double = js.native
        val UNRECOGNIZED_CHARACTER:Double = js.native
        val POSIX_NAMED_CLASS_OUTSIDE_CLASS:Double = js.native
        val UNMATCHED_PARENTHESIS:Double = js.native
        val INEXISTENT_SUBPATTERN_REFERENCE:Double = js.native
        val UNTERMINATED_COMMENT:Double = js.native
        val EXPRESSION_TOO_LARGE:Double = js.native
        val MEMORY_ERROR:Double = js.native
        val VARIABLE_LENGTH_LOOKBEHIND:Double = js.native
        val MALFORMED_CONDITION:Double = js.native
        val TOO_MANY_CONDITIONAL_BRANCHES:Double = js.native
        val ASSERTION_EXPECTED:Double = js.native
        val UNKNOWN_POSIX_CLASS_NAME:Double = js.native
        val POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED:Double = js.native
        val HEX_CODE_TOO_LARGE:Double = js.native
        val INVALID_CONDITION:Double = js.native
        val SINGLE_BYTE_MATCH_IN_LOOKBEHIND:Double = js.native
        val INFINITE_LOOP:Double = js.native
        val MISSING_SUBPATTERN_NAME_TERMINATOR:Double = js.native
        val DUPLICATE_SUBPATTERN_NAME:Double = js.native
        val MALFORMED_PROPERTY:Double = js.native
        val UNKNOWN_PROPERTY:Double = js.native
        val SUBPATTERN_NAME_TOO_LONG:Double = js.native
        val TOO_MANY_SUBPATTERNS:Double = js.native
        val INVALID_OCTAL_VALUE:Double = js.native
        val TOO_MANY_BRANCHES_IN_DEFINE:Double = js.native
        val DEFINE_REPETION:Double = js.native
        val INCONSISTENT_NEWLINE_OPTIONS:Double = js.native
        val MISSING_BACK_REFERENCE:Double = js.native
        val INVALID_RELATIVE_REFERENCE:Double = js.native
        val BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN:Double = js.native
        val UNKNOWN_BACKTRACKING_CONTROL_VERB:Double = js.native
        val NUMBER_TOO_BIG:Double = js.native
        val MISSING_SUBPATTERN_NAME:Double = js.native
        val MISSING_DIGIT:Double = js.native
        val INVALID_DATA_CHARACTER:Double = js.native
        val EXTRA_SUBPATTERN_NAME:Double = js.native
        val BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED:Double = js.native
        val INVALID_CONTROL_CHAR:Double = js.native
        val MISSING_NAME:Double = js.native
        val NOT_SUPPORTED_IN_CLASS:Double = js.native
        val TOO_MANY_FORWARD_REFERENCES:Double = js.native
        val NAME_TOO_LONG:Double = js.native
        val CHARACTER_VALUE_TOO_LARGE:Double = js.native
    }
    @js.native
    object SeekType extends js.Object {
        val CUR:Double = js.native
        val SET:Double = js.native
        val END:Double = js.native
    }
    @js.native
    object ShellError extends js.Object {
        val BAD_QUOTING:Double = js.native
        val EMPTY_STRING:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object SliceConfig extends js.Object {
        val ALWAYS_MALLOC:Double = js.native
        val BYPASS_MAGAZINES:Double = js.native
        val WORKING_SET_MSECS:Double = js.native
        val COLOR_INCREMENT:Double = js.native
        val CHUNK_SIZES:Double = js.native
        val CONTENTION_COUNTER:Double = js.native
    }
    @js.native
    object SpawnError extends js.Object {
        val FORK:Double = js.native
        val READ:Double = js.native
        val CHDIR:Double = js.native
        val ACCES:Double = js.native
        val PERM:Double = js.native
        val TOO_BIG:Double = js.native
        val _2BIG:Double = js.native
        val NOEXEC:Double = js.native
        val NAMETOOLONG:Double = js.native
        val NOENT:Double = js.native
        val NOMEM:Double = js.native
        val NOTDIR:Double = js.native
        val LOOP:Double = js.native
        val TXTBUSY:Double = js.native
        val IO:Double = js.native
        val NFILE:Double = js.native
        val MFILE:Double = js.native
        val INVAL:Double = js.native
        val ISDIR:Double = js.native
        val LIBBAD:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object TestFileType extends js.Object {
        val DIST:Double = js.native
        val BUILT:Double = js.native
    }
    @js.native
    object TestLogType extends js.Object {
        val NONE:Double = js.native
        val ERROR:Double = js.native
        val START_BINARY:Double = js.native
        val LIST_CASE:Double = js.native
        val SKIP_CASE:Double = js.native
        val START_CASE:Double = js.native
        val STOP_CASE:Double = js.native
        val MIN_RESULT:Double = js.native
        val MAX_RESULT:Double = js.native
        val MESSAGE:Double = js.native
        val START_SUITE:Double = js.native
        val STOP_SUITE:Double = js.native
    }
    @js.native
    object ThreadError extends js.Object {
        val THREAD_ERROR_AGAIN:Double = js.native
    }
    @js.native
    object TimeType extends js.Object {
        val STANDARD:Double = js.native
        val DAYLIGHT:Double = js.native
        val UNIVERSAL:Double = js.native
    }
    @js.native
    object TokenType extends js.Object {
        val EOF:Double = js.native
        val LEFT_PAREN:Double = js.native
        val RIGHT_PAREN:Double = js.native
        val LEFT_CURLY:Double = js.native
        val RIGHT_CURLY:Double = js.native
        val LEFT_BRACE:Double = js.native
        val RIGHT_BRACE:Double = js.native
        val EQUAL_SIGN:Double = js.native
        val COMMA:Double = js.native
        val NONE:Double = js.native
        val ERROR:Double = js.native
        val CHAR:Double = js.native
        val BINARY:Double = js.native
        val OCTAL:Double = js.native
        val INT:Double = js.native
        val HEX:Double = js.native
        val FLOAT:Double = js.native
        val STRING:Double = js.native
        val SYMBOL:Double = js.native
        val IDENTIFIER:Double = js.native
        val IDENTIFIER_NULL:Double = js.native
        val COMMENT_SINGLE:Double = js.native
        val COMMENT_MULTI:Double = js.native
    }
    @js.native
    object TraverseType extends js.Object {
        val IN_ORDER:Double = js.native
        val PRE_ORDER:Double = js.native
        val POST_ORDER:Double = js.native
        val LEVEL_ORDER:Double = js.native
    }
    @js.native
    object UnicodeBreakType extends js.Object {
        val MANDATORY:Double = js.native
        val CARRIAGE_RETURN:Double = js.native
        val LINE_FEED:Double = js.native
        val COMBINING_MARK:Double = js.native
        val SURROGATE:Double = js.native
        val ZERO_WIDTH_SPACE:Double = js.native
        val INSEPARABLE:Double = js.native
        val NON_BREAKING_GLUE:Double = js.native
        val CONTINGENT:Double = js.native
        val SPACE:Double = js.native
        val AFTER:Double = js.native
        val BEFORE:Double = js.native
        val BEFORE_AND_AFTER:Double = js.native
        val HYPHEN:Double = js.native
        val NON_STARTER:Double = js.native
        val OPEN_PUNCTUATION:Double = js.native
        val CLOSE_PUNCTUATION:Double = js.native
        val QUOTATION:Double = js.native
        val EXCLAMATION:Double = js.native
        val IDEOGRAPHIC:Double = js.native
        val NUMERIC:Double = js.native
        val INFIX_SEPARATOR:Double = js.native
        val SYMBOL:Double = js.native
        val ALPHABETIC:Double = js.native
        val PREFIX:Double = js.native
        val POSTFIX:Double = js.native
        val COMPLEX_CONTEXT:Double = js.native
        val AMBIGUOUS:Double = js.native
        val UNKNOWN:Double = js.native
        val NEXT_LINE:Double = js.native
        val WORD_JOINER:Double = js.native
        val HANGUL_L_JAMO:Double = js.native
        val HANGUL_V_JAMO:Double = js.native
        val HANGUL_T_JAMO:Double = js.native
        val HANGUL_LV_SYLLABLE:Double = js.native
        val HANGUL_LVT_SYLLABLE:Double = js.native
        val CLOSE_PARANTHESIS:Double = js.native
        val CONDITIONAL_JAPANESE_STARTER:Double = js.native
        val HEBREW_LETTER:Double = js.native
        val REGIONAL_INDICATOR:Double = js.native
    }
    @js.native
    object UnicodeScript extends js.Object {
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
        val AVESTAN:Double = js.native
        val BAMUM:Double = js.native
        val EGYPTIAN_HIEROGLYPHS:Double = js.native
        val IMPERIAL_ARAMAIC:Double = js.native
        val INSCRIPTIONAL_PAHLAVI:Double = js.native
        val INSCRIPTIONAL_PARTHIAN:Double = js.native
        val JAVANESE:Double = js.native
        val KAITHI:Double = js.native
        val LISU:Double = js.native
        val MEETEI_MAYEK:Double = js.native
        val OLD_SOUTH_ARABIAN:Double = js.native
        val OLD_TURKIC:Double = js.native
        val SAMARITAN:Double = js.native
        val TAI_THAM:Double = js.native
        val TAI_VIET:Double = js.native
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
        val BASSA_VAH:Double = js.native
        val CAUCASIAN_ALBANIAN:Double = js.native
        val DUPLOYAN:Double = js.native
        val ELBASAN:Double = js.native
        val GRANTHA:Double = js.native
        val KHOJKI:Double = js.native
        val KHUDAWADI:Double = js.native
        val LINEAR_A:Double = js.native
        val MAHAJANI:Double = js.native
        val MANICHAEAN:Double = js.native
        val MENDE_KIKAKUI:Double = js.native
        val MODI:Double = js.native
        val MRO:Double = js.native
        val NABATAEAN:Double = js.native
        val OLD_NORTH_ARABIAN:Double = js.native
        val OLD_PERMIC:Double = js.native
        val PAHAWH_HMONG:Double = js.native
        val PALMYRENE:Double = js.native
        val PAU_CIN_HAU:Double = js.native
        val PSALTER_PAHLAVI:Double = js.native
        val SIDDHAM:Double = js.native
        val TIRHUTA:Double = js.native
        val WARANG_CITI:Double = js.native
        val AHOM:Double = js.native
        val ANATOLIAN_HIEROGLYPHS:Double = js.native
        val HATRAN:Double = js.native
        val MULTANI:Double = js.native
        val OLD_HUNGARIAN:Double = js.native
        val SIGNWRITING:Double = js.native
    }
    @js.native
    object UnicodeType extends js.Object {
        val CONTROL:Double = js.native
        val FORMAT:Double = js.native
        val UNASSIGNED:Double = js.native
        val PRIVATE_USE:Double = js.native
        val SURROGATE:Double = js.native
        val LOWERCASE_LETTER:Double = js.native
        val MODIFIER_LETTER:Double = js.native
        val OTHER_LETTER:Double = js.native
        val TITLECASE_LETTER:Double = js.native
        val UPPERCASE_LETTER:Double = js.native
        val SPACING_MARK:Double = js.native
        val ENCLOSING_MARK:Double = js.native
        val NON_SPACING_MARK:Double = js.native
        val DECIMAL_NUMBER:Double = js.native
        val LETTER_NUMBER:Double = js.native
        val OTHER_NUMBER:Double = js.native
        val CONNECT_PUNCTUATION:Double = js.native
        val DASH_PUNCTUATION:Double = js.native
        val CLOSE_PUNCTUATION:Double = js.native
        val FINAL_PUNCTUATION:Double = js.native
        val INITIAL_PUNCTUATION:Double = js.native
        val OTHER_PUNCTUATION:Double = js.native
        val OPEN_PUNCTUATION:Double = js.native
        val CURRENCY_SYMBOL:Double = js.native
        val MODIFIER_SYMBOL:Double = js.native
        val MATH_SYMBOL:Double = js.native
        val OTHER_SYMBOL:Double = js.native
        val LINE_SEPARATOR:Double = js.native
        val PARAGRAPH_SEPARATOR:Double = js.native
        val SPACE_SEPARATOR:Double = js.native
    }
    @js.native
    object UserDirectory extends js.Object {
        val DIRECTORY_DESKTOP:Double = js.native
        val DIRECTORY_DOCUMENTS:Double = js.native
        val DIRECTORY_DOWNLOAD:Double = js.native
        val DIRECTORY_MUSIC:Double = js.native
        val DIRECTORY_PICTURES:Double = js.native
        val DIRECTORY_PUBLIC_SHARE:Double = js.native
        val DIRECTORY_TEMPLATES:Double = js.native
        val DIRECTORY_VIDEOS:Double = js.native
        val N_DIRECTORIES:Double = js.native
    }
    @js.native
    object VariantClass extends js.Object {
        val BOOLEAN:Double = js.native
        val BYTE:Double = js.native
        val INT16:Double = js.native
        val UINT16:Double = js.native
        val INT32:Double = js.native
        val UINT32:Double = js.native
        val INT64:Double = js.native
        val UINT64:Double = js.native
        val HANDLE:Double = js.native
        val DOUBLE:Double = js.native
        val STRING:Double = js.native
        val OBJECT_PATH:Double = js.native
        val SIGNATURE:Double = js.native
        val VARIANT:Double = js.native
        val MAYBE:Double = js.native
        val ARRAY:Double = js.native
        val TUPLE:Double = js.native
        val DICT_ENTRY:Double = js.native
    }
    @js.native
    object VariantParseError extends js.Object {
        val FAILED:Double = js.native
        val BASIC_TYPE_EXPECTED:Double = js.native
        val CANNOT_INFER_TYPE:Double = js.native
        val DEFINITE_TYPE_EXPECTED:Double = js.native
        val INPUT_NOT_AT_END:Double = js.native
        val INVALID_CHARACTER:Double = js.native
        val INVALID_FORMAT_STRING:Double = js.native
        val INVALID_OBJECT_PATH:Double = js.native
        val INVALID_SIGNATURE:Double = js.native
        val INVALID_TYPE_STRING:Double = js.native
        val NO_COMMON_TYPE:Double = js.native
        val NUMBER_OUT_OF_RANGE:Double = js.native
        val NUMBER_TOO_BIG:Double = js.native
        val TYPE_ERROR:Double = js.native
        val UNEXPECTED_TOKEN:Double = js.native
        val UNKNOWN_KEYWORD:Double = js.native
        val UNTERMINATED_STRING_CONSTANT:Double = js.native
        val VALUE_EXPECTED:Double = js.native
    }
    @js.native
    object AsciiType extends js.Object {
        val ALNUM:Double = js.native
        val ALPHA:Double = js.native
        val CNTRL:Double = js.native
        val DIGIT:Double = js.native
        val GRAPH:Double = js.native
        val LOWER:Double = js.native
        val PRINT:Double = js.native
        val PUNCT:Double = js.native
        val SPACE:Double = js.native
        val UPPER:Double = js.native
        val XDIGIT:Double = js.native
    }
    @js.native
    object FileTest extends js.Object {
        val IS_REGULAR:Double = js.native
        val IS_SYMLINK:Double = js.native
        val IS_DIR:Double = js.native
        val IS_EXECUTABLE:Double = js.native
        val EXISTS:Double = js.native
    }
    @js.native
    object FormatSizeFlags extends js.Object {
        val DEFAULT:Double = js.native
        val LONG_FORMAT:Double = js.native
        val IEC_UNITS:Double = js.native
    }
    @js.native
    object HookFlagMask extends js.Object {
        val ACTIVE:Double = js.native
        val IN_CALL:Double = js.native
        val MASK:Double = js.native
    }
    @js.native
    object IOCondition extends js.Object {
        val IN:Double = js.native
        val OUT:Double = js.native
        val PRI:Double = js.native
        val ERR:Double = js.native
        val HUP:Double = js.native
        val NVAL:Double = js.native
    }
    @js.native
    object IOFlags extends js.Object {
        val APPEND:Double = js.native
        val NONBLOCK:Double = js.native
        val IS_READABLE:Double = js.native
        val IS_WRITABLE:Double = js.native
        val IS_WRITEABLE:Double = js.native
        val IS_SEEKABLE:Double = js.native
        val MASK:Double = js.native
        val GET_MASK:Double = js.native
        val SET_MASK:Double = js.native
    }
    @js.native
    object KeyFileFlags extends js.Object {
        val NONE:Double = js.native
        val KEEP_COMMENTS:Double = js.native
        val KEEP_TRANSLATIONS:Double = js.native
    }
    @js.native
    object LogLevelFlags extends js.Object {
        val FLAG_RECURSION:Double = js.native
        val FLAG_FATAL:Double = js.native
        val LEVEL_ERROR:Double = js.native
        val LEVEL_CRITICAL:Double = js.native
        val LEVEL_WARNING:Double = js.native
        val LEVEL_MESSAGE:Double = js.native
        val LEVEL_INFO:Double = js.native
        val LEVEL_DEBUG:Double = js.native
        val LEVEL_MASK:Double = js.native
    }
    @js.native
    object MarkupCollectType extends js.Object {
        val INVALID:Double = js.native
        val STRING:Double = js.native
        val STRDUP:Double = js.native
        val BOOLEAN:Double = js.native
        val TRISTATE:Double = js.native
        val OPTIONAL:Double = js.native
    }
    @js.native
    object MarkupParseFlags extends js.Object {
        val DO_NOT_USE_THIS_UNSUPPORTED_FLAG:Double = js.native
        val TREAT_CDATA_AS_TEXT:Double = js.native
        val PREFIX_ERROR_POSITION:Double = js.native
        val IGNORE_QUALIFIED:Double = js.native
    }
    @js.native
    object OptionFlags extends js.Object {
        val NONE:Double = js.native
        val HIDDEN:Double = js.native
        val IN_MAIN:Double = js.native
        val REVERSE:Double = js.native
        val NO_ARG:Double = js.native
        val FILENAME:Double = js.native
        val OPTIONAL_ARG:Double = js.native
        val NOALIAS:Double = js.native
    }
    @js.native
    object RegexCompileFlags extends js.Object {
        val CASELESS:Double = js.native
        val MULTILINE:Double = js.native
        val DOTALL:Double = js.native
        val EXTENDED:Double = js.native
        val ANCHORED:Double = js.native
        val DOLLAR_ENDONLY:Double = js.native
        val UNGREEDY:Double = js.native
        val RAW:Double = js.native
        val NO_AUTO_CAPTURE:Double = js.native
        val OPTIMIZE:Double = js.native
        val FIRSTLINE:Double = js.native
        val DUPNAMES:Double = js.native
        val NEWLINE_CR:Double = js.native
        val NEWLINE_LF:Double = js.native
        val NEWLINE_CRLF:Double = js.native
        val NEWLINE_ANYCRLF:Double = js.native
        val BSR_ANYCRLF:Double = js.native
        val JAVASCRIPT_COMPAT:Double = js.native
    }
    @js.native
    object RegexMatchFlags extends js.Object {
        val ANCHORED:Double = js.native
        val NOTBOL:Double = js.native
        val NOTEOL:Double = js.native
        val NOTEMPTY:Double = js.native
        val PARTIAL:Double = js.native
        val NEWLINE_CR:Double = js.native
        val NEWLINE_LF:Double = js.native
        val NEWLINE_CRLF:Double = js.native
        val NEWLINE_ANY:Double = js.native
        val NEWLINE_ANYCRLF:Double = js.native
        val BSR_ANYCRLF:Double = js.native
        val BSR_ANY:Double = js.native
        val PARTIAL_SOFT:Double = js.native
        val PARTIAL_HARD:Double = js.native
        val NOTEMPTY_ATSTART:Double = js.native
    }
    @js.native
    object SpawnFlags extends js.Object {
        val DEFAULT:Double = js.native
        val LEAVE_DESCRIPTORS_OPEN:Double = js.native
        val DO_NOT_REAP_CHILD:Double = js.native
        val SEARCH_PATH:Double = js.native
        val STDOUT_TO_DEV_NULL:Double = js.native
        val STDERR_TO_DEV_NULL:Double = js.native
        val CHILD_INHERITS_STDIN:Double = js.native
        val FILE_AND_ARGV_ZERO:Double = js.native
        val SEARCH_PATH_FROM_ENVP:Double = js.native
        val CLOEXEC_PIPES:Double = js.native
    }
    @js.native
    object TestSubprocessFlags extends js.Object {
        val STDIN:Double = js.native
        val STDOUT:Double = js.native
        val STDERR:Double = js.native
    }
    @js.native
    object TestTrapFlags extends js.Object {
        val SILENCE_STDOUT:Double = js.native
        val SILENCE_STDERR:Double = js.native
        val INHERIT_STDIN:Double = js.native
    }
    @js.native
    object TraverseFlags extends js.Object {
        val LEAVES:Double = js.native
        val NON_LEAVES:Double = js.native
        val ALL:Double = js.native
        val MASK:Double = js.native
        val LEAFS:Double = js.native
        val NON_LEAFS:Double = js.native
    }
}