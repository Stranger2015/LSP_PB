// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * FoldingRangeRegistrationOptions represents a registration option of FoldingRange.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.FoldingRangeRegistrationOptions}
 */
public  final class FoldingRangeRegistrationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.FoldingRangeRegistrationOptions)
    FoldingRangeRegistrationOptionsOrBuilder {
  // Use FoldingRangeRegistrationOptions.newBuilder() to construct.
  private FoldingRangeRegistrationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FoldingRangeRegistrationOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FoldingRangeRegistrationOptions(
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
            protocol.rpc.FoldingRangeOptions.Builder subBuilder = null;
            if (foldingRangeOptions_ != null) {
              subBuilder = foldingRangeOptions_.toBuilder();
            }
            foldingRangeOptions_ = input.readMessage(protocol.rpc.FoldingRangeOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(foldingRangeOptions_);
              foldingRangeOptions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_FoldingRangeRegistrationOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_FoldingRangeRegistrationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.FoldingRangeRegistrationOptions.class, protocol.rpc.FoldingRangeRegistrationOptions.Builder.class);
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

  public static final int FOLDING_RANGE_OPTIONS_FIELD_NUMBER = 2;
  private protocol.rpc.FoldingRangeOptions foldingRangeOptions_;
  /**
   * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
   */
  public boolean hasFoldingRangeOptions() {
    return foldingRangeOptions_ != null;
  }
  /**
   * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
   */
  public protocol.rpc.FoldingRangeOptions getFoldingRangeOptions() {
    return foldingRangeOptions_ == null ? protocol.rpc.FoldingRangeOptions.getDefaultInstance() : foldingRangeOptions_;
  }
  /**
   * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
   */
  public protocol.rpc.FoldingRangeOptionsOrBuilder getFoldingRangeOptionsOrBuilder() {
    return getFoldingRangeOptions();
  }

  public static final int STATIC_REGISTRATION_OPTIONS_FIELD_NUMBER = 3;
  private protocol.StaticRegistrationOptions staticRegistrationOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
   */
  public boolean hasStaticRegistrationOptions() {
    return staticRegistrationOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
   */
  public protocol.StaticRegistrationOptions getStaticRegistrationOptions() {
    return staticRegistrationOptions_ == null ? protocol.StaticRegistrationOptions.getDefaultInstance() : staticRegistrationOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
   */
  public protocol.StaticRegistrationOptionsOrBuilder getStaticRegistrationOptionsOrBuilder() {
    return getStaticRegistrationOptions();
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
    if (foldingRangeOptions_ != null) {
      output.writeMessage(2, getFoldingRangeOptions());
    }
    if (staticRegistrationOptions_ != null) {
      output.writeMessage(3, getStaticRegistrationOptions());
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
    if (foldingRangeOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFoldingRangeOptions());
    }
    if (staticRegistrationOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStaticRegistrationOptions());
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
    if (!(obj instanceof protocol.rpc.FoldingRangeRegistrationOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.FoldingRangeRegistrationOptions other = (protocol.rpc.FoldingRangeRegistrationOptions) obj;

    boolean result = true;
    result = result && (hasTextDocumentRegistrationOptions() == other.hasTextDocumentRegistrationOptions());
    if (hasTextDocumentRegistrationOptions()) {
      result = result && getTextDocumentRegistrationOptions()
          .equals(other.getTextDocumentRegistrationOptions());
    }
    result = result && (hasFoldingRangeOptions() == other.hasFoldingRangeOptions());
    if (hasFoldingRangeOptions()) {
      result = result && getFoldingRangeOptions()
          .equals(other.getFoldingRangeOptions());
    }
    result = result && (hasStaticRegistrationOptions() == other.hasStaticRegistrationOptions());
    if (hasStaticRegistrationOptions()) {
      result = result && getStaticRegistrationOptions()
          .equals(other.getStaticRegistrationOptions());
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
    if (hasFoldingRangeOptions()) {
      hash = (37 * hash) + FOLDING_RANGE_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getFoldingRangeOptions().hashCode();
    }
    if (hasStaticRegistrationOptions()) {
      hash = (37 * hash) + STATIC_REGISTRATION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getStaticRegistrationOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.FoldingRangeRegistrationOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.FoldingRangeRegistrationOptions prototype) {
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
   * FoldingRangeRegistrationOptions represents a registration option of FoldingRange.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.FoldingRangeRegistrationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.FoldingRangeRegistrationOptions)
      protocol.rpc.FoldingRangeRegistrationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FoldingRangeRegistrationOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FoldingRangeRegistrationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.FoldingRangeRegistrationOptions.class, protocol.rpc.FoldingRangeRegistrationOptions.Builder.class);
    }

    // Construct using protocol.rpc.FoldingRangeRegistrationOptions.newBuilder()
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
      if (foldingRangeOptionsBuilder_ == null) {
        foldingRangeOptions_ = null;
      } else {
        foldingRangeOptions_ = null;
        foldingRangeOptionsBuilder_ = null;
      }
      if (staticRegistrationOptionsBuilder_ == null) {
        staticRegistrationOptions_ = null;
      } else {
        staticRegistrationOptions_ = null;
        staticRegistrationOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FoldingRangeRegistrationOptions_descriptor;
    }

    public protocol.rpc.FoldingRangeRegistrationOptions getDefaultInstanceForType() {
      return protocol.rpc.FoldingRangeRegistrationOptions.getDefaultInstance();
    }

    public protocol.rpc.FoldingRangeRegistrationOptions build() {
      protocol.rpc.FoldingRangeRegistrationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.FoldingRangeRegistrationOptions buildPartial() {
      protocol.rpc.FoldingRangeRegistrationOptions result = new protocol.rpc.FoldingRangeRegistrationOptions(this);
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptions_;
      } else {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptionsBuilder_.build();
      }
      if (foldingRangeOptionsBuilder_ == null) {
        result.foldingRangeOptions_ = foldingRangeOptions_;
      } else {
        result.foldingRangeOptions_ = foldingRangeOptionsBuilder_.build();
      }
      if (staticRegistrationOptionsBuilder_ == null) {
        result.staticRegistrationOptions_ = staticRegistrationOptions_;
      } else {
        result.staticRegistrationOptions_ = staticRegistrationOptionsBuilder_.build();
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
      if (other instanceof protocol.rpc.FoldingRangeRegistrationOptions) {
        return mergeFrom((protocol.rpc.FoldingRangeRegistrationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.FoldingRangeRegistrationOptions other) {
      if (other == protocol.rpc.FoldingRangeRegistrationOptions.getDefaultInstance()) return this;
      if (other.hasTextDocumentRegistrationOptions()) {
        mergeTextDocumentRegistrationOptions(other.getTextDocumentRegistrationOptions());
      }
      if (other.hasFoldingRangeOptions()) {
        mergeFoldingRangeOptions(other.getFoldingRangeOptions());
      }
      if (other.hasStaticRegistrationOptions()) {
        mergeStaticRegistrationOptions(other.getStaticRegistrationOptions());
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
      protocol.rpc.FoldingRangeRegistrationOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.FoldingRangeRegistrationOptions) e.getUnfinishedMessage();
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

    private protocol.rpc.FoldingRangeOptions foldingRangeOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.FoldingRangeOptions, protocol.rpc.FoldingRangeOptions.Builder, protocol.rpc.FoldingRangeOptionsOrBuilder> foldingRangeOptionsBuilder_;
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public boolean hasFoldingRangeOptions() {
      return foldingRangeOptionsBuilder_ != null || foldingRangeOptions_ != null;
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public protocol.rpc.FoldingRangeOptions getFoldingRangeOptions() {
      if (foldingRangeOptionsBuilder_ == null) {
        return foldingRangeOptions_ == null ? protocol.rpc.FoldingRangeOptions.getDefaultInstance() : foldingRangeOptions_;
      } else {
        return foldingRangeOptionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public Builder setFoldingRangeOptions(protocol.rpc.FoldingRangeOptions value) {
      if (foldingRangeOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        foldingRangeOptions_ = value;
        onChanged();
      } else {
        foldingRangeOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public Builder setFoldingRangeOptions(
        protocol.rpc.FoldingRangeOptions.Builder builderForValue) {
      if (foldingRangeOptionsBuilder_ == null) {
        foldingRangeOptions_ = builderForValue.build();
        onChanged();
      } else {
        foldingRangeOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public Builder mergeFoldingRangeOptions(protocol.rpc.FoldingRangeOptions value) {
      if (foldingRangeOptionsBuilder_ == null) {
        if (foldingRangeOptions_ != null) {
          foldingRangeOptions_ =
            protocol.rpc.FoldingRangeOptions.newBuilder(foldingRangeOptions_).mergeFrom(value).buildPartial();
        } else {
          foldingRangeOptions_ = value;
        }
        onChanged();
      } else {
        foldingRangeOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public Builder clearFoldingRangeOptions() {
      if (foldingRangeOptionsBuilder_ == null) {
        foldingRangeOptions_ = null;
        onChanged();
      } else {
        foldingRangeOptions_ = null;
        foldingRangeOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public protocol.rpc.FoldingRangeOptions.Builder getFoldingRangeOptionsBuilder() {
      
      onChanged();
      return getFoldingRangeOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    public protocol.rpc.FoldingRangeOptionsOrBuilder getFoldingRangeOptionsOrBuilder() {
      if (foldingRangeOptionsBuilder_ != null) {
        return foldingRangeOptionsBuilder_.getMessageOrBuilder();
      } else {
        return foldingRangeOptions_ == null ?
            protocol.rpc.FoldingRangeOptions.getDefaultInstance() : foldingRangeOptions_;
      }
    }
    /**
     * <code>.protocol.rpc.FoldingRangeOptions folding_range_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.FoldingRangeOptions, protocol.rpc.FoldingRangeOptions.Builder, protocol.rpc.FoldingRangeOptionsOrBuilder> 
        getFoldingRangeOptionsFieldBuilder() {
      if (foldingRangeOptionsBuilder_ == null) {
        foldingRangeOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.FoldingRangeOptions, protocol.rpc.FoldingRangeOptions.Builder, protocol.rpc.FoldingRangeOptionsOrBuilder>(
                getFoldingRangeOptions(),
                getParentForChildren(),
                isClean());
        foldingRangeOptions_ = null;
      }
      return foldingRangeOptionsBuilder_;
    }

    private protocol.StaticRegistrationOptions staticRegistrationOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.StaticRegistrationOptions, protocol.StaticRegistrationOptions.Builder, protocol.StaticRegistrationOptionsOrBuilder> staticRegistrationOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
     */
    public boolean hasStaticRegistrationOptions() {
      return staticRegistrationOptionsBuilder_ != null || staticRegistrationOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
     * <code>.protocol.StaticRegistrationOptions static_registration_options = 3;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.FoldingRangeRegistrationOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.FoldingRangeRegistrationOptions)
  private static final protocol.rpc.FoldingRangeRegistrationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.FoldingRangeRegistrationOptions();
  }

  public static protocol.rpc.FoldingRangeRegistrationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FoldingRangeRegistrationOptions>
      PARSER = new com.google.protobuf.AbstractParser<FoldingRangeRegistrationOptions>() {
    public FoldingRangeRegistrationOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FoldingRangeRegistrationOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FoldingRangeRegistrationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FoldingRangeRegistrationOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.FoldingRangeRegistrationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

