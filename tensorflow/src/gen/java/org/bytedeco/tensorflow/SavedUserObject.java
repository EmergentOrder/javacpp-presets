// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedUserObject extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedUserObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedUserObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedUserObject position(long position) {
        return (SavedUserObject)super.position(position);
    }

  public SavedUserObject() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedUserObject(@Const @ByRef SavedUserObject from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedUserObject from);

  public native @ByRef @Name("operator =") SavedUserObject put(@Const @ByRef SavedUserObject from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef SavedUserObject default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedUserObject internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedUserObject other);
  public native void Swap(SavedUserObject other);
  

  // implements Message ----------------------------------------------

  public native SavedUserObject New();

  public native SavedUserObject New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedUserObject from);
  public native void MergeFrom(@Const @ByRef SavedUserObject from);
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

  // string identifier = 1;
  public native void clear_identifier();
  @MemberGetter public static native int kIdentifierFieldNumber();
  public static final int kIdentifierFieldNumber = kIdentifierFieldNumber();
  public native @StdString BytePointer identifier();
  public native void set_identifier(@StdString BytePointer value);
  public native void set_identifier(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_identifier(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_identifier(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_identifier();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_identifier();
  public native void set_allocated_identifier(@StdString @Cast({"char*", "std::string*"}) BytePointer identifier);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_identifier();
  public native void unsafe_arena_set_allocated_identifier(
        @StdString @Cast({"char*", "std::string*"}) BytePointer identifier);

  // .tensorflow.VersionDef version = 2;
  public native @Cast("bool") boolean has_version();
  public native void clear_version();
  @MemberGetter public static native int kVersionFieldNumber();
  public static final int kVersionFieldNumber = kVersionFieldNumber();
  public native @Const @ByRef VersionDef version();
  public native VersionDef release_version();
  public native VersionDef mutable_version();
  public native void set_allocated_version(VersionDef version);
  public native void unsafe_arena_set_allocated_version(
        VersionDef version);
  public native VersionDef unsafe_arena_release_version();
}
