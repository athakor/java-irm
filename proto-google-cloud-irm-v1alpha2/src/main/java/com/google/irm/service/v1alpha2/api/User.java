/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * A user of the IRM app.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.User}
 */
public final class User extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.User)
    UserOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private User() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private User(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              userCase_ = 1;
              user_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              userCase_ = 2;
              user_ = s;
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
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_User_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.User.class,
            com.google.irm.service.v1alpha2.api.User.Builder.class);
  }

  private int userCase_ = 0;
  private java.lang.Object user_;

  public enum UserCase implements com.google.protobuf.Internal.EnumLite {
    USER_ID(1),
    EMAIL(2),
    USER_NOT_SET(0);
    private final int value;

    private UserCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static UserCase valueOf(int value) {
      return forNumber(value);
    }

    public static UserCase forNumber(int value) {
      switch (value) {
        case 1:
          return USER_ID;
        case 2:
          return EMAIL;
        case 0:
          return USER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public UserCase getUserCase() {
    return UserCase.forNumber(userCase_);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Output only. User id that will allow to get additional information from
   * People API. This field will be populated implicitly if the caller creates
   * or edits a resource (for example, posts an annotation).
   * </pre>
   *
   * <code>string user_id = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = "";
    if (userCase_ == 1) {
      ref = user_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (userCase_ == 1) {
        user_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. User id that will allow to get additional information from
   * People API. This field will be populated implicitly if the caller creates
   * or edits a resource (for example, posts an annotation).
   * </pre>
   *
   * <code>string user_id = 1;</code>
   */
  public com.google.protobuf.ByteString getUserIdBytes() {
    java.lang.Object ref = "";
    if (userCase_ == 1) {
      ref = user_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (userCase_ == 1) {
        user_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Email address of the user. This must be associated with a Google account.
   * This field will be set if the user is explicitly identified (verbatim) by
   * email address in an API request (potentially sometime in the past). It
   * will not be populated based on the credentials of a caller of the API.
   * </pre>
   *
   * <code>string email = 2;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (userCase_ == 2) {
      ref = user_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (userCase_ == 2) {
        user_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of the user. This must be associated with a Google account.
   * This field will be set if the user is explicitly identified (verbatim) by
   * email address in an API request (potentially sometime in the past). It
   * will not be populated based on the credentials of a caller of the API.
   * </pre>
   *
   * <code>string email = 2;</code>
   */
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = "";
    if (userCase_ == 2) {
      ref = user_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (userCase_ == 2) {
        user_ = b;
      }
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
    if (userCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
    }
    if (userCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, user_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
    }
    if (userCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, user_);
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.User)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.User other = (com.google.irm.service.v1alpha2.api.User) obj;

    if (!getUserCase().equals(other.getUserCase())) return false;
    switch (userCase_) {
      case 1:
        if (!getUserId().equals(other.getUserId())) return false;
        break;
      case 2:
        if (!getEmail().equals(other.getEmail())) return false;
        break;
      case 0:
      default:
    }
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
    switch (userCase_) {
      case 1:
        hash = (37 * hash) + USER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getUserId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.User parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.User parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.User parseFrom(
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

  public static Builder newBuilder(com.google.irm.service.v1alpha2.api.User prototype) {
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
   * A user of the IRM app.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.User}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.User)
      com.google.irm.service.v1alpha2.api.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.User.class,
              com.google.irm.service.v1alpha2.api.User.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.User.newBuilder()
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
      userCase_ = 0;
      user_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_User_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.User getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.User.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.User build() {
      com.google.irm.service.v1alpha2.api.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.User buildPartial() {
      com.google.irm.service.v1alpha2.api.User result =
          new com.google.irm.service.v1alpha2.api.User(this);
      if (userCase_ == 1) {
        result.user_ = user_;
      }
      if (userCase_ == 2) {
        result.user_ = user_;
      }
      result.userCase_ = userCase_;
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
      if (other instanceof com.google.irm.service.v1alpha2.api.User) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.User) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.User other) {
      if (other == com.google.irm.service.v1alpha2.api.User.getDefaultInstance()) return this;
      switch (other.getUserCase()) {
        case USER_ID:
          {
            userCase_ = 1;
            user_ = other.user_;
            onChanged();
            break;
          }
        case EMAIL:
          {
            userCase_ = 2;
            user_ = other.user_;
            onChanged();
            break;
          }
        case USER_NOT_SET:
          {
            break;
          }
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
      com.google.irm.service.v1alpha2.api.User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.irm.service.v1alpha2.api.User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userCase_ = 0;
    private java.lang.Object user_;

    public UserCase getUserCase() {
      return UserCase.forNumber(userCase_);
    }

    public Builder clearUser() {
      userCase_ = 0;
      user_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. User id that will allow to get additional information from
     * People API. This field will be populated implicitly if the caller creates
     * or edits a resource (for example, posts an annotation).
     * </pre>
     *
     * <code>string user_id = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = "";
      if (userCase_ == 1) {
        ref = user_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (userCase_ == 1) {
          user_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. User id that will allow to get additional information from
     * People API. This field will be populated implicitly if the caller creates
     * or edits a resource (for example, posts an annotation).
     * </pre>
     *
     * <code>string user_id = 1;</code>
     */
    public com.google.protobuf.ByteString getUserIdBytes() {
      java.lang.Object ref = "";
      if (userCase_ == 1) {
        ref = user_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (userCase_ == 1) {
          user_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. User id that will allow to get additional information from
     * People API. This field will be populated implicitly if the caller creates
     * or edits a resource (for example, posts an annotation).
     * </pre>
     *
     * <code>string user_id = 1;</code>
     */
    public Builder setUserId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userCase_ = 1;
      user_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. User id that will allow to get additional information from
     * People API. This field will be populated implicitly if the caller creates
     * or edits a resource (for example, posts an annotation).
     * </pre>
     *
     * <code>string user_id = 1;</code>
     */
    public Builder clearUserId() {
      if (userCase_ == 1) {
        userCase_ = 0;
        user_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. User id that will allow to get additional information from
     * People API. This field will be populated implicitly if the caller creates
     * or edits a resource (for example, posts an annotation).
     * </pre>
     *
     * <code>string user_id = 1;</code>
     */
    public Builder setUserIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userCase_ = 1;
      user_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Email address of the user. This must be associated with a Google account.
     * This field will be set if the user is explicitly identified (verbatim) by
     * email address in an API request (potentially sometime in the past). It
     * will not be populated based on the credentials of a caller of the API.
     * </pre>
     *
     * <code>string email = 2;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (userCase_ == 2) {
        ref = user_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (userCase_ == 2) {
          user_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of the user. This must be associated with a Google account.
     * This field will be set if the user is explicitly identified (verbatim) by
     * email address in an API request (potentially sometime in the past). It
     * will not be populated based on the credentials of a caller of the API.
     * </pre>
     *
     * <code>string email = 2;</code>
     */
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = "";
      if (userCase_ == 2) {
        ref = user_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (userCase_ == 2) {
          user_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of the user. This must be associated with a Google account.
     * This field will be set if the user is explicitly identified (verbatim) by
     * email address in an API request (potentially sometime in the past). It
     * will not be populated based on the credentials of a caller of the API.
     * </pre>
     *
     * <code>string email = 2;</code>
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userCase_ = 2;
      user_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of the user. This must be associated with a Google account.
     * This field will be set if the user is explicitly identified (verbatim) by
     * email address in an API request (potentially sometime in the past). It
     * will not be populated based on the credentials of a caller of the API.
     * </pre>
     *
     * <code>string email = 2;</code>
     */
    public Builder clearEmail() {
      if (userCase_ == 2) {
        userCase_ = 0;
        user_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of the user. This must be associated with a Google account.
     * This field will be set if the user is explicitly identified (verbatim) by
     * email address in an API request (potentially sometime in the past). It
     * will not be populated based on the credentials of a caller of the API.
     * </pre>
     *
     * <code>string email = 2;</code>
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userCase_ = 2;
      user_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.User)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.User)
  private static final com.google.irm.service.v1alpha2.api.User DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.User();
  }

  public static com.google.irm.service.v1alpha2.api.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User> PARSER =
      new com.google.protobuf.AbstractParser<User>() {
        @java.lang.Override
        public User parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new User(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}