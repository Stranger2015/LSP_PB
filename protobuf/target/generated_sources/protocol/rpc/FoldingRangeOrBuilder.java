// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface FoldingRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.FoldingRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The zero-based line number from where the folded range starts.
   * </pre>
   *
   * <code>int32 start_line = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getStartLine();

  /**
   * <pre>
   * The zero-based character offset from where the folded range starts. If not defined, defaults to
   * the length of the start line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_character = 2;</code>
   */
  boolean hasStartCharacter();
  /**
   * <pre>
   * The zero-based character offset from where the folded range starts. If not defined, defaults to
   * the length of the start line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_character = 2;</code>
   */
  com.google.protobuf.Int32Value getStartCharacter();
  /**
   * <pre>
   * The zero-based character offset from where the folded range starts. If not defined, defaults to
   * the length of the start line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value start_character = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getStartCharacterOrBuilder();

  /**
   * <pre>
   * The zero-based line number where the folded range ends.
   * </pre>
   *
   * <code>int32 end_line = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getEndLine();

  /**
   * <pre>
   * The zero-based character offset before the folded range ends. If not defined, defaults to the
   * length of the end line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_character = 4;</code>
   */
  boolean hasEndCharacter();
  /**
   * <pre>
   * The zero-based character offset before the folded range ends. If not defined, defaults to the
   * length of the end line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_character = 4;</code>
   */
  com.google.protobuf.Int32Value getEndCharacter();
  /**
   * <pre>
   * The zero-based character offset before the folded range ends. If not defined, defaults to the
   * length of the end line.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value end_character = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getEndCharacterOrBuilder();

  /**
   * <pre>
   * Describes the kind of the folding range such as `comment` or `region`. The kind
   * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
   * [FoldingRangeKind][FoldingRangeKind] for an enumeration of standardized kinds.
   * </pre>
   *
   * <code>.protocol.rpc.FoldingRangeKind kind = 5;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * Describes the kind of the folding range such as `comment` or `region`. The kind
   * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
   * [FoldingRangeKind][FoldingRangeKind] for an enumeration of standardized kinds.
   * </pre>
   *
   * <code>.protocol.rpc.FoldingRangeKind kind = 5;</code>
   */
  protocol.rpc.FoldingRangeKind getKind();
}