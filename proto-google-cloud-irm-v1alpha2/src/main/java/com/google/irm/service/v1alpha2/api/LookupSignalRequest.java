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
// source: google/cloud/irm/v1alpha2/incidents_service.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * Request for the LookupSignal method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.LookupSignalRequest}
 */
public final class LookupSignalRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.LookupSignalRequest)
    LookupSignalRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LookupSignalRequest.newBuilder() to construct.
  private LookupSignalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LookupSignalRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LookupSignalRequest(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              alternateIdCase_ = 2;
              alternateId_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              alternateIdCase_ = 3;
              alternateId_ = s;
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
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_LookupSignalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_LookupSignalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.LookupSignalRequest.class,
            com.google.irm.service.v1alpha2.api.LookupSignalRequest.Builder.class);
  }

  private int alternateIdCase_ = 0;
  private java.lang.Object alternateId_;

  public enum AlternateIdCase implements com.google.protobuf.Internal.EnumLite {
    CSCC_FINDING(2),
    STACKDRIVER_NOTIFICATION_ID(3),
    ALTERNATEID_NOT_SET(0);
    private final int value;

    private AlternateIdCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static AlternateIdCase valueOf(int value) {
      return forNumber(value);
    }

    public static AlternateIdCase forNumber(int value) {
      switch (value) {
        case 2:
          return CSCC_FINDING;
        case 3:
          return STACKDRIVER_NOTIFICATION_ID;
        case 0:
          return ALTERNATEID_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AlternateIdCase getAlternateIdCase() {
    return AlternateIdCase.forNumber(alternateIdCase_);
  }

  public static final int CSCC_FINDING_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Full resource name of the CSCC finding id this signal refers to (e.g.
   * "organizations/abc/sources/123/findings/xyz")
   * </pre>
   *
   * <code>string cscc_finding = 2;</code>
   */
  public java.lang.String getCsccFinding() {
    java.lang.Object ref = "";
    if (alternateIdCase_ == 2) {
      ref = alternateId_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (alternateIdCase_ == 2) {
        alternateId_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full resource name of the CSCC finding id this signal refers to (e.g.
   * "organizations/abc/sources/123/findings/xyz")
   * </pre>
   *
   * <code>string cscc_finding = 2;</code>
   */
  public com.google.protobuf.ByteString getCsccFindingBytes() {
    java.lang.Object ref = "";
    if (alternateIdCase_ == 2) {
      ref = alternateId_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (alternateIdCase_ == 2) {
        alternateId_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STACKDRIVER_NOTIFICATION_ID_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The ID from the Stackdriver Alerting notification.
   * </pre>
   *
   * <code>string stackdriver_notification_id = 3;</code>
   */
  public java.lang.String getStackdriverNotificationId() {
    java.lang.Object ref = "";
    if (alternateIdCase_ == 3) {
      ref = alternateId_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (alternateIdCase_ == 3) {
        alternateId_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID from the Stackdriver Alerting notification.
   * </pre>
   *
   * <code>string stackdriver_notification_id = 3;</code>
   */
  public com.google.protobuf.ByteString getStackdriverNotificationIdBytes() {
    java.lang.Object ref = "";
    if (alternateIdCase_ == 3) {
      ref = alternateId_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (alternateIdCase_ == 3) {
        alternateId_ = b;
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
    if (alternateIdCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alternateId_);
    }
    if (alternateIdCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, alternateId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alternateIdCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alternateId_);
    }
    if (alternateIdCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, alternateId_);
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.LookupSignalRequest)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.LookupSignalRequest other =
        (com.google.irm.service.v1alpha2.api.LookupSignalRequest) obj;

    if (!getAlternateIdCase().equals(other.getAlternateIdCase())) return false;
    switch (alternateIdCase_) {
      case 2:
        if (!getCsccFinding().equals(other.getCsccFinding())) return false;
        break;
      case 3:
        if (!getStackdriverNotificationId().equals(other.getStackdriverNotificationId()))
          return false;
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
    switch (alternateIdCase_) {
      case 2:
        hash = (37 * hash) + CSCC_FINDING_FIELD_NUMBER;
        hash = (53 * hash) + getCsccFinding().hashCode();
        break;
      case 3:
        hash = (37 * hash) + STACKDRIVER_NOTIFICATION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getStackdriverNotificationId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.irm.service.v1alpha2.api.LookupSignalRequest prototype) {
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
   * Request for the LookupSignal method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.LookupSignalRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.LookupSignalRequest)
      com.google.irm.service.v1alpha2.api.LookupSignalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_LookupSignalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_LookupSignalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.LookupSignalRequest.class,
              com.google.irm.service.v1alpha2.api.LookupSignalRequest.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.LookupSignalRequest.newBuilder()
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
      alternateIdCase_ = 0;
      alternateId_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_LookupSignalRequest_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.LookupSignalRequest getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.LookupSignalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.LookupSignalRequest build() {
      com.google.irm.service.v1alpha2.api.LookupSignalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.LookupSignalRequest buildPartial() {
      com.google.irm.service.v1alpha2.api.LookupSignalRequest result =
          new com.google.irm.service.v1alpha2.api.LookupSignalRequest(this);
      if (alternateIdCase_ == 2) {
        result.alternateId_ = alternateId_;
      }
      if (alternateIdCase_ == 3) {
        result.alternateId_ = alternateId_;
      }
      result.alternateIdCase_ = alternateIdCase_;
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
      if (other instanceof com.google.irm.service.v1alpha2.api.LookupSignalRequest) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.LookupSignalRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.LookupSignalRequest other) {
      if (other == com.google.irm.service.v1alpha2.api.LookupSignalRequest.getDefaultInstance())
        return this;
      switch (other.getAlternateIdCase()) {
        case CSCC_FINDING:
          {
            alternateIdCase_ = 2;
            alternateId_ = other.alternateId_;
            onChanged();
            break;
          }
        case STACKDRIVER_NOTIFICATION_ID:
          {
            alternateIdCase_ = 3;
            alternateId_ = other.alternateId_;
            onChanged();
            break;
          }
        case ALTERNATEID_NOT_SET:
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
      com.google.irm.service.v1alpha2.api.LookupSignalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.LookupSignalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int alternateIdCase_ = 0;
    private java.lang.Object alternateId_;

    public AlternateIdCase getAlternateIdCase() {
      return AlternateIdCase.forNumber(alternateIdCase_);
    }

    public Builder clearAlternateId() {
      alternateIdCase_ = 0;
      alternateId_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full resource name of the CSCC finding id this signal refers to (e.g.
     * "organizations/abc/sources/123/findings/xyz")
     * </pre>
     *
     * <code>string cscc_finding = 2;</code>
     */
    public java.lang.String getCsccFinding() {
      java.lang.Object ref = "";
      if (alternateIdCase_ == 2) {
        ref = alternateId_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (alternateIdCase_ == 2) {
          alternateId_ = s;
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
     * Full resource name of the CSCC finding id this signal refers to (e.g.
     * "organizations/abc/sources/123/findings/xyz")
     * </pre>
     *
     * <code>string cscc_finding = 2;</code>
     */
    public com.google.protobuf.ByteString getCsccFindingBytes() {
      java.lang.Object ref = "";
      if (alternateIdCase_ == 2) {
        ref = alternateId_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (alternateIdCase_ == 2) {
          alternateId_ = b;
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
     * Full resource name of the CSCC finding id this signal refers to (e.g.
     * "organizations/abc/sources/123/findings/xyz")
     * </pre>
     *
     * <code>string cscc_finding = 2;</code>
     */
    public Builder setCsccFinding(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      alternateIdCase_ = 2;
      alternateId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the CSCC finding id this signal refers to (e.g.
     * "organizations/abc/sources/123/findings/xyz")
     * </pre>
     *
     * <code>string cscc_finding = 2;</code>
     */
    public Builder clearCsccFinding() {
      if (alternateIdCase_ == 2) {
        alternateIdCase_ = 0;
        alternateId_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the CSCC finding id this signal refers to (e.g.
     * "organizations/abc/sources/123/findings/xyz")
     * </pre>
     *
     * <code>string cscc_finding = 2;</code>
     */
    public Builder setCsccFindingBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      alternateIdCase_ = 2;
      alternateId_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ID from the Stackdriver Alerting notification.
     * </pre>
     *
     * <code>string stackdriver_notification_id = 3;</code>
     */
    public java.lang.String getStackdriverNotificationId() {
      java.lang.Object ref = "";
      if (alternateIdCase_ == 3) {
        ref = alternateId_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (alternateIdCase_ == 3) {
          alternateId_ = s;
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
     * The ID from the Stackdriver Alerting notification.
     * </pre>
     *
     * <code>string stackdriver_notification_id = 3;</code>
     */
    public com.google.protobuf.ByteString getStackdriverNotificationIdBytes() {
      java.lang.Object ref = "";
      if (alternateIdCase_ == 3) {
        ref = alternateId_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (alternateIdCase_ == 3) {
          alternateId_ = b;
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
     * The ID from the Stackdriver Alerting notification.
     * </pre>
     *
     * <code>string stackdriver_notification_id = 3;</code>
     */
    public Builder setStackdriverNotificationId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      alternateIdCase_ = 3;
      alternateId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID from the Stackdriver Alerting notification.
     * </pre>
     *
     * <code>string stackdriver_notification_id = 3;</code>
     */
    public Builder clearStackdriverNotificationId() {
      if (alternateIdCase_ == 3) {
        alternateIdCase_ = 0;
        alternateId_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID from the Stackdriver Alerting notification.
     * </pre>
     *
     * <code>string stackdriver_notification_id = 3;</code>
     */
    public Builder setStackdriverNotificationIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      alternateIdCase_ = 3;
      alternateId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.LookupSignalRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.LookupSignalRequest)
  private static final com.google.irm.service.v1alpha2.api.LookupSignalRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.LookupSignalRequest();
  }

  public static com.google.irm.service.v1alpha2.api.LookupSignalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupSignalRequest> PARSER =
      new com.google.protobuf.AbstractParser<LookupSignalRequest>() {
        @java.lang.Override
        public LookupSignalRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LookupSignalRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LookupSignalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupSignalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.LookupSignalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}