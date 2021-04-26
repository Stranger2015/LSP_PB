// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * Range in a text document expressed as (zero-based) start and end positions.
 * A range is comparable to a selection in an editor. Therefore the end position is exclusive.
 * If you want to specify a range that contains a line including the line ending character(s)
 * then use an end position denoting the start of the next line.
 * </pre>
 *
 * Protobuf type {@code protocol.Range}
 */
public  final class Range extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.Range)
    RangeOrBuilder {
  // Use Range.newBuilder() to construct.
  private Range(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Range() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Range(
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
            protocol.Position.Builder subBuilder = null;
            if (start_ != null) {
              subBuilder = start_.toBuilder();
            }
            start_ = input.readMessage(protocol.Position.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(start_);
              start_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            protocol.Position.Builder subBuilder = null;
            if (end_ != null) {
              subBuilder = end_.toBuilder();
            }
            end_ = input.readMessage(protocol.Position.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(end_);
              end_ = subBuilder.buildPartial();
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
    return protocol.ProtocolProto.internal_static_protocol_Range_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_Range_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.Range.class, protocol.Range.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private protocol.Position start_;
  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.Position getStart() {
    return start_ == null ? protocol.Position.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   * The range's start position.
   * </pre>
   *
   * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.PositionOrBuilder getStartOrBuilder() {
    return getStart();
  }

  public static final int END_FIELD_NUMBER = 2;
  private protocol.Position end_;
  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasEnd() {
    return end_ != null;
  }
  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.Position getEnd() {
    return end_ == null ? protocol.Position.getDefaultInstance() : end_;
  }
  /**
   * <pre>
   * The range's end position.
   * </pre>
   *
   * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.PositionOrBuilder getEndOrBuilder() {
    return getEnd();
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
    if (start_ != null) {
      output.writeMessage(1, getStart());
    }
    if (end_ != null) {
      output.writeMessage(2, getEnd());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStart());
    }
    if (end_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnd());
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
    if (!(obj instanceof protocol.Range)) {
      return super.equals(obj);
    }
    protocol.Range other = (protocol.Range) obj;

    boolean result = true;
    result = result && (hasStart() == other.hasStart());
    if (hasStart()) {
      result = result && getStart()
          .equals(other.getStart());
    }
    result = result && (hasEnd() == other.hasEnd());
    if (hasEnd()) {
      result = result && getEnd()
          .equals(other.getEnd());
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
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.Range parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.Range parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.Range parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.Range parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.Range parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.Range parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.Range parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.Range parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.Range parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.Range parseFrom(
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
  public static Builder newBuilder(protocol.Range prototype) {
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
   * Range in a text document expressed as (zero-based) start and end positions.
   * A range is comparable to a selection in an editor. Therefore the end position is exclusive.
   * If you want to specify a range that contains a line including the line ending character(s)
   * then use an end position denoting the start of the next line.
   * </pre>
   *
   * Protobuf type {@code protocol.Range}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.Range)
      protocol.RangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_Range_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_Range_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.Range.class, protocol.Range.Builder.class);
    }

    // Construct using protocol.Range.newBuilder()
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
      if (startBuilder_ == null) {
        start_ = null;
      } else {
        start_ = null;
        startBuilder_ = null;
      }
      if (endBuilder_ == null) {
        end_ = null;
      } else {
        end_ = null;
        endBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_Range_descriptor;
    }

    public protocol.Range getDefaultInstanceForType() {
      return protocol.Range.getDefaultInstance();
    }

    public protocol.Range build() {
      protocol.Range result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.Range buildPartial() {
      protocol.Range result = new protocol.Range(this);
      if (startBuilder_ == null) {
        result.start_ = start_;
      } else {
        result.start_ = startBuilder_.build();
      }
      if (endBuilder_ == null) {
        result.end_ = end_;
      } else {
        result.end_ = endBuilder_.build();
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
      if (other instanceof protocol.Range) {
        return mergeFrom((protocol.Range)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.Range other) {
      if (other == protocol.Range.getDefaultInstance()) return this;
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
      protocol.Range parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.Range) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.Position start_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder> startBuilder_;
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasStart() {
      return startBuilder_ != null || start_ != null;
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Position getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? protocol.Position.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStart(protocol.Position value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
        onChanged();
      } else {
        startBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStart(
        protocol.Position.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
        onChanged();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeStart(protocol.Position value) {
      if (startBuilder_ == null) {
        if (start_ != null) {
          start_ =
            protocol.Position.newBuilder(start_).mergeFrom(value).buildPartial();
        } else {
          start_ = value;
        }
        onChanged();
      } else {
        startBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearStart() {
      if (startBuilder_ == null) {
        start_ = null;
        onChanged();
      } else {
        start_ = null;
        startBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Position.Builder getStartBuilder() {
      
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.PositionOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            protocol.Position.getDefaultInstance() : start_;
      }
    }
    /**
     * <pre>
     * The range's start position.
     * </pre>
     *
     * <code>.protocol.Position start = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private protocol.Position end_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder> endBuilder_;
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasEnd() {
      return endBuilder_ != null || end_ != null;
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Position getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? protocol.Position.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnd(protocol.Position value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
        onChanged();
      } else {
        endBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnd(
        protocol.Position.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
        onChanged();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEnd(protocol.Position value) {
      if (endBuilder_ == null) {
        if (end_ != null) {
          end_ =
            protocol.Position.newBuilder(end_).mergeFrom(value).buildPartial();
        } else {
          end_ = value;
        }
        onChanged();
      } else {
        endBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEnd() {
      if (endBuilder_ == null) {
        end_ = null;
        onChanged();
      } else {
        end_ = null;
        endBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Position.Builder getEndBuilder() {
      
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.PositionOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            protocol.Position.getDefaultInstance() : end_;
      }
    }
    /**
     * <pre>
     * The range's end position.
     * </pre>
     *
     * <code>.protocol.Position end = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Position, protocol.Position.Builder, protocol.PositionOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.Range)
  }

  // @@protoc_insertion_point(class_scope:protocol.Range)
  private static final protocol.Range DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.Range();
  }

  public static protocol.Range getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Range>
      PARSER = new com.google.protobuf.AbstractParser<Range>() {
    public Range parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Range(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Range> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Range> getParserForType() {
    return PARSER;
  }

  public protocol.Range getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
