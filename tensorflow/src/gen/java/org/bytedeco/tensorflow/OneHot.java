// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a one-hot tensor.
 * 
 *  The locations represented by indices in {@code indices} take value {@code on_value},
 *  while all other locations take value {@code off_value}.
 * 
 *  If the input {@code indices} is rank {@code N}, the output will have rank {@code N+1},
 *  The new axis is created at dimension {@code axis} (default: the new axis is
 *  appended at the end).
 * 
 *  If {@code indices} is a scalar the output shape will be a vector of length {@code depth}.
 * 
 *  If {@code indices} is a vector of length {@code features}, the output shape will be:
 *  <pre>{@code
 *    features x depth if axis == -1
 *    depth x features if axis == 0
 *  }</pre>
 * 
 *  If {@code indices} is a matrix (batch) with shape {@code [batch, features]},
 *  the output shape will be:
 *  <pre>{@code
 *    batch x features x depth if axis == -1
 *    batch x depth x features if axis == 1
 *    depth x batch x features if axis == 0
 *  }</pre>
 * 
 * 
 *  Examples
 *  =========
 * 
 *  Suppose that
 *  <pre>{@code
 *    indices = [0, 2, -1, 1]
 *    depth = 3
 *    on_value = 5.0
 *    off_value = 0.0
 *    axis = -1
 *  }</pre>
 * 
 *  Then output is {@code [4 x 3]}:
 *  <pre>{@code
 *  output =
 *    [5.0 0.0 0.0]  // one_hot(0)
 *    [0.0 0.0 5.0]  // one_hot(2)
 *    [0.0 0.0 0.0]  // one_hot(-1)
 *    [0.0 5.0 0.0]  // one_hot(1)
 *  }</pre>
 * 
 *  Suppose that
 *  <pre>{@code
 *    indices = [0, 2, -1, 1]
 *    depth = 3
 *    on_value = 0.0
 *    off_value = 3.0
 *    axis = 0
 *  }</pre>
 * 
 *  Then output is {@code [3 x 4]}:
 *  <pre>{@code
 *  output =
 *    [0.0 3.0 3.0 3.0]
 *    [3.0 3.0 3.0 0.0]
 *    [3.0 3.0 3.0 3.0]
 *    [3.0 0.0 3.0 3.0]
 *  //  ^                one_hot(0)
 *  //      ^            one_hot(2)
 *  //          ^        one_hot(-1)
 *  //              ^    one_hot(1)
 *  }</pre>
 * 
 *  Suppose that
 *  <pre>{@code
 *    indices = [[0, 2], [1, -1]]
 *    depth = 3
 *    on_value = 1.0
 *    off_value = 0.0
 *    axis = -1
 *  }</pre>
 * 
 *  Then output is {@code [2 x 2 x 3]}:
 *  <pre>{@code
 *  output =
 *    [
 *      [1.0, 0.0, 0.0]  // one_hot(0)
 *      [0.0, 0.0, 1.0]  // one_hot(2)
 *    ][
 *      [0.0, 1.0, 0.0]  // one_hot(1)
 *      [0.0, 0.0, 0.0]  // one_hot(-1)
 *    ]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: A tensor of indices.
 *  * depth: A scalar defining the depth of the one hot dimension.
 *  * on_value: A scalar defining the value to fill in output when {@code indices[j] = i}.
 *  * off_value: A scalar defining the value to fill in output when {@code indices[j] != i}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * axis: The axis to fill (default: -1, a new inner-most axis).
 * 
 *  Returns:
 *  * {@code Output}: The one-hot tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OneHot extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OneHot(Pointer p) { super(p); }

  /** Optional attribute setters for OneHot */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** The axis to fill (default: -1, a new inner-most axis).
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long axis_(); public native Attrs axis_(long setter);
  }
  public OneHot(@Const @ByRef Scope scope, @ByVal Input indices,
         @ByVal Input depth, @ByVal Input on_value,
         @ByVal Input off_value) { super((Pointer)null); allocate(scope, indices, depth, on_value, off_value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input indices,
         @ByVal Input depth, @ByVal Input on_value,
         @ByVal Input off_value);
  public OneHot(@Const @ByRef Scope scope, @ByVal Input indices,
         @ByVal Input depth, @ByVal Input on_value,
         @ByVal Input off_value, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, indices, depth, on_value, off_value, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input indices,
         @ByVal Input depth, @ByVal Input on_value,
         @ByVal Input off_value, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native OneHot operation(Operation setter);
  public native @ByRef Output output(); public native OneHot output(Output setter);
}
