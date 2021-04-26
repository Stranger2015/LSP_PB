// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * WorkDoneProgressReport reporting progress is done using the payload.
 * </pre>
 *
 * Protobuf type {@code protocol.WorkDoneProgressReport}
 */
public  final class WorkDoneProgressReport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.WorkDoneProgressReport)
    WorkDoneProgressReportOrBuilder {
  // Use WorkDoneProgressReport.newBuilder() to construct.
  private WorkDoneProgressReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkDoneProgressReport() {
    kind_ = "";
    cancellable_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private WorkDoneProgressReport(
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
          case 16: {

            cancellable_ = input.readBool();
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (percentage_ != null) {
              subBuilder = percentage_.toBuilder();
            }
            percentage_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(percentage_);
              percentage_ = subBuilder.buildPartial();
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
    return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressReport_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.WorkDoneProgressReport.class, protocol.WorkDoneProgressReport.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private volatile java.lang.Object kind_;
  /**
   * <pre>
   * WorkDoneProgressReport kind.
   * always 'report'
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
   * WorkDoneProgressReport kind.
   * always 'report'
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

  public static final int CANCELLABLE_FIELD_NUMBER = 2;
  private boolean cancellable_;
  /**
   * <pre>
   * Optional. Controls enablement state of a cancel button. This property is only valid if a cancel
   * button got requested in the `WorkDoneProgressStart` payload.
   * Clients that don't support cancellation or don't support control the button's
   * enablement state are allowed to ignore the setting.
   * </pre>
   *
   * <code>bool cancellable = 2;</code>
   */
  public boolean getCancellable() {
    return cancellable_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue message_;
  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  public com.google.protobuf.StringValue getMessage() {
    return message_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  public static final int PERCENTAGE_FIELD_NUMBER = 4;
  private com.google.protobuf.Int32Value percentage_;
  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  public boolean hasPercentage() {
    return percentage_ != null;
  }
  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  public com.google.protobuf.Int32Value getPercentage() {
    return percentage_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : percentage_;
  }
  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getPercentageOrBuilder() {
    return getPercentage();
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
    if (cancellable_ != false) {
      output.writeBool(2, cancellable_);
    }
    if (message_ != null) {
      output.writeMessage(3, getMessage());
    }
    if (percentage_ != null) {
      output.writeMessage(4, getPercentage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (cancellable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cancellable_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMessage());
    }
    if (percentage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPercentage());
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
    if (!(obj instanceof protocol.WorkDoneProgressReport)) {
      return super.equals(obj);
    }
    protocol.WorkDoneProgressReport other = (protocol.WorkDoneProgressReport) obj;

    boolean result = true;
    result = result && getKind()
        .equals(other.getKind());
    result = result && (getCancellable()
        == other.getCancellable());
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && (hasPercentage() == other.hasPercentage());
    if (hasPercentage()) {
      result = result && getPercentage()
          .equals(other.getPercentage());
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
    hash = (37 * hash) + CANCELLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCancellable());
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasPercentage()) {
      hash = (37 * hash) + PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPercentage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.WorkDoneProgressReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkDoneProgressReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkDoneProgressReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.WorkDoneProgressReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.WorkDoneProgressReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkDoneProgressReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.WorkDoneProgressReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.WorkDoneProgressReport parseFrom(
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
  public static Builder newBuilder(protocol.WorkDoneProgressReport prototype) {
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
   * WorkDoneProgressReport reporting progress is done using the payload.
   * </pre>
   *
   * Protobuf type {@code protocol.WorkDoneProgressReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.WorkDoneProgressReport)
      protocol.WorkDoneProgressReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressReport_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.WorkDoneProgressReport.class, protocol.WorkDoneProgressReport.Builder.class);
    }

    // Construct using protocol.WorkDoneProgressReport.newBuilder()
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

      cancellable_ = false;

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      if (percentageBuilder_ == null) {
        percentage_ = null;
      } else {
        percentage_ = null;
        percentageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_WorkDoneProgressReport_descriptor;
    }

    public protocol.WorkDoneProgressReport getDefaultInstanceForType() {
      return protocol.WorkDoneProgressReport.getDefaultInstance();
    }

    public protocol.WorkDoneProgressReport build() {
      protocol.WorkDoneProgressReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.WorkDoneProgressReport buildPartial() {
      protocol.WorkDoneProgressReport result = new protocol.WorkDoneProgressReport(this);
      result.kind_ = kind_;
      result.cancellable_ = cancellable_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      if (percentageBuilder_ == null) {
        result.percentage_ = percentage_;
      } else {
        result.percentage_ = percentageBuilder_.build();
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
      if (other instanceof protocol.WorkDoneProgressReport) {
        return mergeFrom((protocol.WorkDoneProgressReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.WorkDoneProgressReport other) {
      if (other == protocol.WorkDoneProgressReport.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        onChanged();
      }
      if (other.getCancellable() != false) {
        setCancellable(other.getCancellable());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.hasPercentage()) {
        mergePercentage(other.getPercentage());
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
      protocol.WorkDoneProgressReport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.WorkDoneProgressReport) e.getUnfinishedMessage();
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
     * WorkDoneProgressReport kind.
     * always 'report'
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
     * WorkDoneProgressReport kind.
     * always 'report'
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
     * WorkDoneProgressReport kind.
     * always 'report'
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
     * WorkDoneProgressReport kind.
     * always 'report'
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
     * WorkDoneProgressReport kind.
     * always 'report'
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

    private boolean cancellable_ ;
    /**
     * <pre>
     * Optional. Controls enablement state of a cancel button. This property is only valid if a cancel
     * button got requested in the `WorkDoneProgressStart` payload.
     * Clients that don't support cancellation or don't support control the button's
     * enablement state are allowed to ignore the setting.
     * </pre>
     *
     * <code>bool cancellable = 2;</code>
     */
    public boolean getCancellable() {
      return cancellable_;
    }
    /**
     * <pre>
     * Optional. Controls enablement state of a cancel button. This property is only valid if a cancel
     * button got requested in the `WorkDoneProgressStart` payload.
     * Clients that don't support cancellation or don't support control the button's
     * enablement state are allowed to ignore the setting.
     * </pre>
     *
     * <code>bool cancellable = 2;</code>
     */
    public Builder setCancellable(boolean value) {
      
      cancellable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Controls enablement state of a cancel button. This property is only valid if a cancel
     * button got requested in the `WorkDoneProgressStart` payload.
     * Clients that don't support cancellation or don't support control the button's
     * enablement state are allowed to ignore the setting.
     * </pre>
     *
     * <code>bool cancellable = 2;</code>
     */
    public Builder clearCancellable() {
      
      cancellable_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> messageBuilder_;
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public com.google.protobuf.StringValue getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public Builder setMessage(com.google.protobuf.StringValue value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public Builder setMessage(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public Builder mergeMessage(com.google.protobuf.StringValue value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.google.protobuf.StringValue.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * Optional, more detailed associated progress message. Contains
     * complementary information to the `title`.
     * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
     * If unset, the previous progress message (if any) is still valid.
     * </pre>
     *
     * <code>.google.protobuf.StringValue message = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private com.google.protobuf.Int32Value percentage_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> percentageBuilder_;
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public boolean hasPercentage() {
      return percentageBuilder_ != null || percentage_ != null;
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public com.google.protobuf.Int32Value getPercentage() {
      if (percentageBuilder_ == null) {
        return percentage_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : percentage_;
      } else {
        return percentageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public Builder setPercentage(com.google.protobuf.Int32Value value) {
      if (percentageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        percentage_ = value;
        onChanged();
      } else {
        percentageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public Builder setPercentage(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (percentageBuilder_ == null) {
        percentage_ = builderForValue.build();
        onChanged();
      } else {
        percentageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public Builder mergePercentage(com.google.protobuf.Int32Value value) {
      if (percentageBuilder_ == null) {
        if (percentage_ != null) {
          percentage_ =
            com.google.protobuf.Int32Value.newBuilder(percentage_).mergeFrom(value).buildPartial();
        } else {
          percentage_ = value;
        }
        onChanged();
      } else {
        percentageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public Builder clearPercentage() {
      if (percentageBuilder_ == null) {
        percentage_ = null;
        onChanged();
      } else {
        percentage_ = null;
        percentageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public com.google.protobuf.Int32Value.Builder getPercentageBuilder() {
      
      onChanged();
      return getPercentageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getPercentageOrBuilder() {
      if (percentageBuilder_ != null) {
        return percentageBuilder_.getMessageOrBuilder();
      } else {
        return percentage_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : percentage_;
      }
    }
    /**
     * <pre>
     * Optional progress percentage to display (value 100 is considered 100%).
     * If not provided infinite progress is assumed and clients are allowed
     * to ignore the `percentage` value in subsequent in report notifications.
     * The value should be steadily rising. Clients are free to ignore values
     * that are not following this rule.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value percentage = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getPercentageFieldBuilder() {
      if (percentageBuilder_ == null) {
        percentageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getPercentage(),
                getParentForChildren(),
                isClean());
        percentage_ = null;
      }
      return percentageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.WorkDoneProgressReport)
  }

  // @@protoc_insertion_point(class_scope:protocol.WorkDoneProgressReport)
  private static final protocol.WorkDoneProgressReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.WorkDoneProgressReport();
  }

  public static protocol.WorkDoneProgressReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkDoneProgressReport>
      PARSER = new com.google.protobuf.AbstractParser<WorkDoneProgressReport>() {
    public WorkDoneProgressReport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorkDoneProgressReport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkDoneProgressReport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkDoneProgressReport> getParserForType() {
    return PARSER;
  }

  public protocol.WorkDoneProgressReport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

