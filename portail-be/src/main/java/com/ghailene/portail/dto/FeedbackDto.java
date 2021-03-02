package com.ghailene.portail.dto;

public class FeedbackDto {

	private Long feedbackId ;
	private String description ;
	
	
	
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
