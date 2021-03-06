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


@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ExpressionType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ExpressionType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExpressionType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExpressionType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ExpressionType position(long position) {
        return (ExpressionType)super.position(position);
    }

  public enum type {
    /** a reference to a column within a record batch, will evaluate to an array */
    FIELD(0),

    /** a literal singular value encapuslated in a Scalar */
    SCALAR(1),

    /** a literal Array */
    // TODO(bkietz) ARRAY,

    /** an inversion of another expression */
    NOT(2),

    /** cast an expression to a given DataType */
    // TODO(bkietz) CAST,

    /** a conjunction of multiple expressions (true if all operands are true) */
    AND(3),

    /** a disjunction of multiple expressions (true if any operand is true) */
    OR(4),

    /** a comparison of two other expressions */
    COMPARISON(5);

    /** replace nulls with other expressions
     *  currently only boolean expressions may be coalesced */
    // TODO(bkietz) COALESCE,

    /** extract validity as a boolean expression */
    // TODO(bkietz) IS_VALID,

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
