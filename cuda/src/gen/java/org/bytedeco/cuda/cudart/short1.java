// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class short1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public short1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public short1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public short1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public short1 position(long position) {
        return (short1)super.position(position);
    }

    public native short x(); public native short1 x(short setter);
}
