// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Get the current size of the TensorArray.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray (output of TensorArray or TensorArrayGrad).
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 * 
 *  Returns:
 *  * {@code Output}: The current size of the TensorArray. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArraySize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArraySize(Pointer p) { super(p); }

  public TensorArraySize(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in) { super((Pointer)null); allocate(scope, handle, flow_in); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input flow_in);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorArraySize operation(Operation setter);
  public native @ByRef Output size(); public native TensorArraySize size(Output setter);
}
