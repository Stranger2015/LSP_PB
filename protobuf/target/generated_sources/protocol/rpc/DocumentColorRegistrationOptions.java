// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentColorRegistrationOptions represents a registration option of DocumentColor.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentColorRegistrationOptions}
 */
public  final class DocumentColorRegistrationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentColorRegistrationOptions)
    DocumentColorRegistrationOptionsOrBuilder {
  // Use DocumentColorRegistrationOptions.newBuilder() to construct.
  private DocumentColorRegistrationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentColorRegistrationOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentColorRegistrationOptions(
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
          case 10: {
            protocol.TextDocumentRegistrationOptions.Builder subBuilder = null;
            if (textDocumentRegistrationOptions_ != null) {
              subBuilder = textDocumentRegistrationOptions_.toBuilder();
            }
            textDocumentRegistrationOptions_ = input.readMessage(protocol.TextDocumentRegistrationOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(textDocumentRegistrationOptions_);
              textDocumentRegistrationOptions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            protocol.StaticRegistrationOptions.Builder subBuilder = null;
            if (staticRegistrationOptions_ != null) {
              subBuilder = staticRegistrationOptions_.toBuilder();
            }
            staticRegistrationOptions_ = input.readMessage(protocol.StaticRegistrationOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(staticRegistrationOptions_);
              staticRegistrationOptions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            protocol.rpc.DocumentColorOptions.Builder subBuilder = null;
            if (documentColorOptions_ != null) {
              subBuilder = documentColorOptions_.toBuilder();
            }
            documentColorOptions_ = input.readMessage(protocol.rpc.DocumentColorOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(documentColorOptions_);
              documentColorOptions_ = subBuilder.buildPartial();
            }

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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentColorRegistrationOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentColorRegistrationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentColorRegistrationOptions.class, protocol.rpc.DocumentColorRegistrationOptions.Builder.class);
  }

  public static final int TEXT_DOCUMENT_REGISTRATION_OPTIONS_FIELD_NUMBER = 1;
  private protocol.TextDocumentRegistrationOptions textDocumentRegistrationOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  public boolean hasTextDocumentRegistrationOptions() {
    return textDocumentRegistrationOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  public protocol.TextDocumentRegistrationOptions getTextDocumentRegistrationOptions() {
    return textDocumentRegistrationOptions_ == null ? protocol.TextDocumentRegistrationOptions.getDefaultInstance() : textDocumentRegistrationOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
   */
  public protocol.TextDocumentRegistrationOptionsOrBuilder getTextDocumentRegistrationOptionsOrBuilder() {
    return getTextDocumentRegistrationOptions();
  }

  public static final int STATIC_REGISTRATION_OPTIONS_FIELD_NUMBER = 2;
  private protocol.StaticRegistrationOptions staticRegistrationOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
   */
  public boolean hasStaticRegistrationOptions() {
    return staticRegistrationOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
   */
  public protocol.StaticRegistrationOptions getStaticRegistrationOptions() {
    return staticRegistrationOptions_ == null ? protocol.StaticRegistrationOptions.getDefaultInstance() : staticRegistrationOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
   */
  public protocol.StaticRegistrationOptionsOrBuilder getStaticRegistrationOptionsOrBuilder() {
    return getStaticRegistrationOptions();
  }

  public static final int DOCUMENT_COLOR_OPTIONS_FIELD_NUMBER = 3;
  private protocol.rpc.DocumentColorOptions documentColorOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
   */
  public boolean hasDocumentColorOptions() {
    return documentColorOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
   */
  public protocol.rpc.DocumentColorOptions getDocumentColorOptions() {
    return documentColorOptions_ == null ? protocol.rpc.DocumentColorOptions.getDefaultInstance() : documentColorOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
   */
  public protocol.rpc.DocumentColorOptionsOrBuilder getDocumentColorOptionsOrBuilder() {
    return getDocumentColorOptions();
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
    if (textDocumentRegistrationOptions_ != null) {
      output.writeMessage(1, getTextDocumentRegistrationOptions());
    }
    if (staticRegistrationOptions_ != null) {
      output.writeMessage(2, getStaticRegistrationOptions());
    }
    if (documentColorOptions_ != null) {
      output.writeMessage(3, getDocumentColorOptions());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (textDocumentRegistrationOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTextDocumentRegistrationOptions());
    }
    if (staticRegistrationOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStaticRegistrationOptions());
    }
    if (documentColorOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDocumentColorOptions());
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
    if (!(obj instanceof protocol.rpc.DocumentColorRegistrationOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentColorRegistrationOptions other = (protocol.rpc.DocumentColorRegistrationOptions) obj;

    boolean result = true;
    result = result && (hasTextDocumentRegistrationOptions() == other.hasTextDocumentRegistrationOptions());
    if (hasTextDocumentRegistrationOptions()) {
      result = result && getTextDocumentRegistrationOptions()
          .equals(other.getTextDocumentRegistrationOptions());
    }
    result = result && (hasStaticRegistrationOptions() == other.hasStaticRegistrationOptions());
    if (hasStaticRegistrationOptions()) {
      result = result && getStaticRegistrationOptions()
          .equals(other.getStaticRegistrationOptions());
    }
    result = result && (hasDocumentColorOptions() == other.hasDocumentColorOptions());
    if (hasDocumentColorOptions()) {
      result = result && getDocumentColorOptions()
          .equals(other.getDocumentColorOptions());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTextDocumentRegistrationOptions()) {
      hash = (37 * hash) + TEXT_DOCUMENT_REGISTRATION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTextDocumentRegistrationOptions().hashCode();
    }
    if (hasStaticRegistrationOptions()) {
      hash = (37 * hash) + STATIC_REGISTRATION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getStaticRegistrationOptions().hashCode();
    }
    if (hasDocumentColorOptions()) {
      hash = (37 * hash) + DOCUMENT_COLOR_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentColorOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentColorRegistrationOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentColorRegistrationOptions prototype) {
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
   * DocumentColorRegistrationOptions represents a registration option of DocumentColor.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentColorRegistrationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentColorRegistrationOptions)
      protocol.rpc.DocumentColorRegistrationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentColorRegistrationOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentColorRegistrationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentColorRegistrationOptions.class, protocol.rpc.DocumentColorRegistrationOptions.Builder.class);
    }

    // Construct using protocol.rpc.DocumentColorRegistrationOptions.newBuilder()
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
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        textDocumentRegistrationOptions_ = null;
      } else {
        textDocumentRegistrationOptions_ = null;
        textDocumentRegistrationOptionsBuilder_ = null;
      }
      if (staticRegistrationOptionsBuilder_ == null) {
        staticRegistrationOptions_ = null;
      } else {
        staticRegistrationOptions_ = null;
        staticRegistrationOptionsBuilder_ = null;
      }
      if (documentColorOptionsBuilder_ == null) {
        documentColorOptions_ = null;
      } else {
        documentColorOptions_ = null;
        documentColorOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentColorRegistrationOptions_descriptor;
    }

    public protocol.rpc.DocumentColorRegistrationOptions getDefaultInstanceForType() {
      return protocol.rpc.DocumentColorRegistrationOptions.getDefaultInstance();
    }

    public protocol.rpc.DocumentColorRegistrationOptions build() {
      protocol.rpc.DocumentColorRegistrationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentColorRegistrationOptions buildPartial() {
      protocol.rpc.DocumentColorRegistrationOptions result = new protocol.rpc.DocumentColorRegistrationOptions(this);
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptions_;
      } else {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptionsBuilder_.build();
      }
      if (staticRegistrationOptionsBuilder_ == null) {
        result.staticRegistrationOptions_ = staticRegistrationOptions_;
      } else {
        result.staticRegistrationOptions_ = staticRegistrationOptionsBuilder_.build();
      }
      if (documentColorOptionsBuilder_ == null) {
        result.documentColorOptions_ = documentColorOptions_;
      } else {
        result.documentColorOptions_ = documentColorOptionsBuilder_.build();
      }
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
      if (other instanceof protocol.rpc.DocumentColorRegistrationOptions) {
        return mergeFrom((protocol.rpc.DocumentColorRegistrationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentColorRegistrationOptions other) {
      if (other == protocol.rpc.DocumentColorRegistrationOptions.getDefaultInstance()) return this;
      if (other.hasTextDocumentRegistrationOptions()) {
        mergeTextDocumentRegistrationOptions(other.getTextDocumentRegistrationOptions());
      }
      if (other.hasStaticRegistrationOptions()) {
        mergeStaticRegistrationOptions(other.getStaticRegistrationOptions());
      }
      if (other.hasDocumentColorOptions()) {
        mergeDocumentColorOptions(other.getDocumentColorOptions());
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
      protocol.rpc.DocumentColorRegistrationOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentColorRegistrationOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.TextDocumentRegistrationOptions textDocumentRegistrationOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextDocumentRegistrationOptions, protocol.TextDocumentRegistrationOptions.Builder, protocol.TextDocumentRegistrationOptionsOrBuilder> textDocumentRegistrationOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public boolean hasTextDocumentRegistrationOptions() {
      return textDocumentRegistrationOptionsBuilder_ != null || textDocumentRegistrationOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public protocol.TextDocumentRegistrationOptions getTextDocumentRegistrationOptions() {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        return textDocumentRegistrationOptions_ == null ? protocol.TextDocumentRegistrationOptions.getDefaultInstance() : textDocumentRegistrationOptions_;
      } else {
        return textDocumentRegistrationOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public Builder setTextDocumentRegistrationOptions(protocol.TextDocumentRegistrationOptions value) {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textDocumentRegistrationOptions_ = value;
        onChanged();
      } else {
        textDocumentRegistrationOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public Builder setTextDocumentRegistrationOptions(
        protocol.TextDocumentRegistrationOptions.Builder builderForValue) {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        textDocumentRegistrationOptions_ = builderForValue.build();
        onChanged();
      } else {
        textDocumentRegistrationOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public Builder mergeTextDocumentRegistrationOptions(protocol.TextDocumentRegistrationOptions value) {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        if (textDocumentRegistrationOptions_ != null) {
          textDocumentRegistrationOptions_ =
            protocol.TextDocumentRegistrationOptions.newBuilder(textDocumentRegistrationOptions_).mergeFrom(value).buildPartial();
        } else {
          textDocumentRegistrationOptions_ = value;
        }
        onChanged();
      } else {
        textDocumentRegistrationOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public Builder clearTextDocumentRegistrationOptions() {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        textDocumentRegistrationOptions_ = null;
        onChanged();
      } else {
        textDocumentRegistrationOptions_ = null;
        textDocumentRegistrationOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public protocol.TextDocumentRegistrationOptions.Builder getTextDocumentRegistrationOptionsBuilder() {
      
      onChanged();
      return getTextDocumentRegistrationOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    public protocol.TextDocumentRegistrationOptionsOrBuilder getTextDocumentRegistrationOptionsOrBuilder() {
      if (textDocumentRegistrationOptionsBuilder_ != null) {
        return textDocumentRegistrationOptionsBuilder_.getMessageOrBuilder();
      } else {
        return textDocumentRegistrationOptions_ == null ?
            protocol.TextDocumentRegistrationOptions.getDefaultInstance() : textDocumentRegistrationOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentRegistrationOptions text_document_registration_options = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextDocumentRegistrationOptions, protocol.TextDocumentRegistrationOptions.Builder, protocol.TextDocumentRegistrationOptionsOrBuilder> 
        getTextDocumentRegistrationOptionsFieldBuilder() {
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        textDocumentRegistrationOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.TextDocumentRegistrationOptions, protocol.TextDocumentRegistrationOptions.Builder, protocol.TextDocumentRegistrationOptionsOrBuilder>(
                getTextDocumentRegistrationOptions(),
                getParentForChildren(),
                isClean());
        textDocumentRegistrationOptions_ = null;
      }
      return textDocumentRegistrationOptionsBuilder_;
    }

    private protocol.StaticRegistrationOptions staticRegistrationOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.StaticRegistrationOptions, protocol.StaticRegistrationOptions.Builder, protocol.StaticRegistrationOptionsOrBuilder> staticRegistrationOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public boolean hasStaticRegistrationOptions() {
      return staticRegistrationOptionsBuilder_ != null || staticRegistrationOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public protocol.StaticRegistrationOptions getStaticRegistrationOptions() {
      if (staticRegistrationOptionsBuilder_ == null) {
        return staticRegistrationOptions_ == null ? protocol.StaticRegistrationOptions.getDefaultInstance() : staticRegistrationOptions_;
      } else {
        return staticRegistrationOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public Builder setStaticRegistrationOptions(protocol.StaticRegistrationOptions value) {
      if (staticRegistrationOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        staticRegistrationOptions_ = value;
        onChanged();
      } else {
        staticRegistrationOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public Builder setStaticRegistrationOptions(
        protocol.StaticRegistrationOptions.Builder builderForValue) {
      if (staticRegistrationOptionsBuilder_ == null) {
        staticRegistrationOptions_ = builderForValue.build();
        onChanged();
      } else {
        staticRegistrationOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public Builder mergeStaticRegistrationOptions(protocol.StaticRegistrationOptions value) {
      if (staticRegistrationOptionsBuilder_ == null) {
        if (staticRegistrationOptions_ != null) {
          staticRegistrationOptions_ =
            protocol.StaticRegistrationOptions.newBuilder(staticRegistrationOptions_).mergeFrom(value).buildPartial();
        } else {
          staticRegistrationOptions_ = value;
        }
        onChanged();
      } else {
        staticRegistrationOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public Builder clearStaticRegistrationOptions() {
      if (staticRegistrationOptionsBuilder_ == null) {
        staticRegistrationOptions_ = null;
        onChanged();
      } else {
        staticRegistrationOptions_ = null;
        staticRegistrationOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public protocol.StaticRegistrationOptions.Builder getStaticRegistrationOptionsBuilder() {
      
      onChanged();
      return getStaticRegistrationOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    public protocol.StaticRegistrationOptionsOrBuilder getStaticRegistrationOptionsOrBuilder() {
      if (staticRegistrationOptionsBuilder_ != null) {
        return staticRegistrationOptionsBuilder_.getMessageOrBuilder();
      } else {
        return staticRegistrationOptions_ == null ?
            protocol.StaticRegistrationOptions.getDefaultInstance() : staticRegistrationOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.StaticRegistrationOptions, protocol.StaticRegistrationOptions.Builder, protocol.StaticRegistrationOptionsOrBuilder> 
        getStaticRegistrationOptionsFieldBuilder() {
      if (staticRegistrationOptionsBuilder_ == null) {
        staticRegistrationOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.StaticRegistrationOptions, protocol.StaticRegistrationOptions.Builder, protocol.StaticRegistrationOptionsOrBuilder>(
                getStaticRegistrationOptions(),
                getParentForChildren(),
                isClean());
        staticRegistrationOptions_ = null;
      }
      return staticRegistrationOptionsBuilder_;
    }

    private protocol.rpc.DocumentColorOptions documentColorOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentColorOptions, protocol.rpc.DocumentColorOptions.Builder, protocol.rpc.DocumentColorOptionsOrBuilder> documentColorOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public boolean hasDocumentColorOptions() {
      return documentColorOptionsBuilder_ != null || documentColorOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public protocol.rpc.DocumentColorOptions getDocumentColorOptions() {
      if (documentColorOptionsBuilder_ == null) {
        return documentColorOptions_ == null ? protocol.rpc.DocumentColorOptions.getDefaultInstance() : documentColorOptions_;
      } else {
        return documentColorOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public Builder setDocumentColorOptions(protocol.rpc.DocumentColorOptions value) {
      if (documentColorOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentColorOptions_ = value;
        onChanged();
      } else {
        documentColorOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public Builder setDocumentColorOptions(
        protocol.rpc.DocumentColorOptions.Builder builderForValue) {
      if (documentColorOptionsBuilder_ == null) {
        documentColorOptions_ = builderForValue.build();
        onChanged();
      } else {
        documentColorOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public Builder mergeDocumentColorOptions(protocol.rpc.DocumentColorOptions value) {
      if (documentColorOptionsBuilder_ == null) {
        if (documentColorOptions_ != null) {
          documentColorOptions_ =
            protocol.rpc.DocumentColorOptions.newBuilder(documentColorOptions_).mergeFrom(value).buildPartial();
        } else {
          documentColorOptions_ = value;
        }
        onChanged();
      } else {
        documentColorOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public Builder clearDocumentColorOptions() {
      if (documentColorOptionsBuilder_ == null) {
        documentColorOptions_ = null;
        onChanged();
      } else {
        documentColorOptions_ = null;
        documentColorOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public protocol.rpc.DocumentColorOptions.Builder getDocumentColorOptionsBuilder() {
      
      onChanged();
      return getDocumentColorOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    public protocol.rpc.DocumentColorOptionsOrBuilder getDocumentColorOptionsOrBuilder() {
      if (documentColorOptionsBuilder_ != null) {
        return documentColorOptionsBuilder_.getMessageOrBuilder();
      } else {
        return documentColorOptions_ == null ?
            protocol.rpc.DocumentColorOptions.getDefaultInstance() : documentColorOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentColorOptions document_color_options = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentColorOptions, protocol.rpc.DocumentColorOptions.Builder, protocol.rpc.DocumentColorOptionsOrBuilder> 
        getDocumentColorOptionsFieldBuilder() {
      if (documentColorOptionsBuilder_ == null) {
        documentColorOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.DocumentColorOptions, protocol.rpc.DocumentColorOptions.Builder, protocol.rpc.DocumentColorOptionsOrBuilder>(
                getDocumentColorOptions(),
                getParentForChildren(),
                isClean());
        documentColorOptions_ = null;
      }
      return documentColorOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentColorRegistrationOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentColorRegistrationOptions)
  private static final protocol.rpc.DocumentColorRegistrationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentColorRegistrationOptions();
  }

  public static protocol.rpc.DocumentColorRegistrationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentColorRegistrationOptions>
      PARSER = new com.google.protobuf.AbstractParser<DocumentColorRegistrationOptions>() {
    public DocumentColorRegistrationOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentColorRegistrationOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentColorRegistrationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentColorRegistrationOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentColorRegistrationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

