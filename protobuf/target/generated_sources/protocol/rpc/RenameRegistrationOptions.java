// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * RenameRegistrationOptions represents a registration option of Rename.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.RenameRegistrationOptions}
 */
public  final class RenameRegistrationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.RenameRegistrationOptions)
    RenameRegistrationOptionsOrBuilder {
  // Use RenameRegistrationOptions.newBuilder() to construct.
  private RenameRegistrationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RenameRegistrationOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RenameRegistrationOptions(
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
            protocol.rpc.RenameOptions.Builder subBuilder = null;
            if (renameOptions_ != null) {
              subBuilder = renameOptions_.toBuilder();
            }
            renameOptions_ = input.readMessage(protocol.rpc.RenameOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(renameOptions_);
              renameOptions_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_RenameRegistrationOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_RenameRegistrationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.RenameRegistrationOptions.class, protocol.rpc.RenameRegistrationOptions.Builder.class);
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

  public static final int RENAME_OPTIONS_FIELD_NUMBER = 2;
  private protocol.rpc.RenameOptions renameOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
   */
  public boolean hasRenameOptions() {
    return renameOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
   */
  public protocol.rpc.RenameOptions getRenameOptions() {
    return renameOptions_ == null ? protocol.rpc.RenameOptions.getDefaultInstance() : renameOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
   */
  public protocol.rpc.RenameOptionsOrBuilder getRenameOptionsOrBuilder() {
    return getRenameOptions();
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
    if (renameOptions_ != null) {
      output.writeMessage(2, getRenameOptions());
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
    if (renameOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRenameOptions());
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
    if (!(obj instanceof protocol.rpc.RenameRegistrationOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.RenameRegistrationOptions other = (protocol.rpc.RenameRegistrationOptions) obj;

    boolean result = true;
    result = result && (hasTextDocumentRegistrationOptions() == other.hasTextDocumentRegistrationOptions());
    if (hasTextDocumentRegistrationOptions()) {
      result = result && getTextDocumentRegistrationOptions()
          .equals(other.getTextDocumentRegistrationOptions());
    }
    result = result && (hasRenameOptions() == other.hasRenameOptions());
    if (hasRenameOptions()) {
      result = result && getRenameOptions()
          .equals(other.getRenameOptions());
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
    if (hasRenameOptions()) {
      hash = (37 * hash) + RENAME_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRenameOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.RenameRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.RenameRegistrationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.RenameRegistrationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.RenameRegistrationOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.RenameRegistrationOptions prototype) {
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
   * RenameRegistrationOptions represents a registration option of Rename.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.RenameRegistrationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.RenameRegistrationOptions)
      protocol.rpc.RenameRegistrationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_RenameRegistrationOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_RenameRegistrationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.RenameRegistrationOptions.class, protocol.rpc.RenameRegistrationOptions.Builder.class);
    }

    // Construct using protocol.rpc.RenameRegistrationOptions.newBuilder()
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
      if (renameOptionsBuilder_ == null) {
        renameOptions_ = null;
      } else {
        renameOptions_ = null;
        renameOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_RenameRegistrationOptions_descriptor;
    }

    public protocol.rpc.RenameRegistrationOptions getDefaultInstanceForType() {
      return protocol.rpc.RenameRegistrationOptions.getDefaultInstance();
    }

    public protocol.rpc.RenameRegistrationOptions build() {
      protocol.rpc.RenameRegistrationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.RenameRegistrationOptions buildPartial() {
      protocol.rpc.RenameRegistrationOptions result = new protocol.rpc.RenameRegistrationOptions(this);
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptions_;
      } else {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptionsBuilder_.build();
      }
      if (renameOptionsBuilder_ == null) {
        result.renameOptions_ = renameOptions_;
      } else {
        result.renameOptions_ = renameOptionsBuilder_.build();
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
      if (other instanceof protocol.rpc.RenameRegistrationOptions) {
        return mergeFrom((protocol.rpc.RenameRegistrationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.RenameRegistrationOptions other) {
      if (other == protocol.rpc.RenameRegistrationOptions.getDefaultInstance()) return this;
      if (other.hasTextDocumentRegistrationOptions()) {
        mergeTextDocumentRegistrationOptions(other.getTextDocumentRegistrationOptions());
      }
      if (other.hasRenameOptions()) {
        mergeRenameOptions(other.getRenameOptions());
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
      protocol.rpc.RenameRegistrationOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.RenameRegistrationOptions) e.getUnfinishedMessage();
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

    private protocol.rpc.RenameOptions renameOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.RenameOptions, protocol.rpc.RenameOptions.Builder, protocol.rpc.RenameOptionsOrBuilder> renameOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public boolean hasRenameOptions() {
      return renameOptionsBuilder_ != null || renameOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public protocol.rpc.RenameOptions getRenameOptions() {
      if (renameOptionsBuilder_ == null) {
        return renameOptions_ == null ? protocol.rpc.RenameOptions.getDefaultInstance() : renameOptions_;
      } else {
        return renameOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public Builder setRenameOptions(protocol.rpc.RenameOptions value) {
      if (renameOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        renameOptions_ = value;
        onChanged();
      } else {
        renameOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public Builder setRenameOptions(
        protocol.rpc.RenameOptions.Builder builderForValue) {
      if (renameOptionsBuilder_ == null) {
        renameOptions_ = builderForValue.build();
        onChanged();
      } else {
        renameOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public Builder mergeRenameOptions(protocol.rpc.RenameOptions value) {
      if (renameOptionsBuilder_ == null) {
        if (renameOptions_ != null) {
          renameOptions_ =
            protocol.rpc.RenameOptions.newBuilder(renameOptions_).mergeFrom(value).buildPartial();
        } else {
          renameOptions_ = value;
        }
        onChanged();
      } else {
        renameOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public Builder clearRenameOptions() {
      if (renameOptionsBuilder_ == null) {
        renameOptions_ = null;
        onChanged();
      } else {
        renameOptions_ = null;
        renameOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public protocol.rpc.RenameOptions.Builder getRenameOptionsBuilder() {
      
      onChanged();
      return getRenameOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    public protocol.rpc.RenameOptionsOrBuilder getRenameOptionsOrBuilder() {
      if (renameOptionsBuilder_ != null) {
        return renameOptionsBuilder_.getMessageOrBuilder();
      } else {
        return renameOptions_ == null ?
            protocol.rpc.RenameOptions.getDefaultInstance() : renameOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.RenameOptions rename_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.RenameOptions, protocol.rpc.RenameOptions.Builder, protocol.rpc.RenameOptionsOrBuilder> 
        getRenameOptionsFieldBuilder() {
      if (renameOptionsBuilder_ == null) {
        renameOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.RenameOptions, protocol.rpc.RenameOptions.Builder, protocol.rpc.RenameOptionsOrBuilder>(
                getRenameOptions(),
                getParentForChildren(),
                isClean());
        renameOptions_ = null;
      }
      return renameOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.RenameRegistrationOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.RenameRegistrationOptions)
  private static final protocol.rpc.RenameRegistrationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.RenameRegistrationOptions();
  }

  public static protocol.rpc.RenameRegistrationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenameRegistrationOptions>
      PARSER = new com.google.protobuf.AbstractParser<RenameRegistrationOptions>() {
    public RenameRegistrationOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RenameRegistrationOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RenameRegistrationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenameRegistrationOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.RenameRegistrationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

