// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the sum along sparse segments of a tensor.
 * 
 *  Read
 *  [the section on segmentation](https://tensorflow.org/api_docs/python/tf/math#Segmentation)
 *  for an explanation of segments.
 * 
 *  Like {@code SegmentSum}, but {@code segment_ids} can have rank less than {@code data}'s first
 *  dimension, selecting a subset of dimension 0, specified by {@code indices}.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *  c = tf.constant([[1,2,3,4], [-1,-2,-3,-4], [5,6,7,8]])
 * 
 *  # Select two rows, one segment.
 *  tf.sparse_segment_sum(c, tf.constant([0, 1]), tf.constant([0, 0]))
 *  # => [[0 0 0 0]]
 * 
 *  # Select two rows, two segment.
 *  tf.sparse_segment_sum(c, tf.constant([0, 1]), tf.constant([0, 1]))
 *  # => [[ 1  2  3  4]
 *  #     [-1 -2 -3 -4]]
 * 
 *  # Select all rows, two segments.
 *  tf.sparse_segment_sum(c, tf.constant([0, 1, 2]), tf.constant([0, 0, 1]))
 *  # => [[0 0 0 0]
 *  #     [5 6 7 8]]
 * 
 *  # Which is equivalent to:
 *  tf.segment_sum(c, tf.constant([0, 0, 1]))
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: A 1-D tensor. Has same rank as {@code segment_ids}.
 *  * segment_ids: A 1-D tensor. Values should be sorted and can be repeated.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for dimension 0 which
 *  has size {@code k}, the number of segments. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSegmentSum extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSegmentSum(Pointer p) { super(p); }

  public SparseSegmentSum(@Const @ByRef Scope scope, @ByVal Input data,
                   @ByVal Input indices, @ByVal Input segment_ids) { super((Pointer)null); allocate(scope, data, indices, segment_ids); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
                   @ByVal Input indices, @ByVal Input segment_ids);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSegmentSum operation(Operation setter);
  public native @ByRef Output output(); public native SparseSegmentSum output(Output setter);
}
