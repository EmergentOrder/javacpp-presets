// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


// Class to iterate over tesseract results, providing access to all levels
// of the page hierarchy, without including any tesseract headers or having
// to handle any tesseract structures.
// WARNING! This class points to data held within the TessBaseAPI class, and
// therefore can only be used while the TessBaseAPI class still exists and
// has not been subjected to a call of Init, SetImage, Recognize, Clear, End
// DetectOS, or anything else that changes the internal PAGE_RES.
// See apitypes.h for the definition of PageIteratorLevel.
// See also base class PageIterator, which contains the bulk of the interface.
// LTRResultIterator adds text-specific methods for access to OCR output.

@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class LTRResultIterator extends PageIterator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LTRResultIterator(Pointer p) { super(p); }

  // page_res and tesseract come directly from the BaseAPI.
  // The rectangle parameters are copied indirectly from the Thresholder,
  // via the BaseAPI. They represent the coordinates of some rectangle in an
  // original image (in top-left-origin coordinates) and therefore the top-left
  // needs to be added to any output boxes in order to specify coordinates
  // in the original image. See TessBaseAPI::SetRectangle.
  // The scale and scaled_yres are in case the Thresholder scaled the image
  // rectangle prior to thresholding. Any coordinates in tesseract's image
  // must be divided by scale before adding (rect_left, rect_top).
  // The scaled_yres indicates the effective resolution of the binary image
  // that tesseract has been given by the Thresholder.
  // After the constructor, Begin has already been called.
  public LTRResultIterator(PAGE_RES page_res, Tesseract tesseract,
                      int scale, int scaled_yres,
                      int rect_left, int rect_top,
                      int rect_width, int rect_height) { super((Pointer)null); allocate(page_res, tesseract, scale, scaled_yres, rect_left, rect_top, rect_width, rect_height); }
  private native void allocate(PAGE_RES page_res, Tesseract tesseract,
                      int scale, int scaled_yres,
                      int rect_left, int rect_top,
                      int rect_width, int rect_height);

  // LTRResultIterators may be copied! This makes it possible to iterate over
  // all the objects at a lower level, while maintaining an iterator to
  // objects at a higher level. These constructors DO NOT CALL Begin, so
  // iterations will continue from the location of src.
  // TODO: For now the copy constructor and operator= only need the base class
  // versions, but if new data members are added, don't forget to add them!

  // ============= Moving around within the page ============.

  // See PageIterator.

  // ============= Accessing data ==============.

  // Returns the null terminated UTF-8 encoded text string for the current
  // object at the given level. Use delete [] to free after use.
  public native @Cast("char*") BytePointer GetUTF8Text(@Cast("tesseract::PageIteratorLevel") int level);

  // Set the string inserted at the end of each text line. "\n" by default.
  public native void SetLineSeparator(@Cast("const char*") BytePointer new_line);
  public native void SetLineSeparator(String new_line);

  // Set the string inserted at the end of each paragraph. "\n" by default.
  public native void SetParagraphSeparator(@Cast("const char*") BytePointer new_para);
  public native void SetParagraphSeparator(String new_para);

  // Returns the mean confidence of the current object at the given level.
  // The number should be interpreted as a percent probability. (0.0f-100.0f)
  public native float Confidence(@Cast("tesseract::PageIteratorLevel") int level);

  // Returns the attributes of the current row.
  public native void RowAttributes(FloatPointer row_height, FloatPointer descenders,
                       FloatPointer ascenders);
  public native void RowAttributes(FloatBuffer row_height, FloatBuffer descenders,
                       FloatBuffer ascenders);
  public native void RowAttributes(float[] row_height, float[] descenders,
                       float[] ascenders);

  // ============= Functions that refer to words only ============.

  // Returns the font attributes of the current word. If iterating at a higher
  // level object than words, eg textlines, then this will return the
  // attributes of the first word in that textline.
  // The actual return value is a string representing a font name. It points
  // to an internal table and SHOULD NOT BE DELETED. Lifespan is the same as
  // the iterator itself, ie rendered invalid by various members of
  // TessBaseAPI, including Init, SetImage, End or deleting the TessBaseAPI.
  // Pointsize is returned in printers points (1/72 inch.)
  public native @Cast("const char*") BytePointer WordFontAttributes(@Cast("bool*") BoolPointer is_bold,
                                   @Cast("bool*") BoolPointer is_italic,
                                   @Cast("bool*") BoolPointer is_underlined,
                                   @Cast("bool*") BoolPointer is_monospace,
                                   @Cast("bool*") BoolPointer is_serif,
                                   @Cast("bool*") BoolPointer is_smallcaps,
                                   IntPointer pointsize,
                                   IntPointer font_id);
  public native String WordFontAttributes(@Cast("bool*") boolean[] is_bold,
                                   @Cast("bool*") boolean[] is_italic,
                                   @Cast("bool*") boolean[] is_underlined,
                                   @Cast("bool*") boolean[] is_monospace,
                                   @Cast("bool*") boolean[] is_serif,
                                   @Cast("bool*") boolean[] is_smallcaps,
                                   IntBuffer pointsize,
                                   IntBuffer font_id);
  public native @Cast("const char*") BytePointer WordFontAttributes(@Cast("bool*") BoolPointer is_bold,
                                   @Cast("bool*") BoolPointer is_italic,
                                   @Cast("bool*") BoolPointer is_underlined,
                                   @Cast("bool*") BoolPointer is_monospace,
                                   @Cast("bool*") BoolPointer is_serif,
                                   @Cast("bool*") BoolPointer is_smallcaps,
                                   int[] pointsize,
                                   int[] font_id);
  public native String WordFontAttributes(@Cast("bool*") boolean[] is_bold,
                                   @Cast("bool*") boolean[] is_italic,
                                   @Cast("bool*") boolean[] is_underlined,
                                   @Cast("bool*") boolean[] is_monospace,
                                   @Cast("bool*") boolean[] is_serif,
                                   @Cast("bool*") boolean[] is_smallcaps,
                                   IntPointer pointsize,
                                   IntPointer font_id);
  public native @Cast("const char*") BytePointer WordFontAttributes(@Cast("bool*") BoolPointer is_bold,
                                   @Cast("bool*") BoolPointer is_italic,
                                   @Cast("bool*") BoolPointer is_underlined,
                                   @Cast("bool*") BoolPointer is_monospace,
                                   @Cast("bool*") BoolPointer is_serif,
                                   @Cast("bool*") BoolPointer is_smallcaps,
                                   IntBuffer pointsize,
                                   IntBuffer font_id);
  public native String WordFontAttributes(@Cast("bool*") boolean[] is_bold,
                                   @Cast("bool*") boolean[] is_italic,
                                   @Cast("bool*") boolean[] is_underlined,
                                   @Cast("bool*") boolean[] is_monospace,
                                   @Cast("bool*") boolean[] is_serif,
                                   @Cast("bool*") boolean[] is_smallcaps,
                                   int[] pointsize,
                                   int[] font_id);

  // Return the name of the language used to recognize this word.
  // On error, nullptr.  Do not delete this pointer.
  public native @Cast("const char*") BytePointer WordRecognitionLanguage();

  // Return the overall directionality of this word.
  public native @Cast("StrongScriptDirection") int WordDirection();

  // Returns true if the current word was found in a dictionary.
  public native @Cast("bool") boolean WordIsFromDictionary();

  // Returns the number of blanks before the current word.
  public native int BlanksBeforeWord();

  // Returns true if the current word is numeric.
  public native @Cast("bool") boolean WordIsNumeric();

  // Returns true if the word contains blamer information.
  public native @Cast("bool") boolean HasBlamerInfo();

  // Returns the pointer to ParamsTrainingBundle stored in the BlamerBundle
  // of the current word.
  public native @Const Pointer GetParamsTrainingBundle();

  // Returns a pointer to the string with blamer information for this word.
  // Assumes that the word's blamer_bundle is not nullptr.
  public native @Cast("const char*") BytePointer GetBlamerDebug();

  // Returns a pointer to the string with misadaption information for this word.
  // Assumes that the word's blamer_bundle is not nullptr.
  public native @Cast("const char*") BytePointer GetBlamerMisadaptionDebug();

  // Returns true if a truth string was recorded for the current word.
  public native @Cast("bool") boolean HasTruthString();

  // Returns true if the given string is equivalent to the truth string for
  // the current word.
  public native @Cast("bool") boolean EquivalentToTruth(@Cast("const char*") BytePointer str);
  public native @Cast("bool") boolean EquivalentToTruth(String str);

  // Returns a null terminated UTF-8 encoded truth string for the current word.
  // Use delete [] to free after use.
  public native @Cast("char*") BytePointer WordTruthUTF8Text();

  // Returns a null terminated UTF-8 encoded normalized OCR string for the
  // current word. Use delete [] to free after use.
  public native @Cast("char*") BytePointer WordNormedUTF8Text();

  // Returns a pointer to serialized choice lattice.
  // Fills lattice_size with the number of bytes in lattice data.
  public native @Cast("const char*") BytePointer WordLattice(IntPointer lattice_size);
  public native String WordLattice(IntBuffer lattice_size);
  public native @Cast("const char*") BytePointer WordLattice(int[] lattice_size);

  // ============= Functions that refer to symbols only ============.

  // Returns true if the current symbol is a superscript.
  // If iterating at a higher level object than symbols, eg words, then
  // this will return the attributes of the first symbol in that word.
  public native @Cast("bool") boolean SymbolIsSuperscript();
  // Returns true if the current symbol is a subscript.
  // If iterating at a higher level object than symbols, eg words, then
  // this will return the attributes of the first symbol in that word.
  public native @Cast("bool") boolean SymbolIsSubscript();
  // Returns true if the current symbol is a dropcap.
  // If iterating at a higher level object than symbols, eg words, then
  // this will return the attributes of the first symbol in that word.
  public native @Cast("bool") boolean SymbolIsDropcap();
}
