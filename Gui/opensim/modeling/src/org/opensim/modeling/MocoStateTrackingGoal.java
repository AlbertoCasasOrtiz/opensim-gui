/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  The squared difference between a state variable value and a reference<br>
 * state variable value, summed over the state variables for which a<br>
 * reference is provided, and integrated over the phase. This can be used to<br>
 * track joint angles, activations, etc.<br>
 * The reference can be provided as a file name to a STO or CSV file (or<br>
 * other file types for which there is a FileAdapter), or programmatically<br>
 * as a TimeSeriesTable. If columns for rotational coordinates are in degrees,<br>
 * those columns will be converted to radians.<br>
 * Tracking problems in direct collocation perform best when tracking smooth<br>
 * data, so it is recommended to filter the data in the reference you provide<br>
 * to the cost.<br>
 * <br>
 * ### Scale factors<br>
 * <br>
 * Use `addScaleFactor()` to add a MocoParameter to the MocoProblem that will<br>
 * scale the tracking reference data associated with a state in the tracking cost.<br>
 * Scale factors for this goal can be useful if the magnitude of the tracking<br>
 * reference data is either unknown or unreliable (e.g., pelvis height).<br>
 * Scale factors are applied to the tracking error calculations based on the<br>
 * following equation:<br>
 * <br>
 *     error = modelValue - scaleFactor * referenceValue<br>
 * <br>
 * In other words, scale factors are applied when computing the tracking error for<br>
 * each state, not to the reference data directly.<br>
 * <br>
 * Adding a scale factor to a MocoStateTrackingGoal.<br>
 * {@code 
auto* stateTrackingGoal = problem.addGoal<MocoStateTrackingGoal>();
...
stateTrackingGoal->addScaleFactor(
        'pelvis_ty_scale_factor', '/jointset/ground_pelvis/pelvis_ty/value',
        {0.5, 2.0});
}<br>
 * <br>
 * 
 */
public class MocoStateTrackingGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoStateTrackingGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoStateTrackingGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoStateTrackingGoal obj) {
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
        opensimMocoJNI.delete_MocoStateTrackingGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public void addScaleFactor(String name, String state, double[] b)
            throws Exception {
            addScaleFactor(name, state, MocoPhase.convertArrayToMB(b));
    }

  public static MocoStateTrackingGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoStateTrackingGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoStateTrackingGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoStateTrackingGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoStateTrackingGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoStateTrackingGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoStateTrackingGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoStateTrackingGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoStateTrackingGoal() {
    this(opensimMocoJNI.new_MocoStateTrackingGoal__SWIG_0(), true);
  }

  public MocoStateTrackingGoal(String name) {
    this(opensimMocoJNI.new_MocoStateTrackingGoal__SWIG_1(name), true);
  }

  public MocoStateTrackingGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoStateTrackingGoal__SWIG_2(name, weight), true);
  }

  /**
   *  Provide a table containing reference values for the<br>
   *  states you want to track. Each column label must be the path of a state<br>
   *  variable, e.g., `knee/flexion/value`.<br>
   *  The table is not loaded until the MocoProblem is initialized.
   */
  public void setReference(TableProcessor ref) {
    opensimMocoJNI.MocoStateTrackingGoal_setReference(swigCPtr, this, TableProcessor.getCPtr(ref), ref);
  }

  /**
   *  If no reference has been provided, this returns an empty processor.
   */
  public TableProcessor getReference() {
    return new TableProcessor(opensimMocoJNI.MocoStateTrackingGoal_getReference(swigCPtr, this), false);
  }

  /**
   *  Set the weight for an individual state variable. If a weight is<br>
   *  already set for the requested state, then the provided weight<br>
   *  replaces the previous weight. An exception is thrown if a weight<br>
   *  for an unknown state is provided.
   */
  public void setWeightForState(String stateName, double weight) {
    opensimMocoJNI.MocoStateTrackingGoal_setWeightForState(swigCPtr, this, stateName, weight);
  }

  /**
   *  Provide a MocoWeightSet to weight the state variables in the cost.<br>
   *  Replaces the weight set if it already exists.
   */
  public void setWeightSet(MocoWeightSet weightSet) {
    opensimMocoJNI.MocoStateTrackingGoal_setWeightSet(swigCPtr, this, MocoWeightSet.getCPtr(weightSet), weightSet);
  }

  /**
   *  Only state paths matching the regular expression are tracked. The<br>
   *  regular expression must match the entire state path for a state path to<br>
   *  be tracked (that is, we use std::regex_match, not std::regex_search).<br>
   *  To track only generalized coordinates, use `.*value$`.<br>
   *  To track generalized coordinates and speeds, use `.*(value|speed)$`.<br>
   *  To track only activations, use `.*activation$`.<br>
   *  If the reference contains columns for states whose path does not match<br>
   *  this pattern, you will get an error unless you use<br>
   *  `setAllowUnusedReferences(true)`.
   */
  public void setPattern(String pattern) {
    opensimMocoJNI.MocoStateTrackingGoal_setPattern(swigCPtr, this, pattern);
  }

  /**
   *  Unset the pattern, which causes all states to be matched.
   */
  public void clearPattern() {
    opensimMocoJNI.MocoStateTrackingGoal_clearPattern(swigCPtr, this);
  }

  public String getPattern() {
    return opensimMocoJNI.MocoStateTrackingGoal_getPattern(swigCPtr, this);
  }

  /**
   *  Specify whether or not extra columns in the reference are allowed.<br>
   *  If set true, the extra references will be ignored by the cost.<br>
   *  If false, extra reference will cause an Exception to be raised.
   */
  public void setAllowUnusedReferences(boolean tf) {
    opensimMocoJNI.MocoStateTrackingGoal_setAllowUnusedReferences(swigCPtr, this, tf);
  }

  /**
   *  Use the range, or the distance between the maximum and minimum value, of <br>
   *  each reference quantity to scale the weight for the associated tracking <br>
   *  error in the cost. The scale is computed by the inverse of the range, <br>
   *  so a reference quantity that changes less across the trajectory has a <br>
   *  larger weight. Each reference has a default weight of 1, so this flag<br>
   *  works even if no user weights have be set. This may be useful when <br>
   *  tracking quantities with different units, which may have tracking errors <br>
   *  with different magnitudes.
   */
  public void setScaleWeightsWithRange(boolean tf) {
    opensimMocoJNI.MocoStateTrackingGoal_setScaleWeightsWithRange(swigCPtr, this, tf);
  }

  /**
   *  Add a MocoParameter to the problem that will scale the tracking reference<br>
   *  data associated with the specified state. Scale factors are applied<br>
   *  to the tracking error calculations based on the following equation:<br>
   * <br>
   *      error = modelValue - scaleFactor * referenceValue<br>
   * <br>
   *  In other words, the scale factor is applied when computing the tracking<br>
   *  error for each state, not to the reference data directly.
   */
  public void addScaleFactor(String name, String state, MocoBounds bounds) {
    opensimMocoJNI.MocoStateTrackingGoal_addScaleFactor(swigCPtr, this, name, state, MocoBounds.getCPtr(bounds), bounds);
  }

}
