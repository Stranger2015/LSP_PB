// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface CodeActionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.CodeActionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.CodeActionResponse.Result result = 1;</code>
   */
  protocol.rpc.CodeActionResponse.Result getResult();
  /**
   * <code>.protocol.rpc.CodeActionResponse.Result result = 1;</code>
   */
  protocol.rpc.CodeActionResponse.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.protocol.rpc.CodeActionResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.CodeActionResponse.PartialResult getPartialResult();
  /**
   * <code>.protocol.rpc.CodeActionResponse.PartialResult partial_result = 2;</code>
   */
  protocol.rpc.CodeActionResponse.PartialResultOrBuilder getPartialResultOrBuilder();

  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.CodeActionResponse.CodeActionResponseCase getCodeActionResponseCase();
}