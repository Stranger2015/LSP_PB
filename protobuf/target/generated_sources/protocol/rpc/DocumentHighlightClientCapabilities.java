// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentHighlightClientCapabilities represents a client capabilities of
 * `textDocument/documentHighlight` request.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentHighlightClientCapabilities}
 */
public  final class DocumentHighlightClientCapabilities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentHighlightClientCapabilities)
    DocumentHighlightClientCapabilitiesOrBuilder {
  // Use DocumentHighlightClientCapabilities.newBuilder() to construct.
  private DocumentHighlightClientCapabilities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentHighlightClientCapabilities() {
    dynamicRegistration_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentHighlightClientCapabilities(
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightClientCapabilities_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightClientCapabilities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentHighlightClientCapabilities.class, protocol.rpc.DocumentHighlightClientCapabilities.Builder.class);
  }

  public static final int DYNAMIC_REGISTRATION_FIELD_NUMBER = 1;
  private boolean dynamicRegistration_;
  /**
   * <pre>
   * Optional. Whether document highlight supports dynamic registration.
   * </pre>
   *
   * <code>bool dynamic_registration = 1;</code>
   */
  public boolean getDynamicRegistration() {
    return dynamicRegistration_;
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dynamicRegistration_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, dynamicRegistration_);
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
    if (!(obj instanceof protocol.rpc.DocumentHighlightClientCapabilities)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentHighlightClientCapabilities other = (protocol.rpc.DocumentHighlightClientCapabilities) obj;

    boolean result = true;
    result = result && (getDynamicRegistration()
        == other.getDynamicRegistration());
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightClientCapabilities parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentHighlightClientCapabilities prototype) {
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
   * DocumentHighlightClientCapabilities represents a client capabilities of
   * `textDocument/documentHighlight` request.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentHighlightClientCapabilities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentHighlightClientCapabilities)
      protocol.rpc.DocumentHighlightClientCapabilitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightClientCapabilities_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightClientCapabilities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentHighlightClientCapabilities.class, protocol.rpc.DocumentHighlightClientCapabilities.Builder.class);
    }

    // Construct using protocol.rpc.DocumentHighlightClientCapabilities.newBuilder()
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

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightClientCapabilities_descriptor;
    }

    public protocol.rpc.DocumentHighlightClientCapabilities getDefaultInstanceForType() {
      return protocol.rpc.DocumentHighlightClientCapabilities.getDefaultInstance();
    }

    public protocol.rpc.DocumentHighlightClientCapabilities build() {
      protocol.rpc.DocumentHighlightClientCapabilities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentHighlightClientCapabilities buildPartial() {
      protocol.rpc.DocumentHighlightClientCapabilities result = new protocol.rpc.DocumentHighlightClientCapabilities(this);
      result.dynamicRegistration_ = dynamicRegistration_;
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
      if (other instanceof protocol.rpc.DocumentHighlightClientCapabilities) {
        return mergeFrom((protocol.rpc.DocumentHighlightClientCapabilities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentHighlightClientCapabilities other) {
      if (other == protocol.rpc.DocumentHighlightClientCapabilities.getDefaultInstance()) return this;
      if (other.getDynamicRegistration() != false) {
        setDynamicRegistration(other.getDynamicRegistration());
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
      protocol.rpc.DocumentHighlightClientCapabilities parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentHighlightClientCapabilities) e.getUnfinishedMessage();
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
     * Optional. Whether document highlight supports dynamic registration.
     * </pre>
     *
     * <code>bool dynamic_registration = 1;</code>
     */
    public boolean getDynamicRegistration() {
      return dynamicRegistration_;
    }
    /**
     * <pre>
     * Optional. Whether document highlight supports dynamic registration.
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
     * Optional. Whether document highlight supports dynamic registration.
     * </pre>
     *
     * <code>bool dynamic_registration = 1;</code>
     */
    public Builder clearDynamicRegistration() {
      
      dynamicRegistration_ = false;
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentHighlightClientCapabilities)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentHighlightClientCapabilities)
  private static final protocol.rpc.DocumentHighlightClientCapabilities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentHighlightClientCapabilities();
  }

  public static protocol.rpc.DocumentHighlightClientCapabilities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentHighlightClientCapabilities>
      PARSER = new com.google.protobuf.AbstractParser<DocumentHighlightClientCapabilities>() {
    public DocumentHighlightClientCapabilities parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentHighlightClientCapabilities(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentHighlightClientCapabilities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentHighlightClientCapabilities> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentHighlightClientCapabilities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
