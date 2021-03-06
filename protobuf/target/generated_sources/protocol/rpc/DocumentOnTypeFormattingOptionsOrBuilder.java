// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface DocumentOnTypeFormattingOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.DocumentOnTypeFormattingOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A character on which formatting should be triggered, like `}`.
   * </pre>
   *
   * <code>string first_trigger_character = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getFirstTriggerCharacter();
  /**
   * <pre>
   * A character on which formatting should be triggered, like `}`.
   * </pre>
   *
   * <code>string first_trigger_character = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getFirstTriggerCharacterBytes();

  /**
   * <pre>
   * More trigger characters.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue more_trigger_character = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getMoreTriggerCharacterList();
  /**
   * <pre>
   * More trigger characters.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue more_trigger_character = 2;</code>
   */
  com.google.protobuf.StringValue getMoreTriggerCharacter(int index);
  /**
   * <pre>
   * More trigger characters.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue more_trigger_character = 2;</code>
   */
  int getMoreTriggerCharacterCount();
  /**
   * <pre>
   * More trigger characters.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue more_trigger_character = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getMoreTriggerCharacterOrBuilderList();
  /**
   * <pre>
   * More trigger characters.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue more_trigger_character = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMoreTriggerCharacterOrBuilder(
      int index);
}
