// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface WorkDoneProgressParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.WorkDoneProgressParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasWorkDoneToken();
  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.ProgressToken getWorkDoneToken();
  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.ProgressTokenOrBuilder getWorkDoneTokenOrBuilder();
}
