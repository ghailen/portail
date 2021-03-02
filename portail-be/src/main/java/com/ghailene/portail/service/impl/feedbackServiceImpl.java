package com.ghailene.portail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ghailene.portail.entity.Commande;
import com.ghailene.portail.entity.Feedback;
import com.ghailene.portail.repository.FeedbackRepository;
import com.ghailene.portail.service.FeedbackService;

@Service
public class feedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Override
	public Feedback findOne(Long feedbackId){
		
				return feedbackRepository.findById(feedbackId).get();
			}
	
	@Override
	public Feedback add(Feedback feedback){

		return feedbackRepository.save(feedback);
	}
	
	
	@Override
	public Feedback update(Feedback feedback){
		return feedbackRepository.save(feedback);
	}
	
	@Override
	public boolean delete(Long feedbackId){

				if (feedbackRepository.findById(feedbackId) != null) {
					feedbackRepository.deleteById(feedbackId);
			return true;
		}
				return false;
	}

	@Override
	public List<Feedback> findAll(){
		return feedbackRepository.findAll();
	}

	@Override
	public List<Feedback> findByPage(int page, int size){
		return feedbackRepository.findByPage(PageRequest.of(page, size)).getContent();
	}

	@Override
	public long count() {
		return feedbackRepository.count();
	}
	
	
}
