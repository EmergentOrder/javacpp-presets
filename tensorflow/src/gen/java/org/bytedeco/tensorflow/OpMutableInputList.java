// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Utility class for representing a list of mutable ("ref") input tensors
// that are passed to the op as a single named argument.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpMutableInputList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpMutableInputList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpMutableInputList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpMutableInputList position(long position) {
        return (OpMutableInputList)super.position(position);
    }

  public OpMutableInputList(OpKernelContext ctx, int start, int stop) { super((Pointer)null); allocate(ctx, start, stop); }
  private native void allocate(OpKernelContext ctx, int start, int stop);
  public OpMutableInputList() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByRef @Name("operator =") OpMutableInputList put(@Const @ByRef OpMutableInputList other);
  public native @ByVal Tensor at(int i, @Cast("bool") boolean lock_held);
  public native @Cast("tensorflow::mutex*") Pointer ref_mutex(int i);
  public native int size();
}
