// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface RangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.Range)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasStart();
  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Position getStart();
  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.PositionOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasEnd();
  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Position getEnd();
  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.PositionOrBuilder getEndOrBuilder();
}
