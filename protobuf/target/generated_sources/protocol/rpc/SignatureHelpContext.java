// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * Additional information about the context in which a signature help request was triggered.
 * &#64;since 3.15.0
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.SignatureHelpContext}
 */
public  final class SignatureHelpContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.SignatureHelpContext)
    SignatureHelpContextOrBuilder {
  // Use SignatureHelpContext.newBuilder() to construct.
  private SignatureHelpContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignatureHelpContext() {
    triggerKind_ = 0;
    triggerCharacter_ = "";
    isRetrigger_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SignatureHelpContext(
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
            int rawValue = input.readEnum();

            triggerKind_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            triggerCharacter_ = s;
            break;
          }
          case 24: {

            isRetrigger_ = input.readBool();
            break;
          }
          case 34: {
            protocol.rpc.SignatureHelp.Builder subBuilder = null;
            if (activeSignatureHelp_ != null) {
              subBuilder = activeSignatureHelp_.toBuilder();
            }
            activeSignatureHelp_ = input.readMessage(protocol.rpc.SignatureHelp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(activeSignatureHelp_);
              activeSignatureHelp_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SignatureHelpContext_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_SignatureHelpContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.SignatureHelpContext.class, protocol.rpc.SignatureHelpContext.Builder.class);
  }

  /**
   * <pre>
   * SignatureHelpTriggerKind how a signature help was triggered.
   * &#64;since 3.15.0
   * </pre>
   *
   * Protobuf enum {@code protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind}
   */
  public enum SignatureHelpTriggerKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Conventional default for enums. Do not use this.
     * </pre>
     *
     * <code>SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED = 0;</code>
     */
    SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED(0),
    /**
     * <pre>
     * Signature help was invoked manually by the user or by a command.
     * </pre>
     *
     * <code>INVOKED = 1;</code>
     */
    INVOKED(1),
    /**
     * <pre>
     * Signature help was triggered by a trigger character.
     * </pre>
     *
     * <code>TRIGGER_CHARACTER = 2;</code>
     */
    TRIGGER_CHARACTER(2),
    /**
     * <pre>
     * Signature help was triggered by the cursor moving or by the document content changing.
     * </pre>
     *
     * <code>CONTENT_CHANGE = 3;</code>
     */
    CONTENT_CHANGE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Conventional default for enums. Do not use this.
     * </pre>
     *
     * <code>SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED = 0;</code>
     */
    public static final int SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Signature help was invoked manually by the user or by a command.
     * </pre>
     *
     * <code>INVOKED = 1;</code>
     */
    public static final int INVOKED_VALUE = 1;
    /**
     * <pre>
     * Signature help was triggered by a trigger character.
     * </pre>
     *
     * <code>TRIGGER_CHARACTER = 2;</code>
     */
    public static final int TRIGGER_CHARACTER_VALUE = 2;
    /**
     * <pre>
     * Signature help was triggered by the cursor moving or by the document content changing.
     * </pre>
     *
     * <code>CONTENT_CHANGE = 3;</code>
     */
    public static final int CONTENT_CHANGE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SignatureHelpTriggerKind valueOf(int value) {
      return forNumber(value);
    }

    public static SignatureHelpTriggerKind forNumber(int value) {
      switch (value) {
        case 0: return SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED;
        case 1: return INVOKED;
        case 2: return TRIGGER_CHARACTER;
        case 3: return CONTENT_CHANGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SignatureHelpTriggerKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SignatureHelpTriggerKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SignatureHelpTriggerKind>() {
            public SignatureHelpTriggerKind findValueByNumber(int number) {
              return SignatureHelpTriggerKind.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return protocol.rpc.SignatureHelpContext.getDescriptor().getEnumTypes().get(0);
    }

    private static final SignatureHelpTriggerKind[] VALUES = values();

    public static SignatureHelpTriggerKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SignatureHelpTriggerKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind)
  }

  public static final int TRIGGER_KIND_FIELD_NUMBER = 1;
  private int triggerKind_;
  /**
   * <pre>
   * Action that caused signature help to be triggered.
   * </pre>
   *
   * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getTriggerKindValue() {
    return triggerKind_;
  }
  /**
   * <pre>
   * Action that caused signature help to be triggered.
   * </pre>
   *
   * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind getTriggerKind() {
    protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind result = protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.valueOf(triggerKind_);
    return result == null ? protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.UNRECOGNIZED : result;
  }

  public static final int TRIGGER_CHARACTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object triggerCharacter_;
  /**
   * <pre>
   * Character that caused signature help to be triggered.
   * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
   * </pre>
   *
   * <code>string trigger_character = 2;</code>
   */
  public java.lang.String getTriggerCharacter() {
    java.lang.Object ref = triggerCharacter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      triggerCharacter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Character that caused signature help to be triggered.
   * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
   * </pre>
   *
   * <code>string trigger_character = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTriggerCharacterBytes() {
    java.lang.Object ref = triggerCharacter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      triggerCharacter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_RETRIGGER_FIELD_NUMBER = 3;
  private boolean isRetrigger_;
  /**
   * <pre>
   * `true` if signature help was already showing when it was triggered.
   * Retriggers occur when the signature help is already active and can be caused by actions such as
   * typing a trigger character, a cursor move, or document content changes.
   * </pre>
   *
   * <code>bool is_retrigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public boolean getIsRetrigger() {
    return isRetrigger_;
  }

  public static final int ACTIVE_SIGNATURE_HELP_FIELD_NUMBER = 4;
  private protocol.rpc.SignatureHelp activeSignatureHelp_;
  /**
   * <pre>
   * The currently active `SignatureHelp`.
   * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
   * the user navigating through available signatures.
   * </pre>
   *
   * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
   */
  public boolean hasActiveSignatureHelp() {
    return activeSignatureHelp_ != null;
  }
  /**
   * <pre>
   * The currently active `SignatureHelp`.
   * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
   * the user navigating through available signatures.
   * </pre>
   *
   * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
   */
  public protocol.rpc.SignatureHelp getActiveSignatureHelp() {
    return activeSignatureHelp_ == null ? protocol.rpc.SignatureHelp.getDefaultInstance() : activeSignatureHelp_;
  }
  /**
   * <pre>
   * The currently active `SignatureHelp`.
   * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
   * the user navigating through available signatures.
   * </pre>
   *
   * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
   */
  public protocol.rpc.SignatureHelpOrBuilder getActiveSignatureHelpOrBuilder() {
    return getActiveSignatureHelp();
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
    if (triggerKind_ != protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, triggerKind_);
    }
    if (!getTriggerCharacterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, triggerCharacter_);
    }
    if (isRetrigger_ != false) {
      output.writeBool(3, isRetrigger_);
    }
    if (activeSignatureHelp_ != null) {
      output.writeMessage(4, getActiveSignatureHelp());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (triggerKind_ != protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.SIGNATURE_HELP_TRIGGER_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, triggerKind_);
    }
    if (!getTriggerCharacterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, triggerCharacter_);
    }
    if (isRetrigger_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isRetrigger_);
    }
    if (activeSignatureHelp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getActiveSignatureHelp());
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
    if (!(obj instanceof protocol.rpc.SignatureHelpContext)) {
      return super.equals(obj);
    }
    protocol.rpc.SignatureHelpContext other = (protocol.rpc.SignatureHelpContext) obj;

    boolean result = true;
    result = result && triggerKind_ == other.triggerKind_;
    result = result && getTriggerCharacter()
        .equals(other.getTriggerCharacter());
    result = result && (getIsRetrigger()
        == other.getIsRetrigger());
    result = result && (hasActiveSignatureHelp() == other.hasActiveSignatureHelp());
    if (hasActiveSignatureHelp()) {
      result = result && getActiveSignatureHelp()
          .equals(other.getActiveSignatureHelp());
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
    hash = (37 * hash) + TRIGGER_KIND_FIELD_NUMBER;
    hash = (53 * hash) + triggerKind_;
    hash = (37 * hash) + TRIGGER_CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + getTriggerCharacter().hashCode();
    hash = (37 * hash) + IS_RETRIGGER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsRetrigger());
    if (hasActiveSignatureHelp()) {
      hash = (37 * hash) + ACTIVE_SIGNATURE_HELP_FIELD_NUMBER;
      hash = (53 * hash) + getActiveSignatureHelp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.SignatureHelpContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SignatureHelpContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.SignatureHelpContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.SignatureHelpContext parseFrom(
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
  public static Builder newBuilder(protocol.rpc.SignatureHelpContext prototype) {
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
   * Additional information about the context in which a signature help request was triggered.
   * &#64;since 3.15.0
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.SignatureHelpContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.SignatureHelpContext)
      protocol.rpc.SignatureHelpContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SignatureHelpContext_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SignatureHelpContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.SignatureHelpContext.class, protocol.rpc.SignatureHelpContext.Builder.class);
    }

    // Construct using protocol.rpc.SignatureHelpContext.newBuilder()
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
      triggerKind_ = 0;

      triggerCharacter_ = "";

      isRetrigger_ = false;

      if (activeSignatureHelpBuilder_ == null) {
        activeSignatureHelp_ = null;
      } else {
        activeSignatureHelp_ = null;
        activeSignatureHelpBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_SignatureHelpContext_descriptor;
    }

    public protocol.rpc.SignatureHelpContext getDefaultInstanceForType() {
      return protocol.rpc.SignatureHelpContext.getDefaultInstance();
    }

    public protocol.rpc.SignatureHelpContext build() {
      protocol.rpc.SignatureHelpContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.SignatureHelpContext buildPartial() {
      protocol.rpc.SignatureHelpContext result = new protocol.rpc.SignatureHelpContext(this);
      result.triggerKind_ = triggerKind_;
      result.triggerCharacter_ = triggerCharacter_;
      result.isRetrigger_ = isRetrigger_;
      if (activeSignatureHelpBuilder_ == null) {
        result.activeSignatureHelp_ = activeSignatureHelp_;
      } else {
        result.activeSignatureHelp_ = activeSignatureHelpBuilder_.build();
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
      if (other instanceof protocol.rpc.SignatureHelpContext) {
        return mergeFrom((protocol.rpc.SignatureHelpContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.SignatureHelpContext other) {
      if (other == protocol.rpc.SignatureHelpContext.getDefaultInstance()) return this;
      if (other.triggerKind_ != 0) {
        setTriggerKindValue(other.getTriggerKindValue());
      }
      if (!other.getTriggerCharacter().isEmpty()) {
        triggerCharacter_ = other.triggerCharacter_;
        onChanged();
      }
      if (other.getIsRetrigger() != false) {
        setIsRetrigger(other.getIsRetrigger());
      }
      if (other.hasActiveSignatureHelp()) {
        mergeActiveSignatureHelp(other.getActiveSignatureHelp());
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
      protocol.rpc.SignatureHelpContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.SignatureHelpContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int triggerKind_ = 0;
    /**
     * <pre>
     * Action that caused signature help to be triggered.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getTriggerKindValue() {
      return triggerKind_;
    }
    /**
     * <pre>
     * Action that caused signature help to be triggered.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTriggerKindValue(int value) {
      triggerKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that caused signature help to be triggered.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind getTriggerKind() {
      protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind result = protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.valueOf(triggerKind_);
      return result == null ? protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Action that caused signature help to be triggered.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTriggerKind(protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      triggerKind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that caused signature help to be triggered.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelpContext.SignatureHelpTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTriggerKind() {
      
      triggerKind_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object triggerCharacter_ = "";
    /**
     * <pre>
     * Character that caused signature help to be triggered.
     * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>string trigger_character = 2;</code>
     */
    public java.lang.String getTriggerCharacter() {
      java.lang.Object ref = triggerCharacter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggerCharacter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Character that caused signature help to be triggered.
     * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>string trigger_character = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTriggerCharacterBytes() {
      java.lang.Object ref = triggerCharacter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        triggerCharacter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Character that caused signature help to be triggered.
     * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>string trigger_character = 2;</code>
     */
    public Builder setTriggerCharacter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      triggerCharacter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Character that caused signature help to be triggered.
     * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>string trigger_character = 2;</code>
     */
    public Builder clearTriggerCharacter() {
      
      triggerCharacter_ = getDefaultInstance().getTriggerCharacter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Character that caused signature help to be triggered.
     * This is undefined when `trigger_kind !== SignatureHelpTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>string trigger_character = 2;</code>
     */
    public Builder setTriggerCharacterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      triggerCharacter_ = value;
      onChanged();
      return this;
    }

    private boolean isRetrigger_ ;
    /**
     * <pre>
     * `true` if signature help was already showing when it was triggered.
     * Retriggers occur when the signature help is already active and can be caused by actions such as
     * typing a trigger character, a cursor move, or document content changes.
     * </pre>
     *
     * <code>bool is_retrigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public boolean getIsRetrigger() {
      return isRetrigger_;
    }
    /**
     * <pre>
     * `true` if signature help was already showing when it was triggered.
     * Retriggers occur when the signature help is already active and can be caused by actions such as
     * typing a trigger character, a cursor move, or document content changes.
     * </pre>
     *
     * <code>bool is_retrigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIsRetrigger(boolean value) {
      
      isRetrigger_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `true` if signature help was already showing when it was triggered.
     * Retriggers occur when the signature help is already active and can be caused by actions such as
     * typing a trigger character, a cursor move, or document content changes.
     * </pre>
     *
     * <code>bool is_retrigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearIsRetrigger() {
      
      isRetrigger_ = false;
      onChanged();
      return this;
    }

    private protocol.rpc.SignatureHelp activeSignatureHelp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.SignatureHelp, protocol.rpc.SignatureHelp.Builder, protocol.rpc.SignatureHelpOrBuilder> activeSignatureHelpBuilder_;
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public boolean hasActiveSignatureHelp() {
      return activeSignatureHelpBuilder_ != null || activeSignatureHelp_ != null;
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public protocol.rpc.SignatureHelp getActiveSignatureHelp() {
      if (activeSignatureHelpBuilder_ == null) {
        return activeSignatureHelp_ == null ? protocol.rpc.SignatureHelp.getDefaultInstance() : activeSignatureHelp_;
      } else {
        return activeSignatureHelpBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public Builder setActiveSignatureHelp(protocol.rpc.SignatureHelp value) {
      if (activeSignatureHelpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        activeSignatureHelp_ = value;
        onChanged();
      } else {
        activeSignatureHelpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public Builder setActiveSignatureHelp(
        protocol.rpc.SignatureHelp.Builder builderForValue) {
      if (activeSignatureHelpBuilder_ == null) {
        activeSignatureHelp_ = builderForValue.build();
        onChanged();
      } else {
        activeSignatureHelpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public Builder mergeActiveSignatureHelp(protocol.rpc.SignatureHelp value) {
      if (activeSignatureHelpBuilder_ == null) {
        if (activeSignatureHelp_ != null) {
          activeSignatureHelp_ =
            protocol.rpc.SignatureHelp.newBuilder(activeSignatureHelp_).mergeFrom(value).buildPartial();
        } else {
          activeSignatureHelp_ = value;
        }
        onChanged();
      } else {
        activeSignatureHelpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public Builder clearActiveSignatureHelp() {
      if (activeSignatureHelpBuilder_ == null) {
        activeSignatureHelp_ = null;
        onChanged();
      } else {
        activeSignatureHelp_ = null;
        activeSignatureHelpBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public protocol.rpc.SignatureHelp.Builder getActiveSignatureHelpBuilder() {
      
      onChanged();
      return getActiveSignatureHelpFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    public protocol.rpc.SignatureHelpOrBuilder getActiveSignatureHelpOrBuilder() {
      if (activeSignatureHelpBuilder_ != null) {
        return activeSignatureHelpBuilder_.getMessageOrBuilder();
      } else {
        return activeSignatureHelp_ == null ?
            protocol.rpc.SignatureHelp.getDefaultInstance() : activeSignatureHelp_;
      }
    }
    /**
     * <pre>
     * The currently active `SignatureHelp`.
     * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
     * the user navigating through available signatures.
     * </pre>
     *
     * <code>.protocol.rpc.SignatureHelp active_signature_help = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.rpc.SignatureHelp, protocol.rpc.SignatureHelp.Builder, protocol.rpc.SignatureHelpOrBuilder> 
        getActiveSignatureHelpFieldBuilder() {
      if (activeSignatureHelpBuilder_ == null) {
        activeSignatureHelpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.rpc.SignatureHelp, protocol.rpc.SignatureHelp.Builder, protocol.rpc.SignatureHelpOrBuilder>(
                getActiveSignatureHelp(),
                getParentForChildren(),
                isClean());
        activeSignatureHelp_ = null;
      }
      return activeSignatureHelpBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.SignatureHelpContext)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.SignatureHelpContext)
  private static final protocol.rpc.SignatureHelpContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.SignatureHelpContext();
  }

  public static protocol.rpc.SignatureHelpContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignatureHelpContext>
      PARSER = new com.google.protobuf.AbstractParser<SignatureHelpContext>() {
    public SignatureHelpContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignatureHelpContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SignatureHelpContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignatureHelpContext> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.SignatureHelpContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
