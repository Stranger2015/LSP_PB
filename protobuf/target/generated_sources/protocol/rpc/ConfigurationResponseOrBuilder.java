// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ConfigurationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ConfigurationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.rpc.ConfigurationResponse.Anys anys = 1;</code>
   */
  protocol.rpc.ConfigurationResponse.Anys getAnys();
  /**
   * <code>.protocol.rpc.ConfigurationResponse.Anys anys = 1;</code>
   */
  protocol.rpc.ConfigurationResponse.AnysOrBuilder getAnysOrBuilder();

  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.Error getError();
  /**
   * <code>.protocol.Error error = 2;</code>
   */
  protocol.ErrorOrBuilder getErrorOrBuilder();

  public protocol.rpc.ConfigurationResponse.ConfigurationResponseCase getConfigurationResponseCase();
}
