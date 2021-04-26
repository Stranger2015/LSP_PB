// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface WorkspaceFoldersServerCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.WorkspaceFoldersServerCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The server has support for workspace folders
   * </pre>
   *
   * <code>bool supported = 1;</code>
   */
  boolean getSupported();

  /**
   * <pre>
   * The id of registered notification.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The id of registered notification.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Whether the enable change notifications.
   * </pre>
   *
   * <code>bool enable = 3;</code>
   */
  boolean getEnable();

  public protocol.rpc.WorkspaceFoldersServerCapabilities.ChangeNotificationsCase getChangeNotificationsCase();
}
