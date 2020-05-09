// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;

import static org.bytedeco.opencv.global.opencv_calib3d.*;


/** \brief The base class for stereo correspondence algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class StereoMatcher extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoMatcher(Pointer p) { super(p); }

    /** enum cv::StereoMatcher:: */
    public static final int DISP_SHIFT = 4,
           DISP_SCALE = (1 << DISP_SHIFT);

    /** \brief Computes disparity map for the specified stereo pair
    <p>
    @param left Left 8-bit single-channel image.
    @param right Right image of the same size and the same type as the left one.
    @param disparity Output disparity map. It has the same size as the input images. Some algorithms,
    like StereoBM or StereoSGBM compute 16-bit fixed-point disparity map (where each disparity value
    has 4 fractional bits), whereas other algorithms output 32-bit floating-point disparity map.
     */
    public native void compute( @ByVal Mat left, @ByVal Mat right,
                                      @ByVal Mat disparity );
    public native void compute( @ByVal UMat left, @ByVal UMat right,
                                      @ByVal UMat disparity );
    public native void compute( @ByVal GpuMat left, @ByVal GpuMat right,
                                      @ByVal GpuMat disparity );

    public native int getMinDisparity();
    public native void setMinDisparity(int minDisparity);

    public native int getNumDisparities();
    public native void setNumDisparities(int numDisparities);

    public native int getBlockSize();
    public native void setBlockSize(int blockSize);

    public native int getSpeckleWindowSize();
    public native void setSpeckleWindowSize(int speckleWindowSize);

    public native int getSpeckleRange();
    public native void setSpeckleRange(int speckleRange);

    public native int getDisp12MaxDiff();
    public native void setDisp12MaxDiff(int disp12MaxDiff);
}
