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

public interface ListSubscriptionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.ListSubscriptionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of subscriptions.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 1;</code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.Subscription> getSubscriptionsList();
  /**
   *
   *
   * <pre>
   * List of subscriptions.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 1;</code>
   */
  com.google.irm.service.v1alpha2.api.Subscription getSubscriptions(int index);
  /**
   *
   *
   * <pre>
   * List of subscriptions.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 1;</code>
   */
  int getSubscriptionsCount();
  /**
   *
   *
   * <pre>
   * List of subscriptions.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 1;</code>
   */
  java.util.List<? extends com.google.irm.service.v1alpha2.api.SubscriptionOrBuilder>
      getSubscriptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of subscriptions.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Subscription subscriptions = 1;</code>
   */
  com.google.irm.service.v1alpha2.api.SubscriptionOrBuilder getSubscriptionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of subscriptions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of subscriptions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}