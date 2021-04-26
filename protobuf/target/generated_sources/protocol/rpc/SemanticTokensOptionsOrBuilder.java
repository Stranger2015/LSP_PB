// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface SemanticTokensOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.SemanticTokensOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  boolean hasWorkDoneProgressOptions();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  protocol.WorkDoneProgressOptions getWorkDoneProgressOptions();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  protocol.WorkDoneProgressOptionsOrBuilder getWorkDoneProgressOptionsOrBuilder();

  /**
   * <pre>
   * The legend used by the server
   * </pre>
   *
   * <code>.protocol.rpc.SemanticTokensLegend legend = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasLegend();
  /**
   * <pre>
   * The legend used by the server
   * </pre>
   *
   * <code>.protocol.rpc.SemanticTokensLegend legend = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.SemanticTokensLegend getLegend();
  /**
   * <pre>
   * The legend used by the server
   * </pre>
   *
   * <code>.protocol.rpc.SemanticTokensLegend legend = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.SemanticTokensLegendOrBuilder getLegendOrBuilder();

  /**
   * <code>bool enable_range = 3;</code>
   */
  boolean getEnableRange();

  /**
   * <code>.google.protobuf.NullValue empty = 4;</code>
   */
  int getEmptyValue();
  /**
   * <code>.google.protobuf.NullValue empty = 4;</code>
   */
  com.google.protobuf.NullValue getEmpty();

  /**
   * <code>bool enable_full = 5;</code>
   */
  boolean getEnableFull();

  /**
   * <code>bool delta = 6;</code>
   */
  boolean getDelta();

  public protocol.rpc.SemanticTokensOptions.RangeCase getRangeCase();

  public protocol.rpc.SemanticTokensOptions.FullCase getFullCase();
}
