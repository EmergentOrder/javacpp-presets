// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update relevant entries in '*var' and '*accum' according to the adagrad scheme.
 * 
 *  That is for rows we have grad for, we update var and accum as follows:
 *  accum += grad * grad
 *  var -= lr * grad * (1 / sqrt(accum))
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * accum: Should be from a Variable().
 *  * lr: Learning rate. Must be a scalar.
 *  * grad: The gradient.
 *  * indices: A vector of indices into the first dimension of var and accum.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var and accum tensors will be protected
 *  by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceSparseApplyAdagrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceSparseApplyAdagrad(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceSparseApplyAdagrad */
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
  
    /** If {@code True}, updating of the var and accum tensors will be protected
     *  by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    /** Defaults to true */
    public native @ByVal Attrs UpdateSlots(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
    public native @Cast("bool") boolean update_slots_(); public native Attrs update_slots_(boolean setter);
  }
  public ResourceSparseApplyAdagrad(@Const @ByRef Scope scope,
                             @ByVal Input var, @ByVal Input accum,
                             @ByVal Input lr, @ByVal Input grad,
                             @ByVal Input indices) { super((Pointer)null); allocate(scope, var, accum, lr, grad, indices); }
  private native void allocate(@Const @ByRef Scope scope,
                             @ByVal Input var, @ByVal Input accum,
                             @ByVal Input lr, @ByVal Input grad,
                             @ByVal Input indices);
  public ResourceSparseApplyAdagrad(@Const @ByRef Scope scope,
                             @ByVal Input var, @ByVal Input accum,
                             @ByVal Input lr, @ByVal Input grad,
                             @ByVal Input indices, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, accum, lr, grad, indices, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                             @ByVal Input var, @ByVal Input accum,
                             @ByVal Input lr, @ByVal Input grad,
                             @ByVal Input indices, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);
  public static native @ByVal Attrs UpdateSlots(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceSparseApplyAdagrad operation(Operation setter);
}
