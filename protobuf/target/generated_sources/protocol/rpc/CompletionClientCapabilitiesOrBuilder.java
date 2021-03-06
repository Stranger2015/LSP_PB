// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface CompletionClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.CompletionClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether completion supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  boolean getDynamicRegistration();

  /**
   * <pre>
   * The client supports the following `CompletionItem` specific
   * capabilities.
   * </pre>
   *
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItem completion_item = 2;</code>
   */
  boolean hasCompletionItem();
  /**
   * <pre>
   * The client supports the following `CompletionItem` specific
   * capabilities.
   * </pre>
   *
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItem completion_item = 2;</code>
   */
  protocol.rpc.CompletionClientCapabilities.CompletionItem getCompletionItem();
  /**
   * <pre>
   * The client supports the following `CompletionItem` specific
   * capabilities.
   * </pre>
   *
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItem completion_item = 2;</code>
   */
  protocol.rpc.CompletionClientCapabilities.CompletionItemOrBuilder getCompletionItemOrBuilder();

  /**
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItemKind completion_item_kind = 3;</code>
   */
  boolean hasCompletionItemKind();
  /**
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItemKind completion_item_kind = 3;</code>
   */
  protocol.rpc.CompletionClientCapabilities.CompletionItemKind getCompletionItemKind();
  /**
   * <code>.protocol.rpc.CompletionClientCapabilities.CompletionItemKind completion_item_kind = 3;</code>
   */
  protocol.rpc.CompletionClientCapabilities.CompletionItemKindOrBuilder getCompletionItemKindOrBuilder();

  /**
   * <pre>
   * Optional. The client supports to send additional context information for a
   * `textDocument/completion` request.
   * </pre>
   *
   * <code>bool context_support = 4;</code>
   */
  boolean getContextSupport();
}
