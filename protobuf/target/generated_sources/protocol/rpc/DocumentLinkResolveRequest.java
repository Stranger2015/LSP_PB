// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * DocumentLinkResolveRequest represents a DocumentLinkResolveRequest request.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.DocumentLinkResolveRequest}
 */
public  final class DocumentLinkResolveRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.DocumentLinkResolveRequest)
    DocumentLinkResolveRequestOrBuilder {
  // Use DocumentLinkResolveRequest.newBuilder() to construct.
  private DocumentLinkResolveRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentLinkResolveRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DocumentLinkResolveRequest(
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
            protocol.rpc.DocumentLink.Builder subBuilder = null;
            if (documentLink_ != null) {
              subBuilder = documentLink_.toBuilder();
            }
            documentLink_ = input.readMessage(protocol.rpc.DocumentLink.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(documentLink_);
              documentLink_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkResolveRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkResolveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.DocumentLinkResolveRequest.class, protocol.rpc.DocumentLinkResolveRequest.Builder.class);
  }

  public static final int DOCUMENT_LINK_FIELD_NUMBER = 1;
  private protocol.rpc.DocumentLink documentLink_;
  /**
   * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
   */
  public boolean hasDocumentLink() {
    return documentLink_ != null;
  }
  /**
   * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
   */
  public protocol.rpc.DocumentLink getDocumentLink() {
    return documentLink_ == null ? protocol.rpc.DocumentLink.getDefaultInstance() : documentLink_;
  }
  /**
   * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
   */
  public protocol.rpc.DocumentLinkOrBuilder getDocumentLinkOrBuilder() {
    return getDocumentLink();
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
    if (documentLink_ != null) {
      output.writeMessage(1, getDocumentLink());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (documentLink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDocumentLink());
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
    if (!(obj instanceof protocol.rpc.DocumentLinkResolveRequest)) {
      return super.equals(obj);
    }
    protocol.rpc.DocumentLinkResolveRequest other = (protocol.rpc.DocumentLinkResolveRequest) obj;

    boolean result = true;
    result = result && (hasDocumentLink() == other.hasDocumentLink());
    if (hasDocumentLink()) {
      result = result && getDocumentLink()
          .equals(other.getDocumentLink());
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
    if (hasDocumentLink()) {
      hash = (37 * hash) + DOCUMENT_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.DocumentLinkResolveRequest parseFrom(
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
  public static Builder newBuilder(protocol.rpc.DocumentLinkResolveRequest prototype) {
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
   * DocumentLinkResolveRequest represents a DocumentLinkResolveRequest request.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.DocumentLinkResolveRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.DocumentLinkResolveRequest)
      protocol.rpc.DocumentLinkResolveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkResolveRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkResolveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.DocumentLinkResolveRequest.class, protocol.rpc.DocumentLinkResolveRequest.Builder.class);
    }

    // Construct using protocol.rpc.DocumentLinkResolveRequest.newBuilder()
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
      if (documentLinkBuilder_ == null) {
        documentLink_ = null;
      } else {
        documentLink_ = null;
        documentLinkBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_DocumentLinkResolveRequest_descriptor;
    }

    public protocol.rpc.DocumentLinkResolveRequest getDefaultInstanceForType() {
      return protocol.rpc.DocumentLinkResolveRequest.getDefaultInstance();
    }

    public protocol.rpc.DocumentLinkResolveRequest build() {
      protocol.rpc.DocumentLinkResolveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.DocumentLinkResolveRequest buildPartial() {
      protocol.rpc.DocumentLinkResolveRequest result = new protocol.rpc.DocumentLinkResolveRequest(this);
      if (documentLinkBuilder_ == null) {
        result.documentLink_ = documentLink_;
      } else {
        result.documentLink_ = documentLinkBuilder_.build();
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
      if (other instanceof protocol.rpc.DocumentLinkResolveRequest) {
        return mergeFrom((protocol.rpc.DocumentLinkResolveRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.DocumentLinkResolveRequest other) {
      if (other == protocol.rpc.DocumentLinkResolveRequest.getDefaultInstance()) return this;
      if (other.hasDocumentLink()) {
        mergeDocumentLink(other.getDocumentLink());
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
      protocol.rpc.DocumentLinkResolveRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.DocumentLinkResolveRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protocol.rpc.DocumentLink documentLink_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentLink, protocol.rpc.DocumentLink.Builder, protocol.rpc.DocumentLinkOrBuilder> documentLinkBuilder_;
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public boolean hasDocumentLink() {
      return documentLinkBuilder_ != null || documentLink_ != null;
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public protocol.rpc.DocumentLink getDocumentLink() {
      if (documentLinkBuilder_ == null) {
        return documentLink_ == null ? protocol.rpc.DocumentLink.getDefaultInstance() : documentLink_;
      } else {
        return documentLinkBuilder_.getMessage();
      }
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public Builder setDocumentLink(protocol.rpc.DocumentLink value) {
      if (documentLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentLink_ = value;
        onChanged();
      } else {
        documentLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public Builder setDocumentLink(
        protocol.rpc.DocumentLink.Builder builderForValue) {
      if (documentLinkBuilder_ == null) {
        documentLink_ = builderForValue.build();
        onChanged();
      } else {
        documentLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public Builder mergeDocumentLink(protocol.rpc.DocumentLink value) {
      if (documentLinkBuilder_ == null) {
        if (documentLink_ != null) {
          documentLink_ =
            protocol.rpc.DocumentLink.newBuilder(documentLink_).mergeFrom(value).buildPartial();
        } else {
          documentLink_ = value;
        }
        onChanged();
      } else {
        documentLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public Builder clearDocumentLink() {
      if (documentLinkBuilder_ == null) {
        documentLink_ = null;
        onChanged();
      } else {
        documentLink_ = null;
        documentLinkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public protocol.rpc.DocumentLink.Builder getDocumentLinkBuilder() {
      
      onChanged();
      return getDocumentLinkFieldBuilder().getBuilder();
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    public protocol.rpc.DocumentLinkOrBuilder getDocumentLinkOrBuilder() {
      if (documentLinkBuilder_ != null) {
        return documentLinkBuilder_.getMessageOrBuilder();
      } else {
        return documentLink_ == null ?
            protocol.rpc.DocumentLink.getDefaultInstance() : documentLink_;
      }
    }
    /**
     * <code>.protocol.rpc.DocumentLink document_link = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.DocumentLink, protocol.rpc.DocumentLink.Builder, protocol.rpc.DocumentLinkOrBuilder> 
        getDocumentLinkFieldBuilder() {
      if (documentLinkBuilder_ == null) {
        documentLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.DocumentLink, protocol.rpc.DocumentLink.Builder, protocol.rpc.DocumentLinkOrBuilder>(
                getDocumentLink(),
                getParentForChildren(),
                isClean());
        documentLink_ = null;
      }
      return documentLinkBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.DocumentLinkResolveRequest)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.DocumentLinkResolveRequest)
  private static final protocol.rpc.DocumentLinkResolveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.DocumentLinkResolveRequest();
  }

  public static protocol.rpc.DocumentLinkResolveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentLinkResolveRequest>
      PARSER = new com.google.protobuf.AbstractParser<DocumentLinkResolveRequest>() {
    public DocumentLinkResolveRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DocumentLinkResolveRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentLinkResolveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentLinkResolveRequest> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.DocumentLinkResolveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
