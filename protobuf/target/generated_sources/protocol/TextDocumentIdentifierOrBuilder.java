// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface TextDocumentIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.TextDocumentIdentifier)
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
}