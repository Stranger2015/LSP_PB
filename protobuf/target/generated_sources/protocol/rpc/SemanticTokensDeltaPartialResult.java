// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * SemanticTokensDeltaPartialResult represents a partial result of
 * `textDocument/semanticTokens/full/delta` request.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.SemanticTokensDeltaPartialResult}
 */
public  final class SemanticTokensDeltaPartialResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.SemanticTokensDeltaPartialResult)
    SemanticTokensDeltaPartialResultOrBuilder {
  // Use SemanticTokensDeltaPartialResult.newBuilder() to construct.
  private SemanticTokensDeltaPartialResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SemanticTokensDeltaPartialResult() {
    edits_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SemanticTokensDeltaPartialResult(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              edits_ = new java.util.ArrayList<protocol.rpc.SemanticTokensEdit>();
              mutable_bitField0_ |= 0x00000001;
            }
            edits_.add(
                input.readMessage(protocol.rpc.SemanticTokensEdit.parser(), extensionRegistry));
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
        edits_ = java.util.Collections.unmodifiableList(edits_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensDeltaPartialResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensDeltaPartialResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.SemanticTokensDeltaPartialResult.class, protocol.rpc.SemanticTokensDeltaPartialResult.Builder.class);
  }

  public static final int EDITS_FIELD_NUMBER = 2;
  private java.util.List<protocol.rpc.SemanticTokensEdit> edits_;
  /**
   * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.util.List<protocol.rpc.SemanticTokensEdit> getEditsList() {
    return edits_;
  }
  /**
   * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.util.List<? extends protocol.rpc.SemanticTokensEditOrBuilder> 
      getEditsOrBuilderList() {
    return edits_;
  }
  /**
   * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getEditsCount() {
    return edits_.size();
  }
  /**
   * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.SemanticTokensEdit getEdits(int index) {
    return edits_.get(index);
  }
  /**
   * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.SemanticTokensEditOrBuilder getEditsOrBuilder(
      int index) {
    return edits_.get(index);
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
    for (int i = 0; i < edits_.size(); i++) {
      output.writeMessage(2, edits_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < edits_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, edits_.get(i));
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
    if (!(obj instanceof protocol.rpc.SemanticTokensDeltaPartialResult)) {
      return super.equals(obj);
    }
    protocol.rpc.SemanticTokensDeltaPartialResult other = (protocol.rpc.SemanticTokensDeltaPartialResult) obj;

    boolean result = true;
    result = result && getEditsList()
        .equals(other.getEditsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEditsCount() > 0) {
      hash = (37 * hash) + EDITS_FIELD_NUMBER;
      hash = (53 * hash) + getEditsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SemanticTokensDeltaPartialResult parseFrom(
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
  public static Builder newBuilder(protocol.rpc.SemanticTokensDeltaPartialResult prototype) {
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
   * SemanticTokensDeltaPartialResult represents a partial result of
   * `textDocument/semanticTokens/full/delta` request.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.SemanticTokensDeltaPartialResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.SemanticTokensDeltaPartialResult)
      protocol.rpc.SemanticTokensDeltaPartialResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensDeltaPartialResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensDeltaPartialResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.SemanticTokensDeltaPartialResult.class, protocol.rpc.SemanticTokensDeltaPartialResult.Builder.class);
    }

    // Construct using protocol.rpc.SemanticTokensDeltaPartialResult.newBuilder()
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
        getEditsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (editsBuilder_ == null) {
        edits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        editsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SemanticTokensDeltaPartialResult_descriptor;
    }

    public protocol.rpc.SemanticTokensDeltaPartialResult getDefaultInstanceForType() {
      return protocol.rpc.SemanticTokensDeltaPartialResult.getDefaultInstance();
    }

    public protocol.rpc.SemanticTokensDeltaPartialResult build() {
      protocol.rpc.SemanticTokensDeltaPartialResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.SemanticTokensDeltaPartialResult buildPartial() {
      protocol.rpc.SemanticTokensDeltaPartialResult result = new protocol.rpc.SemanticTokensDeltaPartialResult(this);
      int from_bitField0_ = bitField0_;
      if (editsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          edits_ = java.util.Collections.unmodifiableList(edits_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.edits_ = edits_;
      } else {
        result.edits_ = editsBuilder_.build();
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
      if (other instanceof protocol.rpc.SemanticTokensDeltaPartialResult) {
        return mergeFrom((protocol.rpc.SemanticTokensDeltaPartialResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.SemanticTokensDeltaPartialResult other) {
      if (other == protocol.rpc.SemanticTokensDeltaPartialResult.getDefaultInstance()) return this;
      if (editsBuilder_ == null) {
        if (!other.edits_.isEmpty()) {
          if (edits_.isEmpty()) {
            edits_ = other.edits_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEditsIsMutable();
            edits_.addAll(other.edits_);
          }
          onChanged();
        }
      } else {
        if (!other.edits_.isEmpty()) {
          if (editsBuilder_.isEmpty()) {
            editsBuilder_.dispose();
            editsBuilder_ = null;
            edits_ = other.edits_;
            bitField0_ = (bitField0_ & ~0x00000001);
            editsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEditsFieldBuilder() : null;
          } else {
            editsBuilder_.addAllMessages(other.edits_);
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
      protocol.rpc.SemanticTokensDeltaPartialResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.SemanticTokensDeltaPartialResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<protocol.rpc.SemanticTokensEdit> edits_ =
      java.util.Collections.emptyList();
    private void ensureEditsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        edits_ = new java.util.ArrayList<protocol.rpc.SemanticTokensEdit>(edits_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.SemanticTokensEdit, protocol.rpc.SemanticTokensEdit.Builder, protocol.rpc.SemanticTokensEditOrBuilder> editsBuilder_;

    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<protocol.rpc.SemanticTokensEdit> getEditsList() {
      if (editsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(edits_);
      } else {
        return editsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getEditsCount() {
      if (editsBuilder_ == null) {
        return edits_.size();
      } else {
        return editsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SemanticTokensEdit getEdits(int index) {
      if (editsBuilder_ == null) {
        return edits_.get(index);
      } else {
        return editsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEdits(
        int index, protocol.rpc.SemanticTokensEdit value) {
      if (editsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditsIsMutable();
        edits_.set(index, value);
        onChanged();
      } else {
        editsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEdits(
        int index, protocol.rpc.SemanticTokensEdit.Builder builderForValue) {
      if (editsBuilder_ == null) {
        ensureEditsIsMutable();
        edits_.set(index, builderForValue.build());
        onChanged();
      } else {
        editsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addEdits(protocol.rpc.SemanticTokensEdit value) {
      if (editsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditsIsMutable();
        edits_.add(value);
        onChanged();
      } else {
        editsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addEdits(
        int index, protocol.rpc.SemanticTokensEdit value) {
      if (editsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditsIsMutable();
        edits_.add(index, value);
        onChanged();
      } else {
        editsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addEdits(
        protocol.rpc.SemanticTokensEdit.Builder builderForValue) {
      if (editsBuilder_ == null) {
        ensureEditsIsMutable();
        edits_.add(builderForValue.build());
        onChanged();
      } else {
        editsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addEdits(
        int index, protocol.rpc.SemanticTokensEdit.Builder builderForValue) {
      if (editsBuilder_ == null) {
        ensureEditsIsMutable();
        edits_.add(index, builderForValue.build());
        onChanged();
      } else {
        editsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllEdits(
        java.lang.Iterable<? extends protocol.rpc.SemanticTokensEdit> values) {
      if (editsBuilder_ == null) {
        ensureEditsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, edits_);
        onChanged();
      } else {
        editsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEdits() {
      if (editsBuilder_ == null) {
        edits_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        editsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeEdits(int index) {
      if (editsBuilder_ == null) {
        ensureEditsIsMutable();
        edits_.remove(index);
        onChanged();
      } else {
        editsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SemanticTokensEdit.Builder getEditsBuilder(
        int index) {
      return getEditsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SemanticTokensEditOrBuilder getEditsOrBuilder(
        int index) {
      if (editsBuilder_ == null) {
        return edits_.get(index);  } else {
        return editsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends protocol.rpc.SemanticTokensEditOrBuilder> 
         getEditsOrBuilderList() {
      if (editsBuilder_ != null) {
        return editsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(edits_);
      }
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SemanticTokensEdit.Builder addEditsBuilder() {
      return getEditsFieldBuilder().addBuilder(
          protocol.rpc.SemanticTokensEdit.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SemanticTokensEdit.Builder addEditsBuilder(
        int index) {
      return getEditsFieldBuilder().addBuilder(
          index, protocol.rpc.SemanticTokensEdit.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.rpc.SemanticTokensEdit edits = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<protocol.rpc.SemanticTokensEdit.Builder> 
         getEditsBuilderList() {
      return getEditsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.SemanticTokensEdit, protocol.rpc.SemanticTokensEdit.Builder, protocol.rpc.SemanticTokensEditOrBuilder> 
        getEditsFieldBuilder() {
      if (editsBuilder_ == null) {
        editsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protocol.rpc.SemanticTokensEdit, protocol.rpc.SemanticTokensEdit.Builder, protocol.rpc.SemanticTokensEditOrBuilder>(
                edits_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        edits_ = null;
      }
      return editsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.SemanticTokensDeltaPartialResult)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.SemanticTokensDeltaPartialResult)
  private static final protocol.rpc.SemanticTokensDeltaPartialResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.SemanticTokensDeltaPartialResult();
  }

  public static protocol.rpc.SemanticTokensDeltaPartialResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SemanticTokensDeltaPartialResult>
      PARSER = new com.google.protobuf.AbstractParser<SemanticTokensDeltaPartialResult>() {
    public SemanticTokensDeltaPartialResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SemanticTokensDeltaPartialResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SemanticTokensDeltaPartialResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SemanticTokensDeltaPartialResult> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.SemanticTokensDeltaPartialResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
