// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface TextDocumentSaveRegistrationOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.TextDocumentSaveRegistrationOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  boolean hasTextDocumentRegistrationOptions();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  protocol.TextDocumentRegistrationOptions getTextDocumentRegistrationOptions();
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  protocol.TextDocumentRegistrationOptionsOrBuilder getTextDocumentRegistrationOptionsOrBuilder();

  /**
   * <pre>
   * Optional. The client is supposed to include the content on save.
   * </pre>
   *
   * <code>bool include_text = 2;</code>
   */
  boolean getIncludeText();
}
