// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface CodeActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.CodeAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A short, human-readable, title for this code action.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * A short, human-readable, title for this code action.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The kind of the code action.
   * Used to filter code actions.
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionKind kind = 2;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * The kind of the code action.
   * Used to filter code actions.
   * </pre>
   *
   * <code>.protocol.rpc.CodeActionKind kind = 2;</code>
   */
  protocol.rpc.CodeActionKind getKind();

  /**
   * <pre>
   * The diagnostics that this code action resolves.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3;</code>
   */
  java.util.List<protocol.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * The diagnostics that this code action resolves.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3;</code>
   */
  protocol.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * The diagnostics that this code action resolves.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3;</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * The diagnostics that this code action resolves.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3;</code>
   */
  java.util.List<? extends protocol.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * The diagnostics that this code action resolves.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3;</code>
   */
  protocol.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Marks this as a preferred action. Preferred actions are used by the `auto fix`
   * command and can be targeted by keybindings.
   * A quick fix should be marked preferred if it properly addresses the underlying error.
   * A refactoring should be marked preferred if it is the most reasonable choice of actions to
   * take.
   * &#64;since 3.15.0
   * </pre>
   *
   * <code>bool is_preferred = 4;</code>
   */
  boolean getIsPreferred();

  /**
   * <pre>
   * Optional. The workspace edit this code action performs.
   * </pre>
   *
   * <code>.protocol.WorkspaceEdit edit = 5;</code>
   */
  boolean hasEdit();
  /**
   * <pre>
   * Optional. The workspace edit this code action performs.
   * </pre>
   *
   * <code>.protocol.WorkspaceEdit edit = 5;</code>
   */
  protocol.WorkspaceEdit getEdit();
  /**
   * <pre>
   * Optional. The workspace edit this code action performs.
   * </pre>
   *
   * <code>.protocol.WorkspaceEdit edit = 5;</code>
   */
  protocol.WorkspaceEditOrBuilder getEditOrBuilder();

  /**
   * <pre>
   * Optional. A command this code action executes. If a code action
   * provides an edit and a command, first the edit is
   * executed and then the command.
   * </pre>
   *
   * <code>.protocol.Command command = 6;</code>
   */
  boolean hasCommand();
  /**
   * <pre>
   * Optional. A command this code action executes. If a code action
   * provides an edit and a command, first the edit is
   * executed and then the command.
   * </pre>
   *
   * <code>.protocol.Command command = 6;</code>
   */
  protocol.Command getCommand();
  /**
   * <pre>
   * Optional. A command this code action executes. If a code action
   * provides an edit and a command, first the edit is
   * executed and then the command.
   * </pre>
   *
   * <code>.protocol.Command command = 6;</code>
   */
  protocol.CommandOrBuilder getCommandOrBuilder();
}