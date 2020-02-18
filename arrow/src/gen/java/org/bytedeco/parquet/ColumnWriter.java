// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;

@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ColumnWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColumnWriter(Pointer p) { super(p); }


  public static native @SharedPtr ColumnWriter Make(ColumnChunkMetaDataBuilder arg0,
                                              @UniquePtr PageWriter arg1,
                                              @Const WriterProperties properties);

  /** \brief Closes the ColumnWriter, commits any buffered values to pages.
   *  @return Total size of the column in bytes */
  public native @Cast("int64_t") long Close();

  /** \brief The physical Parquet type of the column */
  public native org.bytedeco.parquet.Type.type type();

  /** \brief The schema for the column */
  public native @Const ColumnDescriptor descr();

  /** \brief The number of rows written so far */
  public native @Cast("int64_t") long rows_written();

  /** \brief The total size of the compressed pages + page headers. Some values
   *  might be still buffered and not written to a page yet */
  public native @Cast("int64_t") long total_compressed_bytes();

  /** \brief The total number of bytes written as serialized data and
   *  dictionary pages to the ColumnChunk so far */
  public native @Cast("int64_t") long total_bytes_written();

  /** \brief The file-level writer properties */
  public native @Const WriterProperties properties();

  /** \brief Write Apache Arrow columnar data directly to ColumnWriter. Returns
   *  error status if the array data type is not compatible with the concrete
   *  writer type */
  public native @ByVal Status WriteArrow(@Const ShortPointer def_levels, @Const ShortPointer rep_levels,
                                       @Cast("int64_t") long num_levels, @Const @ByRef Array array,
                                       ArrowWriteContext ctx);
  public native @ByVal Status WriteArrow(@Const ShortBuffer def_levels, @Const ShortBuffer rep_levels,
                                       @Cast("int64_t") long num_levels, @Const @ByRef Array array,
                                       ArrowWriteContext ctx);
  public native @ByVal Status WriteArrow(@Const short[] def_levels, @Const short[] rep_levels,
                                       @Cast("int64_t") long num_levels, @Const @ByRef Array array,
                                       ArrowWriteContext ctx);
}
