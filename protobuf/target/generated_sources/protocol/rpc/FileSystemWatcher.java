// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * FileSystemWatcher represents a watcher of file system.
 * </pre>
 *
 * Protobuf type {@code protocol.rpc.FileSystemWatcher}
 */
public  final class FileSystemWatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.rpc.FileSystemWatcher)
    FileSystemWatcherOrBuilder {
  // Use FileSystemWatcher.newBuilder() to construct.
  private FileSystemWatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileSystemWatcher() {
    globPattern_ = "";
    kind_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FileSystemWatcher(
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

            globPattern_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kind_ = rawValue;
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
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_FileSystemWatcher_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.rpc.RpcProto.internal_static_protocol_rpc_FileSystemWatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.rpc.FileSystemWatcher.class, protocol.rpc.FileSystemWatcher.Builder.class);
  }

  /**
   * Protobuf enum {@code protocol.rpc.FileSystemWatcher.WatchKind}
   */
  public enum WatchKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Conventional default for enums. Do not use this.
     * </pre>
     *
     * <code>WATCH_KIND_UNSPECIFIED = 0;</code>
     */
    WATCH_KIND_UNSPECIFIED(0),
    /**
     * <pre>
     * Interested in create events.
     * </pre>
     *
     * <code>CREATE = 1;</code>
     */
    CREATE(1),
    /**
     * <pre>
     * Interested in change events
     * </pre>
     *
     * <code>CHANGE = 2;</code>
     */
    CHANGE(2),
    /**
     * <pre>
     * Interested in delete events
     * </pre>
     *
     * <code>DELETE = 4;</code>
     */
    DELETE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Conventional default for enums. Do not use this.
     * </pre>
     *
     * <code>WATCH_KIND_UNSPECIFIED = 0;</code>
     */
    public static final int WATCH_KIND_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Interested in create events.
     * </pre>
     *
     * <code>CREATE = 1;</code>
     */
    public static final int CREATE_VALUE = 1;
    /**
     * <pre>
     * Interested in change events
     * </pre>
     *
     * <code>CHANGE = 2;</code>
     */
    public static final int CHANGE_VALUE = 2;
    /**
     * <pre>
     * Interested in delete events
     * </pre>
     *
     * <code>DELETE = 4;</code>
     */
    public static final int DELETE_VALUE = 4;


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
    public static WatchKind valueOf(int value) {
      return forNumber(value);
    }

    public static WatchKind forNumber(int value) {
      switch (value) {
        case 0: return WATCH_KIND_UNSPECIFIED;
        case 1: return CREATE;
        case 2: return CHANGE;
        case 4: return DELETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WatchKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WatchKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WatchKind>() {
            public WatchKind findValueByNumber(int number) {
              return WatchKind.forNumber(number);
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
      return protocol.rpc.FileSystemWatcher.getDescriptor().getEnumTypes().get(0);
    }

    private static final WatchKind[] VALUES = values();

    public static WatchKind valueOf(
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

    private WatchKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.rpc.FileSystemWatcher.WatchKind)
  }

  public static final int GLOB_PATTERN_FIELD_NUMBER = 1;
  private volatile java.lang.Object globPattern_;
  /**
   * <pre>
   * The  glob pattern to watch.
   * Glob patterns can have the following syntax:
   * - `*` to match one or more characters in a path segment
   * - `?` to match on one character in a path segment
   * - `**` to match any number of path segments, including none
   * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
   * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
   * match on `example.0`, `example.1`, ?)
   * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
   * to match on `example.a`, `example.b`, but not `example.0`)
   * </pre>
   *
   * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getGlobPattern() {
    java.lang.Object ref = globPattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      globPattern_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The  glob pattern to watch.
   * Glob patterns can have the following syntax:
   * - `*` to match one or more characters in a path segment
   * - `?` to match on one character in a path segment
   * - `**` to match any number of path segments, including none
   * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
   * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
   * match on `example.0`, `example.1`, ?)
   * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
   * to match on `example.a`, `example.b`, but not `example.0`)
   * </pre>
   *
   * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString
      getGlobPatternBytes() {
    java.lang.Object ref = globPattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      globPattern_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIND_FIELD_NUMBER = 2;
  private int kind_;
  /**
   * <pre>
   * Optional. The kind of events of interest. If omitted it defaults
   * to follows which is 7.
   *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
   * </pre>
   *
   * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public int getKindValue() {
    return kind_;
  }
  /**
   * <pre>
   * Optional. The kind of events of interest. If omitted it defaults
   * to follows which is 7.
   *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
   * </pre>
   *
   * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public protocol.rpc.FileSystemWatcher.WatchKind getKind() {
    protocol.rpc.FileSystemWatcher.WatchKind result = protocol.rpc.FileSystemWatcher.WatchKind.valueOf(kind_);
    return result == null ? protocol.rpc.FileSystemWatcher.WatchKind.UNRECOGNIZED : result;
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
    if (!getGlobPatternBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, globPattern_);
    }
    if (kind_ != protocol.rpc.FileSystemWatcher.WatchKind.WATCH_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, kind_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGlobPatternBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, globPattern_);
    }
    if (kind_ != protocol.rpc.FileSystemWatcher.WatchKind.WATCH_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kind_);
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
    if (!(obj instanceof protocol.rpc.FileSystemWatcher)) {
      return super.equals(obj);
    }
    protocol.rpc.FileSystemWatcher other = (protocol.rpc.FileSystemWatcher) obj;

    boolean result = true;
    result = result && getGlobPattern()
        .equals(other.getGlobPattern());
    result = result && kind_ == other.kind_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GLOB_PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + getGlobPattern().hashCode();
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.rpc.FileSystemWatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.FileSystemWatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.rpc.FileSystemWatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.rpc.FileSystemWatcher parseFrom(
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
  public static Builder newBuilder(protocol.rpc.FileSystemWatcher prototype) {
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
   * FileSystemWatcher represents a watcher of file system.
   * </pre>
   *
   * Protobuf type {@code protocol.rpc.FileSystemWatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.rpc.FileSystemWatcher)
      protocol.rpc.FileSystemWatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FileSystemWatcher_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FileSystemWatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.rpc.FileSystemWatcher.class, protocol.rpc.FileSystemWatcher.Builder.class);
    }

    // Construct using protocol.rpc.FileSystemWatcher.newBuilder()
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
      globPattern_ = "";

      kind_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.rpc.RpcProto.internal_static_protocol_rpc_FileSystemWatcher_descriptor;
    }

    public protocol.rpc.FileSystemWatcher getDefaultInstanceForType() {
      return protocol.rpc.FileSystemWatcher.getDefaultInstance();
    }

    public protocol.rpc.FileSystemWatcher build() {
      protocol.rpc.FileSystemWatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.rpc.FileSystemWatcher buildPartial() {
      protocol.rpc.FileSystemWatcher result = new protocol.rpc.FileSystemWatcher(this);
      result.globPattern_ = globPattern_;
      result.kind_ = kind_;
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
      if (other instanceof protocol.rpc.FileSystemWatcher) {
        return mergeFrom((protocol.rpc.FileSystemWatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.rpc.FileSystemWatcher other) {
      if (other == protocol.rpc.FileSystemWatcher.getDefaultInstance()) return this;
      if (!other.getGlobPattern().isEmpty()) {
        globPattern_ = other.globPattern_;
        onChanged();
      }
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
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
      protocol.rpc.FileSystemWatcher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.rpc.FileSystemWatcher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object globPattern_ = "";
    /**
     * <pre>
     * The  glob pattern to watch.
     * Glob patterns can have the following syntax:
     * - `*` to match one or more characters in a path segment
     * - `?` to match on one character in a path segment
     * - `**` to match any number of path segments, including none
     * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
     * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
     * match on `example.0`, `example.1`, ?)
     * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
     * to match on `example.a`, `example.b`, but not `example.0`)
     * </pre>
     *
     * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getGlobPattern() {
      java.lang.Object ref = globPattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        globPattern_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The  glob pattern to watch.
     * Glob patterns can have the following syntax:
     * - `*` to match one or more characters in a path segment
     * - `?` to match on one character in a path segment
     * - `**` to match any number of path segments, including none
     * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
     * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
     * match on `example.0`, `example.1`, ?)
     * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
     * to match on `example.a`, `example.b`, but not `example.0`)
     * </pre>
     *
     * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString
        getGlobPatternBytes() {
      java.lang.Object ref = globPattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        globPattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The  glob pattern to watch.
     * Glob patterns can have the following syntax:
     * - `*` to match one or more characters in a path segment
     * - `?` to match on one character in a path segment
     * - `**` to match any number of path segments, including none
     * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
     * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
     * match on `example.0`, `example.1`, ?)
     * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
     * to match on `example.a`, `example.b`, but not `example.0`)
     * </pre>
     *
     * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGlobPattern(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      globPattern_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The  glob pattern to watch.
     * Glob patterns can have the following syntax:
     * - `*` to match one or more characters in a path segment
     * - `?` to match on one character in a path segment
     * - `**` to match any number of path segments, including none
     * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
     * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
     * match on `example.0`, `example.1`, ?)
     * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
     * to match on `example.a`, `example.b`, but not `example.0`)
     * </pre>
     *
     * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGlobPattern() {
      
      globPattern_ = getDefaultInstance().getGlobPattern();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The  glob pattern to watch.
     * Glob patterns can have the following syntax:
     * - `*` to match one or more characters in a path segment
     * - `?` to match on one character in a path segment
     * - `**` to match any number of path segments, including none
     * - `{}` to group conditions (e.g. `**?/&#42;.{ts,js}` matches all TypeScript and JavaScript files)
     * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to
     * match on `example.0`, `example.1`, ?)
     * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]`
     * to match on `example.a`, `example.b`, but not `example.0`)
     * </pre>
     *
     * <code>string glob_pattern = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGlobPatternBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      globPattern_ = value;
      onChanged();
      return this;
    }

    private int kind_ = 0;
    /**
     * <pre>
     * Optional. The kind of events of interest. If omitted it defaults
     * to follows which is 7.
     *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
     * </pre>
     *
     * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public int getKindValue() {
      return kind_;
    }
    /**
     * <pre>
     * Optional. The kind of events of interest. If omitted it defaults
     * to follows which is 7.
     *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
     * </pre>
     *
     * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The kind of events of interest. If omitted it defaults
     * to follows which is 7.
     *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
     * </pre>
     *
     * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public protocol.rpc.FileSystemWatcher.WatchKind getKind() {
      protocol.rpc.FileSystemWatcher.WatchKind result = protocol.rpc.FileSystemWatcher.WatchKind.valueOf(kind_);
      return result == null ? protocol.rpc.FileSystemWatcher.WatchKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. The kind of events of interest. If omitted it defaults
     * to follows which is 7.
     *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
     * </pre>
     *
     * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setKind(protocol.rpc.FileSystemWatcher.WatchKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The kind of events of interest. If omitted it defaults
     * to follows which is 7.
     *  WatchKind.CREATE | WatchKind.CHANGE | WatchKind.DELETE
     * </pre>
     *
     * <code>.protocol.rpc.FileSystemWatcher.WatchKind kind = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearKind() {
      
      kind_ = 0;
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


    // @@protoc_insertion_point(builder_scope:protocol.rpc.FileSystemWatcher)
  }

  // @@protoc_insertion_point(class_scope:protocol.rpc.FileSystemWatcher)
  private static final protocol.rpc.FileSystemWatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.rpc.FileSystemWatcher();
  }

  public static protocol.rpc.FileSystemWatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileSystemWatcher>
      PARSER = new com.google.protobuf.AbstractParser<FileSystemWatcher>() {
    public FileSystemWatcher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileSystemWatcher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileSystemWatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileSystemWatcher> getParserForType() {
    return PARSER;
  }

  public protocol.rpc.FileSystemWatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

