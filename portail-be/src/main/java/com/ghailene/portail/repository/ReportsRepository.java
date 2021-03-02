/*
 * Created on 2019-10-09 ( Date ISO 2019-10-09 - Time 11:43:59 )
 * Generated by JCharzyGen version 0
*/
package com.ghailene.portail.repository;
import com.ghailene.portail.entity.Reports;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository  extends JpaRepository<Reports, Long> {

	@Query("select reports from Reports reports")
	Page<Reports> findByPage(Pageable pageable);
}