// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface LogMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.LogMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The message type. See [MessageType][MessageType].
   * </pre>
   *
   * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The message type. See [MessageType][MessageType].
   * </pre>
   *
   * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.MessageType getType();

  /**
   * <pre>
   * The actual message
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The actual message
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
