// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HdfsReadableFile extends RandomAccessFile {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HdfsReadableFile(Pointer p) { super(p); }


  public native @ByVal Status Close();

  public native @Cast("bool") boolean closed();

  // NOTE: If you wish to read a particular range of a file in a multithreaded
  // context, you may prefer to use ReadAt to avoid locking issues
  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);
  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);
  public native @ByVal LongResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, Pointer out);
  public native @ByVal BufferResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes);

  public native @ByVal Status Seek(@Cast("int64_t") long _position);
  public native @ByVal LongResult Tell();
  public native @ByVal LongResult GetSize();

  
}
