// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Pads a tensor with zeros.
 * 
 *  This operation pads a {@code input} with zeros according to the {@code paddings} you
 *  specify. {@code paddings} is an integer tensor with shape {@code [Dn, 2]}, where n is the
 *  rank of {@code input}. For each dimension D of {@code input}, {@code paddings[D, 0]} indicates
 *  how many zeros to add before the contents of {@code input} in that dimension, and
 *  {@code paddings[D, 1]} indicates how many zeros to add after the contents of {@code input}
 *  in that dimension.
 * 
 *  The padded size of each dimension D of the output is:
 * 
 *  {@code paddings(D, 0) + input.dim_size(D) + paddings(D, 1)}
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 't' is [[1, 1], [2, 2]]
 *  # 'paddings' is [[1, 1], [2, 2]]
 *  # rank of 't' is 2
 *  pad(t, paddings) ==> [[0, 0, 0, 0, 0, 0]
 *                        [0, 0, 1, 1, 0, 0]
 *                        [0, 0, 2, 2, 0, 0]
 *                        [0, 0, 0, 0, 0, 0]]
 *  }</pre>
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Pad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Pad(Pointer p) { super(p); }

  public Pad(@Const @ByRef Scope scope, @ByVal Input input,
      @ByVal Input paddings) { super((Pointer)null); allocate(scope, input, paddings); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
      @ByVal Input paddings);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Pad operation(Operation setter);
  public native @ByRef Output output(); public native Pad output(Output setter);
}
