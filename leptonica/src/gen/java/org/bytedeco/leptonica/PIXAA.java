// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of arrays of pix */
@Name("Pixaa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXAA position(long position) {
        return (PIXAA)super.position(position);
    }

    /** number of Pixa in ptr array       */
    public native @Cast("l_int32") int n(); public native PIXAA n(int setter);
    /** number of Pixa ptrs allocated     */
    public native @Cast("l_int32") int nalloc(); public native PIXAA nalloc(int setter);
    /** array of ptrs to pixa             */
    public native PIXA pixa(int i); public native PIXAA pixa(int i, PIXA setter);
    public native @Cast("Pixa**") PointerPointer pixa(); public native PIXAA pixa(PointerPointer setter);
    /** array of boxes                    */
    public native BOXA boxa(); public native PIXAA boxa(BOXA setter);
}
