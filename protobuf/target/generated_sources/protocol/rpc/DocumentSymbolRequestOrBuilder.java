// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface DocumentSymbolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.DocumentSymbolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  boolean hasWorkDoneProgressParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  protocol.rpc.WorkDoneProgressParams getWorkDoneProgressParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  protocol.rpc.WorkDoneProgressParamsOrBuilder getWorkDoneProgressParamsOrBuilder();

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  boolean hasPartialResultParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  protocol.rpc.PartialResultParams getPartialResultParams();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  protocol.rpc.PartialResultParamsOrBuilder getPartialResultParamsOrBuilder();

  /**
   * <pre>
   * The text document.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasTextDocument();
  /**
   * <pre>
   * The text document.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.TextDocumentIdentifier getTextDocument();
  /**
   * <pre>
   * The text document.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.TextDocumentIdentifierOrBuilder getTextDocumentOrBuilder();
}