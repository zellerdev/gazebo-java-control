// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boxgeom.proto

package gazebo.msgs;

public final class GzBoxgeom {
  private GzBoxgeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BoxGeomOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Vector3d size = 1;
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    boolean hasSize();
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    gazebo.msgs.GzVector3d.Vector3d getSize();
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    gazebo.msgs.GzVector3d.Vector3dOrBuilder getSizeOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.BoxGeom}
   */
  public static final class BoxGeom extends
      com.google.protobuf.GeneratedMessage
      implements BoxGeomOrBuilder {
    // Use BoxGeom.newBuilder() to construct.
    private BoxGeom(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BoxGeom(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BoxGeom defaultInstance;
    public static BoxGeom getDefaultInstance() {
      return defaultInstance;
    }

    public BoxGeom getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BoxGeom(
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
              gazebo.msgs.GzVector3d.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = size_.toBuilder();
              }
              size_ = input.readMessage(gazebo.msgs.GzVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(size_);
                size_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return gazebo.msgs.GzBoxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzBoxgeom.internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzBoxgeom.BoxGeom.class, gazebo.msgs.GzBoxgeom.BoxGeom.Builder.class);
    }

    public static com.google.protobuf.Parser<BoxGeom> PARSER =
        new com.google.protobuf.AbstractParser<BoxGeom>() {
      public BoxGeom parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BoxGeom(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BoxGeom> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Vector3d size = 1;
    public static final int SIZE_FIELD_NUMBER = 1;
    private gazebo.msgs.GzVector3d.Vector3d size_;
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3d getSize() {
      return size_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d size = 1;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3dOrBuilder getSizeOrBuilder() {
      return size_;
    }

    private void initFields() {
      size_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSize().isInitialized()) {
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
        output.writeMessage(1, size_);
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
          .computeMessageSize(1, size_);
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

    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzBoxgeom.BoxGeom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzBoxgeom.BoxGeom prototype) {
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
     * Protobuf type {@code gazebo.msgs.BoxGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzBoxgeom.BoxGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzBoxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzBoxgeom.internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzBoxgeom.BoxGeom.class, gazebo.msgs.GzBoxgeom.BoxGeom.Builder.class);
      }

      // Construct using gazebo.msgs.GzBoxgeom.BoxGeom.newBuilder()
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
          getSizeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (sizeBuilder_ == null) {
          size_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzBoxgeom.internal_static_gazebo_msgs_BoxGeom_descriptor;
      }

      public gazebo.msgs.GzBoxgeom.BoxGeom getDefaultInstanceForType() {
        return gazebo.msgs.GzBoxgeom.BoxGeom.getDefaultInstance();
      }

      public gazebo.msgs.GzBoxgeom.BoxGeom build() {
        gazebo.msgs.GzBoxgeom.BoxGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzBoxgeom.BoxGeom buildPartial() {
        gazebo.msgs.GzBoxgeom.BoxGeom result = new gazebo.msgs.GzBoxgeom.BoxGeom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (sizeBuilder_ == null) {
          result.size_ = size_;
        } else {
          result.size_ = sizeBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzBoxgeom.BoxGeom) {
          return mergeFrom((gazebo.msgs.GzBoxgeom.BoxGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzBoxgeom.BoxGeom other) {
        if (other == gazebo.msgs.GzBoxgeom.BoxGeom.getDefaultInstance()) return this;
        if (other.hasSize()) {
          mergeSize(other.getSize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSize()) {
          
          return false;
        }
        if (!getSize().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzBoxgeom.BoxGeom parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzBoxgeom.BoxGeom) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .gazebo.msgs.Vector3d size = 1;
      private gazebo.msgs.GzVector3d.Vector3d size_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> sizeBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d getSize() {
        if (sizeBuilder_ == null) {
          return size_;
        } else {
          return sizeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder setSize(gazebo.msgs.GzVector3d.Vector3d value) {
        if (sizeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          size_ = value;
          onChanged();
        } else {
          sizeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder setSize(
          gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (sizeBuilder_ == null) {
          size_ = builderForValue.build();
          onChanged();
        } else {
          sizeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder mergeSize(gazebo.msgs.GzVector3d.Vector3d value) {
        if (sizeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              size_ != gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance()) {
            size_ =
              gazebo.msgs.GzVector3d.Vector3d.newBuilder(size_).mergeFrom(value).buildPartial();
          } else {
            size_ = value;
          }
          onChanged();
        } else {
          sizeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public Builder clearSize() {
        if (sizeBuilder_ == null) {
          size_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder getSizeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSizeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3dOrBuilder getSizeOrBuilder() {
        if (sizeBuilder_ != null) {
          return sizeBuilder_.getMessageOrBuilder();
        } else {
          return size_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d size = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
          getSizeFieldBuilder() {
        if (sizeBuilder_ == null) {
          sizeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder>(
                  size_,
                  getParentForChildren(),
                  isClean());
          size_ = null;
        }
        return sizeBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.BoxGeom)
    }

    static {
      defaultInstance = new BoxGeom(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.BoxGeom)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_BoxGeom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rboxgeom.proto\022\013gazebo.msgs\032\016vector3d.p" +
      "roto\".\n\007BoxGeom\022#\n\004size\030\001 \002(\0132\025.gazebo.m" +
      "sgs.Vector3dB\013B\tGzBoxgeom"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_BoxGeom_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_BoxGeom_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_BoxGeom_descriptor,
              new java.lang.String[] { "Size", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzVector3d.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
