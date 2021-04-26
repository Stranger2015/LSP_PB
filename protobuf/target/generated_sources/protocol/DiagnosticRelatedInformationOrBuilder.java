// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface DiagnosticRelatedInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.DiagnosticRelatedInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Location getLocation();
  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * The message of this related diagnostic information.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The message of this related diagnostic information.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}