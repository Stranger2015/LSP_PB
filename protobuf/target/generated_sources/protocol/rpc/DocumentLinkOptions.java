// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentLinkOptions represents a server capabilities option of documentLinkProvider.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentLinkOptions}
 */
public  final class DocumentLinkOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentLinkOptions)
    DocumentLinkOptionsOrBuilder {
  // Use DocumentLinkOptions.newBuilder() to construct.
  private DocumentLinkOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentLinkOptions() {
    resolveProvider_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentLinkOptions(
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
            protocol.WorkDoneProgressOptions.Builder subBuilder = null;
            if (workDoneProgressOptions_ != null) {
              subBuilder = workDoneProgressOptions_.toBuilder();
            }
            workDoneProgressOptions_ = input.readMessage(protocol.WorkDoneProgressOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workDoneProgressOptions_);
              workDoneProgressOptions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            resolveProvider_ = input.readBool();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentLinkOptions.class, protocol.rpc.DocumentLinkOptions.Builder.class);
  }

  public static final int WORK_DONE_PROGRESS_OPTIONS_FIELD_NUMBER = 1;
  private protocol.WorkDoneProgressOptions workDoneProgressOptions_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  public boolean hasWorkDoneProgressOptions() {
    return workDoneProgressOptions_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  public protocol.WorkDoneProgressOptions getWorkDoneProgressOptions() {
    return workDoneProgressOptions_ == null ? protocol.WorkDoneProgressOptions.getDefaultInstance() : workDoneProgressOptions_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
   */
  public protocol.WorkDoneProgressOptionsOrBuilder getWorkDoneProgressOptionsOrBuilder() {
    return getWorkDoneProgressOptions();
  }

  public static final int RESOLVE_PROVIDER_FIELD_NUMBER = 2;
  private boolean resolveProvider_;
  /**
   * <pre>
   * Optional. Document links have a resolve provider as well.
   * </pre>
   *
   * <code>bool resolve_provider = 2;</code>
   */
  public boolean getResolveProvider() {
    return resolveProvider_;
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
    if (workDoneProgressOptions_ != null) {
      output.writeMessage(1, getWorkDoneProgressOptions());
    }
    if (resolveProvider_ != false) {
      output.writeBool(2, resolveProvider_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workDoneProgressOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkDoneProgressOptions());
    }
    if (resolveProvider_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, resolveProvider_);
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
    if (!(obj instanceof protocol.rpc.DocumentLinkOptions)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentLinkOptions other = (protocol.rpc.DocumentLinkOptions) obj;

    boolean result = true;
    result = result && (hasWorkDoneProgressOptions() == other.hasWorkDoneProgressOptions());
    if (hasWorkDoneProgressOptions()) {
      result = result && getWorkDoneProgressOptions()
          .equals(other.getWorkDoneProgressOptions());
    }
    result = result && (getResolveProvider()
        == other.getResolveProvider());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasWorkDoneProgressOptions()) {
      hash = (37 * hash) + WORK_DONE_PROGRESS_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkDoneProgressOptions().hashCode();
    }
    hash = (37 * hash) + RESOLVE_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getResolveProvider());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentLinkOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkOptions parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentLinkOptions prototype) {
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
   * DocumentLinkOptions represents a server capabilities option of documentLinkProvider.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentLinkOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentLinkOptions)
      protocol.rpc.DocumentLinkOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentLinkOptions.class, protocol.rpc.DocumentLinkOptions.Builder.class);
    }

    // Construct using protocol.rpc.DocumentLinkOptions.newBuilder()
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
      if (workDoneProgressOptionsBuilder_ == null) {
        workDoneProgressOptions_ = null;
      } else {
        workDoneProgressOptions_ = null;
        workDoneProgressOptionsBuilder_ = null;
      }
      resolveProvider_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkOptions_descriptor;
    }

    public protocol.rpc.DocumentLinkOptions getDefaultInstanceForType() {
      return protocol.rpc.DocumentLinkOptions.getDefaultInstance();
    }

    public protocol.rpc.DocumentLinkOptions build() {
      protocol.rpc.DocumentLinkOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentLinkOptions buildPartial() {
      protocol.rpc.DocumentLinkOptions result = new protocol.rpc.DocumentLinkOptions(this);
      if (workDoneProgressOptionsBuilder_ == null) {
        result.workDoneProgressOptions_ = workDoneProgressOptions_;
      } else {
        result.workDoneProgressOptions_ = workDoneProgressOptionsBuilder_.build();
      }
      result.resolveProvider_ = resolveProvider_;
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
      if (other instanceof protocol.rpc.DocumentLinkOptions) {
        return mergeFrom((protocol.rpc.DocumentLinkOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentLinkOptions other) {
      if (other == protocol.rpc.DocumentLinkOptions.getDefaultInstance()) return this;
      if (other.hasWorkDoneProgressOptions()) {
        mergeWorkDoneProgressOptions(other.getWorkDoneProgressOptions());
      }
      if (other.getResolveProvider() != false) {
        setResolveProvider(other.getResolveProvider());
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
      protocol.rpc.DocumentLinkOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentLinkOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.WorkDoneProgressOptions workDoneProgressOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.WorkDoneProgressOptions, protocol.WorkDoneProgressOptions.Builder, protocol.WorkDoneProgressOptionsOrBuilder> workDoneProgressOptionsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public boolean hasWorkDoneProgressOptions() {
      return workDoneProgressOptionsBuilder_ != null || workDoneProgressOptions_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public protocol.WorkDoneProgressOptions getWorkDoneProgressOptions() {
      if (workDoneProgressOptionsBuilder_ == null) {
        return workDoneProgressOptions_ == null ? protocol.WorkDoneProgressOptions.getDefaultInstance() : workDoneProgressOptions_;
      } else {
        return workDoneProgressOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public Builder setWorkDoneProgressOptions(protocol.WorkDoneProgressOptions value) {
      if (workDoneProgressOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workDoneProgressOptions_ = value;
        onChanged();
      } else {
        workDoneProgressOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public Builder setWorkDoneProgressOptions(
        protocol.WorkDoneProgressOptions.Builder builderForValue) {
      if (workDoneProgressOptionsBuilder_ == null) {
        workDoneProgressOptions_ = builderForValue.build();
        onChanged();
      } else {
        workDoneProgressOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public Builder mergeWorkDoneProgressOptions(protocol.WorkDoneProgressOptions value) {
      if (workDoneProgressOptionsBuilder_ == null) {
        if (workDoneProgressOptions_ != null) {
          workDoneProgressOptions_ =
            protocol.WorkDoneProgressOptions.newBuilder(workDoneProgressOptions_).mergeFrom(value).buildPartial();
        } else {
          workDoneProgressOptions_ = value;
        }
        onChanged();
      } else {
        workDoneProgressOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public Builder clearWorkDoneProgressOptions() {
      if (workDoneProgressOptionsBuilder_ == null) {
        workDoneProgressOptions_ = null;
        onChanged();
      } else {
        workDoneProgressOptions_ = null;
        workDoneProgressOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public protocol.WorkDoneProgressOptions.Builder getWorkDoneProgressOptionsBuilder() {
      
      onChanged();
      return getWorkDoneProgressOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    public protocol.WorkDoneProgressOptionsOrBuilder getWorkDoneProgressOptionsOrBuilder() {
      if (workDoneProgressOptionsBuilder_ != null) {
        return workDoneProgressOptionsBuilder_.getMessageOrBuilder();
      } else {
        return workDoneProgressOptions_ == null ?
            protocol.WorkDoneProgressOptions.getDefaultInstance() : workDoneProgressOptions_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.WorkDoneProgressOptions work_done_progress_options = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.WorkDoneProgressOptions, protocol.WorkDoneProgressOptions.Builder, protocol.WorkDoneProgressOptionsOrBuilder> 
        getWorkDoneProgressOptionsFieldBuilder() {
      if (workDoneProgressOptionsBuilder_ == null) {
        workDoneProgressOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.WorkDoneProgressOptions, protocol.WorkDoneProgressOptions.Builder, protocol.WorkDoneProgressOptionsOrBuilder>(
                getWorkDoneProgressOptions(),
                getParentForChildren(),
                isClean());
        workDoneProgressOptions_ = null;
      }
      return workDoneProgressOptionsBuilder_;
    }

    private boolean resolveProvider_ ;
    /**
     * <pre>
     * Optional. Document links have a resolve provider as well.
     * </pre>
     *
     * <code>bool resolve_provider = 2;</code>
     */
    public boolean getResolveProvider() {
      return resolveProvider_;
    }
    /**
     * <pre>
     * Optional. Document links have a resolve provider as well.
     * </pre>
     *
     * <code>bool resolve_provider = 2;</code>
     */
    public Builder setResolveProvider(boolean value) {
      
      resolveProvider_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Document links have a resolve provider as well.
     * </pre>
     *
     * <code>bool resolve_provider = 2;</code>
     */
    public Builder clearResolveProvider() {
      
      resolveProvider_ = false;
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentLinkOptions)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentLinkOptions)
  private static final protocol.rpc.DocumentLinkOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentLinkOptions();
  }

  public static protocol.rpc.DocumentLinkOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentLinkOptions>
      PARSER = new com.google.protobuf.AbstractParser<DocumentLinkOptions>() {
    public DocumentLinkOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentLinkOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentLinkOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentLinkOptions> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentLinkOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

