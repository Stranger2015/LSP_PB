// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface TextDocumentSyncOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.TextDocumentSyncOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Open and close notifications are sent to the server. If omitted open close
   * notification should not be sent.
   * </pre>
   *
   * <code>bool open_close = 1;</code>
   */
  boolean getOpenClose();

  /**
   * <pre>
   * Optional. Change notifications are sent to the server. See
   * [TextDocumentSyncKind][TextDocumentSyncKind]. If omitted it defaults to
   * TextDocumentSyncKind.None.
   * </pre>
   *
   * <code>.protocol.rpc.TextDocumentSyncKind change = 2;</code>
   */
  int getChangeValue();
  /**
   * <pre>
   * Optional. Change notifications are sent to the server. See
   * [TextDocumentSyncKind][TextDocumentSyncKind]. If omitted it defaults to
   * TextDocumentSyncKind.None.
   * </pre>
   *
   * <code>.protocol.rpc.TextDocumentSyncKind change = 2;</code>
   */
  protocol.rpc.TextDocumentSyncKind getChange();

  /**
   * <pre>
   * Optional. If present will save notifications are sent to the server. If omitted the
   * notification should not be sent.
   * </pre>
   *
   * <code>bool will_save = 3;</code>
   */
  boolean getWillSave();

  /**
   * <pre>
   * Optional. If present will save wait until requests are sent to the server. If omitted the
   * request should not be sent.
   * </pre>
   *
   * <code>bool will_save_wait_until = 4;</code>
   */
  boolean getWillSaveWaitUntil();

  /**
   * <code>bool enable = 5;</code>
   */
  boolean getEnable();

  /**
   * <code>.protocol.rpc.SaveOptions save_options = 6;</code>
   */
  protocol.rpc.SaveOptions getSaveOptions();
  /**
   * <code>.protocol.rpc.SaveOptions save_options = 6;</code>
   */
  protocol.rpc.SaveOptionsOrBuilder getSaveOptionsOrBuilder();

  public protocol.rpc.TextDocumentSyncOptions.SaveCase getSaveCase();
}
