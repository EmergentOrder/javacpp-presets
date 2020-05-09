// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA array
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaArray extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudaArray() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaArray(Pointer p) { super(p); }
}
