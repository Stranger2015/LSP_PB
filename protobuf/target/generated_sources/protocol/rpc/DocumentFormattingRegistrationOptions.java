// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentFormattingRegistrationOptions represents a registration option of DocumentFormatting.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentFormattingRegistrationOptions}
 */
public  final class DocumentFormattingRegistrationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentFormattingRegistrationOptions)
    DocumentFormattingRegistrationOptionsOrBuilder {
  // Use DocumentFormattingRegistrationOptions.newBuilder() to construct.
  private DocumentFormattingRegistrationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentFormattingRegistrationOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentFormattingRegistrationOptions(
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
            protocol.rpc.DocumentFormattingOptions.Builder subBuilder = null;
            if (documentFormattingOptions_ != null) {
              subBuilder = documentFormattingOptions_.toBuilder();
            }
            documentFormattingOptions_ = input.readMessage(protocol.rpc.DocumentFormattingOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(documentFormattingOptions_);
              documentFormattingOptions_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingRegistrationOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingRegistrationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentFormattingRegistrationOptions.class, protocol.rpc.DocumentFormattingRegistrationOptions.Builder.class);
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

  public static final int DOCUMENT_FORMATTING_OPTIONS_FIELD_NUMBER = 2;
  private protocol.rpc.DocumentFormattingOptions documentFormattingOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
   */
  public boolean hasDocumentFormattingOptions() {
    return documentFormattingOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
   */
  public protocol.rpc.DocumentFormattingOptions getDocumentFormattingOptions() {
    return documentFormattingOptions_ == null ? protocol.rpc.DocumentFormattingOptions.getDefaultInstance() : documentFormattingOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
   */
  public protocol.rpc.DocumentFormattingOptionsOrBuilder getDocumentFormattingOptionsOrBuilder() {
    return getDocumentFormattingOptions();
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
    if (documentFormattingOptions_ != null) {
      output.writeMessage(2, getDocumentFormattingOptions());
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
    if (documentFormattingOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDocumentFormattingOptions());
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
    if (!(obj instanceof protocol.rpc.DocumentFormattingRegistrationOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentFormattingRegistrationOptions other = (protocol.rpc.DocumentFormattingRegistrationOptions) obj;

    boolean result = true;
    result = result && (hasTextDocumentRegistrationOptions() == other.hasTextDocumentRegistrationOptions());
    if (hasTextDocumentRegistrationOptions()) {
      result = result && getTextDocumentRegistrationOptions()
          .equals(other.getTextDocumentRegistrationOptions());
    }
    result = result && (hasDocumentFormattingOptions() == other.hasDocumentFormattingOptions());
    if (hasDocumentFormattingOptions()) {
      result = result && getDocumentFormattingOptions()
          .equals(other.getDocumentFormattingOptions());
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
    if (hasDocumentFormattingOptions()) {
      hash = (37 * hash) + DOCUMENT_FORMATTING_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentFormattingOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingRegistrationOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentFormattingRegistrationOptions prototype) {
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
   * DocumentFormattingRegistrationOptions represents a registration option of DocumentFormatting.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentFormattingRegistrationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentFormattingRegistrationOptions)
      protocol.rpc.DocumentFormattingRegistrationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingRegistrationOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingRegistrationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentFormattingRegistrationOptions.class, protocol.rpc.DocumentFormattingRegistrationOptions.Builder.class);
    }

    // Construct using protocol.rpc.DocumentFormattingRegistrationOptions.newBuilder()
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
      if (documentFormattingOptionsBuilder_ == null) {
        documentFormattingOptions_ = null;
      } else {
        documentFormattingOptions_ = null;
        documentFormattingOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingRegistrationOptions_descriptor;
    }

    public protocol.rpc.DocumentFormattingRegistrationOptions getDefaultInstanceForType() {
      return protocol.rpc.DocumentFormattingRegistrationOptions.getDefaultInstance();
    }

    public protocol.rpc.DocumentFormattingRegistrationOptions build() {
      protocol.rpc.DocumentFormattingRegistrationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentFormattingRegistrationOptions buildPartial() {
      protocol.rpc.DocumentFormattingRegistrationOptions result = new protocol.rpc.DocumentFormattingRegistrationOptions(this);
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptions_;
      } else {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptionsBuilder_.build();
      }
      if (documentFormattingOptionsBuilder_ == null) {
        result.documentFormattingOptions_ = documentFormattingOptions_;
      } else {
        result.documentFormattingOptions_ = documentFormattingOptionsBuilder_.build();
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
      if (other instanceof protocol.rpc.DocumentFormattingRegistrationOptions) {
        return mergeFrom((protocol.rpc.DocumentFormattingRegistrationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentFormattingRegistrationOptions other) {
      if (other == protocol.rpc.DocumentFormattingRegistrationOptions.getDefaultInstance()) return this;
      if (other.hasTextDocumentRegistrationOptions()) {
        mergeTextDocumentRegistrationOptions(other.getTextDocumentRegistrationOptions());
      }
      if (other.hasDocumentFormattingOptions()) {
        mergeDocumentFormattingOptions(other.getDocumentFormattingOptions());
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
      protocol.rpc.DocumentFormattingRegistrationOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentFormattingRegistrationOptions) e.getUnfinishedMessage();
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

    private protocol.rpc.DocumentFormattingOptions documentFormattingOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentFormattingOptions, protocol.rpc.DocumentFormattingOptions.Builder, protocol.rpc.DocumentFormattingOptionsOrBuilder> documentFormattingOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public boolean hasDocumentFormattingOptions() {
      return documentFormattingOptionsBuilder_ != null || documentFormattingOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public protocol.rpc.DocumentFormattingOptions getDocumentFormattingOptions() {
      if (documentFormattingOptionsBuilder_ == null) {
        return documentFormattingOptions_ == null ? protocol.rpc.DocumentFormattingOptions.getDefaultInstance() : documentFormattingOptions_;
      } else {
        return documentFormattingOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public Builder setDocumentFormattingOptions(protocol.rpc.DocumentFormattingOptions value) {
      if (documentFormattingOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentFormattingOptions_ = value;
        onChanged();
      } else {
        documentFormattingOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public Builder setDocumentFormattingOptions(
        protocol.rpc.DocumentFormattingOptions.Builder builderForValue) {
      if (documentFormattingOptionsBuilder_ == null) {
        documentFormattingOptions_ = builderForValue.build();
        onChanged();
      } else {
        documentFormattingOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public Builder mergeDocumentFormattingOptions(protocol.rpc.DocumentFormattingOptions value) {
      if (documentFormattingOptionsBuilder_ == null) {
        if (documentFormattingOptions_ != null) {
          documentFormattingOptions_ =
            protocol.rpc.DocumentFormattingOptions.newBuilder(documentFormattingOptions_).mergeFrom(value).buildPartial();
        } else {
          documentFormattingOptions_ = value;
        }
        onChanged();
      } else {
        documentFormattingOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public Builder clearDocumentFormattingOptions() {
      if (documentFormattingOptionsBuilder_ == null) {
        documentFormattingOptions_ = null;
        onChanged();
      } else {
        documentFormattingOptions_ = null;
        documentFormattingOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public protocol.rpc.DocumentFormattingOptions.Builder getDocumentFormattingOptionsBuilder() {
      
      onChanged();
      return getDocumentFormattingOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    public protocol.rpc.DocumentFormattingOptionsOrBuilder getDocumentFormattingOptionsOrBuilder() {
      if (documentFormattingOptionsBuilder_ != null) {
        return documentFormattingOptionsBuilder_.getMessageOrBuilder();
      } else {
        return documentFormattingOptions_ == null ?
            protocol.rpc.DocumentFormattingOptions.getDefaultInstance() : documentFormattingOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.DocumentFormattingOptions document_formatting_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentFormattingOptions, protocol.rpc.DocumentFormattingOptions.Builder, protocol.rpc.DocumentFormattingOptionsOrBuilder> 
        getDocumentFormattingOptionsFieldBuilder() {
      if (documentFormattingOptionsBuilder_ == null) {
        documentFormattingOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.DocumentFormattingOptions, protocol.rpc.DocumentFormattingOptions.Builder, protocol.rpc.DocumentFormattingOptionsOrBuilder>(
                getDocumentFormattingOptions(),
                getParentForChildren(),
                isClean());
        documentFormattingOptions_ = null;
      }
      return documentFormattingOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentFormattingRegistrationOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentFormattingRegistrationOptions)
  private static final protocol.rpc.DocumentFormattingRegistrationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentFormattingRegistrationOptions();
  }

  public static protocol.rpc.DocumentFormattingRegistrationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentFormattingRegistrationOptions>
      PARSER = new com.google.protobuf.AbstractParser<DocumentFormattingRegistrationOptions>() {
    public DocumentFormattingRegistrationOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentFormattingRegistrationOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentFormattingRegistrationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentFormattingRegistrationOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentFormattingRegistrationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
