// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CompletionContext contains additional information about the context in which a completion request
 * is triggered.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.CompletionContext}
 */
public  final class CompletionContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.CompletionContext)
    CompletionContextOrBuilder {
  // Use CompletionContext.newBuilder() to construct.
  private CompletionContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompletionContext() {
    triggerKind_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CompletionContext(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (triggerCharacter_ != null) {
              subBuilder = triggerCharacter_.toBuilder();
            }
            triggerCharacter_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(triggerCharacter_);
              triggerCharacter_ = subBuilder.buildPartial();
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionContext_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.CompletionContext.class, protocol.rpc.CompletionContext.Builder.class);
  }

  public static final int TRIGGER_KIND_FIELD_NUMBER = 1;
  private int triggerKind_;
  /**
   * <pre>
   * How the completion was triggered.
   * </pre>
   *
   * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public int getTriggerKindValue() {
    return triggerKind_;
  }
  /**
   * <pre>
   * How the completion was triggered.
   * </pre>
   *
   * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public protocol.rpc.CompletionTriggerKind getTriggerKind() {
    protocol.rpc.CompletionTriggerKind result = protocol.rpc.CompletionTriggerKind.valueOf(triggerKind_);
    return result == null ? protocol.rpc.CompletionTriggerKind.UNRECOGNIZED : result;
  }

  public static final int TRIGGER_CHARACTER_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue triggerCharacter_;
  /**
   * <pre>
   * The trigger character (a single character) that has trigger code complete.
   * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
   * </pre>
   *
   * <code>.google.protobuf.StringValue trigger_character = 2;</code>
   */
  public boolean hasTriggerCharacter() {
    return triggerCharacter_ != null;
  }
  /**
   * <pre>
   * The trigger character (a single character) that has trigger code complete.
   * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
   * </pre>
   *
   * <code>.google.protobuf.StringValue trigger_character = 2;</code>
   */
  public com.google.protobuf.StringValue getTriggerCharacter() {
    return triggerCharacter_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : triggerCharacter_;
  }
  /**
   * <pre>
   * The trigger character (a single character) that has trigger code complete.
   * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
   * </pre>
   *
   * <code>.google.protobuf.StringValue trigger_character = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getTriggerCharacterOrBuilder() {
    return getTriggerCharacter();
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
    if (triggerKind_ != protocol.rpc.CompletionTriggerKind.COMPLETION_TRIGGER_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, triggerKind_);
    }
    if (triggerCharacter_ != null) {
      output.writeMessage(2, getTriggerCharacter());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (triggerKind_ != protocol.rpc.CompletionTriggerKind.COMPLETION_TRIGGER_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, triggerKind_);
    }
    if (triggerCharacter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTriggerCharacter());
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
    if (!(obj instanceof protocol.rpc.CompletionContext)) {
      return super.equals(obj);
    }
    protocol.rpc.CompletionContext other = (protocol.rpc.CompletionContext) obj;

    boolean result = true;
    result = result && triggerKind_ == other.triggerKind_;
    result = result && (hasTriggerCharacter() == other.hasTriggerCharacter());
    if (hasTriggerCharacter()) {
      result = result && getTriggerCharacter()
          .equals(other.getTriggerCharacter());
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
    if (hasTriggerCharacter()) {
      hash = (37 * hash) + TRIGGER_CHARACTER_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerCharacter().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.CompletionContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CompletionContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CompletionContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.CompletionContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.CompletionContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CompletionContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.CompletionContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.CompletionContext parseFrom(
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
  public static Builder newBuilder(protocol.rpc.CompletionContext prototype) {
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
   * CompletionContext contains additional information about the context in which a completion request
   * is triggered.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.CompletionContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.CompletionContext)
      protocol.rpc.CompletionContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionContext_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.CompletionContext.class, protocol.rpc.CompletionContext.Builder.class);
    }

    // Construct using protocol.rpc.CompletionContext.newBuilder()
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

      if (triggerCharacterBuilder_ == null) {
        triggerCharacter_ = null;
      } else {
        triggerCharacter_ = null;
        triggerCharacterBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_CompletionContext_descriptor;
    }

    public protocol.rpc.CompletionContext getDefaultInstanceForType() {
      return protocol.rpc.CompletionContext.getDefaultInstance();
    }

    public protocol.rpc.CompletionContext build() {
      protocol.rpc.CompletionContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.CompletionContext buildPartial() {
      protocol.rpc.CompletionContext result = new protocol.rpc.CompletionContext(this);
      result.triggerKind_ = triggerKind_;
      if (triggerCharacterBuilder_ == null) {
        result.triggerCharacter_ = triggerCharacter_;
      } else {
        result.triggerCharacter_ = triggerCharacterBuilder_.build();
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
      if (other instanceof protocol.rpc.CompletionContext) {
        return mergeFrom((protocol.rpc.CompletionContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.CompletionContext other) {
      if (other == protocol.rpc.CompletionContext.getDefaultInstance()) return this;
      if (other.triggerKind_ != 0) {
        setTriggerKindValue(other.getTriggerKindValue());
      }
      if (other.hasTriggerCharacter()) {
        mergeTriggerCharacter(other.getTriggerCharacter());
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
      protocol.rpc.CompletionContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.CompletionContext) e.getUnfinishedMessage();
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
     * How the completion was triggered.
     * </pre>
     *
     * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getTriggerKindValue() {
      return triggerKind_;
    }
    /**
     * <pre>
     * How the completion was triggered.
     * </pre>
     *
     * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTriggerKindValue(int value) {
      triggerKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How the completion was triggered.
     * </pre>
     *
     * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public protocol.rpc.CompletionTriggerKind getTriggerKind() {
      protocol.rpc.CompletionTriggerKind result = protocol.rpc.CompletionTriggerKind.valueOf(triggerKind_);
      return result == null ? protocol.rpc.CompletionTriggerKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * How the completion was triggered.
     * </pre>
     *
     * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTriggerKind(protocol.rpc.CompletionTriggerKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      triggerKind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How the completion was triggered.
     * </pre>
     *
     * <code>.protocol.rpc.CompletionTriggerKind trigger_kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTriggerKind() {
      
      triggerKind_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue triggerCharacter_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> triggerCharacterBuilder_;
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public boolean hasTriggerCharacter() {
      return triggerCharacterBuilder_ != null || triggerCharacter_ != null;
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public com.google.protobuf.StringValue getTriggerCharacter() {
      if (triggerCharacterBuilder_ == null) {
        return triggerCharacter_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : triggerCharacter_;
      } else {
        return triggerCharacterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public Builder setTriggerCharacter(com.google.protobuf.StringValue value) {
      if (triggerCharacterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        triggerCharacter_ = value;
        onChanged();
      } else {
        triggerCharacterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public Builder setTriggerCharacter(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (triggerCharacterBuilder_ == null) {
        triggerCharacter_ = builderForValue.build();
        onChanged();
      } else {
        triggerCharacterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public Builder mergeTriggerCharacter(com.google.protobuf.StringValue value) {
      if (triggerCharacterBuilder_ == null) {
        if (triggerCharacter_ != null) {
          triggerCharacter_ =
            com.google.protobuf.StringValue.newBuilder(triggerCharacter_).mergeFrom(value).buildPartial();
        } else {
          triggerCharacter_ = value;
        }
        onChanged();
      } else {
        triggerCharacterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public Builder clearTriggerCharacter() {
      if (triggerCharacterBuilder_ == null) {
        triggerCharacter_ = null;
        onChanged();
      } else {
        triggerCharacter_ = null;
        triggerCharacterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getTriggerCharacterBuilder() {
      
      onChanged();
      return getTriggerCharacterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTriggerCharacterOrBuilder() {
      if (triggerCharacterBuilder_ != null) {
        return triggerCharacterBuilder_.getMessageOrBuilder();
      } else {
        return triggerCharacter_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : triggerCharacter_;
      }
    }
    /**
     * <pre>
     * The trigger character (a single character) that has trigger code complete.
     * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
     * </pre>
     *
     * <code>.google.protobuf.StringValue trigger_character = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTriggerCharacterFieldBuilder() {
      if (triggerCharacterBuilder_ == null) {
        triggerCharacterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getTriggerCharacter(),
                getParentForChildren(),
                isClean());
        triggerCharacter_ = null;
      }
      return triggerCharacterBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.rpc.CompletionContext)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.CompletionContext)
  private static final protocol.rpc.CompletionContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.CompletionContext();
  }

  public static protocol.rpc.CompletionContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompletionContext>
      PARSER = new com.google.protobuf.AbstractParser<CompletionContext>() {
    public CompletionContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompletionContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompletionContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompletionContext> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.CompletionContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

