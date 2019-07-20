// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_memory_related Memory and memory related operations
 *  \{
 <p>
 *  \addtogroup cpp_api_memory Memory
 *  A primitive to describe and store data.
 * 
 *  For more information, refer to \ref c_api_memory in \ref c_api.
 *  \{
 <p>
 *  Memory that describes the data. */
@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class memory extends mkldnn_memory_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public memory(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public memory(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public memory position(long position) {
        return (memory)super.position(position);
    }


    /** Data type specification */
    /** enum class mkldnn::memory::data_type */
    public static final int
        /** Undefined data type, used for empty memory descriptors. */
        undef = mkldnn_data_type_undef,
        /** 16-bit/half-precision floating point. */
        f16 = mkldnn_f16,
        /** non-standard 16-bit (bfloat16 w/ 7 bit mantissa) floating point. */
        bf16 = mkldnn_bf16,
        /** 32-bit/single-precision floating point. */
        f32 = mkldnn_f32,
        /** 32-bit signed integer. */
        s32 = mkldnn_s32,
        /** 8-bit signed integer. */
        s8 = mkldnn_s8,
        /** 8-bit unsigned integer. */
        u8 = mkldnn_u8;

    /** Memory format kind */
    

    /** Memory format tag specification. See \ref mkldnn_format_tag_t for a
     *  detailed description. */
    

    /** A memory descriptor. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public desc position(long position) {
            return (desc)super.position(position);
        }
    
        /** The underlying C API data structure. */
        public native @ByRef mkldnn_memory_desc_t data(); public native desc data(mkldnn_memory_desc_t setter);

        /** Constructs a zero memory descriptor */
        
        ///
        public desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a memory descriptor.
         * 
         *  @param adims Data dimensions
         *  @param adata_type Data precision/type.
         *  @param aformat_tag Data layout format tag. */

        /** Constructs a memory descriptor by strides.
         * 
         *  @param adims Data dimensions
         *  @param adata_type Data precision/type.
         *  @param astrides The strides for dimensions. */
        
        ///
        public desc(@Cast("mkldnn::memory::dim*") @StdVector LongPointer adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector LongPointer astrides) { super((Pointer)null); allocate(adims, adata_type, astrides); }
        private native void allocate(@Cast("mkldnn::memory::dim*") @StdVector LongPointer adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector LongPointer astrides);
        public desc(@Cast("mkldnn::memory::dim*") @StdVector LongBuffer adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector LongBuffer astrides) { super((Pointer)null); allocate(adims, adata_type, astrides); }
        private native void allocate(@Cast("mkldnn::memory::dim*") @StdVector LongBuffer adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector LongBuffer astrides);
        public desc(@Cast("mkldnn::memory::dim*") @StdVector long[] adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector long[] astrides) { super((Pointer)null); allocate(adims, adata_type, astrides); }
        private native void allocate(@Cast("mkldnn::memory::dim*") @StdVector long[] adims, @Cast("mkldnn::memory::data_type") int adata_type, @Cast("mkldnn::memory::dim*") @StdVector long[] astrides);

        /** Constructs a memory descriptor from a C API data structure.
         * 
         *  @param adata A C API #mkldnn_memory_desc_t structure. */
        public desc(@Const @ByRef mkldnn_memory_desc_t adata) { super((Pointer)null); allocate(adata); }
        private native void allocate(@Const @ByRef mkldnn_memory_desc_t adata);

        /** Constructs a sub-memory descriptor. */
        //
        /** @param adims Sizes of a sub-memory
        /** @param offsets Offsets of a sub-memory */
        public native @ByVal desc submemory_desc(@Cast("mkldnn::memory::dim*") @StdVector LongPointer adims, @Cast("mkldnn::memory::dim*") @StdVector LongPointer offsets);
        public native @ByVal desc submemory_desc(@Cast("mkldnn::memory::dim*") @StdVector LongBuffer adims, @Cast("mkldnn::memory::dim*") @StdVector LongBuffer offsets);
        public native @ByVal desc submemory_desc(@Cast("mkldnn::memory::dim*") @StdVector long[] adims, @Cast("mkldnn::memory::dim*") @StdVector long[] offsets);

        /** Returns the number of bytes required to allocate the memory
         *  described including the padding area. */
        public native @Cast("size_t") long get_size();

        /** Returns true if the memory descriptor describes an empty memory */
        public native @Cast("bool") boolean is_zero();

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef desc other);

        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef desc other);
    }

    
    ///
    public memory() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a memory.
     * 
     *  @param md Memory descriptor.
     *  @param aengine Engine.
     *  @param ahandle handle. */
    
    ///
    public memory(@Const @ByRef desc md, @Const @ByRef engine aengine, Pointer ahandle) { super((Pointer)null); allocate(md, aengine, ahandle); }
    private native void allocate(@Const @ByRef desc md, @Const @ByRef engine aengine, Pointer ahandle);

    /** Constructs a memory.
     * 
     *  @param md Memory descriptor.
     *  @param aengine Engine. */
    public memory(@Const @ByRef desc md, @Const @ByRef engine aengine) { super((Pointer)null); allocate(md, aengine); }
    private native void allocate(@Const @ByRef desc md, @Const @ByRef engine aengine);

    /** Returns the descriptor of the memory. */
    public native @ByVal desc get_desc();

    /** Returns the engine of the memory. */
    
    ///
    public native @ByVal engine get_engine();

    /** Returns a handle of the data contained in the memory.
     * 
     *  On the CPU engine, this is a pointer to the allocated memory. */
    public native Pointer get_data_handle();

    
    ///
    ///
    ///
    ///
    public native void set_data_handle(Pointer handle);

    /** Maps the data of the memory.
     * 
     *  Mapping allows to read/write directly from/to the memory contents for
     *  engines that do not support direct memory access.
     * 
     *  Mapping is an exclusive operation - a memory object cannot be used in
     *  other operations until this memory object is unmapped.
     *  \tparam T Type of the pointer to be mapped.
     * 
     *  \note Any primitives working with the memory should be completed before
     *        mapping. Use stream::wait() to synchronize the corresponding
     *        execution stream.
     * 
     *  \note Map/unmap API is provided mainly for debug/testing purposes and
     *        its performance may be suboptimal. */

    /** Unmaps the previously mapped data for the memory.
     * 
     *  Any changes of the mapped data are synchronized back to the memory
     *  after the call is complete. The mapped pointer must be
     *  obtained through a map_data() call.
     * 
     *  \note Map/unmap API is provided mainly for debug/testing purposes and
     *        its performance may be suboptimal. */
    public native void unmap_data(Pointer mapped_ptr);

// #if MKLDNN_GPU_RUNTIME == MKLDNN_RUNTIME_OCL
    /** Returns the OpenCL memory object associated with the memory. */

    /** Sets the OpenCL memory object \p mem_object associated with the memory. */
// #endif

    // Must go away or be private:
    public static native @Cast("mkldnn_data_type_t") int convert_to_c(@Cast("mkldnn::memory::data_type") int adata_type);
}
