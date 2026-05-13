package com.transport.employee.worker.dto;

public class AppResponseMessageDto<T> {
	
	private Integer responseCode;
	
	private String responseMessage;
	
	private T response;
	
	public AppResponseMessageDto(Integer responseCode, String responseMessage, T response) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.response = response;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}
	
}
