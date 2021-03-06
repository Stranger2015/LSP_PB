// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface DocumentOnTypeFormattingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.DocumentOnTypeFormattingRequest)
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
   * The character that has been typed.
   * </pre>
   *
   * <code>string ch = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCh();
  /**
   * <pre>
   * The character that has been typed.
   * </pre>
   *
   * <code>string ch = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getChBytes();

  /**
   * <pre>
   * The format options.
   * </pre>
   *
   * <code>.protocol.rpc.FormattingOptions options = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasOptions();
  /**
   * <pre>
   * The format options.
   * </pre>
   *
   * <code>.protocol.rpc.FormattingOptions options = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.FormattingOptions getOptions();
  /**
   * <pre>
   * The format options.
   * </pre>
   *
   * <code>.protocol.rpc.FormattingOptions options = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.FormattingOptionsOrBuilder getOptionsOrBuilder();
}
