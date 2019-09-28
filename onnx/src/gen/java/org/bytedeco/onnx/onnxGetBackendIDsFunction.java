// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


/* Function pointer declarations for dynamic loading */
@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxGetBackendIDsFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxGetBackendIDsFunction(Pointer p) { super(p); }
    protected onnxGetBackendIDsFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    @ByPtrPtr onnxBackendID backendIDs,
    @Cast("size_t*") SizeTPointer numBackends);
}
