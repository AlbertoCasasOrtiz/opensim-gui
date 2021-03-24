/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoInitialBounds extends MocoBounds {
  private transient long swigCPtr;

  public MocoInitialBounds(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoInitialBounds_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoInitialBounds obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoInitialBounds(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoInitialBounds safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoInitialBounds_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoInitialBounds(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoInitialBounds_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoInitialBounds_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoInitialBounds_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoInitialBounds(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoInitialBounds_getConcreteClassName(swigCPtr, this);
  }

  public MocoInitialBounds() {
    this(opensimMocoJNI.new_MocoInitialBounds__SWIG_0(), true);
  }

  public MocoInitialBounds(double value) {
    this(opensimMocoJNI.new_MocoInitialBounds__SWIG_1(value), true);
  }

  public MocoInitialBounds(double lower, double upper) {
    this(opensimMocoJNI.new_MocoInitialBounds__SWIG_2(lower, upper), true);
  }

}