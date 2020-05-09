<<<<<<< HEAD
// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE
=======
// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE
>>>>>>> ff79e7e2920bed9eb75162ec98fba73b27135c3a

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Registry containing all passes available in ONNX.
@Namespace("onnx::optimization") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class GlobalPassRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GlobalPassRegistry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GlobalPassRegistry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GlobalPassRegistry position(long position) {
        return (GlobalPassRegistry)super.position(position);
    }

  public native @ByRef StringPassMap passes(); public native GlobalPassRegistry passes(StringPassMap setter);

  public GlobalPassRegistry() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @SharedPtr @ByVal Pass find(@StdString BytePointer pass_name);
  public native @SharedPtr @ByVal Pass find(@StdString String pass_name);
  public native @Const @ByVal StringVector GetAvailablePasses();
}
