// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CompletionList represents a collection of [completion items](#CompletionItem) to be presented
 * in the editor.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.CompletionList}
 */
public  final class CompletionList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.CompletionList)
    CompletionListOrBuilder {
  // Use CompletionList.newBuilder() to construct.
  private CompletionList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompletionList() {
    isIncomplete_ = false;
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CompletionList(
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

            isIncomplete_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              items_ = new java.util.ArrayList<protocol.rpc.CompletionItem>();
              mutable_bitField0_ |= 0x00000002;
            }
            items_.add(
                input.readMessage(protocol.rpc.CompletionItem.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.CompletionList.class, protocol.rpc.CompletionList.Builder.class);
  }

  private int bitField0_;
  public static final int IS_INCOMPLETE_FIELD_NUMBER = 1;
  private boolean isIncomplete_;
  /**
   * <pre>
   * Optional. This list it not complete. Further typing should result in recomputing
   * this list.
   * </pre>
   *
   * <code>bool is_incomplete = 1;</code>
   */
  public boolean getIsIncomplete() {
    return isIncomplete_;
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  private java.util.List<protocol.rpc.CompletionItem> items_;
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  public java.util.List<protocol.rpc.CompletionItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  public java.util.List<? extends protocol.rpc.CompletionItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  public protocol.rpc.CompletionItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  public protocol.rpc.CompletionItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    if (isIncomplete_ != false) {
      output.writeBool(1, isIncomplete_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isIncomplete_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isIncomplete_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
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
    if (!(obj instanceof protocol.rpc.CompletionList)) {
      return super.equals(obj);
    }
    protocol.rpc.CompletionList other = (protocol.rpc.CompletionList) obj;

    boolean result = true;
    result = result && (getIsIncomplete()
        == other.getIsIncomplete());
    result = result && getItemsList()
        .equals(other.getItemsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IS_INCOMPLETE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsIncomplete());
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.CompletionList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CompletionList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CompletionList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CompletionList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CompletionList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CompletionList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CompletionList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionList parseFrom(
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
  public static Builder newBuilder(protocol.rpc.CompletionList prototype) {
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
   * CompletionList represents a collection of [completion items](#CompletionItem) to be presented
   * in the editor.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.CompletionList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.CompletionList)
      protocol.rpc.CompletionListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.CompletionList.class, protocol.rpc.CompletionList.Builder.class);
    }

    // Construct using protocol.rpc.CompletionList.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isIncomplete_ = false;

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionList_descriptor;
    }

    public protocol.rpc.CompletionList getDefaultInstanceForType() {
      return protocol.rpc.CompletionList.getDefaultInstance();
    }

    public protocol.rpc.CompletionList build() {
      protocol.rpc.CompletionList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.CompletionList buildPartial() {
      protocol.rpc.CompletionList result = new protocol.rpc.CompletionList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isIncomplete_ = isIncomplete_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof protocol.rpc.CompletionList) {
        return mergeFrom((protocol.rpc.CompletionList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.CompletionList other) {
      if (other == protocol.rpc.CompletionList.getDefaultInstance()) return this;
      if (other.getIsIncomplete() != false) {
        setIsIncomplete(other.getIsIncomplete());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
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
      protocol.rpc.CompletionList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.CompletionList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean isIncomplete_ ;
    /**
     * <pre>
     * Optional. This list it not complete. Further typing should result in recomputing
     * this list.
     * </pre>
     *
     * <code>bool is_incomplete = 1;</code>
     */
    public boolean getIsIncomplete() {
      return isIncomplete_;
    }
    /**
     * <pre>
     * Optional. This list it not complete. Further typing should result in recomputing
     * this list.
     * </pre>
     *
     * <code>bool is_incomplete = 1;</code>
     */
    public Builder setIsIncomplete(boolean value) {
      
      isIncomplete_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This list it not complete. Further typing should result in recomputing
     * this list.
     * </pre>
     *
     * <code>bool is_incomplete = 1;</code>
     */
    public Builder clearIsIncomplete() {
      
      isIncomplete_ = false;
      onChanged();
      return this;
    }

    private java.util.List<protocol.rpc.CompletionItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        items_ = new java.util.ArrayList<protocol.rpc.CompletionItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.CompletionItem, protocol.rpc.CompletionItem.Builder, protocol.rpc.CompletionItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public java.util.List<protocol.rpc.CompletionItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public protocol.rpc.CompletionItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder setItems(
        int index, protocol.rpc.CompletionItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder setItems(
        int index, protocol.rpc.CompletionItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder addItems(protocol.rpc.CompletionItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder addItems(
        int index, protocol.rpc.CompletionItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder addItems(
        protocol.rpc.CompletionItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder addItems(
        int index, protocol.rpc.CompletionItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends protocol.rpc.CompletionItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public protocol.rpc.CompletionItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public protocol.rpc.CompletionItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public java.util.List<? extends protocol.rpc.CompletionItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public protocol.rpc.CompletionItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          protocol.rpc.CompletionItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public protocol.rpc.CompletionItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, protocol.rpc.CompletionItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The completion items.
     * </pre>
     *
     * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
     */
    public java.util.List<protocol.rpc.CompletionItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.CompletionItem, protocol.rpc.CompletionItem.Builder, protocol.rpc.CompletionItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protocol.rpc.CompletionItem, protocol.rpc.CompletionItem.Builder, protocol.rpc.CompletionItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.CompletionList)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.CompletionList)
  private static final protocol.rpc.CompletionList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.CompletionList();
  }

  public static protocol.rpc.CompletionList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompletionList>
      PARSER = new com.google.protobuf.AbstractParser<CompletionList>() {
    public CompletionList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompletionList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompletionList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompletionList> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.CompletionList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

