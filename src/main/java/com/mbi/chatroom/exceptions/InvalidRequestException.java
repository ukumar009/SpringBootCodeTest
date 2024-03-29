package com.mbi.chatroom.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NO_CONTENT, reason="Invalid Content")
public class InvalidRequestException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidRequestException(String message) {
		super(message);
	}

	public InvalidRequestException(String message, Throwable exception) {
		super(message);
	}
}
