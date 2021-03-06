// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ParquetException extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetException(Pointer p) { super(p); }

  public static native void EofException(@StdString String msg/*=""*/);
  public static native void EofException();
  public static native void EofException(@StdString BytePointer msg/*=""*/);

  public static native void NYI(@StdString String msg/*=""*/);
  public static native void NYI();
  public static native void NYI(@StdString BytePointer msg/*=""*/);

  public ParquetException(String msg) { super((Pointer)null); allocate(msg); }
  private native void allocate(String msg);
  public ParquetException(@Cast("const char*") BytePointer msg) { super((Pointer)null); allocate(msg); }
  private native void allocate(@Cast("const char*") BytePointer msg);

  public ParquetException(String msg, @Cast("std::exception*") @ByRef Pointer arg1) { super((Pointer)null); allocate(msg, arg1); }
  private native void allocate(String msg, @Cast("std::exception*") @ByRef Pointer arg1);
  public ParquetException(@Cast("const char*") BytePointer msg, @Cast("std::exception*") @ByRef Pointer arg1) { super((Pointer)null); allocate(msg, arg1); }
  private native void allocate(@Cast("const char*") BytePointer msg, @Cast("std::exception*") @ByRef Pointer arg1);

  public native String what();
}
