// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::pair<cv::Mat,uchar> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatBytePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatBytePairVector(Pointer p) { super(p); }
    public MatBytePairVector(Mat[] firstValue, byte[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public MatBytePairVector()       { allocate();  }
    public MatBytePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef MatBytePairVector put(@ByRef MatBytePairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Mat first(@Cast("size_t") long i); public native MatBytePairVector first(@Cast("size_t") long i, Mat first);
    @Index(function = "at") public native @Cast("uchar") byte second(@Cast("size_t") long i);  public native MatBytePairVector second(@Cast("size_t") long i, byte second);

    public MatBytePairVector put(Mat[] firstValue, byte[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

