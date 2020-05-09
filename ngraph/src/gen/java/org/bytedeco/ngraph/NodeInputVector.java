// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Name("std::vector<ngraph::Input<ngraph::Node> >") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NodeInputVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeInputVector(Pointer p) { super(p); }
    public NodeInputVector()       { allocate();  }
    private native void allocate();


    public boolean empty() { return size() == 0; }
    public native long size();

    @Index(function = "at") public native @ByRef NodeInput get(@Cast("size_t") long i);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const NodeInput get();
    }
}

