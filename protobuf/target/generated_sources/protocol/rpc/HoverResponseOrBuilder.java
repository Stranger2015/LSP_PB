// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface HoverResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.HoverResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.Hover hover = 1;</code>
   */
  protocol.rpc.Hover getHover();
  /**
   * <code>.protocol.rpc.Hover hover = 1;</code>
   */
  protocol.rpc.HoverOrBuilder getHoverOrBuilder();

  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  int getEmptyValue();
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  com.google.protobuf.NullValue getEmpty();

  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.HoverResponse.CompletionResponseCase getCompletionResponseCase();
}
