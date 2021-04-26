// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * CreateFile create file operation.
 * </pre>
 *
 * Protobuf type {@code protocol.CreateFile}
 */
public  final class CreateFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.CreateFile)
    CreateFileOrBuilder {
  // Use CreateFile.newBuilder() to construct.
  private CreateFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFile() {
    kind_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateFile(
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
            java.lang.String s = input.readStringRequireUtf8();

            kind_ = s;
            break;
          }
          case 18: {
            uri.URI.Builder subBuilder = null;
            if (uri_ != null) {
              subBuilder = uri_.toBuilder();
            }
            uri_ = input.readMessage(uri.URI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uri_);
              uri_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            protocol.CreateFileOptions.Builder subBuilder = null;
            if (options_ != null) {
              subBuilder = options_.toBuilder();
            }
            options_ = input.readMessage(protocol.CreateFileOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(options_);
              options_ = subBuilder.buildPartial();
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
    return protocol.ProtocolProto.internal_static_protocol_CreateFile_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_CreateFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.CreateFile.class, protocol.CreateFile.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private volatile java.lang.Object kind_;
  /**
   * <pre>
   * The kind of CreateFile message.
   * (-- api-linter: core::0192::only-leading-comments=disabled --)
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The kind of CreateFile message.
   * (-- api-linter: core::0192::only-leading-comments=disabled --)
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 2;
  private uri.URI uri_;
  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean hasUri() {
    return uri_ != null;
  }
  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public uri.URI getUri() {
    return uri_ == null ? uri.URI.getDefaultInstance() : uri_;
  }
  /**
   * <pre>
   * The resource to create.
   * </pre>
   *
   * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public uri.URIOrBuilder getUriOrBuilder() {
    return getUri();
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  private protocol.CreateFileOptions options_;
  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  public protocol.CreateFileOptions getOptions() {
    return options_ == null ? protocol.CreateFileOptions.getDefaultInstance() : options_;
  }
  /**
   * <pre>
   * Optional. Additional options
   * </pre>
   *
   * <code>.protocol.CreateFileOptions options = 3;</code>
   */
  public protocol.CreateFileOptionsOrBuilder getOptionsOrBuilder() {
    return getOptions();
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
    if (!getKindBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (uri_ != null) {
      output.writeMessage(2, getUri());
    }
    if (options_ != null) {
      output.writeMessage(3, getOptions());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (uri_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUri());
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOptions());
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
    if (!(obj instanceof protocol.CreateFile)) {
      return super.equals(obj);
    }
    protocol.CreateFile other = (protocol.CreateFile) obj;

    boolean result = true;
    result = result && getKind()
        .equals(other.getKind());
    result = result && (hasUri() == other.hasUri());
    if (hasUri()) {
      result = result && getUri()
          .equals(other.getUri());
    }
    result = result && (hasOptions() == other.hasOptions());
    if (hasOptions()) {
      result = result && getOptions()
          .equals(other.getOptions());
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    if (hasUri()) {
      hash = (37 * hash) + URI_FIELD_NUMBER;
      hash = (53 * hash) + getUri().hashCode();
    }
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.CreateFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.CreateFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.CreateFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.CreateFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.CreateFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.CreateFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.CreateFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.CreateFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.CreateFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.CreateFile parseFrom(
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
  public static Builder newBuilder(protocol.CreateFile prototype) {
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
   * CreateFile create file operation.
   * </pre>
   *
   * Protobuf type {@code protocol.CreateFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.CreateFile)
      protocol.CreateFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_CreateFile_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_CreateFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.CreateFile.class, protocol.CreateFile.Builder.class);
    }

    // Construct using protocol.CreateFile.newBuilder()
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
      kind_ = "";

      if (uriBuilder_ == null) {
        uri_ = null;
      } else {
        uri_ = null;
        uriBuilder_ = null;
      }
      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_CreateFile_descriptor;
    }

    public protocol.CreateFile getDefaultInstanceForType() {
      return protocol.CreateFile.getDefaultInstance();
    }

    public protocol.CreateFile build() {
      protocol.CreateFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.CreateFile buildPartial() {
      protocol.CreateFile result = new protocol.CreateFile(this);
      result.kind_ = kind_;
      if (uriBuilder_ == null) {
        result.uri_ = uri_;
      } else {
        result.uri_ = uriBuilder_.build();
      }
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
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
      if (other instanceof protocol.CreateFile) {
        return mergeFrom((protocol.CreateFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.CreateFile other) {
      if (other == protocol.CreateFile.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        onChanged();
      }
      if (other.hasUri()) {
        mergeUri(other.getUri());
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
      protocol.CreateFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.CreateFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * The kind of CreateFile message.
     * (-- api-linter: core::0192::only-leading-comments=disabled --)
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The kind of CreateFile message.
     * (-- api-linter: core::0192::only-leading-comments=disabled --)
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The kind of CreateFile message.
     * (-- api-linter: core::0192::only-leading-comments=disabled --)
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of CreateFile message.
     * (-- api-linter: core::0192::only-leading-comments=disabled --)
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearKind() {
      
      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of CreateFile message.
     * (-- api-linter: core::0192::only-leading-comments=disabled --)
     * </pre>
     *
     * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kind_ = value;
      onChanged();
      return this;
    }

    private uri.URI uri_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        uri.URI, uri.URI.Builder, uri.URIOrBuilder> uriBuilder_;
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean hasUri() {
      return uriBuilder_ != null || uri_ != null;
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public uri.URI getUri() {
      if (uriBuilder_ == null) {
        return uri_ == null ? uri.URI.getDefaultInstance() : uri_;
      } else {
        return uriBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUri(uri.URI value) {
      if (uriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uri_ = value;
        onChanged();
      } else {
        uriBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUri(
        uri.URI.Builder builderForValue) {
      if (uriBuilder_ == null) {
        uri_ = builderForValue.build();
        onChanged();
      } else {
        uriBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUri(uri.URI value) {
      if (uriBuilder_ == null) {
        if (uri_ != null) {
          uri_ =
            uri.URI.newBuilder(uri_).mergeFrom(value).buildPartial();
        } else {
          uri_ = value;
        }
        onChanged();
      } else {
        uriBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUri() {
      if (uriBuilder_ == null) {
        uri_ = null;
        onChanged();
      } else {
        uri_ = null;
        uriBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public uri.URI.Builder getUriBuilder() {
      
      onChanged();
      return getUriFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public uri.URIOrBuilder getUriOrBuilder() {
      if (uriBuilder_ != null) {
        return uriBuilder_.getMessageOrBuilder();
      } else {
        return uri_ == null ?
            uri.URI.getDefaultInstance() : uri_;
      }
    }
    /**
     * <pre>
     * The resource to create.
     * </pre>
     *
     * <code>.uri.URI uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        uri.URI, uri.URI.Builder, uri.URIOrBuilder> 
        getUriFieldBuilder() {
      if (uriBuilder_ == null) {
        uriBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            uri.URI, uri.URI.Builder, uri.URIOrBuilder>(
                getUri(),
                getParentForChildren(),
                isClean());
        uri_ = null;
      }
      return uriBuilder_;
    }

    private protocol.CreateFileOptions options_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.CreateFileOptions, protocol.CreateFileOptions.Builder, protocol.CreateFileOptionsOrBuilder> optionsBuilder_;
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public protocol.CreateFileOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? protocol.CreateFileOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public Builder setOptions(protocol.CreateFileOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public Builder setOptions(
        protocol.CreateFileOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public Builder mergeOptions(protocol.CreateFileOptions value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
            protocol.CreateFileOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public protocol.CreateFileOptions.Builder getOptionsBuilder() {
      
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    public protocol.CreateFileOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            protocol.CreateFileOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <pre>
     * Optional. Additional options
     * </pre>
     *
     * <code>.protocol.CreateFileOptions options = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.CreateFileOptions, protocol.CreateFileOptions.Builder, protocol.CreateFileOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.CreateFileOptions, protocol.CreateFileOptions.Builder, protocol.CreateFileOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.CreateFile)
  }

  // @@protoc_insertion_point(class_scope:protocol.CreateFile)
  private static final protocol.CreateFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.CreateFile();
  }

  public static protocol.CreateFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFile>
      PARSER = new com.google.protobuf.AbstractParser<CreateFile>() {
    public CreateFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFile> getParserForType() {
    return PARSER;
  }

  public protocol.CreateFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
