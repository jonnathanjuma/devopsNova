package com.nova.test.model;

import lombok.Data;

/** Objeto para las respuestas */
@Data
public class NovaResMS {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
