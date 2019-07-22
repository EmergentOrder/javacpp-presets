// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // namespace stream_executor
@Namespace("tensorflow") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EventMgr extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public EventMgr() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EventMgr(Pointer p) { super(p); }
}
