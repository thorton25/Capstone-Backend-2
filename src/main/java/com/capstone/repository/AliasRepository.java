package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.model.Alias;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long>{
	
	
	@Query(value = "SELECT NEW com.capstone.model.AliasSearch(r.name, a.aliasName) FROM Report AS r, Alias AS a WHERE a.reportId = r.id "
			+ "AND a.aliasName "
			+ " LIKE CONCAT('%', :aliasName, '%')")
	List<Object> findAliasByAliasNameContaining(@Param(value="aliasName")String aliasName);
	
	@Query(value = "SELECT NEW com.capstone.model.AliasSearch(r.name, a.aliasName) FROM Report AS r, Alias AS a WHERE a.reportId = r.id "
			+ "AND r.name "
			+ " LIKE CONCAT('%', :reportName, '%')")
	List<Object> findAliasByReportNameContaining(@Param(value="aliasName")String reportName);
	
//	@Query(value = "SELECT r.REPORTNAME, a.ALIAS FROM t_report r, t_alias a WHERE a.REPORTID = r.REPORTID AND a.ALIAS "
//			+ " LIKE CONCAT('%', :aliasName, '%')", nativeQuery=true)
//	List<Object> findAliasByAliasNameContaining(@Param(value="aliasName")String aliasName);
	
//	@Query("SELECT r.name, r.aliasName FROM Report r WHERE r.aliasName "
//			+ " LIKE CONCAT('%', :aliasName, '%')")
//	List<Object> findByAliasNameContaining(@Param(value="aliasName")String aliasName);
	
//	@Query(value = "SELECT r.REPORTNAME, a.ALIAS FROM t_report r, t_alias a WHERE a.REPORTID = r.REPORTID AND r.REPORTNAME "
//			+ " LIKE CONCAT('%', :reportName, '%')", nativeQuery=true)
//	List<Object> findAliasByReportNameContaining(@Param(value="reportName")String reportName);

}
