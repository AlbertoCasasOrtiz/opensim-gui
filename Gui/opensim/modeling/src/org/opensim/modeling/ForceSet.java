/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForceSet extends ModelComponentSetForces {
  private long swigCPtr;

  public ForceSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ForceSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ForceSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

   public boolean append(Force aFroce) {
      aFroce.markAdopted();
	  return private_append(aFroce);
   }

  public static ForceSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ForceSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ForceSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ForceSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ForceSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ForceSet_getConcreteClassName(swigCPtr, this);
  }

  public ForceSet() {
    this(opensimModelJNI.new_ForceSet__SWIG_0(), true);
  }

  public ForceSet(Model model) {
    this(opensimModelJNI.new_ForceSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ForceSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ForceSet__SWIG_2(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ForceSet(Model model, String aFileName) {
    this(opensimModelJNI.new_ForceSet__SWIG_3(Model.getCPtr(model), model, aFileName), true);
  }

  public ForceSet(ForceSet aForceSet) {
    this(opensimModelJNI.new_ForceSet__SWIG_4(ForceSet.getCPtr(aForceSet), aForceSet), true);
  }

  public void invokeConnectToModel(Model aModel) {
    opensimModelJNI.ForceSet_invokeConnectToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.ForceSet_remove(swigCPtr, this, aIndex);
  }

  private boolean private_append(Force aForce) {
    return opensimModelJNI.ForceSet_private_append__SWIG_0(swigCPtr, this, Force.getCPtr(aForce), aForce);
  }

  private boolean private_append(ForceSet aForceSet, boolean aAllowDuplicateNames) {
    return opensimModelJNI.ForceSet_private_append__SWIG_1(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet, aAllowDuplicateNames);
  }

  private boolean private_append(ForceSet aForceSet) {
    return opensimModelJNI.ForceSet_private_append__SWIG_2(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet);
  }

  public boolean set(int aIndex, Force aForce) {
    return opensimModelJNI.ForceSet_set(swigCPtr, this, aIndex, Force.getCPtr(aForce), aForce);
  }

  public boolean insert(int aIndex, Force aObject) {
    return opensimModelJNI.ForceSet_insert(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public SetActuators getActuators() {
    return new SetActuators(opensimModelJNI.ForceSet_getActuators(swigCPtr, this), false);
  }

  public SetActuators updActuators() {
    return new SetActuators(opensimModelJNI.ForceSet_updActuators(swigCPtr, this), false);
  }

  public SetMuscles getMuscles() {
    return new SetMuscles(opensimModelJNI.ForceSet_getMuscles(swigCPtr, this), false);
  }

  public SetMuscles updMuscles() {
    return new SetMuscles(opensimModelJNI.ForceSet_updMuscles(swigCPtr, this), false);
  }

  public void getStateVariableNames(ArrayStr rNames) {
    opensimModelJNI.ForceSet_getStateVariableNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public boolean check() {
    return opensimModelJNI.ForceSet_check(swigCPtr, this);
  }

}
