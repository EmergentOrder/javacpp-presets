// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// ===================================================================

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FunctionProto position(long position) {
        return (FunctionProto)super.position(position);
    }

  public FunctionProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FunctionProto(@Const @ByRef FunctionProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FunctionProto from);

  public native @ByRef @Name("operator =") FunctionProto put(@Const @ByRef FunctionProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef FunctionProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FunctionProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(FunctionProto other);
  

  // implements Message ----------------------------------------------

  public native FunctionProto New();

  public native FunctionProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef FunctionProto from);
  public native void MergeFrom(@Const @ByRef FunctionProto from);
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

  // repeated string input = 4;
  public native int input_size();
  public native void clear_input();
  @MemberGetter public static native int kInputFieldNumber();
  public static final int kInputFieldNumber = kInputFieldNumber();
  public native @StdString BytePointer input(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_input(int index);
  public native void set_input(int index, @StdString BytePointer value);
  public native void set_input(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_input(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_input(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_input();
  public native void add_input(@StdString BytePointer value);
  public native void add_input(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_input(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_input(String value, @Cast("size_t") long size);

  // repeated string output = 5;
  public native int output_size();
  public native void clear_output();
  @MemberGetter public static native int kOutputFieldNumber();
  public static final int kOutputFieldNumber = kOutputFieldNumber();
  public native @StdString BytePointer output(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_output(int index);
  public native void set_output(int index, @StdString BytePointer value);
  public native void set_output(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_output(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_output(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_output();
  public native void add_output(@StdString BytePointer value);
  public native void add_output(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_output(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_output(String value, @Cast("size_t") long size);

  // repeated string attribute = 6;
  public native int attribute_size();
  public native void clear_attribute();
  @MemberGetter public static native int kAttributeFieldNumber();
  public static final int kAttributeFieldNumber = kAttributeFieldNumber();
  public native @StdString BytePointer attribute(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_attribute(int index);
  public native void set_attribute(int index, @StdString BytePointer value);
  public native void set_attribute(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_attribute(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_attribute(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_attribute();
  public native void add_attribute(@StdString BytePointer value);
  public native void add_attribute(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_attribute(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_attribute(String value, @Cast("size_t") long size);

  // repeated .onnx.NodeProto node = 7;
  public native int node_size();
  public native void clear_node();
  @MemberGetter public static native int kNodeFieldNumber();
  public static final int kNodeFieldNumber = kNodeFieldNumber();
  public native NodeProto mutable_node(int index);
  public native @Const @ByRef NodeProto node(int index);
  public native NodeProto add_node();

  // repeated .onnx.OperatorSetIdProto opset_import = 9;
  public native int opset_import_size();
  public native void clear_opset_import();
  @MemberGetter public static native int kOpsetImportFieldNumber();
  public static final int kOpsetImportFieldNumber = kOpsetImportFieldNumber();
  public native OperatorSetIdProto mutable_opset_import(int index);
  public native @Const @ByRef OperatorSetIdProto opset_import(int index);
  public native OperatorSetIdProto add_opset_import();

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string doc_string = 8;
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

  // optional int64 since_version = 2;
  public native @Cast("bool") boolean has_since_version();
  public native void clear_since_version();
  @MemberGetter public static native int kSinceVersionFieldNumber();
  public static final int kSinceVersionFieldNumber = kSinceVersionFieldNumber();
  public native @Cast("google::protobuf::int64") long since_version();
  public native void set_since_version(@Cast("google::protobuf::int64") long value);

  // optional .onnx.OperatorStatus status = 3;
  public native @Cast("bool") boolean has_status();
  public native void clear_status();
  @MemberGetter public static native int kStatusFieldNumber();
  public static final int kStatusFieldNumber = kStatusFieldNumber();
  public native @Cast("onnx::OperatorStatus") int status();
  public native void set_status(@Cast("onnx::OperatorStatus") int value);
}
