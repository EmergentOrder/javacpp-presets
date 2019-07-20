// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_inner_product Inner Product
 *  A primitive to compute an inner product.
 * 
 *  @see \ref dev_guide_inner_product in developer guide
 *  @see \ref c_api_inner_product in \ref c_api
 *  \{
 <p>
 *  Inner product for forward propagation.  Implements descriptor, primitive
 *  descriptor, and primitive. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class inner_product_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_forward position(long position) {
        return (inner_product_forward)super.position(position);
    }


    /** Initializes an inner product descriptor for forward propagation using
     *  \p prop_kind (possible values are #mkldnn::prop_kind::forward_training
     *  and #mkldnn::prop_kind::forward_inference) and memory descriptors. In
     *  order to create an inner product without bias, \p bias_desc should
     *  refer to a descriptor with memory format kind set to
     *  #mkldnn::memory::format_tag::undef.
     * 
     *  \note Memory descriptors are allowed to be initialized with
     *        #mkldnn::memory::format_tag::any value of \p format_kind. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_inner_product_desc_t data(); public native desc data(mkldnn_inner_product_desc_t setter);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, src_desc, weights_desc, bias_desc, dst_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_desc);

        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc) { super((Pointer)null); allocate(aprop_kind, src_desc, weights_desc, dst_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc dst_desc);
    }

    /** Primitive descriptor for inner product forward propagation. */
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

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e) { super((Pointer)null); allocate(desc, e); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e);

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

    public inner_product_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    public inner_product_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
