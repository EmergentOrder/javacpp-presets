// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class KernelDef_AttrConstraint extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelDef_AttrConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KernelDef_AttrConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KernelDef_AttrConstraint position(long position) {
        return (KernelDef_AttrConstraint)super.position(position);
    }

  public KernelDef_AttrConstraint() { super((Pointer)null); allocate(); }
  private native void allocate();

  public KernelDef_AttrConstraint(@Const @ByRef KernelDef_AttrConstraint from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef KernelDef_AttrConstraint from);

  public native @ByRef @Name("operator =") KernelDef_AttrConstraint put(@Const @ByRef KernelDef_AttrConstraint from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef KernelDef_AttrConstraint default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const KernelDef_AttrConstraint internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(KernelDef_AttrConstraint other);
  public native void Swap(KernelDef_AttrConstraint other);
  

  // implements Message ----------------------------------------------

  public native KernelDef_AttrConstraint New();

  public native KernelDef_AttrConstraint New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef KernelDef_AttrConstraint from);
  public native void MergeFrom(@Const @ByRef KernelDef_AttrConstraint from);
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

  // .tensorflow.AttrValue allowed_values = 2;
  public native @Cast("bool") boolean has_allowed_values();
  public native void clear_allowed_values();
  @MemberGetter public static native int kAllowedValuesFieldNumber();
  public static final int kAllowedValuesFieldNumber = kAllowedValuesFieldNumber();
  public native @Const @ByRef AttrValue allowed_values();
  public native AttrValue release_allowed_values();
  public native AttrValue mutable_allowed_values();
  public native void set_allocated_allowed_values(AttrValue allowed_values);
  public native void unsafe_arena_set_allocated_allowed_values(
        AttrValue allowed_values);
  public native AttrValue unsafe_arena_release_allowed_values();
}
