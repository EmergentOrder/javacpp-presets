// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** LBR_GRU for backward propagation.
 * 
 *  Implements descriptor, primitive descriptor, and primitive. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class lbr_gru_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lbr_gru_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lbr_gru_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lbr_gru_backward position(long position) {
        return (lbr_gru_backward)super.position(position);
    }


    /** LBR_GRU descriptor for backward propagation. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        public native @ByRef mkldnn_rnn_desc_t data(); public native desc data(mkldnn_rnn_desc_t setter);

        /** Initializes an LBR_GRU descriptor for backward propagation using \p
         *  prop_kind, \p direction, and memory descriptors.
         * 
         *  \p flags is a parameter to the LBR GRU descriptor and is currently
         *  ignored.
         * 
         *  \note All memory descriptors are allowed to be initialized with
         *        #mkldnn::memory::format_tag::any value of \p format_kind.
         * 
         *  \p src_iter_desc (simultaneously with \p diff_src_iter_desc), \p
         *  bias_desc (simultaneously with \p diff_bias_desc), and \p
         *  dst_iter_desc (simultaneously with \p diff_src_iter_desc) are
         *  allowed point to a zero memory descriptor, which would indicate
         *  that the LBR GRU primitive should not use them and consider them to be
         *  zero values. */
        public desc(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        rnn_flags flags/*=mkldnn::rnn_flags::undef*/) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, flags); }
        private native void allocate(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        rnn_flags flags/*=mkldnn::rnn_flags::undef*/);
        public desc(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc); }
        private native void allocate(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        @Cast("mkldnn::rnn_flags") int flags/*=mkldnn::rnn_flags::undef*/) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, flags); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        @Cast("mkldnn::rnn_flags") int flags/*=mkldnn::rnn_flags::undef*/);
        public desc(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc); }
        private native void allocate(@Cast("mkldnn::prop_kind") int aprop_kind, @Cast("mkldnn::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc);

    }

    /** Primitive descriptor for LBR_GRU backward propagation. */
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
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr, @Const @ByRef engine e,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd);

        /** Queries source layer memory descriptor. */
        
        ///
        public native @ByVal memory.desc src_layer_desc();

        /** Queries source iteration memory descriptor.
         * 
         *  Returns a zero_md if no src_iter was specified at op_desc
         *  creation time. */
        public native @ByVal memory.desc src_iter_desc();

        /** Queries weights layer memory descriptor. */
        public native @ByVal memory.desc weights_layer_desc();

        /** Queries weights iteration memory descriptor. */
        
        ///
        public native @ByVal memory.desc weights_iter_desc();

        /** Queries bias memory descriptor.
         * 
         *  Returns a zero_md if no bias was specified at op_desc
         *  creation time. */
        public native @ByVal memory.desc bias_desc();

        /** Queries destination layer memory descriptor. */
        
        ///
        public native @ByVal memory.desc dst_layer_desc();

        /** Queries destination iteration memory descriptor.
         * 
         *  Returns a zero_md if no dst_iter was specified at op_desc
         *  creation time. */
        
        ///
        public native @ByVal memory.desc dst_iter_desc();

        /** Queries workspace memory descriptor.
         * 
         *  Returns a zero_md if no worspace is required. */
        public native @ByVal memory.desc workspace_desc();


        /** Queries diff source layer memory descriptor. */
        
        ///
        public native @ByVal memory.desc diff_src_layer_desc();

        /** Queries diff source iteration memory descriptor.
         * 
         *  Returns a zero_md if no diff_src_iter was specified at op_desc
         *  creation time. */
        public native @ByVal memory.desc diff_src_iter_desc();

        /** Queries diff weights layer memory descriptor. */
        public native @ByVal memory.desc diff_weights_layer_desc();

        /** Queries diff weights iteration memory descriptor. */
        public native @ByVal memory.desc diff_weights_iter_desc();

        /** Queries diff bias memory descriptor. */
        public native @ByVal memory.desc diff_bias_desc();

        /** Queries diff destination layer memory descriptor. */
        
        ///
        public native @ByVal memory.desc diff_dst_layer_desc();

        /** Queries diff destination iteration memory descriptor.
         * 
         *  Returns a zero_md if no diff_dst_iter was specified at op_desc
         *  creation time. */
        public native @ByVal memory.desc diff_dst_iter_desc();
    }

    public lbr_gru_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    public lbr_gru_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
