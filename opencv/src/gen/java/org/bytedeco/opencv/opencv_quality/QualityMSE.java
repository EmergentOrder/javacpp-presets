// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

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
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference mean square error algorithm  https://en.wikipedia.org/wiki/Mean_squared_error
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityMSE extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityMSE(Pointer p) { super(p); }


    /** \brief Computes MSE for reference images supplied in class constructor and provided comparison images
    @param cmpImgs Comparison image(s)
    @return cv::Scalar with per-channel quality values.  Values range from 0 (best) to potentially max float (worst)
    */
    public native @ByVal @Override Scalar compute( @ByVal Mat cmpImgs );
    public native @ByVal @Override Scalar compute( @ByVal UMat cmpImgs );
    public native @ByVal @Override Scalar compute( @ByVal GpuMat cmpImgs );

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief Create an object which calculates quality
    @param ref input image to use as the reference for comparison
    */
    public static native @Ptr QualityMSE create(@ByVal Mat ref);
    public static native @Ptr QualityMSE create(@ByVal UMat ref);
    public static native @Ptr QualityMSE create(@ByVal GpuMat ref);

    /**
    \brief static method for computing quality
    @param ref reference image
    @param cmp comparison image=
    @param qualityMap output quality map, or cv::noArray()
    @return cv::Scalar with per-channel quality values.  Values range from 0 (best) to max float (worst)
    */
    public static native @ByVal Scalar compute( @ByVal Mat ref, @ByVal Mat cmp, @ByVal Mat qualityMap );
    public static native @ByVal Scalar compute( @ByVal UMat ref, @ByVal UMat cmp, @ByVal UMat qualityMap );
    public static native @ByVal Scalar compute( @ByVal GpuMat ref, @ByVal GpuMat cmp, @ByVal GpuMat qualityMap );

}
