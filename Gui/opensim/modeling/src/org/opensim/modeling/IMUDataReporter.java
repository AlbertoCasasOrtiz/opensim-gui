/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for recording the readings off an IMU object placed on a model<br>
 * during a simulation.<br>
 * <br>
 * If using this reporter to compute IMU accelerometer signals based on kinematic<br>
 * information only (i.e., a solution from the InverseKinematicsTool), then<br>
 * set the property `compute_accelerations_without_forces` to true. This property<br>
 * will apply forces to the model corresponding to the kinematics that you<br>
 * provide as input so that the correct accelerations are computed. The input<br>
 * kinematics are splined and then prescribed to the model (via the<br>
 * PositionMotion class), and the applied forces are based on derivatives of<br>
 * these splines; therefore, you should ensure that the input kinematics produce<br>
 * the correct derivatives when splined. It is recommended that you don't not<br>
 * compute any quantities near the beginning or end of the time range in your<br>
 * data, since spline derivatives can be inaccurate in these regions.<br>
 * <br>
 * @author Ayman Habib<br>
 * @version 1.0
 */
public class IMUDataReporter extends Analysis {
  private transient long swigCPtr;

  public IMUDataReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IMUDataReporter obj) {
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
        opensimActuatorsAnalysesToolsJNI.delete_IMUDataReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IMUDataReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IMUDataReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IMUDataReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IMUDataReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IMUDataReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_report_orientations(IMUDataReporter source) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_copyProperty_report_orientations(swigCPtr, this, IMUDataReporter.getCPtr(source), source);
  }

  public boolean get_report_orientations(int i) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_orientations__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_orientations(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_orientations__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_orientations(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_orientations__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_orientations(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_append_report_orientations(swigCPtr, this, value);
  }

  public void constructProperty_report_orientations(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_constructProperty_report_orientations(swigCPtr, this, initValue);
  }

  public boolean get_report_orientations() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_orientations__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_orientations() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_orientations__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_orientations(boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_orientations__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_report_gyroscope_signals(IMUDataReporter source) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_copyProperty_report_gyroscope_signals(swigCPtr, this, IMUDataReporter.getCPtr(source), source);
  }

  public boolean get_report_gyroscope_signals(int i) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_gyroscope_signals__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_gyroscope_signals(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_gyroscope_signals__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_gyroscope_signals(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_gyroscope_signals__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_gyroscope_signals(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_append_report_gyroscope_signals(swigCPtr, this, value);
  }

  public void constructProperty_report_gyroscope_signals(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_constructProperty_report_gyroscope_signals(swigCPtr, this, initValue);
  }

  public boolean get_report_gyroscope_signals() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_gyroscope_signals__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_gyroscope_signals() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_gyroscope_signals__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_gyroscope_signals(boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_gyroscope_signals__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_report_accelerometer_signals(IMUDataReporter source) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_copyProperty_report_accelerometer_signals(swigCPtr, this, IMUDataReporter.getCPtr(source), source);
  }

  public boolean get_report_accelerometer_signals(int i) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_accelerometer_signals__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_accelerometer_signals(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_accelerometer_signals__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_accelerometer_signals(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_accelerometer_signals__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_accelerometer_signals(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_append_report_accelerometer_signals(swigCPtr, this, value);
  }

  public void constructProperty_report_accelerometer_signals(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_constructProperty_report_accelerometer_signals(swigCPtr, this, initValue);
  }

  public boolean get_report_accelerometer_signals() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_report_accelerometer_signals__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_accelerometer_signals() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_report_accelerometer_signals__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_accelerometer_signals(boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_report_accelerometer_signals__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_compute_accelerations_without_forces(IMUDataReporter source) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_copyProperty_compute_accelerations_without_forces(swigCPtr, this, IMUDataReporter.getCPtr(source), source);
  }

  public boolean get_compute_accelerations_without_forces(int i) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_compute_accelerations_without_forces__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_compute_accelerations_without_forces(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_compute_accelerations_without_forces__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_compute_accelerations_without_forces(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_compute_accelerations_without_forces__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_compute_accelerations_without_forces(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_append_compute_accelerations_without_forces(swigCPtr, this, value);
  }

  public void constructProperty_compute_accelerations_without_forces(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_constructProperty_compute_accelerations_without_forces(swigCPtr, this, initValue);
  }

  public boolean get_compute_accelerations_without_forces() {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_compute_accelerations_without_forces__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_compute_accelerations_without_forces() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_compute_accelerations_without_forces__SWIG_1(swigCPtr, this), false);
  }

  public void set_compute_accelerations_without_forces(boolean value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_compute_accelerations_without_forces__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_frame_paths(IMUDataReporter source) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_copyProperty_frame_paths(swigCPtr, this, IMUDataReporter.getCPtr(source), source);
  }

  public String get_frame_paths(int i) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_get_frame_paths(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_frame_paths(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_upd_frame_paths(swigCPtr, this, i), false);
  }

  public void set_frame_paths(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_set_frame_paths(swigCPtr, this, i, value);
  }

  public int append_frame_paths(String value) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_append_frame_paths(swigCPtr, this, value);
  }

  public void constructProperty_frame_paths() {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_constructProperty_frame_paths(swigCPtr, this);
  }

  public IMUDataReporter(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_IMUDataReporter__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public IMUDataReporter() {
    this(opensimActuatorsAnalysesToolsJNI.new_IMUDataReporter__SWIG_1(), true);
  }

  public IMUDataReporter(IMUDataReporter aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_IMUDataReporter__SWIG_2(IMUDataReporter.getCPtr(aObject), aObject), true);
  }

  public void setNull() {
    opensimActuatorsAnalysesToolsJNI.IMUDataReporter_setNull(swigCPtr, this);
  }

  public TimeSeriesTableQuaternion getOrientationsTable() {
    return new TimeSeriesTableQuaternion(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_getOrientationsTable(swigCPtr, this), true);
  }

  public TimeSeriesTableVec3 getGyroscopeSignalsTable() {
    return new TimeSeriesTableVec3(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_getGyroscopeSignalsTable(swigCPtr, this), true);
  }

  public TimeSeriesTableVec3 getAccelerometerSignalsTable() {
    return new TimeSeriesTableVec3(opensimActuatorsAnalysesToolsJNI.IMUDataReporter_getAccelerometerSignalsTable(swigCPtr, this), true);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.IMUDataReporter_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}