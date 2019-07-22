// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Splits a tensor into {@code num_split} tensors along one dimension.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * axis: 0-D.  The dimension along which to split.  Must be in the range
 *  {@code [-rank(value), rank(value))}.
 *  * value: The tensor to split.
 *  * num_split: The number of ways to split.  Must evenly divide
 *  {@code value.shape[split_dim]}.
 * 
 *  Returns:
 *  * {@code OutputList}: They are identically shaped tensors, whose shape matches that of {@code value}
 *  except along {@code axis}, where their sizes are
 *  {@code values.shape[split_dim] / num_split}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Split extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Split(Pointer p) { super(p); }

  public Split(@Const @ByRef Scope scope, @ByVal Input axis,
        @ByVal Input value, @Cast("tensorflow::int64") long num_split) { super((Pointer)null); allocate(scope, axis, value, num_split); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input axis,
        @ByVal Input value, @Cast("tensorflow::int64") long num_split);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public native @ByRef Operation operation(); public native Split operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output(); public native Split output(OutputVector setter);
}
