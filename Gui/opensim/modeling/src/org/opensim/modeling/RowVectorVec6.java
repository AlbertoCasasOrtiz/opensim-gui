/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVectorVec6 extends RowVectorBaseVec6 {
  private transient long swigCPtr;

  public RowVectorVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_RowVectorVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorVec6() {
    this(opensimSimbodyJNI.new_RowVectorVec6__SWIG_0(), true);
  }

  public RowVectorVec6(RowVectorVec6 src) {
    this(opensimSimbodyJNI.new_RowVectorVec6__SWIG_1(RowVectorVec6.getCPtr(src), src), true);
  }

  public RowVectorVec6(int n) {
    this(opensimSimbodyJNI.new_RowVectorVec6__SWIG_2(n), true);
  }

  public RowVectorVec6(int n, Vec6 cppInitialValues) {
    this(opensimSimbodyJNI.new_RowVectorVec6__SWIG_3(n, Vec6.getCPtr(cppInitialValues), cppInitialValues), true);
  }

}