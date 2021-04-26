// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentHighlightRequest is the parameters of a `textDocument/documentHighlight` request.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentHighlightRequest}
 */
public  final class DocumentHighlightRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentHighlightRequest)
    DocumentHighlightRequestOrBuilder {
  // Use DocumentHighlightRequest.newBuilder() to construct.
  private DocumentHighlightRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentHighlightRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentHighlightRequest(
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
            protocol.TextDocumentPositionParams.Builder subBuilder = null;
            if (textDocumentPositionParams_ != null) {
              subBuilder = textDocumentPositionParams_.toBuilder();
            }
            textDocumentPositionParams_ = input.readMessage(protocol.TextDocumentPositionParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(textDocumentPositionParams_);
              textDocumentPositionParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
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
          case 26: {
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentHighlightRequest.class, protocol.rpc.DocumentHighlightRequest.Builder.class);
  }

  public static final int TEXT_DOCUMENT_POSITION_PARAMS_FIELD_NUMBER = 1;
  private protocol.TextDocumentPositionParams textDocumentPositionParams_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  public boolean hasTextDocumentPositionParams() {
    return textDocumentPositionParams_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  public protocol.TextDocumentPositionParams getTextDocumentPositionParams() {
    return textDocumentPositionParams_ == null ? protocol.TextDocumentPositionParams.getDefaultInstance() : textDocumentPositionParams_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
   */
  public protocol.TextDocumentPositionParamsOrBuilder getTextDocumentPositionParamsOrBuilder() {
    return getTextDocumentPositionParams();
  }

  public static final int WORK_DONE_PROGRESS_PARAMS_FIELD_NUMBER = 2;
  private protocol.rpc.WorkDoneProgressParams workDoneProgressParams_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  public boolean hasWorkDoneProgressParams() {
    return workDoneProgressParams_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  public protocol.rpc.WorkDoneProgressParams getWorkDoneProgressParams() {
    return workDoneProgressParams_ == null ? protocol.rpc.WorkDoneProgressParams.getDefaultInstance() : workDoneProgressParams_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
   */
  public protocol.rpc.WorkDoneProgressParamsOrBuilder getWorkDoneProgressParamsOrBuilder() {
    return getWorkDoneProgressParams();
  }

  public static final int PARTIAL_RESULT_PARAMS_FIELD_NUMBER = 3;
  private protocol.rpc.PartialResultParams partialResultParams_;
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  public boolean hasPartialResultParams() {
    return partialResultParams_ != null;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  public protocol.rpc.PartialResultParams getPartialResultParams() {
    return partialResultParams_ == null ? protocol.rpc.PartialResultParams.getDefaultInstance() : partialResultParams_;
  }
  /**
   * <pre>
   * extends
   * </pre>
   *
   * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
   */
  public protocol.rpc.PartialResultParamsOrBuilder getPartialResultParamsOrBuilder() {
    return getPartialResultParams();
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
    if (textDocumentPositionParams_ != null) {
      output.writeMessage(1, getTextDocumentPositionParams());
    }
    if (workDoneProgressParams_ != null) {
      output.writeMessage(2, getWorkDoneProgressParams());
    }
    if (partialResultParams_ != null) {
      output.writeMessage(3, getPartialResultParams());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (textDocumentPositionParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTextDocumentPositionParams());
    }
    if (workDoneProgressParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWorkDoneProgressParams());
    }
    if (partialResultParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPartialResultParams());
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
    if (!(obj instanceof protocol.rpc.DocumentHighlightRequest)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentHighlightRequest other = (protocol.rpc.DocumentHighlightRequest) obj;

    boolean result = true;
    result = result && (hasTextDocumentPositionParams() == other.hasTextDocumentPositionParams());
    if (hasTextDocumentPositionParams()) {
      result = result && getTextDocumentPositionParams()
          .equals(other.getTextDocumentPositionParams());
    }
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
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTextDocumentPositionParams()) {
      hash = (37 * hash) + TEXT_DOCUMENT_POSITION_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getTextDocumentPositionParams().hashCode();
    }
    if (hasWorkDoneProgressParams()) {
      hash = (37 * hash) + WORK_DONE_PROGRESS_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkDoneProgressParams().hashCode();
    }
    if (hasPartialResultParams()) {
      hash = (37 * hash) + PARTIAL_RESULT_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getPartialResultParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentHighlightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentHighlightRequest parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentHighlightRequest prototype) {
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
   * DocumentHighlightRequest is the parameters of a `textDocument/documentHighlight` request.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentHighlightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentHighlightRequest)
      protocol.rpc.DocumentHighlightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentHighlightRequest.class, protocol.rpc.DocumentHighlightRequest.Builder.class);
    }

    // Construct using protocol.rpc.DocumentHighlightRequest.newBuilder()
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
      if (textDocumentPositionParamsBuilder_ == null) {
        textDocumentPositionParams_ = null;
      } else {
        textDocumentPositionParams_ = null;
        textDocumentPositionParamsBuilder_ = null;
      }
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentHighlightRequest_descriptor;
    }

    public protocol.rpc.DocumentHighlightRequest getDefaultInstanceForType() {
      return protocol.rpc.DocumentHighlightRequest.getDefaultInstance();
    }

    public protocol.rpc.DocumentHighlightRequest build() {
      protocol.rpc.DocumentHighlightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentHighlightRequest buildPartial() {
      protocol.rpc.DocumentHighlightRequest result = new protocol.rpc.DocumentHighlightRequest(this);
      if (textDocumentPositionParamsBuilder_ == null) {
        result.textDocumentPositionParams_ = textDocumentPositionParams_;
      } else {
        result.textDocumentPositionParams_ = textDocumentPositionParamsBuilder_.build();
      }
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
      if (other instanceof protocol.rpc.DocumentHighlightRequest) {
        return mergeFrom((protocol.rpc.DocumentHighlightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentHighlightRequest other) {
      if (other == protocol.rpc.DocumentHighlightRequest.getDefaultInstance()) return this;
      if (other.hasTextDocumentPositionParams()) {
        mergeTextDocumentPositionParams(other.getTextDocumentPositionParams());
      }
      if (other.hasWorkDoneProgressParams()) {
        mergeWorkDoneProgressParams(other.getWorkDoneProgressParams());
      }
      if (other.hasPartialResultParams()) {
        mergePartialResultParams(other.getPartialResultParams());
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
      protocol.rpc.DocumentHighlightRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentHighlightRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.TextDocumentPositionParams textDocumentPositionParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextDocumentPositionParams, protocol.TextDocumentPositionParams.Builder, protocol.TextDocumentPositionParamsOrBuilder> textDocumentPositionParamsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public boolean hasTextDocumentPositionParams() {
      return textDocumentPositionParamsBuilder_ != null || textDocumentPositionParams_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public protocol.TextDocumentPositionParams getTextDocumentPositionParams() {
      if (textDocumentPositionParamsBuilder_ == null) {
        return textDocumentPositionParams_ == null ? protocol.TextDocumentPositionParams.getDefaultInstance() : textDocumentPositionParams_;
      } else {
        return textDocumentPositionParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public Builder setTextDocumentPositionParams(protocol.TextDocumentPositionParams value) {
      if (textDocumentPositionParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textDocumentPositionParams_ = value;
        onChanged();
      } else {
        textDocumentPositionParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public Builder setTextDocumentPositionParams(
        protocol.TextDocumentPositionParams.Builder builderForValue) {
      if (textDocumentPositionParamsBuilder_ == null) {
        textDocumentPositionParams_ = builderForValue.build();
        onChanged();
      } else {
        textDocumentPositionParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public Builder mergeTextDocumentPositionParams(protocol.TextDocumentPositionParams value) {
      if (textDocumentPositionParamsBuilder_ == null) {
        if (textDocumentPositionParams_ != null) {
          textDocumentPositionParams_ =
            protocol.TextDocumentPositionParams.newBuilder(textDocumentPositionParams_).mergeFrom(value).buildPartial();
        } else {
          textDocumentPositionParams_ = value;
        }
        onChanged();
      } else {
        textDocumentPositionParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public Builder clearTextDocumentPositionParams() {
      if (textDocumentPositionParamsBuilder_ == null) {
        textDocumentPositionParams_ = null;
        onChanged();
      } else {
        textDocumentPositionParams_ = null;
        textDocumentPositionParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public protocol.TextDocumentPositionParams.Builder getTextDocumentPositionParamsBuilder() {
      
      onChanged();
      return getTextDocumentPositionParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    public protocol.TextDocumentPositionParamsOrBuilder getTextDocumentPositionParamsOrBuilder() {
      if (textDocumentPositionParamsBuilder_ != null) {
        return textDocumentPositionParamsBuilder_.getMessageOrBuilder();
      } else {
        return textDocumentPositionParams_ == null ?
            protocol.TextDocumentPositionParams.getDefaultInstance() : textDocumentPositionParams_;
      }
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.TextDocumentPositionParams text_document_position_params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextDocumentPositionParams, protocol.TextDocumentPositionParams.Builder, protocol.TextDocumentPositionParamsOrBuilder> 
        getTextDocumentPositionParamsFieldBuilder() {
      if (textDocumentPositionParamsBuilder_ == null) {
        textDocumentPositionParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.TextDocumentPositionParams, protocol.TextDocumentPositionParams.Builder, protocol.TextDocumentPositionParamsOrBuilder>(
                getTextDocumentPositionParams(),
                getParentForChildren(),
                isClean());
        textDocumentPositionParams_ = null;
      }
      return textDocumentPositionParamsBuilder_;
    }

    private protocol.rpc.WorkDoneProgressParams workDoneProgressParams_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.WorkDoneProgressParams, protocol.rpc.WorkDoneProgressParams.Builder, protocol.rpc.WorkDoneProgressParamsOrBuilder> workDoneProgressParamsBuilder_;
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
     */
    public boolean hasWorkDoneProgressParams() {
      return workDoneProgressParamsBuilder_ != null || workDoneProgressParams_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.WorkDoneProgressParams work_done_progress_params = 2;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
     */
    public boolean hasPartialResultParams() {
      return partialResultParamsBuilder_ != null || partialResultParams_ != null;
    }
    /**
     * <pre>
     * extends
     * </pre>
     *
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
     * <code>.protocol.rpc.PartialResultParams partial_result_params = 3;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentHighlightRequest)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentHighlightRequest)
  private static final protocol.rpc.DocumentHighlightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentHighlightRequest();
  }

  public static protocol.rpc.DocumentHighlightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentHighlightRequest>
      PARSER = new com.google.protobuf.AbstractParser<DocumentHighlightRequest>() {
    public DocumentHighlightRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentHighlightRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentHighlightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentHighlightRequest> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentHighlightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

