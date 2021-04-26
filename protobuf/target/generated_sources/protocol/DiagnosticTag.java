// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * DiagnosticTag is the diagnostic tags.
 * &#64;since 3.15.0
 * </pre>
 *
 * Protobuf enum {@code protocol.DiagnosticTag}
 */
public enum DiagnosticTag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>DIAGNOSTIC_TAG_UNSPECIFIED = 0;</code>
   */
  DIAGNOSTIC_TAG_UNSPECIFIED(0),
  /**
   * <pre>
   * Unused or unnecessary code.
   * Clients are allowed to render diagnostics with this tag faded out instead of having
   * an error squiggle.
   * </pre>
   *
   * <code>UNNECESSARY = 1;</code>
   */
  UNNECESSARY(1),
  /**
   * <pre>
   * Deprecated or obsolete code.
   * Clients are allowed to rendered diagnostics with this tag strike through.
   * </pre>
   *
   * <code>DEPRECATED = 2;</code>
   */
  DEPRECATED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>DIAGNOSTIC_TAG_UNSPECIFIED = 0;</code>
   */
  public static final int DIAGNOSTIC_TAG_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Unused or unnecessary code.
   * Clients are allowed to render diagnostics with this tag faded out instead of having
   * an error squiggle.
   * </pre>
   *
   * <code>UNNECESSARY = 1;</code>
   */
  public static final int UNNECESSARY_VALUE = 1;
  /**
   * <pre>
   * Deprecated or obsolete code.
   * Clients are allowed to rendered diagnostics with this tag strike through.
   * </pre>
   *
   * <code>DEPRECATED = 2;</code>
   */
  public static final int DEPRECATED_VALUE = 2;


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
  public static DiagnosticTag valueOf(int value) {
    return forNumber(value);
  }

  public static DiagnosticTag forNumber(int value) {
    switch (value) {
      case 0: return DIAGNOSTIC_TAG_UNSPECIFIED;
      case 1: return UNNECESSARY;
      case 2: return DEPRECATED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiagnosticTag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiagnosticTag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiagnosticTag>() {
          public DiagnosticTag findValueByNumber(int number) {
            return DiagnosticTag.forNumber(number);
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
    return protocol.ProtocolProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DiagnosticTag[] VALUES = values();

  public static DiagnosticTag valueOf(
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

  private DiagnosticTag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.DiagnosticTag)
}

