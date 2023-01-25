/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class opensimMoco {
  public static String GetMocoVersionAndDate() {
    return opensimMocoJNI.GetMocoVersionAndDate();
  }

  public static String GetMocoVersion() {
    return opensimMocoJNI.GetMocoVersion();
  }

  /**
   *  Given a MocoTrajectory and the associated OpenSim model, return the model<br>
   *  with a prescribed controller appended that will compute the control values<br>
   *  from the MocoTrajectory. This can be useful when computing state-dependent<br>
   *  model quantities that require realization to the Dynamics stage or later.<br>
   *  The function used to fit the controls can either be GCVSpline or<br>
   *  PiecewiseLinearFunction.<br>
   *  
   */
  public static void prescribeControlsToModel(MocoTrajectory trajectory, Model model, String functionType) {
    opensimMocoJNI.prescribeControlsToModel__SWIG_0(MocoTrajectory.getCPtr(trajectory), trajectory, Model.getCPtr(model), model, functionType);
  }

  /**
   *  Given a MocoTrajectory and the associated OpenSim model, return the model<br>
   *  with a prescribed controller appended that will compute the control values<br>
   *  from the MocoTrajectory. This can be useful when computing state-dependent<br>
   *  model quantities that require realization to the Dynamics stage or later.<br>
   *  The function used to fit the controls can either be GCVSpline or<br>
   *  PiecewiseLinearFunction.<br>
   *  
   */
  public static void prescribeControlsToModel(MocoTrajectory trajectory, Model model) {
    opensimMocoJNI.prescribeControlsToModel__SWIG_1(MocoTrajectory.getCPtr(trajectory), trajectory, Model.getCPtr(model), model);
  }

  /**
   *  Use the controls and initial state in the provided trajectory to simulate<br>
   *  the model using an ODE time stepping integrator (OpenSim::Manager), and<br>
   *  return the resulting states and controls. We return a MocoTrajectory (rather<br>
   *  than a StatesTrajectory) to facilitate comparing optimal control solutions<br>
   *  with time stepping. Use integratorAccuracy to override the default setting.<br>
   * <br>
   *  Note: This function expects all Actuator%s in the model to be in the Model's<br>
   *  ForceSet.<br>
   *  
   */
  public static MocoTrajectory simulateTrajectoryWithTimeStepping(MocoTrajectory trajectory, Model model, double integratorAccuracy) {
    return new MocoTrajectory(opensimMocoJNI.simulateTrajectoryWithTimeStepping__SWIG_0(MocoTrajectory.getCPtr(trajectory), trajectory, Model.getCPtr(model), model, integratorAccuracy), true);
  }

  /**
   *  Use the controls and initial state in the provided trajectory to simulate<br>
   *  the model using an ODE time stepping integrator (OpenSim::Manager), and<br>
   *  return the resulting states and controls. We return a MocoTrajectory (rather<br>
   *  than a StatesTrajectory) to facilitate comparing optimal control solutions<br>
   *  with time stepping. Use integratorAccuracy to override the default setting.<br>
   * <br>
   *  Note: This function expects all Actuator%s in the model to be in the Model's<br>
   *  ForceSet.<br>
   *  
   */
  public static MocoTrajectory simulateTrajectoryWithTimeStepping(MocoTrajectory trajectory, Model model) {
    return new MocoTrajectory(opensimMocoJNI.simulateTrajectoryWithTimeStepping__SWIG_1(MocoTrajectory.getCPtr(trajectory), trajectory, Model.getCPtr(model), model), true);
  }

  /**
   *  Convert a trajectory covering half the period of a symmetric motion into a<br>
   *  trajectory over the full period. This is useful for simulations of half a<br>
   *  gait cycle.<br>
   *  This converts time, states, controls, and derivatives; all other quantities<br>
   *  from the input trajectory are ignored.<br>
   *  If a column in the trajectory does not match addPatterns, negatePatterns,<br>
   *  negateAndShiftPatterns, or symmetryPatterns, then the second half of the<br>
   *  period contains the same data as the first half.<br>
   * <br>
   *  @param halfPeriodTrajectory The input trajectory covering half a period.<br>
   *  @param addPatterns If a column label matches an addPattern, then the second<br>
   *  half of the period for that column is (first_half_trajectory +<br>
   *  half_period_value - initial_value).<br>
   *  @param negatePatterns If a column label matches a negatePattern, then the<br>
   *  second half of the period for that column is (-first_half_trajectory).<br>
   *  This is usually relevant for only 3D models.<br>
   *  @param negateAndShiftPatterns If a column label matches a<br>
   *  negateAndShiftPattern, then the second half of the period for that column is<br>
   *  (-first_half_trajectory + 2 * half_period_value). This is usually relevant<br>
   *  for only 3D models.<br>
   *  @param symmetryPatterns This argument is a list of pairs, where the first<br>
   *  element of the pair is a pattern to match, and the second is a substitution<br>
   *  to convert the column label into the opposite column label of the symmetric<br>
   *  pair. If a column label matches a symmetryPattern, then its first<br>
   *  half-period is copied into the second half of the period for the column<br>
   *  identified by the substitution.<br>
   * <br>
   *  The default values for the patterns are intended to handle the column labels<br>
   *  for typical 2D or 3D OpenSim gait models.<br>
   *  The default values for negatePatterns, negateAndShiftPatterns, and<br>
   *  symmetryPatterns warrant an explanation. The string pattern before the<br>
   *  regex "(?!/value)" is followed by<br>
   *  anything except "/value" since it is contained in the negative lookahead<br>
   *  "(?!...)".  R"()" is a string literal that permits us to not escape<br>
   *  backslash characters. The regex "_r(\/|_|$)" matches "_r" followed by either<br>
   *  a forward slash (which is escaped), an underscore, OR the end of the string<br>
   *  ($). Since the forward slash and end of the string are within parentheses,<br>
   *  whatever matches this is captured and is available in the substitution (the<br>
   *  second element of the pair) as $1. The default symmetry patterns cause the<br>
   *  following replacements:<br>
   *  - "/jointset/hip_r/hip_flexion_r/value" becomes "/jointset/hip_l/hip_flexion_l/value"<br>
   *  - "/forceset/soleus_r" becomes "/forceset/soleus_l"<br>
   *  
   */
  public static MocoTrajectory createPeriodicTrajectory(MocoTrajectory halfPeriodTrajectory, StdVectorString addPatterns, StdVectorString negatePatterns, StdVectorString negateAndShiftPatterns, SWIGTYPE_p_std__vectorT_std__pairT_std__string_std__string_t_t symmetryPatterns) {
    return new MocoTrajectory(opensimMocoJNI.createPeriodicTrajectory__SWIG_0(MocoTrajectory.getCPtr(halfPeriodTrajectory), halfPeriodTrajectory, StdVectorString.getCPtr(addPatterns), addPatterns, StdVectorString.getCPtr(negatePatterns), negatePatterns, StdVectorString.getCPtr(negateAndShiftPatterns), negateAndShiftPatterns, SWIGTYPE_p_std__vectorT_std__pairT_std__string_std__string_t_t.getCPtr(symmetryPatterns)), true);
  }

  /**
   *  Convert a trajectory covering half the period of a symmetric motion into a<br>
   *  trajectory over the full period. This is useful for simulations of half a<br>
   *  gait cycle.<br>
   *  This converts time, states, controls, and derivatives; all other quantities<br>
   *  from the input trajectory are ignored.<br>
   *  If a column in the trajectory does not match addPatterns, negatePatterns,<br>
   *  negateAndShiftPatterns, or symmetryPatterns, then the second half of the<br>
   *  period contains the same data as the first half.<br>
   * <br>
   *  @param halfPeriodTrajectory The input trajectory covering half a period.<br>
   *  @param addPatterns If a column label matches an addPattern, then the second<br>
   *  half of the period for that column is (first_half_trajectory +<br>
   *  half_period_value - initial_value).<br>
   *  @param negatePatterns If a column label matches a negatePattern, then the<br>
   *  second half of the period for that column is (-first_half_trajectory).<br>
   *  This is usually relevant for only 3D models.<br>
   *  @param negateAndShiftPatterns If a column label matches a<br>
   *  negateAndShiftPattern, then the second half of the period for that column is<br>
   *  (-first_half_trajectory + 2 * half_period_value). This is usually relevant<br>
   *  for only 3D models.<br>
   *  <br>
   * <br>
   *  The default values for the patterns are intended to handle the column labels<br>
   *  for typical 2D or 3D OpenSim gait models.<br>
   *  The default values for negatePatterns, negateAndShiftPatterns, and<br>
   *  symmetryPatterns warrant an explanation. The string pattern before the<br>
   *  regex "(?!/value)" is followed by<br>
   *  anything except "/value" since it is contained in the negative lookahead<br>
   *  "(?!...)".  R"()" is a string literal that permits us to not escape<br>
   *  backslash characters. The regex "_r(\/|_|$)" matches "_r" followed by either<br>
   *  a forward slash (which is escaped), an underscore, OR the end of the string<br>
   *  ($). Since the forward slash and end of the string are within parentheses,<br>
   *  whatever matches this is captured and is available in the substitution (the<br>
   *  second element of the pair) as $1. The default symmetry patterns cause the<br>
   *  following replacements:<br>
   *  - "/jointset/hip_r/hip_flexion_r/value" becomes "/jointset/hip_l/hip_flexion_l/value"<br>
   *  - "/forceset/soleus_r" becomes "/forceset/soleus_l"<br>
   *  
   */
  public static MocoTrajectory createPeriodicTrajectory(MocoTrajectory halfPeriodTrajectory, StdVectorString addPatterns, StdVectorString negatePatterns, StdVectorString negateAndShiftPatterns) {
    return new MocoTrajectory(opensimMocoJNI.createPeriodicTrajectory__SWIG_1(MocoTrajectory.getCPtr(halfPeriodTrajectory), halfPeriodTrajectory, StdVectorString.getCPtr(addPatterns), addPatterns, StdVectorString.getCPtr(negatePatterns), negatePatterns, StdVectorString.getCPtr(negateAndShiftPatterns), negateAndShiftPatterns), true);
  }

  /**
   *  Convert a trajectory covering half the period of a symmetric motion into a<br>
   *  trajectory over the full period. This is useful for simulations of half a<br>
   *  gait cycle.<br>
   *  This converts time, states, controls, and derivatives; all other quantities<br>
   *  from the input trajectory are ignored.<br>
   *  If a column in the trajectory does not match addPatterns, negatePatterns,<br>
   *  negateAndShiftPatterns, or symmetryPatterns, then the second half of the<br>
   *  period contains the same data as the first half.<br>
   * <br>
   *  @param halfPeriodTrajectory The input trajectory covering half a period.<br>
   *  @param addPatterns If a column label matches an addPattern, then the second<br>
   *  half of the period for that column is (first_half_trajectory +<br>
   *  half_period_value - initial_value).<br>
   *  @param negatePatterns If a column label matches a negatePattern, then the<br>
   *  second half of the period for that column is (-first_half_trajectory).<br>
   *  This is usually relevant for only 3D models.<br>
   *  <br>
   * <br>
   *  The default values for the patterns are intended to handle the column labels<br>
   *  for typical 2D or 3D OpenSim gait models.<br>
   *  The default values for negatePatterns, negateAndShiftPatterns, and<br>
   *  symmetryPatterns warrant an explanation. The string pattern before the<br>
   *  regex "(?!/value)" is followed by<br>
   *  anything except "/value" since it is contained in the negative lookahead<br>
   *  "(?!...)".  R"()" is a string literal that permits us to not escape<br>
   *  backslash characters. The regex "_r(\/|_|$)" matches "_r" followed by either<br>
   *  a forward slash (which is escaped), an underscore, OR the end of the string<br>
   *  ($). Since the forward slash and end of the string are within parentheses,<br>
   *  whatever matches this is captured and is available in the substitution (the<br>
   *  second element of the pair) as $1. The default symmetry patterns cause the<br>
   *  following replacements:<br>
   *  - "/jointset/hip_r/hip_flexion_r/value" becomes "/jointset/hip_l/hip_flexion_l/value"<br>
   *  - "/forceset/soleus_r" becomes "/forceset/soleus_l"<br>
   *  
   */
  public static MocoTrajectory createPeriodicTrajectory(MocoTrajectory halfPeriodTrajectory, StdVectorString addPatterns, StdVectorString negatePatterns) {
    return new MocoTrajectory(opensimMocoJNI.createPeriodicTrajectory__SWIG_2(MocoTrajectory.getCPtr(halfPeriodTrajectory), halfPeriodTrajectory, StdVectorString.getCPtr(addPatterns), addPatterns, StdVectorString.getCPtr(negatePatterns), negatePatterns), true);
  }

  /**
   *  Convert a trajectory covering half the period of a symmetric motion into a<br>
   *  trajectory over the full period. This is useful for simulations of half a<br>
   *  gait cycle.<br>
   *  This converts time, states, controls, and derivatives; all other quantities<br>
   *  from the input trajectory are ignored.<br>
   *  If a column in the trajectory does not match addPatterns, negatePatterns,<br>
   *  negateAndShiftPatterns, or symmetryPatterns, then the second half of the<br>
   *  period contains the same data as the first half.<br>
   * <br>
   *  @param halfPeriodTrajectory The input trajectory covering half a period.<br>
   *  @param addPatterns If a column label matches an addPattern, then the second<br>
   *  half of the period for that column is (first_half_trajectory +<br>
   *  half_period_value - initial_value).<br>
   *  <br>
   * <br>
   *  The default values for the patterns are intended to handle the column labels<br>
   *  for typical 2D or 3D OpenSim gait models.<br>
   *  The default values for negatePatterns, negateAndShiftPatterns, and<br>
   *  symmetryPatterns warrant an explanation. The string pattern before the<br>
   *  regex "(?!/value)" is followed by<br>
   *  anything except "/value" since it is contained in the negative lookahead<br>
   *  "(?!...)".  R"()" is a string literal that permits us to not escape<br>
   *  backslash characters. The regex "_r(\/|_|$)" matches "_r" followed by either<br>
   *  a forward slash (which is escaped), an underscore, OR the end of the string<br>
   *  ($). Since the forward slash and end of the string are within parentheses,<br>
   *  whatever matches this is captured and is available in the substitution (the<br>
   *  second element of the pair) as $1. The default symmetry patterns cause the<br>
   *  following replacements:<br>
   *  - "/jointset/hip_r/hip_flexion_r/value" becomes "/jointset/hip_l/hip_flexion_l/value"<br>
   *  - "/forceset/soleus_r" becomes "/forceset/soleus_l"<br>
   *  
   */
  public static MocoTrajectory createPeriodicTrajectory(MocoTrajectory halfPeriodTrajectory, StdVectorString addPatterns) {
    return new MocoTrajectory(opensimMocoJNI.createPeriodicTrajectory__SWIG_3(MocoTrajectory.getCPtr(halfPeriodTrajectory), halfPeriodTrajectory, StdVectorString.getCPtr(addPatterns), addPatterns), true);
  }

  /**
   *  Convert a trajectory covering half the period of a symmetric motion into a<br>
   *  trajectory over the full period. This is useful for simulations of half a<br>
   *  gait cycle.<br>
   *  This converts time, states, controls, and derivatives; all other quantities<br>
   *  from the input trajectory are ignored.<br>
   *  If a column in the trajectory does not match addPatterns, negatePatterns,<br>
   *  negateAndShiftPatterns, or symmetryPatterns, then the second half of the<br>
   *  period contains the same data as the first half.<br>
   * <br>
   *  @param halfPeriodTrajectory The input trajectory covering half a period.<br>
   *  <br>
   * <br>
   *  The default values for the patterns are intended to handle the column labels<br>
   *  for typical 2D or 3D OpenSim gait models.<br>
   *  The default values for negatePatterns, negateAndShiftPatterns, and<br>
   *  symmetryPatterns warrant an explanation. The string pattern before the<br>
   *  regex "(?!/value)" is followed by<br>
   *  anything except "/value" since it is contained in the negative lookahead<br>
   *  "(?!...)".  R"()" is a string literal that permits us to not escape<br>
   *  backslash characters. The regex "_r(\/|_|$)" matches "_r" followed by either<br>
   *  a forward slash (which is escaped), an underscore, OR the end of the string<br>
   *  ($). Since the forward slash and end of the string are within parentheses,<br>
   *  whatever matches this is captured and is available in the substitution (the<br>
   *  second element of the pair) as $1. The default symmetry patterns cause the<br>
   *  following replacements:<br>
   *  - "/jointset/hip_r/hip_flexion_r/value" becomes "/jointset/hip_l/hip_flexion_l/value"<br>
   *  - "/forceset/soleus_r" becomes "/forceset/soleus_l"<br>
   *  
   */
  public static MocoTrajectory createPeriodicTrajectory(MocoTrajectory halfPeriodTrajectory) {
    return new MocoTrajectory(opensimMocoJNI.createPeriodicTrajectory__SWIG_4(MocoTrajectory.getCPtr(halfPeriodTrajectory), halfPeriodTrajectory), true);
  }

  /**
   *  This obtains the value of the OPENSIM_MOCO_PARALLEL environment variable.<br>
   *  The value has the following meanings:<br>
   *  - 0: run in series (not parallel).<br>
   *  - 1: run in parallel using all cores.<br>
   *  - greater than 1: run in parallel with this number of parallel jobs.<br>
   *  If the environment variable is not set, this function returns -1.<br>
   * <br>
   *  This variable does not indicate which calculations are parallelized<br>
   *  or how the parallelization is achieved. Moco may even ignore or override<br>
   *  the setting from the environment variable. See documentation elsewhere<br>
   *  (e.g., from a specific MocoSolver) for more information.<br>
   *  
   */
  public static int getMocoParallelEnvironmentVariable() {
    return opensimMocoJNI.getMocoParallelEnvironmentVariable();
  }

  /**
   *  Obtain the ground reaction forces, centers of pressure, and torques<br>
   *  resulting from Force elements (e.g., SmoothSphereHalfSpaceForce), using a<br>
   *  model and states trajectory. Forces and torques are expressed in the ground<br>
   *  frame with respect to the ground origin. Paths to Force elements should be<br>
   *  provided separately for elements of the right and left feet. The output is a<br>
   *  table formatted for use with OpenSim tools; the labels of the columns<br>
   *  distinguish between right ("<>_r") and left ("<>_l") forces, centers of<br>
   *  pressure, and torques. Centers of pressure are computed assuming the<br>
   *  that the contact plane's normal is in the y-direction, which is the OpenSim<br>
   *  convention.<br>
   * <br>
   *  The forces and torques are computed from the first six outputs of<br>
   *  getRecordValues(), while the centers of pressure are computed from the second<br>
   *  six outputs. The first six outputs should correspond to the contact force<br>
   *  components applied to the foot bodies (e.g., the "sphere" forces in<br>
   *  SmoothSphereHalfSpaceForce), and the second six outputs should correspond to<br>
   *  the contact force components applied to the contact place (e.g., the<br>
   *  "half-space" forces in SmoothSphereHalfSpaceForce). The contact plane is<br>
   *  often attached to ground for foot-ground contact models, but it need not be,<br>
   *  as long as the contact plane normal is in the y-direction.<br>
   * <br>
   *  In general, this utility needs getRecordValues() to report the<br>
   *  following force and torque information at the specified indices:<br>
   * <br>
   *  index - component (body)<br>
   *  ------------------------<br>
   *      0 - force-x (foot)<br>
   *      1 - force-y (foot)<br>
   *      2 - force-z (foot)<br>
   *      3 - torque-x (foot)<br>
   *      4 - torque-y (foot)<br>
   *      5 - torque-z (foot)<br>
   *      6 - force-x (contact plane)<br>
   *      7 - force-y (contact plane)<br>
   *      8 - force-z (contact plane)<br>
   *      9 - torque-x (contact plane)<br>
   *     10 - torque-y (contact plane)<br>
   *     11 - torque-z (contact plane)<br>
   * <br>
   *  
   */
  public static TimeSeriesTable createExternalLoadsTableForGait(Model model, StatesTrajectory trajectory, StdVectorString forcePathsRightFoot, StdVectorString forcePathsLeftFoot) {
    return new TimeSeriesTable(opensimMocoJNI.createExternalLoadsTableForGait__SWIG_0(Model.getCPtr(model), model, StatesTrajectory.getCPtr(trajectory), trajectory, StdVectorString.getCPtr(forcePathsRightFoot), forcePathsRightFoot, StdVectorString.getCPtr(forcePathsLeftFoot), forcePathsLeftFoot), true);
  }

  /**
   *  Same as above, but with a MocoTrajectory instead of a StatesTrajectory.<br>
   *  
   */
  public static TimeSeriesTable createExternalLoadsTableForGait(Model model, MocoTrajectory trajectory, StdVectorString forcePathsRightFoot, StdVectorString forcePathsLeftFoot) {
    return new TimeSeriesTable(opensimMocoJNI.createExternalLoadsTableForGait__SWIG_1(Model.getCPtr(model), model, MocoTrajectory.getCPtr(trajectory), trajectory, StdVectorString.getCPtr(forcePathsRightFoot), forcePathsRightFoot, StdVectorString.getCPtr(forcePathsLeftFoot), forcePathsLeftFoot), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  provided StatesTrajectory and controls table.<br>
   *  The controls table is used to set the model's controls vector.<br>
   *  We assume the StatesTrajectory and controls table contain the same time<br>
   *  points.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   * <br>
   *  The output paths must correspond to outputs that match the type provided in<br>
   *  the template argument, otherwise they are not included in the report.<br>
   * <br>
   *  Note: The provided trajectory is not modified to satisfy kinematic<br>
   *  constraints, but SimTK::Motions in the Model (e.g., PositionMotion) are<br>
   *  applied. Therefore, this function expects that you've provided a trajectory<br>
   *  that already satisfies kinematic constraints. If your provided trajectory<br>
   *  does not satisfy kinematic constraints, many outputs will be incorrect.<br>
   *  For example, in a model with a patella whose location is determined by a<br>
   *  CoordinateCouplerConstraint, the length of a muscle that crosses the patella<br>
   *  will be incorrect.<br>
   * <br>
   *  Note: Parameters and Lagrange multipliers in the MocoTrajectory are **not**<br>
   *        applied to the model.<br>
   *  
   */
  public static TimeSeriesTable analyzeMocoTrajectory(Model model, MocoTrajectory trajectory, StdVectorString outputPaths) {
    return new TimeSeriesTable(opensimMocoJNI.analyzeMocoTrajectory(Model.getCPtr(model), model, MocoTrajectory.getCPtr(trajectory), trajectory, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  provided StatesTrajectory and controls table.<br>
   *  The controls table is used to set the model's controls vector.<br>
   *  We assume the StatesTrajectory and controls table contain the same time<br>
   *  points.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   * <br>
   *  The output paths must correspond to outputs that match the type provided in<br>
   *  the template argument, otherwise they are not included in the report.<br>
   * <br>
   *  Note: The provided trajectory is not modified to satisfy kinematic<br>
   *  constraints, but SimTK::Motions in the Model (e.g., PositionMotion) are<br>
   *  applied. Therefore, this function expects that you've provided a trajectory<br>
   *  that already satisfies kinematic constraints. If your provided trajectory<br>
   *  does not satisfy kinematic constraints, many outputs will be incorrect.<br>
   *  For example, in a model with a patella whose location is determined by a<br>
   *  CoordinateCouplerConstraint, the length of a muscle that crosses the patella<br>
   *  will be incorrect.<br>
   * <br>
   *  Note: Parameters and Lagrange multipliers in the MocoTrajectory are **not**<br>
   *        applied to the model.<br>
   *  
   */
  public static TimeSeriesTableVec3 analyzeMocoTrajectoryVec3(Model model, MocoTrajectory trajectory, StdVectorString outputPaths) {
    return new TimeSeriesTableVec3(opensimMocoJNI.analyzeMocoTrajectoryVec3(Model.getCPtr(model), model, MocoTrajectory.getCPtr(trajectory), trajectory, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

  /**
   *  Calculate the requested outputs using the model in the problem and the<br>
   *  provided StatesTrajectory and controls table.<br>
   *  The controls table is used to set the model's controls vector.<br>
   *  We assume the StatesTrajectory and controls table contain the same time<br>
   *  points.<br>
   *  The output paths can be regular expressions. For example,<br>
   *  ".*activation" gives the activation of all muscles.<br>
   * <br>
   *  The output paths must correspond to outputs that match the type provided in<br>
   *  the template argument, otherwise they are not included in the report.<br>
   * <br>
   *  Note: The provided trajectory is not modified to satisfy kinematic<br>
   *  constraints, but SimTK::Motions in the Model (e.g., PositionMotion) are<br>
   *  applied. Therefore, this function expects that you've provided a trajectory<br>
   *  that already satisfies kinematic constraints. If your provided trajectory<br>
   *  does not satisfy kinematic constraints, many outputs will be incorrect.<br>
   *  For example, in a model with a patella whose location is determined by a<br>
   *  CoordinateCouplerConstraint, the length of a muscle that crosses the patella<br>
   *  will be incorrect.<br>
   * <br>
   *  Note: Parameters and Lagrange multipliers in the MocoTrajectory are **not**<br>
   *        applied to the model.<br>
   *  
   */
  public static TimeSeriesTableSpatialVec analyzeMocoTrajectorySpatialVec(Model model, MocoTrajectory trajectory, StdVectorString outputPaths) {
    return new TimeSeriesTableSpatialVec(opensimMocoJNI.analyzeMocoTrajectorySpatialVec(Model.getCPtr(model), model, MocoTrajectory.getCPtr(trajectory), trajectory, StdVectorString.getCPtr(outputPaths), outputPaths), true);
  }

}
