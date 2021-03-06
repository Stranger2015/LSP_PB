// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Title of the command, like `save`.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title of the command, like `save`.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The identifier of the actual command handler.
   * </pre>
   *
   * <code>string command = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCommand();
  /**
   * <pre>
   * The identifier of the actual command handler.
   * </pre>
   *
   * <code>string command = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getCommandBytes();

  /**
   * <pre>
   * Arguments that the command handler should be
   * invoked with.
   * (-- api-linter: core::0140::reserved-words=disabled --)
   * </pre>
   *
   * <code>repeated .google.protobuf.Any arguments = 3;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getArgumentsList();
  /**
   * <pre>
   * Arguments that the command handler should be
   * invoked with.
   * (-- api-linter: core::0140::reserved-words=disabled --)
   * </pre>
   *
   * <code>repeated .google.protobuf.Any arguments = 3;</code>
   */
  com.google.protobuf.Any getArguments(int index);
  /**
   * <pre>
   * Arguments that the command handler should be
   * invoked with.
   * (-- api-linter: core::0140::reserved-words=disabled --)
   * </pre>
   *
   * <code>repeated .google.protobuf.Any arguments = 3;</code>
   */
  int getArgumentsCount();
  /**
   * <pre>
   * Arguments that the command handler should be
   * invoked with.
   * (-- api-linter: core::0140::reserved-words=disabled --)
   * </pre>
   *
   * <code>repeated .google.protobuf.Any arguments = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getArgumentsOrBuilderList();
  /**
   * <pre>
   * Arguments that the command handler should be
   * invoked with.
   * (-- api-linter: core::0140::reserved-words=disabled --)
   * </pre>
   *
   * <code>repeated .google.protobuf.Any arguments = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getArgumentsOrBuilder(
      int index);
}
