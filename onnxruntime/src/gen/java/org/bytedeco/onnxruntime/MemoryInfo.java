// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class MemoryInfo extends BaseMemoryInfo {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryInfo(Pointer p) { super(p); }

  public static native @ByVal MemoryInfo CreateCpu(@Cast("OrtAllocatorType") int type, @Cast("OrtMemType") int mem_type1);
  public MemoryInfo(@Cast("const char*") BytePointer name, @Cast("OrtAllocatorType") int type, int id, @Cast("OrtMemType") int mem_type) { super((Pointer)null); allocate(name, type, id, mem_type); }
  private native void allocate(@Cast("const char*") BytePointer name, @Cast("OrtAllocatorType") int type, int id, @Cast("OrtMemType") int mem_type);
  public MemoryInfo(String name, @Cast("OrtAllocatorType") int type, int id, @Cast("OrtMemType") int mem_type) { super((Pointer)null); allocate(name, type, id, mem_type); }
  private native void allocate(String name, @Cast("OrtAllocatorType") int type, int id, @Cast("OrtMemType") int mem_type);

  public MemoryInfo(OrtMemoryInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtMemoryInfo p);
}
