// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentFormattingResponse represents a DocumentFormatting response.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentFormattingResponse}
 */
public  final class DocumentFormattingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentFormattingResponse)
    DocumentFormattingResponseOrBuilder {
  // Use DocumentFormattingResponse.newBuilder() to construct.
  private DocumentFormattingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentFormattingResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentFormattingResponse(
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
            protocol.TextEdit.Builder subBuilder = null;
            if (documentFormattingResponseCase_ == 1) {
              subBuilder = ((protocol.TextEdit) documentFormattingResponse_).toBuilder();
            }
            documentFormattingResponse_ =
                input.readMessage(protocol.TextEdit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.TextEdit) documentFormattingResponse_);
              documentFormattingResponse_ = subBuilder.buildPartial();
            }
            documentFormattingResponseCase_ = 1;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            documentFormattingResponseCase_ = 2;
            documentFormattingResponse_ = rawValue;
            break;
          }
          case 26: {
            protocol.Error.Builder subBuilder = null;
            if (documentFormattingResponseCase_ == 3) {
              subBuilder = ((protocol.Error) documentFormattingResponse_).toBuilder();
            }
            documentFormattingResponse_ =
                input.readMessage(protocol.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.Error) documentFormattingResponse_);
              documentFormattingResponse_ = subBuilder.buildPartial();
            }
            documentFormattingResponseCase_ = 3;
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentFormattingResponse.class, protocol.rpc.DocumentFormattingResponse.Builder.class);
  }

  private int documentFormattingResponseCase_ = 0;
  private java.lang.Object documentFormattingResponse_;
  public enum DocumentFormattingResponseCase
      implements com.google.protobuf.Internal.EnumLite {
    TEXT_EDIT(1),
    EMPTY(2),
    ERROR(3),
    DOCUMENTFORMATTINGRESPONSE_NOT_SET(0);
    private final int value;
    private DocumentFormattingResponseCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DocumentFormattingResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static DocumentFormattingResponseCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT_EDIT;
        case 2: return EMPTY;
        case 3: return ERROR;
        case 0: return DOCUMENTFORMATTINGRESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DocumentFormattingResponseCase
  getDocumentFormattingResponseCase() {
    return DocumentFormattingResponseCase.forNumber(
        documentFormattingResponseCase_);
  }

  public static final int TEXT_EDIT_FIELD_NUMBER = 1;
  /**
   * <code>.protocol.TextEdit text_edit = 1;</code>
   */
  public protocol.TextEdit getTextEdit() {
    if (documentFormattingResponseCase_ == 1) {
       return (protocol.TextEdit) documentFormattingResponse_;
    }
    return protocol.TextEdit.getDefaultInstance();
  }
  /**
   * <code>.protocol.TextEdit text_edit = 1;</code>
   */
  public protocol.TextEditOrBuilder getTextEditOrBuilder() {
    if (documentFormattingResponseCase_ == 1) {
       return (protocol.TextEdit) documentFormattingResponse_;
    }
    return protocol.TextEdit.getDefaultInstance();
  }

  public static final int EMPTY_FIELD_NUMBER = 2;
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  public int getEmptyValue() {
    if (documentFormattingResponseCase_ == 2) {
      return (java.lang.Integer) documentFormattingResponse_;
    }
    return 0;
  }
  /**
   * <code>.google.protobuf.NullValue empty = 2;</code>
   */
  public com.google.protobuf.NullValue getEmpty() {
    if (documentFormattingResponseCase_ == 2) {
      com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
          (java.lang.Integer) documentFormattingResponse_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  public protocol.Error getError() {
    if (documentFormattingResponseCase_ == 3) {
       return (protocol.Error) documentFormattingResponse_;
    }
    return protocol.Error.getDefaultInstance();
  }
  /**
   * <code>.protocol.Error error = 3;</code>
   */
  public protocol.ErrorOrBuilder getErrorOrBuilder() {
    if (documentFormattingResponseCase_ == 3) {
       return (protocol.Error) documentFormattingResponse_;
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
    if (documentFormattingResponseCase_ == 1) {
      output.writeMessage(1, (protocol.TextEdit) documentFormattingResponse_);
    }
    if (documentFormattingResponseCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) documentFormattingResponse_));
    }
    if (documentFormattingResponseCase_ == 3) {
      output.writeMessage(3, (protocol.Error) documentFormattingResponse_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (documentFormattingResponseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (protocol.TextEdit) documentFormattingResponse_);
    }
    if (documentFormattingResponseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) documentFormattingResponse_));
    }
    if (documentFormattingResponseCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (protocol.Error) documentFormattingResponse_);
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
    if (!(obj instanceof protocol.rpc.DocumentFormattingResponse)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentFormattingResponse other = (protocol.rpc.DocumentFormattingResponse) obj;

    boolean result = true;
    result = result && getDocumentFormattingResponseCase().equals(
        other.getDocumentFormattingResponseCase());
    if (!result) return false;
    switch (documentFormattingResponseCase_) {
      case 1:
        result = result && getTextEdit()
            .equals(other.getTextEdit());
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
    switch (documentFormattingResponseCase_) {
      case 1:
        hash = (37 * hash) + TEXT_EDIT_FIELD_NUMBER;
        hash = (53 * hash) + getTextEdit().hashCode();
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

  public static protocol.rpc.DocumentFormattingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentFormattingResponse parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentFormattingResponse prototype) {
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
   * DocumentFormattingResponse represents a DocumentFormatting response.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentFormattingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentFormattingResponse)
      protocol.rpc.DocumentFormattingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentFormattingResponse.class, protocol.rpc.DocumentFormattingResponse.Builder.class);
    }

    // Construct using protocol.rpc.DocumentFormattingResponse.newBuilder()
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
      documentFormattingResponseCase_ = 0;
      documentFormattingResponse_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentFormattingResponse_descriptor;
    }

    public protocol.rpc.DocumentFormattingResponse getDefaultInstanceForType() {
      return protocol.rpc.DocumentFormattingResponse.getDefaultInstance();
    }

    public protocol.rpc.DocumentFormattingResponse build() {
      protocol.rpc.DocumentFormattingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentFormattingResponse buildPartial() {
      protocol.rpc.DocumentFormattingResponse result = new protocol.rpc.DocumentFormattingResponse(this);
      if (documentFormattingResponseCase_ == 1) {
        if (textEditBuilder_ == null) {
          result.documentFormattingResponse_ = documentFormattingResponse_;
        } else {
          result.documentFormattingResponse_ = textEditBuilder_.build();
        }
      }
      if (documentFormattingResponseCase_ == 2) {
        result.documentFormattingResponse_ = documentFormattingResponse_;
      }
      if (documentFormattingResponseCase_ == 3) {
        if (errorBuilder_ == null) {
          result.documentFormattingResponse_ = documentFormattingResponse_;
        } else {
          result.documentFormattingResponse_ = errorBuilder_.build();
        }
      }
      result.documentFormattingResponseCase_ = documentFormattingResponseCase_;
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
      if (other instanceof protocol.rpc.DocumentFormattingResponse) {
        return mergeFrom((protocol.rpc.DocumentFormattingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentFormattingResponse other) {
      if (other == protocol.rpc.DocumentFormattingResponse.getDefaultInstance()) return this;
      switch (other.getDocumentFormattingResponseCase()) {
        case TEXT_EDIT: {
          mergeTextEdit(other.getTextEdit());
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
        case DOCUMENTFORMATTINGRESPONSE_NOT_SET: {
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
      protocol.rpc.DocumentFormattingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentFormattingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int documentFormattingResponseCase_ = 0;
    private java.lang.Object documentFormattingResponse_;
    public DocumentFormattingResponseCase
        getDocumentFormattingResponseCase() {
      return DocumentFormattingResponseCase.forNumber(
          documentFormattingResponseCase_);
    }

    public Builder clearDocumentFormattingResponse() {
      documentFormattingResponseCase_ = 0;
      documentFormattingResponse_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextEdit, protocol.TextEdit.Builder, protocol.TextEditOrBuilder> textEditBuilder_;
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public protocol.TextEdit getTextEdit() {
      if (textEditBuilder_ == null) {
        if (documentFormattingResponseCase_ == 1) {
          return (protocol.TextEdit) documentFormattingResponse_;
        }
        return protocol.TextEdit.getDefaultInstance();
      } else {
        if (documentFormattingResponseCase_ == 1) {
          return textEditBuilder_.getMessage();
        }
        return protocol.TextEdit.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public Builder setTextEdit(protocol.TextEdit value) {
      if (textEditBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentFormattingResponse_ = value;
        onChanged();
      } else {
        textEditBuilder_.setMessage(value);
      }
      documentFormattingResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public Builder setTextEdit(
        protocol.TextEdit.Builder builderForValue) {
      if (textEditBuilder_ == null) {
        documentFormattingResponse_ = builderForValue.build();
        onChanged();
      } else {
        textEditBuilder_.setMessage(builderForValue.build());
      }
      documentFormattingResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public Builder mergeTextEdit(protocol.TextEdit value) {
      if (textEditBuilder_ == null) {
        if (documentFormattingResponseCase_ == 1 &&
            documentFormattingResponse_ != protocol.TextEdit.getDefaultInstance()) {
          documentFormattingResponse_ = protocol.TextEdit.newBuilder((protocol.TextEdit) documentFormattingResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          documentFormattingResponse_ = value;
        }
        onChanged();
      } else {
        if (documentFormattingResponseCase_ == 1) {
          textEditBuilder_.mergeFrom(value);
        }
        textEditBuilder_.setMessage(value);
      }
      documentFormattingResponseCase_ = 1;
      return this;
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public Builder clearTextEdit() {
      if (textEditBuilder_ == null) {
        if (documentFormattingResponseCase_ == 1) {
          documentFormattingResponseCase_ = 0;
          documentFormattingResponse_ = null;
          onChanged();
        }
      } else {
        if (documentFormattingResponseCase_ == 1) {
          documentFormattingResponseCase_ = 0;
          documentFormattingResponse_ = null;
        }
        textEditBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public protocol.TextEdit.Builder getTextEditBuilder() {
      return getTextEditFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    public protocol.TextEditOrBuilder getTextEditOrBuilder() {
      if ((documentFormattingResponseCase_ == 1) && (textEditBuilder_ != null)) {
        return textEditBuilder_.getMessageOrBuilder();
      } else {
        if (documentFormattingResponseCase_ == 1) {
          return (protocol.TextEdit) documentFormattingResponse_;
        }
        return protocol.TextEdit.getDefaultInstance();
      }
    }
    /**
     * <code>.protocol.TextEdit text_edit = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.TextEdit, protocol.TextEdit.Builder, protocol.TextEditOrBuilder> 
        getTextEditFieldBuilder() {
      if (textEditBuilder_ == null) {
        if (!(documentFormattingResponseCase_ == 1)) {
          documentFormattingResponse_ = protocol.TextEdit.getDefaultInstance();
        }
        textEditBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.TextEdit, protocol.TextEdit.Builder, protocol.TextEditOrBuilder>(
                (protocol.TextEdit) documentFormattingResponse_,
                getParentForChildren(),
                isClean());
        documentFormattingResponse_ = null;
      }
      documentFormattingResponseCase_ = 1;
      onChanged();;
      return textEditBuilder_;
    }

    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public int getEmptyValue() {
      if (documentFormattingResponseCase_ == 2) {
        return ((java.lang.Integer) documentFormattingResponse_).intValue();
      }
      return 0;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public Builder setEmptyValue(int value) {
      documentFormattingResponseCase_ = 2;
      documentFormattingResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public com.google.protobuf.NullValue getEmpty() {
      if (documentFormattingResponseCase_ == 2) {
        com.google.protobuf.NullValue result = com.google.protobuf.NullValue.valueOf(
            (java.lang.Integer) documentFormattingResponse_);
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
      documentFormattingResponseCase_ = 2;
      documentFormattingResponse_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.NullValue empty = 2;</code>
     */
    public Builder clearEmpty() {
      if (documentFormattingResponseCase_ == 2) {
        documentFormattingResponseCase_ = 0;
        documentFormattingResponse_ = null;
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
        if (documentFormattingResponseCase_ == 3) {
          return (protocol.Error) documentFormattingResponse_;
        }
        return protocol.Error.getDefaultInstance();
      } else {
        if (documentFormattingResponseCase_ == 3) {
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
        documentFormattingResponse_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      documentFormattingResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder setError(
        protocol.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        documentFormattingResponse_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      documentFormattingResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder mergeError(protocol.Error value) {
      if (errorBuilder_ == null) {
        if (documentFormattingResponseCase_ == 3 &&
            documentFormattingResponse_ != protocol.Error.getDefaultInstance()) {
          documentFormattingResponse_ = protocol.Error.newBuilder((protocol.Error) documentFormattingResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          documentFormattingResponse_ = value;
        }
        onChanged();
      } else {
        if (documentFormattingResponseCase_ == 3) {
          errorBuilder_.mergeFrom(value);
        }
        errorBuilder_.setMessage(value);
      }
      documentFormattingResponseCase_ = 3;
      return this;
    }
    /**
     * <code>.protocol.Error error = 3;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (documentFormattingResponseCase_ == 3) {
          documentFormattingResponseCase_ = 0;
          documentFormattingResponse_ = null;
          onChanged();
        }
      } else {
        if (documentFormattingResponseCase_ == 3) {
          documentFormattingResponseCase_ = 0;
          documentFormattingResponse_ = null;
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
      if ((documentFormattingResponseCase_ == 3) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (documentFormattingResponseCase_ == 3) {
          return (protocol.Error) documentFormattingResponse_;
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
        if (!(documentFormattingResponseCase_ == 3)) {
          documentFormattingResponse_ = protocol.Error.getDefaultInstance();
        }
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Error, protocol.Error.Builder, protocol.ErrorOrBuilder>(
                (protocol.Error) documentFormattingResponse_,
                getParentForChildren(),
                isClean());
        documentFormattingResponse_ = null;
      }
      documentFormattingResponseCase_ = 3;
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentFormattingResponse)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentFormattingResponse)
  private static final protocol.rpc.DocumentFormattingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentFormattingResponse();
  }

  public static protocol.rpc.DocumentFormattingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentFormattingResponse>
      PARSER = new com.google.protobuf.AbstractParser<DocumentFormattingResponse>() {
    public DocumentFormattingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentFormattingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentFormattingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentFormattingResponse> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentFormattingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
