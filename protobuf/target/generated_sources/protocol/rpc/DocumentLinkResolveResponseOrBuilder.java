// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface DocumentLinkResolveResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.DocumentLinkResolveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
   */
  protocol.rpc.DocumentLink getDocumentLink();
  /**
   * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
   */
  protocol.rpc.DocumentLinkOrBuilder getDocumentLinkOrBuilder();

  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.DocumentLinkResolveResponse.DocumentLinkResolveResponseCase getDocumentLinkResolveResponseCase();
}