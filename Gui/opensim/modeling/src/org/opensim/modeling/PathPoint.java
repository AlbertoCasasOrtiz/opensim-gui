/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathPoint extends OpenSimObject {
  private long swigCPtr;

  public PathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PathPoint_getConcreteClassName(swigCPtr, this);
  }

  public PathPoint() {
    this(opensimModelJNI.new_PathPoint__SWIG_0(), true);
  }

  public PathPoint(PathPoint aPoint) {
    this(opensimModelJNI.new_PathPoint__SWIG_1(PathPoint.getCPtr(aPoint), aPoint), true);
  }

  public void copyData(PathPoint aPoint) {
    opensimModelJNI.PathPoint_copyData(swigCPtr, this, PathPoint.getCPtr(aPoint), aPoint);
  }

  public void init(PathPoint aPoint) {
    opensimModelJNI.PathPoint_init(swigCPtr, this, PathPoint.getCPtr(aPoint), aPoint);
  }

  public Vec3 getLocation() {
    return new Vec3(opensimModelJNI.PathPoint_getLocation(swigCPtr, this), false);
  }

  public double getLocationCoord(int aXYZ) {
    return opensimModelJNI.PathPoint_getLocationCoord(swigCPtr, this, aXYZ);
  }

  public void setLocationCoord(int aXYZ, double aValue) {
    opensimModelJNI.PathPoint_setLocationCoord(swigCPtr, this, aXYZ, aValue);
  }

  public void setLocation(State s, Vec3 aLocation) {
    opensimModelJNI.PathPoint_setLocation__SWIG_0(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(aLocation), aLocation);
  }

  public void setLocation(State s, int aCoordIndex, double aLocation) {
    opensimModelJNI.PathPoint_setLocation__SWIG_1(swigCPtr, this, State.getCPtr(s), s, aCoordIndex, aLocation);
  }

  public void setLocation(State s, double[] pt) {
    opensimModelJNI.PathPoint_setLocation__SWIG_2(swigCPtr, this, State.getCPtr(s), s, pt);
  }

  public void setBody(Body aBody) {
    opensimModelJNI.PathPoint_setBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public void changeBodyPreserveLocation(State s, Body aBody) {
    opensimModelJNI.PathPoint_changeBodyPreserveLocation(swigCPtr, this, State.getCPtr(s), s, Body.getCPtr(aBody), aBody);
  }

  public Body getBody() {
    return new Body(opensimModelJNI.PathPoint_getBody(swigCPtr, this), false);
  }

  public String getBodyName() {
    return opensimModelJNI.PathPoint_getBodyName(swigCPtr, this);
  }

  public GeometryPath getPath() {
    long cPtr = opensimModelJNI.PathPoint_getPath(swigCPtr, this);
    return (cPtr == 0) ? null : new GeometryPath(cPtr, false);
  }

  public void scale(State s, Vec3 aScaleFactors) {
    opensimModelJNI.PathPoint_scale(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimModelJNI.PathPoint_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public boolean isActive(State s) {
    return opensimModelJNI.PathPoint_isActive(swigCPtr, this, State.getCPtr(s), s);
  }

  public void connectToModelAndPath(Model aModel, GeometryPath aPath) {
    opensimModelJNI.PathPoint_connectToModelAndPath(swigCPtr, this, Model.getCPtr(aModel), aModel, GeometryPath.getCPtr(aPath), aPath);
  }

  public void update(State s) {
    opensimModelJNI.PathPoint_update(swigCPtr, this, State.getCPtr(s), s);
  }

  public void getVelocity(State s, Vec3 aVelocity) {
    opensimModelJNI.PathPoint_getVelocity(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(aVelocity), aVelocity);
  }

  public VisibleObject getDisplayer() {
    long cPtr = opensimModelJNI.PathPoint_getDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public VisibleObject updDisplayer() {
    long cPtr = opensimModelJNI.PathPoint_updDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public void updateGeometry() {
    opensimModelJNI.PathPoint_updateGeometry(swigCPtr, this);
  }

  public static PathPoint makePathPointOfType(PathPoint aPoint, String aNewTypeName) {
    long cPtr = opensimModelJNI.PathPoint_makePathPointOfType(PathPoint.getCPtr(aPoint), aPoint, aNewTypeName);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public static void deletePathPoint(PathPoint aPoint) {
    opensimModelJNI.PathPoint_deletePathPoint(PathPoint.getCPtr(aPoint), aPoint);
  }

}
