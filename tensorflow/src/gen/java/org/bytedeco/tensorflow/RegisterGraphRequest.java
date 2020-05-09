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
public class RegisterGraphRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegisterGraphRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RegisterGraphRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RegisterGraphRequest position(long position) {
        return (RegisterGraphRequest)super.position(position);
    }

  public RegisterGraphRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RegisterGraphRequest(@Const @ByRef RegisterGraphRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RegisterGraphRequest from);

  public native @ByRef @Name("operator =") RegisterGraphRequest put(@Const @ByRef RegisterGraphRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RegisterGraphRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RegisterGraphRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RegisterGraphRequest other);
  public native void Swap(RegisterGraphRequest other);
  

  // implements Message ----------------------------------------------

  public native RegisterGraphRequest New();

  public native RegisterGraphRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RegisterGraphRequest from);
  public native void MergeFrom(@Const @ByRef RegisterGraphRequest from);
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

  // string session_handle = 1;
  public native void clear_session_handle();
  @MemberGetter public static native int kSessionHandleFieldNumber();
  public static final int kSessionHandleFieldNumber = kSessionHandleFieldNumber();
  public native @StdString BytePointer session_handle();
  public native void set_session_handle(@StdString BytePointer value);
  public native void set_session_handle(@StdString String value);
  public native void set_session_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_session_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_session_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_session_handle();
  public native void set_allocated_session_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_session_handle();
  public native void unsafe_arena_set_allocated_session_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);

  // .tensorflow.GraphDef graph_def = 2;
  public native @Cast("bool") boolean has_graph_def();
  public native void clear_graph_def();
  @MemberGetter public static native int kGraphDefFieldNumber();
  public static final int kGraphDefFieldNumber = kGraphDefFieldNumber();
  public native @Const @ByRef GraphDef graph_def();
  public native GraphDef release_graph_def();
  public native GraphDef mutable_graph_def();
  public native void set_allocated_graph_def(GraphDef graph_def);
  public native void unsafe_arena_set_allocated_graph_def(
        GraphDef graph_def);
  public native GraphDef unsafe_arena_release_graph_def();

  // .tensorflow.GraphOptions graph_options = 4;
  public native @Cast("bool") boolean has_graph_options();
  public native void clear_graph_options();
  @MemberGetter public static native int kGraphOptionsFieldNumber();
  public static final int kGraphOptionsFieldNumber = kGraphOptionsFieldNumber();
  public native @Const @ByRef GraphOptions graph_options();
  public native GraphOptions release_graph_options();
  public native GraphOptions mutable_graph_options();
  public native void set_allocated_graph_options(GraphOptions graph_options);
  public native void unsafe_arena_set_allocated_graph_options(
        GraphOptions graph_options);
  public native GraphOptions unsafe_arena_release_graph_options();

  // .tensorflow.DebugOptions debug_options = 5;
  public native @Cast("bool") boolean has_debug_options();
  public native void clear_debug_options();
  @MemberGetter public static native int kDebugOptionsFieldNumber();
  public static final int kDebugOptionsFieldNumber = kDebugOptionsFieldNumber();
  public native @Const @ByRef DebugOptions debug_options();
  public native DebugOptions release_debug_options();
  public native DebugOptions mutable_debug_options();
  public native void set_allocated_debug_options(DebugOptions debug_options);
  public native void unsafe_arena_set_allocated_debug_options(
        DebugOptions debug_options);
  public native DebugOptions unsafe_arena_release_debug_options();

  // int64 collective_graph_key = 7;
  public native void clear_collective_graph_key();
  @MemberGetter public static native int kCollectiveGraphKeyFieldNumber();
  public static final int kCollectiveGraphKeyFieldNumber = kCollectiveGraphKeyFieldNumber();
  public native @Cast("google::protobuf::int64") long collective_graph_key();
  public native void set_collective_graph_key(@Cast("google::protobuf::int64") long value);

  // bool create_worker_session_called = 6;
  public native void clear_create_worker_session_called();
  @MemberGetter public static native int kCreateWorkerSessionCalledFieldNumber();
  public static final int kCreateWorkerSessionCalledFieldNumber = kCreateWorkerSessionCalledFieldNumber();
  public native @Cast("bool") boolean create_worker_session_called();
  public native void set_create_worker_session_called(@Cast("bool") boolean value);

  // bool has_control_flow = 3 [deprecated = true];
  public native @Deprecated void clear_has_control_flow();
  @MemberGetter public static native @Deprecated int kHasControlFlowFieldNumber();
  public static final int kHasControlFlowFieldNumber = kHasControlFlowFieldNumber();
  public native @Cast("bool") @Deprecated boolean has_control_flow();
  public native @Deprecated void set_has_control_flow(@Cast("bool") boolean value);
}
