// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TemporalScalar<arrow::Time32Type>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseBaseTime32Scalar extends Scalar {
    static { Loader.load(); }

  
  
    public BaseBaseTime32Scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseBaseTime32Scalar(Pointer p) { super(p); }


  public BaseBaseTime32Scalar(@Cast("arrow::TemporalScalar<arrow::Time32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@Cast("arrow::TemporalScalar<arrow::Time32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @Cast("arrow::TemporalScalar<arrow::Time32Type>::ValueType") int value(); public native BaseBaseTime32Scalar value(int setter);
}
