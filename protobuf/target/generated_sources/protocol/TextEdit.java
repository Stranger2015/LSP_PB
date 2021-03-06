// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * TextEdit is a textual edit applicable to a text document.
 * </pre>
 *
 * Protobuf type {@code protocol.TextEdit}
 */
public  final class TextEdit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.TextEdit)
    TextEditOrBuilder {
  // Use TextEdit.newBuilder() to construct.
  private TextEdit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextEdit() {
    newText_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TextEdit(
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
            protocol.Range.Builder subBuilder = null;
            if (range_ != null) {
              subBuilder = range_.toBuilder();
            }
            range_ = input.readMessage(protocol.Range.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(range_);
              range_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            newText_ = s;
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
    return protocol.ProtocolProto.internal_static_protocol_TextEdit_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_TextEdit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.TextEdit.class, protocol.TextEdit.Builder.class);
  }

  public static final int RANGE_FIELD_NUMBER = 1;
  private protocol.Range range_;
  /**
   * <pre>
   * The range of the text document to be manipulated. To insert
   * text into a document create a range where start === end.
   * </pre>
   *
   * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasRange() {
    return range_ != null;
  }
  /**
   * <pre>
   * The range of the text document to be manipulated. To insert
   * text into a document create a range where start === end.
   * </pre>
   *
   * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.Range getRange() {
    return range_ == null ? protocol.Range.getDefaultInstance() : range_;
  }
  /**
   * <pre>
   * The range of the text document to be manipulated. To insert
   * text into a document create a range where start === end.
   * </pre>
   *
   * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.RangeOrBuilder getRangeOrBuilder() {
    return getRange();
  }

  public static final int NEW_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object newText_;
  /**
   * <pre>
   * The string to be inserted. For delete operations use an
   * empty string.
   * </pre>
   *
   * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getNewText() {
    java.lang.Object ref = newText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The string to be inserted. For delete operations use an
   * empty string.
   * </pre>
   *
   * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getNewTextBytes() {
    java.lang.Object ref = newText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newText_ = b;
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
    if (range_ != null) {
      output.writeMessage(1, getRange());
    }
    if (!getNewTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newText_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (range_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRange());
    }
    if (!getNewTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newText_);
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
    if (!(obj instanceof protocol.TextEdit)) {
      return super.equals(obj);
    }
    protocol.TextEdit other = (protocol.TextEdit) obj;

    boolean result = true;
    result = result && (hasRange() == other.hasRange());
    if (hasRange()) {
      result = result && getRange()
          .equals(other.getRange());
    }
    result = result && getNewText()
        .equals(other.getNewText());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRange()) {
      hash = (37 * hash) + RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getRange().hashCode();
    }
    hash = (37 * hash) + NEW_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getNewText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.TextEdit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.TextEdit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.TextEdit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.TextEdit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.TextEdit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.TextEdit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.TextEdit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.TextEdit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.TextEdit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.TextEdit parseFrom(
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
  public static Builder newBuilder(protocol.TextEdit prototype) {
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
   * TextEdit is a textual edit applicable to a text document.
   * </pre>
   *
   * Protobuf type {@code protocol.TextEdit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.TextEdit)
      protocol.TextEditOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_TextEdit_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_TextEdit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.TextEdit.class, protocol.TextEdit.Builder.class);
    }

    // Construct using protocol.TextEdit.newBuilder()
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
      if (rangeBuilder_ == null) {
        range_ = null;
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }
      newText_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_TextEdit_descriptor;
    }

    public protocol.TextEdit getDefaultInstanceForType() {
      return protocol.TextEdit.getDefaultInstance();
    }

    public protocol.TextEdit build() {
      protocol.TextEdit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.TextEdit buildPartial() {
      protocol.TextEdit result = new protocol.TextEdit(this);
      if (rangeBuilder_ == null) {
        result.range_ = range_;
      } else {
        result.range_ = rangeBuilder_.build();
      }
      result.newText_ = newText_;
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
      if (other instanceof protocol.TextEdit) {
        return mergeFrom((protocol.TextEdit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.TextEdit other) {
      if (other == protocol.TextEdit.getDefaultInstance()) return this;
      if (other.hasRange()) {
        mergeRange(other.getRange());
      }
      if (!other.getNewText().isEmpty()) {
        newText_ = other.newText_;
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
      protocol.TextEdit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.TextEdit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.Range range_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Range, protocol.Range.Builder, protocol.RangeOrBuilder> rangeBuilder_;
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasRange() {
      return rangeBuilder_ != null || range_ != null;
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Range getRange() {
      if (rangeBuilder_ == null) {
        return range_ == null ? protocol.Range.getDefaultInstance() : range_;
      } else {
        return rangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRange(protocol.Range value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        range_ = value;
        onChanged();
      } else {
        rangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRange(
        protocol.Range.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        range_ = builderForValue.build();
        onChanged();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRange(protocol.Range value) {
      if (rangeBuilder_ == null) {
        if (range_ != null) {
          range_ =
            protocol.Range.newBuilder(range_).mergeFrom(value).buildPartial();
        } else {
          range_ = value;
        }
        onChanged();
      } else {
        rangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRange() {
      if (rangeBuilder_ == null) {
        range_ = null;
        onChanged();
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Range.Builder getRangeBuilder() {
      
      onChanged();
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.RangeOrBuilder getRangeOrBuilder() {
      if (rangeBuilder_ != null) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        return range_ == null ?
            protocol.Range.getDefaultInstance() : range_;
      }
    }
    /**
     * <pre>
     * The range of the text document to be manipulated. To insert
     * text into a document create a range where start === end.
     * </pre>
     *
     * <code>.protocol.Range range = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Range, protocol.Range.Builder, protocol.RangeOrBuilder> 
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        rangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Range, protocol.Range.Builder, protocol.RangeOrBuilder>(
                getRange(),
                getParentForChildren(),
                isClean());
        range_ = null;
      }
      return rangeBuilder_;
    }

    private java.lang.Object newText_ = "";
    /**
     * <pre>
     * The string to be inserted. For delete operations use an
     * empty string.
     * </pre>
     *
     * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getNewText() {
      java.lang.Object ref = newText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The string to be inserted. For delete operations use an
     * empty string.
     * </pre>
     *
     * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getNewTextBytes() {
      java.lang.Object ref = newText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The string to be inserted. For delete operations use an
     * empty string.
     * </pre>
     *
     * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNewText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The string to be inserted. For delete operations use an
     * empty string.
     * </pre>
     *
     * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNewText() {
      
      newText_ = getDefaultInstance().getNewText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The string to be inserted. For delete operations use an
     * empty string.
     * </pre>
     *
     * <code>string new_text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNewTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newText_ = value;
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


    // @@protoc_insertion_point(builder_scope:protocol.TextEdit)
  }

  // @@protoc_insertion_point(class_scope:protocol.TextEdit)
  private static final protocol.TextEdit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.TextEdit();
  }

  public static protocol.TextEdit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextEdit>
      PARSER = new com.google.protobuf.AbstractParser<TextEdit>() {
    public TextEdit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TextEdit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextEdit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextEdit> getParserForType() {
    return PARSER;
  }

  public protocol.TextEdit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

