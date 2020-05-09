<<<<<<< HEAD
// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE
=======
// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE
>>>>>>> ff79e7e2920bed9eb75162ec98fba73b27135c3a

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


/**
 * \brief A registry to hold all the operator schemas.
 */
@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSchemaRegistry extends ISchemaRegistry {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSchemaRegistry(Pointer p) { super(p); }

  // A singleton class to store domain to min/max op_set version map.
  @NoOffset public static class DomainToVersionRange extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public DomainToVersionRange(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public DomainToVersionRange(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public DomainToVersionRange position(long position) {
          return (DomainToVersionRange)super.position(position);
      }
  
    public DomainToVersionRange() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @Const @ByRef StringIntIntPairMap Map();

    // Add customized domain to min/max version.
    // Onnx partners are able to use onnx operator schema api to
    // register customized op in their own domain.
    public native void AddDomainToVersion(
            @StdString BytePointer domain,
            int min_version,
            int max_version);
    public native void AddDomainToVersion(
            @StdString String domain,
            int min_version,
            int max_version);

    public static native @ByRef DomainToVersionRange Instance();
  }

  public static class OpSchemaRegisterOnce extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public OpSchemaRegisterOnce(Pointer p) { super(p); }
  
    public OpSchemaRegisterOnce(@ByRef OpSchema op_schema) { super((Pointer)null); allocate(op_schema); }
    private native void allocate(@ByRef OpSchema op_schema);
  }

  // Return the latest schema for an operator in specified domain.
  // Domain with default value ONNX_DOMAIN means ONNX.
  public static native @Const OpSchema Schema(
        @StdString BytePointer key,
        @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(
        @StdString BytePointer key);
  public static native @Const OpSchema Schema(
        @StdString String key,
        @StdString String domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(
        @StdString String key);

  // Return the schema with biggest version, which is not greater than specified
  // <maxInclusiveVersion> in specified domain. Domain with default value
  // ONNX_DOMAIN means ONNX.
  public static native @Const OpSchema Schema(
        @StdString BytePointer key,
        int maxInclusiveVersion,
        @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(
        @StdString BytePointer key,
        int maxInclusiveVersion);
  public static native @Const OpSchema Schema(
        @StdString String key,
        int maxInclusiveVersion,
        @StdString String domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(
        @StdString String key,
        int maxInclusiveVersion);

  public static native OpSchemaRegistry Instance();

  public native @Const OpSchema GetSchema(
        @StdString BytePointer key,
        int maxInclusiveVersion,
        @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(
        @StdString BytePointer key,
        int maxInclusiveVersion);
  public native @Const OpSchema GetSchema(
        @StdString String key,
        int maxInclusiveVersion,
        @StdString String domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(
        @StdString String key,
        int maxInclusiveVersion);
  public static native @Const @ByVal OpSchemaVector get_all_schemas_with_history();

  public static native @Const @ByVal OpSchemaVector get_all_schemas();
}
