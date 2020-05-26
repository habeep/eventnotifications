package com.publish.event.notifications.webhook.model;

public class HealthInfo {

	private String message;

	public HealthInfo(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Hello World Bean [message=%s]", message);
	}

}