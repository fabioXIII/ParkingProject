package parking.model;

import java.io.Serializable;

public class Response<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8580207070851718529L;
	private boolean success=true;
	private String err;
	private String err_code;
	private T data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErr() {
		return err;
	}
	public void setErr(String err) {
		this.err = err;
		success=false;
	}
	public String getErr_code() {
		return err_code;
	}
	public void setErr_code(String err_code) {
		this.err_code = err_code;
		success=false;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	

}
