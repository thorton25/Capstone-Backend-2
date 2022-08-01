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
	
	@Query("SELECT NEW com.capstone.model.ReportSearch(r.name, a.as400Name, r.status, r.nonSpoolFile, r.skipPages, "
			+ "r.creationDate)  from Report r, AS400 a WHERE r.as400Id = a.as400Id AND "
			+ "r.status = 'A' AND r.name like %:reportName%")
    List<Object> findByReportNameContaining(@Param(value = "reportName") String reportName);
	
}
