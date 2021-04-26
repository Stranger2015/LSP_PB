// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface CreateFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.CreateFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The kind of CreateFile message.
   * (-- api-linter: core::0192::only-leading-comments=disabled --)
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getKind();
  /**
   * <pre>
   * The kind of CreateFile message.
   * (-- api-linter: core::0192::only-leading-comments=disabled --)
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasUri();
  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  uri.URI getUri();
  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  uri.URIOrBuilder getUriOrBuilder();

  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  protocol.CreateFileOptions getOptions();
  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  protocol.CreateFileOptionsOrBuilder getOptionsOrBuilder();
}