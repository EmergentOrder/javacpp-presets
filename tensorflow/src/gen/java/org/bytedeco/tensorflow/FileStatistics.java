// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FileStatistics extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileStatistics(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileStatistics(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FileStatistics position(long position) {
        return (FileStatistics)super.position(position);
    }

  // The length of the file or -1 if finding file length is not supported.
  public native @Cast("tensorflow::int64") long length(); public native FileStatistics length(long setter);
  // The last modified time in nanoseconds.
  public native @Cast("tensorflow::int64") long mtime_nsec(); public native FileStatistics mtime_nsec(long setter);
  // True if the file is a directory, otherwise false.
  public native @Cast("bool") boolean is_directory(); public native FileStatistics is_directory(boolean setter);

  public FileStatistics() { super((Pointer)null); allocate(); }
  private native void allocate();
  public FileStatistics(@Cast("tensorflow::int64") long length, @Cast("tensorflow::int64") long mtime_nsec, @Cast("bool") boolean is_directory) { super((Pointer)null); allocate(length, mtime_nsec, is_directory); }
  private native void allocate(@Cast("tensorflow::int64") long length, @Cast("tensorflow::int64") long mtime_nsec, @Cast("bool") boolean is_directory);
}
