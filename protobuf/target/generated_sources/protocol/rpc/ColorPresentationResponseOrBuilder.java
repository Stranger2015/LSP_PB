// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ColorPresentationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ColorPresentationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.ColorPresentationResponse.Result result = 1;</code>
   */
  protocol.rpc.ColorPresentationResponse.Result getResult();
  /**
   * <code>.protocol.rpc.ColorPresentationResponse.Result result = 1;</code>
   */
  protocol.rpc.ColorPresentationResponse.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.protocol.rpc.ColorPresentationResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.ColorPresentationResponse.PartialResult getPartialResult();
  /**
   * <code>.protocol.rpc.ColorPresentationResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.ColorPresentationResponse.PartialResultOrBuilder getPartialResultOrBuilder();

  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.ColorPresentationResponse.ColorPresentationResponseCase getColorPresentationResponseCase();
}