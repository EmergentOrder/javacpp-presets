// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * Structure used as a parameter by getitimer(2) and setitimer(2) system
 * calls.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class itimerval extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public itimerval() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public itimerval(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public itimerval(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public itimerval position(long position) {
        return (itimerval)super.position(position);
    }

	public native @ByRef timeval it_interval(); public native itimerval it_interval(timeval setter);	/* timer interval */
	public native @ByRef timeval it_value(); public native itimerval it_value(timeval setter);	/* current value */
}
