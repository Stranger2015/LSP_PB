// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * Registration is the general parameters to register for a capability.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.Registration}
 */
public  final class Registration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.Registration)
    RegistrationOrBuilder {
  // Use Registration.newBuilder() to construct.
  private Registration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Registration() {
    id_ = "";
    method_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Registration(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (registerOptions_ != null) {
              subBuilder = registerOptions_.toBuilder();
            }
            registerOptions_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(registerOptions_);
              registerOptions_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_Registration_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_Registration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.Registration.class, protocol.rpc.Registration.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * The id used to register the request. The id can be used to deregister
   * the request again.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id used to register the request. The id can be used to deregister
   * the request again.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHOD_FIELD_NUMBER = 2;
  private volatile java.lang.Object method_;
  /**
   * <pre>
   * The method / capability to register for.
   * </pre>
   *
   * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The method / capability to register for.
   * </pre>
   *
   * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGISTER_OPTIONS_FIELD_NUMBER = 3;
  private com.google.protobuf.Any registerOptions_;
  /**
   * <pre>
   * Options necessary for the registration.
   * </pre>
   *
   * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public boolean hasRegisterOptions() {
    return registerOptions_ != null;
  }
  /**
   * <pre>
   * Options necessary for the registration.
   * </pre>
   *
   * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public com.google.protobuf.Any getRegisterOptions() {
    return registerOptions_ == null ? com.google.protobuf.Any.getDefaultInstance() : registerOptions_;
  }
  /**
   * <pre>
   * Options necessary for the registration.
   * </pre>
   *
   * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public com.google.protobuf.AnyOrBuilder getRegisterOptionsOrBuilder() {
    return getRegisterOptions();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, method_);
    }
    if (registerOptions_ != null) {
      output.writeMessage(3, getRegisterOptions());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, method_);
    }
    if (registerOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRegisterOptions());
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
    if (!(obj instanceof protocol.rpc.Registration)) {
      return super.equals(obj);
    }
    protocol.rpc.Registration other = (protocol.rpc.Registration) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getMethod()
        .equals(other.getMethod());
    result = result && (hasRegisterOptions() == other.hasRegisterOptions());
    if (hasRegisterOptions()) {
      result = result && getRegisterOptions()
          .equals(other.getRegisterOptions());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    if (hasRegisterOptions()) {
      hash = (37 * hash) + REGISTER_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRegisterOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.Registration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.Registration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.Registration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.Registration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.Registration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.Registration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.Registration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.Registration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.Registration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.Registration parseFrom(
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
  public static Builder newBuilder(protocol.rpc.Registration prototype) {
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
   * Registration is the general parameters to register for a capability.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.Registration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.Registration)
      protocol.rpc.RegistrationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_Registration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_Registration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.Registration.class, protocol.rpc.Registration.Builder.class);
    }

    // Construct using protocol.rpc.Registration.newBuilder()
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
      id_ = "";

      method_ = "";

      if (registerOptionsBuilder_ == null) {
        registerOptions_ = null;
      } else {
        registerOptions_ = null;
        registerOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_Registration_descriptor;
    }

    public protocol.rpc.Registration getDefaultInstanceForType() {
      return protocol.rpc.Registration.getDefaultInstance();
    }

    public protocol.rpc.Registration build() {
      protocol.rpc.Registration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.Registration buildPartial() {
      protocol.rpc.Registration result = new protocol.rpc.Registration(this);
      result.id_ = id_;
      result.method_ = method_;
      if (registerOptionsBuilder_ == null) {
        result.registerOptions_ = registerOptions_;
      } else {
        result.registerOptions_ = registerOptionsBuilder_.build();
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
      if (other instanceof protocol.rpc.Registration) {
        return mergeFrom((protocol.rpc.Registration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.Registration other) {
      if (other == protocol.rpc.Registration.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (other.hasRegisterOptions()) {
        mergeRegisterOptions(other.getRegisterOptions());
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
      protocol.rpc.Registration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.Registration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The id used to register the request. The id can be used to deregister
     * the request again.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id used to register the request. The id can be used to deregister
     * the request again.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id used to register the request. The id can be used to deregister
     * the request again.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id used to register the request. The id can be used to deregister
     * the request again.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id used to register the request. The id can be used to deregister
     * the request again.
     * </pre>
     *
     * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object method_ = "";
    /**
     * <pre>
     * The method / capability to register for.
     * </pre>
     *
     * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The method / capability to register for.
     * </pre>
     *
     * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The method / capability to register for.
     * </pre>
     *
     * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The method / capability to register for.
     * </pre>
     *
     * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The method / capability to register for.
     * </pre>
     *
     * <code>string method = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any registerOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> registerOptionsBuilder_;
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public boolean hasRegisterOptions() {
      return registerOptionsBuilder_ != null || registerOptions_ != null;
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Any getRegisterOptions() {
      if (registerOptionsBuilder_ == null) {
        return registerOptions_ == null ? com.google.protobuf.Any.getDefaultInstance() : registerOptions_;
      } else {
        return registerOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setRegisterOptions(com.google.protobuf.Any value) {
      if (registerOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registerOptions_ = value;
        onChanged();
      } else {
        registerOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setRegisterOptions(
        com.google.protobuf.Any.Builder builderForValue) {
      if (registerOptionsBuilder_ == null) {
        registerOptions_ = builderForValue.build();
        onChanged();
      } else {
        registerOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeRegisterOptions(com.google.protobuf.Any value) {
      if (registerOptionsBuilder_ == null) {
        if (registerOptions_ != null) {
          registerOptions_ =
            com.google.protobuf.Any.newBuilder(registerOptions_).mergeFrom(value).buildPartial();
        } else {
          registerOptions_ = value;
        }
        onChanged();
      } else {
        registerOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearRegisterOptions() {
      if (registerOptionsBuilder_ == null) {
        registerOptions_ = null;
        onChanged();
      } else {
        registerOptions_ = null;
        registerOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Any.Builder getRegisterOptionsBuilder() {
      
      onChanged();
      return getRegisterOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.AnyOrBuilder getRegisterOptionsOrBuilder() {
      if (registerOptionsBuilder_ != null) {
        return registerOptionsBuilder_.getMessageOrBuilder();
      } else {
        return registerOptions_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : registerOptions_;
      }
    }
    /**
     * <pre>
     * Options necessary for the registration.
     * </pre>
     *
     * <code>.google.protobuf.Any register_options = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getRegisterOptionsFieldBuilder() {
      if (registerOptionsBuilder_ == null) {
        registerOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getRegisterOptions(),
                getParentForChildren(),
                isClean());
        registerOptions_ = null;
      }
      return registerOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.Registration)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.Registration)
  private static final protocol.rpc.Registration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.Registration();
  }

  public static protocol.rpc.Registration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Registration>
      PARSER = new com.google.protobuf.AbstractParser<Registration>() {
    public Registration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Registration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Registration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Registration> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.Registration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
