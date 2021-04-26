// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CallHierarchyOutgoingCallsRequest is the parameters of a `callHierarchy/outgoingCalls` request.
 * &#64;since 3.16.0
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.CallHierarchyOutgoingCallsRequest}
 */
public  final class CallHierarchyOutgoingCallsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.CallHierarchyOutgoingCallsRequest)
    CallHierarchyOutgoingCallsRequestOrBuilder {
  // Use CallHierarchyOutgoingCallsRequest.newBuilder() to construct.
  private CallHierarchyOutgoingCallsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallHierarchyOutgoingCallsRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CallHierarchyOutgoingCallsRequest(
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
            protocol.rpc.WorkDoneProgressParams.Builder subBuilder = null;
            if (workDoneProgressParams_ != null) {
              subBuilder = workDoneProgressParams_.toBuilder();
            }
            workDoneProgressParams_ = input.readMessage(protocol.rpc.WorkDoneProgressParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workDoneProgressParams_);
              workDoneProgressParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            protocol.rpc.PartialResultParams.Builder subBuilder = null;
            if (partialResultParams_ != null) {
              subBuilder = partialResultParams_.toBuilder();
            }
            partialResultParams_ = input.readMessage(protocol.rpc.PartialResultParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partialResultParams_);
              partialResultParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            protocol.rpc.CallHierarchyItem.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(protocol.rpc.CallHierarchyItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CallHierarchyOutgoingCallsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CallHierarchyOutgoingCallsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.CallHierarchyOutgoingCallsRequest.class, protocol.rpc.CallHierarchyOutgoingCallsRequest.Builder.class);
  }

  public static final int WORK_DONE_PROGRESS_PARAMS_FIELD_NUMBER = 1;
  private protocol.rpc.WorkDoneProgressParams workDoneProgressParams_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  public boolean hasWorkDoneProgressParams() {
    return workDoneProgressParams_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  public protocol.rpc.WorkDoneProgressParams getWorkDoneProgressParams() {
    return workDoneProgressParams_ == null ? protocol.rpc.WorkDoneProgressParams.getDefaultInstance() : workDoneProgressParams_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
   */
  public protocol.rpc.WorkDoneProgressParamsOrBuilder getWorkDoneProgressParamsOrBuilder() {
    return getWorkDoneProgressParams();
  }

  public static final int PARTIAL_RESULT_PARAMS_FIELD_NUMBER = 2;
  private protocol.rpc.PartialResultParams partialResultParams_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  public boolean hasPartialResultParams() {
    return partialResultParams_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  public protocol.rpc.PartialResultParams getPartialResultParams() {
    return partialResultParams_ == null ? protocol.rpc.PartialResultParams.getDefaultInstance() : partialResultParams_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
   */
  public protocol.rpc.PartialResultParamsOrBuilder getPartialResultParamsOrBuilder() {
    return getPartialResultParams();
  }

  public static final int ITEM_FIELD_NUMBER = 3;
  private protocol.rpc.CallHierarchyItem item_;
  /**
   * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.CallHierarchyItem getItem() {
    return item_ == null ? protocol.rpc.CallHierarchyItem.getDefaultInstance() : item_;
  }
  /**
   * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.CallHierarchyItemOrBuilder getItemOrBuilder() {
    return getItem();
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
    if (workDoneProgressParams_ != null) {
      output.writeMessage(1, getWorkDoneProgressParams());
    }
    if (partialResultParams_ != null) {
      output.writeMessage(2, getPartialResultParams());
    }
    if (item_ != null) {
      output.writeMessage(3, getItem());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workDoneProgressParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkDoneProgressParams());
    }
    if (partialResultParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPartialResultParams());
    }
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getItem());
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
    if (!(obj instanceof protocol.rpc.CallHierarchyOutgoingCallsRequest)) {
      return super.equals(obj);
    }
    protocol.rpc.CallHierarchyOutgoingCallsRequest other = (protocol.rpc.CallHierarchyOutgoingCallsRequest) obj;

    boolean result = true;
    result = result && (hasWorkDoneProgressParams() == other.hasWorkDoneProgressParams());
    if (hasWorkDoneProgressParams()) {
      result = result && getWorkDoneProgressParams()
          .equals(other.getWorkDoneProgressParams());
    }
    result = result && (hasPartialResultParams() == other.hasPartialResultParams());
    if (hasPartialResultParams()) {
      result = result && getPartialResultParams()
          .equals(other.getPartialResultParams());
    }
    result = result && (hasItem() == other.hasItem());
    if (hasItem()) {
      result = result && getItem()
          .equals(other.getItem());
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
    if (hasWorkDoneProgressParams()) {
      hash = (37 * hash) + WORK_DONE_PROGRESS_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkDoneProgressParams().hashCode();
    }
    if (hasPartialResultParams()) {
      hash = (37 * hash) + PARTIAL_RESULT_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getPartialResultParams().hashCode();
    }
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CallHierarchyOutgoingCallsRequest parseFrom(
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
  public static Builder newBuilder(protocol.rpc.CallHierarchyOutgoingCallsRequest prototype) {
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
   * CallHierarchyOutgoingCallsRequest is the parameters of a `callHierarchy/outgoingCalls` request.
   * &#64;since 3.16.0
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.CallHierarchyOutgoingCallsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.CallHierarchyOutgoingCallsRequest)
      protocol.rpc.CallHierarchyOutgoingCallsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CallHierarchyOutgoingCallsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CallHierarchyOutgoingCallsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.CallHierarchyOutgoingCallsRequest.class, protocol.rpc.CallHierarchyOutgoingCallsRequest.Builder.class);
    }

    // Construct using protocol.rpc.CallHierarchyOutgoingCallsRequest.newBuilder()
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
      if (workDoneProgressParamsBuilder_ == null) {
        workDoneProgressParams_ = null;
      } else {
        workDoneProgressParams_ = null;
        workDoneProgressParamsBuilder_ = null;
      }
      if (partialResultParamsBuilder_ == null) {
        partialResultParams_ = null;
      } else {
        partialResultParams_ = null;
        partialResultParamsBuilder_ = null;
      }
      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CallHierarchyOutgoingCallsRequest_descriptor;
    }

    public protocol.rpc.CallHierarchyOutgoingCallsRequest getDefaultInstanceForType() {
      return protocol.rpc.CallHierarchyOutgoingCallsRequest.getDefaultInstance();
    }

    public protocol.rpc.CallHierarchyOutgoingCallsRequest build() {
      protocol.rpc.CallHierarchyOutgoingCallsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.CallHierarchyOutgoingCallsRequest buildPartial() {
      protocol.rpc.CallHierarchyOutgoingCallsRequest result = new protocol.rpc.CallHierarchyOutgoingCallsRequest(this);
      if (workDoneProgressParamsBuilder_ == null) {
        result.workDoneProgressParams_ = workDoneProgressParams_;
      } else {
        result.workDoneProgressParams_ = workDoneProgressParamsBuilder_.build();
      }
      if (partialResultParamsBuilder_ == null) {
        result.partialResultParams_ = partialResultParams_;
      } else {
        result.partialResultParams_ = partialResultParamsBuilder_.build();
      }
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
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
      if (other instanceof protocol.rpc.CallHierarchyOutgoingCallsRequest) {
        return mergeFrom((protocol.rpc.CallHierarchyOutgoingCallsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.CallHierarchyOutgoingCallsRequest other) {
      if (other == protocol.rpc.CallHierarchyOutgoingCallsRequest.getDefaultInstance()) return this;
      if (other.hasWorkDoneProgressParams()) {
        mergeWorkDoneProgressParams(other.getWorkDoneProgressParams());
      }
      if (other.hasPartialResultParams()) {
        mergePartialResultParams(other.getPartialResultParams());
      }
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
      protocol.rpc.CallHierarchyOutgoingCallsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.CallHierarchyOutgoingCallsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.rpc.WorkDoneProgressParams workDoneProgressParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.WorkDoneProgressParams, protocol.rpc.WorkDoneProgressParams.Builder, protocol.rpc.WorkDoneProgressParamsOrBuilder> workDoneProgressParamsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public boolean hasWorkDoneProgressParams() {
      return workDoneProgressParamsBuilder_ != null || workDoneProgressParams_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public protocol.rpc.WorkDoneProgressParams getWorkDoneProgressParams() {
      if (workDoneProgressParamsBuilder_ == null) {
        return workDoneProgressParams_ == null ? protocol.rpc.WorkDoneProgressParams.getDefaultInstance() : workDoneProgressParams_;
      } else {
        return workDoneProgressParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public Builder setWorkDoneProgressParams(protocol.rpc.WorkDoneProgressParams value) {
      if (workDoneProgressParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workDoneProgressParams_ = value;
        onChanged();
      } else {
        workDoneProgressParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public Builder setWorkDoneProgressParams(
        protocol.rpc.WorkDoneProgressParams.Builder builderForValue) {
      if (workDoneProgressParamsBuilder_ == null) {
        workDoneProgressParams_ = builderForValue.build();
        onChanged();
      } else {
        workDoneProgressParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public Builder mergeWorkDoneProgressParams(protocol.rpc.WorkDoneProgressParams value) {
      if (workDoneProgressParamsBuilder_ == null) {
        if (workDoneProgressParams_ != null) {
          workDoneProgressParams_ =
            protocol.rpc.WorkDoneProgressParams.newBuilder(workDoneProgressParams_).mergeFrom(value).buildPartial();
        } else {
          workDoneProgressParams_ = value;
        }
        onChanged();
      } else {
        workDoneProgressParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public Builder clearWorkDoneProgressParams() {
      if (workDoneProgressParamsBuilder_ == null) {
        workDoneProgressParams_ = null;
        onChanged();
      } else {
        workDoneProgressParams_ = null;
        workDoneProgressParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public protocol.rpc.WorkDoneProgressParams.Builder getWorkDoneProgressParamsBuilder() {
      
      onChanged();
      return getWorkDoneProgressParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    public protocol.rpc.WorkDoneProgressParamsOrBuilder getWorkDoneProgressParamsOrBuilder() {
      if (workDoneProgressParamsBuilder_ != null) {
        return workDoneProgressParamsBuilder_.getMessageOrBuilder();
      } else {
        return workDoneProgressParams_ == null ?
            protocol.rpc.WorkDoneProgressParams.getDefaultInstance() : workDoneProgressParams_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.WorkDoneProgressParams, protocol.rpc.WorkDoneProgressParams.Builder, protocol.rpc.WorkDoneProgressParamsOrBuilder> 
        getWorkDoneProgressParamsFieldBuilder() {
      if (workDoneProgressParamsBuilder_ == null) {
        workDoneProgressParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.WorkDoneProgressParams, protocol.rpc.WorkDoneProgressParams.Builder, protocol.rpc.WorkDoneProgressParamsOrBuilder>(
                getWorkDoneProgressParams(),
                getParentForChildren(),
                isClean());
        workDoneProgressParams_ = null;
      }
      return workDoneProgressParamsBuilder_;
    }

    private protocol.rpc.PartialResultParams partialResultParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.PartialResultParams, protocol.rpc.PartialResultParams.Builder, protocol.rpc.PartialResultParamsOrBuilder> partialResultParamsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public boolean hasPartialResultParams() {
      return partialResultParamsBuilder_ != null || partialResultParams_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public protocol.rpc.PartialResultParams getPartialResultParams() {
      if (partialResultParamsBuilder_ == null) {
        return partialResultParams_ == null ? protocol.rpc.PartialResultParams.getDefaultInstance() : partialResultParams_;
      } else {
        return partialResultParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public Builder setPartialResultParams(protocol.rpc.PartialResultParams value) {
      if (partialResultParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialResultParams_ = value;
        onChanged();
      } else {
        partialResultParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public Builder setPartialResultParams(
        protocol.rpc.PartialResultParams.Builder builderForValue) {
      if (partialResultParamsBuilder_ == null) {
        partialResultParams_ = builderForValue.build();
        onChanged();
      } else {
        partialResultParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public Builder mergePartialResultParams(protocol.rpc.PartialResultParams value) {
      if (partialResultParamsBuilder_ == null) {
        if (partialResultParams_ != null) {
          partialResultParams_ =
            protocol.rpc.PartialResultParams.newBuilder(partialResultParams_).mergeFrom(value).buildPartial();
        } else {
          partialResultParams_ = value;
        }
        onChanged();
      } else {
        partialResultParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public Builder clearPartialResultParams() {
      if (partialResultParamsBuilder_ == null) {
        partialResultParams_ = null;
        onChanged();
      } else {
        partialResultParams_ = null;
        partialResultParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public protocol.rpc.PartialResultParams.Builder getPartialResultParamsBuilder() {
      
      onChanged();
      return getPartialResultParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    public protocol.rpc.PartialResultParamsOrBuilder getPartialResultParamsOrBuilder() {
      if (partialResultParamsBuilder_ != null) {
        return partialResultParamsBuilder_.getMessageOrBuilder();
      } else {
        return partialResultParams_ == null ?
            protocol.rpc.PartialResultParams.getDefaultInstance() : partialResultParams_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.PartialResultParams, protocol.rpc.PartialResultParams.Builder, protocol.rpc.PartialResultParamsOrBuilder> 
        getPartialResultParamsFieldBuilder() {
      if (partialResultParamsBuilder_ == null) {
        partialResultParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.PartialResultParams, protocol.rpc.PartialResultParams.Builder, protocol.rpc.PartialResultParamsOrBuilder>(
                getPartialResultParams(),
                getParentForChildren(),
                isClean());
        partialResultParams_ = null;
      }
      return partialResultParamsBuilder_;
    }

    private protocol.rpc.CallHierarchyItem item_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.CallHierarchyItem, protocol.rpc.CallHierarchyItem.Builder, protocol.rpc.CallHierarchyItemOrBuilder> itemBuilder_;
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.CallHierarchyItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? protocol.rpc.CallHierarchyItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setItem(protocol.rpc.CallHierarchyItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setItem(
        protocol.rpc.CallHierarchyItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeItem(protocol.rpc.CallHierarchyItem value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            protocol.rpc.CallHierarchyItem.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.CallHierarchyItem.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.CallHierarchyItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            protocol.rpc.CallHierarchyItem.getDefaultInstance() : item_;
      }
    }
    /**
     * <code>.protocol.rpc.CallHierarchyItem item = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.CallHierarchyItem, protocol.rpc.CallHierarchyItem.Builder, protocol.rpc.CallHierarchyItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.CallHierarchyItem, protocol.rpc.CallHierarchyItem.Builder, protocol.rpc.CallHierarchyItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.CallHierarchyOutgoingCallsRequest)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.CallHierarchyOutgoingCallsRequest)
  private static final protocol.rpc.CallHierarchyOutgoingCallsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.CallHierarchyOutgoingCallsRequest();
  }

  public static protocol.rpc.CallHierarchyOutgoingCallsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallHierarchyOutgoingCallsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CallHierarchyOutgoingCallsRequest>() {
    public CallHierarchyOutgoingCallsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CallHierarchyOutgoingCallsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallHierarchyOutgoingCallsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallHierarchyOutgoingCallsRequest> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.CallHierarchyOutgoingCallsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

