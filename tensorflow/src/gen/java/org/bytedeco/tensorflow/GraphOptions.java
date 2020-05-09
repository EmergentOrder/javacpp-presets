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
public class GraphOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphOptions position(long position) {
        return (GraphOptions)super.position(position);
    }

  public GraphOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GraphOptions(@Const @ByRef GraphOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GraphOptions from);

  public native @ByRef @Name("operator =") GraphOptions put(@Const @ByRef GraphOptions from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef GraphOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GraphOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(GraphOptions other);
  public native void Swap(GraphOptions other);
  

  // implements Message ----------------------------------------------

  public native GraphOptions New();

  public native GraphOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GraphOptions from);
  public native void MergeFrom(@Const @ByRef GraphOptions from);
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

  // .tensorflow.OptimizerOptions optimizer_options = 3;
  public native @Cast("bool") boolean has_optimizer_options();
  public native void clear_optimizer_options();
  @MemberGetter public static native int kOptimizerOptionsFieldNumber();
  public static final int kOptimizerOptionsFieldNumber = kOptimizerOptionsFieldNumber();
  public native @Const @ByRef OptimizerOptions optimizer_options();
  public native OptimizerOptions release_optimizer_options();
  public native OptimizerOptions mutable_optimizer_options();
  public native void set_allocated_optimizer_options(OptimizerOptions optimizer_options);
  public native void unsafe_arena_set_allocated_optimizer_options(
        OptimizerOptions optimizer_options);
  public native OptimizerOptions unsafe_arena_release_optimizer_options();

  // .tensorflow.RewriterConfig rewrite_options = 10;
  public native @Cast("bool") boolean has_rewrite_options();
  public native void clear_rewrite_options();
  @MemberGetter public static native int kRewriteOptionsFieldNumber();
  public static final int kRewriteOptionsFieldNumber = kRewriteOptionsFieldNumber();
  public native @Const @ByRef RewriterConfig rewrite_options();
  public native RewriterConfig release_rewrite_options();
  public native RewriterConfig mutable_rewrite_options();
  public native void set_allocated_rewrite_options(RewriterConfig rewrite_options);
  public native void unsafe_arena_set_allocated_rewrite_options(
        RewriterConfig rewrite_options);
  public native RewriterConfig unsafe_arena_release_rewrite_options();

  // int64 build_cost_model = 4;
  public native void clear_build_cost_model();
  @MemberGetter public static native int kBuildCostModelFieldNumber();
  public static final int kBuildCostModelFieldNumber = kBuildCostModelFieldNumber();
  public native @Cast("google::protobuf::int64") long build_cost_model();
  public native void set_build_cost_model(@Cast("google::protobuf::int64") long value);

  // bool enable_recv_scheduling = 2;
  public native void clear_enable_recv_scheduling();
  @MemberGetter public static native int kEnableRecvSchedulingFieldNumber();
  public static final int kEnableRecvSchedulingFieldNumber = kEnableRecvSchedulingFieldNumber();
  public native @Cast("bool") boolean enable_recv_scheduling();
  public native void set_enable_recv_scheduling(@Cast("bool") boolean value);

  // bool infer_shapes = 5;
  public native void clear_infer_shapes();
  @MemberGetter public static native int kInferShapesFieldNumber();
  public static final int kInferShapesFieldNumber = kInferShapesFieldNumber();
  public native @Cast("bool") boolean infer_shapes();
  public native void set_infer_shapes(@Cast("bool") boolean value);

  // bool place_pruned_graph = 6;
  public native void clear_place_pruned_graph();
  @MemberGetter public static native int kPlacePrunedGraphFieldNumber();
  public static final int kPlacePrunedGraphFieldNumber = kPlacePrunedGraphFieldNumber();
  public native @Cast("bool") boolean place_pruned_graph();
  public native void set_place_pruned_graph(@Cast("bool") boolean value);

  // bool enable_bfloat16_sendrecv = 7;
  public native void clear_enable_bfloat16_sendrecv();
  @MemberGetter public static native int kEnableBfloat16SendrecvFieldNumber();
  public static final int kEnableBfloat16SendrecvFieldNumber = kEnableBfloat16SendrecvFieldNumber();
  public native @Cast("bool") boolean enable_bfloat16_sendrecv();
  public native void set_enable_bfloat16_sendrecv(@Cast("bool") boolean value);

  // int32 timeline_step = 8;
  public native void clear_timeline_step();
  @MemberGetter public static native int kTimelineStepFieldNumber();
  public static final int kTimelineStepFieldNumber = kTimelineStepFieldNumber();
  public native @Cast("google::protobuf::int32") int timeline_step();
  public native void set_timeline_step(@Cast("google::protobuf::int32") int value);

  // int64 build_cost_model_after = 9;
  public native void clear_build_cost_model_after();
  @MemberGetter public static native int kBuildCostModelAfterFieldNumber();
  public static final int kBuildCostModelAfterFieldNumber = kBuildCostModelAfterFieldNumber();
  public native @Cast("google::protobuf::int64") long build_cost_model_after();
  public native void set_build_cost_model_after(@Cast("google::protobuf::int64") long value);
}
