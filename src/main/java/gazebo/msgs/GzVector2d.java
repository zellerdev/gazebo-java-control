// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vector2d.proto

package gazebo.msgs;

public final class GzVector2d {
  private GzVector2d() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Vector2dOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required double x = 1;
    /**
     * <code>required double x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required double x = 1;</code>
     */
    double getX();

    // required double y = 2;
    /**
     * <code>required double y = 2;</code>
     */
    boolean hasY();
    /**
     * <code>required double y = 2;</code>
     */
    double getY();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Vector2d}
   */
  public static final class Vector2d extends
      com.google.protobuf.GeneratedMessage
      implements Vector2dOrBuilder {
    // Use Vector2d.newBuilder() to construct.
    private Vector2d(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Vector2d(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Vector2d defaultInstance;
    public static Vector2d getDefaultInstance() {
      return defaultInstance;
    }

    public Vector2d getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Vector2d(
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
            case 9: {
              bitField0_ |= 0x00000001;
              x_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              y_ = input.readDouble();
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
      return gazebo.msgs.GzVector2d.internal_static_gazebo_msgs_Vector2d_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzVector2d.internal_static_gazebo_msgs_Vector2d_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzVector2d.Vector2d.class, gazebo.msgs.GzVector2d.Vector2d.Builder.class);
    }

    public static com.google.protobuf.Parser<Vector2d> PARSER =
        new com.google.protobuf.AbstractParser<Vector2d>() {
      public Vector2d parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Vector2d(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Vector2d> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required double x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>required double x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required double x = 1;</code>
     */
    public double getX() {
      return x_;
    }

    // required double y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>required double y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double y = 2;</code>
     */
    public double getY() {
      return y_;
    }

    private void initFields() {
      x_ = 0D;
      y_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
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
        output.writeDouble(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, y_);
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
          .computeDoubleSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
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

    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzVector2d.Vector2d parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzVector2d.Vector2d prototype) {
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
     * Protobuf type {@code gazebo.msgs.Vector2d}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzVector2d.Vector2dOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzVector2d.internal_static_gazebo_msgs_Vector2d_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzVector2d.internal_static_gazebo_msgs_Vector2d_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzVector2d.Vector2d.class, gazebo.msgs.GzVector2d.Vector2d.Builder.class);
      }

      // Construct using gazebo.msgs.GzVector2d.Vector2d.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        x_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzVector2d.internal_static_gazebo_msgs_Vector2d_descriptor;
      }

      public gazebo.msgs.GzVector2d.Vector2d getDefaultInstanceForType() {
        return gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance();
      }

      public gazebo.msgs.GzVector2d.Vector2d build() {
        gazebo.msgs.GzVector2d.Vector2d result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzVector2d.Vector2d buildPartial() {
        gazebo.msgs.GzVector2d.Vector2d result = new gazebo.msgs.GzVector2d.Vector2d(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzVector2d.Vector2d) {
          return mergeFrom((gazebo.msgs.GzVector2d.Vector2d)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzVector2d.Vector2d other) {
        if (other == gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzVector2d.Vector2d parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzVector2d.Vector2d) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required double x = 1;
      private double x_ ;
      /**
       * <code>required double x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required double x = 1;</code>
       */
      public double getX() {
        return x_;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder setX(double value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0D;
        onChanged();
        return this;
      }

      // required double y = 2;
      private double y_ ;
      /**
       * <code>required double y = 2;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double y = 2;</code>
       */
      public double getY() {
        return y_;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder setY(double value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Vector2d)
    }

    static {
      defaultInstance = new Vector2d(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Vector2d)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Vector2d_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Vector2d_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016vector2d.proto\022\013gazebo.msgs\" \n\010Vector2" +
      "d\022\t\n\001x\030\001 \002(\001\022\t\n\001y\030\002 \002(\001B\014B\nGzVector2d"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Vector2d_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Vector2d_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Vector2d_descriptor,
              new java.lang.String[] { "X", "Y", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
