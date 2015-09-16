// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pose_v.proto

package gazebo.msgs;

public final class GzPoseV {
  private GzPoseV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Pose_VOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .gazebo.msgs.Pose pose = 1;
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    java.util.List<gazebo.msgs.GzPose.Pose> 
        getPoseList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    gazebo.msgs.GzPose.Pose getPose(int index);
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    int getPoseCount();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    java.util.List<? extends gazebo.msgs.GzPose.PoseOrBuilder> 
        getPoseOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.Pose_V}
   */
  public static final class Pose_V extends
      com.google.protobuf.GeneratedMessage
      implements Pose_VOrBuilder {
    // Use Pose_V.newBuilder() to construct.
    private Pose_V(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Pose_V(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Pose_V defaultInstance;
    public static Pose_V getDefaultInstance() {
      return defaultInstance;
    }

    public Pose_V getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Pose_V(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                pose_ = new java.util.ArrayList<gazebo.msgs.GzPose.Pose>();
                mutable_bitField0_ |= 0x00000001;
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          pose_ = java.util.Collections.unmodifiableList(pose_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzPoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzPoseV.internal_static_gazebo_msgs_Pose_V_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzPoseV.Pose_V.class, gazebo.msgs.GzPoseV.Pose_V.Builder.class);
    }

    public static com.google.protobuf.Parser<Pose_V> PARSER =
        new com.google.protobuf.AbstractParser<Pose_V>() {
      public Pose_V parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pose_V(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Pose_V> getParserForType() {
      return PARSER;
    }

    // repeated .gazebo.msgs.Pose pose = 1;
    public static final int POSE_FIELD_NUMBER = 1;
    private java.util.List<gazebo.msgs.GzPose.Pose> pose_;
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    public java.util.List<gazebo.msgs.GzPose.Pose> getPoseList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    public java.util.List<? extends gazebo.msgs.GzPose.PoseOrBuilder> 
        getPoseOrBuilderList() {
      return pose_;
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    public int getPoseCount() {
      return pose_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    public gazebo.msgs.GzPose.Pose getPose(int index) {
      return pose_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
     */
    public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
        int index) {
      return pose_.get(index);
    }

    private void initFields() {
      pose_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

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
      for (int i = 0; i < pose_.size(); i++) {
        output.writeMessage(1, pose_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pose_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, pose_.get(i));
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

    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPoseV.Pose_V parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzPoseV.Pose_V prototype) {
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
     * Protobuf type {@code gazebo.msgs.Pose_V}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzPoseV.Pose_VOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzPoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzPoseV.internal_static_gazebo_msgs_Pose_V_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzPoseV.Pose_V.class, gazebo.msgs.GzPoseV.Pose_V.Builder.class);
      }

      // Construct using gazebo.msgs.GzPoseV.Pose_V.newBuilder()
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
          getPoseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
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
        return gazebo.msgs.GzPoseV.internal_static_gazebo_msgs_Pose_V_descriptor;
      }

      public gazebo.msgs.GzPoseV.Pose_V getDefaultInstanceForType() {
        return gazebo.msgs.GzPoseV.Pose_V.getDefaultInstance();
      }

      public gazebo.msgs.GzPoseV.Pose_V build() {
        gazebo.msgs.GzPoseV.Pose_V result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzPoseV.Pose_V buildPartial() {
        gazebo.msgs.GzPoseV.Pose_V result = new gazebo.msgs.GzPoseV.Pose_V(this);
        int from_bitField0_ = bitField0_;
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            pose_ = java.util.Collections.unmodifiableList(pose_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzPoseV.Pose_V) {
          return mergeFrom((gazebo.msgs.GzPoseV.Pose_V)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzPoseV.Pose_V other) {
        if (other == gazebo.msgs.GzPoseV.Pose_V.getDefaultInstance()) return this;
        if (poseBuilder_ == null) {
          if (!other.pose_.isEmpty()) {
            if (pose_.isEmpty()) {
              pose_ = other.pose_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
        gazebo.msgs.GzPoseV.Pose_V parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzPoseV.Pose_V) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .gazebo.msgs.Pose pose = 1;
      private java.util.List<gazebo.msgs.GzPose.Pose> pose_ =
        java.util.Collections.emptyList();
      private void ensurePoseIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          pose_ = new java.util.ArrayList<gazebo.msgs.GzPose.Pose>(pose_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder> poseBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public java.util.List<gazebo.msgs.GzPose.Pose> getPoseList() {
        if (poseBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pose_);
        } else {
          return poseBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public int getPoseCount() {
        if (poseBuilder_ == null) {
          return pose_.size();
        } else {
          return poseBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.GzPose.Pose getPose(int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);
        } else {
          return poseBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder getPoseBuilder(
          int index) {
        return getPoseFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder(
          int index) {
        if (poseBuilder_ == null) {
          return pose_.get(index);  } else {
          return poseBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder addPoseBuilder() {
        return getPoseFieldBuilder().addBuilder(
            gazebo.msgs.GzPose.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder addPoseBuilder(
          int index) {
        return getPoseFieldBuilder().addBuilder(
            index, gazebo.msgs.GzPose.Pose.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Pose pose = 1;</code>
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
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Pose_V)
    }

    static {
      defaultInstance = new Pose_V(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Pose_V)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Pose_V_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Pose_V_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014pose_v.proto\022\013gazebo.msgs\032\npose.proto\"" +
      ")\n\006Pose_V\022\037\n\004pose\030\001 \003(\0132\021.gazebo.msgs.Po" +
      "seB\tB\007GzPoseV"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Pose_V_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Pose_V_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Pose_V_descriptor,
              new java.lang.String[] { "Pose", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzPose.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
