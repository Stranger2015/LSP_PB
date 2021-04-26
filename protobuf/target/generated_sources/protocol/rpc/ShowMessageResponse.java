// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * ShowMessageResponse represents a ShowMessage response.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.ShowMessageResponse}
 */
public  final class ShowMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.ShowMessageResponse)
    ShowMessageResponseOrBuilder {
  // Use ShowMessageResponse.newBuilder() to construct.
  private ShowMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShowMessageResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ShowMessageResponse(
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
            protocol.rpc.MessageActionItem.Builder subBuilder = null;
            if (showMessageResponseCase_ == 1) {
              subBuilder = ((protocol.rpc.MessageActionItem) showMessageResponse_).toBuilder();
            }
            showMessageResponse_ =
                input.readMessage(protocol.rpc.MessageActionItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.rpc.MessageActionItem) showMessageResponse_);
              showMessageResponse_ = subBuilder.buildPartial();
            }
            showMessageResponseCase_ = 1;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            showMessageResponseCase_ = 2;
            showMessageResponse_ = rawValue;
            break;
          }
          case 26: {
            protocol.Error.Builder subBuilder = null;
            if (showMessageResponseCase_ == 3) {
              subBuilder = ((protocol.Error) showMessageResponse_).toBuilder();
            }
            showMessageResponse_ =
                input.readMessage(protocol.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.Error) showMessageResponse_);
              showMessageResponse_ = subBuilder.buildPartial();
            }
            showMessageResponseCase_ = 3;
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.ShowMessageResponse.class, protocol.rpc.ShowMessageResponse.Builder.class);
  }

  private int showMessageResponseCase_ = 0;
  private java.lang.Object showMessageResponse_;
  public enum ShowMessageResponseCase
      implements com.google.protobuf.Internal.EnumLite {
    MESSAGE_ACTION_ITEM(1),
    EMPTY(2),
    ERROR(3),
    SHOWMESSAGERESPONSE_NOT_SET(0);
    private final int value;
    private ShowMessageResponseCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ShowMessageResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static ShowMessageResponseCase forNumber(int value) {
      switch (value) {
        case 1: return MESSAGE_ACTION_ITEM;
        case 2: return EMPTY;
        case 3: return ERROR;
        case 0: return SHOWMESSAGERESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ShowMessageResponseCase
  getShowMessageResponseCase() {
    return ShowMessageResponseCase.forNumber(
        showMessageResponseCase_);
  }

  public static final int MESSAGE_ACTION_ITEM_FIELD_NUMBER = 1;
  /**
   * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
   */
  public protocol.rpc.MessageActionItem getMessageActionItem() {
    if (showMessageResponseCase_ == 1) {
       return (protocol.rpc.MessageActionItem) showMessageResponse_;
    }
    return protocol.rpc.MessageActionItem.getDefaultInstance();
  }
  /**
   * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
   */
  public protocol.rpc.MessageActionItemOrBuilder getMessageActionItemOrBuilder() {
    if (showMessageResponseCase_ == 1) {
       return (protocol.rpc.MessageActionItem) showMessageResponse_;
    }
    return protocol.rpc.MessageActionItem.getDefaultInstance();
  }

  public static final int EMPTY_FIELD_NUMBER = 2;
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  public int getEmptyValue() {
    if (showMessageResponseCase_ == 2) {
      return (java.lang.Integer) showMessageResponse_;
    }
    return 0;
  }
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  public com.google.protobuf.NullValue getEmpty() {
    if (showMessageResponseCase_ == 2) {
      com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
          (java.lang.Integer) showMessageResponse_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  public protocol.Error getError() {
    if (showMessageResponseCase_ == 3) {
       return (protocol.Error) showMessageResponse_;
    }
    return protocol.Error.getDefaultInstance();
  }
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  public protocol.ErrorOrBuilder getErrorOrBuilder() {
    if (showMessageResponseCase_ == 3) {
       return (protocol.Error) showMessageResponse_;
    }
    return protocol.Error.getDefaultInstance();
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
    if (showMessageResponseCase_ == 1) {
      output.writeMessage(1, (protocol.rpc.MessageActionItem) showMessageResponse_);
    }
    if (showMessageResponseCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) showMessageResponse_));
    }
    if (showMessageResponseCase_ == 3) {
      output.writeMessage(3, (protocol.Error) showMessageResponse_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (showMessageResponseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (protocol.rpc.MessageActionItem) showMessageResponse_);
    }
    if (showMessageResponseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) showMessageResponse_));
    }
    if (showMessageResponseCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (protocol.Error) showMessageResponse_);
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
    if (!(obj instanceof protocol.rpc.ShowMessageResponse)) {
      return super.equals(obj);
    }
    protocol.rpc.ShowMessageResponse other = (protocol.rpc.ShowMessageResponse) obj;

    boolean result = true;
    result = result && getShowMessageResponseCase().equals(
        other.getShowMessageResponseCase());
    if (!result) return false;
    switch (showMessageResponseCase_) {
      case 1:
        result = result && getMessageActionItem()
            .equals(other.getMessageActionItem());
        break;
      case 2:
        result = result && getEmptyValue()
            == other.getEmptyValue();
        break;
      case 3:
        result = result && getError()
            .equals(other.getError());
        break;
      case 0:
      default:
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
    switch (showMessageResponseCase_) {
      case 1:
        hash = (37 * hash) + MESSAGE_ACTION_ITEM_FIELD_NUMBER;
        hash = (53 * hash) + getMessageActionItem().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EMPTY_FIELD_NUMBER;
        hash = (53 * hash) + getEmptyValue();
        break;
      case 3:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.ShowMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ShowMessageResponse parseFrom(
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
  public static Builder newBuilder(protocol.rpc.ShowMessageResponse prototype) {
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
   * ShowMessageResponse represents a ShowMessage response.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.ShowMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.ShowMessageResponse)
      protocol.rpc.ShowMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.ShowMessageResponse.class, protocol.rpc.ShowMessageResponse.Builder.class);
    }

    // Construct using protocol.rpc.ShowMessageResponse.newBuilder()
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
      showMessageResponseCase_ = 0;
      showMessageResponse_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ShowMessageResponse_descriptor;
    }

    public protocol.rpc.ShowMessageResponse getDefaultInstanceForType() {
      return protocol.rpc.ShowMessageResponse.getDefaultInstance();
    }

    public protocol.rpc.ShowMessageResponse build() {
      protocol.rpc.ShowMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.ShowMessageResponse buildPartial() {
      protocol.rpc.ShowMessageResponse result = new protocol.rpc.ShowMessageResponse(this);
      if (showMessageResponseCase_ == 1) {
        if (messageActionItemBuilder_ == null) {
          result.showMessageResponse_ = showMessageResponse_;
        } else {
          result.showMessageResponse_ = messageActionItemBuilder_.build();
        }
      }
      if (showMessageResponseCase_ == 2) {
        result.showMessageResponse_ = showMessageResponse_;
      }
      if (showMessageResponseCase_ == 3) {
        if (errorBuilder_ == null) {
          result.showMessageResponse_ = showMessageResponse_;
        } else {
          result.showMessageResponse_ = errorBuilder_.build();
        }
      }
      result.showMessageResponseCase_ = showMessageResponseCase_;
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
      if (other instanceof protocol.rpc.ShowMessageResponse) {
        return mergeFrom((protocol.rpc.ShowMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.ShowMessageResponse other) {
      if (other == protocol.rpc.ShowMessageResponse.getDefaultInstance()) return this;
      switch (other.getShowMessageResponseCase()) {
        case MESSAGE_ACTION_ITEM: {
          mergeMessageActionItem(other.getMessageActionItem());
          break;
        }
        case EMPTY: {
          setEmptyValue(other.getEmptyValue());
          break;
        }
        case ERROR: {
          mergeError(other.getError());
          break;
        }
        case SHOWMESSAGERESPONSE_NOT_SET: {
          break;
        }
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
      protocol.rpc.ShowMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.ShowMessageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int showMessageResponseCase_ = 0;
    private java.lang.Object showMessageResponse_;
    public ShowMessageResponseCase
        getShowMessageResponseCase() {
      return ShowMessageResponseCase.forNumber(
          showMessageResponseCase_);
    }

    public Builder clearShowMessageResponse() {
      showMessageResponseCase_ = 0;
      showMessageResponse_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.MessageActionItem, protocol.rpc.MessageActionItem.Builder, protocol.rpc.MessageActionItemOrBuilder> messageActionItemBuilder_;
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public protocol.rpc.MessageActionItem getMessageActionItem() {
      if (messageActionItemBuilder_ == null) {
        if (showMessageResponseCase_ == 1) {
          return (protocol.rpc.MessageActionItem) showMessageResponse_;
        }
        return protocol.rpc.MessageActionItem.getDefaultInstance();
      } else {
        if (showMessageResponseCase_ == 1) {
          return messageActionItemBuilder_.getMessage();
        }
        return protocol.rpc.MessageActionItem.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public Builder setMessageActionItem(protocol.rpc.MessageActionItem value) {
      if (messageActionItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        showMessageResponse_ = value;
        onChanged();
      } else {
        messageActionItemBuilder_.setMessage(value);
      }
      showMessageResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public Builder setMessageActionItem(
        protocol.rpc.MessageActionItem.Builder builderForValue) {
      if (messageActionItemBuilder_ == null) {
        showMessageResponse_ = builderForValue.build();
        onChanged();
      } else {
        messageActionItemBuilder_.setMessage(builderForValue.build());
      }
      showMessageResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public Builder mergeMessageActionItem(protocol.rpc.MessageActionItem value) {
      if (messageActionItemBuilder_ == null) {
        if (showMessageResponseCase_ == 1 &&
            showMessageResponse_ != protocol.rpc.MessageActionItem.getDefaultInstance()) {
          showMessageResponse_ = protocol.rpc.MessageActionItem.newBuilder((protocol.rpc.MessageActionItem) showMessageResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          showMessageResponse_ = value;
        }
        onChanged();
      } else {
        if (showMessageResponseCase_ == 1) {
          messageActionItemBuilder_.mergeFrom(value);
        }
        messageActionItemBuilder_.setMessage(value);
      }
      showMessageResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public Builder clearMessageActionItem() {
      if (messageActionItemBuilder_ == null) {
        if (showMessageResponseCase_ == 1) {
          showMessageResponseCase_ = 0;
          showMessageResponse_ = null;
          onChanged();
        }
      } else {
        if (showMessageResponseCase_ == 1) {
          showMessageResponseCase_ = 0;
          showMessageResponse_ = null;
        }
        messageActionItemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public protocol.rpc.MessageActionItem.Builder getMessageActionItemBuilder() {
      return getMessageActionItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    public protocol.rpc.MessageActionItemOrBuilder getMessageActionItemOrBuilder() {
      if ((showMessageResponseCase_ == 1) && (messageActionItemBuilder_ != null)) {
        return messageActionItemBuilder_.getMessageOrBuilder();
      } else {
        if (showMessageResponseCase_ == 1) {
          return (protocol.rpc.MessageActionItem) showMessageResponse_;
        }
        return protocol.rpc.MessageActionItem.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.rpc.MessageActionItem message_action_item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.MessageActionItem, protocol.rpc.MessageActionItem.Builder, protocol.rpc.MessageActionItemOrBuilder> 
        getMessageActionItemFieldBuilder() {
      if (messageActionItemBuilder_ == null) {
        if (!(showMessageResponseCase_ == 1)) {
          showMessageResponse_ = protocol.rpc.MessageActionItem.getDefaultInstance();
        }
        messageActionItemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.MessageActionItem, protocol.rpc.MessageActionItem.Builder, protocol.rpc.MessageActionItemOrBuilder>(
                (protocol.rpc.MessageActionItem) showMessageResponse_,
                getParentForChildren(),
                isClean());
        showMessageResponse_ = null;
      }
      showMessageResponseCase_ = 1;
      onChanged();;
      return messageActionItemBuilder_;
    }

    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public int getEmptyValue() {
      if (showMessageResponseCase_ == 2) {
        return ((java.lang.Integer) showMessageResponse_).intValue();
      }
      return 0;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public Builder setEmptyValue(int value) {
      showMessageResponseCase_ = 2;
      showMessageResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public com.google.protobuf.NullValue getEmpty() {
      if (showMessageResponseCase_ == 2) {
        com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
            (java.lang.Integer) showMessageResponse_);
        return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
      }
      return com.google.protobuf.NullValue.NULL_VALUE;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public Builder setEmpty(com.google.protobuf.NullValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      showMessageResponseCase_ = 2;
      showMessageResponse_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public Builder clearEmpty() {
      if (showMessageResponseCase_ == 2) {
        showMessageResponseCase_ = 0;
        showMessageResponse_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Error, protocol.Error.Builder, protocol.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public protocol.Error getError() {
      if (errorBuilder_ == null) {
        if (showMessageResponseCase_ == 3) {
          return (protocol.Error) showMessageResponse_;
        }
        return protocol.Error.getDefaultInstance();
      } else {
        if (showMessageResponseCase_ == 3) {
          return errorBuilder_.getMessage();
        }
        return protocol.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder setError(protocol.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        showMessageResponse_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      showMessageResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder setError(
        protocol.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        showMessageResponse_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      showMessageResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder mergeError(protocol.Error value) {
      if (errorBuilder_ == null) {
        if (showMessageResponseCase_ == 3 &&
            showMessageResponse_ != protocol.Error.getDefaultInstance()) {
          showMessageResponse_ = protocol.Error.newBuilder((protocol.Error) showMessageResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          showMessageResponse_ = value;
        }
        onChanged();
      } else {
        if (showMessageResponseCase_ == 3) {
          errorBuilder_.mergeFrom(value);
        }
        errorBuilder_.setMessage(value);
      }
      showMessageResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (showMessageResponseCase_ == 3) {
          showMessageResponseCase_ = 0;
          showMessageResponse_ = null;
          onChanged();
        }
      } else {
        if (showMessageResponseCase_ == 3) {
          showMessageResponseCase_ = 0;
          showMessageResponse_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public protocol.Error.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public protocol.ErrorOrBuilder getErrorOrBuilder() {
      if ((showMessageResponseCase_ == 3) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (showMessageResponseCase_ == 3) {
          return (protocol.Error) showMessageResponse_;
        }
        return protocol.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Error, protocol.Error.Builder, protocol.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(showMessageResponseCase_ == 3)) {
          showMessageResponse_ = protocol.Error.getDefaultInstance();
        }
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Error, protocol.Error.Builder, protocol.ErrorOrBuilder>(
                (protocol.Error) showMessageResponse_,
                getParentForChildren(),
                isClean());
        showMessageResponse_ = null;
      }
      showMessageResponseCase_ = 3;
      onChanged();;
      return errorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.ShowMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.ShowMessageResponse)
  private static final protocol.rpc.ShowMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.ShowMessageResponse();
  }

  public static protocol.rpc.ShowMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShowMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<ShowMessageResponse>() {
    public ShowMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShowMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShowMessageResponse> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.ShowMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
