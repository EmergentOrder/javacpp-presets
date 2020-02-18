// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::detail") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ReadaheadQueue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadaheadQueue(Pointer p) { super(p); }

  public ReadaheadQueue(int readahead_queue_size) { super((Pointer)null); allocate(readahead_queue_size); }
  private native void allocate(int readahead_queue_size);

  public native @ByVal Status Append(@UniquePtr ReadaheadPromise arg0);
  public native @ByVal Status PopDone(@UniquePtr ReadaheadPromise arg0);
  public native @ByVal Status Pump(@ByVal @Cast("std::function<std::unique_ptr<arrow::detail::ReadaheadPromise>()>*") Pointer factory);
  public native @ByVal Status Shutdown();
  public native void EnsureShutdownOrDie();
}
