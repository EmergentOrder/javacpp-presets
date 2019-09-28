// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::checker") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class CheckerContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CheckerContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CheckerContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CheckerContext position(long position) {
        return (CheckerContext)super.position(position);
    }

  public native int get_ir_version();
  public native void set_ir_version(int v);
  public native @Const @ByRef StringIntMap get_opset_imports();
  public native void set_opset_imports(@ByVal StringIntMap imps);
  public native @Cast("bool") boolean is_main_graph();
  public native void set_is_main_graph(@Cast("bool") boolean is_main_graph);

  public native void set_schema_registry(@Const ISchemaRegistry schema_registry);

  public native @Const ISchemaRegistry get_schema_registry();

  public native void set_model_dir(@StdString BytePointer model_dir);
  public native void set_model_dir(@StdString String model_dir);

  public native @StdString BytePointer get_model_dir();

  public CheckerContext() { super((Pointer)null); allocate(); }
  private native void allocate();
}
