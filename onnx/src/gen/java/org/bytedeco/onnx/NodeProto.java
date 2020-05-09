// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class NodeProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NodeProto position(long position) {
        return (NodeProto)super.position(position);
    }

  public NodeProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NodeProto(@Const @ByRef NodeProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NodeProto from);

  public native @ByRef @Name("operator =") NodeProto put(@Const @ByRef NodeProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef NodeProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NodeProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(NodeProto other);
  

  // implements Message ----------------------------------------------

  public native NodeProto New();

  public native NodeProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef NodeProto from);
  public native void MergeFrom(@Const @ByRef NodeProto from);
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

  // repeated string input = 1;
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

  // repeated string output = 2;
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

  // repeated .onnx.AttributeProto attribute = 5;
  public native int attribute_size();
  public native void clear_attribute();
  @MemberGetter public static native int kAttributeFieldNumber();
  public static final int kAttributeFieldNumber = kAttributeFieldNumber();
  public native AttributeProto mutable_attribute(int index);
  public native @Const @ByRef AttributeProto attribute(int index);
  public native AttributeProto add_attribute();

  // optional string name = 3;
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

  // optional string op_type = 4;
  public native @Cast("bool") boolean has_op_type();
  public native void clear_op_type();
  @MemberGetter public static native int kOpTypeFieldNumber();
  public static final int kOpTypeFieldNumber = kOpTypeFieldNumber();
  public native @StdString BytePointer op_type();
  public native void set_op_type(@StdString BytePointer value);
  public native void set_op_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_op_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_op_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_op_type();
  public native void set_allocated_op_type(@StdString @Cast({"char*", "std::string*"}) BytePointer op_type);

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

  // optional string domain = 7;
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
}
