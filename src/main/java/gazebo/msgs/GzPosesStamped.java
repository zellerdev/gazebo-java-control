// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poses_stamped.proto

package gazebo.msgs;

public final class GzPosesStamped {
  private GzPosesStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PosesStampedOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Time time = 1;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    gazebo.msgs.GzTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder();

    // repeated .gazebo.msgs.Pose pose = 2;
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    java.util.List<gazebo.msgs.GzPose.Pose> 
        getPoseList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    gazebo.msgs.GzPose.Pose getPose(int index);
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    int getPoseCount();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    java.util.List<? extends gazebo.msgs.GzPose.PoseOrBuilder> 
        getPoseOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.PosesStamped}
   */
  public static final class PosesStamped extends
      com.google.protobuf.GeneratedMessage
      implements PosesStampedOrBuilder {
    // Use PosesStamped.newBuilder() to construct.
    private PosesStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PosesStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PosesStamped defaultInstance;
    public static PosesStamped getDefaultInstance() {
      return defaultInstance;
    }

    public PosesStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PosesStamped(
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
              gazebo.msgs.GzTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(gazebo.msgs.GzTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                pose_ = new java.util.ArrayList<gazebo.msgs.GzPose.Pose>();
                mutable_bitField0_ |= 0x00000002;
              }
              pose_.add(input.readMessage(gazebo.msgs.GzPose.Pose.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          pose_ = java.util.Collections.unmodifiableList(pose_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzPosesStamped.internal_static_gazebo_msgs_PosesStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzPosesStamped.internal_static_gazebo_msgs_PosesStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzPosesStamped.PosesStamped.class, gazebo.msgs.GzPosesStamped.PosesStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<PosesStamped> PARSER =
        new com.google.protobuf.AbstractParser<PosesStamped>() {
      public PosesStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PosesStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PosesStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Time time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.GzTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    public gazebo.msgs.GzTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     */
    public gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    // repeated .gazebo.msgs.Pose pose = 2;
    public static final int POSE_FIELD_NUMBER = 2;
    private java.util.List<gazebo.msgs.GzPose.Pose> pose_;
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    public java.util.List<gazebo.msgs.GzPose.Pose> getPoseList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    public java.util.List<? extends gazebo.msgs.GzPose.PoseOrBuilder> 
        getPoseOrBuilderList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    public int getPoseCount() {
      return pose_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    public gazebo.msgs.GzPose.Pose getPose(int index) {
      return pose_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
     */
    public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
        int index) {
      return pose_.get(index);
    }

    private void initFields() {
      time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      pose_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPoseCount(); i++) {
        if (!getPose(i).isInitialized()) {
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
        output.writeMessage(1, time_);
      }
      for (int i = 0; i < pose_.size(); i++) {
        output.writeMessage(2, pose_.get(i));
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
          .computeMessageSize(1, time_);
      }
      for (int i = 0; i < pose_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, pose_.get(i));
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

    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPosesStamped.PosesStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzPosesStamped.PosesStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.PosesStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzPosesStamped.PosesStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzPosesStamped.internal_static_gazebo_msgs_PosesStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzPosesStamped.internal_static_gazebo_msgs_PosesStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzPosesStamped.PosesStamped.class, gazebo.msgs.GzPosesStamped.PosesStamped.Builder.class);
      }

      // Construct using gazebo.msgs.GzPosesStamped.PosesStamped.newBuilder()
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
          getTimeFieldBuilder();
          getPoseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          poseBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzPosesStamped.internal_static_gazebo_msgs_PosesStamped_descriptor;
      }

      public gazebo.msgs.GzPosesStamped.PosesStamped getDefaultInstanceForType() {
        return gazebo.msgs.GzPosesStamped.PosesStamped.getDefaultInstance();
      }

      public gazebo.msgs.GzPosesStamped.PosesStamped build() {
        gazebo.msgs.GzPosesStamped.PosesStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzPosesStamped.PosesStamped buildPartial() {
        gazebo.msgs.GzPosesStamped.PosesStamped result = new gazebo.msgs.GzPosesStamped.PosesStamped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            pose_ = java.util.Collections.unmodifiableList(pose_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzPosesStamped.PosesStamped) {
          return mergeFrom((gazebo.msgs.GzPosesStamped.PosesStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzPosesStamped.PosesStamped other) {
        if (other == gazebo.msgs.GzPosesStamped.PosesStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (poseBuilder_ == null) {
          if (!other.pose_.isEmpty()) {
            if (pose_.isEmpty()) {
              pose_ = other.pose_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePoseIsMutable();
              pose_.addAll(other.pose_);
            }
            onChanged();
          }
        } else {
          if (!other.pose_.isEmpty()) {
            if (poseBuilder_.isEmpty()) {
              poseBuilder_.dispose();
              poseBuilder_ = null;
              pose_ = other.pose_;
              bitField0_ = (bitField0_ & ~0x00000002);
              poseBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPoseFieldBuilder() : null;
            } else {
              poseBuilder_.addAllMessages(other.pose_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getPoseCount(); i++) {
          if (!getPose(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzPosesStamped.PosesStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzPosesStamped.PosesStamped) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .gazebo.msgs.Time time = 1;
      private gazebo.msgs.GzTime.Time time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public gazebo.msgs.GzTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder setTime(gazebo.msgs.GzTime.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder setTime(
          gazebo.msgs.GzTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder mergeTime(gazebo.msgs.GzTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != gazebo.msgs.GzTime.Time.getDefaultInstance()) {
            time_ =
              gazebo.msgs.GzTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public gazebo.msgs.GzTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      public gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder>(
                  time_,
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      // repeated .gazebo.msgs.Pose pose = 2;
      private java.util.List<gazebo.msgs.GzPose.Pose> pose_ =
        java.util.Collections.emptyList();
      private void ensurePoseIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          pose_ = new java.util.ArrayList<gazebo.msgs.GzPose.Pose>(pose_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder> poseBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public java.util.List<gazebo.msgs.GzPose.Pose> getPoseList() {
        if (poseBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pose_);
        } else {
          return poseBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public int getPoseCount() {
        if (poseBuilder_ == null) {
          return pose_.size();
        } else {
          return poseBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public gazebo.msgs.GzPose.Pose getPose(int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);
        } else {
          return poseBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder setPose(
          int index, gazebo.msgs.GzPose.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.set(index, value);
          onChanged();
        } else {
          poseBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder setPose(
          int index, gazebo.msgs.GzPose.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.set(index, builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder addPose(gazebo.msgs.GzPose.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.add(value);
          onChanged();
        } else {
          poseBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder addPose(
          int index, gazebo.msgs.GzPose.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseIsMutable();
          pose_.add(index, value);
          onChanged();
        } else {
          poseBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder addPose(
          gazebo.msgs.GzPose.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.add(builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder addPose(
          int index, gazebo.msgs.GzPose.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.add(index, builderForValue.build());
          onChanged();
        } else {
          poseBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder addAllPose(
          java.lang.Iterable<? extends gazebo.msgs.GzPose.Pose> values) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          super.addAll(values, pose_);
          onChanged();
        } else {
          poseBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder removePose(int index) {
        if (poseBuilder_ == null) {
          ensurePoseIsMutable();
          pose_.remove(index);
          onChanged();
        } else {
          poseBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder getPoseBuilder(
          int index) {
        return getPoseFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
          int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);  } else {
          return poseBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public java.util.List<? extends gazebo.msgs.GzPose.PoseOrBuilder> 
           getPoseOrBuilderList() {
        if (poseBuilder_ != null) {
          return poseBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pose_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder addPoseBuilder() {
        return getPoseFieldBuilder().addBuilder(
            gazebo.msgs.GzPose.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder addPoseBuilder(
          int index) {
        return getPoseFieldBuilder().addBuilder(
            index, gazebo.msgs.GzPose.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 2;</code>
       */
      public java.util.List<gazebo.msgs.GzPose.Pose.Builder> 
           getPoseBuilderList() {
        return getPoseFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder> 
          getPoseFieldBuilder() {
        if (poseBuilder_ == null) {
          poseBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder>(
                  pose_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PosesStamped)
    }

    static {
      defaultInstance = new PosesStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PosesStamped)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PosesStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_PosesStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023poses_stamped.proto\022\013gazebo.msgs\032\ntime" +
      ".proto\032\npose.proto\"P\n\014PosesStamped\022\037\n\004ti" +
      "me\030\001 \002(\0132\021.gazebo.msgs.Time\022\037\n\004pose\030\002 \003(" +
      "\0132\021.gazebo.msgs.PoseB\020B\016GzPosesStamped"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_PosesStamped_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_PosesStamped_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_PosesStamped_descriptor,
              new java.lang.String[] { "Time", "Pose", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzTime.getDescriptor(),
          gazebo.msgs.GzPose.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
