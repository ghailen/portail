/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.controller;
import com.ghailene.portail.entity.OffreService;
import com.ghailene.portail.service.OffreServiceService ;
import com.ghailene.portail.dto.OffreServiceDto ;
import com.ghailene.portail.controller.exception.BadRequestException ;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;

/**
 * REST controller for managing OffreService .
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/offreService")
public class OffreServiceController {

	@Autowired
	private OffreServiceService offreServiceService ;

	ModelMapper modelMapper = new ModelMapper();

	
    /**
     * GET  api/offreService/findAll : get all offreService .
     *
     * @return the ResponseEntity with status 200 (OK) and the list of offreService in body
     */

	@GetMapping("/findAll")
	@ApiOperation(value = "View a list of all available offreService ", response = ResponseEntity.class)
	public ResponseEntity<Object> getAllOffreService(){
		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(offreServiceService.findAll(),OffreServiceDto[].class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}

    /**
     * GET  api/offreService/findById/serviceId : get the "id" location.
     *
     * @param serviceId : the id of the offreService to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the offreService, or with status 404 (Not Found)
     */

	@GetMapping("/findById/{serviceId}")
	@ApiOperation(value = "View specific available offreService ", response = ResponseEntity.class)
	public ResponseEntity<Object> getOneOffreService(@PathVariable Long serviceId){

		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(offreServiceService.findOne(serviceId),OffreServiceDto.class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}
	
	/*get */
	@GetMapping("/findByType/{typeId}")
	@ApiOperation(value = "View specific available offreService ", response = ResponseEntity.class)
	public List<OffreService> getypeOffreService(@PathVariable Long typeId){

		try{
			return offreServiceService.getTypeById(typeId);
		}catch(Exception e) {
			e.printStackTrace();
			return (List<OffreService>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}
	
    /**
     * POST  api/offreService/save : Create a new offreService.
     *
     * @param offreService : the offreService to create
     * @return the ResponseEntity with status 201 (Created) and with body the new offreService, or with status 400 (Bad Request) if the offreService has already an ID
     * @throws URISyntaxException if the OffreService URI syntax is incorrect
     */
	@PostMapping("/save")
	@ApiOperation(value = "Create a new offreService ", response = ResponseEntity.class)
	public ResponseEntity<Object> createOffreService(@RequestBody OffreServiceDto in) throws URISyntaxException {
		
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(
					offreServiceService.add(modelMapper.map(in, OffreService.class)), OffreServiceDto.class));	
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}

	}
	

	/**
     * PUT  api/offreService/update/serviceId : Updates an existing offreService.
     *
	 * @param serviceId : the id of the offreService to update
     * @param offreService :  the offreService to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated offreService,
     * or with status 400 (Bad Request) if the offreService is not valid,
     * or with status 500 (Internal Server Error) if the offreService couldn't be updated
     * @throws URISyntaxException if the OffreService URI syntax is incorrect
     */
	@PutMapping("/update/{serviceId}")
	@ApiOperation(value = "Update the offreService ", response = ResponseEntity.class)
	public ResponseEntity<Object> updateOffreService(@PathVariable Long serviceId, @RequestBody OffreServiceDto in) throws URISyntaxException {

        if (serviceId == null) {
            throw new BadRequestException("Invalid id", "OffreService", "idnull");
        }

        in.setServiceId(serviceId);

		try {
			return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(
					offreServiceService.update(modelMapper.map(in, OffreService.class)), OffreServiceDto.class));			
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}

	}



    /**
     * DELETE  api/offreService/delete/serviceId : delete the "id" offreService .
     *
     * @param id the id of the offreService to delete
     * @return the ResponseEntity with status 200 (OK)
     */

	@DeleteMapping("/delete/{serviceId}")
	@ApiOperation(value = "Delete the offreService ", response = ResponseEntity.class)
	public ResponseEntity<Object> deleteOffreService(@PathVariable Long serviceId){
		
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(offreServiceService.delete(serviceId));			
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}

	@GetMapping("/findByPage/{page}/{size}")
	@ApiOperation(value = "View (size) available offreService from (page)", response = ResponseEntity.class)
	public ResponseEntity<Object> getOffreServiceByPage(@PathVariable("page") int page, @PathVariable("size") int size){
				
		try{
			return ResponseEntity.ok()
							 .body(modelMapper.map(offreServiceService.findByPage(page, size),OffreServiceDto[].class));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}

	}

	@GetMapping("/count")
	@ApiOperation(value = "Count of all availables offreService", response = ResponseEntity.class)
	public ResponseEntity<Object> countOffreService(){
		try{
			return ResponseEntity.ok()
							 .body(offreServiceService.count());
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
		}
	}

}

