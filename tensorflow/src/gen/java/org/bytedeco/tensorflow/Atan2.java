// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes arctangent of {@code y/x} element-wise, respecting signs of the arguments.
 * 
 *  This is the angle \( \theta \in [-\pi, \pi] \) such that
 *  \[ x = r \cos(\theta) \]
 *  and
 *  \[ y = r \sin(\theta) \]
 *  where \(r = \sqrt(x^2 + y^2) \).
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Atan2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Atan2(Pointer p) { super(p); }

  public Atan2(@Const @ByRef Scope scope, @ByVal Input y,
        @ByVal Input x) { super((Pointer)null); allocate(scope, y, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input y,
        @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Atan2 operation(Operation setter);
  public native @ByRef Output z(); public native Atan2 z(Output setter);
}
