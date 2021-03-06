// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CompletionItemTag completion item tags are extra annotations that tweak the rendering of a
 * completion item.
 * &#64;since 3.15.0
 * </pre>
 *
 * Protobuf enum {@code protocol.rpc.CompletionItemTag}
 */
public enum CompletionItemTag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>COMPLETION_ITEM_TAG_UNSPECIFIED = 0;</code>
   */
  COMPLETION_ITEM_TAG_UNSPECIFIED(0),
  /**
   * <pre>
   * Render a completion as obsolete, usually using a strike-out.
   * </pre>
   *
   * <code>DEPRECATED_TAG = 1;</code>
   */
  DEPRECATED_TAG(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>COMPLETION_ITEM_TAG_UNSPECIFIED = 0;</code>
   */
  public static final int COMPLETION_ITEM_TAG_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Render a completion as obsolete, usually using a strike-out.
   * </pre>
   *
   * <code>DEPRECATED_TAG = 1;</code>
   */
  public static final int DEPRECATED_TAG_VALUE = 1;


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
  public static CompletionItemTag valueOf(int value) {
    return forNumber(value);
  }

  public static CompletionItemTag forNumber(int value) {
    switch (value) {
      case 0: return COMPLETION_ITEM_TAG_UNSPECIFIED;
      case 1: return DEPRECATED_TAG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompletionItemTag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CompletionItemTag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CompletionItemTag>() {
          public CompletionItemTag findValueByNumber(int number) {
            return CompletionItemTag.forNumber(number);
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
    return protocol.rpc.RpcProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final CompletionItemTag[] VALUES = values();

  public static CompletionItemTag valueOf(
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

  private CompletionItemTag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.rpc.CompletionItemTag)
}

