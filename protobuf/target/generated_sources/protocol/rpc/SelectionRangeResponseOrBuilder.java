// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface SelectionRangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.SelectionRangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.SelectionRangeResponse.Result result = 1;</code>
   */
  protocol.rpc.SelectionRangeResponse.Result getResult();
  /**
   * <code>.protocol.rpc.SelectionRangeResponse.Result result = 1;</code>
   */
  protocol.rpc.SelectionRangeResponse.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.protocol.rpc.SelectionRangeResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.SelectionRangeResponse.PartialResult getPartialResult();
  /**
   * <code>.protocol.rpc.SelectionRangeResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.SelectionRangeResponse.PartialResultOrBuilder getPartialResultOrBuilder();

  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.SelectionRangeResponse.SelectionRangeResponseCase getSelectionRangeResponseCase();
}
