// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::Int32Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseInt32Type extends Scalar {
    static { Loader.load(); }
    /** Default native constructor. */
    public BaseInt32Type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseInt32Type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseInt32Type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BaseInt32Type position(long position) {
        return (BaseInt32Type)super.position(position);
    }

}
