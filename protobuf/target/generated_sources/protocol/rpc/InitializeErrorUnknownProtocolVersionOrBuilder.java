// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface InitializeErrorUnknownProtocolVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.InitializeErrorUnknownProtocolVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the protocol version provided by the client can't be handled by the server.
   * This initialize error got replaced by client capabilities. There is
   * no version handshake in version 3.0x.
   * </pre>
   *
   * <code>int32 unknown_protocol_version = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getUnknownProtocolVersion();
}
