// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * LocationLinks represents a list of LocationLink.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.LocationLinks}
 */
public  final class LocationLinks extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.LocationLinks)
    LocationLinksOrBuilder {
  // Use LocationLinks.newBuilder() to construct.
  private LocationLinks(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationLinks() {
    locationLinks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LocationLinks(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              locationLinks_ = new java.util.ArrayList<protocol.rpc.LocationLinks>();
              mutable_bitField0_ |= 0x00000001;
            }
            locationLinks_.add(
                input.readMessage(protocol.rpc.LocationLinks.parser(), extensionRegistry));
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
        locationLinks_ = java.util.Collections.unmodifiableList(locationLinks_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_LocationLinks_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_LocationLinks_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.LocationLinks.class, protocol.rpc.LocationLinks.Builder.class);
  }

  public static final int LOCATION_LINKS_FIELD_NUMBER = 1;
  private java.util.List<protocol.rpc.LocationLinks> locationLinks_;
  /**
   * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
   */
  public java.util.List<protocol.rpc.LocationLinks> getLocationLinksList() {
    return locationLinks_;
  }
  /**
   * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
   */
  public java.util.List<? extends protocol.rpc.LocationLinksOrBuilder> 
      getLocationLinksOrBuilderList() {
    return locationLinks_;
  }
  /**
   * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
   */
  public int getLocationLinksCount() {
    return locationLinks_.size();
  }
  /**
   * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
   */
  public protocol.rpc.LocationLinks getLocationLinks(int index) {
    return locationLinks_.get(index);
  }
  /**
   * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
   */
  public protocol.rpc.LocationLinksOrBuilder getLocationLinksOrBuilder(
      int index) {
    return locationLinks_.get(index);
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
    for (int i = 0; i < locationLinks_.size(); i++) {
      output.writeMessage(1, locationLinks_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locationLinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, locationLinks_.get(i));
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
    if (!(obj instanceof protocol.rpc.LocationLinks)) {
      return super.equals(obj);
    }
    protocol.rpc.LocationLinks other = (protocol.rpc.LocationLinks) obj;

    boolean result = true;
    result = result && getLocationLinksList()
        .equals(other.getLocationLinksList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLocationLinksCount() > 0) {
      hash = (37 * hash) + LOCATION_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLocationLinksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.LocationLinks parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.LocationLinks parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.LocationLinks parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.LocationLinks parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.LocationLinks parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.LocationLinks parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.LocationLinks parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.LocationLinks parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.LocationLinks parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.LocationLinks parseFrom(
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
  public static Builder newBuilder(protocol.rpc.LocationLinks prototype) {
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
   * LocationLinks represents a list of LocationLink.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.LocationLinks}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.LocationLinks)
      protocol.rpc.LocationLinksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_LocationLinks_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_LocationLinks_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.LocationLinks.class, protocol.rpc.LocationLinks.Builder.class);
    }

    // Construct using protocol.rpc.LocationLinks.newBuilder()
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
        getLocationLinksFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (locationLinksBuilder_ == null) {
        locationLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        locationLinksBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_LocationLinks_descriptor;
    }

    public protocol.rpc.LocationLinks getDefaultInstanceForType() {
      return protocol.rpc.LocationLinks.getDefaultInstance();
    }

    public protocol.rpc.LocationLinks build() {
      protocol.rpc.LocationLinks result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.LocationLinks buildPartial() {
      protocol.rpc.LocationLinks result = new protocol.rpc.LocationLinks(this);
      int from_bitField0_ = bitField0_;
      if (locationLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          locationLinks_ = java.util.Collections.unmodifiableList(locationLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locationLinks_ = locationLinks_;
      } else {
        result.locationLinks_ = locationLinksBuilder_.build();
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
      if (other instanceof protocol.rpc.LocationLinks) {
        return mergeFrom((protocol.rpc.LocationLinks)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.LocationLinks other) {
      if (other == protocol.rpc.LocationLinks.getDefaultInstance()) return this;
      if (locationLinksBuilder_ == null) {
        if (!other.locationLinks_.isEmpty()) {
          if (locationLinks_.isEmpty()) {
            locationLinks_ = other.locationLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocationLinksIsMutable();
            locationLinks_.addAll(other.locationLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.locationLinks_.isEmpty()) {
          if (locationLinksBuilder_.isEmpty()) {
            locationLinksBuilder_.dispose();
            locationLinksBuilder_ = null;
            locationLinks_ = other.locationLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            locationLinksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocationLinksFieldBuilder() : null;
          } else {
            locationLinksBuilder_.addAllMessages(other.locationLinks_);
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
      protocol.rpc.LocationLinks parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.LocationLinks) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<protocol.rpc.LocationLinks> locationLinks_ =
      java.util.Collections.emptyList();
    private void ensureLocationLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        locationLinks_ = new java.util.ArrayList<protocol.rpc.LocationLinks>(locationLinks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.LocationLinks, protocol.rpc.LocationLinks.Builder, protocol.rpc.LocationLinksOrBuilder> locationLinksBuilder_;

    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public java.util.List<protocol.rpc.LocationLinks> getLocationLinksList() {
      if (locationLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locationLinks_);
      } else {
        return locationLinksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public int getLocationLinksCount() {
      if (locationLinksBuilder_ == null) {
        return locationLinks_.size();
      } else {
        return locationLinksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public protocol.rpc.LocationLinks getLocationLinks(int index) {
      if (locationLinksBuilder_ == null) {
        return locationLinks_.get(index);
      } else {
        return locationLinksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder setLocationLinks(
        int index, protocol.rpc.LocationLinks value) {
      if (locationLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationLinksIsMutable();
        locationLinks_.set(index, value);
        onChanged();
      } else {
        locationLinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder setLocationLinks(
        int index, protocol.rpc.LocationLinks.Builder builderForValue) {
      if (locationLinksBuilder_ == null) {
        ensureLocationLinksIsMutable();
        locationLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder addLocationLinks(protocol.rpc.LocationLinks value) {
      if (locationLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationLinksIsMutable();
        locationLinks_.add(value);
        onChanged();
      } else {
        locationLinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder addLocationLinks(
        int index, protocol.rpc.LocationLinks value) {
      if (locationLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationLinksIsMutable();
        locationLinks_.add(index, value);
        onChanged();
      } else {
        locationLinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder addLocationLinks(
        protocol.rpc.LocationLinks.Builder builderForValue) {
      if (locationLinksBuilder_ == null) {
        ensureLocationLinksIsMutable();
        locationLinks_.add(builderForValue.build());
        onChanged();
      } else {
        locationLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder addLocationLinks(
        int index, protocol.rpc.LocationLinks.Builder builderForValue) {
      if (locationLinksBuilder_ == null) {
        ensureLocationLinksIsMutable();
        locationLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder addAllLocationLinks(
        java.lang.Iterable<? extends protocol.rpc.LocationLinks> values) {
      if (locationLinksBuilder_ == null) {
        ensureLocationLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locationLinks_);
        onChanged();
      } else {
        locationLinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder clearLocationLinks() {
      if (locationLinksBuilder_ == null) {
        locationLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        locationLinksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public Builder removeLocationLinks(int index) {
      if (locationLinksBuilder_ == null) {
        ensureLocationLinksIsMutable();
        locationLinks_.remove(index);
        onChanged();
      } else {
        locationLinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public protocol.rpc.LocationLinks.Builder getLocationLinksBuilder(
        int index) {
      return getLocationLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public protocol.rpc.LocationLinksOrBuilder getLocationLinksOrBuilder(
        int index) {
      if (locationLinksBuilder_ == null) {
        return locationLinks_.get(index);  } else {
        return locationLinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public java.util.List<? extends protocol.rpc.LocationLinksOrBuilder> 
         getLocationLinksOrBuilderList() {
      if (locationLinksBuilder_ != null) {
        return locationLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locationLinks_);
      }
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public protocol.rpc.LocationLinks.Builder addLocationLinksBuilder() {
      return getLocationLinksFieldBuilder().addBuilder(
          protocol.rpc.LocationLinks.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public protocol.rpc.LocationLinks.Builder addLocationLinksBuilder(
        int index) {
      return getLocationLinksFieldBuilder().addBuilder(
          index, protocol.rpc.LocationLinks.getDefaultInstance());
    }
    /**
     * <code>repeated .protocol.rpc.LocationLinks location_links = 1;</code>
     */
    public java.util.List<protocol.rpc.LocationLinks.Builder> 
         getLocationLinksBuilderList() {
      return getLocationLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protocol.rpc.LocationLinks, protocol.rpc.LocationLinks.Builder, protocol.rpc.LocationLinksOrBuilder> 
        getLocationLinksFieldBuilder() {
      if (locationLinksBuilder_ == null) {
        locationLinksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protocol.rpc.LocationLinks, protocol.rpc.LocationLinks.Builder, protocol.rpc.LocationLinksOrBuilder>(
                locationLinks_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        locationLinks_ = null;
      }
      return locationLinksBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.LocationLinks)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.LocationLinks)
  private static final protocol.rpc.LocationLinks DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.LocationLinks();
  }

  public static protocol.rpc.LocationLinks getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationLinks>
      PARSER = new com.google.protobuf.AbstractParser<LocationLinks>() {
    public LocationLinks parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LocationLinks(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocationLinks> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationLinks> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.LocationLinks getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
