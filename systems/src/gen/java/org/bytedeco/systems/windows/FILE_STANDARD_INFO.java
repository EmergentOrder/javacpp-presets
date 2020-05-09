// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_STANDARD_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_STANDARD_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_STANDARD_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_STANDARD_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_STANDARD_INFO position(long position) {
        return (FILE_STANDARD_INFO)super.position(position);
    }

    public native @ByRef LARGE_INTEGER AllocationSize(); public native FILE_STANDARD_INFO AllocationSize(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER EndOfFile(); public native FILE_STANDARD_INFO EndOfFile(LARGE_INTEGER setter);
    public native @Cast("DWORD") int NumberOfLinks(); public native FILE_STANDARD_INFO NumberOfLinks(int setter);
    public native @Cast("BOOLEAN") boolean DeletePending(); public native FILE_STANDARD_INFO DeletePending(boolean setter);
    public native @Cast("BOOLEAN") boolean Directory(); public native FILE_STANDARD_INFO Directory(boolean setter);
}
