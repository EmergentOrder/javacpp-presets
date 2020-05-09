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
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IGatherLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IGatherLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the axis to gather on.
     *   The axis must be less than the number of dimensions in the data input.
     * 
     *  @see getGatherAxis()
     *  */
    
    
    //!
    //!
    //!
    public native void setGatherAxis(int axis);

    /**
     *  \brief Get the axis to gather on.
     * 
     *  @see setGatherAxis()
     *  */
    
    
    //!
    //!
    //!
    public native int getGatherAxis();

    /**
     *  \brief Set the number of leading dimensions of indices tensor to be handled elementwise.
     *  k must be 0 if there is an implicit batch dimension.  It can be 0 or 1 if there is not an implicit batch dimension.
     * 
     *  @see getNbElementWiseDims()
     *  */
    
    
    //!
    //!
    //!
    public native void setNbElementWiseDims(int k);

    /**
     *  \brief Get the number of leading dimensions of indices tensor to be handled elementwise.
     * 
     *  @see setNbElementWiseDims()
     *  */
    public native int getNbElementWiseDims();
}
