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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface BuildArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.BuildArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Image name in Skaffold configuration.
   * </pre>
   *
   * <code>string image = 3;</code>
   *
   * @return The image.
   */
  java.lang.String getImage();
  /**
   *
   *
   * <pre>
   * Image name in Skaffold configuration.
   * </pre>
   *
   * <code>string image = 3;</code>
   *
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString getImageBytes();

  /**
   *
   *
   * <pre>
   * Image tag to use. This will generally be the full path to an image, such
   * as "gcr.io/my-project/busybox:1.2.3" or
   * "gcr.io/my-project/busybox&#64;sha256:abc123".
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   *
   *
   * <pre>
   * Image tag to use. This will generally be the full path to an image, such
   * as "gcr.io/my-project/busybox:1.2.3" or
   * "gcr.io/my-project/busybox&#64;sha256:abc123".
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString getTagBytes();
}
