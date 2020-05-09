// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * A type containing information on the target platform which may optionally be
 * provided to the compile calls (\ref hs_compile(), \ref hs_compile_multi(),
 * \ref hs_compile_ext_multi()).
 *
 * A hs_platform_info structure may be populated for the current platform by
 * using the \ref hs_populate_platform() call.
 */
@Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_platform_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public hs_platform_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public hs_platform_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_platform_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public hs_platform_info_t position(long position) {
        return (hs_platform_info_t)super.position(position);
    }

    /**
     * Information about the target platform which may be used to guide the
     * optimisation process of the compile.
     *
     * Use of this field does not limit the processors that the resulting
     * database can run on, but may impact the performance of the resulting
     * database.
     */
    public native @Cast("unsigned int") int tune(); public native hs_platform_info_t tune(int setter);

    /**
     * Relevant CPU features available on the target platform
     *
     * This value may be produced by combining HS_CPU_FEATURE_* flags (such as
     * \ref HS_CPU_FEATURES_AVX2). Multiple CPU features may be or'ed together
     * to produce the value.
     */
    public native @Cast("unsigned long long") long cpu_features(); public native hs_platform_info_t cpu_features(long setter);

    /**
     * Reserved for future use.
     */
    public native @Cast("unsigned long long") long reserved1(); public native hs_platform_info_t reserved1(long setter);

    /**
     * Reserved for future use.
     */
    public native @Cast("unsigned long long") long reserved2(); public native hs_platform_info_t reserved2(long setter);
}
