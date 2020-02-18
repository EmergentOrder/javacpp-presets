// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UInt16Scalar extends BaseUInt16Type {
    static { Loader.load(); }
    /** Default native constructor. */
    public UInt16Scalar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UInt16Scalar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UInt16Scalar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UInt16Scalar position(long position) {
        return (UInt16Scalar)super.position(position);
    }

}
