// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CompleteInstanceRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompleteInstanceRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompleteInstanceRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompleteInstanceRequest position(long position) {
        return (CompleteInstanceRequest)super.position(position);
    }

  public CompleteInstanceRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CompleteInstanceRequest(@Const @ByRef CompleteInstanceRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CompleteInstanceRequest from);

  public native @ByRef @Name("operator =") CompleteInstanceRequest put(@Const @ByRef CompleteInstanceRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CompleteInstanceRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CompleteInstanceRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CompleteInstanceRequest other);
  public native void Swap(CompleteInstanceRequest other);
  

  // implements Message ----------------------------------------------

  public native CompleteInstanceRequest New();

  public native CompleteInstanceRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CompleteInstanceRequest from);
  public native void MergeFrom(@Const @ByRef CompleteInstanceRequest from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated int32 subdiv_offset = 9;
  public native int subdiv_offset_size();
  public native void clear_subdiv_offset();
  @MemberGetter public static native int kSubdivOffsetFieldNumber();
  public static final int kSubdivOffsetFieldNumber = kSubdivOffsetFieldNumber();
  public native @Cast("google::protobuf::int32") int subdiv_offset(int index);
  public native void set_subdiv_offset(int index, @Cast("google::protobuf::int32") int value);
  public native void add_subdiv_offset(@Cast("google::protobuf::int32") int value);

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string device_type = 8;
  public native void clear_device_type();
  @MemberGetter public static native int kDeviceTypeFieldNumber();
  public static final int kDeviceTypeFieldNumber = kDeviceTypeFieldNumber();
  public native @StdString BytePointer device_type();
  public native void set_device_type(@StdString BytePointer value);
  public native void set_device_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_device_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device_type();
  public native void set_allocated_device_type(@StdString @Cast({"char*", "std::string*"}) BytePointer device_type);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_device_type();
  public native void unsafe_arena_set_allocated_device_type(
        @StdString @Cast({"char*", "std::string*"}) BytePointer device_type);

  // string device = 10;
  public native void clear_device();
  @MemberGetter public static native int kDeviceFieldNumber();
  public static final int kDeviceFieldNumber = kDeviceFieldNumber();
  public native @StdString BytePointer device();
  public native void set_device(@StdString BytePointer value);
  public native void set_device(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device();
  public native void set_allocated_device(@StdString @Cast({"char*", "std::string*"}) BytePointer device);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_device();
  public native void unsafe_arena_set_allocated_device(
        @StdString @Cast({"char*", "std::string*"}) BytePointer device);

  // .tensorflow.TensorShapeProto shape = 4;
  public native @Cast("bool") boolean has_shape();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto shape();
  public native TensorShapeProto release_shape();
  public native TensorShapeProto mutable_shape();
  public native void set_allocated_shape(TensorShapeProto shape);
  public native void unsafe_arena_set_allocated_shape(
        TensorShapeProto shape);
  public native TensorShapeProto unsafe_arena_release_shape();

  // int32 type = 2;
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @Cast("google::protobuf::int32") int type();
  public native void set_type(@Cast("google::protobuf::int32") int value);

  // .tensorflow.DataType data_type = 3;
  public native void clear_data_type();
  @MemberGetter public static native int kDataTypeFieldNumber();
  public static final int kDataTypeFieldNumber = kDataTypeFieldNumber();
  public native @Cast("tensorflow::DataType") int data_type();
  public native void set_data_type(@Cast("tensorflow::DataType") int value);

  // int32 group_key = 5;
  public native void clear_group_key();
  @MemberGetter public static native int kGroupKeyFieldNumber();
  public static final int kGroupKeyFieldNumber = kGroupKeyFieldNumber();
  public native @Cast("google::protobuf::int32") int group_key();
  public native void set_group_key(@Cast("google::protobuf::int32") int value);

  // int32 group_size = 6;
  public native void clear_group_size();
  @MemberGetter public static native int kGroupSizeFieldNumber();
  public static final int kGroupSizeFieldNumber = kGroupSizeFieldNumber();
  public native @Cast("google::protobuf::int32") int group_size();
  public native void set_group_size(@Cast("google::protobuf::int32") int value);

  // int32 instance_key = 7;
  public native void clear_instance_key();
  @MemberGetter public static native int kInstanceKeyFieldNumber();
  public static final int kInstanceKeyFieldNumber = kInstanceKeyFieldNumber();
  public native @Cast("google::protobuf::int32") int instance_key();
  public native void set_instance_key(@Cast("google::protobuf::int32") int value);

  // bool is_source = 11;
  public native void clear_is_source();
  @MemberGetter public static native int kIsSourceFieldNumber();
  public static final int kIsSourceFieldNumber = kIsSourceFieldNumber();
  public native @Cast("bool") boolean is_source();
  public native void set_is_source(@Cast("bool") boolean value);
}
