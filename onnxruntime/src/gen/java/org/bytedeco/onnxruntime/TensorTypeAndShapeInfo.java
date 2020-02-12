// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class TensorTypeAndShapeInfo extends BasedTensorTypeAndShapeInfo {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTypeAndShapeInfo(Pointer p) { super(p); }

  public TensorTypeAndShapeInfo(OrtTensorTypeAndShapeInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtTensorTypeAndShapeInfo p);

  public native @Cast("ONNXTensorElementDataType") int GetElementType();
  public native @Cast("size_t") long GetElementCount();

  public native @Cast("size_t") long GetDimensionsCount();
  public native void GetDimensions(@Cast("int64_t*") LongPointer values, @Cast("size_t") long values_count);
  public native void GetDimensions(@Cast("int64_t*") LongBuffer values, @Cast("size_t") long values_count);
  public native void GetDimensions(@Cast("int64_t*") long[] values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") PointerPointer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr BytePointer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr ByteBuffer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr byte[] values, @Cast("size_t") long values_count);

  public native @Cast("int64_t*") @StdVector LongPointer GetShape();
}
