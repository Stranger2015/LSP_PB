// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ImplementationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ImplementationRequest)
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
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  boolean hasPartialResultParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  protocol.rpc.PartialResultParams getPartialResultParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  protocol.rpc.PartialResultParamsOrBuilder getPartialResultParamsOrBuilder();
}
