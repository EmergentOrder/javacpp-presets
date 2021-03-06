// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Shared state for a Scan operation */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ScanContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScanContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ScanContext position(long position) {
        return (ScanContext)super.position(position);
    }

  public native MemoryPool pool(); public native ScanContext pool(MemoryPool setter);
}
