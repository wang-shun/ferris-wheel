// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface SubmitFormOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.SubmitForm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sheet_name = 1;</code>
   */
  java.lang.String getSheetName();
  /**
   * <code>string sheet_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getSheetNameBytes();

  /**
   * <code>string form_name = 2;</code>
   */
  java.lang.String getFormName();
  /**
   * <code>string form_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getFormNameBytes();

  /**
   * <code>repeated .ferriswheel.v1.Parameter params = 3;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.Parameter> 
      getParamsList();
  /**
   * <code>repeated .ferriswheel.v1.Parameter params = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Parameter getParams(int index);
  /**
   * <code>repeated .ferriswheel.v1.Parameter params = 3;</code>
   */
  int getParamsCount();
  /**
   * <code>repeated .ferriswheel.v1.Parameter params = 3;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.ParameterOrBuilder> 
      getParamsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.Parameter params = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.ParameterOrBuilder getParamsOrBuilder(
      int index);
}
