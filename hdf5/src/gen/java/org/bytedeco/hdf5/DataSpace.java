// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class DataSpace
    \brief Class DataSpace inherits from IdComponent and provides wrappers for
     the HDF5's dataspaces.
*/
//  Inheritance: IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class DataSpace extends IdComponent {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataSpace(Pointer p) { super(p); }

        /**\brief Default DataSpace objects */
        @MemberGetter public static native @Const @ByRef DataSpace ALL();

        // Creates a dataspace object given the space type
        public DataSpace(@Cast("H5S_class_t") int type/*=H5S_SCALAR*/) { super((Pointer)null); allocate(type); }
        private native void allocate(@Cast("H5S_class_t") int type/*=H5S_SCALAR*/);
        public DataSpace() { super((Pointer)null); allocate(); }
        private native void allocate();

        // Creates a simple dataspace
        public DataSpace(int rank, @Cast("const hsize_t*") LongPointer dims, @Cast("const hsize_t*") LongPointer maxdims/*=NULL*/) { super((Pointer)null); allocate(rank, dims, maxdims); }
        private native void allocate(int rank, @Cast("const hsize_t*") LongPointer dims, @Cast("const hsize_t*") LongPointer maxdims/*=NULL*/);
        public DataSpace(int rank, @Cast("const hsize_t*") LongPointer dims) { super((Pointer)null); allocate(rank, dims); }
        private native void allocate(int rank, @Cast("const hsize_t*") LongPointer dims);
        public DataSpace(int rank, @Cast("const hsize_t*") LongBuffer dims, @Cast("const hsize_t*") LongBuffer maxdims/*=NULL*/) { super((Pointer)null); allocate(rank, dims, maxdims); }
        private native void allocate(int rank, @Cast("const hsize_t*") LongBuffer dims, @Cast("const hsize_t*") LongBuffer maxdims/*=NULL*/);
        public DataSpace(int rank, @Cast("const hsize_t*") LongBuffer dims) { super((Pointer)null); allocate(rank, dims); }
        private native void allocate(int rank, @Cast("const hsize_t*") LongBuffer dims);
        public DataSpace(int rank, @Cast("const hsize_t*") long[] dims, @Cast("const hsize_t*") long[] maxdims/*=NULL*/) { super((Pointer)null); allocate(rank, dims, maxdims); }
        private native void allocate(int rank, @Cast("const hsize_t*") long[] dims, @Cast("const hsize_t*") long[] maxdims/*=NULL*/);
        public DataSpace(int rank, @Cast("const hsize_t*") long[] dims) { super((Pointer)null); allocate(rank, dims); }
        private native void allocate(int rank, @Cast("const hsize_t*") long[] dims);

        // Creates a DataSpace object using an existing dataspace id.
        public DataSpace(@Cast("const hid_t") long space_id) { super((Pointer)null); allocate(space_id); }
        private native void allocate(@Cast("const hid_t") long space_id);

        // Copy constructor - same as the original DataSpace.
        public DataSpace(@Const @ByRef DataSpace original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef DataSpace original);

        // Assignment operator
        public native @ByRef @Name("operator =") DataSpace put(@Const @ByRef DataSpace rhs);

        // Closes this dataspace.
        public native @Name("close") void _close();

        // Makes copy of an existing dataspace.
        public native void copy(@Const @ByRef DataSpace like_space);

        // Copies the extent of this dataspace.
        public native void extentCopy(@Const @ByRef DataSpace dest_space);
        // removed from 1.8.18 and 1.10.1
        //void extentCopy(DataSpace& dest_space) const;

        // Gets the bounding box containing the current selection.
        public native void getSelectBounds(@Cast("hsize_t*") LongPointer start, @Cast("hsize_t*") LongPointer end);
        public native void getSelectBounds(@Cast("hsize_t*") LongBuffer start, @Cast("hsize_t*") LongBuffer end);
        public native void getSelectBounds(@Cast("hsize_t*") long[] start, @Cast("hsize_t*") long[] end);

        // Gets the number of element points in the current selection.
        public native @Cast("hssize_t") long getSelectElemNpoints();

        // Retrieves the list of element points currently selected.
        public native void getSelectElemPointlist(@Cast("hsize_t") long startpoint, @Cast("hsize_t") long numpoints, @Cast("hsize_t*") LongPointer buf);
        public native void getSelectElemPointlist(@Cast("hsize_t") long startpoint, @Cast("hsize_t") long numpoints, @Cast("hsize_t*") LongBuffer buf);
        public native void getSelectElemPointlist(@Cast("hsize_t") long startpoint, @Cast("hsize_t") long numpoints, @Cast("hsize_t*") long[] buf);

        // Gets the list of hyperslab blocks currently selected.
        public native void getSelectHyperBlocklist(@Cast("hsize_t") long startblock, @Cast("hsize_t") long numblocks, @Cast("hsize_t*") LongPointer buf);
        public native void getSelectHyperBlocklist(@Cast("hsize_t") long startblock, @Cast("hsize_t") long numblocks, @Cast("hsize_t*") LongBuffer buf);
        public native void getSelectHyperBlocklist(@Cast("hsize_t") long startblock, @Cast("hsize_t") long numblocks, @Cast("hsize_t*") long[] buf);

        // Get number of hyperslab blocks.
        public native @Cast("hssize_t") long getSelectHyperNblocks();

        // Gets the number of elements in this dataspace selection.
        public native @Cast("hssize_t") long getSelectNpoints();

        // Retrieves dataspace dimension size and maximum size.
        public native int getSimpleExtentDims(@Cast("hsize_t*") LongPointer dims, @Cast("hsize_t*") LongPointer maxdims/*=NULL*/);
        public native int getSimpleExtentDims(@Cast("hsize_t*") LongPointer dims);
        public native int getSimpleExtentDims(@Cast("hsize_t*") LongBuffer dims, @Cast("hsize_t*") LongBuffer maxdims/*=NULL*/);
        public native int getSimpleExtentDims(@Cast("hsize_t*") LongBuffer dims);
        public native int getSimpleExtentDims(@Cast("hsize_t*") long[] dims, @Cast("hsize_t*") long[] maxdims/*=NULL*/);
        public native int getSimpleExtentDims(@Cast("hsize_t*") long[] dims);

        // Gets the dimensionality of this dataspace.
        public native int getSimpleExtentNdims();

        // Gets the number of elements in this dataspace.
        // 12/05/00 - changed return type to hssize_t from hsize_t - C API
        public native @Cast("hssize_t") long getSimpleExtentNpoints();

        // Gets the current class of this dataspace.
        public native @Cast("H5S_class_t") int getSimpleExtentType();

        // Determines if this dataspace is a simple one.
        public native @Cast("bool") boolean isSimple();

        // Sets the offset of this simple dataspace.
        public native void offsetSimple(@Cast("const hssize_t*") LongPointer offset);
        public native void offsetSimple(@Cast("const hssize_t*") LongBuffer offset);
        public native void offsetSimple(@Cast("const hssize_t*") long[] offset);

        // Selects the entire dataspace.
        public native void selectAll();

        // Selects array elements to be included in the selection for
        // this dataspace.
        public native void selectElements(@Cast("H5S_seloper_t") int op, @Cast("const size_t") long num_elements, @Cast("const hsize_t*") LongPointer coord);
        public native void selectElements(@Cast("H5S_seloper_t") int op, @Cast("const size_t") long num_elements, @Cast("const hsize_t*") LongBuffer coord);
        public native void selectElements(@Cast("H5S_seloper_t") int op, @Cast("const size_t") long num_elements, @Cast("const hsize_t*") long[] coord);

        // Selects a hyperslab region to add to the current selected region.
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") LongPointer count, @Cast("const hsize_t*") LongPointer start, @Cast("const hsize_t*") LongPointer stride/*=NULL*/, @Cast("const hsize_t*") LongPointer block/*=NULL*/);
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") LongPointer count, @Cast("const hsize_t*") LongPointer start);
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") LongBuffer count, @Cast("const hsize_t*") LongBuffer start, @Cast("const hsize_t*") LongBuffer stride/*=NULL*/, @Cast("const hsize_t*") LongBuffer block/*=NULL*/);
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") LongBuffer count, @Cast("const hsize_t*") LongBuffer start);
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") long[] count, @Cast("const hsize_t*") long[] start, @Cast("const hsize_t*") long[] stride/*=NULL*/, @Cast("const hsize_t*") long[] block/*=NULL*/);
        public native void selectHyperslab(@Cast("H5S_seloper_t") int op, @Cast("const hsize_t*") long[] count, @Cast("const hsize_t*") long[] start);

        // Resets the selection region to include no elements.
        public native void selectNone();

        // Verifies that the selection is within the extent of the dataspace.
        public native @Cast("bool") boolean selectValid();

        // Removes the extent from this dataspace.
        public native void setExtentNone();

        // Sets or resets the size of this dataspace.
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") LongPointer current_size, @Cast("const hsize_t*") LongPointer maximum_size/*=NULL*/);
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") LongPointer current_size);
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") LongBuffer current_size, @Cast("const hsize_t*") LongBuffer maximum_size/*=NULL*/);
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") LongBuffer current_size);
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") long[] current_size, @Cast("const hsize_t*") long[] maximum_size/*=NULL*/);
        public native void setExtentSimple(int rank, @Cast("const hsize_t*") long[] current_size);

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Gets the dataspace id.
        public native @Cast("hid_t") long getId();

        // Deletes the global constant
        public static native void deleteConstants();

        // Destructor: properly terminates access to this dataspace.

}
