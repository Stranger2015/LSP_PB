// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface TextDocumentItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.TextDocumentItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text document's URI.
   * </pre>
   *
   * <code>.uri.URI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasUri();
  /**
   * <pre>
   * The text document's URI.
   * </pre>
   *
   * <code>.uri.URI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  uri.URI getUri();
  /**
   * <pre>
   * The text document's URI.
   * </pre>
   *
   * <code>.uri.URI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  uri.URIOrBuilder getUriOrBuilder();

  /**
   * <pre>
   * The text document's language identifier.
   * </pre>
   *
   * <code>string language_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getLanguageId();
  /**
   * <pre>
   * The text document's language identifier.
   * </pre>
   *
   * <code>string language_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getLanguageIdBytes();

  /**
   * <pre>
   * The version number of this document (it will increase after each
   * change, including undo/redo).
   * </pre>
   *
   * <code>int32 version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getVersion();

  /**
   * <pre>
   * The content of the opened text document.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * The content of the opened text document.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
