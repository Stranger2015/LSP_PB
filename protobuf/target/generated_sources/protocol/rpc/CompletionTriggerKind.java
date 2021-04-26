// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * CompletionTriggerKind how a completion was triggered.
 * </pre>
 *
 * Protobuf enum {@code protocol.rpc.CompletionTriggerKind}
 */
public enum CompletionTriggerKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>COMPLETION_TRIGGER_KIND_UNSPECIFIED = 0;</code>
   */
  COMPLETION_TRIGGER_KIND_UNSPECIFIED(0),
  /**
   * <pre>
   * Completion was triggered by typing an identifier (24x7 code
   * complete), manual invocation (e.g Ctrl+Space) or via API.
   * </pre>
   *
   * <code>INVOKED = 1;</code>
   */
  INVOKED(1),
  /**
   * <pre>
   * Completion was triggered by a trigger character specified by
   * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
   * </pre>
   *
   * <code>TRIGGER_CHARACTER = 2;</code>
   */
  TRIGGER_CHARACTER(2),
  /**
   * <pre>
   * Completion was re-triggered as the current completion list is incomplete.
   * </pre>
   *
   * <code>TRIGGER_FOR_INCOMPLETE_COMPLETIONS = 3;</code>
   */
  TRIGGER_FOR_INCOMPLETE_COMPLETIONS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>COMPLETION_TRIGGER_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int COMPLETION_TRIGGER_KIND_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Completion was triggered by typing an identifier (24x7 code
   * complete), manual invocation (e.g Ctrl+Space) or via API.
   * </pre>
   *
   * <code>INVOKED = 1;</code>
   */
  public static final int INVOKED_VALUE = 1;
  /**
   * <pre>
   * Completion was triggered by a trigger character specified by
   * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
   * </pre>
   *
   * <code>TRIGGER_CHARACTER = 2;</code>
   */
  public static final int TRIGGER_CHARACTER_VALUE = 2;
  /**
   * <pre>
   * Completion was re-triggered as the current completion list is incomplete.
   * </pre>
   *
   * <code>TRIGGER_FOR_INCOMPLETE_COMPLETIONS = 3;</code>
   */
  public static final int TRIGGER_FOR_INCOMPLETE_COMPLETIONS_VALUE = 3;


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
  public static CompletionTriggerKind valueOf(int value) {
    return forNumber(value);
  }

  public static CompletionTriggerKind forNumber(int value) {
    switch (value) {
      case 0: return COMPLETION_TRIGGER_KIND_UNSPECIFIED;
      case 1: return INVOKED;
      case 2: return TRIGGER_CHARACTER;
      case 3: return TRIGGER_FOR_INCOMPLETE_COMPLETIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompletionTriggerKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CompletionTriggerKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CompletionTriggerKind>() {
          public CompletionTriggerKind findValueByNumber(int number) {
            return CompletionTriggerKind.forNumber(number);
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
    return protocol.rpc.RpcProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final CompletionTriggerKind[] VALUES = values();

  public static CompletionTriggerKind valueOf(
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

  private CompletionTriggerKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.rpc.CompletionTriggerKind)
}

