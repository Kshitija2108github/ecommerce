package com.velocity.ec.dto;

import java.sql.Timestamp;

public class SucessDto {

	String message;
	String status;
	private Integer statusCode;
	private Timestamp timestamp;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public SucessDto(String message, String status, Integer statusCode, Timestamp timestamp) {
		super();
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
		this.timestamp = timestamp;
	}

	public SucessDto() {

	}

}
