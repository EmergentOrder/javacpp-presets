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

@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Floor_Onnx_ver6 extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Floor_Onnx_ver6() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Floor_Onnx_ver6(Pointer p) { super(p); }
}
