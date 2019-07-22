// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the number of incomplete elements in the given barrier.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a barrier.
 * 
 *  Returns:
 *  * {@code Output}: The number of incomplete elements (i.e. those with some of their value
 *  components not set) in the barrier. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BarrierIncompleteSize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BarrierIncompleteSize(Pointer p) { super(p); }

  public BarrierIncompleteSize(@Const @ByRef Scope scope, @ByVal Input handle) { super((Pointer)null); allocate(scope, handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native BarrierIncompleteSize operation(Operation setter);
  public native @ByRef Output size(); public native BarrierIncompleteSize size(Output setter);
}
