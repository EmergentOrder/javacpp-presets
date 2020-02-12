// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class CustomOpDomain extends BasedCustomOpDomain {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CustomOpDomain(Pointer p) { super(p); }

  public CustomOpDomain(@Cast("const char*") BytePointer domain) { super((Pointer)null); allocate(domain); }
  private native void allocate(@Cast("const char*") BytePointer domain);
  public CustomOpDomain(String domain) { super((Pointer)null); allocate(domain); }
  private native void allocate(String domain);

  public native void Add(OrtCustomOp op);
}
