// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Uniquely identifies a CXFile, that refers to the same underlying file,
 * across an indexing session.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXFileUniqueID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXFileUniqueID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXFileUniqueID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXFileUniqueID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXFileUniqueID position(long position) {
        return (CXFileUniqueID)super.position(position);
    }

  public native @Cast("unsigned long long") long data(int i); public native CXFileUniqueID data(int i, long setter);
  @MemberGetter public native @Cast("unsigned long long*") LongPointer data();
}
