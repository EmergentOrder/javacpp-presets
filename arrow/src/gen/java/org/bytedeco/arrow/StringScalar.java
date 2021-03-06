// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StringScalar extends BinaryScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringScalar position(long position) {
        return (StringScalar)super.position(position);
    }

  public StringScalar(@Const @SharedPtr @ByRef ArrowBuffer value, @Cast("bool") boolean is_valid/*=true*/) { super((Pointer)null); allocate(value, is_valid); }
  private native void allocate(@Const @SharedPtr @ByRef ArrowBuffer value, @Cast("bool") boolean is_valid/*=true*/);
  public StringScalar(@Const @SharedPtr @ByRef ArrowBuffer value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Const @SharedPtr @ByRef ArrowBuffer value);

  public StringScalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}
