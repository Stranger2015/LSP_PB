// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface TextDocumentRegistrationOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.TextDocumentRegistrationOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protocol.TextDocumentRegistrationOptions.DocumentSelector selector = 1;</code>
   */
  protocol.TextDocumentRegistrationOptions.DocumentSelector getSelector();
  /**
   * <code>.protocol.TextDocumentRegistrationOptions.DocumentSelector selector = 1;</code>
   */
  protocol.TextDocumentRegistrationOptions.DocumentSelectorOrBuilder getSelectorOrBuilder();

  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  int getEmptyValue();
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  com.google.protobuf.NullValue getEmpty();

  public protocol.TextDocumentRegistrationOptions.DocumentSelectorCase getDocumentSelectorCase();
}
