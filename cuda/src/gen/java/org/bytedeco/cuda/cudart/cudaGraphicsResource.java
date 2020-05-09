// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA graphics interop resource
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaGraphicsResource extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaGraphicsResource() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaGraphicsResource(Pointer p) { super(p); }
}
