// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface DocumentSymbolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.DocumentSymbol)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this symbol. Will be displayed in the user interface and therefore must not be
   * an empty string or a string only consisting of white spaces.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this symbol. Will be displayed in the user interface and therefore must not be
   * an empty string or a string only consisting of white spaces.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * More detail for this symbol, e.g the signature of a function.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  java.lang.String getDetail();
  /**
   * <pre>
   * More detail for this symbol, e.g the signature of a function.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  com.google.protobuf.ByteString
      getDetailBytes();

  /**
   * <pre>
   * The kind of this symbol.
   * </pre>
   *
   * <code>.protocol.rpc.SymbolKind kind = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getKindValue();
  /**
   * <pre>
   * The kind of this symbol.
   * </pre>
   *
   * <code>.protocol.rpc.SymbolKind kind = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.rpc.SymbolKind getKind();

  /**
   * <pre>
   * Optional. Indicates if this symbol is deprecated.
   * </pre>
   *
   * <code>bool deprecated = 4;</code>
   */
  boolean getDeprecated();

  /**
   * <pre>
   * The range enclosing this symbol not including leading/trailing whitespace but everything else
   * like comments. This information is typically used to determine if the clients cursor is
   * inside the symbol to reveal in the symbol in the UI.
   * </pre>
   *
   * <code>.protocol.Range range = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasRange();
  /**
   * <pre>
   * The range enclosing this symbol not including leading/trailing whitespace but everything else
   * like comments. This information is typically used to determine if the clients cursor is
   * inside the symbol to reveal in the symbol in the UI.
   * </pre>
   *
   * <code>.protocol.Range range = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Range getRange();
  /**
   * <pre>
   * The range enclosing this symbol not including leading/trailing whitespace but everything else
   * like comments. This information is typically used to determine if the clients cursor is
   * inside the symbol to reveal in the symbol in the UI.
   * </pre>
   *
   * <code>.protocol.Range range = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.RangeOrBuilder getRangeOrBuilder();

  /**
   * <pre>
   * The range that should be selected and revealed when this symbol is being picked, e.g the name
   * of a function. Must be contained by the `range`.
   * </pre>
   *
   * <code>.protocol.Range selection_range = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasSelectionRange();
  /**
   * <pre>
   * The range that should be selected and revealed when this symbol is being picked, e.g the name
   * of a function. Must be contained by the `range`.
   * </pre>
   *
   * <code>.protocol.Range selection_range = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Range getSelectionRange();
  /**
   * <pre>
   * The range that should be selected and revealed when this symbol is being picked, e.g the name
   * of a function. Must be contained by the `range`.
   * </pre>
   *
   * <code>.protocol.Range selection_range = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.RangeOrBuilder getSelectionRangeOrBuilder();

  /**
   * <pre>
   * Children of this symbol, e.g. properties of a class.
   * </pre>
   *
   * <code>repeated .protocol.rpc.DocumentSymbol children = 7;</code>
   */
  java.util.List<protocol.rpc.DocumentSymbol> 
      getChildrenList();
  /**
   * <pre>
   * Children of this symbol, e.g. properties of a class.
   * </pre>
   *
   * <code>repeated .protocol.rpc.DocumentSymbol children = 7;</code>
   */
  protocol.rpc.DocumentSymbol getChildren(int index);
  /**
   * <pre>
   * Children of this symbol, e.g. properties of a class.
   * </pre>
   *
   * <code>repeated .protocol.rpc.DocumentSymbol children = 7;</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * Children of this symbol, e.g. properties of a class.
   * </pre>
   *
   * <code>repeated .protocol.rpc.DocumentSymbol children = 7;</code>
   */
  java.util.List<? extends protocol.rpc.DocumentSymbolOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * Children of this symbol, e.g. properties of a class.
   * </pre>
   *
   * <code>repeated .protocol.rpc.DocumentSymbol children = 7;</code>
   */
  protocol.rpc.DocumentSymbolOrBuilder getChildrenOrBuilder(
      int index);
}
