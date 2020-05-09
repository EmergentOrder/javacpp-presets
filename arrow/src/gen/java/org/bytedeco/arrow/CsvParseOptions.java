// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::csv::ParseOptions") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CsvParseOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CsvParseOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CsvParseOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CsvParseOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CsvParseOptions position(long position) {
        return (CsvParseOptions)super.position(position);
    }

  // Parsing options

  /** Field delimiter */
  public native @Cast("char") byte delimiter(); public native CsvParseOptions delimiter(byte setter);
  /** Whether quoting is used */
  public native @Cast("bool") boolean quoting(); public native CsvParseOptions quoting(boolean setter);
  /** Quoting character (if {@code quoting} is true) */
  public native @Cast("char") byte quote_char(); public native CsvParseOptions quote_char(byte setter);
  /** Whether a quote inside a value is double-quoted */
  public native @Cast("bool") boolean double_quote(); public native CsvParseOptions double_quote(boolean setter);
  /** Whether escaping is used */
  public native @Cast("bool") boolean escaping(); public native CsvParseOptions escaping(boolean setter);
  /** Escaping character (if {@code escaping} is true) */
  public native @Cast("char") byte escape_char(); public native CsvParseOptions escape_char(byte setter);
  /** Whether values are allowed to contain CR (0x0d) and LF (0x0a) characters */
  public native @Cast("bool") boolean newlines_in_values(); public native CsvParseOptions newlines_in_values(boolean setter);
  /** Whether empty lines are ignored.  If false, an empty line represents
   *  a single empty value (assuming a one-column CSV file). */
  public native @Cast("bool") boolean ignore_empty_lines(); public native CsvParseOptions ignore_empty_lines(boolean setter);

  /** Create parsing options with default values */
  public static native @ByVal CsvParseOptions Defaults();
}
