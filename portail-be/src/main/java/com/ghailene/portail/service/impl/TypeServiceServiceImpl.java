package com.ghailene.portail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ghailene.portail.entity.OffreService;
import com.ghailene.portail.entity.TypeService;
import com.ghailene.portail.repository.OffreServiceRepository;
import com.ghailene.portail.repository.TypeServiceRepository;
import com.ghailene.portail.service.TypeServiceService;

@Service
public class TypeServiceServiceImpl implements TypeServiceService{


	@Autowired

	private TypeServiceRepository typeServiceRepository;
	
	@Override
	public TypeService findOne(Long typeId){
		
				return typeServiceRepository.findById(typeId).get();
			}

	@Override
	public TypeService add(TypeService typeService){

		return typeServiceRepository.save(typeService);
	}

	@Override
	public TypeService update(TypeService typeService){

		return typeServiceRepository.save(typeService);
	}
	
	@Override
	public boolean delete(Long typeId){

				if (typeServiceRepository.findById(typeId) != null) {
					typeServiceRepository.deleteById(typeId);
			return true;
		}
				return false;
	}

	@Override
	public List<TypeService> findAll(){
		return typeServiceRepository.findAll();
	}

	@Override
	public List<TypeService> findByPage(int page, int size){
		return typeServiceRepository.findByPage(PageRequest.of(page, size)).getContent();
	}

	@Override
	public long count() {
		return typeServiceRepository.count();
	}
}
