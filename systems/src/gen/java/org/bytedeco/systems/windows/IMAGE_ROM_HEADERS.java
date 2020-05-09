// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ROM_HEADERS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ROM_HEADERS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ROM_HEADERS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ROM_HEADERS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ROM_HEADERS position(long position) {
        return (IMAGE_ROM_HEADERS)super.position(position);
    }

    public native @ByRef IMAGE_FILE_HEADER FileHeader(); public native IMAGE_ROM_HEADERS FileHeader(IMAGE_FILE_HEADER setter);
    public native @ByRef IMAGE_ROM_OPTIONAL_HEADER OptionalHeader(); public native IMAGE_ROM_HEADERS OptionalHeader(IMAGE_ROM_OPTIONAL_HEADER setter);
}
