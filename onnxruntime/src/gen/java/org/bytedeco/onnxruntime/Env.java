// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Env extends BasedEnv {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Env(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Env(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Env position(long position) {
        return (Env)super.position(position);
    }

  public Env(@Cast("OrtLoggingLevel") int default_logging_level/*=ORT_LOGGING_LEVEL_WARNING*/, @Cast("const char*") BytePointer logid/*=""*/) { super((Pointer)null); allocate(default_logging_level, logid); }
  private native void allocate(@Cast("OrtLoggingLevel") int default_logging_level/*=ORT_LOGGING_LEVEL_WARNING*/, @Cast("const char*") BytePointer logid/*=""*/);
  public Env() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Env(@Cast("OrtLoggingLevel") int default_logging_level/*=ORT_LOGGING_LEVEL_WARNING*/, String logid/*=""*/) { super((Pointer)null); allocate(default_logging_level, logid); }
  private native void allocate(@Cast("OrtLoggingLevel") int default_logging_level/*=ORT_LOGGING_LEVEL_WARNING*/, String logid/*=""*/);
  public Env(@Cast("OrtLoggingLevel") int default_logging_level, @Cast("const char*") BytePointer logid, OrtLoggingFunction logging_function, Pointer logger_param) { super((Pointer)null); allocate(default_logging_level, logid, logging_function, logger_param); }
  private native void allocate(@Cast("OrtLoggingLevel") int default_logging_level, @Cast("const char*") BytePointer logid, OrtLoggingFunction logging_function, Pointer logger_param);
  public Env(@Cast("OrtLoggingLevel") int default_logging_level, String logid, OrtLoggingFunction logging_function, Pointer logger_param) { super((Pointer)null); allocate(default_logging_level, logid, logging_function, logger_param); }
  private native void allocate(@Cast("OrtLoggingLevel") int default_logging_level, String logid, OrtLoggingFunction logging_function, Pointer logger_param);
  public Env(OrtEnv p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtEnv p);

  public native @ByRef Env EnableTelemetryEvents();
  public native @ByRef Env DisableTelemetryEvents();

}
