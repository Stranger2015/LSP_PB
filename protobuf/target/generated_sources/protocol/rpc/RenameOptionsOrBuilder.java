// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface RenameOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.RenameOptions)
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
   * Optional. Renames should be checked and tested before being executed.
   * </pre>
   *
   * <code>bool prepare_provider = 2;</code>
   */
  boolean getPrepareProvider();
}