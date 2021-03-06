// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * DiagnosticSeverity represents a diagnostic severity level.
 * </pre>
 *
 * Protobuf enum {@code protocol.DiagnosticSeverity}
 */
public enum DiagnosticSeverity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>DIAGNOSTIC_SEVERITY_UNSPECIFIED = 0;</code>
   */
  DIAGNOSTIC_SEVERITY_UNSPECIFIED(0),
  /**
   * <pre>
   * Reports an error.
   * </pre>
   *
   * <code>ERROR = 1;</code>
   */
  ERROR(1),
  /**
   * <pre>
   * Reports a warning.
   * </pre>
   *
   * <code>WARNING = 2;</code>
   */
  WARNING(2),
  /**
   * <pre>
   * Reports an information.
   * (-- api-linter: core::0140::abbreviations=disabled --)
   * </pre>
   *
   * <code>INFORMATION = 3;</code>
   */
  INFORMATION(3),
  /**
   * <pre>
   * Reports a hint.
   * </pre>
   *
   * <code>HINT = 4;</code>
   */
  HINT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>DIAGNOSTIC_SEVERITY_UNSPECIFIED = 0;</code>
   */
  public static final int DIAGNOSTIC_SEVERITY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Reports an error.
   * </pre>
   *
   * <code>ERROR = 1;</code>
   */
  public static final int ERROR_VALUE = 1;
  /**
   * <pre>
   * Reports a warning.
   * </pre>
   *
   * <code>WARNING = 2;</code>
   */
  public static final int WARNING_VALUE = 2;
  /**
   * <pre>
   * Reports an information.
   * (-- api-linter: core::0140::abbreviations=disabled --)
   * </pre>
   *
   * <code>INFORMATION = 3;</code>
   */
  public static final int INFORMATION_VALUE = 3;
  /**
   * <pre>
   * Reports a hint.
   * </pre>
   *
   * <code>HINT = 4;</code>
   */
  public static final int HINT_VALUE = 4;


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
  public static DiagnosticSeverity valueOf(int value) {
    return forNumber(value);
  }

  public static DiagnosticSeverity forNumber(int value) {
    switch (value) {
      case 0: return DIAGNOSTIC_SEVERITY_UNSPECIFIED;
      case 1: return ERROR;
      case 2: return WARNING;
      case 3: return INFORMATION;
      case 4: return HINT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiagnosticSeverity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiagnosticSeverity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiagnosticSeverity>() {
          public DiagnosticSeverity findValueByNumber(int number) {
            return DiagnosticSeverity.forNumber(number);
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
    return protocol.ProtocolProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DiagnosticSeverity[] VALUES = values();

  public static DiagnosticSeverity valueOf(
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

  private DiagnosticSeverity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.DiagnosticSeverity)
}

