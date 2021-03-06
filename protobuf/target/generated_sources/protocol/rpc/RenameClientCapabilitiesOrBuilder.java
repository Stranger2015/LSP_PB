// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface RenameClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.RenameClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether rename supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <pre>
   * Optional. Client supports testing for validity of rename operations
   * before execution.
   * &#64;since version 3.12.0
   * </pre>
   *
   * <code>bool prepare_support = 2;</code>
   */
  boolean getPrepareSupport();
}
