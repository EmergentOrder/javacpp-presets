// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the mean along sparse segments of a tensor.
 * 
 *  Like {@code SparseSegmentMean}, but allows missing ids in {@code segment_ids}. If an id is
 *  misisng, the {@code output} tensor at that position will be zeroed.
 * 
 *  Read
 *  [the section on segmentation](https://tensorflow.org/api_docs/python/tf/math#Segmentation)
 *  for an explanation of segments.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: A 1-D tensor. Has same rank as {@code segment_ids}.
 *  * segment_ids: A 1-D tensor. Values should be sorted and can be repeated.
 *  * num_segments: Should equal the number of distinct segment IDs.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for dimension 0 which has size
 *  {@code num_segments}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSegmentMeanWithNumSegments extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSegmentMeanWithNumSegments(Pointer p) { super(p); }

  public SparseSegmentMeanWithNumSegments(@Const @ByRef Scope scope,
                                   @ByVal Input data, @ByVal Input indices, @ByVal Input segment_ids,
                                   @ByVal Input num_segments) { super((Pointer)null); allocate(scope, data, indices, segment_ids, num_segments); }
  private native void allocate(@Const @ByRef Scope scope,
                                   @ByVal Input data, @ByVal Input indices, @ByVal Input segment_ids,
                                   @ByVal Input num_segments);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSegmentMeanWithNumSegments operation(Operation setter);
  public native @ByRef Output output(); public native SparseSegmentMeanWithNumSegments output(Output setter);
}
