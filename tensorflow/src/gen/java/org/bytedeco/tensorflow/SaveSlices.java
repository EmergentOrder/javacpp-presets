// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Saves input tensors slices to disk.
 * 
 *  This is like {@code Save} except that tensors can be listed in the saved file as being
 *  a slice of a larger tensor.  {@code shapes_and_slices} specifies the shape of the
 *  larger tensor and the slice that this tensor covers. {@code shapes_and_slices} must
 *  have as many elements as {@code tensor_names}.
 * 
 *  Elements of the {@code shapes_and_slices} input must either be:
 * 
 *  *  The empty string, in which case the corresponding tensor is
 *     saved normally.
 *  *  A string of the form {@code dim0 dim1 ... dimN-1 slice-spec} where the
 *     {@code dimI} are the dimensions of the larger tensor and {@code slice-spec}
 *     specifies what part is covered by the tensor to save.
 * 
 *  {@code slice-spec} itself is a {@code :}-separated list: {@code slice0:slice1:...:sliceN-1}
 *  where each {@code sliceI} is either:
 * 
 *  *  The string {@code -} meaning that the slice covers all indices of this dimension
 *  *  {@code start,length} where {@code start} and {@code length} are integers.  In that
 *     case the slice covers {@code length} indices starting at {@code start}.
 * 
 *  See also {@code Save}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * filename: Must have a single element. The name of the file to which we write the
 *  tensor.
 *  * tensor_names: Shape {@code [N]}. The names of the tensors to be saved.
 *  * shapes_and_slices: Shape {@code [N]}.  The shapes and slice specifications to use when
 *  saving the tensors.
 *  * data: {@code N} tensors to save.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SaveSlices extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SaveSlices(Pointer p) { super(p); }

  public SaveSlices(@Const @ByRef Scope scope, @ByVal Input filename,
             @ByVal Input tensor_names, @ByVal Input shapes_and_slices, @ByVal InputList data) { super((Pointer)null); allocate(scope, filename, tensor_names, shapes_and_slices, data); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input filename,
             @ByVal Input tensor_names, @ByVal Input shapes_and_slices, @ByVal InputList data);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native SaveSlices operation(Operation setter);
}
