// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// List builder

@Name("arrow::BaseListBuilder<arrow::ListType>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseListBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseListBuilder(Pointer p) { super(p); }


  /** Use this constructor to incrementally build the value array along with offsets and
   *  null bitmap. */

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  
  ///
  public native void Reset();

  /** \brief Vector append
   * 
   *  If passed, valid_bytes is of equal length to values, and any zero byte
   *  will be considered as a null for that slot */
  
  ///
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") IntPointer offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") IntPointer offsets, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") IntBuffer offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") IntBuffer offsets, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") int[] offsets, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::BaseListBuilder<arrow::ListType>::offset_type*") int[] offsets, @Cast("int64_t") long length);

  /** \brief Start a new variable-length list slot
   * 
   *  This function should be called before beginning to append elements to the
   *  value builder */
  public native @ByVal Status Append(@Cast("bool") boolean is_valid/*=true*/);
  public native @ByVal Status Append();

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  public native ArrayBuilder value_builder();

  // Cannot make this a static attribute because of linking issues
  public static native @Cast("const int64_t") long maximum_elements();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
