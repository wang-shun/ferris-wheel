// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface FormFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.FormField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.ferriswheel.v1.VariantType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <code>.ferriswheel.v1.VariantType type = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.VariantType getType();

  /**
   * <code>.ferriswheel.v1.UnionValue value = 3;</code>
   */
  boolean hasValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValue getValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getValueOrBuilder();

  /**
   * <code>bool mandatory = 4;</code>
   */
  boolean getMandatory();

  /**
   * <code>bool multiple = 5;</code>
   */
  boolean getMultiple();

  /**
   * <code>string label = 6;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 6;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>string tips = 7;</code>
   */
  java.lang.String getTips();
  /**
   * <code>string tips = 7;</code>
   */
  com.google.protobuf.ByteString
      getTipsBytes();

  /**
   * <code>.ferriswheel.v1.UnionValue options = 8;</code>
   */
  boolean hasOptions();
  /**
   * <code>.ferriswheel.v1.UnionValue options = 8;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValue getOptions();
  /**
   * <code>.ferriswheel.v1.UnionValue options = 8;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getOptionsOrBuilder();

  /**
   * <code>repeated .ferriswheel.v1.FormFieldBinding bindings = 9;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.FormFieldBinding> 
      getBindingsList();
  /**
   * <code>repeated .ferriswheel.v1.FormFieldBinding bindings = 9;</code>
   */
  com.ctrip.ferriswheel.proto.v1.FormFieldBinding getBindings(int index);
  /**
   * <code>repeated .ferriswheel.v1.FormFieldBinding bindings = 9;</code>
   */
  int getBindingsCount();
  /**
   * <code>repeated .ferriswheel.v1.FormFieldBinding bindings = 9;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.FormFieldBindingOrBuilder> 
      getBindingsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.FormFieldBinding bindings = 9;</code>
   */
  com.ctrip.ferriswheel.proto.v1.FormFieldBindingOrBuilder getBindingsOrBuilder(
      int index);
}