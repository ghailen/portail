package com.ghailene.portail.service;

import java.util.List;

import com.ghailene.portail.entity.Feedback;

public interface FeedbackService {
	
	public Feedback findOne(Long feedbackId);
	public Feedback add(Feedback feedback);

	public Feedback update(Feedback feedback);

	public boolean delete(Long feedbackId);

	public List<Feedback> findAll();

	public List<Feedback>findByPage(int page, int size);

	public long count();

}
