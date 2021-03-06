// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief EXPERIMENTAL: file selector */
@Namespace("arrow::fs") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Selector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Selector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Selector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Selector position(long position) {
        return (Selector)super.position(position);
    }

  // The directory in which to select files.
  // If the path exists but doesn't point to a directory, this should be an error.
  public native @StdString String base_dir(); public native Selector base_dir(String setter);
  // The behavior if `base_dir` doesn't exist in the filesystem.  If false,
  // an error is returned.  If true, an empty selection is returned.
  public native @Cast("bool") boolean allow_non_existent(); public native Selector allow_non_existent(boolean setter);
  // Whether to recurse into subdirectories.
  public native @Cast("bool") boolean recursive(); public native Selector recursive(boolean setter);
  // The maximum number of subdirectories to recurse into.
  public native int max_recursion(); public native Selector max_recursion(int setter);

  public Selector() { super((Pointer)null); allocate(); }
  private native void allocate();
}
