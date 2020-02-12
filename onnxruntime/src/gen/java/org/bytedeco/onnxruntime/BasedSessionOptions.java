// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtSessionOptions>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BasedSessionOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasedSessionOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BasedSessionOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BasedSessionOptions position(long position) {
        return (BasedSessionOptions)super.position(position);
    }

  public BasedSessionOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BasedSessionOptions(OrtSessionOptions p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtSessionOptions p);

  public native @Name("operator OrtSessionOptions*") OrtSessionOptions asOrtSessionOptions();

  public native OrtSessionOptions release();
}
