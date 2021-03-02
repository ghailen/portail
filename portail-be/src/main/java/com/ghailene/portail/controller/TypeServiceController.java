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
import com.ghailene.portail.dto.OffreServiceDto;
import com.ghailene.portail.dto.TypeServiceDto;
import com.ghailene.portail.entity.OffreService;
import com.ghailene.portail.entity.TypeService;
import com.ghailene.portail.service.TypeServiceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/typeService")
public class TypeServiceController {

@Autowired
private TypeServiceService typeServiceService;

ModelMapper modelMapper = new ModelMapper();

@GetMapping("/findAll")
@ApiOperation(value = "View a list of all available typeService ", response = ResponseEntity.class)
public ResponseEntity<Object> getAllTypeService(){
	try{
		return ResponseEntity.ok()
						 .body(modelMapper.map(typeServiceService.findAll(),TypeServiceDto[].class));
	}catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}
}

@GetMapping("/findById/{typeId}")
@ApiOperation(value = "View specific available offreService ", response = ResponseEntity.class)
public ResponseEntity<Object> getOneTypeService(@PathVariable Long typeId){

	try{
		return ResponseEntity.ok()
						 .body(modelMapper.map(typeServiceService.findOne(typeId),TypeServiceDto.class));
	}catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}
}


@PostMapping("/save")
@ApiOperation(value = "Create a new offreService ", response = ResponseEntity.class)
public ResponseEntity<Object> createTypeService(@RequestBody TypeServiceDto in) throws URISyntaxException {
	
	try {
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(
				typeServiceService.add(modelMapper.map(in, TypeService.class)), TypeServiceDto.class));	
	} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}

}


@PutMapping("/update/{typeId}")
@ApiOperation(value = "Update the offreService ", response = ResponseEntity.class)
public ResponseEntity<Object> updateTypeService(@PathVariable Long typeId, @RequestBody TypeServiceDto in) throws URISyntaxException {

    if (typeId == null) {
        throw new BadRequestException("Invalid id", "OffreService", "idnull");
    }

    in.setTypeId(typeId);

	try {
		return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(
				typeServiceService.update(modelMapper.map(in, TypeService.class)), TypeServiceDto.class));			
	}catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}

}



@DeleteMapping("/delete/{typeId}")
@ApiOperation(value = "Delete the offreService ", response = ResponseEntity.class)
public ResponseEntity<Object> deleteTypeService(@PathVariable Long typeId){
	
	try {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(typeServiceService.delete(typeId));			
	}catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}
}

@GetMapping("/findByPage/{page}/{size}")
@ApiOperation(value = "View (size) available typeService from (page)", response = ResponseEntity.class)
public ResponseEntity<Object> getTypeServiceByPage(@PathVariable("page") int page, @PathVariable("size") int size){
			
	try{
		return ResponseEntity.ok()
						 .body(modelMapper.map(typeServiceService.findByPage(page, size),TypeServiceDto[].class));
	}catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}

}

@GetMapping("/count")
@ApiOperation(value = "Count of all availables offreService", response = ResponseEntity.class)
public ResponseEntity<Object> countTypeService(){
	try{
		return ResponseEntity.ok()
						 .body(typeServiceService.count());
	}catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server.error");
	}
}



	
}
