package com.wf.ssm.exception;

public class SSMException extends Exception {

	private static final long serialVersionUID = -5909658634579724033L;

	public SSMException(int errCode, String errMsg) {
		super("error code: " + errCode + ", error message: " + errMsg);
	}
}
