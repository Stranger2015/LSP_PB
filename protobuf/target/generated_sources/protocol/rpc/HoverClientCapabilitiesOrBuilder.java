// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface HoverClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.HoverClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether hover supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <pre>
   * Client supports the follow content formats for the content
   * property. The order describes the preferred format of the client.
   * </pre>
   *
   * <code>repeated .protocol.MarkupKind content_format = 2;</code>
   */
  java.util.List<protocol.MarkupKind> getContentFormatList();
  /**
   * <pre>
   * Client supports the follow content formats for the content
   * property. The order describes the preferred format of the client.
   * </pre>
   *
   * <code>repeated .protocol.MarkupKind content_format = 2;</code>
   */
  int getContentFormatCount();
  /**
   * <pre>
   * Client supports the follow content formats for the content
   * property. The order describes the preferred format of the client.
   * </pre>
   *
   * <code>repeated .protocol.MarkupKind content_format = 2;</code>
   */
  protocol.MarkupKind getContentFormat(int index);
  /**
   * <pre>
   * Client supports the follow content formats for the content
   * property. The order describes the preferred format of the client.
   * </pre>
   *
   * <code>repeated .protocol.MarkupKind content_format = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getContentFormatValueList();
  /**
   * <pre>
   * Client supports the follow content formats for the content
   * property. The order describes the preferred format of the client.
   * </pre>
   *
   * <code>repeated .protocol.MarkupKind content_format = 2;</code>
   */
  int getContentFormatValue(int index);
}
