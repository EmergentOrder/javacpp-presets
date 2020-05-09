// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A per-step version of CollectiveRemoteAccess that cleans up outstanding
// communications in case step execution is abandoned.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PerStepCollectiveRemoteAccess extends CollectiveRemoteAccess {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PerStepCollectiveRemoteAccess(Pointer p) { super(p); }

  public native void StartAbort(@Const @ByRef Status s);
}
