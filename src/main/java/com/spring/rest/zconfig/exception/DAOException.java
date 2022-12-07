package com.spring.rest.zconfig.exception;

/**
 *        This classed is used in DAO process when DAO/MyBatic Mapper have
 *        occurred any error or exception.
 */
public class DAOException extends RuntimeException {
	private static final long serialVersionUID = -1402323572092762148L;
	private String errorCode;

	public DAOException(String errorCode, String message, Throwable throwable) {
		super(message, throwable);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
