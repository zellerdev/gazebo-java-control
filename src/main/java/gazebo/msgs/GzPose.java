// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pose.proto

package gazebo.msgs;

public final class GzPose {
  private GzPose() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PoseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string name = 1;
    /**
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // optional uint32 id = 2;
    /**
     * <code>optional uint32 id = 2;</code>
     */
    boolean hasId();
    /**
     * <code>optional uint32 id = 2;</code>
     */
    int getId();

    // required .gazebo.msgs.Vector3d position = 3;
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    boolean hasPosition();
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3d getPosition();
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3dOrBuilder getPositionOrBuilder();

    // required .gazebo.msgs.Quaternion orientation = 4;
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    boolean hasOrientation();
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    gazebo.msgs.GzQuaternion.Quaternion getOrientation();
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    gazebo.msgs.GzQuaternion.QuaternionOrBuilder getOrientationOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Pose}
   */
  public static final class Pose extends
      com.google.protobuf.GeneratedMessage
      implements PoseOrBuilder {
    // Use Pose.newBuilder() to construct.
    private Pose(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Pose(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Pose defaultInstance;
    public static Pose getDefaultInstance() {
      return defaultInstance;
    }

    public Pose getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Pose(
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
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readUInt32();
              break;
            }
            case 26: {
              gazebo.msgs.GzVector3d.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(gazebo.msgs.GzVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              gazebo.msgs.GzQuaternion.Quaternion.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = orientation_.toBuilder();
              }
              orientation_ = input.readMessage(gazebo.msgs.GzQuaternion.Quaternion.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(orientation_);
                orientation_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzPose.internal_static_gazebo_msgs_Pose_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzPose.internal_static_gazebo_msgs_Pose_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzPose.Pose.class, gazebo.msgs.GzPose.Pose.Builder.class);
    }

    public static com.google.protobuf.Parser<Pose> PARSER =
        new com.google.protobuf.AbstractParser<Pose>() {
      public Pose parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pose(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Pose> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
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

    // optional uint32 id = 2;
    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }

    // required .gazebo.msgs.Vector3d position = 3;
    public static final int POSITION_FIELD_NUMBER = 3;
    private gazebo.msgs.GzVector3d.Vector3d position_;
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3d getPosition() {
      return position_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d position = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3dOrBuilder getPositionOrBuilder() {
      return position_;
    }

    // required .gazebo.msgs.Quaternion orientation = 4;
    public static final int ORIENTATION_FIELD_NUMBER = 4;
    private gazebo.msgs.GzQuaternion.Quaternion orientation_;
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    public boolean hasOrientation() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    public gazebo.msgs.GzQuaternion.Quaternion getOrientation() {
      return orientation_;
    }
    /**
     * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
     */
    public gazebo.msgs.GzQuaternion.QuaternionOrBuilder getOrientationOrBuilder() {
      return orientation_;
    }

    private void initFields() {
      name_ = "";
      id_ = 0;
      position_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      orientation_ = gazebo.msgs.GzQuaternion.Quaternion.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasPosition()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOrientation()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getPosition().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getOrientation().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
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
        output.writeUInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, orientation_);
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
          .computeUInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, orientation_);
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

    public static gazebo.msgs.GzPose.Pose parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPose.Pose parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzPose.Pose parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPose.Pose parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzPose.Pose prototype) {
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
     * Protobuf type {@code gazebo.msgs.Pose}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzPose.PoseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzPose.internal_static_gazebo_msgs_Pose_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzPose.internal_static_gazebo_msgs_Pose_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzPose.Pose.class, gazebo.msgs.GzPose.Pose.Builder.class);
      }

      // Construct using gazebo.msgs.GzPose.Pose.newBuilder()
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
          getPositionFieldBuilder();
          getOrientationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (positionBuilder_ == null) {
          position_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (orientationBuilder_ == null) {
          orientation_ = gazebo.msgs.GzQuaternion.Quaternion.getDefaultInstance();
        } else {
          orientationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzPose.internal_static_gazebo_msgs_Pose_descriptor;
      }

      public gazebo.msgs.GzPose.Pose getDefaultInstanceForType() {
        return gazebo.msgs.GzPose.Pose.getDefaultInstance();
      }

      public gazebo.msgs.GzPose.Pose build() {
        gazebo.msgs.GzPose.Pose result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzPose.Pose buildPartial() {
        gazebo.msgs.GzPose.Pose result = new gazebo.msgs.GzPose.Pose(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (orientationBuilder_ == null) {
          result.orientation_ = orientation_;
        } else {
          result.orientation_ = orientationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzPose.Pose) {
          return mergeFrom((gazebo.msgs.GzPose.Pose)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzPose.Pose other) {
        if (other == gazebo.msgs.GzPose.Pose.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.hasOrientation()) {
          mergeOrientation(other.getOrientation());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPosition()) {
          
          return false;
        }
        if (!hasOrientation()) {
          
          return false;
        }
        if (!getPosition().isInitialized()) {
          
          return false;
        }
        if (!getOrientation().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzPose.Pose parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzPose.Pose) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string name = 1;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string name = 1;</code>
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
       * <code>optional string name = 1;</code>
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
       * <code>optional string name = 1;</code>
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
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
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

      // optional uint32 id = 2;
      private int id_ ;
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      // required .gazebo.msgs.Vector3d position = 3;
      private gazebo.msgs.GzVector3d.Vector3d position_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> positionBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public boolean hasPosition() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d getPosition() {
        if (positionBuilder_ == null) {
          return position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public Builder setPosition(gazebo.msgs.GzVector3d.Vector3d value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public Builder setPosition(
          gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public Builder mergePosition(gazebo.msgs.GzVector3d.Vector3d value) {
        if (positionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              position_ != gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance()) {
            position_ =
              gazebo.msgs.GzVector3d.Vector3d.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder getPositionBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3dOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d position = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder>(
                  position_,
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      // required .gazebo.msgs.Quaternion orientation = 4;
      private gazebo.msgs.GzQuaternion.Quaternion orientation_ = gazebo.msgs.GzQuaternion.Quaternion.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzQuaternion.Quaternion, gazebo.msgs.GzQuaternion.Quaternion.Builder, gazebo.msgs.GzQuaternion.QuaternionOrBuilder> orientationBuilder_;
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public boolean hasOrientation() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public gazebo.msgs.GzQuaternion.Quaternion getOrientation() {
        if (orientationBuilder_ == null) {
          return orientation_;
        } else {
          return orientationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public Builder setOrientation(gazebo.msgs.GzQuaternion.Quaternion value) {
        if (orientationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          orientation_ = value;
          onChanged();
        } else {
          orientationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public Builder setOrientation(
          gazebo.msgs.GzQuaternion.Quaternion.Builder builderForValue) {
        if (orientationBuilder_ == null) {
          orientation_ = builderForValue.build();
          onChanged();
        } else {
          orientationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public Builder mergeOrientation(gazebo.msgs.GzQuaternion.Quaternion value) {
        if (orientationBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              orientation_ != gazebo.msgs.GzQuaternion.Quaternion.getDefaultInstance()) {
            orientation_ =
              gazebo.msgs.GzQuaternion.Quaternion.newBuilder(orientation_).mergeFrom(value).buildPartial();
          } else {
            orientation_ = value;
          }
          onChanged();
        } else {
          orientationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public Builder clearOrientation() {
        if (orientationBuilder_ == null) {
          orientation_ = gazebo.msgs.GzQuaternion.Quaternion.getDefaultInstance();
          onChanged();
        } else {
          orientationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public gazebo.msgs.GzQuaternion.Quaternion.Builder getOrientationBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getOrientationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      public gazebo.msgs.GzQuaternion.QuaternionOrBuilder getOrientationOrBuilder() {
        if (orientationBuilder_ != null) {
          return orientationBuilder_.getMessageOrBuilder();
        } else {
          return orientation_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Quaternion orientation = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzQuaternion.Quaternion, gazebo.msgs.GzQuaternion.Quaternion.Builder, gazebo.msgs.GzQuaternion.QuaternionOrBuilder> 
          getOrientationFieldBuilder() {
        if (orientationBuilder_ == null) {
          orientationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzQuaternion.Quaternion, gazebo.msgs.GzQuaternion.Quaternion.Builder, gazebo.msgs.GzQuaternion.QuaternionOrBuilder>(
                  orientation_,
                  getParentForChildren(),
                  isClean());
          orientation_ = null;
        }
        return orientationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Pose)
    }

    static {
      defaultInstance = new Pose(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Pose)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Pose_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Pose_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\npose.proto\022\013gazebo.msgs\032\016vector3d.prot" +
      "o\032\020quaternion.proto\"w\n\004Pose\022\014\n\004name\030\001 \001(" +
      "\t\022\n\n\002id\030\002 \001(\r\022\'\n\010position\030\003 \002(\0132\025.gazebo" +
      ".msgs.Vector3d\022,\n\013orientation\030\004 \002(\0132\027.ga" +
      "zebo.msgs.QuaternionB\010B\006GzPose"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Pose_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Pose_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Pose_descriptor,
              new java.lang.String[] { "Name", "Id", "Position", "Orientation", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzVector3d.getDescriptor(),
          gazebo.msgs.GzQuaternion.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
