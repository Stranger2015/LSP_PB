// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ExecuteCommandResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ExecuteCommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Any any = 1;</code>
   */
  com.google.protobuf.Any getAny();
  /**
   * <code>.google.protobuf.Any any = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getAnyOrBuilder();

  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.ExecuteCommandResponse.ExecuteCommandCase getExecuteCommandCase();
}
