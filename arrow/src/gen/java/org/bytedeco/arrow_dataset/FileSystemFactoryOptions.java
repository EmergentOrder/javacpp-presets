// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSystemFactoryOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FileSystemFactoryOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileSystemFactoryOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemFactoryOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FileSystemFactoryOptions position(long position) {
        return (FileSystemFactoryOptions)super.position(position);
    }

  // Either an explicit Partitioning or a PartitioningFactory to discover one.
  //
  // If a factory is provided, it will be used to infer a schema for partition fields
  // based on file and directory paths then construct a Partitioning. The default
  // is a Partitioning which will yield no partition information.
  //
  // The (explicit or discovered) partitioning will be applied to discovered files
  // and the resulting partition information embedded in the Dataset.
  public native @ByRef PartitioningOrFactory partitioning(); public native FileSystemFactoryOptions partitioning(PartitioningOrFactory setter);

  // For the purposes of applying the partitioning, paths will be stripped
  // of the partition_base_dir. Files not matching the partition_base_dir
  // prefix will be skipped for partition discovery. The ignored files will still
  // be part of the Dataset, but will not have partition information.
  //
  // Example:
  // partition_base_dir = "/dataset";
  //
  // - "/dataset/US/sales.csv" -> "US/sales.csv" will be given to the partitioning
  //
  // - "/home/john/late_sales.csv" -> Will be ignored for partition discovery.
  //
  // This is useful for partitioning which parses directory when ordering
  // is important, e.g. DirectoryPartitioning.
  public native @StdString String partition_base_dir(); public native FileSystemFactoryOptions partition_base_dir(String setter);

  // Invalid files (via selector or explicitly) will be excluded by checking
  // with the FileFormat::IsSupported method.  This will incur IO for each files
  // in a serial and single threaded fashion. Disabling this feature will skip the
  // IO, but unsupported files may be present in the Dataset
  // (resulting in an error at scan time).
  public native @Cast("bool") boolean exclude_invalid_files(); public native FileSystemFactoryOptions exclude_invalid_files(boolean setter);

  // When discovering from a Selector (and not from an explicit file list), ignore
  // files and directories matching any of these prefixes.
  //
  // Example (with selector = "/dataset/**"):
  // selector_ignore_prefixes = {"_", ".DS_STORE" };
  //
  // - "/dataset/data.csv" -> not ignored
  // - "/dataset/_metadata" -> ignored
  // - "/dataset/.DS_STORE" -> ignored
  // - "/dataset/_hidden/dat" -> ignored
  // - "/dataset/nested/.DS_STORE" -> ignored
  public native @ByRef StringVector selector_ignore_prefixes(); public native FileSystemFactoryOptions selector_ignore_prefixes(StringVector setter);
}
