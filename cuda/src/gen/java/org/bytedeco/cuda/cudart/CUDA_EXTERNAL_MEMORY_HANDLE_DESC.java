// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

/**
 * External memory handle descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EXTERNAL_MEMORY_HANDLE_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EXTERNAL_MEMORY_HANDLE_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EXTERNAL_MEMORY_HANDLE_DESC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EXTERNAL_MEMORY_HANDLE_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EXTERNAL_MEMORY_HANDLE_DESC position(long position) {
        return (CUDA_EXTERNAL_MEMORY_HANDLE_DESC)super.position(position);
    }

    /**
     * Type of the handle
     */
    public native @Cast("CUexternalMemoryHandleType") int type(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC type(int setter);
        /**
         * File descriptor referencing the memory object. Valid
         * when type is
         * ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD
         */
        @Name("handle.fd") public native int handle_fd(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC handle_fd(int setter);
        /**
         * Win32 handle referencing the semaphore object. Valid when
         * type is one of the following:
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE
         * - ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT
         * Exactly one of 'handle' and 'name' must be non-NULL. If
         * type is one of the following:
         * ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT
         * ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT
         * then 'name' must be NULL.
         */
            /**
             * Valid NT handle. Must be NULL if 'name' is non-NULL
             */
            @Name("handle.win32.handle") public native Pointer handle_win32_handle(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC handle_win32_handle(Pointer setter);
            /**
             * Name of a valid memory object.
             * Must be NULL if 'handle' is non-NULL.
             */
            @Name("handle.win32.name") public native @Const Pointer handle_win32_name(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC handle_win32_name(Pointer setter);
        /**
         * A handle representing an NvSciBuf Object. Valid when type
         * is ::CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF
         */
        @Name("handle.nvSciBufObject") public native @Const Pointer handle_nvSciBufObject(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC handle_nvSciBufObject(Pointer setter);
    /**
     * Size of the memory allocation
     */
    public native @Cast("unsigned long long") long size(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC size(long setter);
    /**
     * Flags must either be zero or ::CUDA_EXTERNAL_MEMORY_DEDICATED
     */
    public native @Cast("unsigned int") int flags(); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC flags(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_EXTERNAL_MEMORY_HANDLE_DESC reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
