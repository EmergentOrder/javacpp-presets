// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /** \brief Classical recurrent layer
    <p>
    Accepts two inputs {@code x_t} and {@code h_{t-1}} and compute two outputs {@code o_t} and {@code h_t}.
    <p>
    - input: should contain packed input {@code x_t}.
    - output: should contain output {@code o_t} (and {@code h_t} if setProduceHiddenOutput() is set to true).
    <p>
    input[0] should have shape [{@code T}, {@code N}, {@code data_dims}] where {@code T} and {@code N} is number of timestamps and number of independent samples of {@code x_t} respectively.
    <p>
    output[0] will have shape [{@code T}, {@code N}, {@code N_o}], where {@code N_o} is number of rows in {@code  W_{xo} } matrix.
    <p>
    If setProduceHiddenOutput() is set to true then \p output[1] will contain a Mat with shape [{@code T}, {@code N}, {@code N_h}], where {@code N_h} is number of rows in {@code  W_{hh} } matrix.
    */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class RNNLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RNNLayer(Pointer p) { super(p); }
    
        /** Creates instance of RNNLayer */
        public static native @Ptr RNNLayer create(@Const @ByRef LayerParams params);

        /** Setups learned weights.
        <p>
        Recurrent-layer behavior on each step is defined by current input {@code  x_t }, previous state {@code  h_t } and learned weights as follows:
        <pre>{@code \begin{eqnarray*}
        h_t &= tanh&(W_{hh} h_{t-1} + W_{xh} x_t + b_h),  \\
        o_t &= tanh&(W_{ho} h_t + b_o),
        \end{eqnarray*}}</pre>
        <p>
        @param Wxh is {@code  W_{xh} } matrix
        @param bh  is {@code  b_{h}  } vector
        @param Whh is {@code  W_{hh} } matrix
        @param Who is {@code  W_{xo} } matrix
        @param bo  is {@code  b_{o}  } vector
        */
        public native void setWeights(@Const @ByRef Mat Wxh, @Const @ByRef Mat bh, @Const @ByRef Mat Whh, @Const @ByRef Mat Who, @Const @ByRef Mat bo);

        /** \brief If this flag is set to true then layer will produce {@code  h_t } as second output.
         * \details Shape of the second output is the same as first output.
         */
        public native void setProduceHiddenOutput(@Cast("bool") boolean produce/*=false*/);
        public native void setProduceHiddenOutput();

    }
