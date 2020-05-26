package com.publish.event.notifications.webhook.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Notification {

	@JsonProperty("subject")

	private String subject = null;

	@JsonProperty("subscriptionName")

	private String subscriptionName = null;

	@JsonProperty("createdTimestamp")

	private String createdTimestamp = null;

	@JsonProperty("content")

	private Object content = null;

	public Notification subject(String subject) {

		this.subject = subject;

		return this;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Notification subscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
		return this;

	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public Notification createdTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Notification content(Object content) {
		this.content = content;
		return this;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {

			return false;

		}

		Notification notification = (Notification) o;
		return Objects.equals(this.subject, notification.subject) &&
				Objects.equals(this.subscriptionName, notification.subscriptionName) &&
				Objects.equals(this.createdTimestamp, notification.createdTimestamp) &&
				Objects.equals(this.content, notification.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(subject, subscriptionName, createdTimestamp, content);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Notification {\n");
		sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
		sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("}");

		return sb.toString();
	}

	/**
	 * 
	 * Convert the given object to string with each line indented by 4 spaces
	 * 
	 * (except the first line).
	 * 
	 */

	private String toIndentedString(Object o) {

		if (o == null) {

			return "null";

		}

		return o.toString().replace("\n", "\n    ");

	}

}