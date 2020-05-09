// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IPoolingLayer
 * 
 *  \brief A Pooling layer in a network definition.
 * 
 *  The layer applies a reduction operation within a window over the input.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPoolingLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPoolingLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the type of activation to be performed.
     * 
     *  DLA only supports kMAX and kAVERAGE.
     * 
     *  @see getPoolingType(), PoolingType
     *  */
    
    
    //!
    //!
    //!
    public native void setPoolingType(PoolingType type);
    public native void setPoolingType(@Cast("nvinfer1::PoolingType") int type);

    /**
     *  \brief Get the type of activation to be performed.
     * 
     *  @see setPoolingType(), PoolingType
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native PoolingType getPoolingType();

    /**
     *  \brief Set the window size for pooling.
     * 
     *  If executing this layer on DLA, both height and width of window size must be in the range [1,8].
     * 
     *  @see getWindowSize()
     * 
     *  @deprecated Superseded by setWindowSizeNd.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated void setWindowSize(@ByVal DimsHW windowSize);

    /**
     *  \brief Get the window size for pooling.
     * 
     *  @see setWindowSize()
     * 
     *  @deprecated Superseded by getWindowSizeNd.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getWindowSize();

    /**
     *  \brief Set the stride for pooling.
     * 
     *  Default: 1
     * 
     *  If executing this layer on DLA, both height and width of stride must be in the range [1,16].
     * 
     *  @see getStride()
     * 
     *  @deprecated Superseded by setStrideNd
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated void setStride(@ByVal DimsHW stride);

    /**
     *  \brief Get the stride for pooling.
     * 
     *  @see setStride()
     * 
     *  @deprecated Superseded by getStrideNd
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getStride();

    /**
     *  \brief Set the padding for pooling.
     * 
     *  Default: 0
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,7].
     * 
     *  @see getPadding()
     * 
     *  @deprecated Superseded by setPaddingNd
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated void setPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding for pooling.
     * 
     *  Default: 0
     * 
     *  @see setPadding()
     * 
     *  @deprecated Superseded by getPaddingNd
     *  */
    
    
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getPadding();

    /**
     *  \brief Set the blending factor for the max_average_blend mode:
     *  max_average_blendPool = (1-blendFactor)*maxPool + blendFactor*avgPool
     *  blendFactor is a user value in [0,1] with the default value of 0.0
     *  This value only applies for the kMAX_AVERAGE_BLEND mode.
     * 
     *  @see getBlendFactor()
     *  */
    
    
    //!
    //!
    //!
    public native void setBlendFactor(float blendFactor);

    /**
     *  \brief Get the blending factor for the max_average_blend mode:
     *  max_average_blendPool = (1-blendFactor)*maxPool + blendFactor*avgPool
     *  blendFactor is a user value in [0,1] with the default value of 0.0
     *  In modes other than kMAX_AVERAGE_BLEND, blendFactor is ignored.
     * 
     *  @see setBlendFactor()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native float getBlendFactor();

    /**
     *  \brief Set whether average pooling uses as a denominator the overlap area between the window
     *  and the unpadded input.
     *  If this is not set, the denominator is the overlap between the pooling window and the padded input.
     * 
     *  Default: true
     * 
     *  @see getAverageCountExcludesPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setAverageCountExcludesPadding(@Cast("bool") boolean exclusive);

    /**
     *  \brief Get whether exclusive pooling uses as a denominator the overlap area betwen the window
     *  and the unpadded input.
     * 
     *  @see setAverageCountExcludesPadding()
     *  */
    public native @Cast("bool") boolean getAverageCountExcludesPadding();
    /**
     *  \brief Set the pre-padding.
     * 
     *  The start of input will be zero-padded by this number of elements in the height and width directions.
     * 
     *  Default: 0
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,15].
     * 
     *  @see getPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPrePadding(@ByVal Dims padding);

    /**
     *  \brief Get the pre-padding.
     * 
     *  @see setPrePadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPrePadding();

    /**
     *  \brief Set the post-padding.
     * 
     *  The end of the input will be zero-padded by this number of elements in the height and width directions.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,15].
     * 
     *  @see getPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPostPadding(@ByVal Dims padding);

    /**
     *  \brief Get the padding.
     * 
     *  @see setPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPostPadding();

    /**
     *  \brief Set the padding mode.
     * 
     *  Padding mode takes precedence if both setPaddingMode and setPre/PostPadding are used.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see getPaddingMode() */
    
    
    //!
    //!
    //!
    public native void setPaddingMode(PaddingMode paddingMode);
    public native void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);

    /**
     *  \brief Get the padding mode.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see setPaddingMode() */
    
    
    //!
    //!
    //!
    //!
    public native PaddingMode getPaddingMode();

    /**
     *  \brief Set the multi-dimension window size for pooling.
     * 
     *  If executing this layer on DLA, only support 2D window size, both height and width of window size must be in the range [1,8].
     * 
     *  @see getWindowSizeNd() setWindowSize() getWindowSize()
     *  */
    
    
    //!
    //!
    //!
    public native void setWindowSizeNd(@ByVal Dims windowSize);

    /**
     *  \brief Get the multi-dimension window size for pooling.
     * 
     *  @see setWindowSizeNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getWindowSizeNd();

    /**
     *  \brief Set the multi-dimension stride for pooling.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D stride, both height and width of stride must be in the range [1,16].
     * 
     *  @see getStrideNd() setStride() getStride()
     *  */
    
    
    //!
    //!
    //!
    public native void setStrideNd(@ByVal Dims stride);

    /**
     *  \brief Get the multi-dimension stride for pooling.
     * 
     *  @see setStrideNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getStrideNd();

    /**
     *  \brief Set the multi-dimension padding for pooling.
     * 
     *  The input will be zero-padded by this number of elements in each dimension.
     *  Padding is symmetric.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range [0,7].
     * 
     *  @see getPaddingNd() setPadding() getPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setPaddingNd(@ByVal Dims padding);

    /**
     *  \brief Get the multi-dimension padding for pooling.
     * 
     *  If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPaddingNd()
     *  */
    public native @ByVal Dims getPaddingNd();
}
