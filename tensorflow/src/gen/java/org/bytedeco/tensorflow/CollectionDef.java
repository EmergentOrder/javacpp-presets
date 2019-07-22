// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectionDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectionDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollectionDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CollectionDef position(long position) {
        return (CollectionDef)super.position(position);
    }

  public CollectionDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CollectionDef(@Const @ByRef CollectionDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CollectionDef from);

  public native @ByRef @Name("operator =") CollectionDef put(@Const @ByRef CollectionDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CollectionDef default_instance();

  /** enum tensorflow::CollectionDef::KindCase */
  public static final int
    kNodeList = 1,
    kBytesList = 2,
    kInt64List = 3,
    kFloatList = 4,
    kAnyList = 5,
    KIND_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CollectionDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CollectionDef other);
  public native void Swap(CollectionDef other);
  

  // implements Message ----------------------------------------------

  public native CollectionDef New();

  public native CollectionDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CollectionDef from);
  public native void MergeFrom(@Const @ByRef CollectionDef from);
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

  // .tensorflow.CollectionDef.NodeList node_list = 1;
  public native @Cast("bool") boolean has_node_list();
  public native void clear_node_list();
  @MemberGetter public static native int kNodeListFieldNumber();
  public static final int kNodeListFieldNumber = kNodeListFieldNumber();
  public native @Const @ByRef CollectionDef_NodeList node_list();
  public native CollectionDef_NodeList release_node_list();
  public native CollectionDef_NodeList mutable_node_list();
  public native void set_allocated_node_list(CollectionDef_NodeList node_list);
  public native void unsafe_arena_set_allocated_node_list(
        CollectionDef_NodeList node_list);
  public native CollectionDef_NodeList unsafe_arena_release_node_list();

  // .tensorflow.CollectionDef.BytesList bytes_list = 2;
  public native @Cast("bool") boolean has_bytes_list();
  public native void clear_bytes_list();
  @MemberGetter public static native int kBytesListFieldNumber();
  public static final int kBytesListFieldNumber = kBytesListFieldNumber();
  public native @Const @ByRef CollectionDef_BytesList bytes_list();
  public native CollectionDef_BytesList release_bytes_list();
  public native CollectionDef_BytesList mutable_bytes_list();
  public native void set_allocated_bytes_list(CollectionDef_BytesList bytes_list);
  public native void unsafe_arena_set_allocated_bytes_list(
        CollectionDef_BytesList bytes_list);
  public native CollectionDef_BytesList unsafe_arena_release_bytes_list();

  // .tensorflow.CollectionDef.Int64List int64_list = 3;
  public native @Cast("bool") boolean has_int64_list();
  public native void clear_int64_list();
  @MemberGetter public static native int kInt64ListFieldNumber();
  public static final int kInt64ListFieldNumber = kInt64ListFieldNumber();
  public native @Const @ByRef CollectionDef_Int64List int64_list();
  public native CollectionDef_Int64List release_int64_list();
  public native CollectionDef_Int64List mutable_int64_list();
  public native void set_allocated_int64_list(CollectionDef_Int64List int64_list);
  public native void unsafe_arena_set_allocated_int64_list(
        CollectionDef_Int64List int64_list);
  public native CollectionDef_Int64List unsafe_arena_release_int64_list();

  // .tensorflow.CollectionDef.FloatList float_list = 4;
  public native @Cast("bool") boolean has_float_list();
  public native void clear_float_list();
  @MemberGetter public static native int kFloatListFieldNumber();
  public static final int kFloatListFieldNumber = kFloatListFieldNumber();
  public native @Const @ByRef CollectionDef_FloatList float_list();
  public native CollectionDef_FloatList release_float_list();
  public native CollectionDef_FloatList mutable_float_list();
  public native void set_allocated_float_list(CollectionDef_FloatList float_list);
  public native void unsafe_arena_set_allocated_float_list(
        CollectionDef_FloatList float_list);
  public native CollectionDef_FloatList unsafe_arena_release_float_list();

  // .tensorflow.CollectionDef.AnyList any_list = 5;
  public native @Cast("bool") boolean has_any_list();
  public native void clear_any_list();
  @MemberGetter public static native int kAnyListFieldNumber();
  public static final int kAnyListFieldNumber = kAnyListFieldNumber();
  public native @Const @ByRef CollectionDef_AnyList any_list();
  public native CollectionDef_AnyList release_any_list();
  public native CollectionDef_AnyList mutable_any_list();
  public native void set_allocated_any_list(CollectionDef_AnyList any_list);
  public native void unsafe_arena_set_allocated_any_list(
        CollectionDef_AnyList any_list);
  public native CollectionDef_AnyList unsafe_arena_release_any_list();

  public native void clear_kind();
  public native @Cast("tensorflow::CollectionDef::KindCase") int kind_case();
}
