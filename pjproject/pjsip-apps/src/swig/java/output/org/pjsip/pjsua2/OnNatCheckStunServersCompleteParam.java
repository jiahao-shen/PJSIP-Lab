/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnNatCheckStunServersCompleteParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnNatCheckStunServersCompleteParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnNatCheckStunServersCompleteParam obj) {
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
        pjsua2JNI.delete_OnNatCheckStunServersCompleteParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserData(SWIGTYPE_p_void value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_userData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserData() {
    long cPtr = pjsua2JNI.OnNatCheckStunServersCompleteParam_userData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setStatus(int value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_status_get(swigCPtr, this);
  }

  public void setName(String value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_name_get(swigCPtr, this);
  }

  public void setAddr(String value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_addr_set(swigCPtr, this, value);
  }

  public String getAddr() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_addr_get(swigCPtr, this);
  }

  public OnNatCheckStunServersCompleteParam() {
    this(pjsua2JNI.new_OnNatCheckStunServersCompleteParam(), true);
  }

}