package com.nova.test.model;

import lombok.Data;

/** Objeto para el tratamiento de los datos */

@Data
public class NovaMS {
	private String message;
	private String to;
	private String from;
	private String timeToLifeSec;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTimeToLifeSec() {
		return timeToLifeSec;
	}

	public void setTimeToLifeSec(String timeToLifeSec) {
		this.timeToLifeSec = timeToLifeSec;
	}
}
