// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("google::protobuf") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class MethodOptions extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public MethodOptions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MethodOptions(Pointer p) { super(p); }
}
