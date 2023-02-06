/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class expressing a transformation of a child body in relation to a parent<br>
 * body along either a translation or about a rotation axis. The TransformAxis<br>
 * function specified the spatial displacement that is achieved as a function<br>
 * of the generalized coordinate(s).<br>
 * <br>
 * @author Peter Loan, Frank C. Anderson, Jeffrey A. Reinbolt, Ajay Seth,<br>
 *         Michael Sherman
 */
public class TransformAxis extends OpenSimObject {
  private transient long swigCPtr;

  public TransformAxis(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.TransformAxis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TransformAxis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_TransformAxis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setFunction(Function func) {
      func.markAdopted();
      private_setFunction(func);
  }

  public static TransformAxis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.TransformAxis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TransformAxis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.TransformAxis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.TransformAxis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.TransformAxis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TransformAxis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.TransformAxis_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  The "coordinates" property holds a list of strings representing the<br>
   *     generalized coordinate names that serve as the independent variables of<br>
   *     the transform function. *
   */
  public void copyProperty_coordinates(TransformAxis source) {
    opensimSimulationJNI.TransformAxis_copyProperty_coordinates(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public String get_coordinates(int i) {
    return opensimSimulationJNI.TransformAxis_get_coordinates(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinates(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.TransformAxis_upd_coordinates(swigCPtr, this, i), false);
  }

  public void set_coordinates(int i, String value) {
    opensimSimulationJNI.TransformAxis_set_coordinates(swigCPtr, this, i, value);
  }

  public int append_coordinates(String value) {
    return opensimSimulationJNI.TransformAxis_append_coordinates(swigCPtr, this, value);
  }

  public void constructProperty_coordinates() {
    opensimSimulationJNI.TransformAxis_constructProperty_coordinates(swigCPtr, this);
  }

  /**
   *  The "axis" property holds the axis direction of the rotation or <br>
   *     translation axis of the transform as a Vec3. *
   */
  public void copyProperty_axis(TransformAxis source) {
    opensimSimulationJNI.TransformAxis_copyProperty_axis(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public Vec3 get_axis(int i) {
    return new Vec3(opensimSimulationJNI.TransformAxis_get_axis__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_axis(int i) {
    return new Vec3(opensimSimulationJNI.TransformAxis_upd_axis__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_axis(int i, Vec3 value) {
    opensimSimulationJNI.TransformAxis_set_axis__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_axis(Vec3 value) {
    return opensimSimulationJNI.TransformAxis_append_axis(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_axis(Vec3 initValue) {
    opensimSimulationJNI.TransformAxis_constructProperty_axis(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_axis() {
    return new Vec3(opensimSimulationJNI.TransformAxis_get_axis__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_axis() {
    return new Vec3(opensimSimulationJNI.TransformAxis_upd_axis__SWIG_1(swigCPtr, this), false);
  }

  public void set_axis(Vec3 value) {
    opensimSimulationJNI.TransformAxis_set_axis__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  /**
   *  The "function" property holds the transform function of the <br>
   *     generalized coordinate(s) used to represent the amount of displacement <br>
   *     about/along the specified axis. If none is specified a Constant function<br>
   *     is applied. *
   */
  public void copyProperty_function(TransformAxis source) {
    opensimSimulationJNI.TransformAxis_copyProperty_function(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public Function get_function(int i) {
    return new Function(opensimSimulationJNI.TransformAxis_get_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_function(int i) {
    return new Function(opensimSimulationJNI.TransformAxis_upd_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_function(int i, Function value) {
    opensimSimulationJNI.TransformAxis_set_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_function(Function value) {
    return opensimSimulationJNI.TransformAxis_append_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_function(Function initValue) {
    opensimSimulationJNI.TransformAxis_constructProperty_function(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_function() {
    return new Function(opensimSimulationJNI.TransformAxis_get_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_function() {
    return new Function(opensimSimulationJNI.TransformAxis_upd_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_function(Function value) {
    opensimSimulationJNI.TransformAxis_set_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public TransformAxis() {
    this(opensimSimulationJNI.new_TransformAxis__SWIG_0(), true);
  }

  public TransformAxis(ArrayStr coordNames, Vec3 axis) {
    this(opensimSimulationJNI.new_TransformAxis__SWIG_1(ArrayStr.getCPtr(coordNames), coordNames, Vec3.getCPtr(axis), axis), true);
  }

  public TransformAxis(SWIGTYPE_p_SimTK__Xml__Element node) {
    this(opensimSimulationJNI.new_TransformAxis__SWIG_2(SWIGTYPE_p_SimTK__Xml__Element.getCPtr(node)), true);
  }

  /**
   *  %Set the names of the generalized coordinates that affect the motion<br>
   *     along the axis controlled by this %TransformAxis object.<br>
   *     @param coordNames   Names of the generalized coordinates. *
   */
  public void setCoordinateNames(ArrayStr coordNames) {
    opensimSimulationJNI.TransformAxis_setCoordinateNames(swigCPtr, this, ArrayStr.getCPtr(coordNames), coordNames);
  }

  /**
   *  Get the generalized coordinate names associated with this object.<br>
   *     The returned value is a references to the Property&lt;string&gt; that contains<br>
   *     the list of coordinate names.<br>
   *     @see get_coordinates() *
   */
  public PropertyStringList getCoordinateNames() {
    return new PropertyStringList(opensimSimulationJNI.TransformAxis_getCoordinateNames(swigCPtr, this), false);
  }

  /**
   *  Copy the coordinate names into an OpenSim::Array for convenience. *
   */
  public ArrayStr getCoordinateNamesInArray() {
    return new ArrayStr(opensimSimulationJNI.TransformAxis_getCoordinateNamesInArray(swigCPtr, this), true);
  }

  /**
   *  %Set the value of the "axis" property. *
   */
  public void setAxis(Vec3 axis) {
    opensimSimulationJNI.TransformAxis_setAxis(swigCPtr, this, Vec3.getCPtr(axis), axis);
  }

  /**
   *  Return the current value of the "axis" property. *
   */
  public Vec3 getAxis() {
    return new Vec3(opensimSimulationJNI.TransformAxis_getAxis__SWIG_0(swigCPtr, this), false);
  }

  /**
   *  Alternate signature that writes the axis value to its argument. *
   */
  public void getAxis(Vec3 axis) {
    opensimSimulationJNI.TransformAxis_getAxis__SWIG_1(swigCPtr, this, Vec3.getCPtr(axis), axis);
  }

  /**
   *  Get one component (0,1, or 2) of the axis vector. *
   */
  public double getAxis(int which) {
    return opensimSimulationJNI.TransformAxis_getAxis__SWIG_2(swigCPtr, this, which);
  }

  /**
   *  Determine whether a custom function has been specified to map between <br>
   *     the generalized coordinate and the amount of transformation along the <br>
   *     specified axis. *
   */
  public boolean hasFunction() {
    return opensimSimulationJNI.TransformAxis_hasFunction(swigCPtr, this);
  }

  /**
   *  Get the custom function that maps between the generalized coordinates <br>
   *     and the amount of displacement along the specified axis. If no function <br>
   *     has been specified, this throws an exception; check first with hasFunction()<br>
   *     if you aren't sure. *
   */
  public Function getFunction() {
    return new Function(opensimSimulationJNI.TransformAxis_getFunction(swigCPtr, this), false);
  }

  /**
   *  Get writable access to the transform function. *
   */
  public Function updFunction() {
    return new Function(opensimSimulationJNI.TransformAxis_updFunction(swigCPtr, this), false);
  }

  /**
   *  %Set the custom function that maps between the generalized coordinates <br>
   *     and the amount of displacement about/along the specified axis. This object <br>
   *     adopts ownership of the Function object, don't delete it yourself! It will<br>
   *     be deleted when this %TransformAxis object is deleted. *
   */
  private void private_setFunction(Function function) {
    opensimSimulationJNI.TransformAxis_private_setFunction__SWIG_0(swigCPtr, this, Function.getCPtr(function), function);
  }

  /**
   *  Return a reference to the Joint to which this %TransformAxis <br>
   *     applies. *
   */
  public Joint getJoint() {
    return new Joint(opensimSimulationJNI.TransformAxis_getJoint(swigCPtr, this), false);
  }

  public double getValue(State s) {
    return opensimSimulationJNI.TransformAxis_getValue(swigCPtr, this, State.getCPtr(s), s);
  }

  /**
   *  Connect the %TransformAxis to its owning Joint after the model has<br>
   *     been deserialized or copied. *
   */
  public void connectToJoint(Joint owningJoint) {
    opensimSimulationJNI.TransformAxis_connectToJoint(swigCPtr, this, Joint.getCPtr(owningJoint), owningJoint);
  }

}
