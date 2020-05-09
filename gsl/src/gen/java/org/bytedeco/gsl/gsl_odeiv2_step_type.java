// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Stepper object
 *
 * Opaque object for stepping an ODE system from t to t+h.
 * In general the object has some state which facilitates
 * iterating the stepping operation.
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_odeiv2_step_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_odeiv2_step_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_odeiv2_step_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_odeiv2_step_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_odeiv2_step_type position(long position) {
        return (gsl_odeiv2_step_type)super.position(position);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_odeiv2_step_type name(BytePointer setter);
  public native int can_use_dydt_in(); public native gsl_odeiv2_step_type can_use_dydt_in(int setter);
  public native int gives_exact_dydt_out(); public native gsl_odeiv2_step_type gives_exact_dydt_out(int setter);
  public static class Alloc_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_long(Pointer p) { super(p); }
      protected Alloc_long() { allocate(); }
      private native void allocate();
      public native Pointer call(@Cast("size_t") long dim);
  }
  public native Alloc_long alloc(); public native gsl_odeiv2_step_type alloc(Alloc_long setter);
  public static class Apply_Pointer_long_double_double_DoublePointer_DoublePointer_DoublePointer_DoublePointer_gsl_odeiv2_system extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Apply_Pointer_long_double_double_DoublePointer_DoublePointer_DoublePointer_DoublePointer_gsl_odeiv2_system(Pointer p) { super(p); }
      protected Apply_Pointer_long_double_double_DoublePointer_DoublePointer_DoublePointer_DoublePointer_gsl_odeiv2_system() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("size_t") long dim, double t, double h, DoublePointer y,
                  DoublePointer yerr, @Const DoublePointer dydt_in, DoublePointer dydt_out,
                  @Const gsl_odeiv2_system dydt);
  }
  public native Apply_Pointer_long_double_double_DoublePointer_DoublePointer_DoublePointer_DoublePointer_gsl_odeiv2_system apply(); public native gsl_odeiv2_step_type apply(Apply_Pointer_long_double_double_DoublePointer_DoublePointer_DoublePointer_DoublePointer_gsl_odeiv2_system setter);
  public static class Set_driver_Pointer_gsl_odeiv2_driver extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Set_driver_Pointer_gsl_odeiv2_driver(Pointer p) { super(p); }
      protected Set_driver_Pointer_gsl_odeiv2_driver() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Const gsl_odeiv2_driver d);
  }
  public native Set_driver_Pointer_gsl_odeiv2_driver set_driver(); public native gsl_odeiv2_step_type set_driver(Set_driver_Pointer_gsl_odeiv2_driver setter);
  public static class Reset_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Reset_Pointer_long(Pointer p) { super(p); }
      protected Reset_Pointer_long() { allocate(); }
      private native void allocate();
      public native int call(Pointer state, @Cast("size_t") long dim);
  }
  public native Reset_Pointer_long reset(); public native gsl_odeiv2_step_type reset(Reset_Pointer_long setter);
  public static class Order_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Order_Pointer(Pointer p) { super(p); }
      protected Order_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("unsigned int") int call(Pointer state);
  }
  public native Order_Pointer order(); public native gsl_odeiv2_step_type order(Order_Pointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer state);
  }
  public native @Name("free") Free_Pointer _free(); public native gsl_odeiv2_step_type _free(Free_Pointer setter);
}
