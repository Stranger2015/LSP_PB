// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface WorkspaceEditClientCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.WorkspaceEditClientCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The client supports versioned document changes in `WorkspaceEdit`s.
   * </pre>
   *
   * <code>bool document_changes = 1;</code>
   */
  boolean getDocumentChanges();

  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  java.util.List<protocol.ResourceOperationKind> getResourceOperationsList();
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  int getResourceOperationsCount();
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  protocol.ResourceOperationKind getResourceOperations(int index);
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getResourceOperationsValueList();
  /**
   * <pre>
   * The resource operations the client supports. Clients should at least
   * support 'create', 'rename' and 'delete' files and folders.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>repeated .protocol.ResourceOperationKind resource_operations = 2;</code>
   */
  int getResourceOperationsValue(int index);

  /**
   * <pre>
   * Optional. The failure handling strategy of a client if applying the workspace edit
   * fails.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
   */
  int getFailureHandlingValue();
  /**
   * <pre>
   * Optional. The failure handling strategy of a client if applying the workspace edit
   * fails.
   * &#64;since 3.13.0
   * </pre>
   *
   * <code>.protocol.FailureHandlingKind failure_handling = 3;</code>
   */
  protocol.FailureHandlingKind getFailureHandling();
}