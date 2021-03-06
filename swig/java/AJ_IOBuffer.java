/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package alljoyn;

public class AJ_IOBuffer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AJ_IOBuffer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AJ_IOBuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        alljoynJNI.delete_AJ_IOBuffer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDirection(int value) {
    alljoynJNI.AJ_IOBuffer_direction_set(swigCPtr, this, value);
  }

  public int getDirection() {
    return alljoynJNI.AJ_IOBuffer_direction_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    alljoynJNI.AJ_IOBuffer_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return alljoynJNI.AJ_IOBuffer_flags_get(swigCPtr, this);
  }

  public void setBufSize(long value) {
    alljoynJNI.AJ_IOBuffer_bufSize_set(swigCPtr, this, value);
  }

  public long getBufSize() {
    return alljoynJNI.AJ_IOBuffer_bufSize_get(swigCPtr, this);
  }

  public void setBufStart(SWIGTYPE_p_uint8_t value) {
    alljoynJNI.AJ_IOBuffer_bufStart_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getBufStart() {
    long cPtr = alljoynJNI.AJ_IOBuffer_bufStart_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public void setReadPtr(SWIGTYPE_p_uint8_t value) {
    alljoynJNI.AJ_IOBuffer_readPtr_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getReadPtr() {
    long cPtr = alljoynJNI.AJ_IOBuffer_readPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public void setWritePtr(SWIGTYPE_p_uint8_t value) {
    alljoynJNI.AJ_IOBuffer_writePtr_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getWritePtr() {
    long cPtr = alljoynJNI.AJ_IOBuffer_writePtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public void setSend(SWIGTYPE_p_f_p_struct__AJ_IOBuffer__AJ_Status value) {
    alljoynJNI.AJ_IOBuffer_send_set(swigCPtr, this, SWIGTYPE_p_f_p_struct__AJ_IOBuffer__AJ_Status.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct__AJ_IOBuffer__AJ_Status getSend() {
    long cPtr = alljoynJNI.AJ_IOBuffer_send_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct__AJ_IOBuffer__AJ_Status(cPtr, false);
  }

  public void setRecv(SWIGTYPE_p_f_p_struct__AJ_IOBuffer_uint32_t_uint32_t__AJ_Status value) {
    alljoynJNI.AJ_IOBuffer_recv_set(swigCPtr, this, SWIGTYPE_p_f_p_struct__AJ_IOBuffer_uint32_t_uint32_t__AJ_Status.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct__AJ_IOBuffer_uint32_t_uint32_t__AJ_Status getRecv() {
    long cPtr = alljoynJNI.AJ_IOBuffer_recv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct__AJ_IOBuffer_uint32_t_uint32_t__AJ_Status(cPtr, false);
  }

  public void setContext(SWIGTYPE_p_void value) {
    alljoynJNI.AJ_IOBuffer_context_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getContext() {
    long cPtr = alljoynJNI.AJ_IOBuffer_context_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public AJ_IOBuffer() {
    this(alljoynJNI.new_AJ_IOBuffer(), true);
  }

}
