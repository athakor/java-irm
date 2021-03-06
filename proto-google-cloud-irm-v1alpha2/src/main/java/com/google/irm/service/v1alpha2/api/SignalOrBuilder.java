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
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

public interface SignalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.Signal)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the signal, for example,
   * "projects/{project_id_or_number}/signals/{signal_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the signal, for example,
   * "projects/{project_id_or_number}/signals/{signal_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Etag to validate the object is unchanged for a read-modify-write operation.
   * An empty etag will overwrite other changes.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Etag to validate the object is unchanged for a read-modify-write operation.
   * An empty etag will overwrite other changes.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Resource name of the incident this signal is currently assigned to.
   * May be empty if signal is unassigned.
   * </pre>
   *
   * <code>string incident = 3;</code>
   *
   * @return The incident.
   */
  java.lang.String getIncident();
  /**
   *
   *
   * <pre>
   * Resource name of the incident this signal is currently assigned to.
   * May be empty if signal is unassigned.
   * </pre>
   *
   * <code>string incident = 3;</code>
   *
   * @return The bytes for incident.
   */
  com.google.protobuf.ByteString getIncidentBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time this signal was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time this signal was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time this signal was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time this signal was closed. This field is not populated
   * while the signal is still firing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp close_time = 10;</code>
   *
   * @return Whether the closeTime field is set.
   */
  boolean hasCloseTime();
  /**
   *
   *
   * <pre>
   * Output only. Time this signal was closed. This field is not populated
   * while the signal is still firing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp close_time = 10;</code>
   *
   * @return The closeTime.
   */
  com.google.protobuf.Timestamp getCloseTime();
  /**
   *
   *
   * <pre>
   * Output only. Time this signal was closed. This field is not populated
   * while the signal is still firing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp close_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCloseTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time this Signal was first detected. This is identical to create_time
   * for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 15;</code>
   *
   * @return Whether the detectTime field is set.
   */
  boolean hasDetectTime();
  /**
   *
   *
   * <pre>
   * The time this Signal was first detected. This is identical to create_time
   * for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 15;</code>
   *
   * @return The detectTime.
   */
  com.google.protobuf.Timestamp getDetectTime();
  /**
   *
   *
   * <pre>
   * The time this Signal was first detected. This is identical to create_time
   * for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 15;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDetectTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The user that created this signal for manually created
   * signals. Empty if this signal was generated by a system (for example,
   * Stackdriver Alerting).
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User creator = 5;</code>
   *
   * @return Whether the creator field is set.
   */
  boolean hasCreator();
  /**
   *
   *
   * <pre>
   * Output only. The user that created this signal for manually created
   * signals. Empty if this signal was generated by a system (for example,
   * Stackdriver Alerting).
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User creator = 5;</code>
   *
   * @return The creator.
   */
  com.google.irm.service.v1alpha2.api.User getCreator();
  /**
   *
   *
   * <pre>
   * Output only. The user that created this signal for manually created
   * signals. Empty if this signal was generated by a system (for example,
   * Stackdriver Alerting).
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User creator = 5;</code>
   */
  com.google.irm.service.v1alpha2.api.UserOrBuilder getCreatorOrBuilder();

  /**
   *
   *
   * <pre>
   * One-line summary of the signal.
   * Immutable.
   * </pre>
   *
   * <code>string title = 6;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * One-line summary of the signal.
   * Immutable.
   * </pre>
   *
   * <code>string title = 6;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Content type string. 'text/plain' is currently the only supported content
   * type for Signals created via the API. Signals created by Stackdriver
   * Alerting support 'text/html' as well. Immutable for Signals created by
   * Stackdriver Alerting.
   * </pre>
   *
   * <code>string content_type = 7;</code>
   *
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   *
   *
   * <pre>
   * Content type string. 'text/plain' is currently the only supported content
   * type for Signals created via the API. Signals created by Stackdriver
   * Alerting support 'text/html' as well. Immutable for Signals created by
   * Stackdriver Alerting.
   * </pre>
   *
   * <code>string content_type = 7;</code>
   *
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString getContentTypeBytes();

  /**
   *
   *
   * <pre>
   * Full message of the signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>string content = 8;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Full message of the signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>string content = 8;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The state of this signal.
   * For Signals created by Stackdriver Alerting this field is output only.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.Signal.State signal_state = 9;</code>
   *
   * @return The enum numeric value on the wire for signalState.
   */
  int getSignalStateValue();
  /**
   *
   *
   * <pre>
   * The state of this signal.
   * For Signals created by Stackdriver Alerting this field is output only.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.Signal.State signal_state = 9;</code>
   *
   * @return The signalState.
   */
  com.google.irm.service.v1alpha2.api.Signal.State getSignalState();

  /**
   *
   *
   * <pre>
   * A set of artifacts to additional resources for this Signal. For example, a
   * link to Stackdriver logging for the Signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal.SignalArtifact signal_artifacts = 16;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Signal.SignalArtifact>
      getSignalArtifactsList();
  /**
   *
   *
   * <pre>
   * A set of artifacts to additional resources for this Signal. For example, a
   * link to Stackdriver logging for the Signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal.SignalArtifact signal_artifacts = 16;</code>
   */
  com.google.irm.service.v1alpha2.api.Signal.SignalArtifact getSignalArtifacts(int index);
  /**
   *
   *
   * <pre>
   * A set of artifacts to additional resources for this Signal. For example, a
   * link to Stackdriver logging for the Signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal.SignalArtifact signal_artifacts = 16;</code>
   */
  int getSignalArtifactsCount();
  /**
   *
   *
   * <pre>
   * A set of artifacts to additional resources for this Signal. For example, a
   * link to Stackdriver logging for the Signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal.SignalArtifact signal_artifacts = 16;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.Signal.SignalArtifactOrBuilder>
      getSignalArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A set of artifacts to additional resources for this Signal. For example, a
   * link to Stackdriver logging for the Signal.
   * Immutable for Signals created by Stackdriver Alerting.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal.SignalArtifact signal_artifacts = 16;</code>
   */
  com.google.irm.service.v1alpha2.api.Signal.SignalArtifactOrBuilder getSignalArtifactsOrBuilder(
      int index);
}
