/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MOTFileAdapter extends DelimFileAdapter {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected MOTFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MOTFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MOTFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelJNI.delete_MOTFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MOTFileAdapter() {
    this(opensimModelJNI.new_MOTFileAdapter__SWIG_0(), true);
  }

  public MOTFileAdapter(MOTFileAdapter arg0) {
    this(opensimModelJNI.new_MOTFileAdapter__SWIG_1(MOTFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimModelJNI.MOTFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MOTFileAdapter(cPtr, true);
  }

}