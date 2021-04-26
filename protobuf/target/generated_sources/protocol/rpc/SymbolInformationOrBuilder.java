// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface SymbolInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.SymbolInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this symbol.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this symbol.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The kind of this symbol.
   * </pre>
   *
   * <code>.protocol.rpc.SymbolKind kind = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getKindValue();
  /**
   * <pre>
   * The kind of this symbol.
   * </pre>
   *
   * <code>.protocol.rpc.SymbolKind kind = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.SymbolKind getKind();

  /**
   * <pre>
   * Optional. Indicates if this symbol is deprecated.
   * </pre>
   *
   * <code>bool deprecated = 3;</code>
   */
  boolean getDeprecated();

  /**
   * <pre>
   * The location of this symbol. The location's range is used by a tool
   * to reveal the location in the editor. If the symbol is selected in the
   * tool the range's start information is used to position the cursor. So
   * the range usually spans more then the actual symbol's name and does
   * normally include things like visibility modifiers.
   * The range doesn't have to denote a node range in the sense of a abstract
   * syntax tree. It can therefore not be used to re-construct a hierarchy of
   * the symbols.
   * </pre>
   *
   * <code>.protocol.Location location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location of this symbol. The location's range is used by a tool
   * to reveal the location in the editor. If the symbol is selected in the
   * tool the range's start information is used to position the cursor. So
   * the range usually spans more then the actual symbol's name and does
   * normally include things like visibility modifiers.
   * The range doesn't have to denote a node range in the sense of a abstract
   * syntax tree. It can therefore not be used to re-construct a hierarchy of
   * the symbols.
   * </pre>
   *
   * <code>.protocol.Location location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Location getLocation();
  /**
   * <pre>
   * The location of this symbol. The location's range is used by a tool
   * to reveal the location in the editor. If the symbol is selected in the
   * tool the range's start information is used to position the cursor. So
   * the range usually spans more then the actual symbol's name and does
   * normally include things like visibility modifiers.
   * The range doesn't have to denote a node range in the sense of a abstract
   * syntax tree. It can therefore not be used to re-construct a hierarchy of
   * the symbols.
   * </pre>
   *
   * <code>.protocol.Location location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Optional. The name of the symbol containing this symbol. This information is for
   * user interface purposes (e.g. to render a qualifier in the user interface
   * if necessary). It can't be used to re-infer a hierarchy for the document
   * symbols.
   * (-- api-linter: core::0123::resource-annotation=disabled
   *     api-linter: core::0122::name-suffix=disabled --)
   * </pre>
   *
   * <code>string container_name = 5;</code>
   */
  java.lang.String getContainerName();
  /**
   * <pre>
   * Optional. The name of the symbol containing this symbol. This information is for
   * user interface purposes (e.g. to render a qualifier in the user interface
   * if necessary). It can't be used to re-infer a hierarchy for the document
   * symbols.
   * (-- api-linter: core::0123::resource-annotation=disabled
   *     api-linter: core::0122::name-suffix=disabled --)
   * </pre>
   *
   * <code>string container_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getContainerNameBytes();
}
