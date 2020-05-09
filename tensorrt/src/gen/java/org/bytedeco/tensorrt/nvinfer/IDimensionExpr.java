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


/**
 *  \class IDimensionExpr
 * 
 *  An IDimensionExpr represents an integer expression constructed from constants,
 *  input dimensions, and binary operations.  These expressions are can be used
 *  in overrides of IPluginV2DynamicExt::getOutputDimensions to define output
 *  dimensions in terms of input dimensions.
 * 
 *  @see DimensionOperation, IPluginV2DynamicExt::getOutputDimensions
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IDimensionExpr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDimensionExpr(Pointer p) { super(p); }

    /** Return true if expression is a build-time constant. */
    public native @Cast("bool") boolean isConstant();

    /** If isConstant(), returns value of the constant.
     *  If !isConstant(), return std::numeric_limits<int>::min(). */
    public native int getConstantValue();
}
