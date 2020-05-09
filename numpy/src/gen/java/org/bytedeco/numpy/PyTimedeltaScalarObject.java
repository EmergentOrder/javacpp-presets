// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyTimedeltaScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTimedeltaScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTimedeltaScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTimedeltaScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTimedeltaScalarObject position(long position) {
        return (PyTimedeltaScalarObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyTimedeltaScalarObject ob_base(PyObject setter);
        public native @Cast("npy_timedelta") long obval(); public native PyTimedeltaScalarObject obval(long setter);
        public native @ByRef PyArray_DatetimeMetaData obmeta(); public native PyTimedeltaScalarObject obmeta(PyArray_DatetimeMetaData setter);
}
