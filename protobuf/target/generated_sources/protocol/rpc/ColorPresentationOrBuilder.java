// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/rpc/rpc.proto

package protocol.rpc;

public interface ColorPresentationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.rpc.ColorPresentation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The label of this color presentation. It will be shown on the color
   * picker header. By default this is also the text that is inserted when selecting
   * this color presentation.
   * </pre>
   *
   * <code>string label = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * The label of this color presentation. It will be shown on the color
   * picker header. By default this is also the text that is inserted when selecting
   * this color presentation.
   * </pre>
   *
   * <code>string label = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * An [edit][TextEdit] which is applied to a document when selecting
   * this presentation for the color.  When `falsy` the [label][ColorPresentation.label]
   * is used.
   * </pre>
   *
   * <code>.protocol.TextEdit text_edit = 2;</code>
   */
  boolean hasTextEdit();
  /**
   * <pre>
   * An [edit][TextEdit] which is applied to a document when selecting
   * this presentation for the color.  When `falsy` the [label][ColorPresentation.label]
   * is used.
   * </pre>
   *
   * <code>.protocol.TextEdit text_edit = 2;</code>
   */
  protocol.TextEdit getTextEdit();
  /**
   * <pre>
   * An [edit][TextEdit] which is applied to a document when selecting
   * this presentation for the color.  When `falsy` the [label][ColorPresentation.label]
   * is used.
   * </pre>
   *
   * <code>.protocol.TextEdit text_edit = 2;</code>
   */
  protocol.TextEditOrBuilder getTextEditOrBuilder();

  /**
   * <pre>
   * An optional array of additional [text edits](#TextEdit) that are applied when
   * selecting this color presentation. Edits must not overlap with the main
   * [edit][ColorPresentation.textEdit] nor with themselves.
   * </pre>
   *
   * <code>repeated .protocol.TextEdit additional_text_edits = 3;</code>
   */
  java.util.List<protocol.TextEdit> 
      getAdditionalTextEditsList();
  /**
   * <pre>
   * An optional array of additional [text edits](#TextEdit) that are applied when
   * selecting this color presentation. Edits must not overlap with the main
   * [edit][ColorPresentation.textEdit] nor with themselves.
   * </pre>
   *
   * <code>repeated .protocol.TextEdit additional_text_edits = 3;</code>
   */
  protocol.TextEdit getAdditionalTextEdits(int index);
  /**
   * <pre>
   * An optional array of additional [text edits](#TextEdit) that are applied when
   * selecting this color presentation. Edits must not overlap with the main
   * [edit][ColorPresentation.textEdit] nor with themselves.
   * </pre>
   *
   * <code>repeated .protocol.TextEdit additional_text_edits = 3;</code>
   */
  int getAdditionalTextEditsCount();
  /**
   * <pre>
   * An optional array of additional [text edits](#TextEdit) that are applied when
   * selecting this color presentation. Edits must not overlap with the main
   * [edit][ColorPresentation.textEdit] nor with themselves.
   * </pre>
   *
   * <code>repeated .protocol.TextEdit additional_text_edits = 3;</code>
   */
  java.util.List<? extends protocol.TextEditOrBuilder> 
      getAdditionalTextEditsOrBuilderList();
  /**
   * <pre>
   * An optional array of additional [text edits](#TextEdit) that are applied when
   * selecting this color presentation. Edits must not overlap with the main
   * [edit][ColorPresentation.textEdit] nor with themselves.
   * </pre>
   *
   * <code>repeated .protocol.TextEdit additional_text_edits = 3;</code>
   */
  protocol.TextEditOrBuilder getAdditionalTextEditsOrBuilder(
      int index);
}
