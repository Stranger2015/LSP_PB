// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ParameterInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ParameterInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.protocol.rpc.ParameterInformation.Offset offset = 2;</code>
   */
  protocol.rpc.ParameterInformation.Offset getOffset();
  /**
   * <code>.protocol.rpc.ParameterInformation.Offset offset = 2;</code>
   */
  protocol.rpc.ParameterInformation.OffsetOrBuilder getOffsetOrBuilder();

  /**
   * <code>string markup = 3;</code>
   */
  java.lang.String getMarkup();
  /**
   * <code>string markup = 3;</code>
   */
  com.google.protobuf.ByteString
      getMarkupBytes();

  /**
   * <code>.protocol.MarkupContent markup_content = 4;</code>
   */
  protocol.MarkupContent getMarkupContent();
  /**
   * <code>.protocol.MarkupContent markup_content = 4;</code>
   */
  protocol.MarkupContentOrBuilder getMarkupContentOrBuilder();

  public protocol.rpc.ParameterInformation.LabelCase getLabelCase();

  public protocol.rpc.ParameterInformation.DocumentationCase getDocumentationCase();
}
