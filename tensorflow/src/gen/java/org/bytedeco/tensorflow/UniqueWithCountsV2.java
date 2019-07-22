// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Finds unique elements along an axis of a tensor.
 * 
 *  This operation either returns a tensor {@code y} containing unique elements
 *  along the {@code axis} of a tensor. The returned unique elements is sorted
 *  in the same order as they occur along {@code axis} in {@code x}.
 *  This operation also returns a tensor {@code idx} and a tensor {@code count}
 *  that are the same size as the number of the elements in {@code x} along the
 *  {@code axis} dimension. The {@code idx} contains the index in the unique output {@code y}
 *  and the {@code count} contains the count in the unique output {@code y}.
 *  In other words, for an {@code 1-D} tensor {@code x} with {@code axis = None:
 * 
 *  }y[idx[i]] = x[i] for i in [0, 1,...,rank(x) - 1]{@code 
 * 
 *  For example:
 * 
 *  }{@code }
 *  # tensor 'x' is [1, 1, 2, 4, 4, 4, 7, 8, 8]
 *  y, idx, count = unique_with_counts(x)
 *  y ==> [1, 2, 4, 7, 8]
 *  idx ==> [0, 0, 1, 2, 2, 2, 3, 4, 4]
 *  count ==> [2, 1, 3, 1, 2]
 *  <pre>{@code
 * 
 *  For an `2-D` tensor `x` with `axis = 0`:
 * 
 *  }</pre>
 *  # tensor 'x' is [[1, 0, 0],
 *  #                [1, 0, 0],
 *  #                [2, 0, 0]]
 *  y, idx, count = unique_with_counts(x, axis=0)
 *  y ==> [[1, 0, 0],
 *         [2, 0, 0]]
 *  idx ==> [0, 0, 1]
 *  count ==> [2, 1]
 *  <pre>{@code
 * 
 *  For an `2-D` tensor `x` with `axis = 1`:
 * 
 *  }</pre>
 *  # tensor 'x' is [[1, 0, 0],
 *  #                [1, 0, 0],
 *  #                [2, 0, 0]]
 *  y, idx, count = unique_with_counts(x, axis=1)
 *  y ==> [[1, 0],
 *         [1, 0],
 *         [2, 0]]
 *  idx ==> [0, 1, 1]
 *  count ==> [1, 2]
 *  <pre>{@code
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A `Tensor`.
 *  * axis: A `Tensor` of type `int32` (default: None). The axis of the Tensor to
 *  find the unique elements.
 * 
 *  Returns:
 *  * `Output` y: A `Tensor`. Unique elements along the `axis` of `Tensor` x.
 *  * `Output` idx: A 1-D Tensor. Has the same type as x that contains the index of each
 *  value of x in the output y.
 *  * `Output` count: A 1-D Tensor. The count of each value of x in the output y. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UniqueWithCountsV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UniqueWithCountsV2(Pointer p) { super(p); }

  /** Optional attribute setters for UniqueWithCountsV2 */
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
  
    /** Defaults to DT_INT32 */
    public native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_idx_(); public native Attrs out_idx_(int setter);
  }
  public UniqueWithCountsV2(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input axis) { super((Pointer)null); allocate(scope, x, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input axis);
  public UniqueWithCountsV2(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input axis, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, axis, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                     @ByVal Input axis, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native UniqueWithCountsV2 operation(Operation setter);
  public native @ByRef Output y(); public native UniqueWithCountsV2 y(Output setter);
  public native @ByRef Output idx(); public native UniqueWithCountsV2 idx(Output setter);
  public native @ByRef Output count(); public native UniqueWithCountsV2 count(Output setter);
}
