// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * WorkDoneProgressParams a parameter literal used to pass a work done progress token.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.WorkDoneProgressParams}
 */
public  final class WorkDoneProgressParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.WorkDoneProgressParams)
    WorkDoneProgressParamsOrBuilder {
  // Use WorkDoneProgressParams.newBuilder() to construct.
  private WorkDoneProgressParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkDoneProgressParams() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private WorkDoneProgressParams(
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
            protocol.rpc.ProgressToken.Builder subBuilder = null;
            if (workDoneToken_ != null) {
              subBuilder = workDoneToken_.toBuilder();
            }
            workDoneToken_ = input.readMessage(protocol.rpc.ProgressToken.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workDoneToken_);
              workDoneToken_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_WorkDoneProgressParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_WorkDoneProgressParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.WorkDoneProgressParams.class, protocol.rpc.WorkDoneProgressParams.Builder.class);
  }

  public static final int WORK_DONE_TOKEN_FIELD_NUMBER = 1;
  private protocol.rpc.ProgressToken workDoneToken_;
  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasWorkDoneToken() {
    return workDoneToken_ != null;
  }
  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.ProgressToken getWorkDoneToken() {
    return workDoneToken_ == null ? protocol.rpc.ProgressToken.getDefaultInstance() : workDoneToken_;
  }
  /**
   * <pre>
   * An optional token that a server can use to report work done progress.
   * </pre>
   *
   * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.ProgressTokenOrBuilder getWorkDoneTokenOrBuilder() {
    return getWorkDoneToken();
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
    if (workDoneToken_ != null) {
      output.writeMessage(1, getWorkDoneToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workDoneToken_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkDoneToken());
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
    if (!(obj instanceof protocol.rpc.WorkDoneProgressParams)) {
      return super.equals(obj);
    }
    protocol.rpc.WorkDoneProgressParams other = (protocol.rpc.WorkDoneProgressParams) obj;

    boolean result = true;
    result = result && (hasWorkDoneToken() == other.hasWorkDoneToken());
    if (hasWorkDoneToken()) {
      result = result && getWorkDoneToken()
          .equals(other.getWorkDoneToken());
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
    if (hasWorkDoneToken()) {
      hash = (37 * hash) + WORK_DONE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getWorkDoneToken().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.WorkDoneProgressParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.WorkDoneProgressParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.WorkDoneProgressParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.WorkDoneProgressParams parseFrom(
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
  public static Builder newBuilder(protocol.rpc.WorkDoneProgressParams prototype) {
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
   * WorkDoneProgressParams a parameter literal used to pass a work done progress token.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.WorkDoneProgressParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.WorkDoneProgressParams)
      protocol.rpc.WorkDoneProgressParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_WorkDoneProgressParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_WorkDoneProgressParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.WorkDoneProgressParams.class, protocol.rpc.WorkDoneProgressParams.Builder.class);
    }

    // Construct using protocol.rpc.WorkDoneProgressParams.newBuilder()
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
      if (workDoneTokenBuilder_ == null) {
        workDoneToken_ = null;
      } else {
        workDoneToken_ = null;
        workDoneTokenBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_WorkDoneProgressParams_descriptor;
    }

    public protocol.rpc.WorkDoneProgressParams getDefaultInstanceForType() {
      return protocol.rpc.WorkDoneProgressParams.getDefaultInstance();
    }

    public protocol.rpc.WorkDoneProgressParams build() {
      protocol.rpc.WorkDoneProgressParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.WorkDoneProgressParams buildPartial() {
      protocol.rpc.WorkDoneProgressParams result = new protocol.rpc.WorkDoneProgressParams(this);
      if (workDoneTokenBuilder_ == null) {
        result.workDoneToken_ = workDoneToken_;
      } else {
        result.workDoneToken_ = workDoneTokenBuilder_.build();
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
      if (other instanceof protocol.rpc.WorkDoneProgressParams) {
        return mergeFrom((protocol.rpc.WorkDoneProgressParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.WorkDoneProgressParams other) {
      if (other == protocol.rpc.WorkDoneProgressParams.getDefaultInstance()) return this;
      if (other.hasWorkDoneToken()) {
        mergeWorkDoneToken(other.getWorkDoneToken());
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
      protocol.rpc.WorkDoneProgressParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.WorkDoneProgressParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.rpc.ProgressToken workDoneToken_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.ProgressToken, protocol.rpc.ProgressToken.Builder, protocol.rpc.ProgressTokenOrBuilder> workDoneTokenBuilder_;
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasWorkDoneToken() {
      return workDoneTokenBuilder_ != null || workDoneToken_ != null;
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.ProgressToken getWorkDoneToken() {
      if (workDoneTokenBuilder_ == null) {
        return workDoneToken_ == null ? protocol.rpc.ProgressToken.getDefaultInstance() : workDoneToken_;
      } else {
        return workDoneTokenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWorkDoneToken(protocol.rpc.ProgressToken value) {
      if (workDoneTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workDoneToken_ = value;
        onChanged();
      } else {
        workDoneTokenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setWorkDoneToken(
        protocol.rpc.ProgressToken.Builder builderForValue) {
      if (workDoneTokenBuilder_ == null) {
        workDoneToken_ = builderForValue.build();
        onChanged();
      } else {
        workDoneTokenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeWorkDoneToken(protocol.rpc.ProgressToken value) {
      if (workDoneTokenBuilder_ == null) {
        if (workDoneToken_ != null) {
          workDoneToken_ =
            protocol.rpc.ProgressToken.newBuilder(workDoneToken_).mergeFrom(value).buildPartial();
        } else {
          workDoneToken_ = value;
        }
        onChanged();
      } else {
        workDoneTokenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearWorkDoneToken() {
      if (workDoneTokenBuilder_ == null) {
        workDoneToken_ = null;
        onChanged();
      } else {
        workDoneToken_ = null;
        workDoneTokenBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.ProgressToken.Builder getWorkDoneTokenBuilder() {
      
      onChanged();
      return getWorkDoneTokenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.ProgressTokenOrBuilder getWorkDoneTokenOrBuilder() {
      if (workDoneTokenBuilder_ != null) {
        return workDoneTokenBuilder_.getMessageOrBuilder();
      } else {
        return workDoneToken_ == null ?
            protocol.rpc.ProgressToken.getDefaultInstance() : workDoneToken_;
      }
    }
    /**
     * <pre>
     * An optional token that a server can use to report work done progress.
     * </pre>
     *
     * <code>.protocol.rpc.ProgressToken work_done_token = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.ProgressToken, protocol.rpc.ProgressToken.Builder, protocol.rpc.ProgressTokenOrBuilder> 
        getWorkDoneTokenFieldBuilder() {
      if (workDoneTokenBuilder_ == null) {
        workDoneTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.ProgressToken, protocol.rpc.ProgressToken.Builder, protocol.rpc.ProgressTokenOrBuilder>(
                getWorkDoneToken(),
                getParentForChildren(),
                isClean());
        workDoneToken_ = null;
      }
      return workDoneTokenBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.WorkDoneProgressParams)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.WorkDoneProgressParams)
  private static final protocol.rpc.WorkDoneProgressParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.WorkDoneProgressParams();
  }

  public static protocol.rpc.WorkDoneProgressParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkDoneProgressParams>
      PARSER = new com.google.protobuf.AbstractParser<WorkDoneProgressParams>() {
    public WorkDoneProgressParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorkDoneProgressParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkDoneProgressParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkDoneProgressParams> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.WorkDoneProgressParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

