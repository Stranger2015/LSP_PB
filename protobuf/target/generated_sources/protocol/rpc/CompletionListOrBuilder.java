// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface CompletionListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.CompletionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. This list it not complete. Further typing should result in recomputing
   * this list.
   * </pre>
   *
   * <code>bool is_incomplete = 1;</code>
   */
  boolean getIsIncomplete();

  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  java.util.List<protocol.rpc.CompletionItem> 
      getItemsList();
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  protocol.rpc.CompletionItem getItems(int index);
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  java.util.List<? extends protocol.rpc.CompletionItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * The completion items.
   * </pre>
   *
   * <code>repeated .protocol.rpc.CompletionItem items = 2;</code>
   */
  protocol.rpc.CompletionItemOrBuilder getItemsOrBuilder(
      int index);
}
