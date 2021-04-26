// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * WorkDoneProgressEnd signaling the end of a progress reporting is done using the payload.
 * </pre>
 *
 * Protobuf type {@code protocol.WorkDoneProgressEnd}
 */
public  final class WorkDoneProgressEnd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.WorkDoneProgressEnd)
    WorkDoneProgressEndOrBuilder {
  // Use WorkDoneProgressEnd.newBuilder() to construct.
  private WorkDoneProgressEnd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkDoneProgressEnd() {
    kind_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private WorkDoneProgressEnd(
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
            java.lang.String s = input.readStringRequireUtf8();

            kind_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
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
    return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressEnd_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressEnd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.WorkDoneProgressEnd.class, protocol.WorkDoneProgressEnd.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private volatile java.lang.Object kind_;
  /**
   * <pre>
   * WorkDoneProgressEnd kind.
   * always 'end'
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * WorkDoneProgressEnd kind.
   * always 'end'
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue message_;
  /**
   * <pre>
   * Optional, a final message indicating to for example indicate the outcome
   * of the operation.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 2;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * Optional, a final message indicating to for example indicate the outcome
   * of the operation.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 2;</code>
   */
  public com.google.protobuf.StringValue getMessage() {
    return message_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * Optional, a final message indicating to for example indicate the outcome
   * of the operation.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (!getKindBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessage());
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
    if (!(obj instanceof protocol.WorkDoneProgressEnd)) {
      return super.equals(obj);
    }
    protocol.WorkDoneProgressEnd other = (protocol.WorkDoneProgressEnd) obj;

    boolean result = true;
    result = result && getKind()
        .equals(other.getKind());
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.WorkDoneProgressEnd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkDoneProgressEnd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressEnd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressEnd parseFrom(
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
  public static Builder newBuilder(protocol.WorkDoneProgressEnd prototype) {
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
   * WorkDoneProgressEnd signaling the end of a progress reporting is done using the payload.
   * </pre>
   *
   * Protobuf type {@code protocol.WorkDoneProgressEnd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.WorkDoneProgressEnd)
      protocol.WorkDoneProgressEndOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressEnd_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressEnd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.WorkDoneProgressEnd.class, protocol.WorkDoneProgressEnd.Builder.class);
    }

    // Construct using protocol.WorkDoneProgressEnd.newBuilder()
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
      kind_ = "";

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressEnd_descriptor;
    }

    public protocol.WorkDoneProgressEnd getDefaultInstanceForType() {
      return protocol.WorkDoneProgressEnd.getDefaultInstance();
    }

    public protocol.WorkDoneProgressEnd build() {
      protocol.WorkDoneProgressEnd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.WorkDoneProgressEnd buildPartial() {
      protocol.WorkDoneProgressEnd result = new protocol.WorkDoneProgressEnd(this);
      result.kind_ = kind_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
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
      if (other instanceof protocol.WorkDoneProgressEnd) {
        return mergeFrom((protocol.WorkDoneProgressEnd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.WorkDoneProgressEnd other) {
      if (other == protocol.WorkDoneProgressEnd.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        onChanged();
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
      protocol.WorkDoneProgressEnd parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.WorkDoneProgressEnd) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * WorkDoneProgressEnd kind.
     * always 'end'
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * WorkDoneProgressEnd kind.
     * always 'end'
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * WorkDoneProgressEnd kind.
     * always 'end'
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkDoneProgressEnd kind.
     * always 'end'
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearKind() {
      
      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * WorkDoneProgressEnd kind.
     * always 'end'
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kind_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> messageBuilder_;
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public com.google.protobuf.StringValue getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public Builder setMessage(com.google.protobuf.StringValue value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public Builder setMessage(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public Builder mergeMessage(com.google.protobuf.StringValue value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.google.protobuf.StringValue.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * Optional, a final message indicating to for example indicate the outcome
     * of the operation.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.WorkDoneProgressEnd)
  }

  // @@protoc_insertion_point(class_scope:protocol.WorkDoneProgressEnd)
  private static final protocol.WorkDoneProgressEnd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.WorkDoneProgressEnd();
  }

  public static protocol.WorkDoneProgressEnd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkDoneProgressEnd>
      PARSER = new com.google.protobuf.AbstractParser<WorkDoneProgressEnd>() {
    public WorkDoneProgressEnd parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorkDoneProgressEnd(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkDoneProgressEnd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkDoneProgressEnd> getParserForType() {
    return PARSER;
  }

  public protocol.WorkDoneProgressEnd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

