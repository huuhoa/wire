// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/interceptors.proto
package com.squareup.wire.protos.interceptors;

import com.google.protobuf.FieldOptions;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.Extension;

public final class Ext_interceptors {

  private Ext_interceptors() {
  }

  public static final Extension<MessageOptions, Boolean> encrypt_payload = Extension
      .boolExtending(MessageOptions.class)
      .setName("squareup.protos.interceptors.encrypt_payload")
      .setTag(60000)
      .buildOptional();
  public static final Extension<FieldOptions, Boolean> encrypted = Extension
      .boolExtending(FieldOptions.class)
      .setName("squareup.protos.interceptors.encrypted")
      .setTag(60001)
      .buildOptional();
}