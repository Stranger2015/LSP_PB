/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * OAuth scopes are a way to define data and permissions on data. For example,
 * there are scopes defined for "Read-only access to Google Calendar" and
 * "Access to Cloud Platform". Users can consent to a scope for an application,
 * giving it permission to access that data on their behalf.
 * OAuth scope specifications should be fairly coarse grained; a user will need
 * to see and understand the text description of what your scope means.
 * In most cases: use one or at most two OAuth scopes for an entire family of
 * products. If your product has multiple APIs, you should probably be sharing
 * the OAuth scope across all of those APIs.
 * When you need finer grained OAuth consent screens: talk with your product
 * management about how developers will use them in practice.
 * Please note that even though each of the canonical scopes is enough for a
 * request to be accepted and passed to the backend, a request can still fail
 * due to the backend requiring additional scopes or permissions.
 * </pre>
 *
 * Protobuf type {@code google.api.OAuthRequirements}
 */
public final class OAuthRequirements extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.OAuthRequirements)
    OAuthRequirementsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OAuthRequirements.newBuilder() to construct.
  private OAuthRequirements(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OAuthRequirements() {
    canonicalScopes_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OAuthRequirements();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OAuthRequirements(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              canonicalScopes_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.AuthProto.internal_static_google_api_OAuthRequirements_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthProto.internal_static_google_api_OAuthRequirements_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.OAuthRequirements.class, com.google.api.OAuthRequirements.Builder.class);
  }

  public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
  private volatile java.lang.Object canonicalScopes_;
  /**
   *
   *
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>string canonical_scopes = 1;</code>
   *
   * @return The canonicalScopes.
   */
  public java.lang.String getCanonicalScopes() {
    java.lang.Object ref = canonicalScopes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      canonicalScopes_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>string canonical_scopes = 1;</code>
   *
   * @return The bytes for canonicalScopes.
   */
  public com.google.protobuf.ByteString getCanonicalScopesBytes() {
    java.lang.Object ref = canonicalScopes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      canonicalScopes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getCanonicalScopesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, canonicalScopes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCanonicalScopesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, canonicalScopes_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.OAuthRequirements)) {
      return super.equals(obj);
    }
    com.google.api.OAuthRequirements other = (com.google.api.OAuthRequirements) obj;

    if (!getCanonicalScopes().equals(other.getCanonicalScopes())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CANONICAL_SCOPES_FIELD_NUMBER;
    hash = (53 * hash) + getCanonicalScopes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.OAuthRequirements parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.OAuthRequirements parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.OAuthRequirements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.OAuthRequirements parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.OAuthRequirements parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.OAuthRequirements parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.OAuthRequirements parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.OAuthRequirements prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * OAuth scopes are a way to define data and permissions on data. For example,
   * there are scopes defined for "Read-only access to Google Calendar" and
   * "Access to Cloud Platform". Users can consent to a scope for an application,
   * giving it permission to access that data on their behalf.
   * OAuth scope specifications should be fairly coarse grained; a user will need
   * to see and understand the text description of what your scope means.
   * In most cases: use one or at most two OAuth scopes for an entire family of
   * products. If your product has multiple APIs, you should probably be sharing
   * the OAuth scope across all of those APIs.
   * When you need finer grained OAuth consent screens: talk with your product
   * management about how developers will use them in practice.
   * Please note that even though each of the canonical scopes is enough for a
   * request to be accepted and passed to the backend, a request can still fail
   * due to the backend requiring additional scopes or permissions.
   * </pre>
   *
   * Protobuf type {@code google.api.OAuthRequirements}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.OAuthRequirements)
      com.google.api.OAuthRequirementsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.AuthProto.internal_static_google_api_OAuthRequirements_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthProto
          .internal_static_google_api_OAuthRequirements_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.OAuthRequirements.class,
              com.google.api.OAuthRequirements.Builder.class);
    }

    // Construct using com.google.api.OAuthRequirements.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      canonicalScopes_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.AuthProto.internal_static_google_api_OAuthRequirements_descriptor;
    }

    @java.lang.Override
    public com.google.api.OAuthRequirements getDefaultInstanceForType() {
      return com.google.api.OAuthRequirements.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.OAuthRequirements build() {
      com.google.api.OAuthRequirements result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.OAuthRequirements buildPartial() {
      com.google.api.OAuthRequirements result = new com.google.api.OAuthRequirements(this);
      result.canonicalScopes_ = canonicalScopes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.OAuthRequirements) {
        return mergeFrom((com.google.api.OAuthRequirements) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.OAuthRequirements other) {
      if (other == com.google.api.OAuthRequirements.getDefaultInstance()) return this;
      if (!other.getCanonicalScopes().isEmpty()) {
        canonicalScopes_ = other.canonicalScopes_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.OAuthRequirements parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.OAuthRequirements) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object canonicalScopes_ = "";
    /**
     *
     *
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>string canonical_scopes = 1;</code>
     *
     * @return The canonicalScopes.
     */
    public java.lang.String getCanonicalScopes() {
      java.lang.Object ref = canonicalScopes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        canonicalScopes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>string canonical_scopes = 1;</code>
     *
     * @return The bytes for canonicalScopes.
     */
    public com.google.protobuf.ByteString getCanonicalScopesBytes() {
      java.lang.Object ref = canonicalScopes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        canonicalScopes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>string canonical_scopes = 1;</code>
     *
     * @param value The canonicalScopes to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalScopes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      canonicalScopes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>string canonical_scopes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCanonicalScopes() {

      canonicalScopes_ = getDefaultInstance().getCanonicalScopes();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of publicly documented OAuth scopes that are allowed access. An
     * OAuth token containing any of these scopes will be accepted.
     * Example:
     *      canonical_scopes: https://www.googleapis.com/auth/calendar,
     *                        https://www.googleapis.com/auth/calendar.read
     * </pre>
     *
     * <code>string canonical_scopes = 1;</code>
     *
     * @param value The bytes for canonicalScopes to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalScopesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      canonicalScopes_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.OAuthRequirements)
  }

  // @@protoc_insertion_point(class_scope:google.api.OAuthRequirements)
  private static final com.google.api.OAuthRequirements DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.OAuthRequirements();
  }

  public static com.google.api.OAuthRequirements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAuthRequirements> PARSER =
      new com.google.protobuf.AbstractParser<OAuthRequirements>() {
        @java.lang.Override
        public OAuthRequirements parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OAuthRequirements(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OAuthRequirements> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAuthRequirements> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.OAuthRequirements getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
