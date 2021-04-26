// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ApplyWorkspaceEditResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ApplyWorkspaceEditResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether the edit was applied or not.
   * </pre>
   *
   * <code>bool applied = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean getApplied();

  /**
   * <pre>
   * An optional textual description for why the edit was not applied.
   * This may be used may be used by the server for diagnostic
   * logging or to provide a suitable error for a request that
   * triggered the edit.
   * </pre>
   *
   * <code>.google.protobuf.StringValue failure_reason = 2;</code>
   */
  boolean hasFailureReason();
  /**
   * <pre>
   * An optional textual description for why the edit was not applied.
   * This may be used may be used by the server for diagnostic
   * logging or to provide a suitable error for a request that
   * triggered the edit.
   * </pre>
   *
   * <code>.google.protobuf.StringValue failure_reason = 2;</code>
   */
  com.google.protobuf.StringValue getFailureReason();
  /**
   * <pre>
   * An optional textual description for why the edit was not applied.
   * This may be used may be used by the server for diagnostic
   * logging or to provide a suitable error for a request that
   * triggered the edit.
   * </pre>
   *
   * <code>.google.protobuf.StringValue failure_reason = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFailureReasonOrBuilder();
}