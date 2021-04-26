// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

/**
 * <pre>
 * FoldingRangeKind Enum of known range kinds.
 * </pre>
 *
 * Protobuf enum {@code protocol.rpc.FoldingRangeKind}
 */
public enum FoldingRangeKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>FOLDING_RANGE_KIND_UNSPECIFIED = 0;</code>
   */
  FOLDING_RANGE_KIND_UNSPECIFIED(0),
  /**
   * <pre>
   * Folding range for a comment.
   * string: 'comment'
   * </pre>
   *
   * <code>COMMENT_RANGE = 1;</code>
   */
  COMMENT_RANGE(1),
  /**
   * <pre>
   * Folding range for a imports or includes.
   * string: 'imports'
   * </pre>
   *
   * <code>IMPORTS_RANGE = 2;</code>
   */
  IMPORTS_RANGE(2),
  /**
   * <pre>
   * Folding range for a region (e.g. `#region`).
   * string: 'region'
   * </pre>
   *
   * <code>REGION_RANGE = 3;</code>
   */
  REGION_RANGE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conventional default for enums. Do not use this.
   * </pre>
   *
   * <code>FOLDING_RANGE_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int FOLDING_RANGE_KIND_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Folding range for a comment.
   * string: 'comment'
   * </pre>
   *
   * <code>COMMENT_RANGE = 1;</code>
   */
  public static final int COMMENT_RANGE_VALUE = 1;
  /**
   * <pre>
   * Folding range for a imports or includes.
   * string: 'imports'
   * </pre>
   *
   * <code>IMPORTS_RANGE = 2;</code>
   */
  public static final int IMPORTS_RANGE_VALUE = 2;
  /**
   * <pre>
   * Folding range for a region (e.g. `#region`).
   * string: 'region'
   * </pre>
   *
   * <code>REGION_RANGE = 3;</code>
   */
  public static final int REGION_RANGE_VALUE = 3;


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
  public static FoldingRangeKind valueOf(int value) {
    return forNumber(value);
  }

  public static FoldingRangeKind forNumber(int value) {
    switch (value) {
      case 0: return FOLDING_RANGE_KIND_UNSPECIFIED;
      case 1: return COMMENT_RANGE;
      case 2: return IMPORTS_RANGE;
      case 3: return REGION_RANGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FoldingRangeKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FoldingRangeKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FoldingRangeKind>() {
          public FoldingRangeKind findValueByNumber(int number) {
            return FoldingRangeKind.forNumber(number);
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
    return protocol.rpc.RpcProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final FoldingRangeKind[] VALUES = values();

  public static FoldingRangeKind valueOf(
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

  private FoldingRangeKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protocol.rpc.FoldingRangeKind)
}
