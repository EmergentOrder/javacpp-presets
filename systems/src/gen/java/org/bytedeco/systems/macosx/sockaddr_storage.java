// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * [XSI] sockaddr_storage
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sockaddr_storage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sockaddr_storage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sockaddr_storage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sockaddr_storage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sockaddr_storage position(long position) {
        return (sockaddr_storage)super.position(position);
    }

	public native @Cast("__uint8_t") byte ss_len(); public native sockaddr_storage ss_len(byte setter);		/* address length */
	public native @Cast("sa_family_t") byte ss_family(); public native sockaddr_storage ss_family(byte setter);	/* [XSI] address family */
	public native @Cast("char") byte __ss_pad1(int i); public native sockaddr_storage __ss_pad1(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer __ss_pad1();
	public native @Cast("__int64_t") long __ss_align(); public native sockaddr_storage __ss_align(long setter);	/* force structure storage alignment */
	public native @Cast("char") byte __ss_pad2(int i); public native sockaddr_storage __ss_pad2(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer __ss_pad2();
}
