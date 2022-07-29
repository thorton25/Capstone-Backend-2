package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.model.Alias;
import com.capstone.model.Report;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long>{
	
	@Query("SELECT new com.capstone.model.Alias(a.aliasName, a.report) FROM Alias a Left JOIN a.report r") //WHERE a.aliasid = "
			//+ "r.id AND LIKE CONCAT('%',:aliasName,'%'%")
	List<Alias> fetchReportAliasDataLeftJoinContaining(String aliasName);
	
	@Select("SELECT t_report.REPORTNAME, t_alias.ALIAS FROM t_alias Left JOIN t_report ON t_alias.REPORTID = "
			+ "t_report.REPORTID WHERE WHERE REPORTNAME LIKE %{reportName}%")
	List<Alias> findByReportNameContaining(String reportName);
	
	//@Query("SELECT new com.capstone.model.Alias(a.aliasId, r.id, r.name, a.aliasName) FROM Alias a Left JOIN a.report r WHERE a.aliasid = "
	//		+ "r.id AND LIKE CONCAT('%',:aliasName,'%'%")
}
