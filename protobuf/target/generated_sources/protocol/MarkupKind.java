// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * MarkupKind describes the content type that a client supports in various
 * result literals like `Hover`, `ParameterInfo` or `CompletionItem`.
 * Please note that `MarkupKinds` must not start with a `$`. This kinds
 * are reserved for internal usage.
 * </pre>
 *
 * Protobuf enum {@code protocol.MarkupKind}
 */
public enum MarkupKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>MARKUP_KIND_UNSPECIFIED = 0;</code>
   */
  MARKUP_KIND_UNSPECIFIED(0),
  /**
   * <pre>
   * Plain text is supported as a content format
   * </pre>
   *
   * <code>PLAIN_TEXT = 1;</code>
   */
  PLAIN_TEXT(1),
  /**
   * <pre>
   * Markdown is supported as a content format
   * </pre>
   *
   * <code>MARKDOWN = 2;</code>
   */
  MARKDOWN(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>MARKUP_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int MARKUP_KIND_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Plain text is supported as a content format
   * </pre>
   *
   * <code>PLAIN_TEXT = 1;</code>
   */
  public static final int PLAIN_TEXT_VALUE = 1;
  /**
   * <pre>
   * Markdown is supported as a content format
   * </pre>
   *
   * <code>MARKDOWN = 2;</code>
   */
  public static final int MARKDOWN_VALUE = 2;


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
  public static MarkupKind valueOf(int value) {
    return forNumber(value);
  }

  public static MarkupKind forNumber(int value) {
    switch (value) {
      case 0: return MARKUP_KIND_UNSPECIFIED;
      case 1: return PLAIN_TEXT;
      case 2: return MARKDOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MarkupKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MarkupKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MarkupKind>() {
          public MarkupKind findValueByNumber(int number) {
            return MarkupKind.forNumber(number);
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
    return protocol.ProtocolProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final MarkupKind[] VALUES = values();

  public static MarkupKind valueOf(
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

  private MarkupKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.MarkupKind)
}
