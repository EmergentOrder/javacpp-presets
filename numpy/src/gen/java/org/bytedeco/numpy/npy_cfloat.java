// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;

// #endif
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class npy_cfloat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public npy_cfloat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public npy_cfloat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public npy_cfloat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public npy_cfloat position(long position) {
        return (npy_cfloat)super.position(position);
    }
 public native float real(); public native npy_cfloat real(float setter);
public native float imag(); public native npy_cfloat imag(float setter); }
