// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TrackableObjectGraph_TrackableObject_SlotVariableReference extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackableObjectGraph_TrackableObject_SlotVariableReference(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackableObjectGraph_TrackableObject_SlotVariableReference(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackableObjectGraph_TrackableObject_SlotVariableReference position(long position) {
        return (TrackableObjectGraph_TrackableObject_SlotVariableReference)super.position(position);
    }

  public TrackableObjectGraph_TrackableObject_SlotVariableReference() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TrackableObjectGraph_TrackableObject_SlotVariableReference(@Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference from);

  public native @ByRef @Name("operator =") TrackableObjectGraph_TrackableObject_SlotVariableReference put(@Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TrackableObjectGraph_TrackableObject_SlotVariableReference internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TrackableObjectGraph_TrackableObject_SlotVariableReference other);
  public native void Swap(TrackableObjectGraph_TrackableObject_SlotVariableReference other);
  

  // implements Message ----------------------------------------------

  public native TrackableObjectGraph_TrackableObject_SlotVariableReference New();

  public native TrackableObjectGraph_TrackableObject_SlotVariableReference New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference from);
  public native void MergeFrom(@Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference from);
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

  // string slot_name = 2;
  public native void clear_slot_name();
  @MemberGetter public static native int kSlotNameFieldNumber();
  public static final int kSlotNameFieldNumber = kSlotNameFieldNumber();
  public native @StdString BytePointer slot_name();
  public native void set_slot_name(@StdString BytePointer value);
  public native void set_slot_name(@StdString String value);
  public native void set_slot_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_slot_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_slot_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_slot_name();
  public native void set_allocated_slot_name(@StdString @Cast({"char*", "std::string*"}) BytePointer slot_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_slot_name();
  public native void unsafe_arena_set_allocated_slot_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer slot_name);

  // int32 original_variable_node_id = 1;
  public native void clear_original_variable_node_id();
  @MemberGetter public static native int kOriginalVariableNodeIdFieldNumber();
  public static final int kOriginalVariableNodeIdFieldNumber = kOriginalVariableNodeIdFieldNumber();
  public native @Cast("google::protobuf::int32") int original_variable_node_id();
  public native void set_original_variable_node_id(@Cast("google::protobuf::int32") int value);

  // int32 slot_variable_node_id = 3;
  public native void clear_slot_variable_node_id();
  @MemberGetter public static native int kSlotVariableNodeIdFieldNumber();
  public static final int kSlotVariableNodeIdFieldNumber = kSlotVariableNodeIdFieldNumber();
  public native @Cast("google::protobuf::int32") int slot_variable_node_id();
  public native void set_slot_variable_node_id(@Cast("google::protobuf::int32") int value);
}
