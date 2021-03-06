// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface SignatureHelpClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.SignatureHelpClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether signature help supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <code>.protocol.rpc.SignatureHelpClientCapabilities.SignatureInformation signature_information = 2;</code>
   */
  boolean hasSignatureInformation();
  /**
   * <code>.protocol.rpc.SignatureHelpClientCapabilities.SignatureInformation signature_information = 2;</code>
   */
  protocol.rpc.SignatureHelpClientCapabilities.SignatureInformation getSignatureInformation();
  /**
   * <code>.protocol.rpc.SignatureHelpClientCapabilities.SignatureInformation signature_information = 2;</code>
   */
  protocol.rpc.SignatureHelpClientCapabilities.SignatureInformationOrBuilder getSignatureInformationOrBuilder();

  /**
   * <pre>
   * Optional. The client supports to send additional context information for a
   * `textDocument/signatureHelp` request. A client that opts into
   * contextSupport will also support the `retriggerCharacters` on
   * `SignatureHelpOptions`.
   * &#64;since 3.15.0
   * </pre>
   *
   * <code>bool context_support = 3;</code>
   */
  boolean getContextSupport();
}
