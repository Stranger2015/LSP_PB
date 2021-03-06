// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol/protocol.proto

package protocol;

/**
 * <pre>
 * FileResourceChange allow servers to create, rename and delete files and folders via the client.
 * Note that the names talk about files but the operations are supposed to work on files and
 * folders. This is in line with other naming in the Language Server Protocol (see file watchers
 * which can watch files and folders).
 * New in version 3.13.
 * </pre>
 *
 * Protobuf type {@code protocol.FileResourceChange}
 */
public  final class FileResourceChange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protocol.FileResourceChange)
    FileResourceChangeOrBuilder {
  // Use FileResourceChange.newBuilder() to construct.
  private FileResourceChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileResourceChange() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FileResourceChange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            protocol.CreateFile.Builder subBuilder = null;
            if (fileCase_ == 1) {
              subBuilder = ((protocol.CreateFile) file_).toBuilder();
            }
            file_ =
                input.readMessage(protocol.CreateFile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.CreateFile) file_);
              file_ = subBuilder.buildPartial();
            }
            fileCase_ = 1;
            break;
          }
          case 18: {
            protocol.RenameFile.Builder subBuilder = null;
            if (fileCase_ == 2) {
              subBuilder = ((protocol.RenameFile) file_).toBuilder();
            }
            file_ =
                input.readMessage(protocol.RenameFile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.RenameFile) file_);
              file_ = subBuilder.buildPartial();
            }
            fileCase_ = 2;
            break;
          }
          case 26: {
            protocol.DeleteFile.Builder subBuilder = null;
            if (fileCase_ == 3) {
              subBuilder = ((protocol.DeleteFile) file_).toBuilder();
            }
            file_ =
                input.readMessage(protocol.DeleteFile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((protocol.DeleteFile) file_);
              file_ = subBuilder.buildPartial();
            }
            fileCase_ = 3;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protocol.ProtocolProto.internal_static_protocol_FileResourceChange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protocol.ProtocolProto.internal_static_protocol_FileResourceChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protocol.FileResourceChange.class, protocol.FileResourceChange.Builder.class);
  }

  private int fileCase_ = 0;
  private java.lang.Object file_;
  public enum FileCase
      implements com.google.protobuf.Internal.EnumLite {
    CREATE_FILE(1),
    RENAME_FILE(2),
    DELETE_FILE(3),
    FILE_NOT_SET(0);
    private final int value;
    private FileCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FileCase valueOf(int value) {
      return forNumber(value);
    }

    public static FileCase forNumber(int value) {
      switch (value) {
        case 1: return CREATE_FILE;
        case 2: return RENAME_FILE;
        case 3: return DELETE_FILE;
        case 0: return FILE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FileCase
  getFileCase() {
    return FileCase.forNumber(
        fileCase_);
  }

  public static final int CREATE_FILE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * CreateFile create file operation.
   * </pre>
   *
   * <code>.protocol.CreateFile create_file = 1;</code>
   */
  public protocol.CreateFile getCreateFile() {
    if (fileCase_ == 1) {
       return (protocol.CreateFile) file_;
    }
    return protocol.CreateFile.getDefaultInstance();
  }
  /**
   * <pre>
   * CreateFile create file operation.
   * </pre>
   *
   * <code>.protocol.CreateFile create_file = 1;</code>
   */
  public protocol.CreateFileOrBuilder getCreateFileOrBuilder() {
    if (fileCase_ == 1) {
       return (protocol.CreateFile) file_;
    }
    return protocol.CreateFile.getDefaultInstance();
  }

  public static final int RENAME_FILE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * RenameFile rename file operation.
   * </pre>
   *
   * <code>.protocol.RenameFile rename_file = 2;</code>
   */
  public protocol.RenameFile getRenameFile() {
    if (fileCase_ == 2) {
       return (protocol.RenameFile) file_;
    }
    return protocol.RenameFile.getDefaultInstance();
  }
  /**
   * <pre>
   * RenameFile rename file operation.
   * </pre>
   *
   * <code>.protocol.RenameFile rename_file = 2;</code>
   */
  public protocol.RenameFileOrBuilder getRenameFileOrBuilder() {
    if (fileCase_ == 2) {
       return (protocol.RenameFile) file_;
    }
    return protocol.RenameFile.getDefaultInstance();
  }

  public static final int DELETE_FILE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * DeleteFile delete file operation.
   * </pre>
   *
   * <code>.protocol.DeleteFile delete_file = 3;</code>
   */
  public protocol.DeleteFile getDeleteFile() {
    if (fileCase_ == 3) {
       return (protocol.DeleteFile) file_;
    }
    return protocol.DeleteFile.getDefaultInstance();
  }
  /**
   * <pre>
   * DeleteFile delete file operation.
   * </pre>
   *
   * <code>.protocol.DeleteFile delete_file = 3;</code>
   */
  public protocol.DeleteFileOrBuilder getDeleteFileOrBuilder() {
    if (fileCase_ == 3) {
       return (protocol.DeleteFile) file_;
    }
    return protocol.DeleteFile.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fileCase_ == 1) {
      output.writeMessage(1, (protocol.CreateFile) file_);
    }
    if (fileCase_ == 2) {
      output.writeMessage(2, (protocol.RenameFile) file_);
    }
    if (fileCase_ == 3) {
      output.writeMessage(3, (protocol.DeleteFile) file_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fileCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (protocol.CreateFile) file_);
    }
    if (fileCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (protocol.RenameFile) file_);
    }
    if (fileCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (protocol.DeleteFile) file_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protocol.FileResourceChange)) {
      return super.equals(obj);
    }
    protocol.FileResourceChange other = (protocol.FileResourceChange) obj;

    boolean result = true;
    result = result && getFileCase().equals(
        other.getFileCase());
    if (!result) return false;
    switch (fileCase_) {
      case 1:
        result = result && getCreateFile()
            .equals(other.getCreateFile());
        break;
      case 2:
        result = result && getRenameFile()
            .equals(other.getRenameFile());
        break;
      case 3:
        result = result && getDeleteFile()
            .equals(other.getDeleteFile());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (fileCase_) {
      case 1:
        hash = (37 * hash) + CREATE_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getCreateFile().hashCode();
        break;
      case 2:
        hash = (37 * hash) + RENAME_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getRenameFile().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DELETE_FILE_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteFile().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protocol.FileResourceChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.FileResourceChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.FileResourceChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protocol.FileResourceChange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protocol.FileResourceChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.FileResourceChange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.FileResourceChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protocol.FileResourceChange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protocol.FileResourceChange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protocol.FileResourceChange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(protocol.FileResourceChange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * FileResourceChange allow servers to create, rename and delete files and folders via the client.
   * Note that the names talk about files but the operations are supposed to work on files and
   * folders. This is in line with other naming in the Language Server Protocol (see file watchers
   * which can watch files and folders).
   * New in version 3.13.
   * </pre>
   *
   * Protobuf type {@code protocol.FileResourceChange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protocol.FileResourceChange)
      protocol.FileResourceChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.ProtocolProto.internal_static_protocol_FileResourceChange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.ProtocolProto.internal_static_protocol_FileResourceChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.FileResourceChange.class, protocol.FileResourceChange.Builder.class);
    }

    // Construct using protocol.FileResourceChange.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      fileCase_ = 0;
      file_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protocol.ProtocolProto.internal_static_protocol_FileResourceChange_descriptor;
    }

    public protocol.FileResourceChange getDefaultInstanceForType() {
      return protocol.FileResourceChange.getDefaultInstance();
    }

    public protocol.FileResourceChange build() {
      protocol.FileResourceChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protocol.FileResourceChange buildPartial() {
      protocol.FileResourceChange result = new protocol.FileResourceChange(this);
      if (fileCase_ == 1) {
        if (createFileBuilder_ == null) {
          result.file_ = file_;
        } else {
          result.file_ = createFileBuilder_.build();
        }
      }
      if (fileCase_ == 2) {
        if (renameFileBuilder_ == null) {
          result.file_ = file_;
        } else {
          result.file_ = renameFileBuilder_.build();
        }
      }
      if (fileCase_ == 3) {
        if (deleteFileBuilder_ == null) {
          result.file_ = file_;
        } else {
          result.file_ = deleteFileBuilder_.build();
        }
      }
      result.fileCase_ = fileCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protocol.FileResourceChange) {
        return mergeFrom((protocol.FileResourceChange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protocol.FileResourceChange other) {
      if (other == protocol.FileResourceChange.getDefaultInstance()) return this;
      switch (other.getFileCase()) {
        case CREATE_FILE: {
          mergeCreateFile(other.getCreateFile());
          break;
        }
        case RENAME_FILE: {
          mergeRenameFile(other.getRenameFile());
          break;
        }
        case DELETE_FILE: {
          mergeDeleteFile(other.getDeleteFile());
          break;
        }
        case FILE_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protocol.FileResourceChange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protocol.FileResourceChange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int fileCase_ = 0;
    private java.lang.Object file_;
    public FileCase
        getFileCase() {
      return FileCase.forNumber(
          fileCase_);
    }

    public Builder clearFile() {
      fileCase_ = 0;
      file_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.CreateFile, protocol.CreateFile.Builder, protocol.CreateFileOrBuilder> createFileBuilder_;
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public protocol.CreateFile getCreateFile() {
      if (createFileBuilder_ == null) {
        if (fileCase_ == 1) {
          return (protocol.CreateFile) file_;
        }
        return protocol.CreateFile.getDefaultInstance();
      } else {
        if (fileCase_ == 1) {
          return createFileBuilder_.getMessage();
        }
        return protocol.CreateFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public Builder setCreateFile(protocol.CreateFile value) {
      if (createFileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        file_ = value;
        onChanged();
      } else {
        createFileBuilder_.setMessage(value);
      }
      fileCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public Builder setCreateFile(
        protocol.CreateFile.Builder builderForValue) {
      if (createFileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        createFileBuilder_.setMessage(builderForValue.build());
      }
      fileCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public Builder mergeCreateFile(protocol.CreateFile value) {
      if (createFileBuilder_ == null) {
        if (fileCase_ == 1 &&
            file_ != protocol.CreateFile.getDefaultInstance()) {
          file_ = protocol.CreateFile.newBuilder((protocol.CreateFile) file_)
              .mergeFrom(value).buildPartial();
        } else {
          file_ = value;
        }
        onChanged();
      } else {
        if (fileCase_ == 1) {
          createFileBuilder_.mergeFrom(value);
        }
        createFileBuilder_.setMessage(value);
      }
      fileCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public Builder clearCreateFile() {
      if (createFileBuilder_ == null) {
        if (fileCase_ == 1) {
          fileCase_ = 0;
          file_ = null;
          onChanged();
        }
      } else {
        if (fileCase_ == 1) {
          fileCase_ = 0;
          file_ = null;
        }
        createFileBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public protocol.CreateFile.Builder getCreateFileBuilder() {
      return getCreateFileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    public protocol.CreateFileOrBuilder getCreateFileOrBuilder() {
      if ((fileCase_ == 1) && (createFileBuilder_ != null)) {
        return createFileBuilder_.getMessageOrBuilder();
      } else {
        if (fileCase_ == 1) {
          return (protocol.CreateFile) file_;
        }
        return protocol.CreateFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * CreateFile create file operation.
     * </pre>
     *
     * <code>.protocol.CreateFile create_file = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.CreateFile, protocol.CreateFile.Builder, protocol.CreateFileOrBuilder> 
        getCreateFileFieldBuilder() {
      if (createFileBuilder_ == null) {
        if (!(fileCase_ == 1)) {
          file_ = protocol.CreateFile.getDefaultInstance();
        }
        createFileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.CreateFile, protocol.CreateFile.Builder, protocol.CreateFileOrBuilder>(
                (protocol.CreateFile) file_,
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      fileCase_ = 1;
      onChanged();;
      return createFileBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.RenameFile, protocol.RenameFile.Builder, protocol.RenameFileOrBuilder> renameFileBuilder_;
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public protocol.RenameFile getRenameFile() {
      if (renameFileBuilder_ == null) {
        if (fileCase_ == 2) {
          return (protocol.RenameFile) file_;
        }
        return protocol.RenameFile.getDefaultInstance();
      } else {
        if (fileCase_ == 2) {
          return renameFileBuilder_.getMessage();
        }
        return protocol.RenameFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public Builder setRenameFile(protocol.RenameFile value) {
      if (renameFileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        file_ = value;
        onChanged();
      } else {
        renameFileBuilder_.setMessage(value);
      }
      fileCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public Builder setRenameFile(
        protocol.RenameFile.Builder builderForValue) {
      if (renameFileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        renameFileBuilder_.setMessage(builderForValue.build());
      }
      fileCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public Builder mergeRenameFile(protocol.RenameFile value) {
      if (renameFileBuilder_ == null) {
        if (fileCase_ == 2 &&
            file_ != protocol.RenameFile.getDefaultInstance()) {
          file_ = protocol.RenameFile.newBuilder((protocol.RenameFile) file_)
              .mergeFrom(value).buildPartial();
        } else {
          file_ = value;
        }
        onChanged();
      } else {
        if (fileCase_ == 2) {
          renameFileBuilder_.mergeFrom(value);
        }
        renameFileBuilder_.setMessage(value);
      }
      fileCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public Builder clearRenameFile() {
      if (renameFileBuilder_ == null) {
        if (fileCase_ == 2) {
          fileCase_ = 0;
          file_ = null;
          onChanged();
        }
      } else {
        if (fileCase_ == 2) {
          fileCase_ = 0;
          file_ = null;
        }
        renameFileBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public protocol.RenameFile.Builder getRenameFileBuilder() {
      return getRenameFileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    public protocol.RenameFileOrBuilder getRenameFileOrBuilder() {
      if ((fileCase_ == 2) && (renameFileBuilder_ != null)) {
        return renameFileBuilder_.getMessageOrBuilder();
      } else {
        if (fileCase_ == 2) {
          return (protocol.RenameFile) file_;
        }
        return protocol.RenameFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * RenameFile rename file operation.
     * </pre>
     *
     * <code>.protocol.RenameFile rename_file = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.RenameFile, protocol.RenameFile.Builder, protocol.RenameFileOrBuilder> 
        getRenameFileFieldBuilder() {
      if (renameFileBuilder_ == null) {
        if (!(fileCase_ == 2)) {
          file_ = protocol.RenameFile.getDefaultInstance();
        }
        renameFileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.RenameFile, protocol.RenameFile.Builder, protocol.RenameFileOrBuilder>(
                (protocol.RenameFile) file_,
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      fileCase_ = 2;
      onChanged();;
      return renameFileBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.DeleteFile, protocol.DeleteFile.Builder, protocol.DeleteFileOrBuilder> deleteFileBuilder_;
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public protocol.DeleteFile getDeleteFile() {
      if (deleteFileBuilder_ == null) {
        if (fileCase_ == 3) {
          return (protocol.DeleteFile) file_;
        }
        return protocol.DeleteFile.getDefaultInstance();
      } else {
        if (fileCase_ == 3) {
          return deleteFileBuilder_.getMessage();
        }
        return protocol.DeleteFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public Builder setDeleteFile(protocol.DeleteFile value) {
      if (deleteFileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        file_ = value;
        onChanged();
      } else {
        deleteFileBuilder_.setMessage(value);
      }
      fileCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public Builder setDeleteFile(
        protocol.DeleteFile.Builder builderForValue) {
      if (deleteFileBuilder_ == null) {
        file_ = builderForValue.build();
        onChanged();
      } else {
        deleteFileBuilder_.setMessage(builderForValue.build());
      }
      fileCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public Builder mergeDeleteFile(protocol.DeleteFile value) {
      if (deleteFileBuilder_ == null) {
        if (fileCase_ == 3 &&
            file_ != protocol.DeleteFile.getDefaultInstance()) {
          file_ = protocol.DeleteFile.newBuilder((protocol.DeleteFile) file_)
              .mergeFrom(value).buildPartial();
        } else {
          file_ = value;
        }
        onChanged();
      } else {
        if (fileCase_ == 3) {
          deleteFileBuilder_.mergeFrom(value);
        }
        deleteFileBuilder_.setMessage(value);
      }
      fileCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public Builder clearDeleteFile() {
      if (deleteFileBuilder_ == null) {
        if (fileCase_ == 3) {
          fileCase_ = 0;
          file_ = null;
          onChanged();
        }
      } else {
        if (fileCase_ == 3) {
          fileCase_ = 0;
          file_ = null;
        }
        deleteFileBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public protocol.DeleteFile.Builder getDeleteFileBuilder() {
      return getDeleteFileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    public protocol.DeleteFileOrBuilder getDeleteFileOrBuilder() {
      if ((fileCase_ == 3) && (deleteFileBuilder_ != null)) {
        return deleteFileBuilder_.getMessageOrBuilder();
      } else {
        if (fileCase_ == 3) {
          return (protocol.DeleteFile) file_;
        }
        return protocol.DeleteFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * DeleteFile delete file operation.
     * </pre>
     *
     * <code>.protocol.DeleteFile delete_file = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protocol.DeleteFile, protocol.DeleteFile.Builder, protocol.DeleteFileOrBuilder> 
        getDeleteFileFieldBuilder() {
      if (deleteFileBuilder_ == null) {
        if (!(fileCase_ == 3)) {
          file_ = protocol.DeleteFile.getDefaultInstance();
        }
        deleteFileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protocol.DeleteFile, protocol.DeleteFile.Builder, protocol.DeleteFileOrBuilder>(
                (protocol.DeleteFile) file_,
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      fileCase_ = 3;
      onChanged();;
      return deleteFileBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:protocol.FileResourceChange)
  }

  // @@protoc_insertion_point(class_scope:protocol.FileResourceChange)
  private static final protocol.FileResourceChange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protocol.FileResourceChange();
  }

  public static protocol.FileResourceChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileResourceChange>
      PARSER = new com.google.protobuf.AbstractParser<FileResourceChange>() {
    public FileResourceChange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileResourceChange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileResourceChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileResourceChange> getParserForType() {
    return PARSER;
  }

  public protocol.FileResourceChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

