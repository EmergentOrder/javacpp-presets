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

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OperatorSetProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorSetProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorSetProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperatorSetProto position(long position) {
        return (OperatorSetProto)super.position(position);
    }

  public OperatorSetProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OperatorSetProto(@Const @ByRef OperatorSetProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OperatorSetProto from);

  public native @ByRef @Name("operator =") OperatorSetProto put(@Const @ByRef OperatorSetProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef OperatorSetProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OperatorSetProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(OperatorSetProto other);
  

  // implements Message ----------------------------------------------

  public native OperatorSetProto New();

  public native OperatorSetProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OperatorSetProto from);
  public native void MergeFrom(@Const @ByRef OperatorSetProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .onnx.OperatorProto operator = 8;
  public native int operator__size();
  public native void clear_operator_();
  @MemberGetter public static native int kOperatorFieldNumber();
  public static final int kOperatorFieldNumber = kOperatorFieldNumber();
  public native OperatorProto mutable_operator_(int index);
  public native @Const @ByRef OperatorProto operator_(int index);
  public native OperatorProto add_operator_();

  // repeated .onnx.FunctionProto functions = 9;
  public native int functions_size();
  public native void clear_functions();
  @MemberGetter public static native int kFunctionsFieldNumber();
  public static final int kFunctionsFieldNumber = kFunctionsFieldNumber();
  public native FunctionProto mutable_functions(int index);
  public native @Const @ByRef FunctionProto functions(int index);
  public native FunctionProto add_functions();

  // optional string magic = 1;
  public native @Cast("bool") boolean has_magic();
  public native void clear_magic();
  @MemberGetter public static native int kMagicFieldNumber();
  public static final int kMagicFieldNumber = kMagicFieldNumber();
  public native @StdString BytePointer magic();
  public native void set_magic(@StdString BytePointer value);
  public native void set_magic(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_magic(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_magic(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_magic();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_magic();
  public native void set_allocated_magic(@StdString @Cast({"char*", "std::string*"}) BytePointer magic);

  // optional string ir_version_prerelease = 3;
  public native @Cast("bool") boolean has_ir_version_prerelease();
  public native void clear_ir_version_prerelease();
  @MemberGetter public static native int kIrVersionPrereleaseFieldNumber();
  public static final int kIrVersionPrereleaseFieldNumber = kIrVersionPrereleaseFieldNumber();
  public native @StdString BytePointer ir_version_prerelease();
  public native void set_ir_version_prerelease(@StdString BytePointer value);
  public native void set_ir_version_prerelease(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_ir_version_prerelease(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_ir_version_prerelease(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_ir_version_prerelease();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_ir_version_prerelease();
  public native void set_allocated_ir_version_prerelease(@StdString @Cast({"char*", "std::string*"}) BytePointer ir_version_prerelease);

  // optional string domain = 4;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  @MemberGetter public static native int kDomainFieldNumber();
  public static final int kDomainFieldNumber = kDomainFieldNumber();
  public native @StdString BytePointer domain();
  public native void set_domain(@StdString BytePointer value);
  public native void set_domain(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_domain(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_domain(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);

  // optional string doc_string = 6;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  @MemberGetter public static native int kDocStringFieldNumber();
  public static final int kDocStringFieldNumber = kDocStringFieldNumber();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional string ir_build_metadata = 7;
  public native @Cast("bool") boolean has_ir_build_metadata();
  public native void clear_ir_build_metadata();
  @MemberGetter public static native int kIrBuildMetadataFieldNumber();
  public static final int kIrBuildMetadataFieldNumber = kIrBuildMetadataFieldNumber();
  public native @StdString BytePointer ir_build_metadata();
  public native void set_ir_build_metadata(@StdString BytePointer value);
  public native void set_ir_build_metadata(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_ir_build_metadata(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_ir_build_metadata(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_ir_build_metadata();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_ir_build_metadata();
  public native void set_allocated_ir_build_metadata(@StdString @Cast({"char*", "std::string*"}) BytePointer ir_build_metadata);

  // optional int64 ir_version = 2;
  public native @Cast("bool") boolean has_ir_version();
  public native void clear_ir_version();
  @MemberGetter public static native int kIrVersionFieldNumber();
  public static final int kIrVersionFieldNumber = kIrVersionFieldNumber();
  public native @Cast("google::protobuf::int64") long ir_version();
  public native void set_ir_version(@Cast("google::protobuf::int64") long value);

  // optional int64 opset_version = 5;
  public native @Cast("bool") boolean has_opset_version();
  public native void clear_opset_version();
  @MemberGetter public static native int kOpsetVersionFieldNumber();
  public static final int kOpsetVersionFieldNumber = kOpsetVersionFieldNumber();
  public native @Cast("google::protobuf::int64") long opset_version();
  public native void set_opset_version(@Cast("google::protobuf::int64") long value);
}
