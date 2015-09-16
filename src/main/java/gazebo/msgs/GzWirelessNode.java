// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wireless_node.proto

package gazebo.msgs;

public final class GzWirelessNode {
  private GzWirelessNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WirelessNodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string essid = 1;
    /**
     * <code>required string essid = 1;</code>
     */
    boolean hasEssid();
    /**
     * <code>required string essid = 1;</code>
     */
    java.lang.String getEssid();
    /**
     * <code>required string essid = 1;</code>
     */
    com.google.protobuf.ByteString
        getEssidBytes();

    // required double frequency = 2;
    /**
     * <code>required double frequency = 2;</code>
     */
    boolean hasFrequency();
    /**
     * <code>required double frequency = 2;</code>
     */
    double getFrequency();

    // required double signal_level = 3;
    /**
     * <code>required double signal_level = 3;</code>
     */
    boolean hasSignalLevel();
    /**
     * <code>required double signal_level = 3;</code>
     */
    double getSignalLevel();
  }
  /**
   * Protobuf type {@code gazebo.msgs.WirelessNode}
   */
  public static final class WirelessNode extends
      com.google.protobuf.GeneratedMessage
      implements WirelessNodeOrBuilder {
    // Use WirelessNode.newBuilder() to construct.
    private WirelessNode(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WirelessNode(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WirelessNode defaultInstance;
    public static WirelessNode getDefaultInstance() {
      return defaultInstance;
    }

    public WirelessNode getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WirelessNode(
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
              essid_ = input.readBytes();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              frequency_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              signalLevel_ = input.readDouble();
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
      return gazebo.msgs.GzWirelessNode.internal_static_gazebo_msgs_WirelessNode_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzWirelessNode.internal_static_gazebo_msgs_WirelessNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzWirelessNode.WirelessNode.class, gazebo.msgs.GzWirelessNode.WirelessNode.Builder.class);
    }

    public static com.google.protobuf.Parser<WirelessNode> PARSER =
        new com.google.protobuf.AbstractParser<WirelessNode>() {
      public WirelessNode parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WirelessNode(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WirelessNode> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string essid = 1;
    public static final int ESSID_FIELD_NUMBER = 1;
    private java.lang.Object essid_;
    /**
     * <code>required string essid = 1;</code>
     */
    public boolean hasEssid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string essid = 1;</code>
     */
    public java.lang.String getEssid() {
      java.lang.Object ref = essid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          essid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string essid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEssidBytes() {
      java.lang.Object ref = essid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        essid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required double frequency = 2;
    public static final int FREQUENCY_FIELD_NUMBER = 2;
    private double frequency_;
    /**
     * <code>required double frequency = 2;</code>
     */
    public boolean hasFrequency() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double frequency = 2;</code>
     */
    public double getFrequency() {
      return frequency_;
    }

    // required double signal_level = 3;
    public static final int SIGNAL_LEVEL_FIELD_NUMBER = 3;
    private double signalLevel_;
    /**
     * <code>required double signal_level = 3;</code>
     */
    public boolean hasSignalLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double signal_level = 3;</code>
     */
    public double getSignalLevel() {
      return signalLevel_;
    }

    private void initFields() {
      essid_ = "";
      frequency_ = 0D;
      signalLevel_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasEssid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFrequency()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSignalLevel()) {
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
        output.writeBytes(1, getEssidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, frequency_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, signalLevel_);
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
          .computeBytesSize(1, getEssidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, frequency_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, signalLevel_);
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

    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzWirelessNode.WirelessNode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzWirelessNode.WirelessNode prototype) {
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
     * Protobuf type {@code gazebo.msgs.WirelessNode}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzWirelessNode.WirelessNodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzWirelessNode.internal_static_gazebo_msgs_WirelessNode_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzWirelessNode.internal_static_gazebo_msgs_WirelessNode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzWirelessNode.WirelessNode.class, gazebo.msgs.GzWirelessNode.WirelessNode.Builder.class);
      }

      // Construct using gazebo.msgs.GzWirelessNode.WirelessNode.newBuilder()
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
        essid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        frequency_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        signalLevel_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzWirelessNode.internal_static_gazebo_msgs_WirelessNode_descriptor;
      }

      public gazebo.msgs.GzWirelessNode.WirelessNode getDefaultInstanceForType() {
        return gazebo.msgs.GzWirelessNode.WirelessNode.getDefaultInstance();
      }

      public gazebo.msgs.GzWirelessNode.WirelessNode build() {
        gazebo.msgs.GzWirelessNode.WirelessNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzWirelessNode.WirelessNode buildPartial() {
        gazebo.msgs.GzWirelessNode.WirelessNode result = new gazebo.msgs.GzWirelessNode.WirelessNode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.essid_ = essid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.frequency_ = frequency_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.signalLevel_ = signalLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzWirelessNode.WirelessNode) {
          return mergeFrom((gazebo.msgs.GzWirelessNode.WirelessNode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzWirelessNode.WirelessNode other) {
        if (other == gazebo.msgs.GzWirelessNode.WirelessNode.getDefaultInstance()) return this;
        if (other.hasEssid()) {
          bitField0_ |= 0x00000001;
          essid_ = other.essid_;
          onChanged();
        }
        if (other.hasFrequency()) {
          setFrequency(other.getFrequency());
        }
        if (other.hasSignalLevel()) {
          setSignalLevel(other.getSignalLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasEssid()) {
          
          return false;
        }
        if (!hasFrequency()) {
          
          return false;
        }
        if (!hasSignalLevel()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzWirelessNode.WirelessNode parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzWirelessNode.WirelessNode) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string essid = 1;
      private java.lang.Object essid_ = "";
      /**
       * <code>required string essid = 1;</code>
       */
      public boolean hasEssid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string essid = 1;</code>
       */
      public java.lang.String getEssid() {
        java.lang.Object ref = essid_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          essid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string essid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEssidBytes() {
        java.lang.Object ref = essid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          essid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string essid = 1;</code>
       */
      public Builder setEssid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        essid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string essid = 1;</code>
       */
      public Builder clearEssid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        essid_ = getDefaultInstance().getEssid();
        onChanged();
        return this;
      }
      /**
       * <code>required string essid = 1;</code>
       */
      public Builder setEssidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        essid_ = value;
        onChanged();
        return this;
      }

      // required double frequency = 2;
      private double frequency_ ;
      /**
       * <code>required double frequency = 2;</code>
       */
      public boolean hasFrequency() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double frequency = 2;</code>
       */
      public double getFrequency() {
        return frequency_;
      }
      /**
       * <code>required double frequency = 2;</code>
       */
      public Builder setFrequency(double value) {
        bitField0_ |= 0x00000002;
        frequency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double frequency = 2;</code>
       */
      public Builder clearFrequency() {
        bitField0_ = (bitField0_ & ~0x00000002);
        frequency_ = 0D;
        onChanged();
        return this;
      }

      // required double signal_level = 3;
      private double signalLevel_ ;
      /**
       * <code>required double signal_level = 3;</code>
       */
      public boolean hasSignalLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double signal_level = 3;</code>
       */
      public double getSignalLevel() {
        return signalLevel_;
      }
      /**
       * <code>required double signal_level = 3;</code>
       */
      public Builder setSignalLevel(double value) {
        bitField0_ |= 0x00000004;
        signalLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double signal_level = 3;</code>
       */
      public Builder clearSignalLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        signalLevel_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.WirelessNode)
    }

    static {
      defaultInstance = new WirelessNode(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.WirelessNode)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_WirelessNode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_WirelessNode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023wireless_node.proto\022\013gazebo.msgs\"F\n\014Wi" +
      "relessNode\022\r\n\005essid\030\001 \002(\t\022\021\n\tfrequency\030\002" +
      " \002(\001\022\024\n\014signal_level\030\003 \002(\001B\020B\016GzWireless" +
      "Node"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_WirelessNode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_WirelessNode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_WirelessNode_descriptor,
              new java.lang.String[] { "Essid", "Frequency", "SignalLevel", });
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
