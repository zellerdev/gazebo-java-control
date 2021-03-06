// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: images_stamped.proto

package gazebo.msgs;

public final class GzImagesStamped {
  private GzImagesStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ImagesStampedOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Time time = 1;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    gazebo.msgs.GzTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder();

    // repeated .gazebo.msgs.Image image = 2;
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    java.util.List<gazebo.msgs.GzImage.Image> 
        getImageList();
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    gazebo.msgs.GzImage.Image getImage(int index);
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    int getImageCount();
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    java.util.List<? extends gazebo.msgs.GzImage.ImageOrBuilder> 
        getImageOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.ImagesStamped}
   */
  public static final class ImagesStamped extends
      com.google.protobuf.GeneratedMessage
      implements ImagesStampedOrBuilder {
    // Use ImagesStamped.newBuilder() to construct.
    private ImagesStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ImagesStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ImagesStamped defaultInstance;
    public static ImagesStamped getDefaultInstance() {
      return defaultInstance;
    }

    public ImagesStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ImagesStamped(
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
                image_ = new java.util.ArrayList<gazebo.msgs.GzImage.Image>();
                mutable_bitField0_ |= 0x00000002;
              }
              image_.add(input.readMessage(gazebo.msgs.GzImage.Image.PARSER, extensionRegistry));
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
          image_ = java.util.Collections.unmodifiableList(image_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzImagesStamped.internal_static_gazebo_msgs_ImagesStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzImagesStamped.internal_static_gazebo_msgs_ImagesStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzImagesStamped.ImagesStamped.class, gazebo.msgs.GzImagesStamped.ImagesStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<ImagesStamped> PARSER =
        new com.google.protobuf.AbstractParser<ImagesStamped>() {
      public ImagesStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImagesStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ImagesStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Time time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.GzTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    public gazebo.msgs.GzTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when all the images were captured
     * </pre>
     */
    public gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    // repeated .gazebo.msgs.Image image = 2;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private java.util.List<gazebo.msgs.GzImage.Image> image_;
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    public java.util.List<gazebo.msgs.GzImage.Image> getImageList() {
      return image_;
    }
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    public java.util.List<? extends gazebo.msgs.GzImage.ImageOrBuilder> 
        getImageOrBuilderList() {
      return image_;
    }
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    public int getImageCount() {
      return image_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    public gazebo.msgs.GzImage.Image getImage(int index) {
      return image_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Image image = 2;</code>
     */
    public gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder(
        int index) {
      return image_.get(index);
    }

    private void initFields() {
      time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      image_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < getImageCount(); i++) {
        if (!getImage(i).isInitialized()) {
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
      for (int i = 0; i < image_.size(); i++) {
        output.writeMessage(2, image_.get(i));
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
      for (int i = 0; i < image_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, image_.get(i));
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

    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzImagesStamped.ImagesStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzImagesStamped.ImagesStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.ImagesStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzImagesStamped.ImagesStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzImagesStamped.internal_static_gazebo_msgs_ImagesStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzImagesStamped.internal_static_gazebo_msgs_ImagesStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzImagesStamped.ImagesStamped.class, gazebo.msgs.GzImagesStamped.ImagesStamped.Builder.class);
      }

      // Construct using gazebo.msgs.GzImagesStamped.ImagesStamped.newBuilder()
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
          getImageFieldBuilder();
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
        if (imageBuilder_ == null) {
          image_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          imageBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzImagesStamped.internal_static_gazebo_msgs_ImagesStamped_descriptor;
      }

      public gazebo.msgs.GzImagesStamped.ImagesStamped getDefaultInstanceForType() {
        return gazebo.msgs.GzImagesStamped.ImagesStamped.getDefaultInstance();
      }

      public gazebo.msgs.GzImagesStamped.ImagesStamped build() {
        gazebo.msgs.GzImagesStamped.ImagesStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzImagesStamped.ImagesStamped buildPartial() {
        gazebo.msgs.GzImagesStamped.ImagesStamped result = new gazebo.msgs.GzImagesStamped.ImagesStamped(this);
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
        if (imageBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            image_ = java.util.Collections.unmodifiableList(image_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.image_ = image_;
        } else {
          result.image_ = imageBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzImagesStamped.ImagesStamped) {
          return mergeFrom((gazebo.msgs.GzImagesStamped.ImagesStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzImagesStamped.ImagesStamped other) {
        if (other == gazebo.msgs.GzImagesStamped.ImagesStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (imageBuilder_ == null) {
          if (!other.image_.isEmpty()) {
            if (image_.isEmpty()) {
              image_ = other.image_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureImageIsMutable();
              image_.addAll(other.image_);
            }
            onChanged();
          }
        } else {
          if (!other.image_.isEmpty()) {
            if (imageBuilder_.isEmpty()) {
              imageBuilder_.dispose();
              imageBuilder_ = null;
              image_ = other.image_;
              bitField0_ = (bitField0_ & ~0x00000002);
              imageBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getImageFieldBuilder() : null;
            } else {
              imageBuilder_.addAllMessages(other.image_);
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
        for (int i = 0; i < getImageCount(); i++) {
          if (!getImage(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzImagesStamped.ImagesStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzImagesStamped.ImagesStamped) e.getUnfinishedMessage();
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
       */
      public gazebo.msgs.GzTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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
       *
       * <pre>
       * Time when all the images were captured
       * </pre>
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

      // repeated .gazebo.msgs.Image image = 2;
      private java.util.List<gazebo.msgs.GzImage.Image> image_ =
        java.util.Collections.emptyList();
      private void ensureImageIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          image_ = new java.util.ArrayList<gazebo.msgs.GzImage.Image>(image_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder> imageBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public java.util.List<gazebo.msgs.GzImage.Image> getImageList() {
        if (imageBuilder_ == null) {
          return java.util.Collections.unmodifiableList(image_);
        } else {
          return imageBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public int getImageCount() {
        if (imageBuilder_ == null) {
          return image_.size();
        } else {
          return imageBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image getImage(int index) {
        if (imageBuilder_ == null) {
          return image_.get(index);
        } else {
          return imageBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder setImage(
          int index, gazebo.msgs.GzImage.Image value) {
        if (imageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureImageIsMutable();
          image_.set(index, value);
          onChanged();
        } else {
          imageBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder setImage(
          int index, gazebo.msgs.GzImage.Image.Builder builderForValue) {
        if (imageBuilder_ == null) {
          ensureImageIsMutable();
          image_.set(index, builderForValue.build());
          onChanged();
        } else {
          imageBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder addImage(gazebo.msgs.GzImage.Image value) {
        if (imageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureImageIsMutable();
          image_.add(value);
          onChanged();
        } else {
          imageBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder addImage(
          int index, gazebo.msgs.GzImage.Image value) {
        if (imageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureImageIsMutable();
          image_.add(index, value);
          onChanged();
        } else {
          imageBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder addImage(
          gazebo.msgs.GzImage.Image.Builder builderForValue) {
        if (imageBuilder_ == null) {
          ensureImageIsMutable();
          image_.add(builderForValue.build());
          onChanged();
        } else {
          imageBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder addImage(
          int index, gazebo.msgs.GzImage.Image.Builder builderForValue) {
        if (imageBuilder_ == null) {
          ensureImageIsMutable();
          image_.add(index, builderForValue.build());
          onChanged();
        } else {
          imageBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder addAllImage(
          java.lang.Iterable<? extends gazebo.msgs.GzImage.Image> values) {
        if (imageBuilder_ == null) {
          ensureImageIsMutable();
          super.addAll(values, image_);
          onChanged();
        } else {
          imageBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder clearImage() {
        if (imageBuilder_ == null) {
          image_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          imageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public Builder removeImage(int index) {
        if (imageBuilder_ == null) {
          ensureImageIsMutable();
          image_.remove(index);
          onChanged();
        } else {
          imageBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image.Builder getImageBuilder(
          int index) {
        return getImageFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder(
          int index) {
        if (imageBuilder_ == null) {
          return image_.get(index);  } else {
          return imageBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public java.util.List<? extends gazebo.msgs.GzImage.ImageOrBuilder> 
           getImageOrBuilderList() {
        if (imageBuilder_ != null) {
          return imageBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(image_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image.Builder addImageBuilder() {
        return getImageFieldBuilder().addBuilder(
            gazebo.msgs.GzImage.Image.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image.Builder addImageBuilder(
          int index) {
        return getImageFieldBuilder().addBuilder(
            index, gazebo.msgs.GzImage.Image.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Image image = 2;</code>
       */
      public java.util.List<gazebo.msgs.GzImage.Image.Builder> 
           getImageBuilderList() {
        return getImageFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder> 
          getImageFieldBuilder() {
        if (imageBuilder_ == null) {
          imageBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder>(
                  image_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          image_ = null;
        }
        return imageBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.ImagesStamped)
    }

    static {
      defaultInstance = new ImagesStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.ImagesStamped)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_ImagesStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_ImagesStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024images_stamped.proto\022\013gazebo.msgs\032\ntim" +
      "e.proto\032\013image.proto\"S\n\rImagesStamped\022\037\n" +
      "\004time\030\001 \002(\0132\021.gazebo.msgs.Time\022!\n\005image\030" +
      "\002 \003(\0132\022.gazebo.msgs.ImageB\021B\017GzImagesSta" +
      "mped"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_ImagesStamped_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_ImagesStamped_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_ImagesStamped_descriptor,
              new java.lang.String[] { "Time", "Image", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzTime.getDescriptor(),
          gazebo.msgs.GzImage.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
