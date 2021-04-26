// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CodeActionRegistrationOptions represents a registration option of CodeAction.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.CodeActionRegistrationOptions}
 */
public  final class CodeActionRegistrationOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.CodeActionRegistrationOptions)
    CodeActionRegistrationOptionsOrBuilder {
  // Use CodeActionRegistrationOptions.newBuilder() to construct.
  private CodeActionRegistrationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CodeActionRegistrationOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CodeActionRegistrationOptions(
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
            protocol.rpc.CodeActionOptions.Builder subBuilder = null;
            if (codeActionOptions_ != null) {
              subBuilder = codeActionOptions_.toBuilder();
            }
            codeActionOptions_ = input.readMessage(protocol.rpc.CodeActionOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(codeActionOptions_);
              codeActionOptions_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CodeActionRegistrationOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CodeActionRegistrationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.CodeActionRegistrationOptions.class, protocol.rpc.CodeActionRegistrationOptions.Builder.class);
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

  public static final int CODE_ACTION_OPTIONS_FIELD_NUMBER = 2;
  private protocol.rpc.CodeActionOptions codeActionOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
   */
  public boolean hasCodeActionOptions() {
    return codeActionOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
   */
  public protocol.rpc.CodeActionOptions getCodeActionOptions() {
    return codeActionOptions_ == null ? protocol.rpc.CodeActionOptions.getDefaultInstance() : codeActionOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
   */
  public protocol.rpc.CodeActionOptionsOrBuilder getCodeActionOptionsOrBuilder() {
    return getCodeActionOptions();
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
    if (codeActionOptions_ != null) {
      output.writeMessage(2, getCodeActionOptions());
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
    if (codeActionOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCodeActionOptions());
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
    if (!(obj instanceof protocol.rpc.CodeActionRegistrationOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.CodeActionRegistrationOptions other = (protocol.rpc.CodeActionRegistrationOptions) obj;

    boolean result = true;
    result = result && (hasTextDocumentRegistrationOptions() == other.hasTextDocumentRegistrationOptions());
    if (hasTextDocumentRegistrationOptions()) {
      result = result && getTextDocumentRegistrationOptions()
          .equals(other.getTextDocumentRegistrationOptions());
    }
    result = result && (hasCodeActionOptions() == other.hasCodeActionOptions());
    if (hasCodeActionOptions()) {
      result = result && getCodeActionOptions()
          .equals(other.getCodeActionOptions());
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
    if (hasCodeActionOptions()) {
      hash = (37 * hash) + CODE_ACTION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCodeActionOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CodeActionRegistrationOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.CodeActionRegistrationOptions prototype) {
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
   * CodeActionRegistrationOptions represents a registration option of CodeAction.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.CodeActionRegistrationOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.CodeActionRegistrationOptions)
      protocol.rpc.CodeActionRegistrationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CodeActionRegistrationOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CodeActionRegistrationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.CodeActionRegistrationOptions.class, protocol.rpc.CodeActionRegistrationOptions.Builder.class);
    }

    // Construct using protocol.rpc.CodeActionRegistrationOptions.newBuilder()
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
      if (codeActionOptionsBuilder_ == null) {
        codeActionOptions_ = null;
      } else {
        codeActionOptions_ = null;
        codeActionOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CodeActionRegistrationOptions_descriptor;
    }

    public protocol.rpc.CodeActionRegistrationOptions getDefaultInstanceForType() {
      return protocol.rpc.CodeActionRegistrationOptions.getDefaultInstance();
    }

    public protocol.rpc.CodeActionRegistrationOptions build() {
      protocol.rpc.CodeActionRegistrationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.CodeActionRegistrationOptions buildPartial() {
      protocol.rpc.CodeActionRegistrationOptions result = new protocol.rpc.CodeActionRegistrationOptions(this);
      if (textDocumentRegistrationOptionsBuilder_ == null) {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptions_;
      } else {
        result.textDocumentRegistrationOptions_ = textDocumentRegistrationOptionsBuilder_.build();
      }
      if (codeActionOptionsBuilder_ == null) {
        result.codeActionOptions_ = codeActionOptions_;
      } else {
        result.codeActionOptions_ = codeActionOptionsBuilder_.build();
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
      if (other instanceof protocol.rpc.CodeActionRegistrationOptions) {
        return mergeFrom((protocol.rpc.CodeActionRegistrationOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.CodeActionRegistrationOptions other) {
      if (other == protocol.rpc.CodeActionRegistrationOptions.getDefaultInstance()) return this;
      if (other.hasTextDocumentRegistrationOptions()) {
        mergeTextDocumentRegistrationOptions(other.getTextDocumentRegistrationOptions());
      }
      if (other.hasCodeActionOptions()) {
        mergeCodeActionOptions(other.getCodeActionOptions());
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
      protocol.rpc.CodeActionRegistrationOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.CodeActionRegistrationOptions) e.getUnfinishedMessage();
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

    private protocol.rpc.CodeActionOptions codeActionOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.CodeActionOptions, protocol.rpc.CodeActionOptions.Builder, protocol.rpc.CodeActionOptionsOrBuilder> codeActionOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public boolean hasCodeActionOptions() {
      return codeActionOptionsBuilder_ != null || codeActionOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public protocol.rpc.CodeActionOptions getCodeActionOptions() {
      if (codeActionOptionsBuilder_ == null) {
        return codeActionOptions_ == null ? protocol.rpc.CodeActionOptions.getDefaultInstance() : codeActionOptions_;
      } else {
        return codeActionOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public Builder setCodeActionOptions(protocol.rpc.CodeActionOptions value) {
      if (codeActionOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        codeActionOptions_ = value;
        onChanged();
      } else {
        codeActionOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public Builder setCodeActionOptions(
        protocol.rpc.CodeActionOptions.Builder builderForValue) {
      if (codeActionOptionsBuilder_ == null) {
        codeActionOptions_ = builderForValue.build();
        onChanged();
      } else {
        codeActionOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public Builder mergeCodeActionOptions(protocol.rpc.CodeActionOptions value) {
      if (codeActionOptionsBuilder_ == null) {
        if (codeActionOptions_ != null) {
          codeActionOptions_ =
            protocol.rpc.CodeActionOptions.newBuilder(codeActionOptions_).mergeFrom(value).buildPartial();
        } else {
          codeActionOptions_ = value;
        }
        onChanged();
      } else {
        codeActionOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public Builder clearCodeActionOptions() {
      if (codeActionOptionsBuilder_ == null) {
        codeActionOptions_ = null;
        onChanged();
      } else {
        codeActionOptions_ = null;
        codeActionOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public protocol.rpc.CodeActionOptions.Builder getCodeActionOptionsBuilder() {
      
      onChanged();
      return getCodeActionOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    public protocol.rpc.CodeActionOptionsOrBuilder getCodeActionOptionsOrBuilder() {
      if (codeActionOptionsBuilder_ != null) {
        return codeActionOptionsBuilder_.getMessageOrBuilder();
      } else {
        return codeActionOptions_ == null ?
            protocol.rpc.CodeActionOptions.getDefaultInstance() : codeActionOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.CodeActionOptions code_action_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.CodeActionOptions, protocol.rpc.CodeActionOptions.Builder, protocol.rpc.CodeActionOptionsOrBuilder> 
        getCodeActionOptionsFieldBuilder() {
      if (codeActionOptionsBuilder_ == null) {
        codeActionOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.CodeActionOptions, protocol.rpc.CodeActionOptions.Builder, protocol.rpc.CodeActionOptionsOrBuilder>(
                getCodeActionOptions(),
                getParentForChildren(),
                isClean());
        codeActionOptions_ = null;
      }
      return codeActionOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.CodeActionRegistrationOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.CodeActionRegistrationOptions)
  private static final protocol.rpc.CodeActionRegistrationOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.CodeActionRegistrationOptions();
  }

  public static protocol.rpc.CodeActionRegistrationOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CodeActionRegistrationOptions>
      PARSER = new com.google.protobuf.AbstractParser<CodeActionRegistrationOptions>() {
    public CodeActionRegistrationOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CodeActionRegistrationOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CodeActionRegistrationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CodeActionRegistrationOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.CodeActionRegistrationOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
