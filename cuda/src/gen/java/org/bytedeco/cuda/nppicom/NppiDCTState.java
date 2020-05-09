// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppicom;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppicom.*;

   

// #if defined (__cplusplus)
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nppicom.class)
public class NppiDCTState extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NppiDCTState() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiDCTState(Pointer p) { super(p); }
}
