package com.ghailene.portail.service;

import java.util.List;

import com.ghailene.portail.entity.TypeService;

public interface TypeServiceService {

	public TypeService findOne(Long typeId);

	public TypeService add(TypeService typeService);

	public TypeService update(TypeService typeService);

	public boolean delete(Long typeId);

	public List<TypeService> findAll();

	public List<TypeService>findByPage(int page, int size);

	public long count();
	
}
