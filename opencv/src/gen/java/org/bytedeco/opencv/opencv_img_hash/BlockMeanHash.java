// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_img_hash;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_img_hash.*;


/** \brief Image hash based on block mean.
<p>
See \cite zauner2010implementation for details.
*/
@Namespace("cv::img_hash") @Properties(inherit = org.bytedeco.opencv.presets.opencv_img_hash.class)
public class BlockMeanHash extends ImgHashBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BlockMeanHash(Pointer p) { super(p); }

    /** \brief Create BlockMeanHash object
        @param mode the mode
    */
    public native void setMode(int mode);
    public native @StdVector DoublePointer getMean();
    public static native @Ptr BlockMeanHash create(int mode/*=cv::img_hash::BLOCK_MEAN_HASH_MODE_0*/);
    public static native @Ptr BlockMeanHash create();
}
