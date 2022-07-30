package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long>{
	
	
	@Select ("SELECT  *  FROM t_report WHERE STATUS = 'A' AND REPORTNAME LIKE %#{name}%")
	List<Report> findByStatusIsAndNameContaining(char status, String name);
	
	
}
