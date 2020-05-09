// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerOperation extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerOperation(Pointer p) { super(p); }

  public EagerOperation(EagerContext ctx, @Cast("const char*") BytePointer op,
                   @Cast("bool") boolean is_function, @Cast("const tensorflow::AttrTypeMap*") StringIntUnorderedMap t) { super((Pointer)null); allocate(ctx, op, is_function, t); }
  private native void allocate(EagerContext ctx, @Cast("const char*") BytePointer op,
                   @Cast("bool") boolean is_function, @Cast("const tensorflow::AttrTypeMap*") StringIntUnorderedMap t);
  public EagerOperation(EagerContext ctx, String op,
                   @Cast("bool") boolean is_function, @Cast("const tensorflow::AttrTypeMap*") StringIntUnorderedMap t) { super((Pointer)null); allocate(ctx, op, is_function, t); }
  private native void allocate(EagerContext ctx, String op,
                   @Cast("bool") boolean is_function, @Cast("const tensorflow::AttrTypeMap*") StringIntUnorderedMap t);

  public native @Cast("bool") boolean is_function();

  public native EagerContext EagerContext();

  public native AttrBuilder MutableAttrs();
  public native @Const @ByRef AttrBuilder Attrs();

  public native @Const @ByRef TensorHandleVector Inputs();
  public native TensorHandleVector MutableInputs();

  public native void AddInput(TensorHandle h);
  public native void UpdateInput(int i, TensorHandle h);
  public native void ConsumeInput(TensorHandle h);

  public native @StdString BytePointer Name();
  public native @Cast("const tensorflow::AttrTypeMap*") StringIntUnorderedMap AttrTypes();

  public native Device Device();
  public native void SetDevice(Device device);
  public native @Const @ByRef DeviceNameUtils.ParsedName GetDeviceName();
  public native @ByVal Status SetDeviceName(@Cast("const char*") BytePointer device);
  public native @ByVal Status SetDeviceName(String device);

  public native void SetUseXla(@Cast("bool") boolean use_xla);

  public native CancellationManager GetCancellationManager();
  public native void SetCancellationManager(CancellationManager cancellation_manager);

  public native EagerExecutor Executor();

  public native @StdString BytePointer DebugString();
}
