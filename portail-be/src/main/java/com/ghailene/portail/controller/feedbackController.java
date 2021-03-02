package com.ghailene.portail.controller;

import java.net.URISyntaxException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import com.ghailene.portail.controller.exception.BadRequestException;
import com.ghailene.portail.dto.CommandeDto;
import com.ghailene.portail.dto.FeedbackDto;
import com.ghailene.portail.entity.Feedback;
import com.ghailene.portail.service.FeedbackService;

@RestController
@RequestMapping(value = "/api/feedback")
public class feedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/findAll")
	@ApiOperation(value = "View a list of all available feedback ", response = ResponseEntity.class)
	public ResponseEntity<Object> getAllFeedback(){
		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(feedbackService.findAll(),CommandeDto[].class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}
	
	
	@GetMapping("/findById/{feedbackId}")
	@ApiOperation(value = "View specific available commande ", response = ResponseEntity.class)
	public ResponseEntity<Object> getOneFeedback(@PathVariable Long feedbackId){

		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(feedbackService.findOne(feedbackId),CommandeDto.class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}
	
	@PostMapping("/save")
	@ApiOperation(value = "Create a new commande ", response = ResponseEntity.class)
	public ResponseEntity<Object> createFeedback(@RequestBody FeedbackDto in) throws URISyntaxException {
		
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(
					feedbackService.add(modelMapper.map(in, Feedback.class)), FeedbackDto.class));	
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}

	}
	
	
	
	@PutMapping("/update/{feedbackId}")
	@ApiOperation(value = "Update the commande ", response = ResponseEntity.class)
	public ResponseEntity<Object> updateFeedback(@PathVariable Long feedbackId, @RequestBody FeedbackDto in) throws URISyntaxException {

        if (feedbackId == null) {
            throw new BadRequestException("Invalid id", "Commande", "idnull");
        }

        in.setFeedbackId(feedbackId);
		try {
			return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(
					feedbackService.update(modelMapper.map(in, Feedback.class)), FeedbackDto.class));			
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}

    /**
     * DELETE  api/commande/delete/commandeId : delete the "id" commande .
     *
     * @param id the id of the commande to delete
     * @return the ResponseEntity with status 200 (OK)
     */

	@DeleteMapping("/delete/{feedbackId}")
	@ApiOperation(value = "Delete the commande ", response = ResponseEntity.class)
	public ResponseEntity<Object> deleteFeedback(@PathVariable Long feedbackId){
		
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(feedbackService.delete(feedbackId));			
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}

	@GetMapping("/findByPage/{page}/{size}")
	@ApiOperation(value = "View (size) available commande from (page)", response = ResponseEntity.class)
	public ResponseEntity<Object> getFeedbackByPage(@PathVariable("page") int page, @PathVariable("size") int size){
				
		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(feedbackService.findByPage(page, size),FeedbackDto[].class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}

	}

	@GetMapping("/count")
	@ApiOperation(value = "Count of all availables commande", response = ResponseEntity.class)
	public ResponseEntity<Object> countFeedback(){
		try{
			return ResponseEntity.ok()
							 .body(feedbackService.count());
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}
	
}
