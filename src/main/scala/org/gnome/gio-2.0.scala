/**
 * Gio.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Gio")
@js.native
object Gio extends js.Object {
    @js.native
    object File extends GObject.Object {
        def new_for_path(path: String): File = js.native
    }
    @js.native
    class File extends GObject.Object {
        def query_exists(obj:Any): Boolean = js.native
        def load_contents(obj:Any): Any = js.native
        def make_directory(obj:Any): Boolean = js.native
        def delete(obj:Any): Boolean = js.native
        def create(flags:Any, obj: Any): Any = js.native
        def get_basename(): String = js.native
        def get_path(): String = js.native
        def get_parent():File = js.native
    }

    val DESKTOP_APP_INFO_LOOKUP_EXTENSION_POINT_NAME:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_DELETE:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_EXECUTE:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_READ:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_RENAME:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_TRASH:String = js.native
    val FILE_ATTRIBUTE_ACCESS_CAN_WRITE:String = js.native
    val FILE_ATTRIBUTE_DOS_IS_ARCHIVE:String = js.native
    val FILE_ATTRIBUTE_DOS_IS_SYSTEM:String = js.native
    val FILE_ATTRIBUTE_ETAG_VALUE:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_FREE:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_READONLY:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_SIZE:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_TYPE:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_USED:String = js.native
    val FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW:String = js.native
    val FILE_ATTRIBUTE_GVFS_BACKEND:String = js.native
    val FILE_ATTRIBUTE_ID_FILE:String = js.native
    val FILE_ATTRIBUTE_ID_FILESYSTEM:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_EJECT:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_MOUNT:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_POLL:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_START:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_START_DEGRADED:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_STOP:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_CAN_UNMOUNT:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_HAL_UDI:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_IS_MEDIA_CHECK_AUTOMATIC:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_START_STOP_TYPE:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE:String = js.native
    val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE_FILE:String = js.native
    val FILE_ATTRIBUTE_OWNER_GROUP:String = js.native
    val FILE_ATTRIBUTE_OWNER_USER:String = js.native
    val FILE_ATTRIBUTE_OWNER_USER_REAL:String = js.native
    val FILE_ATTRIBUTE_PREVIEW_ICON:String = js.native
    val FILE_ATTRIBUTE_SELINUX_CONTEXT:String = js.native
    val FILE_ATTRIBUTE_STANDARD_ALLOCATED_SIZE:String = js.native
    val FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE:String = js.native
    val FILE_ATTRIBUTE_STANDARD_COPY_NAME:String = js.native
    val FILE_ATTRIBUTE_STANDARD_DESCRIPTION:String = js.native
    val FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME:String = js.native
    val FILE_ATTRIBUTE_STANDARD_EDIT_NAME:String = js.native
    val FILE_ATTRIBUTE_STANDARD_FAST_CONTENT_TYPE:String = js.native
    val FILE_ATTRIBUTE_STANDARD_ICON:String = js.native
    val FILE_ATTRIBUTE_STANDARD_IS_BACKUP:String = js.native
    val FILE_ATTRIBUTE_STANDARD_IS_HIDDEN:String = js.native
    val FILE_ATTRIBUTE_STANDARD_IS_SYMLINK:String = js.native
    val FILE_ATTRIBUTE_STANDARD_IS_VIRTUAL:String = js.native
    val FILE_ATTRIBUTE_STANDARD_IS_VOLATILE:String = js.native
    val FILE_ATTRIBUTE_STANDARD_NAME:String = js.native
    val FILE_ATTRIBUTE_STANDARD_SIZE:String = js.native
    val FILE_ATTRIBUTE_STANDARD_SORT_ORDER:String = js.native
    val FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON:String = js.native
    val FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET:String = js.native
    val FILE_ATTRIBUTE_STANDARD_TARGET_URI:String = js.native
    val FILE_ATTRIBUTE_STANDARD_TYPE:String = js.native
    val FILE_ATTRIBUTE_THUMBNAILING_FAILED:String = js.native
    val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID:String = js.native
    val FILE_ATTRIBUTE_THUMBNAIL_PATH:String = js.native
    val FILE_ATTRIBUTE_TIME_ACCESS:String = js.native
    val FILE_ATTRIBUTE_TIME_ACCESS_USEC:String = js.native
    val FILE_ATTRIBUTE_TIME_CHANGED:String = js.native
    val FILE_ATTRIBUTE_TIME_CHANGED_USEC:String = js.native
    val FILE_ATTRIBUTE_TIME_CREATED:String = js.native
    val FILE_ATTRIBUTE_TIME_CREATED_USEC:String = js.native
    val FILE_ATTRIBUTE_TIME_MODIFIED:String = js.native
    val FILE_ATTRIBUTE_TIME_MODIFIED_USEC:String = js.native
    val FILE_ATTRIBUTE_TRASH_DELETION_DATE:String = js.native
    val FILE_ATTRIBUTE_TRASH_ITEM_COUNT:String = js.native
    val FILE_ATTRIBUTE_TRASH_ORIG_PATH:String = js.native
    val FILE_ATTRIBUTE_UNIX_BLOCKS:String = js.native
    val FILE_ATTRIBUTE_UNIX_BLOCK_SIZE:String = js.native
    val FILE_ATTRIBUTE_UNIX_DEVICE:String = js.native
    val FILE_ATTRIBUTE_UNIX_GID:String = js.native
    val FILE_ATTRIBUTE_UNIX_INODE:String = js.native
    val FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT:String = js.native
    val FILE_ATTRIBUTE_UNIX_MODE:String = js.native
    val FILE_ATTRIBUTE_UNIX_NLINK:String = js.native
    val FILE_ATTRIBUTE_UNIX_RDEV:String = js.native
    val FILE_ATTRIBUTE_UNIX_UID:String = js.native
    val MENU_ATTRIBUTE_ACTION:String = js.native
    val MENU_ATTRIBUTE_ACTION_NAMESPACE:String = js.native
    val MENU_ATTRIBUTE_ICON:String = js.native
    val MENU_ATTRIBUTE_LABEL:String = js.native
    val MENU_ATTRIBUTE_TARGET:String = js.native
    val MENU_LINK_SECTION:String = js.native
    val MENU_LINK_SUBMENU:String = js.native
    val NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME:String = js.native
    val NETWORK_MONITOR_EXTENSION_POINT_NAME:String = js.native
    val PROXY_EXTENSION_POINT_NAME:String = js.native
    val PROXY_RESOLVER_EXTENSION_POINT_NAME:String = js.native
    val TLS_BACKEND_EXTENSION_POINT_NAME:String = js.native
    val TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT:String = js.native
    val TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER:String = js.native
    val VFS_EXTENSION_POINT_NAME:String = js.native
    val VOLUME_IDENTIFIER_KIND_CLASS:String = js.native
    val VOLUME_IDENTIFIER_KIND_HAL_UDI:String = js.native
    val VOLUME_IDENTIFIER_KIND_LABEL:String = js.native
    val VOLUME_IDENTIFIER_KIND_NFS_MOUNT:String = js.native
    val VOLUME_IDENTIFIER_KIND_UNIX_DEVICE:String = js.native
    val VOLUME_IDENTIFIER_KIND_UUID:String = js.native
    val VOLUME_MONITOR_EXTENSION_POINT_NAME:String = js.native
    def action_name_is_valid(action_name: String):Boolean = js.native
    def action_parse_detailed_name(detailed_name: String, action_name: String, target_value: Any):Boolean = js.native
    def action_print_detailed_name(action_name: String, target_value: Any):String = js.native
    def app_info_create_from_commandline(commandline: String, application_name: String, flags: Double):Any = js.native
    def app_info_get_all():Any = js.native
    def app_info_get_all_for_type(content_type0: String):Any = js.native
    def app_info_get_default_for_type(content_type0: String, must_support_uris: Boolean):Any = js.native
    def app_info_get_default_for_uri_scheme(uri_scheme: String):Any = js.native
    def app_info_get_fallback_for_type(content_type0: String):Any = js.native
    def app_info_get_recommended_for_type(content_type0: String):Any = js.native
    def app_info_launch_default_for_uri(uri: String, launch_context: AppLaunchContext):Boolean = js.native
    def app_info_reset_type_associations(content_type0: String):Unit = js.native
    def async_initable_newv_async(object_type0: Any, n_parameters: Any, parameters: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
    def bus_get(bus_type0: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
    def bus_get_finish(res: Any):DBusConnection = js.native
    def bus_get_sync(bus_type0: Double, cancellable: Cancellable):DBusConnection = js.native
    def bus_own_name(bus_type0: Double, name: String, flags: Double, bus_acquired_handler: Any, name_acquired_handler: Any, name_lost_handler: Any, user_data: Object, user_data_free_func: Any):Any = js.native
    def bus_own_name_on_connection(connection: DBusConnection, name: String, flags: Double, name_acquired_handler: Any, name_lost_handler: Any, user_data: Object, user_data_free_func: Any):Any = js.native
    def bus_own_name_on_connection_with_closures(connection: DBusConnection, name: String, flags: Double, name_acquired_closure: Any, name_lost_closure: Any):Any = js.native
    def bus_own_name_with_closures(bus_type0: Double, name: String, flags: Double, bus_acquired_closure: Any, name_acquired_closure: Any, name_lost_closure: Any):Any = js.native
    def bus_unown_name(owner_id: Any):Unit = js.native
    def bus_unwatch_name(watcher_id: Any):Unit = js.native
    def bus_watch_name(bus_type0: Double, name: String, flags: Double, name_appeared_handler: Any, name_vanished_handler: Any, user_data: Object, user_data_free_func: Any):Any = js.native
    def bus_watch_name_on_connection(connection: DBusConnection, name: String, flags: Double, name_appeared_handler: Any, name_vanished_handler: Any, user_data: Object, user_data_free_func: Any):Any = js.native
    def bus_watch_name_on_connection_with_closures(connection: DBusConnection, name: String, flags: Double, name_appeared_closure: Any, name_vanished_closure: Any):Any = js.native
    def bus_watch_name_with_closures(bus_type0: Double, name: String, flags: Double, name_appeared_closure: Any, name_vanished_closure: Any):Any = js.native
    def content_type_can_be_executable(type0: String):Boolean = js.native
    def content_type_equals(type1: String, type2: String):Boolean = js.native
    def content_type_from_mime_type(mime_type0: String):String = js.native
    def content_type_get_description(type0: String):String = js.native
    def content_type_get_generic_icon_name(type0: String):String = js.native
    def content_type_get_icon(type0: String):Any = js.native
    def content_type_get_mime_type(type0: String):String = js.native
    def content_type_get_symbolic_icon(type0: String):Any = js.native
    def content_type_guess(filename: String, data: js.Array[Any], data_size: Any, result_uncertain: Boolean):String = js.native
    def content_type_guess_for_tree(root: Any):js.Array[String] = js.native
    def content_type_is_a(type0: String, supertype0: String):Boolean = js.native
    def content_type_is_unknown(type0: String):Boolean = js.native
    def content_types_get_registered():Any = js.native
    def dbus_address_escape_value(string: String):String = js.native
    def dbus_address_get_for_bus_sync(bus_type0: Double, cancellable: Cancellable):String = js.native
    def dbus_address_get_stream(address: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
    def dbus_address_get_stream_finish(res: Any, out_guid: String):IOStream = js.native
    def dbus_address_get_stream_sync(address: String, out_guid: String, cancellable: Cancellable):IOStream = js.native
    def dbus_annotation_info_lookup(annotations: js.Array[Any], name: String):String = js.native
    def dbus_error_encode_gerror(error: Any):String = js.native
    def dbus_error_get_remote_error(error: Any):String = js.native
    def dbus_error_is_remote_error(error: Any):Boolean = js.native
    def dbus_error_new_for_dbus_error(dbus_error_name: String, dbus_error_message: String):Any = js.native
    def dbus_error_quark():Any = js.native
    def dbus_error_register_error(error_domain: Any, error_code: Any, dbus_error_name: String):Boolean = js.native
    def dbus_error_register_error_domain(error_domain_quark_name: String, quark_volatile: Any, entries: Any, num_entries: Any):Unit = js.native
    def dbus_error_strip_remote_error(error: Any):Boolean = js.native
    def dbus_error_unregister_error(error_domain: Any, error_code: Any, dbus_error_name: String):Boolean = js.native
    def dbus_generate_guid():String = js.native
    def dbus_gvalue_to_gvariant(gvalue: Any, type0: Any):Any = js.native
    def dbus_gvariant_to_gvalue(value: Any, out_gvalue: Any):Unit = js.native
    def dbus_is_address(string: String):Boolean = js.native
    def dbus_is_guid(string: String):Boolean = js.native
    def dbus_is_interface_name(string: String):Boolean = js.native
    def dbus_is_member_name(string: String):Boolean = js.native
    def dbus_is_name(string: String):Boolean = js.native
    def dbus_is_supported_address(string: String):Boolean = js.native
    def dbus_is_unique_name(string: String):Boolean = js.native
    def file_new_for_commandline_arg(arg: String):Any = js.native
    def file_new_for_commandline_arg_and_cwd(arg: String, cwd: String):Any = js.native
    def file_new_for_path(path: String):Any = js.native
    def file_new_for_uri(uri: String):Any = js.native
    def file_new_tmp(tmpl: Any, iostream: FileIOStream):Any = js.native
    def file_parse_name(parse_name: String):Any = js.native
    def icon_deserialize(value: Any):Any = js.native
    def icon_hash(icon: Object):Any = js.native
    def icon_new_for_string(str: String):Any = js.native
    def initable_newv(object_type0: Any, n_parameters: Any, parameters: js.Array[Any], cancellable: Cancellable):GObject.Object = js.native
    def io_error_from_errno(err_no: Any):Double = js.native
    def io_error_quark():Any = js.native
    def io_extension_point_implement(extension_point_name: String, type0: Any, extension_name: String, priority: Any):Any = js.native
    def io_extension_point_lookup(name: String):Any = js.native
    def io_extension_point_register(name: String):Any = js.native
    def io_modules_load_all_in_directory(dirname: String):Any = js.native
    def io_modules_load_all_in_directory_with_scope(dirname: String, scope: Any):Any = js.native
    def io_modules_scan_all_in_directory(dirname: String):Unit = js.native
    def io_modules_scan_all_in_directory_with_scope(dirname: String, scope: Any):Unit = js.native
    def io_scheduler_cancel_all_jobs():Unit = js.native
    def io_scheduler_push_job(job_func: Any, user_data: Object, notify: Any, io_priority: Any, cancellable: Cancellable):Unit = js.native
    def network_monitor_get_default():Any = js.native
    def networking_init():Unit = js.native
    def pollable_source_new(pollable_stream: GObject.Object):Any = js.native
    def pollable_source_new_full(pollable_stream: GObject.Object, child_source: Any, cancellable: Cancellable):Any = js.native
    def pollable_stream_read(stream: InputStream, buffer: js.Array[Any], count: Any, blocking: Boolean, cancellable: Cancellable):Any = js.native
    def pollable_stream_write(stream: OutputStream, buffer: js.Array[Any], count: Any, blocking: Boolean, cancellable: Cancellable):Any = js.native
    def pollable_stream_write_all(stream: OutputStream, buffer: js.Array[Any], count: Any, blocking: Boolean, bytes_written: Any, cancellable: Cancellable):Boolean = js.native
    def proxy_get_default_for_protocol(protocol: String):Any = js.native
    def proxy_resolver_get_default():Any = js.native
    def resolver_error_quark():Any = js.native
    def resource_error_quark():Any = js.native
    def resource_load(filename: Any):Any = js.native
    def resources_enumerate_children(path: String, lookup_flags: Double):js.Array[String] = js.native
    def resources_get_info(path: String, lookup_flags: Double, size: Any, flags: Any):Boolean = js.native
    def resources_lookup_data(path: String, lookup_flags: Double):Any = js.native
    def resources_open_stream(path: String, lookup_flags: Double):InputStream = js.native
    def resources_register(resource: Any):Unit = js.native
    def resources_unregister(resource: Any):Unit = js.native
    def settings_schema_source_get_default():Any = js.native
    def simple_async_report_error_in_idle(object0: GObject.Object, callback: Any, user_data: Object, domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
    def simple_async_report_gerror_in_idle(object0: GObject.Object, callback: Any, user_data: Object, error: Any):Unit = js.native
    def simple_async_report_take_gerror_in_idle(object0: GObject.Object, callback: Any, user_data: Object, error: Any):Unit = js.native
    def srv_target_list_sort(targets: Any):Any = js.native
    def tls_backend_get_default():Any = js.native
    def tls_client_connection_new(base_io_stream: IOStream, server_identity: Any):Any = js.native
    def tls_error_quark():Any = js.native
    def tls_file_database_new(anchors: String):Any = js.native
    def tls_server_connection_new(base_io_stream: IOStream, certificate: TlsCertificate):Any = js.native
    def unix_is_mount_path_system_internal(mount_path: String):Boolean = js.native
    def unix_mount_at(mount_path: String, time_read: Any):Any = js.native
    def unix_mount_compare(mount1: Any, mount2: Any):Any = js.native
    def unix_mount_free(mount_entry: Any):Unit = js.native
    def unix_mount_get_device_path(mount_entry: Any):String = js.native
    def unix_mount_get_fs_type(mount_entry: Any):String = js.native
    def unix_mount_get_mount_path(mount_entry: Any):String = js.native
    def unix_mount_guess_can_eject(mount_entry: Any):Boolean = js.native
    def unix_mount_guess_icon(mount_entry: Any):Any = js.native
    def unix_mount_guess_name(mount_entry: Any):String = js.native
    def unix_mount_guess_should_display(mount_entry: Any):Boolean = js.native
    def unix_mount_guess_symbolic_icon(mount_entry: Any):Any = js.native
    def unix_mount_is_readonly(mount_entry: Any):Boolean = js.native
    def unix_mount_is_system_internal(mount_entry: Any):Boolean = js.native
    def unix_mount_points_changed_since(time: Any):Boolean = js.native
    def unix_mount_points_get(time_read: Any):Any = js.native
    def unix_mounts_changed_since(time: Any):Boolean = js.native
    def unix_mounts_get(time_read: Any):Any = js.native
    @js.native
    object BusType extends js.Object {
        val STARTER:Double = js.native
        val NONE:Double = js.native
        val SYSTEM:Double = js.native
        val SESSION:Double = js.native
    }
    @js.native
    object ConverterResult extends js.Object {
        val ERROR:Double = js.native
        val CONVERTED:Double = js.native
        val FINISHED:Double = js.native
        val FLUSHED:Double = js.native
    }
    @js.native
    object CredentialsType extends js.Object {
        val INVALID:Double = js.native
        val LINUX_UCRED:Double = js.native
        val FREEBSD_CMSGCRED:Double = js.native
        val OPENBSD_SOCKPEERCRED:Double = js.native
        val SOLARIS_UCRED:Double = js.native
        val NETBSD_UNPCBID:Double = js.native
    }
    @js.native
    object DBusError extends js.Object {
        val FAILED:Double = js.native
        val NO_MEMORY:Double = js.native
        val SERVICE_UNKNOWN:Double = js.native
        val NAME_HAS_NO_OWNER:Double = js.native
        val NO_REPLY:Double = js.native
        val IO_ERROR:Double = js.native
        val BAD_ADDRESS:Double = js.native
        val NOT_SUPPORTED:Double = js.native
        val LIMITS_EXCEEDED:Double = js.native
        val ACCESS_DENIED:Double = js.native
        val AUTH_FAILED:Double = js.native
        val NO_SERVER:Double = js.native
        val TIMEOUT:Double = js.native
        val NO_NETWORK:Double = js.native
        val ADDRESS_IN_USE:Double = js.native
        val DISCONNECTED:Double = js.native
        val INVALID_ARGS:Double = js.native
        val FILE_NOT_FOUND:Double = js.native
        val FILE_EXISTS:Double = js.native
        val UNKNOWN_METHOD:Double = js.native
        val TIMED_OUT:Double = js.native
        val MATCH_RULE_NOT_FOUND:Double = js.native
        val MATCH_RULE_INVALID:Double = js.native
        val SPAWN_EXEC_FAILED:Double = js.native
        val SPAWN_FORK_FAILED:Double = js.native
        val SPAWN_CHILD_EXITED:Double = js.native
        val SPAWN_CHILD_SIGNALED:Double = js.native
        val SPAWN_FAILED:Double = js.native
        val SPAWN_SETUP_FAILED:Double = js.native
        val SPAWN_CONFIG_INVALID:Double = js.native
        val SPAWN_SERVICE_INVALID:Double = js.native
        val SPAWN_SERVICE_NOT_FOUND:Double = js.native
        val SPAWN_PERMISSIONS_INVALID:Double = js.native
        val SPAWN_FILE_INVALID:Double = js.native
        val SPAWN_NO_MEMORY:Double = js.native
        val UNIX_PROCESS_ID_UNKNOWN:Double = js.native
        val INVALID_SIGNATURE:Double = js.native
        val INVALID_FILE_CONTENT:Double = js.native
        val SELINUX_SECURITY_CONTEXT_UNKNOWN:Double = js.native
        val ADT_AUDIT_DATA_UNKNOWN:Double = js.native
        val OBJECT_PATH_IN_USE:Double = js.native
        val UNKNOWN_OBJECT:Double = js.native
        val UNKNOWN_INTERFACE:Double = js.native
        val UNKNOWN_PROPERTY:Double = js.native
        val PROPERTY_READ_ONLY:Double = js.native
    }
    @js.native
    object DBusMessageByteOrder extends js.Object {
        val BIG_ENDIAN:Double = js.native
        val LITTLE_ENDIAN:Double = js.native
    }
    @js.native
    object DBusMessageHeaderField extends js.Object {
        val INVALID:Double = js.native
        val PATH:Double = js.native
        val INTERFACE:Double = js.native
        val MEMBER:Double = js.native
        val ERROR_NAME:Double = js.native
        val REPLY_SERIAL:Double = js.native
        val DESTINATION:Double = js.native
        val SENDER:Double = js.native
        val SIGNATURE:Double = js.native
        val NUM_UNIX_FDS:Double = js.native
    }
    @js.native
    object DBusMessageType extends js.Object {
        val INVALID:Double = js.native
        val METHOD_CALL:Double = js.native
        val METHOD_RETURN:Double = js.native
        val ERROR:Double = js.native
        val SIGNAL:Double = js.native
    }
    @js.native
    object DataStreamByteOrder extends js.Object {
        val BIG_ENDIAN:Double = js.native
        val LITTLE_ENDIAN:Double = js.native
        val HOST_ENDIAN:Double = js.native
    }
    @js.native
    object DataStreamNewlineType extends js.Object {
        val LF:Double = js.native
        val CR:Double = js.native
        val CR_LF:Double = js.native
        val ANY:Double = js.native
    }
    @js.native
    object DriveStartStopType extends js.Object {
        val UNKNOWN:Double = js.native
        val SHUTDOWN:Double = js.native
        val NETWORK:Double = js.native
        val MULTIDISK:Double = js.native
        val PASSWORD:Double = js.native
    }
    @js.native
    object EmblemOrigin extends js.Object {
        val UNKNOWN:Double = js.native
        val DEVICE:Double = js.native
        val LIVEMETADATA:Double = js.native
        val TAG:Double = js.native
    }
    @js.native
    object FileAttributeStatus extends js.Object {
        val UNSET:Double = js.native
        val SET:Double = js.native
        val ERROR_SETTING:Double = js.native
    }
    @js.native
    object FileAttributeType extends js.Object {
        val INVALID:Double = js.native
        val STRING:Double = js.native
        val BYTE_STRING:Double = js.native
        val BOOLEAN:Double = js.native
        val UINT32:Double = js.native
        val INT32:Double = js.native
        val UINT64:Double = js.native
        val INT64:Double = js.native
        val OBJECT:Double = js.native
        val STRINGV:Double = js.native
    }
    @js.native
    object FileMonitorEvent extends js.Object {
        val CHANGED:Double = js.native
        val CHANGES_DONE_HINT:Double = js.native
        val DELETED:Double = js.native
        val CREATED:Double = js.native
        val ATTRIBUTE_CHANGED:Double = js.native
        val PRE_UNMOUNT:Double = js.native
        val UNMOUNTED:Double = js.native
        val MOVED:Double = js.native
        val RENAMED:Double = js.native
        val MOVED_IN:Double = js.native
        val MOVED_OUT:Double = js.native
    }
    @js.native
    object FileType extends js.Object {
        val UNKNOWN:Double = js.native
        val REGULAR:Double = js.native
        val DIRECTORY:Double = js.native
        val SYMBOLIC_LINK:Double = js.native
        val SPECIAL:Double = js.native
        val SHORTCUT:Double = js.native
        val MOUNTABLE:Double = js.native
    }
    @js.native
    object FilesystemPreviewType extends js.Object {
        val IF_ALWAYS:Double = js.native
        val IF_LOCAL:Double = js.native
        val NEVER:Double = js.native
    }
    @js.native
    object IOErrorEnum extends js.Object {
        val FAILED:Double = js.native
        val NOT_FOUND:Double = js.native
        val EXISTS:Double = js.native
        val IS_DIRECTORY:Double = js.native
        val NOT_DIRECTORY:Double = js.native
        val NOT_EMPTY:Double = js.native
        val NOT_REGULAR_FILE:Double = js.native
        val NOT_SYMBOLIC_LINK:Double = js.native
        val NOT_MOUNTABLE_FILE:Double = js.native
        val FILENAME_TOO_LONG:Double = js.native
        val INVALID_FILENAME:Double = js.native
        val TOO_MANY_LINKS:Double = js.native
        val NO_SPACE:Double = js.native
        val INVALID_ARGUMENT:Double = js.native
        val PERMISSION_DENIED:Double = js.native
        val NOT_SUPPORTED:Double = js.native
        val NOT_MOUNTED:Double = js.native
        val ALREADY_MOUNTED:Double = js.native
        val CLOSED:Double = js.native
        val CANCELLED:Double = js.native
        val PENDING:Double = js.native
        val READ_ONLY:Double = js.native
        val CANT_CREATE_BACKUP:Double = js.native
        val WRONG_ETAG:Double = js.native
        val TIMED_OUT:Double = js.native
        val WOULD_RECURSE:Double = js.native
        val BUSY:Double = js.native
        val WOULD_BLOCK:Double = js.native
        val HOST_NOT_FOUND:Double = js.native
        val WOULD_MERGE:Double = js.native
        val FAILED_HANDLED:Double = js.native
        val TOO_MANY_OPEN_FILES:Double = js.native
        val NOT_INITIALIZED:Double = js.native
        val ADDRESS_IN_USE:Double = js.native
        val PARTIAL_INPUT:Double = js.native
        val INVALID_DATA:Double = js.native
        val DBUS_ERROR:Double = js.native
        val HOST_UNREACHABLE:Double = js.native
        val NETWORK_UNREACHABLE:Double = js.native
        val CONNECTION_REFUSED:Double = js.native
        val PROXY_FAILED:Double = js.native
        val PROXY_AUTH_FAILED:Double = js.native
        val PROXY_NEED_AUTH:Double = js.native
        val PROXY_NOT_ALLOWED:Double = js.native
        val BROKEN_PIPE:Double = js.native
        val CONNECTION_CLOSED:Double = js.native
        val NOT_CONNECTED:Double = js.native
        val MESSAGE_TOO_LARGE:Double = js.native
    }
    @js.native
    object IOModuleScopeFlags extends js.Object {
        val NONE:Double = js.native
        val BLOCK_DUPLICATES:Double = js.native
    }
    @js.native
    object MountOperationResult extends js.Object {
        val HANDLED:Double = js.native
        val ABORTED:Double = js.native
        val UNHANDLED:Double = js.native
    }
    @js.native
    object NetworkConnectivity extends js.Object {
        val LOCAL:Double = js.native
        val LIMITED:Double = js.native
        val PORTAL:Double = js.native
        val FULL:Double = js.native
    }
    @js.native
    object NotificationPriority extends js.Object {
        val NORMAL:Double = js.native
        val LOW:Double = js.native
        val HIGH:Double = js.native
        val URGENT:Double = js.native
    }
    @js.native
    object PasswordSave extends js.Object {
        val NEVER:Double = js.native
        val FOR_SESSION:Double = js.native
        val PERMANENTLY:Double = js.native
    }
    @js.native
    object ResolverError extends js.Object {
        val NOT_FOUND:Double = js.native
        val TEMPORARY_FAILURE:Double = js.native
        val INTERNAL:Double = js.native
    }
    @js.native
    object ResolverRecordType extends js.Object {
        val SRV:Double = js.native
        val MX:Double = js.native
        val TXT:Double = js.native
        val SOA:Double = js.native
        val NS:Double = js.native
    }
    @js.native
    object ResourceError extends js.Object {
        val NOT_FOUND:Double = js.native
        val INTERNAL:Double = js.native
    }
    @js.native
    object SocketClientEvent extends js.Object {
        val RESOLVING:Double = js.native
        val RESOLVED:Double = js.native
        val CONNECTING:Double = js.native
        val CONNECTED:Double = js.native
        val PROXY_NEGOTIATING:Double = js.native
        val PROXY_NEGOTIATED:Double = js.native
        val TLS_HANDSHAKING:Double = js.native
        val TLS_HANDSHAKED:Double = js.native
        val COMPLETE:Double = js.native
    }
    @js.native
    object SocketFamily extends js.Object {
        val INVALID:Double = js.native
        val UNIX:Double = js.native
        val IPV4:Double = js.native
        val IPV6:Double = js.native
    }
    @js.native
    object SocketListenerEvent extends js.Object {
        val BINDING:Double = js.native
        val BOUND:Double = js.native
        val LISTENING:Double = js.native
        val LISTENED:Double = js.native
    }
    @js.native
    object SocketProtocol extends js.Object {
        val UNKNOWN:Double = js.native
        val DEFAULT:Double = js.native
        val TCP:Double = js.native
        val UDP:Double = js.native
        val SCTP:Double = js.native
    }
    @js.native
    object SocketType extends js.Object {
        val INVALID:Double = js.native
        val STREAM:Double = js.native
        val DATAGRAM:Double = js.native
        val SEQPACKET:Double = js.native
    }
    @js.native
    object TlsAuthenticationMode extends js.Object {
        val NONE:Double = js.native
        val REQUESTED:Double = js.native
        val REQUIRED:Double = js.native
    }
    @js.native
    object TlsCertificateRequestFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object TlsDatabaseLookupFlags extends js.Object {
        val NONE:Double = js.native
        val KEYPAIR:Double = js.native
    }
    @js.native
    object TlsError extends js.Object {
        val UNAVAILABLE:Double = js.native
        val MISC:Double = js.native
        val BAD_CERTIFICATE:Double = js.native
        val NOT_TLS:Double = js.native
        val HANDSHAKE:Double = js.native
        val CERTIFICATE_REQUIRED:Double = js.native
        val EOF:Double = js.native
    }
    @js.native
    object TlsInteractionResult extends js.Object {
        val UNHANDLED:Double = js.native
        val HANDLED:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object TlsRehandshakeMode extends js.Object {
        val NEVER:Double = js.native
        val SAFELY:Double = js.native
        val UNSAFELY:Double = js.native
    }
    @js.native
    object UnixSocketAddressType extends js.Object {
        val INVALID:Double = js.native
        val ANONYMOUS:Double = js.native
        val PATH:Double = js.native
        val ABSTRACT:Double = js.native
        val ABSTRACT_PADDED:Double = js.native
    }
    @js.native
    object ZlibCompressorFormat extends js.Object {
        val ZLIB:Double = js.native
        val GZIP:Double = js.native
        val RAW:Double = js.native
    }
    @js.native
    object AppInfoCreateFlags extends js.Object {
        val NONE:Double = js.native
        val NEEDS_TERMINAL:Double = js.native
        val SUPPORTS_URIS:Double = js.native
        val SUPPORTS_STARTUP_NOTIFICATION:Double = js.native
    }
    @js.native
    object ApplicationFlags extends js.Object {
        val FLAGS_NONE:Double = js.native
        val IS_SERVICE:Double = js.native
        val IS_LAUNCHER:Double = js.native
        val HANDLES_OPEN:Double = js.native
        val HANDLES_COMMAND_LINE:Double = js.native
        val SEND_ENVIRONMENT:Double = js.native
        val NON_UNIQUE:Double = js.native
    }
    @js.native
    object AskPasswordFlags extends js.Object {
        val NEED_PASSWORD:Double = js.native
        val NEED_USERNAME:Double = js.native
        val NEED_DOMAIN:Double = js.native
        val SAVING_SUPPORTED:Double = js.native
        val ANONYMOUS_SUPPORTED:Double = js.native
    }
    @js.native
    object BusNameOwnerFlags extends js.Object {
        val NONE:Double = js.native
        val ALLOW_REPLACEMENT:Double = js.native
        val REPLACE:Double = js.native
    }
    @js.native
    object BusNameWatcherFlags extends js.Object {
        val NONE:Double = js.native
        val AUTO_START:Double = js.native
    }
    @js.native
    object ConverterFlags extends js.Object {
        val NONE:Double = js.native
        val INPUT_AT_END:Double = js.native
        val FLUSH:Double = js.native
    }
    @js.native
    object DBusCallFlags extends js.Object {
        val NONE:Double = js.native
        val NO_AUTO_START:Double = js.native
        val ALLOW_INTERACTIVE_AUTHORIZATION:Double = js.native
    }
    @js.native
    object DBusCapabilityFlags extends js.Object {
        val NONE:Double = js.native
        val UNIX_FD_PASSING:Double = js.native
    }
    @js.native
    object DBusConnectionFlags extends js.Object {
        val NONE:Double = js.native
        val AUTHENTICATION_CLIENT:Double = js.native
        val AUTHENTICATION_SERVER:Double = js.native
        val AUTHENTICATION_ALLOW_ANONYMOUS:Double = js.native
        val MESSAGE_BUS_CONNECTION:Double = js.native
        val DELAY_MESSAGE_PROCESSING:Double = js.native
    }
    @js.native
    object DBusInterfaceSkeletonFlags extends js.Object {
        val NONE:Double = js.native
        val HANDLE_METHOD_INVOCATIONS_IN_THREAD:Double = js.native
    }
    @js.native
    object DBusMessageFlags extends js.Object {
        val NONE:Double = js.native
        val NO_REPLY_EXPECTED:Double = js.native
        val NO_AUTO_START:Double = js.native
        val ALLOW_INTERACTIVE_AUTHORIZATION:Double = js.native
    }
    @js.native
    object DBusObjectManagerClientFlags extends js.Object {
        val NONE:Double = js.native
        val DO_NOT_AUTO_START:Double = js.native
    }
    @js.native
    object DBusPropertyInfoFlags extends js.Object {
        val NONE:Double = js.native
        val READABLE:Double = js.native
        val WRITABLE:Double = js.native
    }
    @js.native
    object DBusProxyFlags extends js.Object {
        val NONE:Double = js.native
        val DO_NOT_LOAD_PROPERTIES:Double = js.native
        val DO_NOT_CONNECT_SIGNALS:Double = js.native
        val DO_NOT_AUTO_START:Double = js.native
        val GET_INVALIDATED_PROPERTIES:Double = js.native
        val DO_NOT_AUTO_START_AT_CONSTRUCTION:Double = js.native
    }
    @js.native
    object DBusSendMessageFlags extends js.Object {
        val NONE:Double = js.native
        val PRESERVE_SERIAL:Double = js.native
    }
    @js.native
    object DBusServerFlags extends js.Object {
        val NONE:Double = js.native
        val RUN_IN_THREAD:Double = js.native
        val AUTHENTICATION_ALLOW_ANONYMOUS:Double = js.native
    }
    @js.native
    object DBusSignalFlags extends js.Object {
        val NONE:Double = js.native
        val NO_MATCH_RULE:Double = js.native
        val MATCH_ARG0_NAMESPACE:Double = js.native
        val MATCH_ARG0_PATH:Double = js.native
    }
    @js.native
    object DBusSubtreeFlags extends js.Object {
        val NONE:Double = js.native
        val DISPATCH_TO_UNENUMERATED_NODES:Double = js.native
    }
    @js.native
    object DriveStartFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object FileAttributeInfoFlags extends js.Object {
        val NONE:Double = js.native
        val COPY_WITH_FILE:Double = js.native
        val COPY_WHEN_MOVED:Double = js.native
    }
    @js.native
    object FileCopyFlags extends js.Object {
        val NONE:Double = js.native
        val OVERWRITE:Double = js.native
        val BACKUP:Double = js.native
        val NOFOLLOW_SYMLINKS:Double = js.native
        val ALL_METADATA:Double = js.native
        val NO_FALLBACK_FOR_MOVE:Double = js.native
        val TARGET_DEFAULT_PERMS:Double = js.native
    }
    @js.native
    object FileCreateFlags extends js.Object {
        val NONE:Double = js.native
        val PRIVATE:Double = js.native
        val REPLACE_DESTINATION:Double = js.native
    }
    @js.native
    object FileMeasureFlags extends js.Object {
        val NONE:Double = js.native
        val REPORT_ANY_ERROR:Double = js.native
        val APPARENT_SIZE:Double = js.native
        val NO_XDEV:Double = js.native
    }
    @js.native
    object FileMonitorFlags extends js.Object {
        val NONE:Double = js.native
        val WATCH_MOUNTS:Double = js.native
        val SEND_MOVED:Double = js.native
        val WATCH_HARD_LINKS:Double = js.native
        val WATCH_MOVES:Double = js.native
    }
    @js.native
    object FileQueryInfoFlags extends js.Object {
        val NONE:Double = js.native
        val NOFOLLOW_SYMLINKS:Double = js.native
    }
    @js.native
    object IOStreamSpliceFlags extends js.Object {
        val NONE:Double = js.native
        val CLOSE_STREAM1:Double = js.native
        val CLOSE_STREAM2:Double = js.native
        val WAIT_FOR_BOTH:Double = js.native
    }
    @js.native
    object MountMountFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object MountUnmountFlags extends js.Object {
        val NONE:Double = js.native
        val FORCE:Double = js.native
    }
    @js.native
    object OutputStreamSpliceFlags extends js.Object {
        val NONE:Double = js.native
        val CLOSE_SOURCE:Double = js.native
        val CLOSE_TARGET:Double = js.native
    }
    @js.native
    object ResourceFlags extends js.Object {
        val NONE:Double = js.native
        val COMPRESSED:Double = js.native
    }
    @js.native
    object ResourceLookupFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object SettingsBindFlags extends js.Object {
        val DEFAULT:Double = js.native
        val GET:Double = js.native
        val SET:Double = js.native
        val NO_SENSITIVITY:Double = js.native
        val GET_NO_CHANGES:Double = js.native
        val INVERT_BOOLEAN:Double = js.native
    }
    @js.native
    object SocketMsgFlags extends js.Object {
        val NONE:Double = js.native
        val OOB:Double = js.native
        val PEEK:Double = js.native
        val DONTROUTE:Double = js.native
    }
    @js.native
    object SubprocessFlags extends js.Object {
        val NONE:Double = js.native
        val STDIN_PIPE:Double = js.native
        val STDIN_INHERIT:Double = js.native
        val STDOUT_PIPE:Double = js.native
        val STDOUT_SILENCE:Double = js.native
        val STDERR_PIPE:Double = js.native
        val STDERR_SILENCE:Double = js.native
        val STDERR_MERGE:Double = js.native
        val INHERIT_FDS:Double = js.native
    }
    @js.native
    object TestDBusFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object TlsCertificateFlags extends js.Object {
        val UNKNOWN_CA:Double = js.native
        val BAD_IDENTITY:Double = js.native
        val NOT_ACTIVATED:Double = js.native
        val EXPIRED:Double = js.native
        val REVOKED:Double = js.native
        val INSECURE:Double = js.native
        val GENERIC_ERROR:Double = js.native
        val VALIDATE_ALL:Double = js.native
    }
    @js.native
    object TlsDatabaseVerifyFlags extends js.Object {
        val NONE:Double = js.native
    }
    @js.native
    object TlsPasswordFlags extends js.Object {
        val NONE:Double = js.native
        val RETRY:Double = js.native
        val MANY_TRIES:Double = js.native
        val FINAL_TRY:Double = js.native
    }
    @js.native
    class AppInfoMonitor extends GObject.Object {
    }
    @js.native
    object AppInfoMonitor extends js.Object {
        def get():AppInfoMonitor = js.native
    }
    @js.native
    class AppLaunchContext extends GObject.Object {
        def this(config: js.Any) = this()
        def get_display(info: Any, files: Any):String = js.native
        def get_environment():js.Array[String] = js.native
        def get_startup_notify_id(info: Any, files: Any):String = js.native
        def launch_failed(startup_notify_id: String):Unit = js.native
        def setenv(variable: String, value: String):Unit = js.native
        def unsetenv(variable: String):Unit = js.native
    }
    @js.native
    class Application extends GObject.Object {
        def this(config: js.Any) = this()
        def activate():Unit = js.native
        def add_main_option(long_name: String, short_name: Any, flags: Double, arg: Double, description: String, arg_description: String):Unit = js.native
        def add_main_option_entries(entries: js.Array[Any]):Unit = js.native
        def add_option_group(group: Any):Unit = js.native
        def bind_busy_property(object0: GObject.Object, property: String):Unit = js.native
        def get_application_id():String = js.native
        def get_dbus_connection():DBusConnection = js.native
        def get_dbus_object_path():String = js.native
        def get_flags():Double = js.native
        def get_inactivity_timeout():Any = js.native
        def get_is_busy():Boolean = js.native
        def get_is_registered():Boolean = js.native
        def get_is_remote():Boolean = js.native
        def get_resource_base_path():String = js.native
        def hold():Unit = js.native
        def mark_busy():Unit = js.native
        def open(files: js.Array[Any], n_files: Any, hint: String):Unit = js.native
        def quit():Unit = js.native
        def register(cancellable: Cancellable):Boolean = js.native
        def release():Unit = js.native
        def run(args:Any):Unit = js.native
        def send_notification(id: String, notification: Notification):Unit = js.native
        def set_action_group(action_group: Any):Unit = js.native
        def set_application_id(application_id: String):Unit = js.native
        def set_default():Unit = js.native
        def set_flags(flags: Double):Unit = js.native
        def set_inactivity_timeout(inactivity_timeout: Any):Unit = js.native
        def set_resource_base_path(resource_path: String):Unit = js.native
        def unbind_busy_property(object0: GObject.Object, property: String):Unit = js.native
        def unmark_busy():Unit = js.native
        def withdraw_notification(id: String):Unit = js.native
    }
    @js.native
    object Application extends js.Object {
        def get_default():Application = js.native
        def id_is_valid(application_id: String):Boolean = js.native
    }
    @js.native
    class ApplicationCommandLine extends GObject.Object {
        def create_file_for_arg(arg: String):Any = js.native
        def get_arguments(argc: Any):js.Array[String] = js.native
        def get_cwd():String = js.native
        def get_environ():js.Array[String] = js.native
        def get_exit_status():Any = js.native
        def get_is_remote():Boolean = js.native
        def get_options_dict():Any = js.native
        def get_platform_data():Any = js.native
        def get_stdin():InputStream = js.native
        def getenv(name: String):String = js.native
        def print(format: String, rest:Any*):Unit = js.native
        def printerr(format: String, rest:Any*):Unit = js.native
        def set_exit_status(exit_status: Any):Unit = js.native
    }
    @js.native
    class BufferedInputStream extends FilterInputStream {
        def this(config: js.Any) = this()
        def fill(count: Any, cancellable: Cancellable):Any = js.native
        def fill_async(count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def fill_finish(result: Any):Any = js.native
        def get_available():Any = js.native
        def get_buffer_size():Any = js.native
        def peek(buffer: js.Array[Any], offset: Any, count: Any):Any = js.native
        def peek_buffer(count: Any):js.Array[Any] = js.native
        def read_byte(cancellable: Cancellable):Any = js.native
        def set_buffer_size(size: Any):Unit = js.native
    }
    @js.native
    object BufferedInputStream extends js.Object {
        def new_sized(base_stream: InputStream, size: Any):BufferedInputStream = js.native
    }
    @js.native
    class BufferedOutputStream extends FilterOutputStream {
        def this(config: js.Any) = this()
        def get_auto_grow():Boolean = js.native
        def get_buffer_size():Any = js.native
        def set_auto_grow(auto_grow: Boolean):Unit = js.native
        def set_buffer_size(size: Any):Unit = js.native
    }
    @js.native
    object BufferedOutputStream extends js.Object {
        def new_sized(base_stream: OutputStream, size: Any):BufferedOutputStream = js.native
    }
    @js.native
    class BytesIcon extends GObject.Object {
        def this(config: js.Any) = this()
        def get_bytes():Any = js.native
    }
    @js.native
    class Cancellable extends GObject.Object {
        def this(config: js.Any) = this()
        def cancel():Unit = js.native
        def connect(callback: Any, data: Object, data_destroy_func: Any):Any = js.native
        def disconnect(handler_id: Any):Unit = js.native
        def get_fd():Any = js.native
        def is_cancelled():Boolean = js.native
        def make_pollfd(pollfd: Any):Boolean = js.native
        def pop_current():Unit = js.native
        def push_current():Unit = js.native
        def release_fd():Unit = js.native
        def reset():Unit = js.native
        def set_error_if_cancelled():Boolean = js.native
        def source_new():Any = js.native
    }
    @js.native
    object Cancellable extends js.Object {
        def get_current():Cancellable = js.native
    }
    @js.native
    class CharsetConverter extends GObject.Object {
        def this(config: js.Any) = this()
        def get_num_fallbacks():Any = js.native
        def get_use_fallback():Boolean = js.native
        def set_use_fallback(use_fallback: Boolean):Unit = js.native
    }
    @js.native
    class ConverterInputStream extends FilterInputStream {
        def this(config: js.Any) = this()
        def get_converter():Any = js.native
    }
    @js.native
    class ConverterOutputStream extends FilterOutputStream {
        def this(config: js.Any) = this()
        def get_converter():Any = js.native
    }
    @js.native
    class Credentials extends GObject.Object {
        def this(config: js.Any) = this()
        def get_native(native_type0: Double):Object = js.native
        def get_unix_pid():Any = js.native
        def get_unix_user():Any = js.native
        def is_same_user(other_credentials: Credentials):Boolean = js.native
        def set_native(native_type0: Double, native: Object):Unit = js.native
        def set_unix_user(uid: Any):Boolean = js.native
        def to_string():String = js.native
    }
    @js.native
    class DBusActionGroup extends GObject.Object {
    }
    @js.native
    object DBusActionGroup extends js.Object {
        def get(connection: DBusConnection, bus_name: String, object_path: String):DBusActionGroup = js.native
    }
    @js.native
    class DBusAuthObserver extends GObject.Object {
        def this(config: js.Any) = this()
        def allow_mechanism(mechanism: String):Boolean = js.native
        def authorize_authenticated_peer(stream: IOStream, credentials: Credentials):Boolean = js.native
    }
    @js.native
    class DBusConnection extends GObject.Object {
        def this(config: js.Any) = this()
        def add_filter(filter_function: Any, user_data: Object, user_data_free_func: Any):Any = js.native
        def call(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: Any, reply_type0: Any, flags: Double, timeout_msec: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def call_finish(res: Any):Any = js.native
        def call_sync(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: Any, reply_type0: Any, flags: Double, timeout_msec: Any, cancellable: Cancellable):Any = js.native
        def call_with_unix_fd_list(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: Any, reply_type0: Any, flags: Double, timeout_msec: Any, fd_list: UnixFDList, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def call_with_unix_fd_list_finish(out_fd_list: UnixFDList, res: Any):Any = js.native
        def call_with_unix_fd_list_sync(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: Any, reply_type0: Any, flags: Double, timeout_msec: Any, fd_list: UnixFDList, out_fd_list: UnixFDList, cancellable: Cancellable):Any = js.native
        def close(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def close_finish(res: Any):Boolean = js.native
        def close_sync(cancellable: Cancellable):Boolean = js.native
        def emit_signal(destination_bus_name: String, object_path: String, interface_name: String, signal_name: String, parameters: Any):Boolean = js.native
        def export_action_group(object_path: String, action_group: Any):Any = js.native
        def export_menu_model(object_path: String, menu: MenuModel):Any = js.native
        def flush(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def flush_finish(res: Any):Boolean = js.native
        def flush_sync(cancellable: Cancellable):Boolean = js.native
        def get_capabilities():Double = js.native
        def get_exit_on_close():Boolean = js.native
        def get_guid():String = js.native
        def get_last_serial():Any = js.native
        def get_peer_credentials():Credentials = js.native
        def get_stream():IOStream = js.native
        def get_unique_name():String = js.native
        def is_closed():Boolean = js.native
        def register_object(object_path: String, interface_info: Any, vtable: Any, user_data: Object, user_data_free_func: Any):Any = js.native
        def register_object_with_closures(object_path: String, interface_info: Any, method_call_closure: Any, get_property_closure: Any, set_property_closure: Any):Any = js.native
        def register_subtree(object_path: String, vtable: Any, flags: Double, user_data: Object, user_data_free_func: Any):Any = js.native
        def remove_filter(filter_id: Any):Unit = js.native
        def send_message(message: DBusMessage, flags: Double, out_serial: Any):Boolean = js.native
        def send_message_with_reply(message: DBusMessage, flags: Double, timeout_msec: Any, out_serial: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def send_message_with_reply_finish(res: Any):DBusMessage = js.native
        def send_message_with_reply_sync(message: DBusMessage, flags: Double, timeout_msec: Any, out_serial: Any, cancellable: Cancellable):DBusMessage = js.native
        def set_exit_on_close(exit_on_close: Boolean):Unit = js.native
        def signal_subscribe(sender: String, interface_name: String, member: String, object_path: String, arg0: String, flags: Double, callback: Any, user_data: Object, user_data_free_func: Any):Any = js.native
        def signal_unsubscribe(subscription_id: Any):Unit = js.native
        def start_message_processing():Unit = js.native
        def unexport_action_group(export_id: Any):Unit = js.native
        def unexport_menu_model(export_id: Any):Unit = js.native
        def unregister_object(registration_id: Any):Boolean = js.native
        def unregister_subtree(registration_id: Any):Boolean = js.native
    }
    @js.native
    object DBusConnection extends js.Object {
        def new_for_address(address: String, flags: Double, observer: DBusAuthObserver, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def new_finish(res: Any):DBusConnection = js.native
        def new_for_address_finish(res: Any):DBusConnection = js.native
        def new_for_address_sync(address: String, flags: Double, observer: DBusAuthObserver, cancellable: Cancellable):DBusConnection = js.native
        def new_sync(stream: IOStream, guid: String, flags: Double, observer: DBusAuthObserver, cancellable: Cancellable):DBusConnection = js.native
    }
    @js.native
    class DBusInterfaceSkeleton extends GObject.Object {
        def export(connection: DBusConnection, object_path: String):Boolean = js.native
        def flush():Unit = js.native
        def get_connection():DBusConnection = js.native
        def get_connections():Any = js.native
        def get_flags():Double = js.native
        def get_info():Any = js.native
        def get_object_path():String = js.native
        def get_properties():Any = js.native
        def get_vtable():Any = js.native
        def has_connection(connection: DBusConnection):Boolean = js.native
        def set_flags(flags: Double):Unit = js.native
        def unexport():Unit = js.native
        def unexport_from_connection(connection: DBusConnection):Unit = js.native
    }
    @js.native
    class DBusMenuModel extends MenuModel {
    }
    @js.native
    object DBusMenuModel extends js.Object {
        def get(connection: DBusConnection, bus_name: String, object_path: String):DBusMenuModel = js.native
    }
    @js.native
    class DBusMessage extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():DBusMessage = js.native
        def get_arg0():String = js.native
        def get_body():Any = js.native
        def get_byte_order():Double = js.native
        def get_destination():String = js.native
        def get_error_name():String = js.native
        def get_flags():Double = js.native
        def get_header(header_field: Double):Any = js.native
        def get_header_fields():js.Array[Any] = js.native
        def get_interface():String = js.native
        def get_locked():Boolean = js.native
        def get_member():String = js.native
        def get_message_type():Double = js.native
        def get_num_unix_fds():Any = js.native
        def get_path():String = js.native
        def get_reply_serial():Any = js.native
        def get_sender():String = js.native
        def get_serial():Any = js.native
        def get_signature():String = js.native
        def get_unix_fd_list():UnixFDList = js.native
        def lock():Unit = js.native
        def new_method_error(error_name: String, error_message_format: String, rest:Any*):DBusMessage = js.native
        def new_method_error_literal(error_name: String, error_message: String):DBusMessage = js.native
        def new_method_error_valist(error_name: String, error_message_format: String, var_args: Any):DBusMessage = js.native
        def new_method_reply():DBusMessage = js.native
        def print(indent: Any):String = js.native
        def set_body(body: Any):Unit = js.native
        def set_byte_order(byte_order: Double):Unit = js.native
        def set_destination(value: String):Unit = js.native
        def set_error_name(value: String):Unit = js.native
        def set_flags(flags: Double):Unit = js.native
        def set_header(header_field: Double, value: Any):Unit = js.native
        def set_interface(value: String):Unit = js.native
        def set_member(value: String):Unit = js.native
        def set_message_type(type0: Double):Unit = js.native
        def set_num_unix_fds(value: Any):Unit = js.native
        def set_path(value: String):Unit = js.native
        def set_reply_serial(value: Any):Unit = js.native
        def set_sender(value: String):Unit = js.native
        def set_serial(serial: Any):Unit = js.native
        def set_signature(value: String):Unit = js.native
        def set_unix_fd_list(fd_list: UnixFDList):Unit = js.native
        def to_blob(out_size: Any, capabilities: Double):js.Array[Any] = js.native
        def to_gerror():Boolean = js.native
    }
    @js.native
    object DBusMessage extends js.Object {
        def bytes_needed(blob: js.Array[Any], blob_len: Any):Any = js.native
        def new_from_blob(blob: js.Array[Any], blob_len: Any, capabilities: Double):DBusMessage = js.native
        def new_method_call(name: String, path: String, interface0: String, method: String):DBusMessage = js.native
        def new_signal(path: String, interface0: String, signal: String):DBusMessage = js.native
    }
    @js.native
    class DBusMethodInvocation extends GObject.Object {
        def get_connection():DBusConnection = js.native
        def get_interface_name():String = js.native
        def get_message():DBusMessage = js.native
        def get_method_info():Any = js.native
        def get_method_name():String = js.native
        def get_object_path():String = js.native
        def get_parameters():Any = js.native
        def get_property_info():Any = js.native
        def get_sender():String = js.native
        def get_user_data():Object = js.native
        def return_dbus_error(error_name: String, error_message: String):Unit = js.native
        def return_error(domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
        def return_error_literal(domain: Any, code: Any, message: String):Unit = js.native
        def return_error_valist(domain: Any, code: Any, format: String, var_args: Any):Unit = js.native
        def return_gerror(error: Any):Unit = js.native
        def return_value(parameters: Any):Unit = js.native
        def return_value_with_unix_fd_list(parameters: Any, fd_list: UnixFDList):Unit = js.native
        def take_error(error: Any):Unit = js.native
    }
    @js.native
    class DBusObjectManagerClient extends GObject.Object {
        def this(config: js.Any) = this()
        def get_connection():DBusConnection = js.native
        def get_flags():Double = js.native
        def get_name():String = js.native
        def get_name_owner():String = js.native
    }
    @js.native
    object DBusObjectManagerClient extends js.Object {
        def new_for_bus(bus_type0: Double, flags: Double, name: String, object_path: String, get_proxy_type_func: Any, get_proxy_type_user_data: Object, get_proxy_type_destroy_notify: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def new_finish(res: Any):DBusObjectManagerClient = js.native
        def new_for_bus_finish(res: Any):DBusObjectManagerClient = js.native
        def new_for_bus_sync(bus_type0: Double, flags: Double, name: String, object_path: String, get_proxy_type_func: Any, get_proxy_type_user_data: Object, get_proxy_type_destroy_notify: Any, cancellable: Cancellable):DBusObjectManagerClient = js.native
        def new_sync(connection: DBusConnection, flags: Double, name: String, object_path: String, get_proxy_type_func: Any, get_proxy_type_user_data: Object, get_proxy_type_destroy_notify: Any, cancellable: Cancellable):DBusObjectManagerClient = js.native
    }
    @js.native
    class DBusObjectManagerServer extends GObject.Object {
        def this(config: js.Any) = this()
        def export(object0: DBusObjectSkeleton):Unit = js.native
        def export_uniquely(object0: DBusObjectSkeleton):Unit = js.native
        def get_connection():DBusConnection = js.native
        def is_exported(object0: DBusObjectSkeleton):Boolean = js.native
        def set_connection(connection: DBusConnection):Unit = js.native
        def unexport(object_path: String):Boolean = js.native
    }
    @js.native
    class DBusObjectProxy extends GObject.Object {
        def this(config: js.Any) = this()
        def get_connection():DBusConnection = js.native
    }
    @js.native
    class DBusObjectSkeleton extends GObject.Object {
        def this(config: js.Any) = this()
        def add_interface(interface0: DBusInterfaceSkeleton):Unit = js.native
        def flush():Unit = js.native
        def remove_interface(interface0: DBusInterfaceSkeleton):Unit = js.native
        def remove_interface_by_name(interface_name: String):Unit = js.native
        def set_object_path(object_path: String):Unit = js.native
    }
    @js.native
    class DBusProxy extends GObject.Object {
        def this(config: js.Any) = this()
        def call(method_name: String, parameters: Any, flags: Double, timeout_msec: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def call_finish(res: Any):Any = js.native
        def call_sync(method_name: String, parameters: Any, flags: Double, timeout_msec: Any, cancellable: Cancellable):Any = js.native
        def call_with_unix_fd_list(method_name: String, parameters: Any, flags: Double, timeout_msec: Any, fd_list: UnixFDList, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def call_with_unix_fd_list_finish(out_fd_list: UnixFDList, res: Any):Any = js.native
        def call_with_unix_fd_list_sync(method_name: String, parameters: Any, flags: Double, timeout_msec: Any, fd_list: UnixFDList, out_fd_list: UnixFDList, cancellable: Cancellable):Any = js.native
        def get_cached_property(property_name: String):Any = js.native
        def get_cached_property_names():js.Array[String] = js.native
        def get_connection():DBusConnection = js.native
        def get_default_timeout():Any = js.native
        def get_flags():Double = js.native
        def get_interface_info():Any = js.native
        def get_interface_name():String = js.native
        def get_name():String = js.native
        def get_name_owner():String = js.native
        def get_object_path():String = js.native
        def set_cached_property(property_name: String, value: Any):Unit = js.native
        def set_default_timeout(timeout_msec: Any):Unit = js.native
        def set_interface_info(info: Any):Unit = js.native
    }
    @js.native
    object DBusProxy extends js.Object {
        def new_for_bus(bus_type0: Double, flags: Double, info: Any, name: String, object_path: String, interface_name: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def new_finish(res: Any):DBusProxy = js.native
        def new_for_bus_finish(res: Any):DBusProxy = js.native
        def new_for_bus_sync(bus_type0: Double, flags: Double, info: Any, name: String, object_path: String, interface_name: String, cancellable: Cancellable):DBusProxy = js.native
        def new_sync(connection: DBusConnection, flags: Double, info: Any, name: String, object_path: String, interface_name: String, cancellable: Cancellable):DBusProxy = js.native
    }
    @js.native
    class DBusServer extends GObject.Object {
        def this(config: js.Any) = this()
        def get_client_address():String = js.native
        def get_flags():Double = js.native
        def get_guid():String = js.native
        def is_active():Boolean = js.native
        def start():Unit = js.native
        def stop():Unit = js.native
    }
    @js.native
    object DBusServer extends js.Object {
        def new_sync(address: String, flags: Double, guid: String, observer: DBusAuthObserver, cancellable: Cancellable):DBusServer = js.native
    }
    @js.native
    class DataInputStream extends BufferedInputStream {
        def this(config: js.Any) = this()
        def get_byte_order():Double = js.native
        def get_newline_type():Double = js.native
        override def read_byte(cancellable: Cancellable):Any = js.native
        def read_int16(cancellable: Cancellable):Any = js.native
        def read_int32(cancellable: Cancellable):Any = js.native
        def read_int64(cancellable: Cancellable):Any = js.native
        def read_line(length: Any, cancellable: Cancellable):js.Array[Any] = js.native
        def read_line_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_line_finish(result: Any, length: Any):js.Array[Any] = js.native
        def read_line_finish_utf8(result: Any, length: Any):String = js.native
        def read_line_utf8(length: Any, cancellable: Cancellable):String = js.native
        def read_uint16(cancellable: Cancellable):Any = js.native
        def read_uint32(cancellable: Cancellable):Any = js.native
        def read_uint64(cancellable: Cancellable):Any = js.native
        def read_until(stop_chars: String, length: Any, cancellable: Cancellable):String = js.native
        def read_until_async(stop_chars: String, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_until_finish(result: Any, length: Any):String = js.native
        def read_upto(stop_chars: String, stop_chars_len: Any, length: Any, cancellable: Cancellable):String = js.native
        def read_upto_async(stop_chars: String, stop_chars_len: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_upto_finish(result: Any, length: Any):String = js.native
        def set_byte_order(order: Double):Unit = js.native
        def set_newline_type(type0: Double):Unit = js.native
    }
    @js.native
    class DataOutputStream extends FilterOutputStream {
        def this(config: js.Any) = this()
        def get_byte_order():Double = js.native
        def put_byte(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_int16(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_int32(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_int64(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_string(str: String, cancellable: Cancellable):Boolean = js.native
        def put_uint16(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_uint32(data: Any, cancellable: Cancellable):Boolean = js.native
        def put_uint64(data: Any, cancellable: Cancellable):Boolean = js.native
        def set_byte_order(order: Double):Unit = js.native
    }
    @js.native
    class DesktopAppInfo extends GObject.Object {
        def this(config: js.Any) = this()
        def get_action_name(action_name: String):String = js.native
        def get_Boolean(key: String):Boolean = js.native
        def get_categories():String = js.native
        def get_filename():String = js.native
        def get_generic_name():String = js.native
        def get_is_hidden():Boolean = js.native
        def get_keywords():js.Array[String] = js.native
        def get_nodisplay():Boolean = js.native
        def get_show_in(desktop_env: String):Boolean = js.native
        def get_startup_wm_class():String = js.native
        def get_string(key: String):String = js.native
        def has_key(key: String):Boolean = js.native
        def launch_action(action_name: String, launch_context: AppLaunchContext):Unit = js.native
        def launch_uris_as_manager(uris: Any, launch_context: AppLaunchContext, spawn_flags: Double, user_setup: Any, user_setup_data: Object, pid_callback: Any, pid_callback_data: Object):Boolean = js.native
        def list_actions():js.Array[String] = js.native
    }
    @js.native
    object DesktopAppInfo extends js.Object {
        def get_implementations(interface: String):Any = js.native
        def search(search_string: String):js.Array[Any] = js.native
        def set_desktop_env(desktop_env: String):Unit = js.native
        def new_from_filename(filename: String):DesktopAppInfo = js.native
        def new_from_keyfile(key_file: Any):DesktopAppInfo = js.native
    }
    @js.native
    class Emblem extends GObject.Object {
        def this(config: js.Any) = this()
        def get_icon():Any = js.native
        def get_origin():Double = js.native
    }
    @js.native
    object Emblem extends js.Object {
        def new_with_origin(icon: Any, origin: Double):Emblem = js.native
    }
    @js.native
    class EmblemedIcon extends GObject.Object {
        def this(config: js.Any) = this()
        def add_emblem(emblem: Emblem):Unit = js.native
        def clear_emblems():Unit = js.native
        def get_emblems():Any = js.native
        def get_icon():Any = js.native
    }
    @js.native
    class FileEnumerator extends GObject.Object {
        def close(cancellable: Cancellable):Boolean = js.native
        def close_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def close_finish(result: Any):Boolean = js.native
        def get_child(info: FileInfo):Any = js.native
        def get_container():Any = js.native
        def has_pending():Boolean = js.native
        def is_closed():Boolean = js.native
        def iterate(out_info: FileInfo, out_child: Any, cancellable: Cancellable):Boolean = js.native
        def next_file(cancellable: Cancellable):FileInfo = js.native
        def next_files_async(num_files: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def next_files_finish(result: Any):Any = js.native
        def set_pending(pending: Boolean):Unit = js.native
    }
    @js.native
    class FileIOStream extends IOStream {
        def get_etag():String = js.native
        def query_info(attributes: String, cancellable: Cancellable):FileInfo = js.native
        def query_info_async(attributes: String, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def query_info_finish(result: Any):FileInfo = js.native
    }
    @js.native
    class FileIcon extends GObject.Object {
        def this(config: js.Any) = this()
        def get_file():Any = js.native
    }
    @js.native
    class FileInfo extends GObject.Object {
        def this(config: js.Any) = this()
        def clear_status():Unit = js.native
        def copy_into(dest_info: FileInfo):Unit = js.native
        def dup():FileInfo = js.native
        def get_attribute_as_string(attribute: String):String = js.native
        def get_attribute_Boolean(attribute: String):Boolean = js.native
        def get_attribute_byte_string(attribute: String):String = js.native
        def get_attribute_data(attribute: String, type0: Double, value_pp: Object, status: Double):Boolean = js.native
        def get_attribute_int32(attribute: String):Any = js.native
        def get_attribute_int64(attribute: String):Any = js.native
        def get_attribute_object(attribute: String):GObject.Object = js.native
        def get_attribute_status(attribute: String):Double = js.native
        def get_attribute_string(attribute: String):String = js.native
        def get_attribute_stringv(attribute: String):js.Array[String] = js.native
        def get_attribute_type(attribute: String):Double = js.native
        def get_attribute_uint32(attribute: String):Any = js.native
        def get_attribute_uint64(attribute: String):Any = js.native
        def get_content_type():String = js.native
        def get_deletion_date():Any = js.native
        def get_display_name():String = js.native
        def get_edit_name():String = js.native
        def get_etag():String = js.native
        def get_file_type():Double = js.native
        def get_icon():Any = js.native
        def get_is_backup():Boolean = js.native
        def get_is_hidden():Boolean = js.native
        def get_is_symlink():Boolean = js.native
        def get_modification_time(result: Any):Unit = js.native
        def get_name():String = js.native
        def get_size():Any = js.native
        def get_sort_order():Any = js.native
        def get_symbolic_icon():Any = js.native
        def get_symlink_target():String = js.native
        def has_attribute(attribute: String):Boolean = js.native
        def has_namespace(name_space: String):Boolean = js.native
        def list_attributes(name_space: String):js.Array[String] = js.native
        def remove_attribute(attribute: String):Unit = js.native
        def set_attribute(attribute: String, type0: Double, value_p: Object):Unit = js.native
        def set_attribute_Boolean(attribute: String, attr_value: Boolean):Unit = js.native
        def set_attribute_byte_string(attribute: String, attr_value: String):Unit = js.native
        def set_attribute_int32(attribute: String, attr_value: Any):Unit = js.native
        def set_attribute_int64(attribute: String, attr_value: Any):Unit = js.native
        def set_attribute_mask(mask: Any):Unit = js.native
        def set_attribute_object(attribute: String, attr_value: GObject.Object):Unit = js.native
        def set_attribute_status(attribute: String, status: Double):Boolean = js.native
        def set_attribute_string(attribute: String, attr_value: String):Unit = js.native
        def set_attribute_stringv(attribute: String, attr_value: js.Array[String]):Unit = js.native
        def set_attribute_uint32(attribute: String, attr_value: Any):Unit = js.native
        def set_attribute_uint64(attribute: String, attr_value: Any):Unit = js.native
        def set_content_type(content_type0: String):Unit = js.native
        def set_display_name(display_name: String):Unit = js.native
        def set_edit_name(edit_name: String):Unit = js.native
        def set_file_type(type0: Double):Unit = js.native
        def set_icon(icon: Any):Unit = js.native
        def set_is_hidden(is_hidden: Boolean):Unit = js.native
        def set_is_symlink(is_symlink: Boolean):Unit = js.native
        def set_modification_time(mtime: Any):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_size(size: Any):Unit = js.native
        def set_sort_order(sort_order: Any):Unit = js.native
        def set_symbolic_icon(icon: Any):Unit = js.native
        def set_symlink_target(symlink_target: String):Unit = js.native
        def unset_attribute_mask():Unit = js.native
    }
    @js.native
    class FileInputStream extends InputStream {
        def query_info(attributes: String, cancellable: Cancellable):FileInfo = js.native
        def query_info_async(attributes: String, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def query_info_finish(result: Any):FileInfo = js.native
    }
    @js.native
    class FileMonitor extends GObject.Object {
        def cancel():Boolean = js.native
        def emit_event(child: Any, other_file: Any, event_type0: Double):Unit = js.native
        def is_cancelled():Boolean = js.native
        def set_rate_limit(limit_msecs: Any):Unit = js.native
    }
    @js.native
    class FileOutputStream extends OutputStream {
        def get_etag():String = js.native
        def query_info(attributes: String, cancellable: Cancellable):FileInfo = js.native
        def query_info_async(attributes: String, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def query_info_finish(result: Any):FileInfo = js.native
    }
    @js.native
    class FilenameCompleter extends GObject.Object {
        def this(config: js.Any) = this()
        def get_completion_suffix(initial_text: String):String = js.native
        def get_completions(initial_text: String):js.Array[String] = js.native
        def set_dirs_only(dirs_only: Boolean):Unit = js.native
    }
    @js.native
    class FilterInputStream extends InputStream {
        def get_base_stream():InputStream = js.native
        def get_close_base_stream():Boolean = js.native
        def set_close_base_stream(close_base: Boolean):Unit = js.native
    }
    @js.native
    class FilterOutputStream extends OutputStream {
        def get_base_stream():OutputStream = js.native
        def get_close_base_stream():Boolean = js.native
        def set_close_base_stream(close_base: Boolean):Unit = js.native
    }
    @js.native
    class IOModule extends GObject.TypeModule {
        def this(config: js.Any) = this()
        def load():Unit = js.native
        def unload():Unit = js.native
    }
    @js.native
    object IOModule extends js.Object {
        def query():js.Array[String] = js.native
    }
    @js.native
    class IOStream extends GObject.Object {
        def clear_pending():Unit = js.native
        def close(cancellable: Cancellable):Boolean = js.native
        def close_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def close_finish(result: Any):Boolean = js.native
        def get_input_stream():InputStream = js.native
        def get_output_stream():OutputStream = js.native
        def has_pending():Boolean = js.native
        def is_closed():Boolean = js.native
        def set_pending():Boolean = js.native
        def splice_async(stream2: IOStream, flags: Double, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
    }
    @js.native
    object IOStream extends js.Object {
        def splice_finish(result: Any):Boolean = js.native
    }
    @js.native
    class InetAddress extends GObject.Object {
        def this(config: js.Any) = this()
        def equal(other_address: InetAddress):Boolean = js.native
        def get_family():Double = js.native
        def get_is_any():Boolean = js.native
        def get_is_link_local():Boolean = js.native
        def get_is_loopback():Boolean = js.native
        def get_is_mc_global():Boolean = js.native
        def get_is_mc_link_local():Boolean = js.native
        def get_is_mc_node_local():Boolean = js.native
        def get_is_mc_org_local():Boolean = js.native
        def get_is_mc_site_local():Boolean = js.native
        def get_is_multicast():Boolean = js.native
        def get_is_site_local():Boolean = js.native
        def get_native_size():Any = js.native
        def to_bytes():Any = js.native
        def to_string():String = js.native
    }
    @js.native
    object InetAddress extends js.Object {
        def new_any(family: Double):InetAddress = js.native
        def new_from_bytes(bytes: js.Array[Any], family: Double):InetAddress = js.native
        def new_from_string(string: String):InetAddress = js.native
        def new_loopback(family: Double):InetAddress = js.native
    }
    @js.native
    class InetAddressMask extends GObject.Object {
        def this(config: js.Any) = this()
        def equal(mask2: InetAddressMask):Boolean = js.native
        def get_address():InetAddress = js.native
        def get_family():Double = js.native
        def get_length():Any = js.native
        def matches(address: InetAddress):Boolean = js.native
        def to_string():String = js.native
    }
    @js.native
    object InetAddressMask extends js.Object {
        def new_from_string(mask_string: String):InetAddressMask = js.native
    }
    @js.native
    class InetSocketAddress extends SocketAddress {
        def this(config: js.Any) = this()
        def get_address():InetAddress = js.native
        def get_flowinfo():Any = js.native
        def get_port():Any = js.native
        def get_scope_id():Any = js.native
    }
    @js.native
    object InetSocketAddress extends js.Object {
        def new_from_string(address: String, port: Any):InetSocketAddress = js.native
    }
    @js.native
    class InputStream extends GObject.Object {
        def clear_pending():Unit = js.native
        def close(cancellable: Cancellable):Boolean = js.native
        def close_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def close_finish(result: Any):Boolean = js.native
        def has_pending():Boolean = js.native
        def is_closed():Boolean = js.native
        def read(buffer: js.Array[Any], count: Any, cancellable: Cancellable):Any = js.native
        def read_all(buffer: js.Array[Any], count: Any, bytes_read: Any, cancellable: Cancellable):Boolean = js.native
        def read_all_async(buffer: js.Array[Any], count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_all_finish(result: Any, bytes_read: Any):Boolean = js.native
        def read_async(buffer: js.Array[Any], count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_bytes(count: Any, cancellable: Cancellable):Any = js.native
        def read_bytes_async(count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def read_bytes_finish(result: Any):Any = js.native
        def read_finish(result: Any):Any = js.native
        def set_pending():Boolean = js.native
        def skip(count: Any, cancellable: Cancellable):Any = js.native
        def skip_async(count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def skip_finish(result: Any):Any = js.native
    }
    @js.native
    class ListStore extends GObject.Object {
        def this(config: js.Any) = this()
        def append(item: GObject.Object):Unit = js.native
        def insert(position: Any, item: GObject.Object):Unit = js.native
        def insert_sorted(item: GObject.Object, compare_func: Any, user_data: Object):Any = js.native
        def remove(position: Any):Unit = js.native
        def remove_all():Unit = js.native
        def sort(compare_func: Any, user_data: Object):Unit = js.native
        def splice(position: Any, n_removals: Any, additions: js.Array[GObject.Object], n_additions: Any):Unit = js.native
    }
    @js.native
    class MemoryInputStream extends InputStream {
        def this(config: js.Any) = this()
        def add_bytes(bytes: Any):Unit = js.native
        def add_data(data: js.Array[Any], len: Any, destroy: Any):Unit = js.native
    }
    @js.native
    object MemoryInputStream extends js.Object {
        def new_from_bytes(bytes: Any):MemoryInputStream = js.native
        def new_from_data(data: js.Array[Any], len: Any, destroy: Any):MemoryInputStream = js.native
    }
    @js.native
    class MemoryOutputStream extends OutputStream {
        def this(config: js.Any) = this()
        def get_data():Object = js.native
        def get_data_size():Any = js.native
        def get_size():Any = js.native
        def steal_as_bytes():Any = js.native
        def steal_data():Object = js.native
    }
    @js.native
    object MemoryOutputStream extends js.Object {
        def new_resizable():MemoryOutputStream = js.native
    }
    @js.native
    class Menu extends MenuModel {
        def this(config: js.Any) = this()
        def append(label: String, detailed_action: String):Unit = js.native
        def append_item(item: MenuItem):Unit = js.native
        def append_section(label: String, section: MenuModel):Unit = js.native
        def append_submenu(label: String, submenu: MenuModel):Unit = js.native
        def freeze():Unit = js.native
        def insert(position: Any, label: String, detailed_action: String):Unit = js.native
        def insert_item(position: Any, item: MenuItem):Unit = js.native
        def insert_section(position: Any, label: String, section: MenuModel):Unit = js.native
        def insert_submenu(position: Any, label: String, submenu: MenuModel):Unit = js.native
        def prepend(label: String, detailed_action: String):Unit = js.native
        def prepend_item(item: MenuItem):Unit = js.native
        def prepend_section(label: String, section: MenuModel):Unit = js.native
        def prepend_submenu(label: String, submenu: MenuModel):Unit = js.native
        def remove(position: Any):Unit = js.native
        def remove_all():Unit = js.native
    }
    @js.native
    class MenuAttributeIter extends GObject.Object {
        def get_name():String = js.native
        def get_next(out_name: String, value: Any):Boolean = js.native
        def get_value():Any = js.native
        def next():Boolean = js.native
    }
    @js.native
    class MenuItem extends GObject.Object {
        def this(config: js.Any) = this()
        def get_attribute(attribute: String, format_string: String, rest:Any*):Boolean = js.native
        def get_attribute_value(attribute: String, expected_type0: Any):Any = js.native
        def get_link(link: String):MenuModel = js.native
        def set_action_and_target(action: String, format_string: String, rest:Any*):Unit = js.native
        def set_action_and_target_value(action: String, target_value: Any):Unit = js.native
        def set_attribute(attribute: String, format_string: String, rest:Any*):Unit = js.native
        def set_attribute_value(attribute: String, value: Any):Unit = js.native
        def set_detailed_action(detailed_action: String):Unit = js.native
        def set_icon(icon: Any):Unit = js.native
        def set_label(label: String):Unit = js.native
        def set_link(link: String, model: MenuModel):Unit = js.native
        def set_section(section: MenuModel):Unit = js.native
        def set_submenu(submenu: MenuModel):Unit = js.native
    }
    @js.native
    object MenuItem extends js.Object {
        def new_from_model(model: MenuModel, item_index: Any):MenuItem = js.native
        def new_section(label: String, section: MenuModel):MenuItem = js.native
        def new_submenu(label: String, submenu: MenuModel):MenuItem = js.native
    }
    @js.native
    class MenuLinkIter extends GObject.Object {
        def get_name():String = js.native
        def get_next(out_link: String, value: MenuModel):Boolean = js.native
        def get_value():MenuModel = js.native
        def next():Boolean = js.native
    }
    @js.native
    class MenuModel extends GObject.Object {
        def get_item_attribute(item_index: Any, attribute: String, format_string: String, rest:Any*):Boolean = js.native
        def get_item_attribute_value(item_index: Any, attribute: String, expected_type0: Any):Any = js.native
        def get_item_link(item_index: Any, link: String):MenuModel = js.native
        def get_n_items():Any = js.native
        def is_mutable():Boolean = js.native
        def items_changed(position: Any, removed: Any, added: Any):Unit = js.native
        def iterate_item_attributes(item_index: Any):MenuAttributeIter = js.native
        def iterate_item_links(item_index: Any):MenuLinkIter = js.native
    }
    @js.native
    class MountOperation extends GObject.Object {
        def this(config: js.Any) = this()
        def get_anonymous():Boolean = js.native
        def get_choice():Any = js.native
        def get_domain():String = js.native
        def get_password():String = js.native
        def get_password_save():Double = js.native
        def get_username():String = js.native
        def reply(result: Double):Unit = js.native
        def set_anonymous(anonymous: Boolean):Unit = js.native
        def set_choice(choice: Any):Unit = js.native
        def set_domain(domain: String):Unit = js.native
        def set_password(password: String):Unit = js.native
        def set_password_save(save: Double):Unit = js.native
        def set_username(username: String):Unit = js.native
    }
    @js.native
    class NativeVolumeMonitor extends VolumeMonitor {
    }
    @js.native
    class NetworkAddress extends GObject.Object {
        def this(config: js.Any) = this()
        def get_hostname():String = js.native
        def get_port():Any = js.native
        def get_scheme():String = js.native
    }
    @js.native
    object NetworkAddress extends js.Object {
        def parse(host_and_port: String, default_port: Any):NetworkAddress = js.native
        def parse_uri(uri: String, default_port: Any):NetworkAddress = js.native
        def new_loopback(port: Any):NetworkAddress = js.native
    }
    @js.native
    class NetworkService extends GObject.Object {
        def this(config: js.Any) = this()
        def get_domain():String = js.native
        def get_protocol():String = js.native
        def get_scheme():String = js.native
        def get_service():String = js.native
        def set_scheme(scheme: String):Unit = js.native
    }
    @js.native
    class Notification extends GObject.Object {
        def this(config: js.Any) = this()
        def add_button(label: String, detailed_action: String):Unit = js.native
        def add_button_with_target(label: String, action: String, target_format: String, rest:Any*):Unit = js.native
        def add_button_with_target_value(label: String, action: String, target: Any):Unit = js.native
        def set_body(body: String):Unit = js.native
        def set_default_action(detailed_action: String):Unit = js.native
        def set_default_action_and_target(action: String, target_format: String, rest:Any*):Unit = js.native
        def set_default_action_and_target_value(action: String, target: Any):Unit = js.native
        def set_icon(icon: Any):Unit = js.native
        def set_priority(priority: Double):Unit = js.native
        def set_title(title: String):Unit = js.native
        def set_urgent(urgent: Boolean):Unit = js.native
    }
    @js.native
    class OutputStream extends GObject.Object {
        def clear_pending():Unit = js.native
        def close(cancellable: Cancellable):Boolean = js.native
        def close_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def close_finish(result: Any):Boolean = js.native
        def flush(cancellable: Cancellable):Boolean = js.native
        def flush_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def flush_finish(result: Any):Boolean = js.native
        def has_pending():Boolean = js.native
        def is_closed():Boolean = js.native
        def is_closing():Boolean = js.native
        def printf(bytes_written: Any, cancellable: Cancellable, error: Any, format: String, rest:Any*):Boolean = js.native
        def set_pending():Boolean = js.native
        def splice(source: InputStream, flags: Double, cancellable: Cancellable):Any = js.native
        def splice_async(source: InputStream, flags: Double, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def splice_finish(result: Any):Any = js.native
        def vprintf(bytes_written: Any, cancellable: Cancellable, error: Any, format: String, args: Any):Boolean = js.native
        def write(buffer: js.Array[Any], count: Any, cancellable: Cancellable):Any = js.native
        def write_all(buffer: js.Array[Any], count: Any, bytes_written: Any, cancellable: Cancellable):Boolean = js.native
        def write_all_async(buffer: js.Array[Any], count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def write_all_finish(result: Any, bytes_written: Any):Boolean = js.native
        def write_async(buffer: js.Array[Any], count: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def write_bytes(bytes: Any, cancellable: Cancellable):Any = js.native
        def write_bytes_async(bytes: Any, io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def write_bytes_finish(result: Any):Any = js.native
        def write_finish(result: Any):Any = js.native
    }
    @js.native
    class Permission extends GObject.Object {
        def acquire(cancellable: Cancellable):Boolean = js.native
        def acquire_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def acquire_finish(result: Any):Boolean = js.native
        def get_allowed():Boolean = js.native
        def get_can_acquire():Boolean = js.native
        def get_can_release():Boolean = js.native
        def impl_update(allowed: Boolean, can_acquire: Boolean, can_release: Boolean):Unit = js.native
        def release(cancellable: Cancellable):Boolean = js.native
        def release_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def release_finish(result: Any):Boolean = js.native
    }
    @js.native
    class PropertyAction extends GObject.Object {
        def this(config: js.Any) = this()
    }
    @js.native
    class ProxyAddress extends InetSocketAddress {
        def this(config: js.Any) = this()
        def get_destination_hostname():String = js.native
        def get_destination_port():Any = js.native
        def get_destination_protocol():String = js.native
        def get_password():String = js.native
        def get_protocol():String = js.native
        def get_uri():String = js.native
        def get_username():String = js.native
    }
    @js.native
    class ProxyAddressEnumerator extends SocketAddressEnumerator {
    }
    @js.native
    class Resolver extends GObject.Object {
        def lookup_by_address(address: InetAddress, cancellable: Cancellable):String = js.native
        def lookup_by_address_async(address: InetAddress, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_by_address_finish(result: Any):String = js.native
        def lookup_by_name(hostname: String, cancellable: Cancellable):Any = js.native
        def lookup_by_name_async(hostname: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_by_name_finish(result: Any):Any = js.native
        def lookup_records(rrname: String, record_type0: Double, cancellable: Cancellable):Any = js.native
        def lookup_records_async(rrname: String, record_type0: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_records_finish(result: Any):Any = js.native
        def lookup_service(service: String, protocol: String, domain: String, cancellable: Cancellable):Any = js.native
        def lookup_service_async(service: String, protocol: String, domain: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_service_finish(result: Any):Any = js.native
        def set_default():Unit = js.native
    }
    @js.native
    object Resolver extends js.Object {
        def free_addresses(addresses: Any):Unit = js.native
        def free_targets(targets: Any):Unit = js.native
        def get_default():Resolver = js.native
    }
    @js.native
    class Settings extends GObject.Object {
        def this(config: js.Any) = this()
        def apply():Unit = js.native
        def bind(key: String, object0: GObject.Object, property: String, flags: Double):Unit = js.native
        def bind_with_mapping(key: String, object0: GObject.Object, property: String, flags: Double, get_mapping: Any, set_mapping: Any, user_data: Object, destroy: Any):Unit = js.native
        def bind_writable(key: String, object0: GObject.Object, property: String, inverted: Boolean):Unit = js.native
        def create_action(key: String):Any = js.native
        def delay():Unit = js.native
        def get(key: String, format: String, rest:Any*):Unit = js.native
        def get_Boolean(key: String):Boolean = js.native
        def get_child(name: String):Settings = js.native
        def get_default_value(key: String):Any = js.native
        def get_double(key: String):Any = js.native
        def get_enum(key: String):Any = js.native
        def get_flags(key: String):Any = js.native
        def get_has_unapplied():Boolean = js.native
        def get_int(key: String):Any = js.native
        def get_mapped(key: String, mapping: Any, user_data: Object):Object = js.native
        def get_range(key: String):Any = js.native
        def get_string(key: String):String = js.native
        def get_strv(key: String):js.Array[String] = js.native
        def get_uint(key: String):Any = js.native
        def get_user_value(key: String):Any = js.native
        def get_value(key: String):Any = js.native
        def is_writable(name: String):Boolean = js.native
        def list_children():js.Array[String] = js.native
        def list_keys():js.Array[String] = js.native
        def range_check(key: String, value: Any):Boolean = js.native
        def reset(key: String):Unit = js.native
        def revert():Unit = js.native
        def set(key: String, format: String, rest:Any*):Boolean = js.native
        def set_Boolean(key: String, value: Boolean):Boolean = js.native
        def set_double(key: String, value: Any):Boolean = js.native
        def set_enum(key: String, value: Any):Boolean = js.native
        def set_flags(key: String, value: Any):Boolean = js.native
        def set_int(key: String, value: Any):Boolean = js.native
        def set_string(key: String, value: String):Boolean = js.native
        def set_strv(key: String, value: js.Array[String]):Boolean = js.native
        def set_uint(key: String, value: Any):Boolean = js.native
        def set_value(key: String, value: Any):Boolean = js.native
    }
    @js.native
    object Settings extends js.Object {
        def list_relocatable_schemas():js.Array[String] = js.native
        def list_schemas():js.Array[String] = js.native
        def sync():Unit = js.native
        def unbind(object0: GObject.Object, property: String):Unit = js.native
        def new_full(schema: Any, backend: Any, path: String):Settings = js.native
        def new_with_backend(schema_id: String, backend: Any):Settings = js.native
        def new_with_backend_and_path(schema_id: String, backend: Any, path: String):Settings = js.native
        def new_with_path(schema_id: String, path: String):Settings = js.native
    }
    @js.native
    class SimpleAction extends GObject.Object {
        def this(config: js.Any) = this()
        def set_enabled(enabled: Boolean):Unit = js.native
        def set_state(value: Any):Unit = js.native
        def set_state_hint(state_hint: Any):Unit = js.native
    }
    @js.native
    object SimpleAction extends js.Object {
        def new_stateful(name: String, parameter_type0: Any, state: Any):SimpleAction = js.native
    }
    @js.native
    class SimpleActionGroup extends GObject.Object {
        def this(config: js.Any) = this()
        def add_entries(entries: js.Array[Any], n_entries: Any, user_data: Object):Unit = js.native
        def insert(action: Any):Unit = js.native
        def lookup(action_name: String):Any = js.native
        def remove(action_name: String):Unit = js.native
    }
    @js.native
    class SimpleAsyncResult extends GObject.Object {
        def this(config: js.Any) = this()
        def complete():Unit = js.native
        def complete_in_idle():Unit = js.native
        def get_op_res_gBoolean():Boolean = js.native
        def get_op_res_gpointer():Object = js.native
        def get_op_res_gssize():Any = js.native
        def get_source_tag():Object = js.native
        def propagate_error():Boolean = js.native
        def run_in_thread(func: Any, io_priority: Any, cancellable: Cancellable):Unit = js.native
        def set_check_cancellable(check_cancellable: Cancellable):Unit = js.native
        def set_error(domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
        def set_error_va(domain: Any, code: Any, format: String, args: Any):Unit = js.native
        def set_from_error(error: Any):Unit = js.native
        def set_handle_cancellation(handle_cancellation: Boolean):Unit = js.native
        def set_op_res_gBoolean(op_res: Boolean):Unit = js.native
        def set_op_res_gpointer(op_res: Object, destroy_op_res: Any):Unit = js.native
        def set_op_res_gssize(op_res: Any):Unit = js.native
        def take_error(error: Any):Unit = js.native
    }
    @js.native
    object SimpleAsyncResult extends js.Object {
        def is_valid(result: Any, source: GObject.Object, source_tag: Object):Boolean = js.native
        def new_error(source_object0: GObject.Object, callback: Any, user_data: Object, domain: Any, code: Any, format: String, rest:Any*):SimpleAsyncResult = js.native
        def new_from_error(source_object0: GObject.Object, callback: Any, user_data: Object, error: Any):SimpleAsyncResult = js.native
        def new_take_error(source_object0: GObject.Object, callback: Any, user_data: Object, error: Any):SimpleAsyncResult = js.native
    }
    @js.native
    class SimpleIOStream extends IOStream {
        def this(config: js.Any) = this()
    }
    @js.native
    class SimplePermission extends Permission {
        def this(config: js.Any) = this()
    }
    @js.native
    class SimpleProxyResolver extends GObject.Object {
        def set_default_proxy(default_proxy: String):Unit = js.native
        def set_ignore_hosts(ignore_hosts: String):Unit = js.native
        def set_uri_proxy(uri_scheme: String, proxy: String):Unit = js.native
    }
    @js.native
    class Socket extends GObject.Object {
        def this(config: js.Any) = this()
        def accept(cancellable: Cancellable):Socket = js.native
        def bind(address: SocketAddress, allow_reuse: Boolean):Boolean = js.native
        def check_connect_result():Boolean = js.native
        def close():Boolean = js.native
        def condition_check(condition: Double):Double = js.native
        def condition_timed_wait(condition: Double, timeout: Any, cancellable: Cancellable):Boolean = js.native
        def condition_wait(condition: Double, cancellable: Cancellable):Boolean = js.native
        def connect(address: SocketAddress, cancellable: Cancellable):Boolean = js.native
        def connection_factory_create_connection():SocketConnection = js.native
        def create_source(condition: Double, cancellable: Cancellable):Any = js.native
        def get_available_bytes():Any = js.native
        def get_blocking():Boolean = js.native
        def get_broadcast():Boolean = js.native
        def get_credentials():Credentials = js.native
        def get_family():Double = js.native
        def get_fd():Any = js.native
        def get_keepalive():Boolean = js.native
        def get_listen_backlog():Any = js.native
        def get_local_address():SocketAddress = js.native
        def get_multicast_loopback():Boolean = js.native
        def get_multicast_ttl():Any = js.native
        def get_option(level: Any, optname: Any, value: Any):Boolean = js.native
        def get_protocol():Double = js.native
        def get_remote_address():SocketAddress = js.native
        def get_socket_type():Double = js.native
        def get_timeout():Any = js.native
        def get_ttl():Any = js.native
        def is_closed():Boolean = js.native
        def is_connected():Boolean = js.native
        def join_multicast_group(group: InetAddress, source_specific: Boolean, iface: String):Boolean = js.native
        def leave_multicast_group(group: InetAddress, source_specific: Boolean, iface: String):Boolean = js.native
        def listen():Boolean = js.native
        def receive(buffer: js.Array[Any], size: Any, cancellable: Cancellable):Any = js.native
        def receive_from(address: SocketAddress, buffer: js.Array[Any], size: Any, cancellable: Cancellable):Any = js.native
        def receive_message(address: SocketAddress, vectors: js.Array[Any], num_vectors: Any, messages: js.Array[SocketControlMessage], num_messages: Any, flags: Any, cancellable: Cancellable):Any = js.native
        def receive_messages(messages: Any, num_messages: Any, flags: Any, cancellable: Cancellable):Any = js.native
        def receive_with_blocking(buffer: js.Array[Any], size: Any, blocking: Boolean, cancellable: Cancellable):Any = js.native
        def send(buffer: js.Array[Any], size: Any, cancellable: Cancellable):Any = js.native
        def send_message(address: SocketAddress, vectors: js.Array[Any], num_vectors: Any, messages: js.Array[SocketControlMessage], num_messages: Any, flags: Any, cancellable: Cancellable):Any = js.native
        def send_messages(messages: js.Array[Any], num_messages: Any, flags: Any, cancellable: Cancellable):Any = js.native
        def send_to(address: SocketAddress, buffer: js.Array[Any], size: Any, cancellable: Cancellable):Any = js.native
        def send_with_blocking(buffer: js.Array[Any], size: Any, blocking: Boolean, cancellable: Cancellable):Any = js.native
        def set_blocking(blocking: Boolean):Unit = js.native
        def set_broadcast(broadcast: Boolean):Unit = js.native
        def set_keepalive(keepalive: Boolean):Unit = js.native
        def set_listen_backlog(backlog: Any):Unit = js.native
        def set_multicast_loopback(loopback: Boolean):Unit = js.native
        def set_multicast_ttl(ttl: Any):Unit = js.native
        def set_option(level: Any, optname: Any, value: Any):Boolean = js.native
        def set_timeout(timeout: Any):Unit = js.native
        def set_ttl(ttl: Any):Unit = js.native
        def shutdown(shutdown_read: Boolean, shutdown_write: Boolean):Boolean = js.native
        def speaks_ipv4():Boolean = js.native
    }
    @js.native
    object Socket extends js.Object {
        def new_from_fd(fd: Any):Socket = js.native
    }
    @js.native
    class SocketAddress extends GObject.Object {
        def this(config: js.Any) = this()
        def get_family():Double = js.native
        def get_native_size():Any = js.native
        def to_native(dest: Object, destlen: Any):Boolean = js.native
    }
    @js.native
    object SocketAddress extends js.Object {
        def new_from_native(native: Object, len: Any):SocketAddress = js.native
    }
    @js.native
    class SocketAddressEnumerator extends GObject.Object {
        def next(cancellable: Cancellable):SocketAddress = js.native
        def next_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def next_finish(result: Any):SocketAddress = js.native
    }
    @js.native
    class SocketClient extends GObject.Object {
        def this(config: js.Any) = this()
        def add_application_proxy(protocol: String):Unit = js.native
        def connect(connectable: Any, cancellable: Cancellable):SocketConnection = js.native
        def connect_async(connectable: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_finish(result: Any):SocketConnection = js.native
        def connect_to_host(host_and_port: String, default_port: Any, cancellable: Cancellable):SocketConnection = js.native
        def connect_to_host_async(host_and_port: String, default_port: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_to_host_finish(result: Any):SocketConnection = js.native
        def connect_to_service(domain: String, service: String, cancellable: Cancellable):SocketConnection = js.native
        def connect_to_service_async(domain: String, service: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_to_service_finish(result: Any):SocketConnection = js.native
        def connect_to_uri(uri: String, default_port: Any, cancellable: Cancellable):SocketConnection = js.native
        def connect_to_uri_async(uri: String, default_port: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_to_uri_finish(result: Any):SocketConnection = js.native
        def get_enable_proxy():Boolean = js.native
        def get_family():Double = js.native
        def get_local_address():SocketAddress = js.native
        def get_protocol():Double = js.native
        def get_proxy_resolver():Any = js.native
        def get_socket_type():Double = js.native
        def get_timeout():Any = js.native
        def get_tls():Boolean = js.native
        def get_tls_validation_flags():Double = js.native
        def set_enable_proxy(enable: Boolean):Unit = js.native
        def set_family(family: Double):Unit = js.native
        def set_local_address(address: SocketAddress):Unit = js.native
        def set_protocol(protocol: Double):Unit = js.native
        def set_proxy_resolver(proxy_resolver: Any):Unit = js.native
        def set_socket_type(type0: Double):Unit = js.native
        def set_timeout(timeout: Any):Unit = js.native
        def set_tls(tls: Boolean):Unit = js.native
        def set_tls_validation_flags(flags: Double):Unit = js.native
    }
    @js.native
    class SocketConnection extends IOStream {
        def connect(address: SocketAddress, cancellable: Cancellable):Boolean = js.native
        def connect_async(address: SocketAddress, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def connect_finish(result: Any):Boolean = js.native
        def get_local_address():SocketAddress = js.native
        def get_remote_address():SocketAddress = js.native
        def get_socket():Socket = js.native
        def is_connected():Boolean = js.native
    }
    @js.native
    object SocketConnection extends js.Object {
        def factory_lookup_type(family: Double, type0: Double, protocol_id: Any):Any = js.native
        def factory_register_type(g_type0: Any, family: Double, type0: Double, protocol: Any):Unit = js.native
    }
    @js.native
    class SocketControlMessage extends GObject.Object {
        def get_level():Any = js.native
        def get_msg_type():Any = js.native
        def get_size():Any = js.native
        def serialize(data: Object):Unit = js.native
    }
    @js.native
    object SocketControlMessage extends js.Object {
        def deserialize(level: Any, type0: Any, size: Any, data: js.Array[Any]):SocketControlMessage = js.native
    }
    @js.native
    class SocketListener extends GObject.Object {
        def this(config: js.Any) = this()
        def accept(source_object0: GObject.Object, cancellable: Cancellable):SocketConnection = js.native
        def accept_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def accept_finish(result: Any, source_object0: GObject.Object):SocketConnection = js.native
        def accept_socket(source_object0: GObject.Object, cancellable: Cancellable):Socket = js.native
        def accept_socket_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def accept_socket_finish(result: Any, source_object0: GObject.Object):Socket = js.native
        def add_address(address: SocketAddress, type0: Double, protocol: Double, source_object0: GObject.Object, effective_address: SocketAddress):Boolean = js.native
        def add_any_inet_port(source_object0: GObject.Object):Any = js.native
        def add_inet_port(port: Any, source_object0: GObject.Object):Boolean = js.native
        def add_socket(socket: Socket, source_object0: GObject.Object):Boolean = js.native
        def close():Unit = js.native
        def set_backlog(listen_backlog: Any):Unit = js.native
    }
    @js.native
    class SocketService extends SocketListener {
        def this(config: js.Any) = this()
        def is_active():Boolean = js.native
        def start():Unit = js.native
        def stop():Unit = js.native
    }
    @js.native
    class Subprocess extends GObject.Object {
        def this(config: js.Any) = this()
        def communicate(stdin_buf: Any, cancellable: Cancellable, stdout_buf: Any, stderr_buf: Any):Boolean = js.native
        def communicate_async(stdin_buf: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def communicate_finish(result: Any, stdout_buf: Any, stderr_buf: Any):Boolean = js.native
        def communicate_utf8(stdin_buf: String, cancellable: Cancellable, stdout_buf: String, stderr_buf: String):Boolean = js.native
        def communicate_utf8_async(stdin_buf: String, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def communicate_utf8_finish(result: Any, stdout_buf: String, stderr_buf: String):Boolean = js.native
        def force_exit():Unit = js.native
        def get_exit_status():Any = js.native
        def get_identifier():String = js.native
        def get_if_exited():Boolean = js.native
        def get_if_signaled():Boolean = js.native
        def get_status():Any = js.native
        def get_stderr_pipe():InputStream = js.native
        def get_stdin_pipe():OutputStream = js.native
        def get_stdout_pipe():InputStream = js.native
        def get_successful():Boolean = js.native
        def get_term_sig():Any = js.native
        def send_signal(signal_num: Any):Unit = js.native
        def wait(cancellable: Cancellable):Boolean = js.native
        def wait_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def wait_check(cancellable: Cancellable):Boolean = js.native
        def wait_check_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def wait_check_finish(result: Any):Boolean = js.native
        def wait_finish(result: Any):Boolean = js.native
    }
    @js.native
    object Subprocess extends js.Object {
        def newv(argv: js.Array[String], flags: Double):Subprocess = js.native
    }
    @js.native
    class SubprocessLauncher extends GObject.Object {
        def this(config: js.Any) = this()
        def getenv(variable: String):String = js.native
        def set_child_setup(child_setup: Any, user_data: Object, destroy_notify: Any):Unit = js.native
        def set_cwd(cwd: String):Unit = js.native
        def set_environ(env: String):Unit = js.native
        def set_flags(flags: Double):Unit = js.native
        def set_stderr_file_path(path: String):Unit = js.native
        def set_stdin_file_path(path: String):Unit = js.native
        def set_stdout_file_path(path: String):Unit = js.native
        def setenv(variable: String, value: String, overwrite: Boolean):Unit = js.native
        def spawn(error: Any, argv0: String, rest:Any*):Subprocess = js.native
        def spawnv(argv: js.Array[String]):Subprocess = js.native
        def take_fd(source_fd: Any, target_fd: Any):Unit = js.native
        def take_stderr_fd(fd: Any):Unit = js.native
        def take_stdin_fd(fd: Any):Unit = js.native
        def take_stdout_fd(fd: Any):Unit = js.native
        def unsetenv(variable: String):Unit = js.native
    }
    @js.native
    class Task extends GObject.Object {
        def this(config: js.Any) = this()
        def attach_source(source: Any, callback: Any):Unit = js.native
        def get_cancellable():Cancellable = js.native
        def get_check_cancellable():Boolean = js.native
        def get_completed():Boolean = js.native
        def get_context():Any = js.native
        def get_priority():Any = js.native
        def get_return_on_cancel():Boolean = js.native
        def get_source_object():GObject.Object = js.native
        def get_source_tag():Object = js.native
        def get_task_data():Object = js.native
        def had_error():Boolean = js.native
        def propagate_Boolean():Boolean = js.native
        def propagate_int():Any = js.native
        def propagate_pointer():Object = js.native
        def return_Boolean(result: Boolean):Unit = js.native
        def return_error(error: Any):Unit = js.native
        def return_error_if_cancelled():Boolean = js.native
        def return_int(result: Any):Unit = js.native
        def return_new_error(domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
        def return_pointer(result: Object, result_destroy: Any):Unit = js.native
        def run_in_thread(task_func: Any):Unit = js.native
        def run_in_thread_sync(task_func: Any):Unit = js.native
        def set_check_cancellable(check_cancellable: Boolean):Unit = js.native
        def set_priority(priority: Any):Unit = js.native
        def set_return_on_cancel(return_on_cancel: Boolean):Boolean = js.native
        def set_source_tag(source_tag: Object):Unit = js.native
        def set_task_data(task_data: Object, task_data_destroy: Any):Unit = js.native
    }
    @js.native
    object Task extends js.Object {
        def is_valid(result: Any, source_object0: GObject.Object):Boolean = js.native
        def report_error(source_object0: GObject.Object, callback: Any, callback_data: Object, source_tag: Object, error: Any):Unit = js.native
        def report_new_error(source_object0: GObject.Object, callback: Any, callback_data: Object, source_tag: Object, domain: Any, code: Any, format: String, rest:Any*):Unit = js.native
    }
    @js.native
    class TcpConnection extends SocketConnection {
        def get_graceful_disconnect():Boolean = js.native
        def set_graceful_disconnect(graceful_disconnect: Boolean):Unit = js.native
    }
    @js.native
    class TcpWrapperConnection extends TcpConnection {
        def this(config: js.Any) = this()
        def get_base_io_stream():IOStream = js.native
    }
    @js.native
    class TestDBus extends GObject.Object {
        def this(config: js.Any) = this()
        def add_service_dir(path: String):Unit = js.native
        def down():Unit = js.native
        def get_bus_address():String = js.native
        def get_flags():Double = js.native
        def stop():Unit = js.native
        def up():Unit = js.native
    }
    @js.native
    object TestDBus extends js.Object {
        def unset():Unit = js.native
    }
    @js.native
    class ThemedIcon extends GObject.Object {
        def this(config: js.Any) = this()
        def append_name(iconname: String):Unit = js.native
        def get_names():js.Array[String] = js.native
        def prepend_name(iconname: String):Unit = js.native
    }
    @js.native
    object ThemedIcon extends js.Object {
        def new_from_names(iconnames: js.Array[String], len: Any):ThemedIcon = js.native
        def new_with_default_fallbacks(iconname: String):ThemedIcon = js.native
    }
    @js.native
    class ThreadedSocketService extends SocketService {
        def this(config: js.Any) = this()
    }
    @js.native
    class TlsCertificate extends GObject.Object {
        def this(config: js.Any) = this()
        def get_issuer():TlsCertificate = js.native
        def is_same(cert_two: TlsCertificate):Boolean = js.native
        def verify(identity: Any, trusted_ca: TlsCertificate):Double = js.native
    }
    @js.native
    object TlsCertificate extends js.Object {
        def list_new_from_file(file: String):Any = js.native
        def new_from_file(file: String):TlsCertificate = js.native
        def new_from_files(cert_file: String, key_file: String):TlsCertificate = js.native
        def new_from_pem(data: String, length: Any):TlsCertificate = js.native
    }
    @js.native
    class TlsConnection extends IOStream {
        def emit_accept_certificate(peer_cert: TlsCertificate, errors: Double):Boolean = js.native
        def get_certificate():TlsCertificate = js.native
        def get_database():TlsDatabase = js.native
        def get_interaction():TlsInteraction = js.native
        def get_peer_certificate():TlsCertificate = js.native
        def get_peer_certificate_errors():Double = js.native
        def get_rehandshake_mode():Double = js.native
        def get_require_close_notify():Boolean = js.native
        def get_use_system_certdb():Boolean = js.native
        def handshake(cancellable: Cancellable):Boolean = js.native
        def handshake_async(io_priority: Any, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def handshake_finish(result: Any):Boolean = js.native
        def set_certificate(certificate: TlsCertificate):Unit = js.native
        def set_database(database: TlsDatabase):Unit = js.native
        def set_interaction(interaction: TlsInteraction):Unit = js.native
        def set_rehandshake_mode(mode: Double):Unit = js.native
        def set_require_close_notify(require_close_notify: Boolean):Unit = js.native
        def set_use_system_certdb(use_system_certdb: Boolean):Unit = js.native
    }
    @js.native
    class TlsDatabase extends GObject.Object {
        def create_certificate_handle(certificate: TlsCertificate):String = js.native
        def lookup_certificate_for_handle(handle: String, interaction: TlsInteraction, flags: Double, cancellable: Cancellable):TlsCertificate = js.native
        def lookup_certificate_for_handle_async(handle: String, interaction: TlsInteraction, flags: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_certificate_for_handle_finish(result: Any):TlsCertificate = js.native
        def lookup_certificate_issuer(certificate: TlsCertificate, interaction: TlsInteraction, flags: Double, cancellable: Cancellable):TlsCertificate = js.native
        def lookup_certificate_issuer_async(certificate: TlsCertificate, interaction: TlsInteraction, flags: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_certificate_issuer_finish(result: Any):TlsCertificate = js.native
        def lookup_certificates_issued_by(issuer_raw_dn: js.Array[Any], interaction: TlsInteraction, flags: Double, cancellable: Cancellable):Any = js.native
        def lookup_certificates_issued_by_async(issuer_raw_dn: js.Array[Any], interaction: TlsInteraction, flags: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def lookup_certificates_issued_by_finish(result: Any):Any = js.native
        def verify_chain(chain: TlsCertificate, purpose: String, identity: Any, interaction: TlsInteraction, flags: Double, cancellable: Cancellable):Double = js.native
        def verify_chain_async(chain: TlsCertificate, purpose: String, identity: Any, interaction: TlsInteraction, flags: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def verify_chain_finish(result: Any):Double = js.native
    }
    @js.native
    class TlsInteraction extends GObject.Object {
        def ask_password(password: TlsPassword, cancellable: Cancellable):Double = js.native
        def ask_password_async(password: TlsPassword, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def ask_password_finish(result: Any):Double = js.native
        def invoke_ask_password(password: TlsPassword, cancellable: Cancellable):Double = js.native
        def invoke_request_certificate(connection: TlsConnection, flags: Double, cancellable: Cancellable):Double = js.native
        def request_certificate(connection: TlsConnection, flags: Double, cancellable: Cancellable):Double = js.native
        def request_certificate_async(connection: TlsConnection, flags: Double, cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def request_certificate_finish(result: Any):Double = js.native
    }
    @js.native
    class TlsPassword extends GObject.Object {
        def this(config: js.Any) = this()
        def get_description():String = js.native
        def get_flags():Double = js.native
        def get_value(length: Any):Any = js.native
        def get_warning():String = js.native
        def set_description(description: String):Unit = js.native
        def set_flags(flags: Double):Unit = js.native
        def set_value(value: Any, length: Any):Unit = js.native
        def set_value_full(value: Any, length: Any, destroy: Any):Unit = js.native
        def set_warning(warning: String):Unit = js.native
    }
    @js.native
    class UnixConnection extends SocketConnection {
        def receive_credentials(cancellable: Cancellable):Credentials = js.native
        def receive_credentials_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def receive_credentials_finish(result: Any):Credentials = js.native
        def receive_fd(cancellable: Cancellable):Any = js.native
        def send_credentials(cancellable: Cancellable):Boolean = js.native
        def send_credentials_async(cancellable: Cancellable, callback: Any, user_data: Object):Unit = js.native
        def send_credentials_finish(result: Any):Boolean = js.native
        def send_fd(fd: Any, cancellable: Cancellable):Boolean = js.native
    }
    @js.native
    class UnixCredentialsMessage extends SocketControlMessage {
        def this(config: js.Any) = this()
        def get_credentials():Credentials = js.native
    }
    @js.native
    object UnixCredentialsMessage extends js.Object {
        def is_supported():Boolean = js.native
        def new_with_credentials(credentials: Credentials):UnixCredentialsMessage = js.native
    }
    @js.native
    class UnixFDList extends GObject.Object {
        def this(config: js.Any) = this()
        def append(fd: Any):Any = js.native
        def get(index0: Any):Any = js.native
        def get_length():Any = js.native
        def peek_fds(length: Any):js.Array[Any] = js.native
        def steal_fds(length: Any):js.Array[Any] = js.native
    }
    @js.native
    object UnixFDList extends js.Object {
        def new_from_array(fds: js.Array[Any], n_fds: Any):UnixFDList = js.native
    }
    @js.native
    class UnixFDMessage extends SocketControlMessage {
        def this(config: js.Any) = this()
        def append_fd(fd: Any):Boolean = js.native
        def get_fd_list():UnixFDList = js.native
        def steal_fds(length: Any):js.Array[Any] = js.native
    }
    @js.native
    object UnixFDMessage extends js.Object {
        def new_with_fd_list(fd_list: UnixFDList):UnixFDMessage = js.native
    }
    @js.native
    class UnixInputStream extends InputStream {
        def this(config: js.Any) = this()
        def get_close_fd():Boolean = js.native
        def get_fd():Any = js.native
        def set_close_fd(close_fd: Boolean):Unit = js.native
    }
    @js.native
    class UnixMountMonitor extends GObject.Object {
        def this(config: js.Any) = this()
        def set_rate_limit(limit_msec: Any):Unit = js.native
    }
    @js.native
    object UnixMountMonitor extends js.Object {
        def get():UnixMountMonitor = js.native
    }
    @js.native
    class UnixOutputStream extends OutputStream {
        def this(config: js.Any) = this()
        def get_close_fd():Boolean = js.native
        def get_fd():Any = js.native
        def set_close_fd(close_fd: Boolean):Unit = js.native
    }
    @js.native
    class UnixSocketAddress extends SocketAddress {
        def this(config: js.Any) = this()
        def get_address_type():Double = js.native
        def get_is_abstract():Boolean = js.native
        def get_path():String = js.native
        def get_path_len():Any = js.native
    }
    @js.native
    object UnixSocketAddress extends js.Object {
        def abstract_names_supported():Boolean = js.native
        def new_abstract(path: js.Array[Any], path_len: Any):UnixSocketAddress = js.native
        def new_with_type(path: js.Array[Any], path_len: Any, type0: Double):UnixSocketAddress = js.native
    }
    @js.native
    class Vfs extends GObject.Object {
        def get_file_for_path(path: String):Any = js.native
        def get_file_for_uri(uri: String):Any = js.native
        def get_supported_uri_schemes():js.Array[String] = js.native
        def is_active():Boolean = js.native
        def parse_name(parse_name: String):Any = js.native
    }
    @js.native
    object Vfs extends js.Object {
        def get_default():Vfs = js.native
        def get_local():Vfs = js.native
    }
    @js.native
    class VolumeMonitor extends GObject.Object {
        def get_connected_drives():Any = js.native
        def get_mount_for_uuid(uuid: String):Any = js.native
        def get_mounts():Any = js.native
        def get_volume_for_uuid(uuid: String):Any = js.native
        def get_volumes():Any = js.native
    }
    @js.native
    object VolumeMonitor extends js.Object {
        def adopt_orphan_mount(mount: Any):Any = js.native
        def get():VolumeMonitor = js.native
    }
    @js.native
    class ZlibCompressor extends GObject.Object {
        def this(config: js.Any) = this()
        def get_file_info():FileInfo = js.native
        def set_file_info(file_info: FileInfo):Unit = js.native
    }
    @js.native
    class ZlibDecompressor extends GObject.Object {
        def this(config: js.Any) = this()
        def get_file_info():FileInfo = js.native
    }
}