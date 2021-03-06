// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * UnregistrationParams represents a `client/unregisterCapability` request params.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.UnregistrationParams}
 */
public  final class UnregistrationParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.UnregistrationParams)
    UnregistrationParamsOrBuilder {
  // Use UnregistrationParams.newBuilder() to construct.
  private UnregistrationParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnregistrationParams() {
    unregisterations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UnregistrationParams(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              unregisterations_ = new java.util.ArrayList<protocol.rpc.Unregistration>();
              mutable_bitField0_ |= 0x00000001;
            }
            unregisterations_.add(
                input.readMessage(protocol.rpc.Unregistration.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        unregisterations_ = java.util.Collections.unmodifiableList(unregisterations_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_UnregistrationParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_UnregistrationParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.UnregistrationParams.class, protocol.rpc.UnregistrationParams.Builder.class);
  }

  public static final int UNREGISTERATIONS_FIELD_NUMBER = 1;
  private java.util.List<protocol.rpc.Unregistration> unregisterations_;
  /**
   * <pre>
   * This should correctly be named `unregistrations`. However changing this
   * is a breaking change and needs to wait until we deliver a 4.x version
   * of the specification.
   * </pre>
   *
   * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.util.List<protocol.rpc.Unregistration> getUnregisterationsList() {
    return unregisterations_;
  }
  /**
   * <pre>
   * This should correctly be named `unregistrations`. However changing this
   * is a breaking change and needs to wait until we deliver a 4.x version
   * of the specification.
   * </pre>
   *
   * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.util.List<? extends protocol.rpc.UnregistrationOrBuilder> 
      getUnregisterationsOrBuilderList() {
    return unregisterations_;
  }
  /**
   * <pre>
   * This should correctly be named `unregistrations`. However changing this
   * is a breaking change and needs to wait until we deliver a 4.x version
   * of the specification.
   * </pre>
   *
   * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getUnregisterationsCount() {
    return unregisterations_.size();
  }
  /**
   * <pre>
   * This should correctly be named `unregistrations`. However changing this
   * is a breaking change and needs to wait until we deliver a 4.x version
   * of the specification.
   * </pre>
   *
   * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.Unregistration getUnregisterations(int index) {
    return unregisterations_.get(index);
  }
  /**
   * <pre>
   * This should correctly be named `unregistrations`. However changing this
   * is a breaking change and needs to wait until we deliver a 4.x version
   * of the specification.
   * </pre>
   *
   * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.UnregistrationOrBuilder getUnregisterationsOrBuilder(
      int index) {
    return unregisterations_.get(index);
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
    for (int i = 0; i < unregisterations_.size(); i++) {
      output.writeMessage(1, unregisterations_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < unregisterations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, unregisterations_.get(i));
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
    if (!(obj instanceof protocol.rpc.UnregistrationParams)) {
      return super.equals(obj);
    }
    protocol.rpc.UnregistrationParams other = (protocol.rpc.UnregistrationParams) obj;

    boolean result = true;
    result = result && getUnregisterationsList()
        .equals(other.getUnregisterationsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUnregisterationsCount() > 0) {
      hash = (37 * hash) + UNREGISTERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getUnregisterationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.UnregistrationParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.UnregistrationParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.UnregistrationParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.UnregistrationParams parseFrom(
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
  public static Builder newBuilder(protocol.rpc.UnregistrationParams prototype) {
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
   * UnregistrationParams represents a `client/unregisterCapability` request params.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.UnregistrationParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.UnregistrationParams)
      protocol.rpc.UnregistrationParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_UnregistrationParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_UnregistrationParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.UnregistrationParams.class, protocol.rpc.UnregistrationParams.Builder.class);
    }

    // Construct using protocol.rpc.UnregistrationParams.newBuilder()
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
        getUnregisterationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (unregisterationsBuilder_ == null) {
        unregisterations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        unregisterationsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_UnregistrationParams_descriptor;
    }

    public protocol.rpc.UnregistrationParams getDefaultInstanceForType() {
      return protocol.rpc.UnregistrationParams.getDefaultInstance();
    }

    public protocol.rpc.UnregistrationParams build() {
      protocol.rpc.UnregistrationParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.UnregistrationParams buildPartial() {
      protocol.rpc.UnregistrationParams result = new protocol.rpc.UnregistrationParams(this);
      int from_bitField0_ = bitField0_;
      if (unregisterationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          unregisterations_ = java.util.Collections.unmodifiableList(unregisterations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unregisterations_ = unregisterations_;
      } else {
        result.unregisterations_ = unregisterationsBuilder_.build();
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
      if (other instanceof protocol.rpc.UnregistrationParams) {
        return mergeFrom((protocol.rpc.UnregistrationParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.UnregistrationParams other) {
      if (other == protocol.rpc.UnregistrationParams.getDefaultInstance()) return this;
      if (unregisterationsBuilder_ == null) {
        if (!other.unregisterations_.isEmpty()) {
          if (unregisterations_.isEmpty()) {
            unregisterations_ = other.unregisterations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnregisterationsIsMutable();
            unregisterations_.addAll(other.unregisterations_);
          }
          onChanged();
        }
      } else {
        if (!other.unregisterations_.isEmpty()) {
          if (unregisterationsBuilder_.isEmpty()) {
            unregisterationsBuilder_.dispose();
            unregisterationsBuilder_ = null;
            unregisterations_ = other.unregisterations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            unregisterationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUnregisterationsFieldBuilder() : null;
          } else {
            unregisterationsBuilder_.addAllMessages(other.unregisterations_);
          }
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
      protocol.rpc.UnregistrationParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.UnregistrationParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<protocol.rpc.Unregistration> unregisterations_ =
      java.util.Collections.emptyList();
    private void ensureUnregisterationsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        unregisterations_ = new java.util.ArrayList<protocol.rpc.Unregistration>(unregisterations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.Unregistration, protocol.rpc.Unregistration.Builder, protocol.rpc.UnregistrationOrBuilder> unregisterationsBuilder_;

    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<protocol.rpc.Unregistration> getUnregisterationsList() {
      if (unregisterationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(unregisterations_);
      } else {
        return unregisterationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getUnregisterationsCount() {
      if (unregisterationsBuilder_ == null) {
        return unregisterations_.size();
      } else {
        return unregisterationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.Unregistration getUnregisterations(int index) {
      if (unregisterationsBuilder_ == null) {
        return unregisterations_.get(index);
      } else {
        return unregisterationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUnregisterations(
        int index, protocol.rpc.Unregistration value) {
      if (unregisterationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnregisterationsIsMutable();
        unregisterations_.set(index, value);
        onChanged();
      } else {
        unregisterationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUnregisterations(
        int index, protocol.rpc.Unregistration.Builder builderForValue) {
      if (unregisterationsBuilder_ == null) {
        ensureUnregisterationsIsMutable();
        unregisterations_.set(index, builderForValue.build());
        onChanged();
      } else {
        unregisterationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addUnregisterations(protocol.rpc.Unregistration value) {
      if (unregisterationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnregisterationsIsMutable();
        unregisterations_.add(value);
        onChanged();
      } else {
        unregisterationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addUnregisterations(
        int index, protocol.rpc.Unregistration value) {
      if (unregisterationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnregisterationsIsMutable();
        unregisterations_.add(index, value);
        onChanged();
      } else {
        unregisterationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addUnregisterations(
        protocol.rpc.Unregistration.Builder builderForValue) {
      if (unregisterationsBuilder_ == null) {
        ensureUnregisterationsIsMutable();
        unregisterations_.add(builderForValue.build());
        onChanged();
      } else {
        unregisterationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addUnregisterations(
        int index, protocol.rpc.Unregistration.Builder builderForValue) {
      if (unregisterationsBuilder_ == null) {
        ensureUnregisterationsIsMutable();
        unregisterations_.add(index, builderForValue.build());
        onChanged();
      } else {
        unregisterationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllUnregisterations(
        java.lang.Iterable<? extends protocol.rpc.Unregistration> values) {
      if (unregisterationsBuilder_ == null) {
        ensureUnregisterationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unregisterations_);
        onChanged();
      } else {
        unregisterationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUnregisterations() {
      if (unregisterationsBuilder_ == null) {
        unregisterations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        unregisterationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeUnregisterations(int index) {
      if (unregisterationsBuilder_ == null) {
        ensureUnregisterationsIsMutable();
        unregisterations_.remove(index);
        onChanged();
      } else {
        unregisterationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.Unregistration.Builder getUnregisterationsBuilder(
        int index) {
      return getUnregisterationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.UnregistrationOrBuilder getUnregisterationsOrBuilder(
        int index) {
      if (unregisterationsBuilder_ == null) {
        return unregisterations_.get(index);  } else {
        return unregisterationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends protocol.rpc.UnregistrationOrBuilder> 
         getUnregisterationsOrBuilderList() {
      if (unregisterationsBuilder_ != null) {
        return unregisterationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(unregisterations_);
      }
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.Unregistration.Builder addUnregisterationsBuilder() {
      return getUnregisterationsFieldBuilder().addBuilder(
          protocol.rpc.Unregistration.getDefaultInstance());
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.Unregistration.Builder addUnregisterationsBuilder(
        int index) {
      return getUnregisterationsFieldBuilder().addBuilder(
          index, protocol.rpc.Unregistration.getDefaultInstance());
    }
    /**
     * <pre>
     * This should correctly be named `unregistrations`. However changing this
     * is a breaking change and needs to wait until we deliver a 4.x version
     * of the specification.
     * </pre>
     *
     * <code>repeated .protocol.rpc.Unregistration unregisterations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<protocol.rpc.Unregistration.Builder> 
         getUnregisterationsBuilderList() {
      return getUnregisterationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.Unregistration, protocol.rpc.Unregistration.Builder, protocol.rpc.UnregistrationOrBuilder> 
        getUnregisterationsFieldBuilder() {
      if (unregisterationsBuilder_ == null) {
        unregisterationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protocol.rpc.Unregistration, protocol.rpc.Unregistration.Builder, protocol.rpc.UnregistrationOrBuilder>(
                unregisterations_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        unregisterations_ = null;
      }
      return unregisterationsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.UnregistrationParams)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.UnregistrationParams)
  private static final protocol.rpc.UnregistrationParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.UnregistrationParams();
  }

  public static protocol.rpc.UnregistrationParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnregistrationParams>
      PARSER = new com.google.protobuf.AbstractParser<UnregistrationParams>() {
    public UnregistrationParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnregistrationParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnregistrationParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnregistrationParams> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.UnregistrationParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

