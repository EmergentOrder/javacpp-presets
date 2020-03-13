// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * The stream identifier returned by \ref hs_open_stream().
 */
@Opaque @Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_stream_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public hs_stream_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_stream_t(Pointer p) { super(p); }
}
