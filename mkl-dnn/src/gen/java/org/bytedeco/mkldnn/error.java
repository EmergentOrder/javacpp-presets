// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \addtogroup cpp_api C++ API
 *  \{
 <p>
 *  \addtogroup cpp_api_utils Utils
 *  \{
 <p>
 *  Intel(R) MKL-DNN exception class.
 * 
 *  This class captures the status returned by the failed C API function, error
 *  message, and, optionally, handle of the primitive that caused the error. */
@Namespace("mkldnn") @NoOffset @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class error extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public error(Pointer p) { super(p); }

    public native @Cast("mkldnn_status_t") int status(); public native error status(int setter);
    
    ///
    public native @Cast("const char*") BytePointer message(); public native error message(BytePointer setter);

    /** Constructs an error instance.
     * 
     *  @param astatus The error status returned by the C API.
     *  @param amessage The error message. */
    public error(@Cast("mkldnn_status_t") int astatus, @Cast("const char*") BytePointer amessage) { super((Pointer)null); allocate(astatus, amessage); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, @Cast("const char*") BytePointer amessage);
    public error(@Cast("mkldnn_status_t") int astatus, String amessage) { super((Pointer)null); allocate(astatus, amessage); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, String amessage);

    /** Returns the explanatory string. */
    
    ///
    public native @NoException @Cast("const char*") BytePointer what();

    /** A convenience function for wrapping calls to the C API. Checks the
     *  return status and throws an #error in case of failure.
     * 
     *  @param status The error status returned by the C API.
     *  @param message The error message. */
    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status, @Cast("const char*") BytePointer message);
    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status, String message);
}
