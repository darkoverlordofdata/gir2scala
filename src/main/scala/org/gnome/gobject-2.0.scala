/**
 * GObject.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.GObject")
@js.native
object GObject extends js.Object {
    val TYPE_STRING: Number = js.native

    val PARAM_MASK:Any = js.native
    val PARAM_STATIC_STRINGS:Any = js.native
    val PARAM_USER_SHIFT:Any = js.native
    val SIGNAL_FLAGS_MASK:Any = js.native
    val SIGNAL_MATCH_MASK:Any = js.native
    val TYPE_FLAG_RESERVED_ID_BIT:Any = js.native
    val TYPE_FUNDAMENTAL_MAX:Any = js.native
    val TYPE_FUNDAMENTAL_SHIFT:Any = js.native
    val TYPE_RESERVED_BSE_FIRST:Any = js.native
    val TYPE_RESERVED_BSE_LAST:Any = js.native
    val TYPE_RESERVED_GLIB_FIRST:Any = js.native
    val TYPE_RESERVED_GLIB_LAST:Any = js.native
    val TYPE_RESERVED_USER_FIRST:Any = js.native
    val VALUE_COLLECT_FORMAT_MAX_LENGTH:Any = js.native
    val VALUE_NOCOPY_CONTENTS:Any = js.native
    def boxed_copy(boxed_type0: Any, src_boxed: Object):Object = js.native
    def boxed_free(boxed_type0: Any, boxed: Object):Unit = js.native
    def boxed_type_register_static(name: String, boxed_copy: Any, boxed_free: Any):Any = js.native
    def cclosure_marshal_BOOLEAN__BOXED_BOXED(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_BOOLEAN__FLAGS(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_STRING__OBJECT_POINTER(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__BOOLEAN(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__BOXED(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__CHAR(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__DOUBLE(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__ENUM(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__FLAGS(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__FLOAT(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__INT(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__LONG(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__OBJECT(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__PARAM(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__POINTER(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__STRING(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__UCHAR(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__UINT(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__UINT_POINTER(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__ULONG(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__VARIANT(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_VOID__VOID(closure: Any, return_value: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_marshal_generic(closure: Any, return_gvalue: Any, n_param_values: Any, param_values: Any, invocation_hint: Object, marshal_data: Object):Unit = js.native
    def cclosure_new(callback_func: Any, user_data: Object, destroy_data: Any):Any = js.native
    def cclosure_new_object(callback_func: Any, object0: Object):Any = js.native
    def cclosure_new_object_swap(callback_func: Any, object0: Object):Any = js.native
    def cclosure_new_swap(callback_func: Any, user_data: Object, destroy_data: Any):Any = js.native
    def clear_object(object_ptr: Object):Unit = js.native
    def enum_complete_type_info(g_enum_type0: Any, info: Any, const_values: Any):Unit = js.native
    def enum_get_value(enum_class: Any, value: Any):Any = js.native
    def enum_get_value_by_name(enum_class: Any, name: String):Any = js.native
    def enum_get_value_by_nick(enum_class: Any, nick: String):Any = js.native
    def enum_register_static(name: String, const_static_values: Any):Any = js.native
    def flags_complete_type_info(g_flags_type0: Any, info: Any, const_values: Any):Unit = js.native
    def flags_get_first_value(flags_class: Any, value: Any):Any = js.native
    def flags_get_value_by_name(flags_class: Any, name: String):Any = js.native
    def flags_get_value_by_nick(flags_class: Any, nick: String):Any = js.native
    def flags_register_static(name: String, const_static_values: Any):Any = js.native
    def gtype_get_type():Any = js.native
    def param_spec_Boolean(name: String, nick: String, blurb: String, default_value: Boolean, flags: Double):ParamSpec = js.native
    def param_spec_boxed(name: String, nick: String, blurb: String, boxed_type0: Any, flags: Double):ParamSpec = js.native
    def param_spec_char(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_double(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_enum(name: String, nick: String, blurb: String, enum_type0: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_flags(name: String, nick: String, blurb: String, flags_type0: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_float(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_gtype(name: String, nick: String, blurb: String, is_a_type0: Any, flags: Double):ParamSpec = js.native
    def param_spec_int(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_int64(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_long(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_object(name: String, nick: String, blurb: String, object_type0: Any, flags: Double):ParamSpec = js.native
    def param_spec_override(name: String, overridden: ParamSpec):ParamSpec = js.native
    def param_spec_param(name: String, nick: String, blurb: String, param_type0: Any, flags: Double):ParamSpec = js.native
    def param_spec_pointer(name: String, nick: String, blurb: String, flags: Double):ParamSpec = js.native
    def param_spec_pool_new(type_prefixing: Boolean):Any = js.native
    def param_spec_string(name: String, nick: String, blurb: String, default_value: String, flags: Double):ParamSpec = js.native
    def param_spec_uchar(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_uint(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_uint64(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_ulong(name: String, nick: String, blurb: String, minimum: Any, maximum: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_unichar(name: String, nick: String, blurb: String, default_value: Any, flags: Double):ParamSpec = js.native
    def param_spec_value_array(name: String, nick: String, blurb: String, element_spec: ParamSpec, flags: Double):ParamSpec = js.native
    def param_spec_variant(name: String, nick: String, blurb: String, type0: Any, default_value: Any, flags: Double):ParamSpec = js.native
    def param_type_register_static(name: String, pspec_info: Any):Any = js.native
    def param_value_convert(pspec: ParamSpec, src_value: Any, dest_value: Any, strict_validation: Boolean):Boolean = js.native
    def param_value_defaults(pspec: ParamSpec, value: Any):Boolean = js.native
    def param_value_set_default(pspec: ParamSpec, value: Any):Unit = js.native
    def param_value_validate(pspec: ParamSpec, value: Any):Boolean = js.native
    def param_values_cmp(pspec: ParamSpec, value1: Any, value2: Any):Any = js.native
    def pointer_type_register_static(name: String):Any = js.native
    def signal_accumulator_first_wins(ihint: Any, return_accu: Any, handler_return: Any, dummy: Object):Boolean = js.native
    def signal_accumulator_true_handled(ihint: Any, return_accu: Any, handler_return: Any, dummy: Object):Boolean = js.native
    def signal_add_emission_hook(signal_id: Any, detail: Any, hook_func: Any, hook_data: Object, data_destroy: Any):Any = js.native
    def signal_chain_from_overridden(instance_and_params: js.Array[Any], return_value: Any):Unit = js.native
    def signal_chain_from_overridden_handler(instance: Object, rest:Any*):Unit = js.native
    def signal_connect_closure(instance: Object, detailed_signal: String, closure: Any, after: Boolean):Any = js.native
    def signal_connect_closure_by_id(instance: Object, signal_id: Any, detail: Any, closure: Any, after: Boolean):Any = js.native
    def signal_connect_data(instance: Object, detailed_signal: String, c_handler: Any, data: Object, destroy_data: Any, connect_flags: Double):Any = js.native
    def signal_connect_object(instance: Object, detailed_signal: String, c_handler: Any, gobject0: Object, connect_flags: Double):Any = js.native
    def signal_emit(instance: Object, signal_id: Any, detail: Any, rest:Any*):Unit = js.native
    def signal_emit_by_name(instance: Object, detailed_signal: String, rest:Any*):Unit = js.native
    def signal_emit_valist(instance: Object, signal_id: Any, detail: Any, var_args: Any):Unit = js.native
    def signal_emitv(instance_and_params: js.Array[Any], signal_id: Any, detail: Any, return_value: Any):Unit = js.native
    def signal_get_invocation_hint(instance: Object):Any = js.native
    def signal_handler_block(instance: Object, handler_id: Any):Unit = js.native
    def signal_handler_disconnect(instance: Object, handler_id: Any):Unit = js.native
    def signal_handler_find(instance: Object, mask: Double, signal_id: Any, detail: Any, closure: Any, func: Object, data: Object):Any = js.native
    def signal_handler_is_connected(instance: Object, handler_id: Any):Boolean = js.native
    def signal_handler_unblock(instance: Object, handler_id: Any):Unit = js.native
    def signal_handlers_block_matched(instance: Object, mask: Double, signal_id: Any, detail: Any, closure: Any, func: Object, data: Object):Any = js.native
    def signal_handlers_destroy(instance: Object):Unit = js.native
    def signal_handlers_disconnect_matched(instance: Object, mask: Double, signal_id: Any, detail: Any, closure: Any, func: Object, data: Object):Any = js.native
    def signal_handlers_unblock_matched(instance: Object, mask: Double, signal_id: Any, detail: Any, closure: Any, func: Object, data: Object):Any = js.native
    def signal_has_handler_pending(instance: Object, signal_id: Any, detail: Any, may_be_blocked: Boolean):Boolean = js.native
    def signal_list_ids(itype0: Any, n_ids: Any):js.Array[Any] = js.native
    def signal_lookup(name: String, itype0: Any):Any = js.native
    def signal_name(signal_id: Any):String = js.native
    def signal_new(signal_name: String, itype0: Any, signal_flags: Double, class_offset: Any, accumulator: Any, accu_data: Object, c_marshaller: Any, return_type0: Any, n_params: Any, rest:Any*):Any = js.native
    def signal_new_class_handler(signal_name: String, itype0: Any, signal_flags: Double, class_handler: Any, accumulator: Any, accu_data: Object, c_marshaller: Any, return_type0: Any, n_params: Any, rest:Any*):Any = js.native
    def signal_new_valist(signal_name: String, itype0: Any, signal_flags: Double, class_closure: Any, accumulator: Any, accu_data: Object, c_marshaller: Any, return_type0: Any, n_params: Any, args: Any):Any = js.native
    def signal_newv(signal_name: String, itype0: Any, signal_flags: Double, class_closure: Any, accumulator: Any, accu_data: Object, c_marshaller: Any, return_type0: Any, n_params: Any, param_types: js.Array[Any]):Any = js.native
    def signal_override_class_closure(signal_id: Any, instance_type0: Any, class_closure: Any):Unit = js.native
    def signal_override_class_handler(signal_name: String, instance_type0: Any, class_handler: Any):Unit = js.native
    def signal_parse_name(detailed_signal: String, itype0: Any, signal_id_p: Any, detail_p: Any, force_detail_quark: Boolean):Boolean = js.native
    def signal_query(signal_id: Any, query: Any):Unit = js.native
    def signal_remove_emission_hook(signal_id: Any, hook_id: Any):Unit = js.native
    def signal_set_va_marshaller(signal_id: Any, instance_type0: Any, va_marshaller: Any):Unit = js.native
    def signal_stop_emission(instance: Object, signal_id: Any, detail: Any):Unit = js.native
    def signal_stop_emission_by_name(instance: Object, detailed_signal: String):Unit = js.native
    def signal_type_cclosure_new(itype0: Any, struct_offset: Any):Any = js.native
    def source_set_closure(source: Any, closure: Any):Unit = js.native
    def source_set_dummy_callback(source: Any):Unit = js.native
    def strdup_value_contents(value: Any):String = js.native
    def type_add_class_cache_func(cache_data: Object, cache_func: Any):Unit = js.native
    def type_add_class_private(class_type0: Any, private_size: Any):Unit = js.native
    def type_add_instance_private(class_type0: Any, private_size: Any):Any = js.native
    def type_add_interface_check(check_data: Object, check_func: Any):Unit = js.native
    def type_add_interface_dynamic(instance_type0: Any, interface_type0: Any, plugin: Any):Unit = js.native
    def type_add_interface_static(instance_type0: Any, interface_type0: Any, info: Any):Unit = js.native
    def type_check_class_cast(g_class: Any, is_a_type0: Any):Any = js.native
    def type_check_class_is_a(g_class: Any, is_a_type0: Any):Boolean = js.native
    def type_check_instance(instance: Any):Boolean = js.native
    def type_check_instance_cast(instance: Any, iface_type0: Any):Any = js.native
    def type_check_instance_is_a(instance: Any, iface_type0: Any):Boolean = js.native
    def type_check_instance_is_fundamentally_a(instance: Any, fundamental_type0: Any):Boolean = js.native
    def type_check_is_value_type(type0: Any):Boolean = js.native
    def type_check_value(value: Any):Boolean = js.native
    def type_check_value_holds(value: Any, type0: Any):Boolean = js.native
    def type_children(type0: Any, n_children: Any):js.Array[Any] = js.native
    def type_class_add_private(g_class: Object, private_size: Any):Unit = js.native
    def type_class_adjust_private_offset(g_class: Object, private_size_or_offset: Any):Unit = js.native
    def type_class_get_instance_private_offset(g_class: Object):Any = js.native
    def type_class_peek(type0: Any):Any = js.native
    def type_class_peek_static(type0: Any):Any = js.native
    def type_class_ref(type0: Any):Any = js.native
    def type_create_instance(type0: Any):Any = js.native
    def type_default_interface_peek(g_type0: Any):Any = js.native
    def type_default_interface_ref(g_type0: Any):Any = js.native
    def type_default_interface_unref(g_iface: Any):Unit = js.native
    def type_depth(type0: Any):Any = js.native
    def type_ensure(type0: Any):Unit = js.native
    def type_free_instance(instance: Any):Unit = js.native
    def type_from_name(name: String):Any = js.native
    def type_fundamental(type_id: Any):Any = js.native
    def type_fundamental_next():Any = js.native
    def type_get_instance_count(type0: Any):Any = js.native
    def type_get_plugin(type0: Any):Any = js.native
    def type_get_qdata(type0: Any, quark: Any):Object = js.native
    def type_get_type_registration_serial():Any = js.native
    def type_init():Unit = js.native
    def type_init_with_debug_flags(debug_flags: Double):Unit = js.native
    def type_interface_add_prerequisite(interface_type0: Any, prerequisite_type0: Any):Unit = js.native
    def type_interface_get_plugin(instance_type0: Any, interface_type0: Any):Any = js.native
    def type_interface_peek(instance_class: Any, iface_type0: Any):Any = js.native
    def type_interface_prerequisites(interface_type0: Any, n_prerequisites: Any):js.Array[Any] = js.native
    def type_interfaces(type0: Any, n_interfaces: Any):js.Array[Any] = js.native
    def type_is_a(type0: Any, is_a_type0: Any):Boolean = js.native
    def type_name(type0: Any):String = js.native
    def type_name_from_class(g_class: Any):String = js.native
    def type_name_from_instance(instance: Any):String = js.native
    def type_next_base(leaf_type0: Any, root_type0: Any):Any = js.native
    def type_parent(type0: Any):Any = js.native
    def type_qname(type0: Any):Any = js.native
    def type_query(type0: Any, query: Any):Unit = js.native
    def type_register_dynamic(parent_type0: Any, type_name: String, plugin: Any, flags: Double):Any = js.native
    def type_register_fundamental(type_id: Any, type_name: String, info: Any, finfo: Any, flags: Double):Any = js.native
    def type_register_static(parent_type0: Any, type_name: String, info: Any, flags: Double):Any = js.native
    def type_register_static_simple(parent_type0: Any, type_name: String, class_size: Any, class_init: Any, instance_size: Any, instance_init: Any, flags: Double):Any = js.native
    def type_remove_class_cache_func(cache_data: Object, cache_func: Any):Unit = js.native
    def type_remove_interface_check(check_data: Object, check_func: Any):Unit = js.native
    def type_set_qdata(type0: Any, quark: Any, data: Object):Unit = js.native
    def type_test_flags(type0: Any, flags: Any):Boolean = js.native
    def type_value_table_peek(type0: Any):Any = js.native
    def value_register_transform_func(src_type0: Any, dest_type0: Any, transform_func: Any):Unit = js.native
    def value_type_compatible(src_type0: Any, dest_type0: Any):Boolean = js.native
    def value_type_transformable(src_type0: Any, dest_type0: Any):Boolean = js.native
    @js.native
    object BindingFlags extends js.Object {
        val DEFAULT:Double = js.native
        val BIDIRECTIONAL:Double = js.native
        val SYNC_CREATE:Double = js.native
        val INVERT_BOOLEAN:Double = js.native
    }
    @js.native
    object ConnectFlags extends js.Object {
        val AFTER:Double = js.native
        val SWAPPED:Double = js.native
    }
    @js.native
    object ParamFlags extends js.Object {
        val READABLE:Double = js.native
        val WRITABLE:Double = js.native
        val READWRITE:Double = js.native
        val CONSTRUCT:Double = js.native
        val CONSTRUCT_ONLY:Double = js.native
        val LAX_VALIDATION:Double = js.native
        val STATIC_NAME:Double = js.native
        val PRIVATE:Double = js.native
        val STATIC_NICK:Double = js.native
        val STATIC_BLURB:Double = js.native
        val EXPLICIT_NOTIFY:Double = js.native
        val DEPRECATED:Double = js.native
    }
    @js.native
    object SignalFlags extends js.Object {
        val RUN_FIRST:Double = js.native
        val RUN_LAST:Double = js.native
        val RUN_CLEANUP:Double = js.native
        val NO_RECURSE:Double = js.native
        val DETAILED:Double = js.native
        val ACTION:Double = js.native
        val NO_HOOKS:Double = js.native
        val MUST_COLLECT:Double = js.native
        val DEPRECATED:Double = js.native
    }
    @js.native
    object SignalMatchType extends js.Object {
        val ID:Double = js.native
        val DETAIL:Double = js.native
        val CLOSURE:Double = js.native
        val FUNC:Double = js.native
        val DATA:Double = js.native
        val UNBLOCKED:Double = js.native
    }
    @js.native
    object TypeDebugFlags extends js.Object {
        val NONE:Double = js.native
        val OBJECTS:Double = js.native
        val SIGNALS:Double = js.native
        val INSTANCE_COUNT:Double = js.native
        val MASK:Double = js.native
    }
    @js.native
    object TypeFlags extends js.Object {
        val ABSTRACT:Double = js.native
        val VALUE_ABSTRACT:Double = js.native
    }
    @js.native
    object TypeFundamentalFlags extends js.Object {
        val CLASSED:Double = js.native
        val INSTANTIATABLE:Double = js.native
        val DERIVABLE:Double = js.native
        val DEEP_DERIVABLE:Double = js.native
    }
    @js.native
    class Binding extends GObject.Object {
        def get_flags():Double = js.native
        def get_source():Object = js.native
        def get_source_property():String = js.native
        def get_target():Object = js.native
        def get_target_property():String = js.native
        def unbind():Unit = js.native
    }
    @js.native
    class InitiallyUnowned extends GObject.Object {
    }
    @js.native
    class Object extends js.Object {
        def this(config: js.Any) = this()
        def connect(message:String, cb:js.Function): Unit = js.native
        def get_valist(args:Any*):Unit = js.native
        def get_property(args:Any*):Any = js.native
        def replace_data(args:Any*):Any = js.native
        def set_property(args:Any*):Unit = js.native
        def set_valist(args:Any*):Unit = js.native
        def add_toggle_ref(notify: Any, data: Object):Unit = js.native
        def add_weak_pointer(weak_pointer_location: Object):Unit = js.native
        def bind_property(source_property: String, target: Object, target_property: String, flags: Double):Binding = js.native
        def bind_property_full(source_property: String, target: Object, target_property: String, flags: Double, transform_to: Any, transform_from: Any, user_data: Object, notify: Any):Binding = js.native
        def bind_property_with_closures(source_property: String, target: Object, target_property: String, flags: Double, transform_to: Any, transform_from: Any):Binding = js.native
        def dup_data(key: String, dup_func: Any, user_data: Object):Object = js.native
        def dup_qdata(quark: Any, dup_func: Any, user_data: Object):Object = js.native
        def force_floating():Unit = js.native
        def freeze_notify():Unit = js.native
        def get_data(key: String):Object = js.native
        def get_property(property_name: String, value: Any):Unit = js.native
        def get_qdata(quark: Any):Object = js.native
        def get_valist(first_property_name: String, var_args: Any):Unit = js.native
        def is_floating():Boolean = js.native
        def notify(property_name: String):Unit = js.native
        def notify_by_pspec(pspec: ParamSpec):Unit = js.native
        def ref():Object = js.native
        def ref_sink():Object = js.native
        def remove_toggle_ref(notify: Any, data: Object):Unit = js.native
        def remove_weak_pointer(weak_pointer_location: Object):Unit = js.native
        def replace_data(key: String, oldval0: Object, newval0: Object, destroy: Any, old_destroy: Any):Boolean = js.native
        def replace_qdata(quark: Any, oldval0: Object, newval0: Object, destroy: Any, old_destroy: Any):Boolean = js.native
        def run_dispose():Unit = js.native
        def set_data(key: String, data: Object):Unit = js.native
        def set_data_full(key: String, data: Object, destroy: Any):Unit = js.native
        def set_property(property_name: String, value: Any):Unit = js.native
        def set_qdata(quark: Any, data: Object):Unit = js.native
        def set_qdata_full(quark: Any, data: Object, destroy: Any):Unit = js.native
        def set_valist(first_property_name: String, var_args: Any):Unit = js.native
        def steal_data(key: String):Object = js.native
        def steal_qdata(quark: Any):Object = js.native
        def thaw_notify():Unit = js.native
        def unref():Unit = js.native
        def watch_closure(closure: Any):Unit = js.native
        def weak_ref(notify: Any, data: Object):Unit = js.native
        def weak_unref(notify: Any, data: Object):Unit = js.native
    }
    @js.native
    object Object extends js.Object {
        def compat_control(what: Any, data: Object):Any = js.native
        def connect(object0: Object, signal_spec: String, rest:Any*):Object = js.native
        def disconnect(object0: Object, signal_spec: String, rest:Any*):Unit = js.native
        def get(object0: Object, first_property_name: String, rest:Any*):Unit = js.native
        def interface_find_property(g_iface: Object, property_name: String):ParamSpec = js.native
        def interface_install_property(g_iface: Object, pspec: ParamSpec):Unit = js.native
        def interface_list_properties(g_iface: Object, n_properties_p: Any):js.Array[ParamSpec] = js.native
        def set(object0: Object, first_property_name: String, rest:Any*):Unit = js.native
        def new_valist(object_type0: Any, first_property_name: String, var_args: Any):Object = js.native
        def newv(args:Any*):Object = js.native
    }
    @js.native
    class ParamSpec extends GObject.Object {
        def get_blurb():String = js.native
        def get_default_value():Any = js.native
        def get_name():String = js.native
        def get_name_quark():Any = js.native
        def get_nick():String = js.native
        override def get_qdata(quark: Any):Object = js.native
        def get_redirect_target():ParamSpec = js.native
        override def ref():ParamSpec = js.native
        override def ref_sink():ParamSpec = js.native
        override def set_qdata(quark: Any, data: Object):Unit = js.native
        override def set_qdata_full(quark: Any, data: Object, destroy: Any):Unit = js.native
        def sink():Unit = js.native
        override def steal_qdata(quark: Any):Object = js.native
        override def unref():Unit = js.native
    }
    @js.native
    object ParamSpec extends js.Object {
        def internal(param_type0: Any, name: String, nick: String, blurb: String, flags: Double):Object = js.native
    }
    @js.native
    class ParamSpecBoolean extends ParamSpec {
    }
    @js.native
    class ParamSpecBoxed extends ParamSpec {
    }
    @js.native
    class ParamSpecChar extends ParamSpec {
    }
    @js.native
    class ParamSpecDouble extends ParamSpec {
    }
    @js.native
    class ParamSpecEnum extends ParamSpec {
    }
    @js.native
    class ParamSpecFlags extends ParamSpec {
    }
    @js.native
    class ParamSpecFloat extends ParamSpec {
    }
    @js.native
    class ParamSpecGType extends ParamSpec {
    }
    @js.native
    class ParamSpecInt extends ParamSpec {
    }
    @js.native
    class ParamSpecInt64 extends ParamSpec {
    }
    @js.native
    class ParamSpecLong extends ParamSpec {
    }
    @js.native
    class ParamSpecObject extends ParamSpec {
    }
    @js.native
    class ParamSpecOverride extends ParamSpec {
    }
    @js.native
    class ParamSpecParam extends ParamSpec {
    }
    @js.native
    class ParamSpecPointer extends ParamSpec {
    }
    @js.native
    class ParamSpecString extends ParamSpec {
    }
    @js.native
    class ParamSpecUChar extends ParamSpec {
    }
    @js.native
    class ParamSpecUInt extends ParamSpec {
    }
    @js.native
    class ParamSpecUInt64 extends ParamSpec {
    }
    @js.native
    class ParamSpecULong extends ParamSpec {
    }
    @js.native
    class ParamSpecUnichar extends ParamSpec {
    }
    @js.native
    class ParamSpecValueArray extends ParamSpec {
    }
    @js.native
    class ParamSpecVariant extends ParamSpec {
    }
    @js.native
    class TypeModule extends GObject.Object {
        def add_interface(instance_type0: Any, interface_type0: Any, interface_info: Any):Unit = js.native
        def register_enum(name: String, const_static_values: Any):Any = js.native
        def register_flags(name: String, const_static_values: Any):Any = js.native
        def register_type(parent_type0: Any, type_name: String, type_info: Any, flags: Double):Any = js.native
        def set_name(name: String):Unit = js.native
        def unuse():Unit = js.native
        def use():Boolean = js.native
    }
}