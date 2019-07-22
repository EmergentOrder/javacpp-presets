// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InterconnectLink extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterconnectLink(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InterconnectLink(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InterconnectLink position(long position) {
        return (InterconnectLink)super.position(position);
    }

  public InterconnectLink() { super((Pointer)null); allocate(); }
  private native void allocate();

  public InterconnectLink(@Const @ByRef InterconnectLink from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef InterconnectLink from);

  public native @ByRef @Name("operator =") InterconnectLink put(@Const @ByRef InterconnectLink from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef InterconnectLink default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const InterconnectLink internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(InterconnectLink other);
  public native void Swap(InterconnectLink other);
  

  // implements Message ----------------------------------------------

  public native InterconnectLink New();

  public native InterconnectLink New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef InterconnectLink from);
  public native void MergeFrom(@Const @ByRef InterconnectLink from);
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

  // string type = 2;
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @StdString BytePointer type();
  public native void set_type(@StdString BytePointer value);
  public native void set_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type();
  public native void set_allocated_type(@StdString @Cast({"char*", "std::string*"}) BytePointer type);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_type();
  public native void unsafe_arena_set_allocated_type(
        @StdString @Cast({"char*", "std::string*"}) BytePointer type);

  // int32 device_id = 1;
  public native void clear_device_id();
  @MemberGetter public static native int kDeviceIdFieldNumber();
  public static final int kDeviceIdFieldNumber = kDeviceIdFieldNumber();
  public native @Cast("google::protobuf::int32") int device_id();
  public native void set_device_id(@Cast("google::protobuf::int32") int value);

  // int32 strength = 3;
  public native void clear_strength();
  @MemberGetter public static native int kStrengthFieldNumber();
  public static final int kStrengthFieldNumber = kStrengthFieldNumber();
  public native @Cast("google::protobuf::int32") int strength();
  public native void set_strength(@Cast("google::protobuf::int32") int value);
}
