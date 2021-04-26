// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * ShowMessageRequestParams represents a `window/showMessage` notification params.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.ShowMessageRequestParams}
 */
public  final class ShowMessageRequestParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.ShowMessageRequestParams)
    ShowMessageRequestParamsOrBuilder {
  // Use ShowMessageRequestParams.newBuilder() to construct.
  private ShowMessageRequestParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShowMessageRequestParams() {
    type_ = 0;
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ShowMessageRequestParams(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageRequestParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageRequestParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.ShowMessageRequestParams.class, protocol.rpc.ShowMessageRequestParams.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The message type. See [MessageType][MessageType].
   * </pre>
   *
   * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The message type. See [MessageType][MessageType].
   * </pre>
   *
   * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.MessageType getType() {
    protocol.rpc.MessageType result = protocol.rpc.MessageType.valueOf(type_);
    return result == null ? protocol.rpc.MessageType.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The actual message.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The actual message.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != protocol.rpc.MessageType.MESSAGE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != protocol.rpc.MessageType.MESSAGE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof protocol.rpc.ShowMessageRequestParams)) {
      return super.equals(obj);
    }
    protocol.rpc.ShowMessageRequestParams other = (protocol.rpc.ShowMessageRequestParams) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getMessage()
        .equals(other.getMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.ShowMessageRequestParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageRequestParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageRequestParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageRequestParams parseFrom(
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
  public static Builder newBuilder(protocol.rpc.ShowMessageRequestParams prototype) {
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
   * ShowMessageRequestParams represents a `window/showMessage` notification params.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.ShowMessageRequestParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.ShowMessageRequestParams)
      protocol.rpc.ShowMessageRequestParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageRequestParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageRequestParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.ShowMessageRequestParams.class, protocol.rpc.ShowMessageRequestParams.Builder.class);
    }

    // Construct using protocol.rpc.ShowMessageRequestParams.newBuilder()
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
      type_ = 0;

      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageRequestParams_descriptor;
    }

    public protocol.rpc.ShowMessageRequestParams getDefaultInstanceForType() {
      return protocol.rpc.ShowMessageRequestParams.getDefaultInstance();
    }

    public protocol.rpc.ShowMessageRequestParams build() {
      protocol.rpc.ShowMessageRequestParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.ShowMessageRequestParams buildPartial() {
      protocol.rpc.ShowMessageRequestParams result = new protocol.rpc.ShowMessageRequestParams(this);
      result.type_ = type_;
      result.message_ = message_;
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
      if (other instanceof protocol.rpc.ShowMessageRequestParams) {
        return mergeFrom((protocol.rpc.ShowMessageRequestParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.ShowMessageRequestParams other) {
      if (other == protocol.rpc.ShowMessageRequestParams.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
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
      protocol.rpc.ShowMessageRequestParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.ShowMessageRequestParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The message type. See [MessageType][MessageType].
     * </pre>
     *
     * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The message type. See [MessageType][MessageType].
     * </pre>
     *
     * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message type. See [MessageType][MessageType].
     * </pre>
     *
     * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.MessageType getType() {
      protocol.rpc.MessageType result = protocol.rpc.MessageType.valueOf(type_);
      return result == null ? protocol.rpc.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The message type. See [MessageType][MessageType].
     * </pre>
     *
     * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setType(protocol.rpc.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message type. See [MessageType][MessageType].
     * </pre>
     *
     * <code>.protocol.rpc.MessageType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The actual message.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The actual message.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The actual message.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual message.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual message.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.ShowMessageRequestParams)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.ShowMessageRequestParams)
  private static final protocol.rpc.ShowMessageRequestParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.ShowMessageRequestParams();
  }

  public static protocol.rpc.ShowMessageRequestParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShowMessageRequestParams>
      PARSER = new com.google.protobuf.AbstractParser<ShowMessageRequestParams>() {
    public ShowMessageRequestParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowMessageRequestParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShowMessageRequestParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShowMessageRequestParams> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.ShowMessageRequestParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

