// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface WorkspaceSymbolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.WorkspaceSymbolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.WorkspaceSymbolsResponse.SymbolInformations symbol_informations = 1;</code>
   */
  protocol.rpc.WorkspaceSymbolsResponse.SymbolInformations getSymbolInformations();
  /**
   * <code>.protocol.rpc.WorkspaceSymbolsResponse.SymbolInformations symbol_informations = 1;</code>
   */
  protocol.rpc.WorkspaceSymbolsResponse.SymbolInformationsOrBuilder getSymbolInformationsOrBuilder();

  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.WorkspaceSymbolsResponse.WorkspaceSymbolsResponseCase getWorkspaceSymbolsResponseCase();
}