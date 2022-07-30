package com.capstone.repository;

import java.util.List;


import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capstone.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long>{
	
	
	@Query (value="SELECT  *  FROM t_report WHERE STATUS = 'A' AND REPORTNAME LIKE %:name%", nativeQuery=true)
	List<Report> findByNameContaining(@Param(value="name")String name);
	
	
}
