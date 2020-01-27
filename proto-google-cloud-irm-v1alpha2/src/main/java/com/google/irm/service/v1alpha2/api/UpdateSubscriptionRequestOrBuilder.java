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
// source: google/cloud/irm/v1alpha2/incidents_service.proto

package com.google.irm.service.v1alpha2.api;

public interface UpdateSubscriptionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.UpdateSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The subscription to update, with new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   *
   *
   * <pre>
   * Required. The subscription to update, with new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The subscription.
   */
  com.google.irm.service.v1alpha2.api.Subscription getSubscription();
  /**
   *
   *
   * <pre>
   * Required. The subscription to update, with new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Subscription subscription = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.irm.service.v1alpha2.api.SubscriptionOrBuilder getSubscriptionOrBuilder();

  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
