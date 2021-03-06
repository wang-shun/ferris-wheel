// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface TableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.Table)
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
   * <code>repeated .ferriswheel.v1.Row rows = 2;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.Row> 
      getRowsList();
  /**
   * <code>repeated .ferriswheel.v1.Row rows = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Row getRows(int index);
  /**
   * <code>repeated .ferriswheel.v1.Row rows = 2;</code>
   */
  int getRowsCount();
  /**
   * <code>repeated .ferriswheel.v1.Row rows = 2;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.RowOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.Row rows = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.RowOrBuilder getRowsOrBuilder(
      int index);

  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  boolean hasAutomaton();
  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.TableAutomaton getAutomaton();
  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder getAutomatonOrBuilder();

  /**
   * <code>.ferriswheel.v1.Layout layout = 4;</code>
   */
  boolean hasLayout();
  /**
   * <code>.ferriswheel.v1.Layout layout = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Layout getLayout();
  /**
   * <code>.ferriswheel.v1.Layout layout = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder getLayoutOrBuilder();
}
