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

public interface EscalateIncidentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.EscalateIncidentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The incident to escalate with the new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Incident incident = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the incident field is set.
   */
  boolean hasIncident();
  /**
   *
   *
   * <pre>
   * Required. The incident to escalate with the new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Incident incident = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The incident.
   */
  com.google.irm.service.v1alpha2.api.Incident getIncident();
  /**
   *
   *
   * <pre>
   * Required. The incident to escalate with the new values.
   * </pre>
   *
   * <code>
   * .google.cloud.irm.v1alpha2.Incident incident = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.irm.service.v1alpha2.api.IncidentOrBuilder getIncidentOrBuilder();

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

  /**
   *
   *
   * <pre>
   * Subscriptions to add or update. Existing subscriptions with the same
   * channel and address as a subscription in the list will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 3;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Subscription> getSubscriptionsList();
  /**
   *
   *
   * <pre>
   * Subscriptions to add or update. Existing subscriptions with the same
   * channel and address as a subscription in the list will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 3;</code>
   */
  com.google.irm.service.v1alpha2.api.Subscription getSubscriptions(int index);
  /**
   *
   *
   * <pre>
   * Subscriptions to add or update. Existing subscriptions with the same
   * channel and address as a subscription in the list will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 3;</code>
   */
  int getSubscriptionsCount();
  /**
   *
   *
   * <pre>
   * Subscriptions to add or update. Existing subscriptions with the same
   * channel and address as a subscription in the list will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 3;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.SubscriptionOrBuilder>
      getSubscriptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Subscriptions to add or update. Existing subscriptions with the same
   * channel and address as a subscription in the list will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 3;</code>
   */
  com.google.irm.service.v1alpha2.api.SubscriptionOrBuilder getSubscriptionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Tags to add. Tags identical to existing tags will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Tag tags = 4;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Tag> getTagsList();
  /**
   *
   *
   * <pre>
   * Tags to add. Tags identical to existing tags will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Tag tags = 4;</code>
   */
  com.google.irm.service.v1alpha2.api.Tag getTags(int index);
  /**
   *
   *
   * <pre>
   * Tags to add. Tags identical to existing tags will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Tag tags = 4;</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Tags to add. Tags identical to existing tags will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Tag tags = 4;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.TagOrBuilder> getTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Tags to add. Tags identical to existing tags will be ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Tag tags = 4;</code>
   */
  com.google.irm.service.v1alpha2.api.TagOrBuilder getTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Roles to add or update. Existing roles with the same type (and title, for
   * TYPE_OTHER roles) will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.IncidentRoleAssignment roles = 5;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.IncidentRoleAssignment> getRolesList();
  /**
   *
   *
   * <pre>
   * Roles to add or update. Existing roles with the same type (and title, for
   * TYPE_OTHER roles) will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.IncidentRoleAssignment roles = 5;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRoleAssignment getRoles(int index);
  /**
   *
   *
   * <pre>
   * Roles to add or update. Existing roles with the same type (and title, for
   * TYPE_OTHER roles) will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.IncidentRoleAssignment roles = 5;</code>
   */
  int getRolesCount();
  /**
   *
   *
   * <pre>
   * Roles to add or update. Existing roles with the same type (and title, for
   * TYPE_OTHER roles) will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.IncidentRoleAssignment roles = 5;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder>
      getRolesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Roles to add or update. Existing roles with the same type (and title, for
   * TYPE_OTHER roles) will be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.IncidentRoleAssignment roles = 5;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder getRolesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Artifacts to add. All artifacts are added without checking for duplicates.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 6;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Artifact> getArtifactsList();
  /**
   *
   *
   * <pre>
   * Artifacts to add. All artifacts are added without checking for duplicates.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 6;</code>
   */
  com.google.irm.service.v1alpha2.api.Artifact getArtifacts(int index);
  /**
   *
   *
   * <pre>
   * Artifacts to add. All artifacts are added without checking for duplicates.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 6;</code>
   */
  int getArtifactsCount();
  /**
   *
   *
   * <pre>
   * Artifacts to add. All artifacts are added without checking for duplicates.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 6;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
      getArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Artifacts to add. All artifacts are added without checking for duplicates.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 6;</code>
   */
  com.google.irm.service.v1alpha2.api.ArtifactOrBuilder getArtifactsOrBuilder(int index);
}
