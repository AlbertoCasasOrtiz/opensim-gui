/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Control extends OpenSimObject {
  private long swigCPtr;

  public Control(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Control_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Control obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Control(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Control safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Control_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Control(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Control_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Control_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Control_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Control(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Control_getConcreteClassName(swigCPtr, this);
  }

  public void setIsModelControl(boolean aTrueFalse) {
    opensimModelJNI.Control_setIsModelControl(swigCPtr, this, aTrueFalse);
  }

  public boolean getIsModelControl() {
    return opensimModelJNI.Control_getIsModelControl(swigCPtr, this);
  }

  public void setExtrapolate(boolean aTrueFalse) {
    opensimModelJNI.Control_setExtrapolate(swigCPtr, this, aTrueFalse);
  }

  public boolean getExtrapolate() {
    return opensimModelJNI.Control_getExtrapolate(swigCPtr, this);
  }

  public void setFilterOn(boolean aTrueFalse) {
    opensimModelJNI.Control_setFilterOn(swigCPtr, this, aTrueFalse);
  }

  public boolean getFilterOn() {
    return opensimModelJNI.Control_getFilterOn(swigCPtr, this);
  }

  public int getNumParameters() {
    return opensimModelJNI.Control_getNumParameters(swigCPtr, this);
  }

  public void setDefaultParameterMin(double aMin) {
    opensimModelJNI.Control_setDefaultParameterMin(swigCPtr, this, aMin);
  }

  public double getDefaultParameterMin() {
    return opensimModelJNI.Control_getDefaultParameterMin(swigCPtr, this);
  }

  public void setDefaultParameterMax(double aMax) {
    opensimModelJNI.Control_setDefaultParameterMax(swigCPtr, this, aMax);
  }

  public double getDefaultParameterMax() {
    return opensimModelJNI.Control_getDefaultParameterMax(swigCPtr, this);
  }

  public void setParameterMin(int aI, double aMin) {
    opensimModelJNI.Control_setParameterMin(swigCPtr, this, aI, aMin);
  }

  public double getParameterMin(int aI) {
    return opensimModelJNI.Control_getParameterMin(swigCPtr, this, aI);
  }

  public void setParameterMax(int aI, double aMax) {
    opensimModelJNI.Control_setParameterMax(swigCPtr, this, aI, aMax);
  }

  public double getParameterMax(int aI) {
    return opensimModelJNI.Control_getParameterMax(swigCPtr, this, aI);
  }

  public double getParameterTime(int aI) {
    return opensimModelJNI.Control_getParameterTime(swigCPtr, this, aI);
  }

  public void getParameterNeighborhood(int aI, SWIGTYPE_p_double rTLower, SWIGTYPE_p_double rTUpper) {
    opensimModelJNI.Control_getParameterNeighborhood(swigCPtr, this, aI, SWIGTYPE_p_double.getCPtr(rTLower), SWIGTYPE_p_double.getCPtr(rTUpper));
  }

  public int getParameterList(double aT, ArrayInt rList) {
    return opensimModelJNI.Control_getParameterList__SWIG_0(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public int getParameterList(double aTLower, double aTUpper, ArrayInt rList) {
    return opensimModelJNI.Control_getParameterList__SWIG_1(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList);
  }

  public double getParameterValue(int aI) {
    return opensimModelJNI.Control_getParameterValue(swigCPtr, this, aI);
  }

  public void setParameterValue(int aI, double aX) {
    opensimModelJNI.Control_setParameterValue(swigCPtr, this, aI, aX);
  }

  public double getControlValue(double aT) {
    return opensimModelJNI.Control_getControlValue__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValue() {
    return opensimModelJNI.Control_getControlValue__SWIG_1(swigCPtr, this);
  }

  public void setControlValue(double aT, double aX) {
    opensimModelJNI.Control_setControlValue(swigCPtr, this, aT, aX);
  }

  public double getControlValueMin(double aT) {
    return opensimModelJNI.Control_getControlValueMin__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMin() {
    return opensimModelJNI.Control_getControlValueMin__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMin(double aT, double aMin) {
    opensimModelJNI.Control_setControlValueMin(swigCPtr, this, aT, aMin);
  }

  public double getControlValueMax(double aT) {
    return opensimModelJNI.Control_getControlValueMax__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMax() {
    return opensimModelJNI.Control_getControlValueMax__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMax(double aT, double aMax) {
    opensimModelJNI.Control_setControlValueMax(swigCPtr, this, aT, aMax);
  }

  public double getFirstTime() {
    return opensimModelJNI.Control_getFirstTime(swigCPtr, this);
  }

  public double getLastTime() {
    return opensimModelJNI.Control_getLastTime(swigCPtr, this);
  }

  public void simplify(SWIGTYPE_p_PropertySet aProperties) {
    opensimModelJNI.Control_simplify(swigCPtr, this, SWIGTYPE_p_PropertySet.getCPtr(aProperties));
  }

  public void filter(double aT) {
    opensimModelJNI.Control_filter(swigCPtr, this, aT);
  }

}
