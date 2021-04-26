// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface RenameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.RenameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  boolean hasTextDocumentPositionParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  protocol.TextDocumentPositionParams getTextDocumentPositionParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  protocol.TextDocumentPositionParamsOrBuilder getTextDocumentPositionParamsOrBuilder();

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  boolean hasWorkDoneProgressParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  protocol.rpc.WorkDoneProgressParams getWorkDoneProgressParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  protocol.rpc.WorkDoneProgressParamsOrBuilder getWorkDoneProgressParamsOrBuilder();

  /**
   * <pre>
   * The new name of the symbol. If the given name is not valid the
   * request must return a [ResponseError](#ResponseError) with an
   * appropriate message set.
   * (-- api-linter: core::0122::name-suffix=disabled --)
   * </pre>
   *
   * <code>string new_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getNewName();
  /**
   * <pre>
   * The new name of the symbol. If the given name is not valid the
   * request must return a [ResponseError](#ResponseError) with an
   * appropriate message set.
   * (-- api-linter: core::0122::name-suffix=disabled --)
   * </pre>
   *
   * <code>string new_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getNewNameBytes();
}
