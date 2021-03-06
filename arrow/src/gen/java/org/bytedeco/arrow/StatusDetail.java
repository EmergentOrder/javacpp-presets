// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;

// #endif

/** \brief An opaque class that allows subsystems to retain
 *  additional information inside the Status. */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StatusDetail extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StatusDetail(Pointer p) { super(p); }

  /** \brief Return a unique id for the type of the StatusDetail
   *  (effectively a poor man's substitude for RTTI). */
  public native String type_id();
  /** \brief Produce a human-readable description of this status. */
  public native @StdString String ToString();
}
