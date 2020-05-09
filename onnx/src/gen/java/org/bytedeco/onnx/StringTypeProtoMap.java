<<<<<<< HEAD
// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE
=======
// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE
>>>>>>> ff79e7e2920bed9eb75162ec98fba73b27135c3a

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_map<std::string,const onnx::TypeProto*>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class StringTypeProtoMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTypeProtoMap(Pointer p) { super(p); }
    public StringTypeProtoMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringTypeProtoMap put(@ByRef StringTypeProtoMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @Const TypeProto get(@StdString BytePointer i);
    public native StringTypeProtoMap put(@StdString BytePointer i, TypeProto value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator *().second") @MemberGetter @Const TypeProto second();
    }
}

