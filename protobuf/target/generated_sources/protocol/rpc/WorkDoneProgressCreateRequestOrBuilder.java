// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface WorkDoneProgressCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.WorkDoneProgressCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The token to be used to report progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasToken();
  /**
   * <pre>
   * The token to be used to report progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.ProgressToken getToken();
  /**
   * <pre>
   * The token to be used to report progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.ProgressTokenOrBuilder getTokenOrBuilder();
}
