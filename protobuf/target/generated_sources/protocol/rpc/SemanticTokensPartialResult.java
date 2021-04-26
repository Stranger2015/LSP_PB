// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * SemanticTokensPartialResult represents a partial result of `textDocument/semanticTokens/full`
 * request.
 * &#64;since 3.16.0
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.SemanticTokensPartialResult}
 */
public  final class SemanticTokensPartialResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.SemanticTokensPartialResult)
    SemanticTokensPartialResultOrBuilder {
  // Use SemanticTokensPartialResult.newBuilder() to construct.
  private SemanticTokensPartialResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SemanticTokensPartialResult() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SemanticTokensPartialResult(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              data_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              data_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              data_.add(input.readInt32());
            }
            input.popLimit(limit);
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
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensPartialResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensPartialResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.SemanticTokensPartialResult.class, protocol.rpc.SemanticTokensPartialResult.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> data_;
  /**
   * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.util.List<java.lang.Integer>
      getDataList() {
    return data_;
  }
  /**
   * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getData(int index) {
    return data_.get(index);
  }
  private int dataMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getDataList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(dataMemoizedSerializedSize);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeInt32NoTag(data_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < data_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(data_.get(i));
      }
      size += dataSize;
      if (!getDataList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dataMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof protocol.rpc.SemanticTokensPartialResult)) {
      return super.equals(obj);
    }
    protocol.rpc.SemanticTokensPartialResult other = (protocol.rpc.SemanticTokensPartialResult) obj;

    boolean result = true;
    result = result && getDataList()
        .equals(other.getDataList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensPartialResult parseFrom(
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
  public static Builder newBuilder(protocol.rpc.SemanticTokensPartialResult prototype) {
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
   * SemanticTokensPartialResult represents a partial result of `textDocument/semanticTokens/full`
   * request.
   * &#64;since 3.16.0
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.SemanticTokensPartialResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.SemanticTokensPartialResult)
      protocol.rpc.SemanticTokensPartialResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensPartialResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensPartialResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.SemanticTokensPartialResult.class, protocol.rpc.SemanticTokensPartialResult.Builder.class);
    }

    // Construct using protocol.rpc.SemanticTokensPartialResult.newBuilder()
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
      data_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensPartialResult_descriptor;
    }

    public protocol.rpc.SemanticTokensPartialResult getDefaultInstanceForType() {
      return protocol.rpc.SemanticTokensPartialResult.getDefaultInstance();
    }

    public protocol.rpc.SemanticTokensPartialResult build() {
      protocol.rpc.SemanticTokensPartialResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.SemanticTokensPartialResult buildPartial() {
      protocol.rpc.SemanticTokensPartialResult result = new protocol.rpc.SemanticTokensPartialResult(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        data_ = java.util.Collections.unmodifiableList(data_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.data_ = data_;
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
      if (other instanceof protocol.rpc.SemanticTokensPartialResult) {
        return mergeFrom((protocol.rpc.SemanticTokensPartialResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.SemanticTokensPartialResult other) {
      if (other == protocol.rpc.SemanticTokensPartialResult.getDefaultInstance()) return this;
      if (!other.data_.isEmpty()) {
        if (data_.isEmpty()) {
          data_ = other.data_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDataIsMutable();
          data_.addAll(other.data_);
        }
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
      protocol.rpc.SemanticTokensPartialResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.SemanticTokensPartialResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> data_ = java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        data_ = new java.util.ArrayList<java.lang.Integer>(data_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<java.lang.Integer>
        getDataList() {
      return java.util.Collections.unmodifiableList(data_);
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getData(int index) {
      return data_.get(index);
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setData(
        int index, int value) {
      ensureDataIsMutable();
      data_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addData(int value) {
      ensureDataIsMutable();
      data_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureDataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, data_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 data = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearData() {
      data_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.SemanticTokensPartialResult)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.SemanticTokensPartialResult)
  private static final protocol.rpc.SemanticTokensPartialResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.SemanticTokensPartialResult();
  }

  public static protocol.rpc.SemanticTokensPartialResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SemanticTokensPartialResult>
      PARSER = new com.google.protobuf.AbstractParser<SemanticTokensPartialResult>() {
    public SemanticTokensPartialResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SemanticTokensPartialResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SemanticTokensPartialResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SemanticTokensPartialResult> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.SemanticTokensPartialResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

