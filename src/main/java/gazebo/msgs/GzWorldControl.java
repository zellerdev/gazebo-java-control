// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_control.proto

package gazebo.msgs;

public final class GzWorldControl {
  private GzWorldControl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WorldControlOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional bool pause = 1;
    /**
     * <code>optional bool pause = 1;</code>
     */
    boolean hasPause();
    /**
     * <code>optional bool pause = 1;</code>
     */
    boolean getPause();

    // optional bool step = 2;
    /**
     * <code>optional bool step = 2;</code>
     */
    boolean hasStep();
    /**
     * <code>optional bool step = 2;</code>
     */
    boolean getStep();

    // optional uint32 multi_step = 3;
    /**
     * <code>optional uint32 multi_step = 3;</code>
     */
    boolean hasMultiStep();
    /**
     * <code>optional uint32 multi_step = 3;</code>
     */
    int getMultiStep();

    // optional .gazebo.msgs.WorldReset reset = 4;
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    boolean hasReset();
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    gazebo.msgs.GzWorldReset.WorldReset getReset();
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    gazebo.msgs.GzWorldReset.WorldResetOrBuilder getResetOrBuilder();

    // optional uint32 seed = 5;
    /**
     * <code>optional uint32 seed = 5;</code>
     */
    boolean hasSeed();
    /**
     * <code>optional uint32 seed = 5;</code>
     */
    int getSeed();
  }
  /**
   * Protobuf type {@code gazebo.msgs.WorldControl}
   */
  public static final class WorldControl extends
      com.google.protobuf.GeneratedMessage
      implements WorldControlOrBuilder {
    // Use WorldControl.newBuilder() to construct.
    private WorldControl(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WorldControl(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WorldControl defaultInstance;
    public static WorldControl getDefaultInstance() {
      return defaultInstance;
    }

    public WorldControl getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WorldControl(
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
            case 8: {
              bitField0_ |= 0x00000001;
              pause_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              step_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              multiStep_ = input.readUInt32();
              break;
            }
            case 34: {
              gazebo.msgs.GzWorldReset.WorldReset.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = reset_.toBuilder();
              }
              reset_ = input.readMessage(gazebo.msgs.GzWorldReset.WorldReset.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reset_);
                reset_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              seed_ = input.readUInt32();
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
      return gazebo.msgs.GzWorldControl.internal_static_gazebo_msgs_WorldControl_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzWorldControl.internal_static_gazebo_msgs_WorldControl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzWorldControl.WorldControl.class, gazebo.msgs.GzWorldControl.WorldControl.Builder.class);
    }

    public static com.google.protobuf.Parser<WorldControl> PARSER =
        new com.google.protobuf.AbstractParser<WorldControl>() {
      public WorldControl parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldControl(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WorldControl> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional bool pause = 1;
    public static final int PAUSE_FIELD_NUMBER = 1;
    private boolean pause_;
    /**
     * <code>optional bool pause = 1;</code>
     */
    public boolean hasPause() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool pause = 1;</code>
     */
    public boolean getPause() {
      return pause_;
    }

    // optional bool step = 2;
    public static final int STEP_FIELD_NUMBER = 2;
    private boolean step_;
    /**
     * <code>optional bool step = 2;</code>
     */
    public boolean hasStep() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool step = 2;</code>
     */
    public boolean getStep() {
      return step_;
    }

    // optional uint32 multi_step = 3;
    public static final int MULTI_STEP_FIELD_NUMBER = 3;
    private int multiStep_;
    /**
     * <code>optional uint32 multi_step = 3;</code>
     */
    public boolean hasMultiStep() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 multi_step = 3;</code>
     */
    public int getMultiStep() {
      return multiStep_;
    }

    // optional .gazebo.msgs.WorldReset reset = 4;
    public static final int RESET_FIELD_NUMBER = 4;
    private gazebo.msgs.GzWorldReset.WorldReset reset_;
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    public boolean hasReset() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    public gazebo.msgs.GzWorldReset.WorldReset getReset() {
      return reset_;
    }
    /**
     * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
     */
    public gazebo.msgs.GzWorldReset.WorldResetOrBuilder getResetOrBuilder() {
      return reset_;
    }

    // optional uint32 seed = 5;
    public static final int SEED_FIELD_NUMBER = 5;
    private int seed_;
    /**
     * <code>optional uint32 seed = 5;</code>
     */
    public boolean hasSeed() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 seed = 5;</code>
     */
    public int getSeed() {
      return seed_;
    }

    private void initFields() {
      pause_ = false;
      step_ = false;
      multiStep_ = 0;
      reset_ = gazebo.msgs.GzWorldReset.WorldReset.getDefaultInstance();
      seed_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, pause_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, step_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, multiStep_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, reset_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, seed_);
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
          .computeBoolSize(1, pause_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, step_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, multiStep_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, reset_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, seed_);
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

    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzWorldControl.WorldControl parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzWorldControl.WorldControl prototype) {
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
     * Protobuf type {@code gazebo.msgs.WorldControl}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzWorldControl.WorldControlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzWorldControl.internal_static_gazebo_msgs_WorldControl_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzWorldControl.internal_static_gazebo_msgs_WorldControl_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzWorldControl.WorldControl.class, gazebo.msgs.GzWorldControl.WorldControl.Builder.class);
      }

      // Construct using gazebo.msgs.GzWorldControl.WorldControl.newBuilder()
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
          getResetFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        pause_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        step_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        multiStep_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (resetBuilder_ == null) {
          reset_ = gazebo.msgs.GzWorldReset.WorldReset.getDefaultInstance();
        } else {
          resetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        seed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzWorldControl.internal_static_gazebo_msgs_WorldControl_descriptor;
      }

      public gazebo.msgs.GzWorldControl.WorldControl getDefaultInstanceForType() {
        return gazebo.msgs.GzWorldControl.WorldControl.getDefaultInstance();
      }

      public gazebo.msgs.GzWorldControl.WorldControl build() {
        gazebo.msgs.GzWorldControl.WorldControl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzWorldControl.WorldControl buildPartial() {
        gazebo.msgs.GzWorldControl.WorldControl result = new gazebo.msgs.GzWorldControl.WorldControl(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.pause_ = pause_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.step_ = step_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.multiStep_ = multiStep_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (resetBuilder_ == null) {
          result.reset_ = reset_;
        } else {
          result.reset_ = resetBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.seed_ = seed_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzWorldControl.WorldControl) {
          return mergeFrom((gazebo.msgs.GzWorldControl.WorldControl)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzWorldControl.WorldControl other) {
        if (other == gazebo.msgs.GzWorldControl.WorldControl.getDefaultInstance()) return this;
        if (other.hasPause()) {
          setPause(other.getPause());
        }
        if (other.hasStep()) {
          setStep(other.getStep());
        }
        if (other.hasMultiStep()) {
          setMultiStep(other.getMultiStep());
        }
        if (other.hasReset()) {
          mergeReset(other.getReset());
        }
        if (other.hasSeed()) {
          setSeed(other.getSeed());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzWorldControl.WorldControl parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzWorldControl.WorldControl) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional bool pause = 1;
      private boolean pause_ ;
      /**
       * <code>optional bool pause = 1;</code>
       */
      public boolean hasPause() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool pause = 1;</code>
       */
      public boolean getPause() {
        return pause_;
      }
      /**
       * <code>optional bool pause = 1;</code>
       */
      public Builder setPause(boolean value) {
        bitField0_ |= 0x00000001;
        pause_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool pause = 1;</code>
       */
      public Builder clearPause() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pause_ = false;
        onChanged();
        return this;
      }

      // optional bool step = 2;
      private boolean step_ ;
      /**
       * <code>optional bool step = 2;</code>
       */
      public boolean hasStep() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool step = 2;</code>
       */
      public boolean getStep() {
        return step_;
      }
      /**
       * <code>optional bool step = 2;</code>
       */
      public Builder setStep(boolean value) {
        bitField0_ |= 0x00000002;
        step_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool step = 2;</code>
       */
      public Builder clearStep() {
        bitField0_ = (bitField0_ & ~0x00000002);
        step_ = false;
        onChanged();
        return this;
      }

      // optional uint32 multi_step = 3;
      private int multiStep_ ;
      /**
       * <code>optional uint32 multi_step = 3;</code>
       */
      public boolean hasMultiStep() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 multi_step = 3;</code>
       */
      public int getMultiStep() {
        return multiStep_;
      }
      /**
       * <code>optional uint32 multi_step = 3;</code>
       */
      public Builder setMultiStep(int value) {
        bitField0_ |= 0x00000004;
        multiStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 multi_step = 3;</code>
       */
      public Builder clearMultiStep() {
        bitField0_ = (bitField0_ & ~0x00000004);
        multiStep_ = 0;
        onChanged();
        return this;
      }

      // optional .gazebo.msgs.WorldReset reset = 4;
      private gazebo.msgs.GzWorldReset.WorldReset reset_ = gazebo.msgs.GzWorldReset.WorldReset.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzWorldReset.WorldReset, gazebo.msgs.GzWorldReset.WorldReset.Builder, gazebo.msgs.GzWorldReset.WorldResetOrBuilder> resetBuilder_;
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public boolean hasReset() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public gazebo.msgs.GzWorldReset.WorldReset getReset() {
        if (resetBuilder_ == null) {
          return reset_;
        } else {
          return resetBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public Builder setReset(gazebo.msgs.GzWorldReset.WorldReset value) {
        if (resetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reset_ = value;
          onChanged();
        } else {
          resetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public Builder setReset(
          gazebo.msgs.GzWorldReset.WorldReset.Builder builderForValue) {
        if (resetBuilder_ == null) {
          reset_ = builderForValue.build();
          onChanged();
        } else {
          resetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public Builder mergeReset(gazebo.msgs.GzWorldReset.WorldReset value) {
        if (resetBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              reset_ != gazebo.msgs.GzWorldReset.WorldReset.getDefaultInstance()) {
            reset_ =
              gazebo.msgs.GzWorldReset.WorldReset.newBuilder(reset_).mergeFrom(value).buildPartial();
          } else {
            reset_ = value;
          }
          onChanged();
        } else {
          resetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public Builder clearReset() {
        if (resetBuilder_ == null) {
          reset_ = gazebo.msgs.GzWorldReset.WorldReset.getDefaultInstance();
          onChanged();
        } else {
          resetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public gazebo.msgs.GzWorldReset.WorldReset.Builder getResetBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResetFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      public gazebo.msgs.GzWorldReset.WorldResetOrBuilder getResetOrBuilder() {
        if (resetBuilder_ != null) {
          return resetBuilder_.getMessageOrBuilder();
        } else {
          return reset_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.WorldReset reset = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzWorldReset.WorldReset, gazebo.msgs.GzWorldReset.WorldReset.Builder, gazebo.msgs.GzWorldReset.WorldResetOrBuilder> 
          getResetFieldBuilder() {
        if (resetBuilder_ == null) {
          resetBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzWorldReset.WorldReset, gazebo.msgs.GzWorldReset.WorldReset.Builder, gazebo.msgs.GzWorldReset.WorldResetOrBuilder>(
                  reset_,
                  getParentForChildren(),
                  isClean());
          reset_ = null;
        }
        return resetBuilder_;
      }

      // optional uint32 seed = 5;
      private int seed_ ;
      /**
       * <code>optional uint32 seed = 5;</code>
       */
      public boolean hasSeed() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 seed = 5;</code>
       */
      public int getSeed() {
        return seed_;
      }
      /**
       * <code>optional uint32 seed = 5;</code>
       */
      public Builder setSeed(int value) {
        bitField0_ |= 0x00000010;
        seed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 seed = 5;</code>
       */
      public Builder clearSeed() {
        bitField0_ = (bitField0_ & ~0x00000010);
        seed_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.WorldControl)
    }

    static {
      defaultInstance = new WorldControl(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.WorldControl)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_WorldControl_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_WorldControl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023world_control.proto\022\013gazebo.msgs\032\021worl" +
      "d_reset.proto\"u\n\014WorldControl\022\r\n\005pause\030\001" +
      " \001(\010\022\014\n\004step\030\002 \001(\010\022\022\n\nmulti_step\030\003 \001(\r\022&" +
      "\n\005reset\030\004 \001(\0132\027.gazebo.msgs.WorldReset\022\014" +
      "\n\004seed\030\005 \001(\rB\020B\016GzWorldControl"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_WorldControl_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_WorldControl_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_WorldControl_descriptor,
              new java.lang.String[] { "Pause", "Step", "MultiStep", "Reset", "Seed", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzWorldReset.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
