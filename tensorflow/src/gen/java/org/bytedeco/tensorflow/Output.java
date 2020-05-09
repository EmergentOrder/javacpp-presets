// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Represents a tensor value produced by an Operation. */
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Output extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Output(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Output(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Output position(long position) {
        return (Output)super.position(position);
    }

  public Output() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Output(Node n) { super((Pointer)null); allocate(n); }
  private native void allocate(Node n);
  public Output(Node n, int index) { super((Pointer)null); allocate(n, index); }
  private native void allocate(Node n, int index);
  public Output(@Const @ByRef Operation op, int index) { super((Pointer)null); allocate(op, index); }
  private native void allocate(@Const @ByRef Operation op, int index);

  public native @ByVal Operation op();
  public native Node node();
  public native int index();
  public native @Cast("tensorflow::DataType") int type();
  public native @StdString BytePointer name();
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Output other);

  public native @Cast("tensorflow::uint64") long hash();
}
