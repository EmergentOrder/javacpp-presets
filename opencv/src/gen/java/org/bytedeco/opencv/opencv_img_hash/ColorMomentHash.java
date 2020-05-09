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


/** \addtogroup img_hash
 *  \{
<p>
/** \brief Image hash based on color moments.
<p>
See \cite tang2012perceptual for details.
*/
@Namespace("cv::img_hash") @Properties(inherit = org.bytedeco.opencv.presets.opencv_img_hash.class)
public class ColorMomentHash extends ImgHashBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColorMomentHash(Pointer p) { super(p); }

    public static native @Ptr ColorMomentHash create();
}
