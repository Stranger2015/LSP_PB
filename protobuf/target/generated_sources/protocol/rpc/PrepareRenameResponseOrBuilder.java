// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface PrepareRenameResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.PrepareRenameResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.Range range = 1;</code>
   */
  protocol.Range getRange();
  /**
   * <code>.protocol.Range range = 1;</code>
   */
  protocol.RangeOrBuilder getRangeOrBuilder();

  /**
   * <code>.protocol.rpc.PrepareRenameResponse.Result result = 2;</code>
   */
  protocol.rpc.PrepareRenameResponse.Result getResult();
  /**
   * <code>.protocol.rpc.PrepareRenameResponse.Result result = 2;</code>
   */
  protocol.rpc.PrepareRenameResponse.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.google.protobuf.NullValue empty = 3;</code>
   */
  int getEmptyValue();
  /**
   * <code>.google.protobuf.NullValue empty = 3;</code>
   */
  com.google.protobuf.NullValue getEmpty();

  /**
   * <code>.protocol.Error error = 4;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 4;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.PrepareRenameResponse.PrepareRenameResponseCase getPrepareRenameResponseCase();
}