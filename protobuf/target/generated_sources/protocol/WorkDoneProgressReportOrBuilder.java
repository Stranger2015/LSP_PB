// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

public interface WorkDoneProgressReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.WorkDoneProgressReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * WorkDoneProgressReport kind.
   * always 'report'
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getKind();
  /**
   * <pre>
   * WorkDoneProgressReport kind.
   * always 'report'
   * </pre>
   *
   * <code>string kind = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Optional. Controls enablement state of a cancel button. This property is only valid if a cancel
   * button got requested in the `WorkDoneProgressStart` payload.
   * Clients that don't support cancellation or don't support control the button's
   * enablement state are allowed to ignore the setting.
   * </pre>
   *
   * <code>bool cancellable = 2;</code>
   */
  boolean getCancellable();

  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  com.google.protobuf.StringValue getMessage();
  /**
   * <pre>
   * Optional, more detailed associated progress message. Contains
   * complementary information to the `title`.
   * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
   * If unset, the previous progress message (if any) is still valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue message = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  boolean hasPercentage();
  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  com.google.protobuf.Int32Value getPercentage();
  /**
   * <pre>
   * Optional progress percentage to display (value 100 is considered 100%).
   * If not provided infinite progress is assumed and clients are allowed
   * to ignore the `percentage` value in subsequent in report notifications.
   * The value should be steadily rising. Clients are free to ignore values
   * that are not following this rule.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value percentage = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getPercentageOrBuilder();
}
