// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::FlatMap<tensorflow::string,tensorflow::Device*,StringPieceHasher>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceMap(Pointer p) { super(p); }
    public DeviceMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DeviceMap put(@ByRef DeviceMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native Device get(@StdString BytePointer i);
    public native DeviceMap put(@StdString BytePointer i, Device value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter @Const Device second();
    }
}

