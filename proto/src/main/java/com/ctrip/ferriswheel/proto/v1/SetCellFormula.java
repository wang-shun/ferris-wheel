// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * <pre>
 * set formula
 * </pre>
 *
 * Protobuf type {@code ferriswheel.v1.SetCellFormula}
 */
public  final class SetCellFormula extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.SetCellFormula)
    SetCellFormulaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetCellFormula.newBuilder() to construct.
  private SetCellFormula(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetCellFormula() {
    sheetName_ = "";
    tableName_ = "";
    formulaString_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetCellFormula(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sheetName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tableName_ = s;
            break;
          }
          case 24: {

            rowIndex_ = input.readInt32();
            break;
          }
          case 32: {

            columnIndex_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            formulaString_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_SetCellFormula_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_SetCellFormula_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.SetCellFormula.class, com.ctrip.ferriswheel.proto.v1.SetCellFormula.Builder.class);
  }

  public static final int SHEET_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object sheetName_;
  /**
   * <code>string sheet_name = 1;</code>
   */
  public java.lang.String getSheetName() {
    java.lang.Object ref = sheetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sheetName_ = s;
      return s;
    }
  }
  /**
   * <code>string sheet_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSheetNameBytes() {
    java.lang.Object ref = sheetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sheetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string table_name = 2;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string table_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_INDEX_FIELD_NUMBER = 3;
  private int rowIndex_;
  /**
   * <code>int32 row_index = 3;</code>
   */
  public int getRowIndex() {
    return rowIndex_;
  }

  public static final int COLUMN_INDEX_FIELD_NUMBER = 4;
  private int columnIndex_;
  /**
   * <code>int32 column_index = 4;</code>
   */
  public int getColumnIndex() {
    return columnIndex_;
  }

  public static final int FORMULA_STRING_FIELD_NUMBER = 5;
  private volatile java.lang.Object formulaString_;
  /**
   * <code>string formula_string = 5;</code>
   */
  public java.lang.String getFormulaString() {
    java.lang.Object ref = formulaString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      formulaString_ = s;
      return s;
    }
  }
  /**
   * <code>string formula_string = 5;</code>
   */
  public com.google.protobuf.ByteString
      getFormulaStringBytes() {
    java.lang.Object ref = formulaString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      formulaString_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSheetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sheetName_);
    }
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tableName_);
    }
    if (rowIndex_ != 0) {
      output.writeInt32(3, rowIndex_);
    }
    if (columnIndex_ != 0) {
      output.writeInt32(4, columnIndex_);
    }
    if (!getFormulaStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, formulaString_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSheetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sheetName_);
    }
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tableName_);
    }
    if (rowIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, rowIndex_);
    }
    if (columnIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, columnIndex_);
    }
    if (!getFormulaStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, formulaString_);
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.SetCellFormula)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.SetCellFormula other = (com.ctrip.ferriswheel.proto.v1.SetCellFormula) obj;

    if (!getSheetName()
        .equals(other.getSheetName())) return false;
    if (!getTableName()
        .equals(other.getTableName())) return false;
    if (getRowIndex()
        != other.getRowIndex()) return false;
    if (getColumnIndex()
        != other.getColumnIndex()) return false;
    if (!getFormulaString()
        .equals(other.getFormulaString())) return false;
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
    hash = (37 * hash) + SHEET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSheetName().hashCode();
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (37 * hash) + ROW_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getRowIndex();
    hash = (37 * hash) + COLUMN_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getColumnIndex();
    hash = (37 * hash) + FORMULA_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getFormulaString().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.SetCellFormula prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * set formula
   * </pre>
   *
   * Protobuf type {@code ferriswheel.v1.SetCellFormula}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.SetCellFormula)
      com.ctrip.ferriswheel.proto.v1.SetCellFormulaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_SetCellFormula_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_SetCellFormula_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.SetCellFormula.class, com.ctrip.ferriswheel.proto.v1.SetCellFormula.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.SetCellFormula.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sheetName_ = "";

      tableName_ = "";

      rowIndex_ = 0;

      columnIndex_ = 0;

      formulaString_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_SetCellFormula_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.SetCellFormula getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.SetCellFormula.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.SetCellFormula build() {
      com.ctrip.ferriswheel.proto.v1.SetCellFormula result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.SetCellFormula buildPartial() {
      com.ctrip.ferriswheel.proto.v1.SetCellFormula result = new com.ctrip.ferriswheel.proto.v1.SetCellFormula(this);
      result.sheetName_ = sheetName_;
      result.tableName_ = tableName_;
      result.rowIndex_ = rowIndex_;
      result.columnIndex_ = columnIndex_;
      result.formulaString_ = formulaString_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.ferriswheel.proto.v1.SetCellFormula) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.SetCellFormula)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.SetCellFormula other) {
      if (other == com.ctrip.ferriswheel.proto.v1.SetCellFormula.getDefaultInstance()) return this;
      if (!other.getSheetName().isEmpty()) {
        sheetName_ = other.sheetName_;
        onChanged();
      }
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.getRowIndex() != 0) {
        setRowIndex(other.getRowIndex());
      }
      if (other.getColumnIndex() != 0) {
        setColumnIndex(other.getColumnIndex());
      }
      if (!other.getFormulaString().isEmpty()) {
        formulaString_ = other.formulaString_;
        onChanged();
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
      com.ctrip.ferriswheel.proto.v1.SetCellFormula parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.SetCellFormula) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sheetName_ = "";
    /**
     * <code>string sheet_name = 1;</code>
     */
    public java.lang.String getSheetName() {
      java.lang.Object ref = sheetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sheetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSheetNameBytes() {
      java.lang.Object ref = sheetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sheetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder setSheetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sheetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder clearSheetName() {
      
      sheetName_ = getDefaultInstance().getSheetName();
      onChanged();
      return this;
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder setSheetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sheetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tableName_ = "";
    /**
     * <code>string table_name = 2;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    private int rowIndex_ ;
    /**
     * <code>int32 row_index = 3;</code>
     */
    public int getRowIndex() {
      return rowIndex_;
    }
    /**
     * <code>int32 row_index = 3;</code>
     */
    public Builder setRowIndex(int value) {
      
      rowIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 row_index = 3;</code>
     */
    public Builder clearRowIndex() {
      
      rowIndex_ = 0;
      onChanged();
      return this;
    }

    private int columnIndex_ ;
    /**
     * <code>int32 column_index = 4;</code>
     */
    public int getColumnIndex() {
      return columnIndex_;
    }
    /**
     * <code>int32 column_index = 4;</code>
     */
    public Builder setColumnIndex(int value) {
      
      columnIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 column_index = 4;</code>
     */
    public Builder clearColumnIndex() {
      
      columnIndex_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object formulaString_ = "";
    /**
     * <code>string formula_string = 5;</code>
     */
    public java.lang.String getFormulaString() {
      java.lang.Object ref = formulaString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        formulaString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string formula_string = 5;</code>
     */
    public com.google.protobuf.ByteString
        getFormulaStringBytes() {
      java.lang.Object ref = formulaString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        formulaString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string formula_string = 5;</code>
     */
    public Builder setFormulaString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formulaString_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string formula_string = 5;</code>
     */
    public Builder clearFormulaString() {
      
      formulaString_ = getDefaultInstance().getFormulaString();
      onChanged();
      return this;
    }
    /**
     * <code>string formula_string = 5;</code>
     */
    public Builder setFormulaStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formulaString_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.SetCellFormula)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.SetCellFormula)
  private static final com.ctrip.ferriswheel.proto.v1.SetCellFormula DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.SetCellFormula();
  }

  public static com.ctrip.ferriswheel.proto.v1.SetCellFormula getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetCellFormula>
      PARSER = new com.google.protobuf.AbstractParser<SetCellFormula>() {
    @java.lang.Override
    public SetCellFormula parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetCellFormula(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetCellFormula> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetCellFormula> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.SetCellFormula getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

