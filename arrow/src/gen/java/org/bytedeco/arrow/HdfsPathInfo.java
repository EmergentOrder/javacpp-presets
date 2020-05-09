// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HdfsPathInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HdfsPathInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HdfsPathInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HdfsPathInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HdfsPathInfo position(long position) {
        return (HdfsPathInfo)super.position(position);
    }

  public native ObjectType.type kind(); public native HdfsPathInfo kind(ObjectType.type setter);

  public native @StdString String name(); public native HdfsPathInfo name(String setter);
  public native @StdString String owner(); public native HdfsPathInfo owner(String setter);
  public native @StdString String group(); public native HdfsPathInfo group(String setter);

  // Access times in UNIX timestamps (seconds)
  public native @Cast("int64_t") long size(); public native HdfsPathInfo size(long setter);
  public native @Cast("int64_t") long block_size(); public native HdfsPathInfo block_size(long setter);

  public native int last_modified_time(); public native HdfsPathInfo last_modified_time(int setter);
  public native int last_access_time(); public native HdfsPathInfo last_access_time(int setter);

  public native short replication(); public native HdfsPathInfo replication(short setter);
  public native short permissions(); public native HdfsPathInfo permissions(short setter);
}
