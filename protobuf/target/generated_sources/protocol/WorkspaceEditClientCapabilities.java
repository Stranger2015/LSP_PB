// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * WorkspaceEditClientCapabilities ResourceOperationKind and FailureHandlingKind and the client
 * capability workspace.workspaceEdit.resourceOperations as well as
 * workspace.workspaceEdit.failureHandling.
 * New in version 3.13.
 * The capabilities of a workspace edit has evolved over the time. Clients can describe their
 * support using the following client capability:
 * - property path (optional): workspace.workspaceEdit
 * - property type: WorkspaceEditClientCapabilities defined as follows.
 * </pre>
 *
 * Protobuf type {@code protocol.WorkspaceEditClientCapabilities}
 */
public  final class WorkspaceEditClientCapabilities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.WorkspaceEditClientCapabilities)
    WorkspaceEditClientCapabilitiesOrBuilder {
  // Use WorkspaceEditClientCapabilities.newBuilder() to construct.
  private WorkspaceEditClientCapabilities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkspaceEditClientCapabilities() {
    documentChanges_ = false;
    resourceOperations_ = java.util.Collections.emptyList();
    failureHandling_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private WorkspaceEditClientCapabilities(
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
          case 8: {

            documentChanges_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              resourceOperations_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            resourceOperations_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                resourceOperations_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              resourceOperations_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            failureHandling_ = rawValue;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        resourceOperations_ = java.util.Collections.unmodifiableList(resourceOperations_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.ProtocolProto.internal_static_protocol_WorkspaceEditClientCapabilities_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_WorkspaceEditClientCapabilities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.WorkspaceEditClientCapabilities.class, protocol.WorkspaceEditClientCapabilities.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_CHANGES_FIELD_NUMBER = 1;
  private boolean documentChanges_;
  /**
   * <pre>
   * Optional. The client supports versioned document changes in `WorkspaceEdit`s.
   * </pre>
   *
   * <code>bool document_changes = 1;</code>
   */
  public boolean getDocumentChanges() {
    return documentChanges_;
  }

  public static final int RESOURCE_OPERATIONS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> resourceOperations_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, protocol.ResourceOperationKind> resourceOperations_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, protocol.ResourceOperationKind>() {
            public protocol.ResourceOperationKind convert(java.lang.Integer from) {
              protocol.ResourceOperationKind result = protocol.ResourceOperationKind.valueOf(from);
              return result == null ? protocol.ResourceOperationKind.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  public java.util.List<protocol.ResourceOperationKind> getResourceOperationsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, protocol.ResourceOperationKind>(resourceOperations_, resourceOperations_converter_);
  }
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  public int getResourceOperationsCount() {
    return resourceOperations_.size();
  }
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  public protocol.ResourceOperationKind getResourceOperations(int index) {
    return resourceOperations_converter_.convert(resourceOperations_.get(index));
  }
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  public java.util.List<java.lang.Integer>
  getResourceOperationsValueList() {
    return resourceOperations_;
  }
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  public int getResourceOperationsValue(int index) {
    return resourceOperations_.get(index);
  }
  private int resourceOperationsMemoizedSerializedSize;

  public static final int FAILURE_HANDLING_FIELD_NUMBER = 3;
  private int failureHandling_;
  /**
   * <pre>
   * Optional. The failure handling strategy of a client if applying the workspace edit
   * fails.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
   */
  public int getFailureHandlingValue() {
    return failureHandling_;
  }
  /**
   * <pre>
   * Optional. The failure handling strategy of a client if applying the workspace edit
   * fails.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
   */
  public protocol.FailureHandlingKind getFailureHandling() {
    protocol.FailureHandlingKind result = protocol.FailureHandlingKind.valueOf(failureHandling_);
    return result == null ? protocol.FailureHandlingKind.UNRECOGNIZED : result;
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
    getSerializedSize();
    if (documentChanges_ != false) {
      output.writeBool(1, documentChanges_);
    }
    if (getResourceOperationsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(resourceOperationsMemoizedSerializedSize);
    }
    for (int i = 0; i < resourceOperations_.size(); i++) {
      output.writeEnumNoTag(resourceOperations_.get(i));
    }
    if (failureHandling_ != protocol.FailureHandlingKind.FAILURE_HANDLING_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, failureHandling_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (documentChanges_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, documentChanges_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resourceOperations_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(resourceOperations_.get(i));
      }
      size += dataSize;
      if (!getResourceOperationsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }resourceOperationsMemoizedSerializedSize = dataSize;
    }
    if (failureHandling_ != protocol.FailureHandlingKind.FAILURE_HANDLING_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, failureHandling_);
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
    if (!(obj instanceof protocol.WorkspaceEditClientCapabilities)) {
      return super.equals(obj);
    }
    protocol.WorkspaceEditClientCapabilities other = (protocol.WorkspaceEditClientCapabilities) obj;

    boolean result = true;
    result = result && (getDocumentChanges()
        == other.getDocumentChanges());
    result = result && resourceOperations_.equals(other.resourceOperations_);
    result = result && failureHandling_ == other.failureHandling_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DOCUMENT_CHANGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDocumentChanges());
    if (getResourceOperationsCount() > 0) {
      hash = (37 * hash) + RESOURCE_OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + resourceOperations_.hashCode();
    }
    hash = (37 * hash) + FAILURE_HANDLING_FIELD_NUMBER;
    hash = (53 * hash) + failureHandling_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.WorkspaceEditClientCapabilities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkspaceEditClientCapabilities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.WorkspaceEditClientCapabilities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkspaceEditClientCapabilities parseFrom(
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
  public static Builder newBuilder(protocol.WorkspaceEditClientCapabilities prototype) {
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
   * WorkspaceEditClientCapabilities ResourceOperationKind and FailureHandlingKind and the client
   * capability workspace.workspaceEdit.resourceOperations as well as
   * workspace.workspaceEdit.failureHandling.
   * New in version 3.13.
   * The capabilities of a workspace edit has evolved over the time. Clients can describe their
   * support using the following client capability:
   * - property path (optional): workspace.workspaceEdit
   * - property type: WorkspaceEditClientCapabilities defined as follows.
   * </pre>
   *
   * Protobuf type {@code protocol.WorkspaceEditClientCapabilities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.WorkspaceEditClientCapabilities)
      protocol.WorkspaceEditClientCapabilitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_WorkspaceEditClientCapabilities_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_WorkspaceEditClientCapabilities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.WorkspaceEditClientCapabilities.class, protocol.WorkspaceEditClientCapabilities.Builder.class);
    }

    // Construct using protocol.WorkspaceEditClientCapabilities.newBuilder()
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
      documentChanges_ = false;

      resourceOperations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      failureHandling_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_WorkspaceEditClientCapabilities_descriptor;
    }

    public protocol.WorkspaceEditClientCapabilities getDefaultInstanceForType() {
      return protocol.WorkspaceEditClientCapabilities.getDefaultInstance();
    }

    public protocol.WorkspaceEditClientCapabilities build() {
      protocol.WorkspaceEditClientCapabilities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.WorkspaceEditClientCapabilities buildPartial() {
      protocol.WorkspaceEditClientCapabilities result = new protocol.WorkspaceEditClientCapabilities(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.documentChanges_ = documentChanges_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        resourceOperations_ = java.util.Collections.unmodifiableList(resourceOperations_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.resourceOperations_ = resourceOperations_;
      result.failureHandling_ = failureHandling_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof protocol.WorkspaceEditClientCapabilities) {
        return mergeFrom((protocol.WorkspaceEditClientCapabilities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.WorkspaceEditClientCapabilities other) {
      if (other == protocol.WorkspaceEditClientCapabilities.getDefaultInstance()) return this;
      if (other.getDocumentChanges() != false) {
        setDocumentChanges(other.getDocumentChanges());
      }
      if (!other.resourceOperations_.isEmpty()) {
        if (resourceOperations_.isEmpty()) {
          resourceOperations_ = other.resourceOperations_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureResourceOperationsIsMutable();
          resourceOperations_.addAll(other.resourceOperations_);
        }
        onChanged();
      }
      if (other.failureHandling_ != 0) {
        setFailureHandlingValue(other.getFailureHandlingValue());
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
      protocol.WorkspaceEditClientCapabilities parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.WorkspaceEditClientCapabilities) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean documentChanges_ ;
    /**
     * <pre>
     * Optional. The client supports versioned document changes in `WorkspaceEdit`s.
     * </pre>
     *
     * <code>bool document_changes = 1;</code>
     */
    public boolean getDocumentChanges() {
      return documentChanges_;
    }
    /**
     * <pre>
     * Optional. The client supports versioned document changes in `WorkspaceEdit`s.
     * </pre>
     *
     * <code>bool document_changes = 1;</code>
     */
    public Builder setDocumentChanges(boolean value) {
      
      documentChanges_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The client supports versioned document changes in `WorkspaceEdit`s.
     * </pre>
     *
     * <code>bool document_changes = 1;</code>
     */
    public Builder clearDocumentChanges() {
      
      documentChanges_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> resourceOperations_ =
      java.util.Collections.emptyList();
    private void ensureResourceOperationsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        resourceOperations_ = new java.util.ArrayList<java.lang.Integer>(resourceOperations_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public java.util.List<protocol.ResourceOperationKind> getResourceOperationsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, protocol.ResourceOperationKind>(resourceOperations_, resourceOperations_converter_);
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public int getResourceOperationsCount() {
      return resourceOperations_.size();
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public protocol.ResourceOperationKind getResourceOperations(int index) {
      return resourceOperations_converter_.convert(resourceOperations_.get(index));
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder setResourceOperations(
        int index, protocol.ResourceOperationKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceOperationsIsMutable();
      resourceOperations_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder addResourceOperations(protocol.ResourceOperationKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceOperationsIsMutable();
      resourceOperations_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder addAllResourceOperations(
        java.lang.Iterable<? extends protocol.ResourceOperationKind> values) {
      ensureResourceOperationsIsMutable();
      for (protocol.ResourceOperationKind value : values) {
        resourceOperations_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder clearResourceOperations() {
      resourceOperations_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public java.util.List<java.lang.Integer>
    getResourceOperationsValueList() {
      return java.util.Collections.unmodifiableList(resourceOperations_);
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public int getResourceOperationsValue(int index) {
      return resourceOperations_.get(index);
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder setResourceOperationsValue(
        int index, int value) {
      ensureResourceOperationsIsMutable();
      resourceOperations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder addResourceOperationsValue(int value) {
      ensureResourceOperationsIsMutable();
      resourceOperations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource operations the client supports. Clients should at least
     * support 'create', 'rename' and 'delete' files and folders.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
     */
    public Builder addAllResourceOperationsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureResourceOperationsIsMutable();
      for (int value : values) {
        resourceOperations_.add(value);
      }
      onChanged();
      return this;
    }

    private int failureHandling_ = 0;
    /**
     * <pre>
     * Optional. The failure handling strategy of a client if applying the workspace edit
     * fails.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
     */
    public int getFailureHandlingValue() {
      return failureHandling_;
    }
    /**
     * <pre>
     * Optional. The failure handling strategy of a client if applying the workspace edit
     * fails.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
     */
    public Builder setFailureHandlingValue(int value) {
      failureHandling_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The failure handling strategy of a client if applying the workspace edit
     * fails.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
     */
    public protocol.FailureHandlingKind getFailureHandling() {
      protocol.FailureHandlingKind result = protocol.FailureHandlingKind.valueOf(failureHandling_);
      return result == null ? protocol.FailureHandlingKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. The failure handling strategy of a client if applying the workspace edit
     * fails.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
     */
    public Builder setFailureHandling(protocol.FailureHandlingKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      failureHandling_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The failure handling strategy of a client if applying the workspace edit
     * fails.
     * &#64;since 3.13.0
     * </pre>
     *
     * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
     */
    public Builder clearFailureHandling() {
      
      failureHandling_ = 0;
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


    // @@protoc_insertion_point(builder_scope:protocol.WorkspaceEditClientCapabilities)
  }

  // @@protoc_insertion_point(class_scope:protocol.WorkspaceEditClientCapabilities)
  private static final protocol.WorkspaceEditClientCapabilities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.WorkspaceEditClientCapabilities();
  }

  public static protocol.WorkspaceEditClientCapabilities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkspaceEditClientCapabilities>
      PARSER = new com.google.protobuf.AbstractParser<WorkspaceEditClientCapabilities>() {
    public WorkspaceEditClientCapabilities parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorkspaceEditClientCapabilities(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkspaceEditClientCapabilities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkspaceEditClientCapabilities> getParserForType() {
    return PARSER;
  }

  public protocol.WorkspaceEditClientCapabilities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

