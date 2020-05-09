// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class AssignMessageDecoderListener
 *  \brief Assign a message decoded by MessageDecoder.
 * 
 *  This API is EXPERIMENTAL.
 * 
 *  @since 0.17.0 */
@Namespace("arrow::ipc") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class AssignMessageDecoderListener extends MessageDecoderListener {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssignMessageDecoderListener(Pointer p) { super(p); }

  /** \brief Construct a listener that assigns a decoded message to the
   *  specified location.
   * 
   *  @param message [in] a location to store the received message */
  public AssignMessageDecoderListener(@UniquePtr Message message) { super((Pointer)null); allocate(message); }
  private native void allocate(@UniquePtr Message message);

  public native @ByVal Status OnMessageDecoded(@UniquePtr Message message);
}
