// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \brief A registry for file system implementations.
 * 
 *  Filenames are specified as an URI, which is of the form
 *  [scheme://]<filename>.
 *  File system implementations are registered using the REGISTER_FILE_SYSTEM
 *  macro, providing the 'scheme' as the key. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FileSystemRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemRegistry(Pointer p) { super(p); }

  public native @ByVal Status Register(@StdString BytePointer scheme, @ByVal @Cast("tensorflow::FileSystemRegistry::Factory*") FactoryFn factory);
  public native @ByVal Status Register(@StdString String scheme, @ByVal @Cast("tensorflow::FileSystemRegistry::Factory*") FactoryFn factory);
  public native FileSystem Lookup(@StdString BytePointer scheme);
  public native FileSystem Lookup(@StdString String scheme);
  public native @ByVal Status GetRegisteredFileSystemSchemes(
        StringVector schemes);
}
