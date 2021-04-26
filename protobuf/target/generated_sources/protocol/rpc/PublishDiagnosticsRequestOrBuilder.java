// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface PublishDiagnosticsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.PublishDiagnosticsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI for which diagnostic information is reported.
   * </pre>
   *
   * <code>.protocol.DocumentURI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasUri();
  /**
   * <pre>
   * The URI for which diagnostic information is reported.
   * </pre>
   *
   * <code>.protocol.DocumentURI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.DocumentURI getUri();
  /**
   * <pre>
   * The URI for which diagnostic information is reported.
   * </pre>
   *
   * <code>.protocol.DocumentURI uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.DocumentURIOrBuilder getUriOrBuilder();

  /**
   * <pre>
   * Optional the version number of the document the diagnostics are published for.
   * &#64;since 3.15.0
   * </pre>
   *
   * <code>int32 version = 2;</code>
   */
  int getVersion();

  /**
   * <pre>
   * An array of diagnostic information items.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<protocol.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * An array of diagnostic information items.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * An array of diagnostic information items.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * An array of diagnostic information items.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends protocol.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * An array of diagnostic information items.
   * </pre>
   *
   * <code>repeated .protocol.Diagnostic diagnostics = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  protocol.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}