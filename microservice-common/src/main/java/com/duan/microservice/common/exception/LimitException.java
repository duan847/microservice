package com.duan.microservice.common.exception;

import com.duan.microservice.common.base.ResponseCode;

public class LimitException extends GlobalException {

	private static final long serialVersionUID = 4066485840242028945L;

	public LimitException(String message) {
		super(message, ResponseCode.LIMIT_ERROR_CODE.getCode());
	}

}
