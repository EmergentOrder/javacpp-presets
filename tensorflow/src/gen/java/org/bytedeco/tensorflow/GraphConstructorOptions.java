// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Construct a Graph *g out of a GraphDef gdef. Returns non-OK on
// error, in which case *g is left in an incomplete state.
//
// *g is expected to be an empty graph (with no more than a source and sink
// nodes) when provided to ConvertGraphDefToGraph. To enhance an existing Graph,
// see ImportGraphDef.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GraphConstructorOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphConstructorOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphConstructorOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphConstructorOptions position(long position) {
        return (GraphConstructorOptions)super.position(position);
    }

  public GraphConstructorOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  // If true, allows internal ops in the GraphDef.
  public native @Cast("bool") boolean allow_internal_ops(); public native GraphConstructorOptions allow_internal_ops(boolean setter);

  // If true, the graph def is expected to have fully specified
  // devices for all nodes. A node in the resulting graph "g" has the
  // device name set accordingly.
  //
  // TODO(zhifengc): if possible, consider removing this option.
  public native @Cast("bool") boolean expect_device_spec(); public native GraphConstructorOptions expect_device_spec(boolean setter);
}
