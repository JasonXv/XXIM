package com.imclient.protocol;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgBody.proto

public final class MsgBody {
  private MsgBody() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageBodyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MessageBody)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string fromUser = 1;</code>
     */
    boolean hasFromUser();
    /**
     * <code>required string fromUser = 1;</code>
     */
    java.lang.String getFromUser();
    /**
     * <code>required string fromUser = 1;</code>
     */
    com.google.protobuf.ByteString
        getFromUserBytes();

    /**
     * <code>required string toUser = 2;</code>
     */
    boolean hasToUser();
    /**
     * <code>required string toUser = 2;</code>
     */
    java.lang.String getToUser();
    /**
     * <code>required string toUser = 2;</code>
     */
    com.google.protobuf.ByteString
        getToUserBytes();

    /**
     * <code>required string msgContent = 3;</code>
     */
    boolean hasMsgContent();
    /**
     * <code>required string msgContent = 3;</code>
     */
    java.lang.String getMsgContent();
    /**
     * <code>required string msgContent = 3;</code>
     */
    com.google.protobuf.ByteString
        getMsgContentBytes();
  }
  /**
   * Protobuf type {@code MessageBody}
   */
  public static final class MessageBody extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MessageBody)
      MessageBodyOrBuilder {
    // Use MessageBody.newBuilder() to construct.
    private MessageBody(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MessageBody(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MessageBody defaultInstance;
    public static MessageBody getDefaultInstance() {
      return defaultInstance;
    }

    public MessageBody getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MessageBody(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              fromUser_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              toUser_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              msgContent_ = bs;
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
      return MsgBody.internal_static_MessageBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MsgBody.internal_static_MessageBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MsgBody.MessageBody.class, MsgBody.MessageBody.Builder.class);
    }

    public static com.google.protobuf.Parser<MessageBody> PARSER =
        new com.google.protobuf.AbstractParser<MessageBody>() {
      public MessageBody parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageBody(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MessageBody> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FROMUSER_FIELD_NUMBER = 1;
    private java.lang.Object fromUser_;
    /**
     * <code>required string fromUser = 1;</code>
     */
    public boolean hasFromUser() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string fromUser = 1;</code>
     */
    public java.lang.String getFromUser() {
      java.lang.Object ref = fromUser_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fromUser_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string fromUser = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromUserBytes() {
      java.lang.Object ref = fromUser_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOUSER_FIELD_NUMBER = 2;
    private java.lang.Object toUser_;
    /**
     * <code>required string toUser = 2;</code>
     */
    public boolean hasToUser() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string toUser = 2;</code>
     */
    public java.lang.String getToUser() {
      java.lang.Object ref = toUser_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          toUser_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string toUser = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToUserBytes() {
      java.lang.Object ref = toUser_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSGCONTENT_FIELD_NUMBER = 3;
    private java.lang.Object msgContent_;
    /**
     * <code>required string msgContent = 3;</code>
     */
    public boolean hasMsgContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string msgContent = 3;</code>
     */
    public java.lang.String getMsgContent() {
      java.lang.Object ref = msgContent_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msgContent_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string msgContent = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMsgContentBytes() {
      java.lang.Object ref = msgContent_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      fromUser_ = "";
      toUser_ = "";
      msgContent_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFromUser()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasToUser()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMsgContent()) {
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
        output.writeBytes(1, getFromUserBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getToUserBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMsgContentBytes());
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
          .computeBytesSize(1, getFromUserBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToUserBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMsgContentBytes());
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

    public static MsgBody.MessageBody parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MsgBody.MessageBody parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MsgBody.MessageBody parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MsgBody.MessageBody parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MsgBody.MessageBody parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MsgBody.MessageBody parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MsgBody.MessageBody parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MsgBody.MessageBody parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MsgBody.MessageBody parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MsgBody.MessageBody parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MsgBody.MessageBody prototype) {
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
     * Protobuf type {@code MessageBody}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MessageBody)
        MsgBody.MessageBodyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MsgBody.internal_static_MessageBody_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MsgBody.internal_static_MessageBody_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MsgBody.MessageBody.class, MsgBody.MessageBody.Builder.class);
      }

      // Construct using MsgBody.MessageBody.newBuilder()
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
        fromUser_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        toUser_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        msgContent_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MsgBody.internal_static_MessageBody_descriptor;
      }

      public MsgBody.MessageBody getDefaultInstanceForType() {
        return MsgBody.MessageBody.getDefaultInstance();
      }

      public MsgBody.MessageBody build() {
        MsgBody.MessageBody result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MsgBody.MessageBody buildPartial() {
        MsgBody.MessageBody result = new MsgBody.MessageBody(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fromUser_ = fromUser_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.toUser_ = toUser_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msgContent_ = msgContent_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MsgBody.MessageBody) {
          return mergeFrom((MsgBody.MessageBody)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MsgBody.MessageBody other) {
        if (other == MsgBody.MessageBody.getDefaultInstance()) return this;
        if (other.hasFromUser()) {
          bitField0_ |= 0x00000001;
          fromUser_ = other.fromUser_;
          onChanged();
        }
        if (other.hasToUser()) {
          bitField0_ |= 0x00000002;
          toUser_ = other.toUser_;
          onChanged();
        }
        if (other.hasMsgContent()) {
          bitField0_ |= 0x00000004;
          msgContent_ = other.msgContent_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFromUser()) {
          
          return false;
        }
        if (!hasToUser()) {
          
          return false;
        }
        if (!hasMsgContent()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MsgBody.MessageBody parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MsgBody.MessageBody) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object fromUser_ = "";
      /**
       * <code>required string fromUser = 1;</code>
       */
      public boolean hasFromUser() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string fromUser = 1;</code>
       */
      public java.lang.String getFromUser() {
        java.lang.Object ref = fromUser_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fromUser_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string fromUser = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFromUserBytes() {
        java.lang.Object ref = fromUser_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fromUser_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string fromUser = 1;</code>
       */
      public Builder setFromUser(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fromUser_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string fromUser = 1;</code>
       */
      public Builder clearFromUser() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fromUser_ = getDefaultInstance().getFromUser();
        onChanged();
        return this;
      }
      /**
       * <code>required string fromUser = 1;</code>
       */
      public Builder setFromUserBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fromUser_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object toUser_ = "";
      /**
       * <code>required string toUser = 2;</code>
       */
      public boolean hasToUser() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string toUser = 2;</code>
       */
      public java.lang.String getToUser() {
        java.lang.Object ref = toUser_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            toUser_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string toUser = 2;</code>
       */
      public com.google.protobuf.ByteString
          getToUserBytes() {
        java.lang.Object ref = toUser_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          toUser_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string toUser = 2;</code>
       */
      public Builder setToUser(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        toUser_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string toUser = 2;</code>
       */
      public Builder clearToUser() {
        bitField0_ = (bitField0_ & ~0x00000002);
        toUser_ = getDefaultInstance().getToUser();
        onChanged();
        return this;
      }
      /**
       * <code>required string toUser = 2;</code>
       */
      public Builder setToUserBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        toUser_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msgContent_ = "";
      /**
       * <code>required string msgContent = 3;</code>
       */
      public boolean hasMsgContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string msgContent = 3;</code>
       */
      public java.lang.String getMsgContent() {
        java.lang.Object ref = msgContent_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            msgContent_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string msgContent = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMsgContentBytes() {
        java.lang.Object ref = msgContent_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgContent_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string msgContent = 3;</code>
       */
      public Builder setMsgContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msgContent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string msgContent = 3;</code>
       */
      public Builder clearMsgContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msgContent_ = getDefaultInstance().getMsgContent();
        onChanged();
        return this;
      }
      /**
       * <code>required string msgContent = 3;</code>
       */
      public Builder setMsgContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msgContent_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MessageBody)
    }

    static {
      defaultInstance = new MessageBody(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MessageBody)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageBody_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MessageBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMsgBody.proto\"C\n\013MessageBody\022\020\n\010fromUs" +
      "er\030\001 \002(\t\022\016\n\006toUser\030\002 \002(\t\022\022\n\nmsgContent\030\003" +
      " \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MessageBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MessageBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MessageBody_descriptor,
        new java.lang.String[] { "FromUser", "ToUser", "MsgContent", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
