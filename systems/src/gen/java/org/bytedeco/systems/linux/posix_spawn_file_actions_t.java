// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;



/* Data structure to contain information about the actions to be
   performed in the new process with respect to file descriptors.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class posix_spawn_file_actions_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public posix_spawn_file_actions_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public posix_spawn_file_actions_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public posix_spawn_file_actions_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public posix_spawn_file_actions_t position(long position) {
        return (posix_spawn_file_actions_t)super.position(position);
    }

  public native int __allocated(); public native posix_spawn_file_actions_t __allocated(int setter);
  public native int __used(); public native posix_spawn_file_actions_t __used(int setter);
  public native @Cast("__spawn_action*") Pointer __actions(); public native posix_spawn_file_actions_t __actions(Pointer setter);
  public native int __pad(int i); public native posix_spawn_file_actions_t __pad(int i, int setter);
  @MemberGetter public native @Cast("int*") IntPointer __pad();
}
