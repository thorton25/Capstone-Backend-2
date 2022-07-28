package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Alias;
import com.capstone.model.Report;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long>{
	
	@Select("SELECT t_report.REPORTNAME, ALIAS FROM t_report INNER JOIN t_alias ON t_report.REPORTID WHERE ALIAS LIKE %{aliasName}%")
	List<Alias> findByAliasNameContaining(String aliasName);
	
	@Select("SELECT t_report.REPORTNAME, ALIAS FROM t_report INNER JOIN t_alias ON t_report.REPORTID WHERE REPORTNAME LIKE %{reportName}%")
	List<Alias> findByReportNameContaining(String reportName);
}
