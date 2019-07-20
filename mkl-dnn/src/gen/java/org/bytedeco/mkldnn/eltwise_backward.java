// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** Element-wise operations for backward propagation.  Implements descriptor,
 *  primitive descriptor, and primitive. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class eltwise_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public eltwise_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public eltwise_backward position(long position) {
        return (eltwise_backward)super.position(position);
    }


    /** Initializes an eltwise descriptor for backward propagation using \p
     *  aalgorithm algorithm memory descriptors \p diff_data_desc and \p
     *  data_desc, and the \p alpha and \p beta parameters. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef mkldnn_eltwise_desc_t data(); public native desc data(mkldnn_eltwise_desc_t setter);

        public desc(@Cast("mkldnn::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/, float beta/*=0*/) { super((Pointer)null); allocate(aalgorithm, diff_data_desc, data_desc, alpha, beta); }
        private native void allocate(@Cast("mkldnn::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/, float beta/*=0*/);
    }

    /** Primitive descriptor for eltwise backward propagation. */
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

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Queries source memory descriptor. */
        public native @ByVal memory.desc src_desc();

        /** Queries diff source memory descriptor. */
        public native @ByVal memory.desc diff_src_desc();

        /** Queries diff destination memory descriptor. */
        public native @ByVal memory.desc diff_dst_desc();
    }

    public eltwise_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    public eltwise_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
