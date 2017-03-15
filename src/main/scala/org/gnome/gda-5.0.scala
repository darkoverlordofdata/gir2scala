/**
 * Gda.scala
 *
 */
package org.gnome

import scala.scalajs.js
import js.annotation._

@JSName("imports.gi.Gda")
@js.native
object Gda extends js.Object {
    val ATTRIBUTE_AUTO_INCREMENT:String = js.native
    val ATTRIBUTE_DESCRIPTION:String = js.native
    val ATTRIBUTE_IS_DEFAULT:String = js.native
    val ATTRIBUTE_NAME:String = js.native
    val ATTRIBUTE_NUMERIC_PRECISION:String = js.native
    val ATTRIBUTE_NUMERIC_SCALE:String = js.native
    val ATTRIBUTE_TREE_NODE_UNKNOWN_CHILDREN:String = js.native
    val EXTRA_AUTO_INCREMENT:String = js.native
    val SERVER_PROVIDER_UNDEFINED_LIMITING_THREAD:Object = js.native
    val SQLSTATE_GENERAL_ERROR:String = js.native
    val SQLSTATE_NO_ERROR:String = js.native
    val TIMEZONE_INVALID:Any = js.native
    def alphanum_to_text(text: String):String = js.native
    def attributes_manager_new(for_objects: Boolean, signal_func: Any, signal_data: Object):Any = js.native
    def binary_copy(boxed: Object):Object = js.native
    def binary_free(boxed: Object):Unit = js.native
    def blob_copy(boxed: Object):Object = js.native
    def blob_free(boxed: Object):Unit = js.native
    def completion_list_get(cnc: Connection, sql: String, start: Any, end: Any):js.Array[String] = js.native
    def compute_dml_statements(cnc: Connection, select_stmt: Statement, require_pk: Boolean, insert_stmt: Statement, update_stmt: Statement, delete_stmt: Statement):Boolean = js.native
    def compute_select_statement_from_update(update_stmt: Statement):Any = js.native
    def compute_unique_table_row_condition(stsel: Any, mtable: Any, require_pk: Boolean):Any = js.native
    def compute_unique_table_row_condition_with_cnc(cnc: Connection, stsel: Any, mtable: Any, require_pk: Boolean):Any = js.native
    def data_handler_get_default(for_type0: Any):Any = js.native
    def data_model_error_quark():Any = js.native
    def default_escape_string(string: String):String = js.native
    def default_unescape_string(string: String):String = js.native
    def dsn_split(string: String, out_dsn: String, out_username: String, out_password: String):Unit = js.native
    def g_type_from_string(str: String):Any = js.native
    def g_type_to_string(type0: Any):String = js.native
    def geometricpoint_copy(boxed: Object):Object = js.native
    def geometricpoint_free(boxed: Object):Unit = js.native
    def get_application_exec_path(app_name: String):String = js.native
    def identifier_equal(id1: String, id2: String):Boolean = js.native
    def identifier_hash(id: String):Any = js.native
    def init():Unit = js.native
    def locale_changed():Unit = js.native
    def log_disable():Unit = js.native
    def log_enable():Unit = js.native
    def log_error(format: String, rest:Any*):Unit = js.native
    def log_is_enabled():Boolean = js.native
    def log_message(format: String, rest:Any*):Unit = js.native
    def mutex_free(mutex: Any):Unit = js.native
    def mutex_lock(mutex: Any):Unit = js.native
    def mutex_new():Any = js.native
    def mutex_trylock(mutex: Any):Boolean = js.native
    def mutex_unlock(mutex: Any):Unit = js.native
    def parse_formatted_date(gdate: Any, value: String, first: Double, second: Double, third: Double, sep: Any):Boolean = js.native
    def parse_formatted_time(timegda: Any, value: String, sep: Any):Boolean = js.native
    def parse_formatted_timestamp(timestamp: Any, value: String, first: Double, second: Double, third: Double, sep: Any):Boolean = js.native
    def parse_iso8601_date(gdate: Any, value: String):Boolean = js.native
    def parse_iso8601_time(timegda: Any, value: String):Boolean = js.native
    def parse_iso8601_timestamp(timestamp: Any, value: String):Boolean = js.native
    def rewrite_sql_statement_for_null_parameters(sqlst: Any, params: Set, out_modified: Boolean):Any = js.native
    def rewrite_statement_for_null_parameters(stmt: Statement, params: Set, out_stmt: Statement):Boolean = js.native
    def rfc1738_decode(string: String):Boolean = js.native
    def rfc1738_encode(string: String):String = js.native
    def select_alter_select_for_empty(stmt: Statement):Statement = js.native
    def sql_case_new(parent: Any):Any = js.native
    def sql_error_quark():Any = js.native
    def sql_field_new(parent: Any):Any = js.native
    def sql_function_new(parent: Any):Any = js.native
    def sql_identifier_quote(id: String, cnc: Connection, prov: ServerProvider, meta_store_convention: Boolean, force_quotes: Boolean):String = js.native
    def sql_identifier_split(id: String):js.Array[String] = js.native
    def sql_operation_new(parent: Any):Any = js.native
    def sql_operation_operator_from_string(op: String):Double = js.native
    def sql_operation_operator_to_string(op: Double):String = js.native
    def sql_select_field_new(parent: Any):Any = js.native
    def sql_select_from_new(parent: Any):Any = js.native
    def sql_select_join_new(parent: Any):Any = js.native
    def sql_select_join_type_to_string(type0: Double):String = js.native
    def sql_select_order_new(parent: Any):Any = js.native
    def sql_select_target_new(parent: Any):Any = js.native
    def sql_table_new(parent: Any):Any = js.native
    def string_to_binary(str: String):Any = js.native
    def string_to_blob(str: String):Any = js.native
    def text_to_alphanum(text: String):String = js.native
    def time_copy(boxed: Object):Object = js.native
    def time_free(boxed: Object):Unit = js.native
    def timestamp_copy(boxed: Object):Object = js.native
    def timestamp_free(boxed: Object):Unit = js.native
    def utility_check_data_model(model: Any, nbcols: Any, rest:Any*):Boolean = js.native
    def utility_check_data_model_v(model: Any, nbcols: Any, types: js.Array[Any]):Boolean = js.native
    def utility_data_model_dump_data_to_xml(model: Any, parent: Any, cols: js.Array[Any], nb_cols: Any, rows: js.Array[Any], nb_rows: Any, use_col_ids: Boolean):Boolean = js.native
    def utility_data_model_find_column_description(model: DataSelect, field_name: String):String = js.native
    def utility_holder_load_attributes(holder: Holder, node: Any, sources: Any):Boolean = js.native
    def value_compare(value1: Any, value2: Any):Any = js.native
    def value_copy(value: Any):Any = js.native
    def value_differ(value1: Any, value2: Any):Any = js.native
    def value_free(value: Any):Unit = js.native
    def value_get_binary(value: Any):Any = js.native
    def value_get_blob(value: Any):Any = js.native
    def value_get_geometric_point(value: Any):Any = js.native
    def value_get_numeric(value: Any):Any = js.native
    def value_get_short(value: Any):Any = js.native
    def value_get_time(value: Any):Any = js.native
    def value_get_timestamp(value: Any):Any = js.native
    def value_get_ushort(value: Any):Any = js.native
    def value_is_null(value: Any):Boolean = js.native
    def value_is_number(value: Any):Boolean = js.native
    def value_new(type0: Any):Any = js.native
    def value_new_binary(val0: Any, size: Any):Any = js.native
    def value_new_blob(val0: Any, size: Any):Any = js.native
    def value_new_blob_from_file(filename: String):Any = js.native
    def value_new_default(default_val0: String):Any = js.native
    def value_new_from_string(as_string: String, type0: Any):Any = js.native
    def value_new_from_xml(node: Any):Any = js.native
    def value_new_null():Any = js.native
    def value_new_timestamp_from_timet(val0: Any):Any = js.native
    def value_reset_with_type(value: Any, type0: Any):Unit = js.native
    def value_set_binary(value: Any, binary: Any):Unit = js.native
    def value_set_blob(value: Any, blob: Any):Unit = js.native
    def value_set_from_string(value: Any, as_string: String, type0: Any):Boolean = js.native
    def value_set_from_value(value: Any, from: Any):Boolean = js.native
    def value_set_geometric_point(value: Any, val0: Any):Unit = js.native
    def value_set_null(value: Any):Unit = js.native
    def value_set_numeric(value: Any, val0: Any):Unit = js.native
    def value_set_short(value: Any, val0: Any):Unit = js.native
    def value_set_time(value: Any, val0: Any):Unit = js.native
    def value_set_timestamp(value: Any, val0: Any):Unit = js.native
    def value_set_ushort(value: Any, val0: Any):Unit = js.native
    def value_stringify(value: Any):String = js.native
    def value_take_binary(value: Any, binary: Any):Unit = js.native
    def value_take_blob(value: Any, blob: Any):Unit = js.native
    def value_to_xml(value: Any):Any = js.native
    @js.native
    object BatchError extends js.Object {
        val BATCH_CONFLICTING_PARAMETER_ERROR:Double = js.native
    }
    @js.native
    object ConfigError extends js.Object {
        val DSN_NOT_FOUND_ERROR:Double = js.native
        val PERMISSION_ERROR:Double = js.native
        val PROVIDER_NOT_FOUND_ERROR:Double = js.native
        val PROVIDER_CREATION_ERROR:Double = js.native
    }
    @js.native
    object ConnectionError extends js.Object {
        val DSN_NOT_FOUND_ERROR:Double = js.native
        val PROVIDER_NOT_FOUND_ERROR:Double = js.native
        val PROVIDER_ERROR:Double = js.native
        val NO_CNC_SPEC_ERROR:Double = js.native
        val NO_PROVIDER_SPEC_ERROR:Double = js.native
        val OPEN_ERROR:Double = js.native
        val STATEMENT_TYPE_ERROR:Double = js.native
        val CANT_LOCK_ERROR:Double = js.native
        val TASK_NOT_FOUND_ERROR:Double = js.native
        val UNSUPPORTED_THREADS_ERROR:Double = js.native
        val CLOSED_ERROR:Double = js.native
        val META_DATA_CONTEXT_ERROR:Double = js.native
        val UNSUPPORTED_ASYNC_EXEC_ERROR:Double = js.native
    }
    @js.native
    object ConnectionEventCode extends js.Object {
        val CONSTRAINT_VIOLATION:Double = js.native
        val RESTRICT_VIOLATION:Double = js.native
        val NOT_NULL_VIOLATION:Double = js.native
        val FOREIGN_KEY_VIOLATION:Double = js.native
        val UNIQUE_VIOLATION:Double = js.native
        val CHECK_VIOLATION:Double = js.native
        val INSUFFICIENT_PRIVILEGES:Double = js.native
        val UNDEFINED_COLUMN:Double = js.native
        val UNDEFINED_FUNCTION:Double = js.native
        val UNDEFINED_TABLE:Double = js.native
        val DUPLICATE_COLUMN:Double = js.native
        val DUPLICATE_DATABASE:Double = js.native
        val DUPLICATE_FUNCTION:Double = js.native
        val DUPLICATE_SCHEMA:Double = js.native
        val DUPLICATE_TABLE:Double = js.native
        val DUPLICATE_ALIAS:Double = js.native
        val DUPLICATE_OBJECT:Double = js.native
        val SYNTAX_ERROR:Double = js.native
        val UNKNOWN:Double = js.native
    }
    @js.native
    object ConnectionEventType extends js.Object {
        val NOTICE:Double = js.native
        val WARNING:Double = js.native
        val ERROR:Double = js.native
        val COMMAND:Double = js.native
    }
    @js.native
    object ConnectionFeature extends js.Object {
        val AGGREGATES:Double = js.native
        val BLOBS:Double = js.native
        val INDEXES:Double = js.native
        val INHERITANCE:Double = js.native
        val NAMESPACES:Double = js.native
        val PROCEDURES:Double = js.native
        val SEQUENCES:Double = js.native
        val SQL:Double = js.native
        val TRANSACTIONS:Double = js.native
        val SAVEPOINTS:Double = js.native
        val SAVEPOINTS_REMOVE:Double = js.native
        val TRIGGERS:Double = js.native
        val UPDATABLE_CURSOR:Double = js.native
        val USERS:Double = js.native
        val VIEWS:Double = js.native
        val XA_TRANSACTIONS:Double = js.native
        val MULTI_THREADING:Double = js.native
        val ASYNC_EXEC:Double = js.native
        val LAST:Double = js.native
    }
    @js.native
    object ConnectionMetaType extends js.Object {
        val NAMESPACES:Double = js.native
        val TYPES:Double = js.native
        val TABLES:Double = js.native
        val VIEWS:Double = js.native
        val FIELDS:Double = js.native
        val INDEXES:Double = js.native
    }
    @js.native
    object DataComparatorError extends js.Object {
        val MISSING_DATA_MODEL_ERROR:Double = js.native
        val COLUMN_TYPES_MISMATCH_ERROR:Double = js.native
        val MODEL_ACCESS_ERROR:Double = js.native
        val USER_CANCELLED_ERROR:Double = js.native
    }
    @js.native
    object DataModelError extends js.Object {
        val ROW_OUT_OF_RANGE_ERROR:Double = js.native
        val COLUMN_OUT_OF_RANGE_ERROR:Double = js.native
        val VALUES_LIST_ERROR:Double = js.native
        val VALUE_TYPE_ERROR:Double = js.native
        val ROW_NOT_FOUND_ERROR:Double = js.native
        val ACCESS_ERROR:Double = js.native
        val FEATURE_NON_SUPPORTED_ERROR:Double = js.native
        val FILE_EXIST_ERROR:Double = js.native
        val XML_FORMAT_ERROR:Double = js.native
        val TRUNCATED_ERROR:Double = js.native
        val OTHER_ERROR:Double = js.native
    }
    @js.native
    object DataModelHint extends js.Object {
        val START_BATCH_UPDATE:Double = js.native
        val END_BATCH_UPDATE:Double = js.native
        val REFRESH:Double = js.native
    }
    @js.native
    object DataModelIOFormat extends js.Object {
        val DATA_ARRAY_XML:Double = js.native
        val TEXT_SEPARATED:Double = js.native
        val TEXT_TABLE:Double = js.native
    }
    @js.native
    object DataModelIterError extends js.Object {
        val DATA_MODEL_ITER_COLUMN_OUT_OF_RANGE_ERROR:Double = js.native
    }
    @js.native
    object DataPivotAggregate extends js.Object {
        val AVG:Double = js.native
        val COUNT:Double = js.native
        val MAX:Double = js.native
        val MIN:Double = js.native
        val SUM:Double = js.native
    }
    @js.native
    object DataPivotError extends js.Object {
        val INTERNAL_ERROR:Double = js.native
        val SOURCE_MODEL_ERROR:Double = js.native
        val FIELD_FORMAT_ERROR:Double = js.native
        val USAGE_ERROR:Double = js.native
        val OVERFLOW_ERROR:Double = js.native
    }
    @js.native
    object DataPivotFieldType extends js.Object {
        val ROW:Double = js.native
        val COLUMN:Double = js.native
    }
    @js.native
    object DataProxyError extends js.Object {
        val COMMIT_ERROR:Double = js.native
        val COMMIT_CANCELLED:Double = js.native
        val READ_ONLY_VALUE:Double = js.native
        val READ_ONLY_ROW:Double = js.native
        val FILTER_ERROR:Double = js.native
    }
    @js.native
    object DataSelectConditionType extends js.Object {
        val PK:Double = js.native
        val ALL_COLUMNS:Double = js.native
    }
    @js.native
    object DataSelectError extends js.Object {
        val MODIFICATION_STATEMENT_ERROR:Double = js.native
        val MISSING_MODIFICATION_STATEMENT_ERROR:Double = js.native
        val CONNECTION_ERROR:Double = js.native
        val ACCESS_ERROR:Double = js.native
        val SQL_ERROR:Double = js.native
        val SAFETY_LOCKED_ERROR:Double = js.native
    }
    @js.native
    object DiffType extends js.Object {
        val ADD_ROW:Double = js.native
        val REMOVE_ROW:Double = js.native
        val MODIFY_ROW:Double = js.native
    }
    @js.native
    object HolderError extends js.Object {
        val STRING_CONVERSION_ERROR:Double = js.native
        val VALUE_TYPE_ERROR:Double = js.native
        val VALUE_NULL_ERROR:Double = js.native
    }
    @js.native
    object MetaDbObjectType extends js.Object {
        val UNKNOWN:Double = js.native
        val TABLE:Double = js.native
        val VIEW:Double = js.native
    }
    @js.native
    object MetaForeignKeyPolicy extends js.Object {
        val UNKNOWN:Double = js.native
        val NONE:Double = js.native
        val NO_ACTION:Double = js.native
        val RESTRICT:Double = js.native
        val CASCADE:Double = js.native
        val SET_NULL:Double = js.native
        val SET_DEFAULT:Double = js.native
    }
    @js.native
    object MetaSortType extends js.Object {
        val ALHAPETICAL:Double = js.native
        val DEPENDENCIES:Double = js.native
    }
    @js.native
    object MetaStoreChangeType extends js.Object {
        val ADD:Double = js.native
        val REMOVE:Double = js.native
        val MODIFY:Double = js.native
    }
    @js.native
    object MetaStoreError extends js.Object {
        val INCORRECT_SCHEMA_ERROR:Double = js.native
        val UNSUPPORTED_PROVIDER_ERROR:Double = js.native
        val INTERNAL_ERROR:Double = js.native
        val META_CONTEXT_ERROR:Double = js.native
        val MODIFY_CONTENTS_ERROR:Double = js.native
        val EXTRACT_SQL_ERROR:Double = js.native
        val ATTRIBUTE_NOT_FOUND_ERROR:Double = js.native
        val ATTRIBUTE_ERROR:Double = js.native
        val SCHEMA_OBJECT_NOT_FOUND_ERROR:Double = js.native
        val SCHEMA_OBJECT_CONFLICT_ERROR:Double = js.native
        val SCHEMA_OBJECT_DESCR_ERROR:Double = js.native
        val TRANSACTION_ALREADY_STARTED_ERROR:Double = js.native
    }
    @js.native
    object MetaStructError extends js.Object {
        val UNKNOWN_OBJECT_ERROR:Double = js.native
        val DUPLICATE_OBJECT_ERROR:Double = js.native
        val INCOHERENCE_ERROR:Double = js.native
        val XML_ERROR:Double = js.native
    }
    @js.native
    object ServerOperationError extends js.Object {
        val OBJECT_NAME_ERROR:Double = js.native
        val INCORRECT_VALUE_ERROR:Double = js.native
        val XML_ERROR:Double = js.native
    }
    @js.native
    object ServerOperationNodeStatus extends js.Object {
        val OPTIONAL:Double = js.native
        val REQUIRED:Double = js.native
        val UNKNOWN:Double = js.native
    }
    @js.native
    object ServerOperationNodeType extends js.Object {
        val PARAMLIST:Double = js.native
        val DATA_MODEL:Double = js.native
        val PARAM:Double = js.native
        val SEQUENCE:Double = js.native
        val SEQUENCE_ITEM:Double = js.native
        val DATA_MODEL_COLUMN:Double = js.native
        val UNKNOWN:Double = js.native
    }
    @js.native
    object ServerOperationType extends js.Object {
        val CREATE_DB:Double = js.native
        val DROP_DB:Double = js.native
        val CREATE_TABLE:Double = js.native
        val DROP_TABLE:Double = js.native
        val RENAME_TABLE:Double = js.native
        val ADD_COLUMN:Double = js.native
        val DROP_COLUMN:Double = js.native
        val CREATE_INDEX:Double = js.native
        val DROP_INDEX:Double = js.native
        val CREATE_VIEW:Double = js.native
        val DROP_VIEW:Double = js.native
        val COMMENT_TABLE:Double = js.native
        val COMMENT_COLUMN:Double = js.native
        val CREATE_USER:Double = js.native
        val ALTER_USER:Double = js.native
        val DROP_USER:Double = js.native
        val LAST:Double = js.native
    }
    @js.native
    object ServerProviderError extends js.Object {
        val METHOD_NON_IMPLEMENTED_ERROR:Double = js.native
        val PREPARE_STMT_ERROR:Double = js.native
        val EMPTY_STMT_ERROR:Double = js.native
        val MISSING_PARAM_ERROR:Double = js.native
        val STATEMENT_EXEC_ERROR:Double = js.native
        val OPERATION_ERROR:Double = js.native
        val INTERNAL_ERROR:Double = js.native
        val BUSY_ERROR:Double = js.native
        val NON_SUPPORTED_ERROR:Double = js.native
        val SERVER_VERSION_ERROR:Double = js.native
        val DATA_ERROR:Double = js.native
        val DEFAULT_VALUE_HANDLING_ERROR:Double = js.native
        val MISUSE_ERROR:Double = js.native
        val FILE_NOT_FOUND_ERROR:Double = js.native
    }
    @js.native
    object SetError extends js.Object {
        val XML_SPEC_ERROR:Double = js.native
        val HOLDER_NOT_FOUND_ERROR:Double = js.native
        val INVALID_ERROR:Double = js.native
        val READ_ONLY_ERROR:Double = js.native
        val IMPLEMENTATION_ERROR:Double = js.native
    }
    @js.native
    object SqlAnyPartType extends js.Object {
        val STMT_SELECT:Double = js.native
        val STMT_INSERT:Double = js.native
        val STMT_UPDATE:Double = js.native
        val STMT_DELETE:Double = js.native
        val STMT_COMPOUND:Double = js.native
        val STMT_BEGIN:Double = js.native
        val STMT_ROLLBACK:Double = js.native
        val STMT_COMMIT:Double = js.native
        val STMT_SAVEPOINT:Double = js.native
        val STMT_ROLLBACK_SAVEPOINT:Double = js.native
        val STMT_DELETE_SAVEPOINT:Double = js.native
        val STMT_UNKNOWN:Double = js.native
        val EXPR:Double = js.native
        val SQL_FIELD:Double = js.native
        val SQL_TABLE:Double = js.native
        val SQL_FUNCTION:Double = js.native
        val SQL_OPERATION:Double = js.native
        val SQL_CASE:Double = js.native
        val SQL_SELECT_FIELD:Double = js.native
        val SQL_SELECT_TARGET:Double = js.native
        val SQL_SELECT_JOIN:Double = js.native
        val SQL_SELECT_FROM:Double = js.native
        val SQL_SELECT_ORDER:Double = js.native
    }
    @js.native
    object SqlBuilderError extends js.Object {
        val WRONG_TYPE_ERROR:Double = js.native
        val MISUSE_ERROR:Double = js.native
    }
    @js.native
    object SqlError extends js.Object {
        val STRUCTURE_CONTENTS_ERROR:Double = js.native
        val MALFORMED_IDENTIFIER_ERROR:Double = js.native
        val MISSING_IDENTIFIER_ERROR:Double = js.native
        val VALIDATION_ERROR:Double = js.native
    }
    @js.native
    object SqlOperatorType extends js.Object {
        val AND:Double = js.native
        val OR:Double = js.native
        val EQ:Double = js.native
        val IS:Double = js.native
        val LIKE:Double = js.native
        val BETWEEN:Double = js.native
        val GT:Double = js.native
        val LT:Double = js.native
        val GEQ:Double = js.native
        val LEQ:Double = js.native
        val DIFF:Double = js.native
        val REGEXP:Double = js.native
        val REGEXP_CI:Double = js.native
        val NOT_REGEXP:Double = js.native
        val NOT_REGEXP_CI:Double = js.native
        val SIMILAR:Double = js.native
        val ISNULL:Double = js.native
        val ISNOTNULL:Double = js.native
        val NOT:Double = js.native
        val IN:Double = js.native
        val NOTIN:Double = js.native
        val CONCAT:Double = js.native
        val PLUS:Double = js.native
        val MINUS:Double = js.native
        val STAR:Double = js.native
        val DIV:Double = js.native
        val REM:Double = js.native
        val BITAND:Double = js.native
        val BITOR:Double = js.native
        val BITNOT:Double = js.native
        val ILIKE:Double = js.native
        val NOTLIKE:Double = js.native
        val NOTILIKE:Double = js.native
    }
    @js.native
    object SqlParserError extends js.Object {
        val SYNTAX_ERROR:Double = js.native
        val OVERFLOW_ERROR:Double = js.native
        val EMPTY_SQL_ERROR:Double = js.native
    }
    @js.native
    object SqlParserFlavour extends js.Object {
        val STANDARD:Double = js.native
        val SQLITE:Double = js.native
        val MYSQL:Double = js.native
        val ORACLE:Double = js.native
        val POSTGRESQL:Double = js.native
    }
    @js.native
    object SqlParserMode extends js.Object {
        val PARSE:Double = js.native
        val DELIMIT:Double = js.native
    }
    @js.native
    object SqlSelectJoinType extends js.Object {
        val CROSS:Double = js.native
        val NATURAL:Double = js.native
        val INNER:Double = js.native
        val LEFT:Double = js.native
        val RIGHT:Double = js.native
        val FULL:Double = js.native
    }
    @js.native
    object SqlStatementCompoundType extends js.Object {
        val UNION:Double = js.native
        val UNION_ALL:Double = js.native
        val INTERSECT:Double = js.native
        val INTERSECT_ALL:Double = js.native
        val EXCEPT:Double = js.native
        val EXCEPT_ALL:Double = js.native
    }
    @js.native
    object SqlStatementType extends js.Object {
        val SELECT:Double = js.native
        val INSERT:Double = js.native
        val UPDATE:Double = js.native
        val DELETE:Double = js.native
        val COMPOUND:Double = js.native
        val BEGIN:Double = js.native
        val ROLLBACK:Double = js.native
        val COMMIT:Double = js.native
        val SAVEPOINT:Double = js.native
        val ROLLBACK_SAVEPOINT:Double = js.native
        val DELETE_SAVEPOINT:Double = js.native
        val UNKNOWN:Double = js.native
        val NONE:Double = js.native
    }
    @js.native
    object StatementError extends js.Object {
        val PARSE_ERROR:Double = js.native
        val SYNTAX_ERROR:Double = js.native
        val NO_CNC_ERROR:Double = js.native
        val CNC_CLOSED_ERROR:Double = js.native
        val EXEC_ERROR:Double = js.native
        val PARAM_TYPE_ERROR:Double = js.native
        val PARAM_ERROR:Double = js.native
    }
    @js.native
    object ThreadNotificationType extends js.Object {
        val JOB:Double = js.native
        val SIGNAL:Double = js.native
    }
    @js.native
    object ThreadWrapperError extends js.Object {
        val THREAD_WRAPPER_UNKNOWN_ERROR:Double = js.native
    }
    @js.native
    object TransactionIsolation extends js.Object {
        val UNKNOWN:Double = js.native
        val READ_COMMITTED:Double = js.native
        val READ_UNCOMMITTED:Double = js.native
        val REPEATABLE_READ:Double = js.native
        val SERIALIZABLE:Double = js.native
    }
    @js.native
    object TransactionStatusEventType extends js.Object {
        val SAVEPOINT:Double = js.native
        val SQL:Double = js.native
        val SUB_TRANSACTION:Double = js.native
    }
    @js.native
    object TransactionStatusState extends js.Object {
        val OK:Double = js.native
        val FAILED:Double = js.native
    }
    @js.native
    object TreeError extends js.Object {
        val TREE_UNKNOWN_ERROR:Double = js.native
    }
    @js.native
    object TreeManagerError extends js.Object {
        val TREE_MANAGER_UNKNOWN_ERROR:Double = js.native
    }
    @js.native
    object TreeNodeError extends js.Object {
        val TREE_NODE_UNKNOWN_ERROR:Double = js.native
    }
    @js.native
    object XaTransactionError extends js.Object {
        val ALREADY_REGISTERED_ERROR:Double = js.native
        val DTP_NOT_SUPPORTED_ERROR:Double = js.native
        val CONNECTION_BRANCH_LENGTH_ERROR:Double = js.native
    }
    @js.native
    object ConnectionOptions extends js.Object {
        val NONE:Double = js.native
        val READ_ONLY:Double = js.native
        val SQL_IDENTIFIERS_CASE_SENSITIVE:Double = js.native
        val THREAD_SAFE:Double = js.native
        val THREAD_ISOLATED:Double = js.native
        val AUTO_META_DATA:Double = js.native
    }
    @js.native
    object DataModelAccessFlags extends js.Object {
        val RANDOM:Double = js.native
        val CURSOR_FORWARD:Double = js.native
        val CURSOR_BACKWARD:Double = js.native
        val CURSOR:Double = js.native
        val INSERT:Double = js.native
        val UPDATE:Double = js.native
        val DELETE:Double = js.native
        val WRITE:Double = js.native
    }
    @js.native
    object MetaGraphInfo extends js.Object {
        val META_GRAPH_COLUMNS:Double = js.native
    }
    @js.native
    object MetaStructFeature extends js.Object {
        val NONE:Double = js.native
        val FOREIGN_KEYS:Double = js.native
        val VIEW_DEPENDENCIES:Double = js.native
        val ALL:Double = js.native
    }
    @js.native
    object ServerOperationCreateTableFlag extends js.Object {
        val NOTHING_FLAG:Double = js.native
        val PKEY_FLAG:Double = js.native
        val NOT_NULL_FLAG:Double = js.native
        val UNIQUE_FLAG:Double = js.native
        val AUTOINC_FLAG:Double = js.native
        val FKEY_FLAG:Double = js.native
        val PKEY_AUTOINC_FLAG:Double = js.native
    }
    @js.native
    object SqlIdentifierStyle extends js.Object {
        val LOWER_CASE:Double = js.native
        val UPPER_CASE:Double = js.native
    }
    @js.native
    object StatementModelUsage extends js.Object {
        val RANDOM_ACCESS:Double = js.native
        val CURSOR_FORWARD:Double = js.native
        val CURSOR_BACKWARD:Double = js.native
        val CURSOR:Double = js.native
        val ALLOW_NOPARAM:Double = js.native
        val OFFLINE:Double = js.native
    }
    @js.native
    object StatementSqlFlag extends js.Object {
        val PARAMS_AS_VALUES:Double = js.native
        val PRETTY:Double = js.native
        val PARAMS_LONG:Double = js.native
        val PARAMS_SHORT:Double = js.native
        val PARAMS_AS_COLON:Double = js.native
        val PARAMS_AS_DOLLAR:Double = js.native
        val PARAMS_AS_QMARK:Double = js.native
        val PARAMS_AS_UQMARK:Double = js.native
        val TIMEZONE_TO_GMT:Double = js.native
    }
    @js.native
    object ValueAttribute extends js.Object {
        val NONE:Double = js.native
        val IS_NULL:Double = js.native
        val CAN_BE_NULL:Double = js.native
        val IS_DEFAULT:Double = js.native
        val CAN_BE_DEFAULT:Double = js.native
        val IS_UNCHANGED:Double = js.native
        val ACTIONS_SHOWN:Double = js.native
        val DATA_NON_VALID:Double = js.native
        val HAS_VALUE_ORIG:Double = js.native
        val NO_MODIF:Double = js.native
        val UNUSED:Double = js.native
    }
    @js.native
    class Batch extends GObject.Object {
        def this(config: js.Any) = this()
        def add_statement(stmt: Statement):Unit = js.native
        def copy():Batch = js.native
        def get_parameters(out_params: Set):Boolean = js.native
        def get_statements():Any = js.native
        def remove_statement(stmt: Statement):Unit = js.native
        def serialize():String = js.native
    }
    @js.native
    object Batch extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class BlobOp extends GObject.Object {
        def get_length():Any = js.native
        def read(blob: Any, offset: Any, size: Any):Any = js.native
        def read_all(blob: Any):Boolean = js.native
        def write(blob: Any, offset: Any):Any = js.native
        def write_all(blob: Any):Boolean = js.native
    }
    @js.native
    class Column extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Column = js.native
        def get_allow_null():Boolean = js.native
        def get_attribute(attribute: String):Any = js.native
        def get_auto_increment():Boolean = js.native
        def get_dbms_type():String = js.native
        def get_default_value():Any = js.native
        def get_description():String = js.native
        def get_g_type():Any = js.native
        def get_name():String = js.native
        def get_position():Any = js.native
        def set_allow_null(allow: Boolean):Unit = js.native
        def set_attribute(attribute: String, value: Any, destroy: Any):Unit = js.native
        def set_auto_increment(is_auto: Boolean):Unit = js.native
        def set_dbms_type(dbms_type0: String):Unit = js.native
        def set_default_value(default_value: Any):Unit = js.native
        def set_description(title: String):Unit = js.native
        def set_g_type(type0: Any):Unit = js.native
        def set_name(name: String):Unit = js.native
        def set_position(position: Any):Unit = js.native
    }
    @js.native
    class Config extends GObject.Object {
    }
    @js.native
    object Config extends js.Object {
        def can_modify_system_config():Boolean = js.native
        def define_dsn(info: Any):Boolean = js.native
        def dsn_needs_authentication(dsn_name: String):Boolean = js.native
        def error_quark():Any = js.native
        def get():Config = js.native
        def get_dsn_info(dsn_name: String):Any = js.native
        def get_dsn_info_at_index(index: Any):Any = js.native
        def get_dsn_info_index(dsn_name: String):Any = js.native
        def get_nb_dsn():Any = js.native
        def get_provider(provider_name: String):ServerProvider = js.native
        def get_provider_info(provider_name: String):Any = js.native
        def list_dsn():Any = js.native
        def list_providers():Any = js.native
        def remove_dsn(dsn_name: String):Boolean = js.native
    }
    @js.native
    class Connection extends GObject.Object {
        def this(config: js.Any) = this()
        def add_event(event: ConnectionEvent):Unit = js.native
        def add_event_string(str: String, rest:Any*):ConnectionEvent = js.native
        def add_prepared_statement(gda_stmt: Statement, prepared_stmt: PStmt):Unit = js.native
        def add_savepoint(name: String):Boolean = js.native
        def async_cancel(task_id: Any):Boolean = js.native
        def async_fetch_result(task_id: Any, last_insert_row: Set):GObject.Object = js.native
        def async_statement_execute(stmt: Statement, params: Set, model_usage: Double, col_types: js.Array[Any], need_last_insert_row: Boolean):Any = js.native
        def batch_execute(batch: Batch, params: Set, model_usage: Double):Any = js.native
        def begin_transaction(name: String, level: Double):Boolean = js.native
        def clear_events_list():Unit = js.native
        def close():Unit = js.native
        def close_no_warning():Unit = js.native
        def commit_transaction(name: String):Boolean = js.native
        def create_operation(type0: Double, options: Set):ServerOperation = js.native
        def create_parser():SqlParser = js.native
        def del_prepared_statement(gda_stmt: Statement):Unit = js.native
        def delete_row_from_table(table: String, condition_column_name: String, condition_value: Any):Boolean = js.native
        def delete_savepoint(name: String):Boolean = js.native
        def execute_non_select_command(sql: String):Any = js.native
        def execute_select_command(sql: String):Any = js.native
        def get_authentication():String = js.native
        def get_cnc_string():String = js.native
        def get_date_format(out_first: Double, out_second: Double, out_third: Double, out_sep: String):Boolean = js.native
        def get_dsn():String = js.native
        def get_events():Any = js.native
        def get_meta_store():MetaStore = js.native
        def get_meta_store_data(meta_type0: Double, error: Any, nb_filters: Any, rest:Any*):Any = js.native
        def get_meta_store_data_v(meta_type0: Double, filters: Any):Any = js.native
        def get_options():Double = js.native
        def get_prepared_statement(gda_stmt: Statement):PStmt = js.native
        def get_provider():ServerProvider = js.native
        def get_provider_name():String = js.native
        def get_transaction_status():TransactionStatus = js.native
        def insert_row_into_table(table: String, error: Any, rest:Any*):Boolean = js.native
        def insert_row_into_table_v(table: String, col_names: Any, values: Any):Boolean = js.native
        def internal_change_transaction_state(newstate: Double):Unit = js.native
        def internal_get_provider_data():Object = js.native
        def internal_get_provider_data_error():Object = js.native
        def internal_reset_transaction_status():Unit = js.native
        def internal_savepoint_added(parent_trans: String, svp_name: String):Unit = js.native
        def internal_savepoint_removed(svp_name: String):Unit = js.native
        def internal_savepoint_rolledback(svp_name: String):Unit = js.native
        def internal_set_provider_data(data: Object, destroy_func: Any):Unit = js.native
        def internal_statement_executed(stmt: Statement, params: Set, error: ConnectionEvent):Unit = js.native
        def internal_transaction_committed(trans_name: String):Unit = js.native
        def internal_transaction_rolledback(trans_name: String):Unit = js.native
        def internal_transaction_started(parent_trans: String, trans_name: String, isol_level: Double):Unit = js.native
        def is_opened():Boolean = js.native
        def open():Boolean = js.native
        def parse_sql_string(sql: String, params: Set):Statement = js.native
        def perform_operation(op: ServerOperation):Boolean = js.native
        def point_available_event(type0: Double):ConnectionEvent = js.native
        def quote_sql_identifier(id: String):String = js.native
        def repetitive_statement_execute(rstmt: RepetitiveStatement, model_usage: Double, col_types: js.Array[Any], stop_on_error: Boolean):Any = js.native
        def rollback_savepoint(name: String):Boolean = js.native
        def rollback_transaction(name: String):Boolean = js.native
        def statement_execute(stmt: Statement, params: Set, model_usage: Double, last_insert_row: Set):GObject.Object = js.native
        def statement_execute_non_select(stmt: Statement, params: Set, last_insert_row: Set):Number = js.native

        def statement_execute_select(stmt: Statement, params: Set):Any = js.native
        def statement_execute_select_full(stmt: Statement, params: Set, model_usage: Double, col_types: js.Array[Any]):Any = js.native
        def statement_execute_select_fullv(stmt: Statement, params: Set, model_usage: Double, error: Any, rest:Any*):Any = js.native
        def statement_prepare(stmt: Statement):Boolean = js.native
        def statement_to_sql(stmt: Statement, params: Set, flags: Double, params_used: Any):String = js.native
        def supports_feature(feature: Double):Boolean = js.native
        def update_meta_store(context: Any):Boolean = js.native
        def update_row_in_table(table: String, condition_column_name: String, condition_value: Any, error: Any, rest:Any*):Boolean = js.native
        def update_row_in_table_v(table: String, condition_column_name: String, condition_value: Any, col_names: Any, values: Any):Boolean = js.native
        def value_to_sql_string(from: Any):String = js.native
    }
    @js.native
    object Connection extends js.Object {
        def error_quark():Any = js.native
        def open_from_dsn(dsn: String, auth_string: String, options: Double):Connection = js.native
        def open_from_string(provider_name: String, cnc_string: String, auth_string: String, options: Double):Connection = js.native
        def open_sqlite(directory: String, filename: String, auto_unlink: Boolean):Connection = js.native
        def string_split(string: String, out_cnc_params: String, out_provider: String, out_username: String, out_password: String):Unit = js.native
        def new_from_dsn(dsn: String, auth_string: String, options: Double):Connection = js.native
        def new_from_string(provider_name: String, cnc_string: String, auth_string: String, options: Double):Connection = js.native
    }
    @js.native
    class ConnectionEvent extends GObject.Object {
        def get_code():Any = js.native
        def get_description():String = js.native
        def get_event_type():Double = js.native
        def get_gda_code():Double = js.native
        def get_source():String = js.native
        def get_sqlstate():String = js.native
        def set_code(code: Any):Unit = js.native
        def set_description(description: String):Unit = js.native
        def set_event_type(type0: Double):Unit = js.native
        def set_gda_code(code: Double):Unit = js.native
        def set_source(source: String):Unit = js.native
        def set_sqlstate(sqlstate: String):Unit = js.native
    }
    @js.native
    class DataAccessWrapper extends GObject.Object {
        def set_mapping(mapping: js.Array[Any], mapping_size: Any):Boolean = js.native
    }
    @js.native
    class DataComparator extends GObject.Object {
        def this(config: js.Any) = this()
        def compute_diff():Boolean = js.native
        def get_diff(pos: Any):Any = js.native
        def get_n_diffs():Any = js.native
        def set_key_columns(col_numbers: js.Array[Any], nb_cols: Any):Unit = js.native
    }
    @js.native
    object DataComparator extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class DataModelArray extends GObject.Object {
        def clear():Unit = js.native
        def get_row(row: Any):Row = js.native
        def set_n_columns(cols: Any):Unit = js.native
    }
    @js.native
    object DataModelArray extends js.Object {
        def new_with_g_types(cols: Any, rest:Any*):Any = js.native
        def new_with_g_types_v(cols: Any, types: js.Array[Any]):Any = js.native
    }
    @js.native
    class DataModelDir extends GObject.Object {
        def clean_errors():Unit = js.native
        def get_errors():Any = js.native
    }
    @js.native
    class DataModelImport extends GObject.Object {
        def clean_errors():Unit = js.native
        def get_errors():Any = js.native
    }
    @js.native
    object DataModelImport extends js.Object {
        def new_file(filename: String, random_access: Boolean, options: Set):Any = js.native
        def new_mem(data: String, random_access: Boolean, options: Set):Any = js.native
        def new_xml_node(node: Any):Any = js.native
    }
    @js.native
    class DataModelIter extends Set {
        def get_column_for_param(param: Holder):Any = js.native
        def get_holder_for_field(col: Any):Holder = js.native
        def get_row():Any = js.native
        def get_value_at(col: Any):Any = js.native
        def get_value_at_e(col: Any):Any = js.native
        def get_value_for_field(field_name: String):Any = js.native
        def invalidate_contents():Unit = js.native
        override def is_valid():Boolean = js.native
        def move_next():Boolean = js.native
        def move_prev():Boolean = js.native
        def move_to_row(row: Any):Boolean = js.native
        def set_value_at(col: Any, value: Any):Boolean = js.native
    }
    @js.native
    object DataModelIter extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class DataPivot extends GObject.Object {
        def add_data(aggregate_type0: Double, field: String, alias: String):Boolean = js.native
        def add_field(field_type0: Double, field: String, alias: String):Boolean = js.native
        def populate():Boolean = js.native
    }
    @js.native
    object DataPivot extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class DataProxy extends GObject.Object {
        def this(config: js.Any) = this()
        def alter_value_attributes(proxy_row: Any, col: Any, alter_flags: Double):Unit = js.native
        def apply_all_changes():Boolean = js.native
        def apply_row_changes(proxy_row: Any):Boolean = js.native
        def cancel_all_changes():Boolean = js.native
        def cancel_row_changes(proxy_row: Any, col: Any):Unit = js.native
        def delete(proxy_row: Any):Unit = js.native
        def get_filter_expr():String = js.native
        def get_filtered_n_rows():Any = js.native
        def get_n_modified_rows():Any = js.native
        def get_n_new_rows():Any = js.native
        def get_proxied_model():Any = js.native
        def get_proxied_model_n_cols():Any = js.native
        def get_proxied_model_n_rows():Any = js.native
        def get_proxied_model_row(proxy_row: Any):Any = js.native
        def get_sample_end():Any = js.native
        def get_sample_size():Any = js.native
        def get_sample_start():Any = js.native
        def get_value_attributes(proxy_row: Any, col: Any):Double = js.native
        def get_values(proxy_row: Any, cols_index: js.Array[Any], n_cols: Any):Any = js.native
        def has_changed():Boolean = js.native
        def is_read_only():Boolean = js.native
        def row_has_changed(proxy_row: Any):Boolean = js.native
        def row_is_deleted(proxy_row: Any):Boolean = js.native
        def row_is_inserted(proxy_row: Any):Boolean = js.native
        def set_filter_expr(filter_expr: String):Boolean = js.native
        def set_ordering_column(col: Any):Boolean = js.native
        def set_sample_size(sample_size: Any):Unit = js.native
        def set_sample_start(sample_start: Any):Unit = js.native
        def undelete(proxy_row: Any):Unit = js.native
    }
    @js.native
    object DataProxy extends js.Object {
        def error_quark():Any = js.native
        def new_with_data_model(model: Any):DataProxy = js.native
    }
    @js.native
    class DataSelect extends GObject.Object {
        def compute_columns_attributes():Boolean = js.native
        def compute_modification_statements():Boolean = js.native
        def compute_modification_statements_ext(cond_type0: Double):Boolean = js.native
        def compute_row_selection_condition():Boolean = js.native
        def get_connection():Connection = js.native
        def prepare_for_offline():Boolean = js.native
        def rerun():Boolean = js.native
        def set_modification_statement(mod_stmt: Statement):Boolean = js.native
        def set_modification_statement_sql(sql: String):Boolean = js.native
        def set_row_selection_condition(expr: Any):Boolean = js.native
        def set_row_selection_condition_sql(sql_where: String):Boolean = js.native
    }
    @js.native
    object DataSelect extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class HandlerBin extends GObject.Object {
    }
    @js.native
    class HandlerBoolean extends GObject.Object {
    }
    @js.native
    class HandlerNumerical extends GObject.Object {
    }
    @js.native
    class HandlerString extends GObject.Object {
    }
    @js.native
    object HandlerString extends js.Object {
        def new_with_provider(prov: ServerProvider, cnc: Connection):Any = js.native
    }
    @js.native
    class HandlerTime extends GObject.Object {
        def get_format(type0: Any):String = js.native
        def get_no_locale_str_from_value(value: Any):String = js.native
        def set_sql_spec(first: Double, sec: Double, third: Double, separator: Any, twodigits_years: Boolean):Unit = js.native
        def set_str_spec(first: Double, sec: Double, third: Double, separator: Any, twodigits_years: Boolean):Unit = js.native
    }
    @js.native
    object HandlerTime extends js.Object {
        def new_no_locale():Any = js.native
    }
    @js.native
    class HandlerType extends GObject.Object {
    }
    @js.native
    class Holder extends GObject.Object {
        def this(config: js.Any) = this()
        def copy():Holder = js.native
        def force_invalid():Unit = js.native
        def force_invalid_e(error: Any):Unit = js.native
        def get_alphanum_id():String = js.native
        def get_attribute(attribute: String):Any = js.native
        def get_bind():Holder = js.native
        def get_default_value():Any = js.native
        def get_g_type():Any = js.native
        def get_id():String = js.native
        def get_not_null():Boolean = js.native
        def get_source_model(col: Any):Any = js.native
        def get_value():Any = js.native
        def get_value_str(dh: Any):String = js.native
        def is_valid():Boolean = js.native
        def is_valid_e():Boolean = js.native
        def set_attribute(attribute: String, value: Any, destroy: Any):Unit = js.native
        def set_bind(bind_to: Holder):Boolean = js.native
        def set_default_value(value: Any):Unit = js.native
        def set_not_null(not_null: Boolean):Unit = js.native
        def set_source_model(model: Any, col: Any):Boolean = js.native
        def set_value(value: Any):Boolean = js.native
        def set_value_str(dh: Any, value: String):Boolean = js.native
        def set_value_to_default():Boolean = js.native
        def take_static_value(value: Any, value_changed: Boolean):Any = js.native
        def take_value(value: Any):Boolean = js.native
        def value_is_default():Boolean = js.native
    }
    @js.native
    object Holder extends js.Object {
        def error_quark():Any = js.native
        def new_inline(type0: Any, id: String, rest:Any*):Holder = js.native
    }
    @js.native
    class MetaStore extends GObject.Object {
        def this(config: js.Any) = this()
        def create_modify_data_model(table_name: String):Any = js.native
        def declare_foreign_key(mstruct: MetaStruct, fk_name: String, catalog: String, schema: String, table: String, ref_catalog: String, ref_schema: String, ref_table: String, nb_cols: Any, colnames: js.Array[String], ref_colnames: js.Array[String]):Boolean = js.native
        def extract(select_sql: String, error: Any, rest:Any*):Any = js.native
        def extract_v(select_sql: String, vars: Any):Any = js.native
        def get_attribute_value(att_name: String, att_value: String):Boolean = js.native
        def get_internal_connection():Connection = js.native
        def get_version():Any = js.native
        def modify(table_name: String, new_data: Any, condition: String, error: Any, rest:Any*):Boolean = js.native
        def modify_v(table_name: String, new_data: Any, condition: String, nvalues: Any, value_names: js.Array[String], values: js.Array[Any]):Boolean = js.native
        def modify_with_context(context: Any, new_data: Any):Boolean = js.native
        def schema_add_custom_object(xml_description: String):Boolean = js.native
        def schema_get_all_tables():Any = js.native
        def schema_get_depend_tables(table_name: String):Any = js.native
        def schema_get_structure():MetaStruct = js.native
        def schema_remove_custom_object(obj_name: String):Boolean = js.native
        def set_attribute_value(att_name: String, att_value: String):Boolean = js.native
        def set_identifiers_style(style: Double):Unit = js.native
        def set_reserved_keywords_func(func: Any):Unit = js.native
        def undeclare_foreign_key(mstruct: MetaStruct, fk_name: String, catalog: String, schema: String, table: String, ref_catalog: String, ref_schema: String, ref_table: String):Boolean = js.native
    }
    @js.native
    object MetaStore extends js.Object {
        def error_quark():Any = js.native
        def sql_identifier_quote(id: String, cnc: Connection):String = js.native
        def new_with_file(file_name: String):MetaStore = js.native
    }
    @js.native
    class MetaStruct extends GObject.Object {
        def this(config: js.Any) = this()
        def complement(type0: Double, catalog: Any, schema: Any, name: Any):Any = js.native
        def complement_all():Boolean = js.native
        def complement_default():Boolean = js.native
        def complement_depend(dbo: Any):Boolean = js.native
        def complement_schema(catalog: Any, schema: Any):Boolean = js.native
        def dump_as_graph(info: Double):String = js.native
        def get_all_db_objects():Any = js.native
        def get_db_object(catalog: Any, schema: Any, name: Any):Any = js.native
        def get_table_column(table: Any, col_name: Any):Any = js.native
        def load_from_xml_file(catalog: String, schema: String, xml_spec_file: String):Boolean = js.native
        def sort_db_objects(sort_type0: Double):Boolean = js.native
    }
    @js.native
    object MetaStruct extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class PStmt extends GObject.Object {
        def copy_contents(dest: PStmt):Unit = js.native
        def get_gda_statement():Statement = js.native
        def set_gda_statement(stmt: Statement):Unit = js.native
    }
    @js.native
    class RepetitiveStatement extends GObject.Object {
        def this(config: js.Any) = this()
        def append_set(values: Set, make_copy: Boolean):Boolean = js.native
        def get_all_sets():Any = js.native
        def get_template_set(set: Set):Boolean = js.native
    }
    @js.native
    class Row extends GObject.Object {
        def this(config: js.Any) = this()
        def get_length():Any = js.native
        def get_value(num: Any):Any = js.native
        def invalidate_value(value: Any):Unit = js.native
        def invalidate_value_e(value: Any, error: Any):Unit = js.native
        def value_is_valid(value: Any):Boolean = js.native
        def value_is_valid_e(value: Any):Boolean = js.native
    }
    @js.native
    class ServerOperation extends GObject.Object {
        def this(config: js.Any) = this()
        def add_item_to_sequence(seq_path: String):Any = js.native
        def del_item_from_sequence(item_path: String):Boolean = js.native
        def get_node_info(path_format: String, rest:Any*):Any = js.native
        def get_node_parent(path: String):String = js.native
        def get_node_path_portion(path: String):String = js.native
        def get_node_type(path: String, status: Double):Double = js.native
        def get_op_type():Double = js.native
        def get_root_nodes():js.Array[String] = js.native
        def get_sequence_item_names(path: String):js.Array[String] = js.native
        def get_sequence_max_size(path: String):Any = js.native
        def get_sequence_min_size(path: String):Any = js.native
        def get_sequence_name(path: String):String = js.native
        def get_sequence_size(path: String):Any = js.native
        def get_sql_identifier_at(cnc: Connection, prov: ServerProvider, path_format: String, rest:Any*):String = js.native
        def get_sql_identifier_at_path(cnc: Connection, prov: ServerProvider, path: String):String = js.native
        def get_value_at(path_format: String, rest:Any*):Any = js.native
        def get_value_at_path(path: String):Any = js.native
        def is_valid(xml_file: String):Boolean = js.native
        def load_data_from_xml(node: Any):Boolean = js.native
        def perform_create_database(provider: String):Boolean = js.native
        def perform_create_table():Boolean = js.native
        def perform_drop_database(provider: String):Boolean = js.native
        def perform_drop_table():Boolean = js.native
        def save_data_to_xml():Any = js.native
        def set_value_at(value: String, error: Any, path_format: String, rest:Any*):Boolean = js.native
        def set_value_at_path(value: String, path: String):Boolean = js.native
    }
    @js.native
    object ServerOperation extends js.Object {
        def error_quark():Any = js.native
        def op_type_to_string(type0: Double):String = js.native
        def prepare_create_database(provider: String, db_name: String):ServerOperation = js.native
        def prepare_create_table(cnc: Connection, table_name: String, error: Any, rest:Any*):ServerOperation = js.native
        def prepare_drop_database(provider: String, db_name: String):ServerOperation = js.native
        def prepare_drop_table(cnc: Connection, table_name: String):ServerOperation = js.native
        def string_to_op_type(str: String):Double = js.native
    }
    @js.native
    class ServerProvider extends GObject.Object {
        def create_operation(cnc: Connection, type0: Double, options: Set):ServerOperation = js.native
        def create_parser(cnc: Connection):SqlParser = js.native
        def escape_string(cnc: Connection, str: String):String = js.native
        def find_file(inst_dir: String, filename: String):String = js.native
        def get_data_handler_dbms(cnc: Connection, for_type0: String):Any = js.native
        def get_data_handler_default(cnc: Connection, type0: Any, dbms_type0: String):Any = js.native
        def get_data_handler_g_type(cnc: Connection, for_type0: Any):Any = js.native
        def get_default_dbms_type(cnc: Connection, type0: Any):String = js.native
        def get_name():String = js.native
        def get_server_version(cnc: Connection):String = js.native
        def get_version():String = js.native
        def handler_declare(dh: Any, cnc: Connection, g_type0: Any, dbms_type0: String):Unit = js.native
        def handler_find(cnc: Connection, g_type0: Any, dbms_type0: String):Any = js.native
        def handler_use_default(type0: Any):Any = js.native
        def internal_get_parser():SqlParser = js.native
        def perform_operation(cnc: Connection, op: ServerOperation):Boolean = js.native
        def perform_operation_default(cnc: Connection, op: ServerOperation):Boolean = js.native
        def render_operation(cnc: Connection, op: ServerOperation):String = js.native
        def string_to_value(cnc: Connection, string: String, preferred_type0: Any, dbms_type0: String):Any = js.native
        def supports_feature(cnc: Connection, feature: Double):Boolean = js.native
        def supports_operation(cnc: Connection, type0: Double, options: Set):Boolean = js.native
        def unescape_string(cnc: Connection, str: String):String = js.native
        def value_to_sql_string(cnc: Connection, from: Any):String = js.native
    }
    @js.native
    object ServerProvider extends js.Object {
        def error_quark():Any = js.native
        def load_file_contents(inst_dir: String, data_dir: String, filename: String):String = js.native
    }
    @js.native
    class Set extends GObject.Object {
        def this(config: js.Any) = this()
        def add_holder(holder: Holder):Boolean = js.native
        def copy():Set = js.native
        def get_group(holder: Holder):Any = js.native
        def get_holder(holder_id: String):Holder = js.native
        def get_holder_value(holder_id: String):Any = js.native
        def get_node(holder: Holder):Any = js.native
        def get_nth_holder(pos: Any):Holder = js.native
        def get_source(holder: Holder):Any = js.native
        def get_source_for_model(model: Any):Any = js.native
        def is_valid():Boolean = js.native
        def merge_with_set(set_to_merge: Set):Unit = js.native
        def remove_holder(holder: Holder):Unit = js.native
        def replace_source_model(source: Any, model: Any):Unit = js.native
        def set_holder_value(error: Any, holder_id: String, rest:Any*):Boolean = js.native
    }
    @js.native
    object Set extends js.Object {
        def error_quark():Any = js.native
        def new_from_spec_node(xml_spec: Any):Set = js.native
        def new_from_spec_string(xml_spec: String):Set = js.native
        def new_inline(nb: Any, rest:Any*):Set = js.native
        def new_read_only(holders: Any):Set = js.native
    }
    @js.native
    class Short extends GObject.Object {
    }
    @js.native
    class SqlBuilder extends GObject.Object {
        def this(config: js.Any) = this()
        def add_case(test_expr: Any, else_expr: Any, rest:Any*):Any = js.native
        def add_case_v(test_expr: Any, else_expr: Any, when_array: js.Array[Any], then_array: js.Array[Any], args_size: Any):Any = js.native
        def add_cond(op: Double, op1: Any, op2: Any, op3: Any):Any = js.native
        def add_cond_v(op: Double, op_ids: js.Array[Any], op_ids_size: Any):Any = js.native
        def add_expr(dh: Any, type0: Any, rest:Any*):Any = js.native
        def add_expr_value(dh: Any, value: Any):Any = js.native
        def add_field_id(field_name: String, table_name: String):Any = js.native
        def add_field_value(field_name: String, type0: Any, rest:Any*):Unit = js.native
        def add_field_value_as_gvalue(field_name: String, value: Any):Unit = js.native
        def add_field_value_id(field_id: Any, value_id: Any):Unit = js.native
        def add_function(func_name: String, rest:Any*):Any = js.native
        def add_function_v(func_name: String, args: js.Array[Any], args_size: Any):Any = js.native
        def add_id(str: String):Any = js.native
        def add_param(param_name: String, type0: Any, nullok: Boolean):Any = js.native
        def add_sub_select(sqlst: Any):Any = js.native
        def compound_add_sub_select(sqlst: Any):Unit = js.native
        def compound_add_sub_select_from_builder(subselect: SqlBuilder):Unit = js.native
        def compound_set_type(compound_type0: Double):Unit = js.native
        def export_expression(id: Any):Any = js.native
        def get_sql_statement():Any = js.native
        def get_statement():Statement = js.native
        def import_expression(expr: Any):Any = js.native
        def import_expression_from_builder(query: SqlBuilder, expr_id: Any):Any = js.native
        def join_add_field(join_id: Any, field_name: String):Unit = js.native
        def select_add_field(field_name: String, table_name: String, alias: String):Any = js.native
        def select_add_target(table_name: String, alias: String):Any = js.native
        def select_add_target_id(table_id: Any, alias: String):Any = js.native
        def select_group_by(expr_id: Any):Unit = js.native
        def select_join_targets(left_target_id: Any, right_target_id: Any, join_type0: Double, join_expr: Any):Any = js.native
        def select_order_by(expr_id: Any, asc: Boolean, collation_name: String):Unit = js.native
        def select_set_distinct(distinct: Boolean, expr_id: Any):Unit = js.native
        def select_set_having(cond_id: Any):Unit = js.native
        def select_set_limit(limit_count_expr_id: Any, limit_offset_expr_id: Any):Unit = js.native
        def set_table(table_name: String):Unit = js.native
        def set_where(cond_id: Any):Unit = js.native
    }
    @js.native
    object SqlBuilder extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class SqlParser extends GObject.Object {
        def this(config: js.Any) = this()
        def parse_file_as_batch(filename: String):Batch = js.native
        def parse_string(sql: String, remain: String):Statement = js.native
        def parse_string_as_batch(sql: String, remain: String):Batch = js.native
        def set_overflow_error():Unit = js.native
        def set_syntax_error():Unit = js.native
    }
    @js.native
    object SqlParser extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class Statement extends GObject.Object {
        def this(config: js.Any) = this()
        def check_structure():Boolean = js.native
        def check_validity(cnc: Connection):Boolean = js.native
        def copy():Statement = js.native
        def get_parameters(out_params: Set):Boolean = js.native
        def get_statement_type():Double = js.native
        def is_useless():Boolean = js.native
        def normalize(cnc: Connection):Boolean = js.native
        def rewrite_for_default_values(params: Set, remove: Boolean):Any = js.native
        def serialize():String = js.native
        def to_sql_extended(cnc: Connection, params: Set, flags: Double, params_used: Any):String = js.native
        def to_sql_real(context: Any):String = js.native
    }
    @js.native
    object Statement extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class ThreadWrapper extends GObject.Object {
        def this(config: js.Any) = this()
        def cancel(id: Any):Boolean = js.native
        def connect_raw(instance: Object, sig_name: String, private_thread: Boolean, private_job: Boolean, callback: Any, data: Object):Any = js.native
        def disconnect(id: Any):Unit = js.native
        def execute(func: Any, arg: Object, arg_destroy_func: Any):Any = js.native
        def execute_void(func: Any, arg: Object, arg_destroy_func: Any):Any = js.native
        def fetch_result(may_lock: Boolean, exp_id: Any):Object = js.native
        def get_io_channel():Any = js.native
        def get_waiting_size():Any = js.native
        def iterate(may_block: Boolean):Unit = js.native
        def steal_signal(id: Any):Unit = js.native
        def unset_io_channel():Unit = js.native
    }
    @js.native
    object ThreadWrapper extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class TransactionStatus extends GObject.Object {
        def this(config: js.Any) = this()
        def add_event_sql(sql: String, conn_event: ConnectionEvent):Any = js.native
        def add_event_sub(sub_trans: TransactionStatus):Any = js.native
        def add_event_svp(svp_name: String):Any = js.native
        def find(str: String, destev: Any):TransactionStatus = js.native
        def find_current(destev: Any, unnamed_only: Boolean):TransactionStatus = js.native
        def free_events(event: Any, free_after: Boolean):Unit = js.native
    }
    @js.native
    class Tree extends GObject.Object {
        def this(config: js.Any) = this()
        def add_manager(manager: TreeManager):Unit = js.native
        def clean():Unit = js.native
        def dump(node: TreeNode, stream: Object):Unit = js.native
        def get_node(tree_path: String, use_names: Boolean):TreeNode = js.native
        def get_node_manager(node: TreeNode):TreeManager = js.native
        def get_node_path(node: TreeNode):String = js.native
        def get_nodes_in_path(tree_path: String, use_names: Boolean):Any = js.native
        def set_attribute(attribute: String, value: Any, destroy: Any):Unit = js.native
        def update_all():Boolean = js.native
        def update_children(node: TreeNode):Boolean = js.native
        def update_part(node: TreeNode):Boolean = js.native
    }
    @js.native
    object Tree extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class TreeManager extends GObject.Object {
        def this(config: js.Any) = this()
        def add_manager(sub: TreeManager):Unit = js.native
        def add_new_node_attribute(attribute: String, value: Any):Unit = js.native
        def create_node(parent: TreeNode, name: String):TreeNode = js.native
        def get_managers():Any = js.native
        def get_node_create_func():Any = js.native
        def set_node_create_func(func: Any):Unit = js.native
    }
    @js.native
    object TreeManager extends js.Object {
        def error_quark():Any = js.native
        def new_with_func(update_func: Any):TreeManager = js.native
    }
    @js.native
    class TreeMgrColumns extends TreeManager {
        def this(config: js.Any) = this()
    }
    @js.native
    class TreeMgrLabel extends TreeManager {
        def this(config: js.Any) = this()
    }
    @js.native
    class TreeMgrSchemas extends TreeManager {
        def this(config: js.Any) = this()
    }
    @js.native
    class TreeMgrSelect extends TreeManager {
        def this(config: js.Any) = this()
    }
    @js.native
    class TreeMgrTables extends TreeManager {
        def this(config: js.Any) = this()
    }
    @js.native
    class TreeNode extends GObject.Object {
        def this(config: js.Any) = this()
        def fetch_attribute(attribute: String):Any = js.native
        def get_child_index(index: Any):TreeNode = js.native
        def get_child_name(name: String):TreeNode = js.native
        def get_children():Any = js.native
        def get_node_attribute(attribute: String):Any = js.native
        def get_parent():TreeNode = js.native
        def set_node_attribute(attribute: String, value: Any, destroy: Any):Unit = js.native
    }
    @js.native
    object TreeNode extends js.Object {
        def error_quark():Any = js.native
    }
    @js.native
    class UShort extends GObject.Object {
    }
    @js.native
    class XaTransaction extends GObject.Object {
        def this(config: js.Any) = this()
        def begin():Boolean = js.native
        def commit(cnc_to_recover: Any):Boolean = js.native
        def commit_recovered(cnc_to_recover: Any):Boolean = js.native
        def register_connection(cnc: Connection, branch: String):Boolean = js.native
        def rollback():Boolean = js.native
        def unregister_connection(cnc: Connection):Unit = js.native
    }
    @js.native
    object XaTransaction extends js.Object {
        def error_quark():Any = js.native
        def string_to_id(str: String):Any = js.native
    }
}