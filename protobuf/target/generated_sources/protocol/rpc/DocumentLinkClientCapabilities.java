// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentLinkClientCapabilities represents a client capabilities of `textDocument/documentLink`
 * request.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentLinkClientCapabilities}
 */
public  final class DocumentLinkClientCapabilities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentLinkClientCapabilities)
    DocumentLinkClientCapabilitiesOrBuilder {
  // Use DocumentLinkClientCapabilities.newBuilder() to construct.
  private DocumentLinkClientCapabilities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentLinkClientCapabilities() {
    dynamicRegistration_ = false;
    tooltipSupport_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentLinkClientCapabilities(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            dynamicRegistration_ = input.readBool();
            break;
          }
          case 16: {

            tooltipSupport_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkClientCapabilities_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkClientCapabilities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentLinkClientCapabilities.class, protocol.rpc.DocumentLinkClientCapabilities.Builder.class);
  }

  public static final int DYNAMIC_REGISTRATION_FIELD_NUMBER = 1;
  private boolean dynamicRegistration_;
  /**
   * <pre>
   * Optional. Whether document link supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  public boolean getDynamicRegistration() {
    return dynamicRegistration_;
  }

  public static final int TOOLTIP_SUPPORT_FIELD_NUMBER = 2;
  private boolean tooltipSupport_;
  /**
   * <pre>
   * Optional. Whether the client supports the `tooltip` property on `DocumentLink`.
   * &#64;since 3.15.0
   * </pre>
   *
   * <code>bool tooltip_support = 2;</code>
   */
  public boolean getTooltipSupport() {
    return tooltipSupport_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dynamicRegistration_ != false) {
      output.writeBool(1, dynamicRegistration_);
    }
    if (tooltipSupport_ != false) {
      output.writeBool(2, tooltipSupport_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dynamicRegistration_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, dynamicRegistration_);
    }
    if (tooltipSupport_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, tooltipSupport_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protocol.rpc.DocumentLinkClientCapabilities)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentLinkClientCapabilities other = (protocol.rpc.DocumentLinkClientCapabilities) obj;

    boolean result = true;
    result = result && (getDynamicRegistration()
        == other.getDynamicRegistration());
    result = result && (getTooltipSupport()
        == other.getTooltipSupport());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DYNAMIC_REGISTRATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDynamicRegistration());
    hash = (37 * hash) + TOOLTIP_SUPPORT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTooltipSupport());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkClientCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(protocol.rpc.DocumentLinkClientCapabilities prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * DocumentLinkClientCapabilities represents a client capabilities of `textDocument/documentLink`
   * request.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentLinkClientCapabilities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentLinkClientCapabilities)
      protocol.rpc.DocumentLinkClientCapabilitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkClientCapabilities_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkClientCapabilities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentLinkClientCapabilities.class, protocol.rpc.DocumentLinkClientCapabilities.Builder.class);
    }

    // Construct using protocol.rpc.DocumentLinkClientCapabilities.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      dynamicRegistration_ = false;

      tooltipSupport_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkClientCapabilities_descriptor;
    }

    public protocol.rpc.DocumentLinkClientCapabilities getDefaultInstanceForType() {
      return protocol.rpc.DocumentLinkClientCapabilities.getDefaultInstance();
    }

    public protocol.rpc.DocumentLinkClientCapabilities build() {
      protocol.rpc.DocumentLinkClientCapabilities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentLinkClientCapabilities buildPartial() {
      protocol.rpc.DocumentLinkClientCapabilities result = new protocol.rpc.DocumentLinkClientCapabilities(this);
      result.dynamicRegistration_ = dynamicRegistration_;
      result.tooltipSupport_ = tooltipSupport_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protocol.rpc.DocumentLinkClientCapabilities) {
        return mergeFrom((protocol.rpc.DocumentLinkClientCapabilities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentLinkClientCapabilities other) {
      if (other == protocol.rpc.DocumentLinkClientCapabilities.getDefaultInstance()) return this;
      if (other.getDynamicRegistration() != false) {
        setDynamicRegistration(other.getDynamicRegistration());
      }
      if (other.getTooltipSupport() != false) {
        setTooltipSupport(other.getTooltipSupport());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protocol.rpc.DocumentLinkClientCapabilities parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentLinkClientCapabilities) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean dynamicRegistration_ ;
    /**
     * <pre>
     * Optional. Whether document link supports dynamic registration.
     * </pre>
     *
     * <code>bool dynamic_registration = 1;</code>
     */
    public boolean getDynamicRegistration() {
      return dynamicRegistration_;
    }
    /**
     * <pre>
     * Optional. Whether document link supports dynamic registration.
     * </pre>
     *
     * <code>bool dynamic_registration = 1;</code>
     */
    public Builder setDynamicRegistration(boolean value) {
      
      dynamicRegistration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Whether document link supports dynamic registration.
     * </pre>
     *
     * <code>bool dynamic_registration = 1;</code>
     */
    public Builder clearDynamicRegistration() {
      
      dynamicRegistration_ = false;
      onChanged();
      return this;
    }

    private boolean tooltipSupport_ ;
    /**
     * <pre>
     * Optional. Whether the client supports the `tooltip` property on `DocumentLink`.
     * &#64;since 3.15.0
     * </pre>
     *
     * <code>bool tooltip_support = 2;</code>
     */
    public boolean getTooltipSupport() {
      return tooltipSupport_;
    }
    /**
     * <pre>
     * Optional. Whether the client supports the `tooltip` property on `DocumentLink`.
     * &#64;since 3.15.0
     * </pre>
     *
     * <code>bool tooltip_support = 2;</code>
     */
    public Builder setTooltipSupport(boolean value) {
      
      tooltipSupport_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Whether the client supports the `tooltip` property on `DocumentLink`.
     * &#64;since 3.15.0
     * </pre>
     *
     * <code>bool tooltip_support = 2;</code>
     */
    public Builder clearTooltipSupport() {
      
      tooltipSupport_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentLinkClientCapabilities)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentLinkClientCapabilities)
  private static final protocol.rpc.DocumentLinkClientCapabilities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentLinkClientCapabilities();
  }

  public static protocol.rpc.DocumentLinkClientCapabilities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentLinkClientCapabilities>
      PARSER = new com.google.protobuf.AbstractParser<DocumentLinkClientCapabilities>() {
    public DocumentLinkClientCapabilities parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentLinkClientCapabilities(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentLinkClientCapabilities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentLinkClientCapabilities> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentLinkClientCapabilities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
