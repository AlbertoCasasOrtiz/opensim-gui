/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DelimFileAdapter extends FileAdapter {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected DelimFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.DelimFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DelimFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelJNI.delete_DelimFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DelimFileAdapter(DelimFileAdapter arg0) {
    this(opensimModelJNI.new_DelimFileAdapter__SWIG_0(DelimFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DelimFileAdapter(String delimitersRead, String delimterWrite) {
    this(opensimModelJNI.new_DelimFileAdapter__SWIG_2(delimitersRead, delimterWrite), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimModelJNI.DelimFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DelimFileAdapter(cPtr, true);
  }

  public TimeSeriesTable read(String filename) {
    return new TimeSeriesTable(opensimModelJNI.DelimFileAdapter_read(swigCPtr, this, filename), true);
  }

  public void write(TimeSeriesTable table, String filename) {
    opensimModelJNI.DelimFileAdapter_write(swigCPtr, this, TimeSeriesTable.getCPtr(table), table, filename);
  }

  public static String get_table() {
    return opensimModelJNI.DelimFileAdapter__table_get();
  }

}