// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Variable Length Datatype struct in memory */
/* (This is only used for VL sequences, not VL strings, which are stored in char *'s) */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class hvl_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public hvl_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public hvl_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hvl_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public hvl_t position(long position) {
        return (hvl_t)super.position(position);
    }

    public native @Cast("size_t") long len(); public native hvl_t len(long setter); /* Length of VL data (in base type units) */
    public native Pointer p(); public native hvl_t p(Pointer setter);    /* Pointer to VL data */
}
