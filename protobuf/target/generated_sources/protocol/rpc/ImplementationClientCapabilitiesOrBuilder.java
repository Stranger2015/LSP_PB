// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ImplementationClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ImplementationClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether implementation supports dynamic registration. If this is set to `true`
   * the client supports the new `ImplementationRegistrationOptions` return value
   * for the corresponding server capability as well.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <pre>
   * Optional. The client supports additional metadata in the form of definition links.
   * &#64;since 3.14.0
   * </pre>
   *
   * <code>bool link_support = 2;</code>
   */
  boolean getLinkSupport();
}
