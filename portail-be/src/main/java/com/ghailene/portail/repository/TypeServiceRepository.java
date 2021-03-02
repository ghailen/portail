package com.ghailene.portail.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ghailene.portail.entity.Action;
import com.ghailene.portail.entity.TypeService;

@Repository
public interface TypeServiceRepository  extends JpaRepository<TypeService, Long> {

	@Query("select typeService from TypeService typeService")
	Page<TypeService> findByPage(Pageable pageable);
}