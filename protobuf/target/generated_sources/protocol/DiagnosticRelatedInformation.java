// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * DiagnosticRelatedInformation represents a related message and source code location for a
 * diagnostic.
 * This should be used to point to code locations that cause or are related to a diagnostics,
 * e.g when duplicating a symbol in a scope.
 * (-- api-linter: core::0140::abbreviations=disabled --)
 * </pre>
 *
 * Protobuf type {@code protocol.DiagnosticRelatedInformation}
 */
public  final class DiagnosticRelatedInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.DiagnosticRelatedInformation)
    DiagnosticRelatedInformationOrBuilder {
  // Use DiagnosticRelatedInformation.newBuilder() to construct.
  private DiagnosticRelatedInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiagnosticRelatedInformation() {
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DiagnosticRelatedInformation(
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
            protocol.Location.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(protocol.Location.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
    return protocol.ProtocolProto.internal_static_protocol_DiagnosticRelatedInformation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_DiagnosticRelatedInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.DiagnosticRelatedInformation.class, protocol.DiagnosticRelatedInformation.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private protocol.Location location_;
  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.Location getLocation() {
    return location_ == null ? protocol.Location.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * The location of this related diagnostic information.
   * </pre>
   *
   * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.LocationOrBuilder getLocationOrBuilder() {
    return getLocation();
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The message of this related diagnostic information.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message of this related diagnostic information.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (location_ != null) {
      output.writeMessage(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocation());
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof protocol.DiagnosticRelatedInformation)) {
      return super.equals(obj);
    }
    protocol.DiagnosticRelatedInformation other = (protocol.DiagnosticRelatedInformation) obj;

    boolean result = true;
    result = result && (hasLocation() == other.hasLocation());
    if (hasLocation()) {
      result = result && getLocation()
          .equals(other.getLocation());
    }
    result = result && getMessage()
        .equals(other.getMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.DiagnosticRelatedInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.DiagnosticRelatedInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.DiagnosticRelatedInformation parseFrom(
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
  public static Builder newBuilder(protocol.DiagnosticRelatedInformation prototype) {
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
   * DiagnosticRelatedInformation represents a related message and source code location for a
   * diagnostic.
   * This should be used to point to code locations that cause or are related to a diagnostics,
   * e.g when duplicating a symbol in a scope.
   * (-- api-linter: core::0140::abbreviations=disabled --)
   * </pre>
   *
   * Protobuf type {@code protocol.DiagnosticRelatedInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.DiagnosticRelatedInformation)
      protocol.DiagnosticRelatedInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_DiagnosticRelatedInformation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_DiagnosticRelatedInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.DiagnosticRelatedInformation.class, protocol.DiagnosticRelatedInformation.Builder.class);
    }

    // Construct using protocol.DiagnosticRelatedInformation.newBuilder()
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
      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_DiagnosticRelatedInformation_descriptor;
    }

    public protocol.DiagnosticRelatedInformation getDefaultInstanceForType() {
      return protocol.DiagnosticRelatedInformation.getDefaultInstance();
    }

    public protocol.DiagnosticRelatedInformation build() {
      protocol.DiagnosticRelatedInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.DiagnosticRelatedInformation buildPartial() {
      protocol.DiagnosticRelatedInformation result = new protocol.DiagnosticRelatedInformation(this);
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.message_ = message_;
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
      if (other instanceof protocol.DiagnosticRelatedInformation) {
        return mergeFrom((protocol.DiagnosticRelatedInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.DiagnosticRelatedInformation other) {
      if (other == protocol.DiagnosticRelatedInformation.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
      protocol.DiagnosticRelatedInformation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.DiagnosticRelatedInformation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.Location location_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Location, protocol.Location.Builder, protocol.LocationOrBuilder> locationBuilder_;
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Location getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? protocol.Location.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLocation(protocol.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLocation(
        protocol.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeLocation(protocol.Location value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            protocol.Location.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.Location.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.LocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            protocol.Location.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * The location of this related diagnostic information.
     * </pre>
     *
     * <code>.protocol.Location location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.Location, protocol.Location.Builder, protocol.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.Location, protocol.Location.Builder, protocol.LocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The message of this related diagnostic information.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message of this related diagnostic information.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message of this related diagnostic information.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message of this related diagnostic information.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message of this related diagnostic information.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:protocol.DiagnosticRelatedInformation)
  }

  // @@protoc_insertion_point(class_scope:protocol.DiagnosticRelatedInformation)
  private static final protocol.DiagnosticRelatedInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.DiagnosticRelatedInformation();
  }

  public static protocol.DiagnosticRelatedInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnosticRelatedInformation>
      PARSER = new com.google.protobuf.AbstractParser<DiagnosticRelatedInformation>() {
    public DiagnosticRelatedInformation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DiagnosticRelatedInformation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiagnosticRelatedInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnosticRelatedInformation> getParserForType() {
    return PARSER;
  }

  public protocol.DiagnosticRelatedInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

