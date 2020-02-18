// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;

@Namespace("arrow::flight") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class ServerMiddlewareFactory extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ServerMiddlewareFactory() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServerMiddlewareFactory(Pointer p) { super(p); }
}
