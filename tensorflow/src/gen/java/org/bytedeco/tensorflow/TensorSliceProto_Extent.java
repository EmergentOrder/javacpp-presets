// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSliceProto_Extent extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSliceProto_Extent(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorSliceProto_Extent(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorSliceProto_Extent position(long position) {
        return (TensorSliceProto_Extent)super.position(position);
    }

  public TensorSliceProto_Extent() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorSliceProto_Extent(@Const @ByRef TensorSliceProto_Extent from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorSliceProto_Extent from);

  public native @ByRef @Name("operator =") TensorSliceProto_Extent put(@Const @ByRef TensorSliceProto_Extent from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TensorSliceProto_Extent default_instance();

  /** enum tensorflow::TensorSliceProto_Extent::HasLengthCase */
  public static final int
    kLength = 2,
    HAS_LENGTH_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorSliceProto_Extent internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TensorSliceProto_Extent other);
  public native void Swap(TensorSliceProto_Extent other);
  

  // implements Message ----------------------------------------------

  public native TensorSliceProto_Extent New();

  public native TensorSliceProto_Extent New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorSliceProto_Extent from);
  public native void MergeFrom(@Const @ByRef TensorSliceProto_Extent from);
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

  // int64 start = 1;
  public native void clear_start();
  @MemberGetter public static native int kStartFieldNumber();
  public static final int kStartFieldNumber = kStartFieldNumber();
  public native @Cast("google::protobuf::int64") long start();
  public native void set_start(@Cast("google::protobuf::int64") long value);
  public native void clear_length();
  @MemberGetter public static native int kLengthFieldNumber();
  public static final int kLengthFieldNumber = kLengthFieldNumber();
  public native @Cast("google::protobuf::int64") long length();
  public native void set_length(@Cast("google::protobuf::int64") long value);

  public native void clear_has_length();
  public native @Cast("tensorflow::TensorSliceProto_Extent::HasLengthCase") int has_length_case();
}
