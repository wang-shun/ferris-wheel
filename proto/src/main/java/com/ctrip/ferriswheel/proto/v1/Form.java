// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.Form}
 */
public  final class Form extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.Form)
    FormOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Form.newBuilder() to construct.
  private Form(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Form() {
    name_ = "";
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Form(
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

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              fields_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.FormField>();
              mutable_bitField0_ |= 0x00000002;
            }
            fields_.add(
                input.readMessage(com.ctrip.ferriswheel.proto.v1.FormField.parser(), extensionRegistry));
            break;
          }
          case 26: {
            com.ctrip.ferriswheel.proto.v1.Layout.Builder subBuilder = null;
            if (layout_ != null) {
              subBuilder = layout_.toBuilder();
            }
            layout_ = input.readMessage(com.ctrip.ferriswheel.proto.v1.Layout.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(layout_);
              layout_ = subBuilder.buildPartial();
            }

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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Form_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Form_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.Form.class, com.ctrip.ferriswheel.proto.v1.Form.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  private java.util.List<com.ctrip.ferriswheel.proto.v1.FormField> fields_;
  /**
   * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
   */
  public java.util.List<com.ctrip.ferriswheel.proto.v1.FormField> getFieldsList() {
    return fields_;
  }
  /**
   * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
   */
  public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
   */
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.FormField getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
  }

  public static final int LAYOUT_FIELD_NUMBER = 3;
  private com.ctrip.ferriswheel.proto.v1.Layout layout_;
  /**
   * <code>.ferriswheel.v1.Layout layout = 3;</code>
   */
  public boolean hasLayout() {
    return layout_ != null;
  }
  /**
   * <code>.ferriswheel.v1.Layout layout = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.Layout getLayout() {
    return layout_ == null ? com.ctrip.ferriswheel.proto.v1.Layout.getDefaultInstance() : layout_;
  }
  /**
   * <code>.ferriswheel.v1.Layout layout = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder getLayoutOrBuilder() {
    return getLayout();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(2, fields_.get(i));
    }
    if (layout_ != null) {
      output.writeMessage(3, getLayout());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fields_.get(i));
    }
    if (layout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLayout());
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.Form)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.Form other = (com.ctrip.ferriswheel.proto.v1.Form) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
    if (hasLayout() != other.hasLayout()) return false;
    if (hasLayout()) {
      if (!getLayout()
          .equals(other.getLayout())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    if (hasLayout()) {
      hash = (37 * hash) + LAYOUT_FIELD_NUMBER;
      hash = (53 * hash) + getLayout().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Form parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.Form prototype) {
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
   * Protobuf type {@code ferriswheel.v1.Form}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.Form)
      com.ctrip.ferriswheel.proto.v1.FormOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Form_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Form_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.Form.class, com.ctrip.ferriswheel.proto.v1.Form.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.Form.newBuilder()
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
        getFieldsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        fieldsBuilder_.clear();
      }
      if (layoutBuilder_ == null) {
        layout_ = null;
      } else {
        layout_ = null;
        layoutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Form_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Form getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.Form.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Form build() {
      com.ctrip.ferriswheel.proto.v1.Form result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Form buildPartial() {
      com.ctrip.ferriswheel.proto.v1.Form result = new com.ctrip.ferriswheel.proto.v1.Form(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
      if (layoutBuilder_ == null) {
        result.layout_ = layout_;
      } else {
        result.layout_ = layoutBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.Form) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.Form)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.Form other) {
      if (other == com.ctrip.ferriswheel.proto.v1.Form.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000002);
            fieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldsFieldBuilder() : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
          }
        }
      }
      if (other.hasLayout()) {
        mergeLayout(other.getLayout());
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
      com.ctrip.ferriswheel.proto.v1.Form parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.Form) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.ferriswheel.proto.v1.FormField> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fields_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.FormField>(fields_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.FormField, com.ctrip.ferriswheel.proto.v1.FormField.Builder, com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder> fieldsBuilder_;

    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.FormField> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.FormField getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder setFields(
        int index, com.ctrip.ferriswheel.proto.v1.FormField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder setFields(
        int index, com.ctrip.ferriswheel.proto.v1.FormField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder addFields(com.ctrip.ferriswheel.proto.v1.FormField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder addFields(
        int index, com.ctrip.ferriswheel.proto.v1.FormField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder addFields(
        com.ctrip.ferriswheel.proto.v1.FormField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder addFields(
        int index, com.ctrip.ferriswheel.proto.v1.FormField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends com.ctrip.ferriswheel.proto.v1.FormField> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.FormField.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder> 
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.FormField.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          com.ctrip.ferriswheel.proto.v1.FormField.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.FormField.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, com.ctrip.ferriswheel.proto.v1.FormField.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.FormField fields = 2;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.FormField.Builder> 
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.FormField, com.ctrip.ferriswheel.proto.v1.FormField.Builder, com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder> 
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.FormField, com.ctrip.ferriswheel.proto.v1.FormField.Builder, com.ctrip.ferriswheel.proto.v1.FormFieldOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
    }

    private com.ctrip.ferriswheel.proto.v1.Layout layout_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Layout, com.ctrip.ferriswheel.proto.v1.Layout.Builder, com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder> layoutBuilder_;
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public boolean hasLayout() {
      return layoutBuilder_ != null || layout_ != null;
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Layout getLayout() {
      if (layoutBuilder_ == null) {
        return layout_ == null ? com.ctrip.ferriswheel.proto.v1.Layout.getDefaultInstance() : layout_;
      } else {
        return layoutBuilder_.getMessage();
      }
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public Builder setLayout(com.ctrip.ferriswheel.proto.v1.Layout value) {
      if (layoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        layout_ = value;
        onChanged();
      } else {
        layoutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public Builder setLayout(
        com.ctrip.ferriswheel.proto.v1.Layout.Builder builderForValue) {
      if (layoutBuilder_ == null) {
        layout_ = builderForValue.build();
        onChanged();
      } else {
        layoutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public Builder mergeLayout(com.ctrip.ferriswheel.proto.v1.Layout value) {
      if (layoutBuilder_ == null) {
        if (layout_ != null) {
          layout_ =
            com.ctrip.ferriswheel.proto.v1.Layout.newBuilder(layout_).mergeFrom(value).buildPartial();
        } else {
          layout_ = value;
        }
        onChanged();
      } else {
        layoutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public Builder clearLayout() {
      if (layoutBuilder_ == null) {
        layout_ = null;
        onChanged();
      } else {
        layout_ = null;
        layoutBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Layout.Builder getLayoutBuilder() {
      
      onChanged();
      return getLayoutFieldBuilder().getBuilder();
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder getLayoutOrBuilder() {
      if (layoutBuilder_ != null) {
        return layoutBuilder_.getMessageOrBuilder();
      } else {
        return layout_ == null ?
            com.ctrip.ferriswheel.proto.v1.Layout.getDefaultInstance() : layout_;
      }
    }
    /**
     * <code>.ferriswheel.v1.Layout layout = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Layout, com.ctrip.ferriswheel.proto.v1.Layout.Builder, com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder> 
        getLayoutFieldBuilder() {
      if (layoutBuilder_ == null) {
        layoutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.Layout, com.ctrip.ferriswheel.proto.v1.Layout.Builder, com.ctrip.ferriswheel.proto.v1.LayoutOrBuilder>(
                getLayout(),
                getParentForChildren(),
                isClean());
        layout_ = null;
      }
      return layoutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.Form)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.Form)
  private static final com.ctrip.ferriswheel.proto.v1.Form DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.Form();
  }

  public static com.ctrip.ferriswheel.proto.v1.Form getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Form>
      PARSER = new com.google.protobuf.AbstractParser<Form>() {
    @java.lang.Override
    public Form parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Form(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Form> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Form> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.Form getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
