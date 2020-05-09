// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* AVL traverser structure */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_bst_avl_traverser extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_bst_avl_traverser() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_bst_avl_traverser(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_bst_avl_traverser(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_bst_avl_traverser position(long position) {
        return (gsl_bst_avl_traverser)super.position(position);
    }

  public native @Const gsl_bst_avl_table avl_table(); public native gsl_bst_avl_traverser avl_table(gsl_bst_avl_table setter);                         /* tree being traversed */
  public native gsl_bst_avl_node avl_node(); public native gsl_bst_avl_traverser avl_node(gsl_bst_avl_node setter);                          /* current node in tree */
  public native gsl_bst_avl_node avl_stack(int i); public native gsl_bst_avl_traverser avl_stack(int i, gsl_bst_avl_node setter);
  @MemberGetter public native @Cast("gsl_bst_avl_node**") PointerPointer avl_stack(); /* all the nodes above |avl_node| */
  public native @Cast("size_t") long avl_height(); public native gsl_bst_avl_traverser avl_height(long setter);                                          /* number of nodes in |avl_parent| */
  public native @Cast("unsigned long") long avl_generation(); public native gsl_bst_avl_traverser avl_generation(long setter);                               /* generation number */
}
