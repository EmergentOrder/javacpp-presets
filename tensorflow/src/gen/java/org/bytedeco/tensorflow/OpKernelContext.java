// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpKernelContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpKernelContext(Pointer p) { super(p); }

  // The first element of a WrappedAllocator is a "base" Allocator and
  // the second element is that Allocator wrapped by a
  // TrackingAllocator

  // TODO(zhifengc): Do some cleanup of Params.
  // The Params struct is passed in to initialize an OpKernelContext,
  // and must outlive the OpKernelContext.
  public static class Params extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Params() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
  

    // The step being executed.
    public native @Cast("tensorflow::int64") long step_id(); public native Params step_id(long setter);

    // True if the op is created by eager runtime.
    public native @Cast("bool") boolean is_eager(); public native Params is_eager(boolean setter);

    // The op kernel being computed.
    public native OpKernel op_kernel(); public native Params op_kernel(OpKernel setter);

    // The device on which the kernel is running.
    public native DeviceBase device(); public native Params device(DeviceBase setter);

    // The Eigen GPU device wrapper, which may include a per-op
    // wrapped allocator. The concrete type of this object depends on
    // the type of this->device, so eigen_gpu_device can't be an
    // inline member and must be heap allocated. However, we don't
    // want to allocate a new eigen_gpu_device for every Op that is
    // executed. Instead this member is allocated on first use using
    // ensure_eigen_gpu_device, and then if the Params structure is
    // re-used for subsequent Ops, the eigen_gpu_device is
    // ReInitialized in the OpKernelContext constructor. Unlike the
    // other pointers in Params, this one is owned by Params.
    public native PerOpGpuDevice eigen_gpu_device(); public native Params eigen_gpu_device(PerOpGpuDevice setter);

    public native void ensure_eigen_gpu_device();

    public native @Cast("bool") boolean track_allocations(); public native Params track_allocations(boolean setter);
    public native @Cast("bool") boolean log_memory(); public native Params log_memory(boolean setter);
    public native @Cast("bool") boolean record_tensor_accesses(); public native Params record_tensor_accesses(boolean setter);

    // Array indexed by output number for this node
    public native @Const AllocatorAttributes output_attr_array(); public native Params output_attr_array(AllocatorAttributes setter);

    // Shared resources accessible by this op kernel invocation.
    public native ResourceMgr resource_manager(); public native Params resource_manager(ResourceMgr setter);

    // Per-step resources accessible by this op kernel invocation should be
    // stored in this container..
    public native ScopedStepContainer step_container(); public native Params step_container(ScopedStepContainer setter);

    // Mechanism used by this op kernel invocation to communicate with
    // computations running on other devices.
    public native Rendezvous rendezvous(); public native Params rendezvous(Rendezvous setter);
    public native @Cast("const std::function<tensorflow::Status(const int64,const DeviceMgr*,Rendezvous**r)>*") Pointer create_rendezvous(); public native Params create_rendezvous(Pointer setter);

    // Mechanism for executing a collective op that needs to coordinate
    // with parallel instances running on other devices.
    public native CollectiveExecutor collective_executor(); public native Params collective_executor(CollectiveExecutor setter);

    // The session state for this op.
    public native SessionState session_state(); public native Params session_state(SessionState setter);

    // Unique session identifier. Can be empty.
    public native @StdString BytePointer session_handle(); public native Params session_handle(BytePointer setter);

    // Metadata about the session. Can be nullptr.
    public native @Const SessionMetadata session_metadata(); public native Params session_metadata(SessionMetadata setter);

    // The tensor store for this op.
    public native TensorStore tensor_store(); public native Params tensor_store(TensorStore setter);

    // Mechanism used by this op kernel invocation to register a callback
    // for its cancellation.
    public native CancellationManager cancellation_manager(); public native Params cancellation_manager(CancellationManager setter);

    // Inputs to this op kernel.
    public native @Const TensorValueVector inputs(); public native Params inputs(TensorValueVector setter);
    public native @Cast("bool") boolean is_input_dead(); public native Params is_input_dead(boolean setter);

    public native @Const AllocatorAttributesVector input_alloc_attrs(); public native Params input_alloc_attrs(AllocatorAttributesVector setter);

    // Device contexts.
    public native @Const DeviceContextInlinedVector input_device_contexts(); public native Params input_device_contexts(DeviceContextInlinedVector setter);
    public native DeviceContext op_device_context(); public native Params op_device_context(DeviceContext setter);

    // Control-flow op supports.
    public native @ByRef FrameAndIter frame_iter(); public native Params frame_iter(FrameAndIter setter);

    // Function call supports.
    public native CallFrameInterface call_frame(); public native Params call_frame(CallFrameInterface setter);
    public native FunctionLibraryRuntime function_library(); public native Params function_library(FunctionLibraryRuntime setter);
    public native @Cast("std::function<void(std::function<void()>)>*") Pointer runner(); public native Params runner(Pointer setter);
    public native StepStatsCollectorInterface stats_collector(); public native Params stats_collector(StepStatsCollectorInterface setter);
    public native GraphCollector graph_collector(); public native Params graph_collector(GraphCollector setter);

    // TensorSliceReaderCache support.
    public native TensorSliceReaderCacheWrapper slice_reader_cache(); public native Params slice_reader_cache(TensorSliceReaderCacheWrapper setter);

    // Support for forwarding reservations (used by ScopedAllocator).
    @MemberGetter public static native int kNeverForward();
    public static final int kNeverForward = kNeverForward();
    @MemberGetter public static native int kNoReservation();
    public static final int kNoReservation = kNoReservation();
    // Values in [0,...) represent reservations for the indexed output.
    public native @Const IntPointer forward_from_array(); public native Params forward_from_array(IntPointer setter);

    // For tracking actively running deferred ops.
    @MemberSetter public native Params inc_num_deferred_ops_function(@ByVal Fn fn);
    @MemberSetter public native Params dec_num_deferred_ops_function(@ByVal Fn fn);
  }

  // params must outlive the OpKernelContext.
  public OpKernelContext(Params params) { super((Pointer)null); allocate(params); }
  private native void allocate(Params params);
  public OpKernelContext(Params params, int num_outputs) { super((Pointer)null); allocate(params, num_outputs); }
  private native void allocate(Params params, int num_outputs);

  public native Env env();

  public native @Cast("tensorflow::int64") long step_id();

  public native @Cast("bool") boolean is_eager();

  public native @Const @ByRef OpKernel op_kernel();

  // Input/output signature.

  public native int num_inputs();
  public native @Cast("tensorflow::DataType") int input_dtype(int index);
  public native @ByVal Status input_dtype(@StringPiece BytePointer name, @Cast("tensorflow::DataType*") IntPointer dtype);
  public native @ByVal Status input_dtype(@StringPiece String name, @Cast("tensorflow::DataType*") IntPointer dtype);
  public native @Cast("tensorflow::MemoryType") int input_memory_type(int index);

  public native int num_outputs();
  public native @Cast("tensorflow::DataType") int expected_output_dtype(int index);
  public native @Cast("tensorflow::MemoryType") int output_memory_type(int index);

  // Input

  // Returns an immutable input tensor. May only be used for non-Ref
  // inputs. For Ref inputs use mutable_input below.
  // REQUIRES: !IsRefType(input_dtype(index))
  // TODO(mrry): Convert this to return Status.
  public native @Const @ByRef Tensor input(int index);

  // Returns the named immutable input tensor in "tensor", as defined
  // in the OpDef. May only be used for non-Ref inputs. For Ref inputs
  // use mutable_input below.
  // REQUIRES: !IsRefType(input_dtype(index))
  // REQUIRES: the named input must not be a list.
  public native @ByVal Status input(@StringPiece BytePointer name, @Cast("const tensorflow::Tensor**") PointerPointer tensor);
  public native @ByVal Status input(@StringPiece BytePointer name, @Const @ByPtrPtr Tensor tensor);
  public native @ByVal Status input(@StringPiece String name, @Const @ByPtrPtr Tensor tensor);

  // Returns the named list-valued immutable input in "list", as
  // defined in the OpDef.  If the named output is not list-valued,
  // returns a one-element list. May only be used for non-Ref
  // inputs. For Ref inputs use mutable_input below.
  // REQUIRES: !IsRefType(input_dtype(index))
  public native @ByVal Status input_list(@StringPiece BytePointer name, OpInputList list);
  public native @ByVal Status input_list(@StringPiece String name, OpInputList list);

  // For mutable inputs, use the following together to make sure there
  // is no concurrent access to mutable_input(), e.g.:
  // {
  //   Tensor& t = context->mutable_input(index);
  //   mutex_lock lock(*context->input_ref_mutex(index));
  //   // modify the values in t
  // }
  // REQUIRES: IsRefType(input_dtype(index))
  public native @ByVal Status input_ref_mutex(@StringPiece BytePointer name, @Cast("tensorflow::mutex**") PointerPointer out_mutex);
  public native @ByVal Status input_ref_mutex(@StringPiece BytePointer name, @Cast("tensorflow::mutex**") @ByPtrPtr Pointer out_mutex);
  public native @ByVal Status input_ref_mutex(@StringPiece String name, @Cast("tensorflow::mutex**") @ByPtrPtr Pointer out_mutex);

  // Returns a mutable input tensor. Must be used to access Ref
  // inputs.  REQUIRES: IsRefType(input_dtype(index)). The caller may
  // modify the values stored in the Tensor buffer, and modifications
  // will be visible to other Ops reading the same ref tensor. If
  // !lock_held the input mutex will be acquired before returning the
  // Tensor.
  // TODO(mrry): Convert this to return Status.
  public native @ByVal Tensor mutable_input(int index, @Cast("bool") boolean lock_held);

  // Returns the named mutable input tensor in "tensor", as defined in
  // the OpDef. Must be used to access Ref inputs. The values stored
  // in the Tensor buffer may be modified, and modifications will be
  // visible to other Ops reading the same ref tensor. If !lock_held
  // the input mutex will be acquired before returning the Tensor.
  // REQUIRES: the named input must not be a list.
  // REQUIRES: the named input must be a ref tensor.
  public native @ByVal Status mutable_input(@StringPiece BytePointer name, Tensor tensor, @Cast("bool") boolean lock_held);
  public native @ByVal Status mutable_input(@StringPiece String name, Tensor tensor, @Cast("bool") boolean lock_held);

  // Returns the named list-valued mutable input in "list", as defined
  // in the OpDef.  If the named input is not list-valued, returns a
  // one-element list. Must be used to access Ref inputs. The values
  // stored in the Tensor buffer may be modified, and modifications
  // will be visible to other Ops reading the same ref tensor.
  // REQUIRES: the named input must be a ref tensor.
  public native @ByVal Status mutable_input_list(@StringPiece BytePointer name, OpMutableInputList list);
  public native @ByVal Status mutable_input_list(@StringPiece String name, OpMutableInputList list);

  // Replace the corresponding Ref Input to use the storage buffer
  // used by tensor. If !lock_held the input mutex will be acquired
  // before returning the Tensor.
  // REQUIRES: IsRefType(input_dtype(index)).
  public native void replace_ref_input(int index, @Const @ByRef Tensor tensor, @Cast("bool") boolean lock_held);

  // Replace the corresponding named Ref Input to use the storage
  // buffer used by tensor. If !lock_held the input mutex will be
  // acquired before returning the Tensor.
  // REQUIRES: IsRefType(input_dtype(index)).
  public native @ByVal Status replace_ref_input(@StringPiece BytePointer name, @Const @ByRef Tensor tensor,
                             @Cast("bool") boolean lock_held);
  public native @ByVal Status replace_ref_input(@StringPiece String name, @Const @ByRef Tensor tensor,
                             @Cast("bool") boolean lock_held);

  // Deletes the Tensor object used as the Ref Input at
  // input_index. This is not usually necessary and should be used
  // with caution. If !lock_held the input mutex will be acquired
  // before returning the Tensor.
  // REQUIRES: IsRefType(input_dtype(input_index)).
  public native void delete_ref_input(int input_index, @Cast("bool") boolean lock_held);

  // Return true if there is input at the given index. An operator has no
  // input at index if its tensor is null. This is primarily used by the
  // merge operator.
  // TODO(mrry): Convert this to return Status.
  public native @Cast("bool") boolean has_input(int index);

  // Returns true if all inputs are the same shape, otherwise sets the
  // status to a non-OK value and returns false.
  // Usage: if (!context->ValidateInputsAreSameShape(this)) return;
  public native @Cast("bool") boolean ValidateInputsAreSameShape(OpKernel op);

  // If non-null, kernels should populate with any partition subgraphs created.
  public native GraphCollector graph_collector();

  // Input to output forwarding.

  // Set the output Ref Tensor at output_index to be an alias of the
  // input Ref Tensor at input_index.
  // REQUIRES: IsRefType(input_dtype(input_index)).
  // REQUIRES: IsRefType(output_dtype(output_index)).
  public native void forward_ref_input_to_ref_output(int input_index, int output_index);

  // Returns true when an alias to input[input_index], reshaped to output_shape,
  // which is safe to use for in-place computation was written to *output.
  // Returns false if input[input_index] has a refcount greater than one, or if
  // its type does not match the expected output type of output[output_index],
  // or the number of elements in input[input_index] does not equal the number
  // of elements in output_shape.
  public native @Cast("bool") boolean forward_input_to_output_with_shape(int input_index, int output_index,
                                            @Const @ByRef TensorShape output_shape,
                                            @Cast("tensorflow::Tensor**") PointerPointer output);
  public native @Cast("bool") boolean forward_input_to_output_with_shape(int input_index, int output_index,
                                            @Const @ByRef TensorShape output_shape,
                                            @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_to_output_with_shape(@StringPiece BytePointer input_name,
                                              @StringPiece BytePointer output_name,
                                              @Const @ByRef TensorShape output_shape,
                                              @Cast("tensorflow::Tensor**") PointerPointer output);
  public native @ByVal Status forward_input_to_output_with_shape(@StringPiece BytePointer input_name,
                                              @StringPiece BytePointer output_name,
                                              @Const @ByRef TensorShape output_shape,
                                              @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_to_output_with_shape(@StringPiece String input_name,
                                              @StringPiece String output_name,
                                              @Const @ByRef TensorShape output_shape,
                                              @ByPtrPtr Tensor output);

  // Returns a pointer to a Tensor aliasing the underlying buffer backing
  // input[input_index] iff
  //   * input[input_index] is not a ref,
  //   * the data type, shape, memory type, and allocator attributes of
  //     input[input_index] are compatible with those given in dtype, shape,
  //     memory_type, and attr,
  //   * refcount on the underlying buffer is one.
  //   * Either there is no forwarding reservation for either input_index
  //     or output_index or the specified input is reserved for the specified
  //     output. More precisely:
  //
  //     These cases mean neither input nor output has a reservation:
  //        forward_from_array = nullptr
  //     OR (input_index is not in forward_from_array AND
  //         (output_index == kNoReservation OR
  //          forward_from_array[output_index] == kNoReservation))
  //
  //     This case means that input_index is reserved for output_index:
  //        forward_from_array[output_index] == input_index
  //
  //     This case means the output is reserved to always be allocated,
  //     never assigned a forwarded input:
  //        forward_from_array[output_index] == kNeverForward
  //
  // Otherwise returns nullptr.
  // NOTE: For Cuda kernels that read inputs using the __ldg() intrinsic,
  // forwarding is only safe if there are no reads via __ldg() after writes
  // to the same address.
  public native @UniquePtr Tensor forward_input(
        int input_index, int output_index, @Cast("tensorflow::DataType") int output_dtype,
        @Const @ByRef TensorShape output_shape, @Cast("tensorflow::MemoryType") int output_memory_type,
        @Const @ByRef AllocatorAttributes output_attr);

  // Tries to forward one of the inputs given in input_indices to
  // output[output_index]. If none of the given inputs can be forwarded, calls
  // allocate_output() to allocate a new output buffer.
  public native @ByVal Status forward_input_or_allocate_output(
        @ArraySlice IntPointer candidate_input_indices, int output_index,
        @Const @ByRef TensorShape output_shape, @Cast("tensorflow::Tensor**") PointerPointer output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ArraySlice IntPointer candidate_input_indices, int output_index,
        @Const @ByRef TensorShape output_shape, @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ArraySlice IntBuffer candidate_input_indices, int output_index,
        @Const @ByRef TensorShape output_shape, @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ArraySlice int[] candidate_input_indices, int output_index,
        @Const @ByRef TensorShape output_shape, @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::StringPiece>*") StringPieceVector candidate_input_names,
        @StringPiece BytePointer output_name, @Const @ByRef TensorShape output_shape,
        @Cast("tensorflow::Tensor**") PointerPointer output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::StringPiece>*") StringPieceVector candidate_input_names,
        @StringPiece BytePointer output_name, @Const @ByRef TensorShape output_shape,
        @ByPtrPtr Tensor output);
  public native @ByVal Status forward_input_or_allocate_output(
        @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::StringPiece>*") StringPieceVector candidate_input_names,
        @StringPiece String output_name, @Const @ByRef TensorShape output_shape,
        @ByPtrPtr Tensor output);

  // Tries to reuse one of the inputs given in input_indices as a temporary.
  // If none of the given inputs can be forwarded, calls
  // allocate_temp() to allocate a new temporary buffer.
  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice IntPointer candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, @Const @ByRef AllocatorAttributes allocator_attr,
        Tensor out_temp);
  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice IntBuffer candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, @Const @ByRef AllocatorAttributes allocator_attr,
        Tensor out_temp);
  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice int[] candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, @Const @ByRef AllocatorAttributes allocator_attr,
        Tensor out_temp);

  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice IntPointer candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, Tensor out_temp);
  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice IntBuffer candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, Tensor out_temp);
  public native @ByVal Status forward_input_or_allocate_temp(
        @ArraySlice int[] candidate_input_indices, @Cast("tensorflow::DataType") int type,
        @Const @ByRef TensorShape shape, Tensor out_temp);

  // Output

  // Returns the named list-valued output in "list", as defined in the OpDef.
  // If the named output is not list-valued, returns a one-element list.
  public native @ByVal Status output_list(@StringPiece BytePointer name, OpOutputList list);
  public native @ByVal Status output_list(@StringPiece String name, OpOutputList list);

  // If output_required(index) returns true, the OpKernel's Compute() method
  // should call allocate_output(index, ...), set_output(index, ...),
  // set_output_ref(index, ...), or set the status to a non-ok value.
  // If it returns false, it may output, but is not required to do so.
  // TODO(mrry): Convert this to return Status, and implement a string
  // name version.
  public native @Cast("bool") boolean output_required(int index);

  // Allocation of tensors during kernel execution inside the Compute
  // method:
  //
  // There are three methods to allocate Tensors when an Op kernel
  // executes.
  //
  // 1) allocate_persistent. This is only needed for Tensors that will
  // be stored by the Op between invocations, and it *must* be used
  // for those Tensors. The call returns a PersistentTensor, and that
  // is the only object the Op is allowed to hold on to between
  // invocations. When the Tensor is needed in a subsequent
  // invocation, it can be retrieved from the PersistentTensor using
  // the AccessTensor method. This ensures that the system is made
  // aware of any use of the tensor's allocated memory, which is
  // needed for correctness on asynchronous devices such as GPUs.
  //
  // 2) allocate_output. This should be used to allocate any tensor
  // that is going to be used as an output from the Op at the end of
  // the current execution. The caller indicates which output the
  // Tensor will be assigned to, and the call returns the
  // newly-allocated Tensor. The Tensor can subsequently be assigned
  // to during kernel execution, and will be used as the designated
  // output when the kernel execution completes.
  //
  // 3) allocate_temp. This should be used to allocate any scratch
  // storage that is needed while the kernel is executing, and will
  // not be retained by the Op.
  //
  // In some cases a Tensor needs to be used as an output even though
  // it was previously allocated elsewhere. The Tensor may have been
  // passed as an input, or stored in a PersistentTensor during a
  // previous kernel execution, or allocated earlier in the kernel
  // execution at a time when it was not known which output it would
  // be assigned to. In this case the kernel can use set_output or
  // set_output_ref to indicate that the tensor should be used as the
  // designated output. It is legal to use any previously-allocated
  // Tensor as an argument to set_output or set_output_ref, including
  // Tensors allocated via allocate_temp. There may be a performance
  // penalty to using a Tensor that was not allocated using
  // allocate_output. This is because allocate_output uses the
  // AllocatorAttributes stored in output_attr_array for the
  // designated output. In some cases, using the wrong attributes may
  // cause an extra copy of the Tensor's buffer.

  // Allocates output for the specified output index with shape.
  // OpKernelContext retains ownership of the returned pointer. See
  // comment above.
  //
  // If memory allocation fails, returns an error status.
  //
  // REQUIRES: !IsRefType(expected_output_dtype(index))
  public native @ByVal Status allocate_output(int index, @Const @ByRef TensorShape shape,
                           @Cast("tensorflow::Tensor**") PointerPointer tensor);
  public native @ByVal Status allocate_output(int index, @Const @ByRef TensorShape shape,
                           @ByPtrPtr Tensor tensor);
  public native @ByVal Status allocate_output(@StringPiece BytePointer name, @Const @ByRef TensorShape shape,
                           @Cast("tensorflow::Tensor**") PointerPointer tensor);
  public native @ByVal Status allocate_output(@StringPiece BytePointer name, @Const @ByRef TensorShape shape,
                           @ByPtrPtr Tensor tensor);
  public native @ByVal Status allocate_output(@StringPiece String name, @Const @ByRef TensorShape shape,
                           @ByPtrPtr Tensor tensor);
  // The following methods use the supplied attributes instead of
  // those in output_attr_array. The caller is responsible for
  // ensuring that the attributes are "compatible" with the
  // output_attr_array, e.g. the tensor is allocated on the correct
  // device. See comment above.
  public native @ByVal Status allocate_output(int index, @Const @ByRef TensorShape shape, @Cast("tensorflow::Tensor**") PointerPointer tensor,
                           @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_output(int index, @Const @ByRef TensorShape shape, @ByPtrPtr Tensor tensor,
                           @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_output(@StringPiece BytePointer name, @Const @ByRef TensorShape shape,
                           @Cast("tensorflow::Tensor**") PointerPointer tensor,
                           @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_output(@StringPiece BytePointer name, @Const @ByRef TensorShape shape,
                           @ByPtrPtr Tensor tensor,
                           @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_output(@StringPiece String name, @Const @ByRef TensorShape shape,
                           @ByPtrPtr Tensor tensor,
                           @ByVal AllocatorAttributes attr);

  // Allocates a temporary Tensor of the specified type and
  // shape. Devices such as GPUs that enqueue Ops for lazy execution
  // may retain references to the temporary tensors after the Op's
  // Compute method has run. See comment above.
  public native @ByVal Status allocate_temp(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                         Tensor out_temp, @ByVal AllocatorAttributes allocator_attr,
                         @Const @ByRef AllocationAttributes allocation_attr);
  public native @ByVal Status allocate_temp(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                         Tensor out_temp, @ByVal AllocatorAttributes allocator_attr);
  public native @ByVal Status allocate_temp(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                         Tensor out_temp);

  // Allocates a Tensor of the specified type and shape which the Op
  // plans to maintain as persistent state. out_persistent holds the
  // PersistentTensor which is the object the caller should store. For
  // convenience, if out_tensor is non-null then it will be filled in
  // with a Tensor* pointing to the newly-allocated tensor which the
  // caller can use instead of calling
  // out_persistent->AccessTensor. The caller does not own out_tensor
  // and should not keep a copy of it. See comment above.
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @Cast("tensorflow::Tensor**") PointerPointer out_tensor, @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @ByPtrPtr Tensor out_tensor, @ByVal AllocatorAttributes attr);
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @Cast("tensorflow::Tensor**") PointerPointer out_tensor);
  public native @ByVal Status allocate_persistent(@Cast("tensorflow::DataType") int type, @Const @ByRef TensorShape shape,
                               PersistentTensor out_persistent,
                               @ByPtrPtr Tensor out_tensor);

  // Copies a tensor (allocated by the caller) to the specified output
  // index.  REQUIRES: !IsRefType(expected_output_dtype(index))
  // REQUIRES: 'tensor' must have the same MemoryType as
  // output_memory_types[index]. See comment above.
  public native @ByVal Status set_output(@StringPiece BytePointer name, @Const @ByRef Tensor tensor);
  public native @ByVal Status set_output(@StringPiece String name, @Const @ByRef Tensor tensor);

  // To output a reference.  Caller retains ownership of mu and tensor_for_ref,
  // and they must outlive all uses within the step. See comment above.
  // REQUIRES: IsRefType(expected_output_dtype(index))
  public native @ByVal Status set_output_ref(@StringPiece BytePointer name, @Cast("tensorflow::mutex*") Pointer mu, Tensor tensor_for_ref);
  public native @ByVal Status set_output_ref(@StringPiece String name, @Cast("tensorflow::mutex*") Pointer mu, Tensor tensor_for_ref);

  // Returns nullptr if allocate_output() or set_output() have not been called.
  public native @ByVal Status mutable_output(@StringPiece BytePointer name, @Cast("tensorflow::Tensor**") PointerPointer tensor);
  public native @ByVal Status mutable_output(@StringPiece BytePointer name, @ByPtrPtr Tensor tensor);
  public native @ByVal Status mutable_output(@StringPiece String name, @ByPtrPtr Tensor tensor);

  // Records device specific state about how the input tensors were
  // computed.
  //
  // If using the templated function, the type must be a subclass
  // of DeviceContext.
  //
  // Get the DeviceContext used for the index input.  Returns nullptr
  // if no DeviceContext was provided.
  public native DeviceContext input_device_context(int index);

  // Return the DeviceContext that should be used for this Op.
  //
  // If using the templated function, the type must be a subclass
  // of DeviceContext.
  //
  // Returns nullptr if the device did not provide one.
  public native DeviceContext op_device_context();

  public native @ByVal AllocatorAttributes input_alloc_attr(int index);

  public native @ByVal AllocatorAttributes output_alloc_attr(int index);

  public native @ByVal WrappedAllocatorVector ConsumeWrappedAllocators();

  // Communication.
  //
  // An op kernel communicates with outside environment through
  // Rendezvous Send() and Recv().
  public native Rendezvous rendezvous();
  public native @ByVal Status create_rendezvous(@Cast("const tensorflow::int64") long step_id, @Const DeviceMgr device_mgr,
                             @Cast("Rendezvous**") PointerPointer r);
  public native @ByVal Status create_rendezvous(@Cast("const tensorflow::int64") long step_id, @Const DeviceMgr device_mgr,
                             @ByPtrPtr Rendezvous r);

  public native CollectiveExecutor collective_executor();

  // An op kernel can access the session state it belongs to.
  public native SessionState session_state();

  // Unique identifier of the session it belongs to. Can be empty.
  public native @StdString BytePointer session_handle();

  // Metadata about the session. Can be nullptr.
  public native @Const SessionMetadata session_metadata();

  // An op kernel can access the tensor store of the run it belongs to.
  public native TensorStore tensor_store();

  // Function call support.
  //
  // If this kernel invocation is within a function execution,
  // call_frame() returns the call frame for the function call.
  public native CallFrameInterface call_frame();

  // If not nullptr, the kernel invoke functions defined in the
  // library. E.g., CHECK_NOTNULL(function_library())->Run("Foo", ...).
  public native FunctionLibraryRuntime function_library();

  public native @Cast("std::function<void(std::function<void()>)>*") Pointer runner();
  public native StepStatsCollectorInterface stats_collector();

  // Shared resources accessible to this kernel.
  public native ResourceMgr resource_manager();

  public native TensorSliceReaderCacheWrapper slice_reader_cache();

  // Execution.
  //
  // OpKernels can use these eigen devices to carry out their
  // numerical computation.
  public native @Const @ByRef ThreadPoolDevice eigen_cpu_device();
  public native @Const @ByRef GpuDevice eigen_gpu_device();
// #ifdef TENSORFLOW_USE_SYCL
// #endif

  // Error handling.

  // If expected_inputs == inputs() and expected_outputs == output_types(),
  // returns OK, else returns INVALID_ARGUMENT with an error message.
  // Recommended for Ops with dynamic signatures, where validation can only
  // be performed at runtime.
  public native @ByVal Status MatchSignature(@ByVal @Cast("const tensorflow::DataTypeSlice*") DataTypeVector expected_inputs,
                          @ByVal @Cast("const tensorflow::DataTypeSlice*") DataTypeVector expected_outputs);

  // An OpKernel should call SetStatus() if Compute() encounters an
  // error.
  public native void SetStatus(@Const @ByRef Status status);
  public native @Const @ByRef Status status();

  // Cancellation.
  //
  // EXPERIMENTAL. See the implementation in tensorflow::FIFOQueue for an
  // example of how to use this API.
  public native CancellationManager cancellation_manager();

  // Other accessors.

  // For control flow.
  public native @ByVal FrameAndIter frame_iter();
  public native @Cast("bool") boolean is_input_dead();

  // May be used, e.g., to get GPU handles, etc.
  // TODO(tucker): Add example usage.
  public native DeviceBase device();

  // Retrieve list of referenced tensors in out_vector. Once this is
  // called, it is not legal to reference any more tensors.  Should
  // not be called from Op kernels.
  public native void retrieve_accessed_tensors(@Cast("tensorflow::TensorReferenceVector*") TensorValueVector out_vector);

  // Per-step container for use by white-listed internal ops.
  public native ScopedStepContainer step_container();

  // Helper routines for the OP_REQUIRES macros
  public native void CtxFailure(@Const @ByRef Status s);
  public native void CtxFailureWithWarning(@Const @ByRef Status s);
  public native void CtxFailure(@Cast("const char*") BytePointer file, int line, @Const @ByRef Status s);
  public native void CtxFailure(String file, int line, @Const @ByRef Status s);
  public native void CtxFailureWithWarning(@Cast("const char*") BytePointer file, int line, @Const @ByRef Status s);
  public native void CtxFailureWithWarning(String file, int line, @Const @ByRef Status s);

  // Unrecommended functions: these are functions that have some
  // current uses but are not recommended for use, and may go away at
  // some future major version release.
  //
  // The following functions all have versions that return Status
  // to capture error conditions, and are strongly preferred.
  public native Tensor mutable_output(int index);
  public native void set_output(int index, @Const @ByRef Tensor tensor);
  public native @Cast("tensorflow::mutex*") Pointer input_ref_mutex(int index);
  public native void set_output_ref(int index, @Cast("tensorflow::mutex*") Pointer mu, Tensor tensor_for_ref);
  public native @ByVal TensorValue release_output(int index);

  public native @Cast("bool") boolean track_allocations();

  // Records temp memory allocation. Tensor object is recorded to identify the
  // case where temp memory is used as output memory.
  public native void record_temp_memory_allocation(@Cast("tensorflow::int64") long size, @Const @ByRef Tensor t);

  // Returns recorded size of temporary memory;
  public native @Cast("tensorflow::int64") long temp_memory_allocated();

  // Records persistent memory allocation, size can be negative indicating
  // deallocation.
  public native void record_persistent_memory_allocation(@Cast("tensorflow::int64") long size, @Cast("tensorflow::int64") long alloc_id/*=-1*/);
  public native void record_persistent_memory_allocation(@Cast("tensorflow::int64") long size);

  // Returns recorded size and ids of persistent memory.
  public native @Cast("tensorflow::int64") long persistent_memory_allocated();

  public native @Cast("tensorflow::int64*") @StdVector LongPointer persistent_alloc_ids();

  // Resets counters for temp and persistent memory and recorded ids.
  public native void clear_recorded_memory();

  public native @Cast("bool") boolean input_is_ref(int index);

  public native void set_record_memory_consumption(@Cast("bool") boolean v);

  // Used by OpKernel implementations to track actively running deferred ops.
  //
  // A deferred op is one whose Compute method returns (or whose ComputeAsync
  // method invokes the callback) when work is scheduled onto a device. At that
  // point, we don't know when the work will actually complete (or if it has
  // already completed) on the device. These functions allow the executor to
  // track the status of deferred ops and act accordingly.
  //
  // Deferred OpKernel implementations must use these methods to get two
  // functions. It then must call these two functions in pairs, before and after
  // device execution, respectively.
  
  

  public native Allocator get_allocator(@ByVal AllocatorAttributes attr);
}
