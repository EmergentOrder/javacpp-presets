// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #endif
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FLOAT128 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLOAT128() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLOAT128(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLOAT128(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLOAT128 position(long position) {
        return (FLOAT128)super.position(position);
    }

    public native @Cast("__int64") long LowPart(); public native FLOAT128 LowPart(long setter);
    public native @Cast("__int64") long HighPart(); public native FLOAT128 HighPart(long setter);
}
