// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/error.proto

package protocol;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A number indicating the error type that occurred.
   * Which may an enum value of [Code][#code].
   * </pre>
   *
   * <code>int32 code = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCode();

  /**
   * <pre>
   * A string providing a short description of the error.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A string providing a short description of the error.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * A primitive or structured value that contains additional
   * information about the error. Can be omitted.
   * </pre>
   *
   * <code>string data = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getData();
  /**
   * <pre>
   * A primitive or structured value that contains additional
   * information about the error. Can be omitted.
   * </pre>
   *
   * <code>string data = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();
}
