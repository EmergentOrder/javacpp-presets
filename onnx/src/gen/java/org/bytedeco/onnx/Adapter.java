// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::version_conversion") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Adapter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Adapter(Pointer p) { super(p); }


    public native void adapt(@SharedPtr Graph arg0, Node node);

    public native @StdString BytePointer name();

    public native @Const @ByRef OpSetID initial_version();

    public native @Const @ByRef OpSetID target_version();
}
