// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
 // value that gets a thread to idle

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class UMS_CREATE_THREAD_ATTRIBUTES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public UMS_CREATE_THREAD_ATTRIBUTES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UMS_CREATE_THREAD_ATTRIBUTES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMS_CREATE_THREAD_ATTRIBUTES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UMS_CREATE_THREAD_ATTRIBUTES position(long position) {
        return (UMS_CREATE_THREAD_ATTRIBUTES)super.position(position);
    }
  
    public native @Cast("DWORD") int UmsVersion(); public native UMS_CREATE_THREAD_ATTRIBUTES UmsVersion(int setter);   
        public native @Cast("PVOID") Pointer UmsContext(); public native UMS_CREATE_THREAD_ATTRIBUTES UmsContext(Pointer setter);   
        public native @Cast("PVOID") Pointer UmsCompletionList(); public native UMS_CREATE_THREAD_ATTRIBUTES UmsCompletionList(Pointer setter);   
}
