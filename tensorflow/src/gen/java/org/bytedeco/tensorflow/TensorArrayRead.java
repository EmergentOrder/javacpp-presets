// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Read an element from the TensorArray into output {@code value}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 *  * dtype: The type of the elem that is returned.
 * 
 *  Returns:
 *  * {@code Output}: The tensor that is read from the TensorArray. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayRead extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayRead(Pointer p) { super(p); }

  public TensorArrayRead(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input index, @ByVal Input flow_in,
                  @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, handle, index, flow_in, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input index, @ByVal Input flow_in,
                  @Cast("tensorflow::DataType") int dtype);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorArrayRead operation(Operation setter);
  public native @ByRef Output value(); public native TensorArrayRead value(Output setter);
}
