// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: road.proto

package gazebo.msgs;

public final class GzRoad {
  private GzRoad() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RoadOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string name = 1;
    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // required double width = 2;
    /**
     * <code>required double width = 2;</code>
     */
    boolean hasWidth();
    /**
     * <code>required double width = 2;</code>
     */
    double getWidth();

    // repeated .gazebo.msgs.Vector3d point = 3;
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    java.util.List<gazebo.msgs.GzVector3d.Vector3d> 
        getPointList();
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3d getPoint(int index);
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    int getPointCount();
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    java.util.List<? extends gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
        getPointOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3dOrBuilder getPointOrBuilder(
        int index);

    // optional .gazebo.msgs.Material material = 4;
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    boolean hasMaterial();
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    gazebo.msgs.GzMaterial.Material getMaterial();
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    gazebo.msgs.GzMaterial.MaterialOrBuilder getMaterialOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Road}
   */
  public static final class Road extends
      com.google.protobuf.GeneratedMessage
      implements RoadOrBuilder {
    // Use Road.newBuilder() to construct.
    private Road(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Road(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Road defaultInstance;
    public static Road getDefaultInstance() {
      return defaultInstance;
    }

    public Road getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Road(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              width_ = input.readDouble();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                point_ = new java.util.ArrayList<gazebo.msgs.GzVector3d.Vector3d>();
                mutable_bitField0_ |= 0x00000004;
              }
              point_.add(input.readMessage(gazebo.msgs.GzVector3d.Vector3d.PARSER, extensionRegistry));
              break;
            }
            case 34: {
              gazebo.msgs.GzMaterial.Material.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = material_.toBuilder();
              }
              material_ = input.readMessage(gazebo.msgs.GzMaterial.Material.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(material_);
                material_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          point_ = java.util.Collections.unmodifiableList(point_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzRoad.internal_static_gazebo_msgs_Road_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzRoad.internal_static_gazebo_msgs_Road_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzRoad.Road.class, gazebo.msgs.GzRoad.Road.Builder.class);
    }

    public static com.google.protobuf.Parser<Road> PARSER =
        new com.google.protobuf.AbstractParser<Road>() {
      public Road parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Road(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Road> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
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

    // required double width = 2;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private double width_;
    /**
     * <code>required double width = 2;</code>
     */
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double width = 2;</code>
     */
    public double getWidth() {
      return width_;
    }

    // repeated .gazebo.msgs.Vector3d point = 3;
    public static final int POINT_FIELD_NUMBER = 3;
    private java.util.List<gazebo.msgs.GzVector3d.Vector3d> point_;
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    public java.util.List<gazebo.msgs.GzVector3d.Vector3d> getPointList() {
      return point_;
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    public java.util.List<? extends gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
        getPointOrBuilderList() {
      return point_;
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    public int getPointCount() {
      return point_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3d getPoint(int index) {
      return point_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3dOrBuilder getPointOrBuilder(
        int index) {
      return point_.get(index);
    }

    // optional .gazebo.msgs.Material material = 4;
    public static final int MATERIAL_FIELD_NUMBER = 4;
    private gazebo.msgs.GzMaterial.Material material_;
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    public boolean hasMaterial() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    public gazebo.msgs.GzMaterial.Material getMaterial() {
      return material_;
    }
    /**
     * <code>optional .gazebo.msgs.Material material = 4;</code>
     */
    public gazebo.msgs.GzMaterial.MaterialOrBuilder getMaterialOrBuilder() {
      return material_;
    }

    private void initFields() {
      name_ = "";
      width_ = 0D;
      point_ = java.util.Collections.emptyList();
      material_ = gazebo.msgs.GzMaterial.Material.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWidth()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPointCount(); i++) {
        if (!getPoint(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasMaterial()) {
        if (!getMaterial().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, width_);
      }
      for (int i = 0; i < point_.size(); i++) {
        output.writeMessage(3, point_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, material_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, width_);
      }
      for (int i = 0; i < point_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, point_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, material_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gazebo.msgs.GzRoad.Road parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzRoad.Road parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzRoad.Road parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzRoad.Road parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzRoad.Road prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.Road}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzRoad.RoadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzRoad.internal_static_gazebo_msgs_Road_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzRoad.internal_static_gazebo_msgs_Road_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzRoad.Road.class, gazebo.msgs.GzRoad.Road.Builder.class);
      }

      // Construct using gazebo.msgs.GzRoad.Road.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPointFieldBuilder();
          getMaterialFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        width_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (pointBuilder_ == null) {
          point_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          pointBuilder_.clear();
        }
        if (materialBuilder_ == null) {
          material_ = gazebo.msgs.GzMaterial.Material.getDefaultInstance();
        } else {
          materialBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzRoad.internal_static_gazebo_msgs_Road_descriptor;
      }

      public gazebo.msgs.GzRoad.Road getDefaultInstanceForType() {
        return gazebo.msgs.GzRoad.Road.getDefaultInstance();
      }

      public gazebo.msgs.GzRoad.Road build() {
        gazebo.msgs.GzRoad.Road result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzRoad.Road buildPartial() {
        gazebo.msgs.GzRoad.Road result = new gazebo.msgs.GzRoad.Road(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.width_ = width_;
        if (pointBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            point_ = java.util.Collections.unmodifiableList(point_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.point_ = point_;
        } else {
          result.point_ = pointBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        if (materialBuilder_ == null) {
          result.material_ = material_;
        } else {
          result.material_ = materialBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzRoad.Road) {
          return mergeFrom((gazebo.msgs.GzRoad.Road)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzRoad.Road other) {
        if (other == gazebo.msgs.GzRoad.Road.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasWidth()) {
          setWidth(other.getWidth());
        }
        if (pointBuilder_ == null) {
          if (!other.point_.isEmpty()) {
            if (point_.isEmpty()) {
              point_ = other.point_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePointIsMutable();
              point_.addAll(other.point_);
            }
            onChanged();
          }
        } else {
          if (!other.point_.isEmpty()) {
            if (pointBuilder_.isEmpty()) {
              pointBuilder_.dispose();
              pointBuilder_ = null;
              point_ = other.point_;
              bitField0_ = (bitField0_ & ~0x00000004);
              pointBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPointFieldBuilder() : null;
            } else {
              pointBuilder_.addAllMessages(other.point_);
            }
          }
        }
        if (other.hasMaterial()) {
          mergeMaterial(other.getMaterial());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasWidth()) {
          
          return false;
        }
        for (int i = 0; i < getPointCount(); i++) {
          if (!getPoint(i).isInitialized()) {
            
            return false;
          }
        }
        if (hasMaterial()) {
          if (!getMaterial().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzRoad.Road parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzRoad.Road) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string name = 1;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
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
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // required double width = 2;
      private double width_ ;
      /**
       * <code>required double width = 2;</code>
       */
      public boolean hasWidth() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double width = 2;</code>
       */
      public double getWidth() {
        return width_;
      }
      /**
       * <code>required double width = 2;</code>
       */
      public Builder setWidth(double value) {
        bitField0_ |= 0x00000002;
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double width = 2;</code>
       */
      public Builder clearWidth() {
        bitField0_ = (bitField0_ & ~0x00000002);
        width_ = 0D;
        onChanged();
        return this;
      }

      // repeated .gazebo.msgs.Vector3d point = 3;
      private java.util.List<gazebo.msgs.GzVector3d.Vector3d> point_ =
        java.util.Collections.emptyList();
      private void ensurePointIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          point_ = new java.util.ArrayList<gazebo.msgs.GzVector3d.Vector3d>(point_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> pointBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public java.util.List<gazebo.msgs.GzVector3d.Vector3d> getPointList() {
        if (pointBuilder_ == null) {
          return java.util.Collections.unmodifiableList(point_);
        } else {
          return pointBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public int getPointCount() {
        if (pointBuilder_ == null) {
          return point_.size();
        } else {
          return pointBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d getPoint(int index) {
        if (pointBuilder_ == null) {
          return point_.get(index);
        } else {
          return pointBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder setPoint(
          int index, gazebo.msgs.GzVector3d.Vector3d value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.set(index, value);
          onChanged();
        } else {
          pointBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder setPoint(
          int index, gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder addPoint(gazebo.msgs.GzVector3d.Vector3d value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.add(value);
          onChanged();
        } else {
          pointBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder addPoint(
          int index, gazebo.msgs.GzVector3d.Vector3d value) {
        if (pointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointIsMutable();
          point_.add(index, value);
          onChanged();
        } else {
          pointBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder addPoint(
          gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.add(builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder addPoint(
          int index, gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder addAllPoint(
          java.lang.Iterable<? extends gazebo.msgs.GzVector3d.Vector3d> values) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          super.addAll(values, point_);
          onChanged();
        } else {
          pointBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder clearPoint() {
        if (pointBuilder_ == null) {
          point_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          pointBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public Builder removePoint(int index) {
        if (pointBuilder_ == null) {
          ensurePointIsMutable();
          point_.remove(index);
          onChanged();
        } else {
          pointBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder getPointBuilder(
          int index) {
        return getPointFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3dOrBuilder getPointOrBuilder(
          int index) {
        if (pointBuilder_ == null) {
          return point_.get(index);  } else {
          return pointBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public java.util.List<? extends gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
           getPointOrBuilderList() {
        if (pointBuilder_ != null) {
          return pointBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(point_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder addPointBuilder() {
        return getPointFieldBuilder().addBuilder(
            gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder addPointBuilder(
          int index) {
        return getPointFieldBuilder().addBuilder(
            index, gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Vector3d point = 3;</code>
       */
      public java.util.List<gazebo.msgs.GzVector3d.Vector3d.Builder> 
           getPointBuilderList() {
        return getPointFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
          getPointFieldBuilder() {
        if (pointBuilder_ == null) {
          pointBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder>(
                  point_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          point_ = null;
        }
        return pointBuilder_;
      }

      // optional .gazebo.msgs.Material material = 4;
      private gazebo.msgs.GzMaterial.Material material_ = gazebo.msgs.GzMaterial.Material.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzMaterial.Material, gazebo.msgs.GzMaterial.Material.Builder, gazebo.msgs.GzMaterial.MaterialOrBuilder> materialBuilder_;
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public boolean hasMaterial() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public gazebo.msgs.GzMaterial.Material getMaterial() {
        if (materialBuilder_ == null) {
          return material_;
        } else {
          return materialBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public Builder setMaterial(gazebo.msgs.GzMaterial.Material value) {
        if (materialBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          material_ = value;
          onChanged();
        } else {
          materialBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public Builder setMaterial(
          gazebo.msgs.GzMaterial.Material.Builder builderForValue) {
        if (materialBuilder_ == null) {
          material_ = builderForValue.build();
          onChanged();
        } else {
          materialBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public Builder mergeMaterial(gazebo.msgs.GzMaterial.Material value) {
        if (materialBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              material_ != gazebo.msgs.GzMaterial.Material.getDefaultInstance()) {
            material_ =
              gazebo.msgs.GzMaterial.Material.newBuilder(material_).mergeFrom(value).buildPartial();
          } else {
            material_ = value;
          }
          onChanged();
        } else {
          materialBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public Builder clearMaterial() {
        if (materialBuilder_ == null) {
          material_ = gazebo.msgs.GzMaterial.Material.getDefaultInstance();
          onChanged();
        } else {
          materialBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public gazebo.msgs.GzMaterial.Material.Builder getMaterialBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getMaterialFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      public gazebo.msgs.GzMaterial.MaterialOrBuilder getMaterialOrBuilder() {
        if (materialBuilder_ != null) {
          return materialBuilder_.getMessageOrBuilder();
        } else {
          return material_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Material material = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzMaterial.Material, gazebo.msgs.GzMaterial.Material.Builder, gazebo.msgs.GzMaterial.MaterialOrBuilder> 
          getMaterialFieldBuilder() {
        if (materialBuilder_ == null) {
          materialBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzMaterial.Material, gazebo.msgs.GzMaterial.Material.Builder, gazebo.msgs.GzMaterial.MaterialOrBuilder>(
                  material_,
                  getParentForChildren(),
                  isClean());
          material_ = null;
        }
        return materialBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Road)
    }

    static {
      defaultInstance = new Road(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Road)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Road_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Road_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nroad.proto\022\013gazebo.msgs\032\016vector3d.prot" +
      "o\032\016material.proto\"r\n\004Road\022\014\n\004name\030\001 \002(\t\022" +
      "\r\n\005width\030\002 \002(\001\022$\n\005point\030\003 \003(\0132\025.gazebo.m" +
      "sgs.Vector3d\022\'\n\010material\030\004 \001(\0132\025.gazebo." +
      "msgs.MaterialB\010B\006GzRoad"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Road_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Road_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Road_descriptor,
              new java.lang.String[] { "Name", "Width", "Point", "Material", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzVector3d.getDescriptor(),
          gazebo.msgs.GzMaterial.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
