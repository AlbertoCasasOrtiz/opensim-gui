/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVector extends RowVectorBaseDouble {
  private transient long swigCPtr;

  public RowVector(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_RowVector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVector() {
    this(opensimSimbodyJNI.new_RowVector__SWIG_0(), true);
  }

  public RowVector(RowVector src) {
    this(opensimSimbodyJNI.new_RowVector__SWIG_1(RowVector.getCPtr(src), src), true);
  }

  public RowVector(int n) {
    this(opensimSimbodyJNI.new_RowVector__SWIG_2(n), true);
  }

  public RowVector(int n, SWIGTYPE_p_double cppInitialValues) {
    this(opensimSimbodyJNI.new_RowVector__SWIG_3(n, SWIGTYPE_p_double.getCPtr(cppInitialValues)), true);
  }

  public RowVector(int n, double initialValue) {
    this(opensimSimbodyJNI.new_RowVector__SWIG_4(n, initialValue), true);
  }

  public RowVector(StdVectorDouble row) {
    this(opensimSimbodyJNI.new_RowVector__SWIG_5(StdVectorDouble.getCPtr(row), row), true);
  }

  public Vector transpose() {
    return new Vector(opensimSimbodyJNI.RowVector_transpose(swigCPtr, this), true);
  }

}
