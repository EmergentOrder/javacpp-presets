// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** Explicitly cast an expression to a different type */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class CastExpression extends CastExpressionImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CastExpression(Pointer p) { super(p); }

  public CastExpression(@SharedPtr @ByVal Expression operand, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType to,
                   @ByVal CastOptions options) { super((Pointer)null); allocate(operand, to, options); }
  private native void allocate(@SharedPtr @ByVal Expression operand, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType to,
                   @ByVal CastOptions options);

  /** The operand will be cast to whatever type {@code like} would evaluate to, given the same
   *  schema. */
  public CastExpression(@SharedPtr @ByVal Expression operand, @SharedPtr @ByVal Expression like,
                   @ByVal CastOptions options) { super((Pointer)null); allocate(operand, like, options); }
  private native void allocate(@SharedPtr @ByVal Expression operand, @SharedPtr @ByVal Expression like,
                   @ByVal CastOptions options);

  public native @StdString String ToString();

  public native @SharedPtr @ByVal Expression Assume(@Const @ByRef Expression given);

  public native @ByVal DataTypeResult Validate(@Const @ByRef Schema schema);

  public native @Const @ByRef CastOptions options();
}
