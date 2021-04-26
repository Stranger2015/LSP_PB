// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface WillSaveTextDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.WillSaveTextDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The document that will be saved.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasTextDocument();
  /**
   * <pre>
   * The document that will be saved.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.TextDocumentIdentifier getTextDocument();
  /**
   * <pre>
   * The document that will be saved.
   * </pre>
   *
   * <code>.protocol.TextDocumentIdentifier text_document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.TextDocumentIdentifierOrBuilder getTextDocumentOrBuilder();

  /**
   * <pre>
   * The [TextDocumentSaveReason][TextDocumentSaveReason].
   * </pre>
   *
   * <code>.protocol.rpc.TextDocumentSaveReason reason = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getReasonValue();
  /**
   * <pre>
   * The [TextDocumentSaveReason][TextDocumentSaveReason].
   * </pre>
   *
   * <code>.protocol.rpc.TextDocumentSaveReason reason = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.TextDocumentSaveReason getReason();
}
