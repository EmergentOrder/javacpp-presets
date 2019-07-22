// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Allows for iteration of the edges of a Graph, by iterating the underlying
// Graph.edges_ vector while skipping over null entries.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GraphEdgesIterable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphEdgesIterable(Pointer p) { super(p); }

  public GraphEdgesIterable(@Cast("const std::vector<tensorflow::Edge*>*") @ByRef EdgeVector edges) { super((Pointer)null); allocate(edges); }
  private native void allocate(@Cast("const std::vector<tensorflow::Edge*>*") @ByRef EdgeVector edges);

  @NoOffset public static class const_iterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public const_iterator(Pointer p) { super(p); }
  

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef const_iterator other);

    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef const_iterator other);

    // This is the prefix increment operator (++x), which is the operator
    // used by C++ range iteration (for (x : y) ...).  We intentionally do not
    // provide a postfix increment operator.
    public native @ByRef @Name("operator ++") const_iterator increment();

    public native @Cast("tensorflow::GraphEdgesIterable::value_type") @Name("operator *") Edge multiply();
  }

  public native @ByVal const_iterator begin();
  public native @ByVal const_iterator end();
}
