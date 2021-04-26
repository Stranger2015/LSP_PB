// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * ConfigurationItem represents a configuration section to ask for and an additional scope URI.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.ConfigurationItem}
 */
public  final class ConfigurationItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.ConfigurationItem)
    ConfigurationItemOrBuilder {
  // Use ConfigurationItem.newBuilder() to construct.
  private ConfigurationItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfigurationItem() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ConfigurationItem(
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
            protocol.DocumentURI.Builder subBuilder = null;
            if (scopeUri_ != null) {
              subBuilder = scopeUri_.toBuilder();
            }
            scopeUri_ = input.readMessage(protocol.DocumentURI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(scopeUri_);
              scopeUri_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (section_ != null) {
              subBuilder = section_.toBuilder();
            }
            section_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(section_);
              section_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ConfigurationItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_ConfigurationItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.ConfigurationItem.class, protocol.rpc.ConfigurationItem.Builder.class);
  }

  public static final int SCOPE_URI_FIELD_NUMBER = 1;
  private protocol.DocumentURI scopeUri_;
  /**
   * <pre>
   * The scope to get the configuration section for.
   * </pre>
   *
   * <code>.protocol.DocumentURI scope_uri = 1;</code>
   */
  public boolean hasScopeUri() {
    return scopeUri_ != null;
  }
  /**
   * <pre>
   * The scope to get the configuration section for.
   * </pre>
   *
   * <code>.protocol.DocumentURI scope_uri = 1;</code>
   */
  public protocol.DocumentURI getScopeUri() {
    return scopeUri_ == null ? protocol.DocumentURI.getDefaultInstance() : scopeUri_;
  }
  /**
   * <pre>
   * The scope to get the configuration section for.
   * </pre>
   *
   * <code>.protocol.DocumentURI scope_uri = 1;</code>
   */
  public protocol.DocumentURIOrBuilder getScopeUriOrBuilder() {
    return getScopeUri();
  }

  public static final int SECTION_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue section_;
  /**
   * <pre>
   * The configuration section asked for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue section = 2;</code>
   */
  public boolean hasSection() {
    return section_ != null;
  }
  /**
   * <pre>
   * The configuration section asked for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue section = 2;</code>
   */
  public com.google.protobuf.StringValue getSection() {
    return section_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : section_;
  }
  /**
   * <pre>
   * The configuration section asked for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue section = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getSectionOrBuilder() {
    return getSection();
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
    if (scopeUri_ != null) {
      output.writeMessage(1, getScopeUri());
    }
    if (section_ != null) {
      output.writeMessage(2, getSection());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scopeUri_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScopeUri());
    }
    if (section_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSection());
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
    if (!(obj instanceof protocol.rpc.ConfigurationItem)) {
      return super.equals(obj);
    }
    protocol.rpc.ConfigurationItem other = (protocol.rpc.ConfigurationItem) obj;

    boolean result = true;
    result = result && (hasScopeUri() == other.hasScopeUri());
    if (hasScopeUri()) {
      result = result && getScopeUri()
          .equals(other.getScopeUri());
    }
    result = result && (hasSection() == other.hasSection());
    if (hasSection()) {
      result = result && getSection()
          .equals(other.getSection());
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
    if (hasScopeUri()) {
      hash = (37 * hash) + SCOPE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getScopeUri().hashCode();
    }
    if (hasSection()) {
      hash = (37 * hash) + SECTION_FIELD_NUMBER;
      hash = (53 * hash) + getSection().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.ConfigurationItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ConfigurationItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.ConfigurationItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.ConfigurationItem parseFrom(
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
  public static Builder newBuilder(protocol.rpc.ConfigurationItem prototype) {
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
   * ConfigurationItem represents a configuration section to ask for and an additional scope URI.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.ConfigurationItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.ConfigurationItem)
      protocol.rpc.ConfigurationItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ConfigurationItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ConfigurationItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.ConfigurationItem.class, protocol.rpc.ConfigurationItem.Builder.class);
    }

    // Construct using protocol.rpc.ConfigurationItem.newBuilder()
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
      if (scopeUriBuilder_ == null) {
        scopeUri_ = null;
      } else {
        scopeUri_ = null;
        scopeUriBuilder_ = null;
      }
      if (sectionBuilder_ == null) {
        section_ = null;
      } else {
        section_ = null;
        sectionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_ConfigurationItem_descriptor;
    }

    public protocol.rpc.ConfigurationItem getDefaultInstanceForType() {
      return protocol.rpc.ConfigurationItem.getDefaultInstance();
    }

    public protocol.rpc.ConfigurationItem build() {
      protocol.rpc.ConfigurationItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.ConfigurationItem buildPartial() {
      protocol.rpc.ConfigurationItem result = new protocol.rpc.ConfigurationItem(this);
      if (scopeUriBuilder_ == null) {
        result.scopeUri_ = scopeUri_;
      } else {
        result.scopeUri_ = scopeUriBuilder_.build();
      }
      if (sectionBuilder_ == null) {
        result.section_ = section_;
      } else {
        result.section_ = sectionBuilder_.build();
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
      if (other instanceof protocol.rpc.ConfigurationItem) {
        return mergeFrom((protocol.rpc.ConfigurationItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.ConfigurationItem other) {
      if (other == protocol.rpc.ConfigurationItem.getDefaultInstance()) return this;
      if (other.hasScopeUri()) {
        mergeScopeUri(other.getScopeUri());
      }
      if (other.hasSection()) {
        mergeSection(other.getSection());
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
      protocol.rpc.ConfigurationItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.ConfigurationItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.DocumentURI scopeUri_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.DocumentURI, protocol.DocumentURI.Builder, protocol.DocumentURIOrBuilder> scopeUriBuilder_;
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public boolean hasScopeUri() {
      return scopeUriBuilder_ != null || scopeUri_ != null;
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public protocol.DocumentURI getScopeUri() {
      if (scopeUriBuilder_ == null) {
        return scopeUri_ == null ? protocol.DocumentURI.getDefaultInstance() : scopeUri_;
      } else {
        return scopeUriBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public Builder setScopeUri(protocol.DocumentURI value) {
      if (scopeUriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scopeUri_ = value;
        onChanged();
      } else {
        scopeUriBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public Builder setScopeUri(
        protocol.DocumentURI.Builder builderForValue) {
      if (scopeUriBuilder_ == null) {
        scopeUri_ = builderForValue.build();
        onChanged();
      } else {
        scopeUriBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public Builder mergeScopeUri(protocol.DocumentURI value) {
      if (scopeUriBuilder_ == null) {
        if (scopeUri_ != null) {
          scopeUri_ =
            protocol.DocumentURI.newBuilder(scopeUri_).mergeFrom(value).buildPartial();
        } else {
          scopeUri_ = value;
        }
        onChanged();
      } else {
        scopeUriBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public Builder clearScopeUri() {
      if (scopeUriBuilder_ == null) {
        scopeUri_ = null;
        onChanged();
      } else {
        scopeUri_ = null;
        scopeUriBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public protocol.DocumentURI.Builder getScopeUriBuilder() {
      
      onChanged();
      return getScopeUriFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    public protocol.DocumentURIOrBuilder getScopeUriOrBuilder() {
      if (scopeUriBuilder_ != null) {
        return scopeUriBuilder_.getMessageOrBuilder();
      } else {
        return scopeUri_ == null ?
            protocol.DocumentURI.getDefaultInstance() : scopeUri_;
      }
    }
    /**
     * <pre>
     * The scope to get the configuration section for.
     * </pre>
     *
     * <code>.protocol.DocumentURI scope_uri = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.DocumentURI, protocol.DocumentURI.Builder, protocol.DocumentURIOrBuilder> 
        getScopeUriFieldBuilder() {
      if (scopeUriBuilder_ == null) {
        scopeUriBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.DocumentURI, protocol.DocumentURI.Builder, protocol.DocumentURIOrBuilder>(
                getScopeUri(),
                getParentForChildren(),
                isClean());
        scopeUri_ = null;
      }
      return scopeUriBuilder_;
    }

    private com.google.protobuf.StringValue section_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> sectionBuilder_;
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public boolean hasSection() {
      return sectionBuilder_ != null || section_ != null;
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public com.google.protobuf.StringValue getSection() {
      if (sectionBuilder_ == null) {
        return section_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : section_;
      } else {
        return sectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public Builder setSection(com.google.protobuf.StringValue value) {
      if (sectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        section_ = value;
        onChanged();
      } else {
        sectionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public Builder setSection(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (sectionBuilder_ == null) {
        section_ = builderForValue.build();
        onChanged();
      } else {
        sectionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public Builder mergeSection(com.google.protobuf.StringValue value) {
      if (sectionBuilder_ == null) {
        if (section_ != null) {
          section_ =
            com.google.protobuf.StringValue.newBuilder(section_).mergeFrom(value).buildPartial();
        } else {
          section_ = value;
        }
        onChanged();
      } else {
        sectionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public Builder clearSection() {
      if (sectionBuilder_ == null) {
        section_ = null;
        onChanged();
      } else {
        section_ = null;
        sectionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getSectionBuilder() {
      
      onChanged();
      return getSectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getSectionOrBuilder() {
      if (sectionBuilder_ != null) {
        return sectionBuilder_.getMessageOrBuilder();
      } else {
        return section_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : section_;
      }
    }
    /**
     * <pre>
     * The configuration section asked for.
     * </pre>
     *
     * <code>.google.protobuf.StringValue section = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getSectionFieldBuilder() {
      if (sectionBuilder_ == null) {
        sectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getSection(),
                getParentForChildren(),
                isClean());
        section_ = null;
      }
      return sectionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.ConfigurationItem)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.ConfigurationItem)
  private static final protocol.rpc.ConfigurationItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.ConfigurationItem();
  }

  public static protocol.rpc.ConfigurationItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigurationItem>
      PARSER = new com.google.protobuf.AbstractParser<ConfigurationItem>() {
    public ConfigurationItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConfigurationItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConfigurationItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigurationItem> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.ConfigurationItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
