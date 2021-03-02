package com.ghailene.portail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="feedback", schema="scPortail" )
public class Feedback implements Serializable{

	
	private static final long serialVersionUID = 1L;

    //Entity primary key
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY,generator="MySequenceGenerator")
    @SequenceGenerator(allocationSize=1, schema="scPortail",  name="MySequenceGenerator", sequenceName = "portail_id_seq")
    @Column(name="feedback_id", nullable=false)
    private Long feedbackId ;
  
    @Column(name="description", length=2147483647)
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
