// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_convolution Convolution
 *  Computes a forward propagation, backward propagation, or weight update
 *  for convolution operation with bias on a batch of multi-dimensional tensors.
 * 
 *  @see \ref dev_guide_convolution in developer guide
 *  @see \ref c_api_convolution in \ref c_api
 *  \{
 <p>
 *  Convolution forward propagation.
 * 
 *  Implements descriptor, primitive descriptor, and primitive
 *  for the convolution forward propagation. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class convolution_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public convolution_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public convolution_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public convolution_forward position(long position) {
        return (convolution_forward)super.position(position);
    }


    /** Descriptor for convolution forward propagation. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef mkldnn_convolution_desc_t data(); public native desc data(mkldnn_convolution_desc_t setter);

        /** Initializes a descriptor for convolution forward propagation without
         *  bias using \p aprop_kind (possible values are
         *  #mkldnn::forward_training and #mkldnn::forward_inference),
         *  \p aalgorithm, memory descriptors, \p strides, \p padding_l, and
         *  \p padding_r.
         * 
         *  \note Memory descriptors are allowed to be initialized with
         *        #mkldnn::memory::format_tag::any value of \p format_kind. */
        
        ///
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r);

        /** Initializes a descriptor for convolution forward propagation with
         *  bias using \p prop_kind (possible values are
         *  #mkldnn::forward_training and #mkldnn::forward_inference), \p
         *  aalgorithm, memory descriptors, \p strides, \p padding_l, and \p
         *  padding_r.
         * 
         *  \note Memory descriptors are allowed to be initialized with
         *        #mkldnn::memory::format_tag::any value of \p format_kind. */
        
        ///
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r);

        /** Initializes a descriptor for dilated convolution forward propagation
         *  without bias using \p prop_kind (possible values are
         *  #mkldnn::forward_training and #mkldnn::forward_inference),
         *  \p aalgorithm, memory descriptors, \p strides, \p dilates,
         *  \p padding_l, and \p padding_r.
         * 
         *  \note Memory descriptors are allowed to be initialized with
         *        #mkldnn::memory::format_tag::any value of \p format_kind. */
        
        ///
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, bias_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r);

        /** Initializes a descriptor for dilated convolution forward propagation
         *  with bias using \p prop_kind (possible values are
         *  #mkldnn::forward_training and #mkldnn::forward_inference),
         *  \p aalgorithm, memory descriptors, \p strides, \p dilates,
         *  \p padding_l, and \p padding_r.
         * 
         *  \note Memory descriptors are allowed to be initialized with
         *        #mkldnn::memory::format_tag::any value of \p format_kind. */
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongPointer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer strides,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector LongBuffer padding_r);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r) { super((Pointer)null); allocate(aprop_kind, aalgorithm, src_desc, weights_desc, dst_desc, strides, dilates, padding_l, padding_r); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::algorithm") int aalgorithm,
                        @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] strides,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] dilates,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_l,
                        @Cast("mkldnn::memory::dim*") @StdVector long[] padding_r);
    }

    /** Primitive descriptor for convolution forward propagation. */
    public static class primitive_desc extends org.bytedeco.mkldnn.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Initializes a primitive descriptor for convolution forward
         *  propagation. */
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

        /** Initializes a primitive descriptor for convolution forward
         *  propagation with attributes defined by \p attr. */
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, attr, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e);

        /** Queries source memory descriptor. */
        public native @ByVal memory.desc src_desc();

        /** Queries weights memory descriptor. */
        
        ///
        public native @ByVal memory.desc weights_desc();

        /** Queries bias memory descriptor.
         * 
         *  Returns a zero_md if no bias was specified at op_desc
         *  creation time. */
        public native @ByVal memory.desc bias_desc();

        /** Queries destination memory descriptor. */
        public native @ByVal memory.desc dst_desc();
    }

    public convolution_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Creates a convolution forward propagation primitive from the
     *  corresponding primitive descriptor. */
    public convolution_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
