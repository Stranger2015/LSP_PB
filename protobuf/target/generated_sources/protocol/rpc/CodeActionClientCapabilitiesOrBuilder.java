// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface CodeActionClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.CodeActionClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether code action supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <pre>
   * The client supports code action literals as a valid
   * response of the `textDocument/codeAction` request.
   * &#64;since 3.8.0
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionClientCapabilities.CodeActionLiteralSupport code_action_literal_support = 2;</code>
   */
  boolean hasCodeActionLiteralSupport();
  /**
   * <pre>
   * The client supports code action literals as a valid
   * response of the `textDocument/codeAction` request.
   * &#64;since 3.8.0
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionClientCapabilities.CodeActionLiteralSupport code_action_literal_support = 2;</code>
   */
  protocol.rpc.CodeActionClientCapabilities.CodeActionLiteralSupport getCodeActionLiteralSupport();
  /**
   * <pre>
   * The client supports code action literals as a valid
   * response of the `textDocument/codeAction` request.
   * &#64;since 3.8.0
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionClientCapabilities.CodeActionLiteralSupport code_action_literal_support = 2;</code>
   */
  protocol.rpc.CodeActionClientCapabilities.CodeActionLiteralSupportOrBuilder getCodeActionLiteralSupportOrBuilder();

  /**
   * <pre>
   * Optional. Whether code action supports the `isPreferred` property.
   * &#64;since 3.15.0
   * </pre>
   *
   * <code>bool is_preferred_support = 3;</code>
   */
  boolean getIsPreferredSupport();
}