package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.model.ReportConfig;

@Repository
public interface ReportConfigRepository extends JpaRepository<ReportConfig, Long>{
	
//	@Query (value="SELECT  *  FROM t_reportconfig WHERE STATUS = 'A' AND CONFIGID = :id", nativeQuery=true)
//	List<ReportConfig> findByConfigIdContaining(@Param(value="id") Long id);
	
	@Query("SELECT NEW com.capstone.model.ConfigSearch(r.name, a.as400Name, dt.name, d.value) "
			+ "from Report AS r, AS400 AS a, DimType AS dt, Dim AS d, ConfigMap AS c, ReportConfig AS rc "
            + "WHERE r.as400Id = a.as400Id AND c.reportId = r.id AND "
            + "c.cmapId = rc.cmapId AND rc.dimId = d.dimId AND "
            + "d.dimTId = dt.id AND r.name like %:REPORTNAME%")
    List<Object> findByReportConfigNameContaining(@Param(value = "REPORTNAME") String REPORTNAME);
	
//	@Query(nativeQuery = true, value = "select r.reportname, a.as400name, dt.dimtname, d.dimvalue from t_report r "
//            + "INNER JOIN t_as400 a on r.as400id = a.as400id "
//            + "INNER JOIN t_configmap c on r.reportid = c.reportid "
//            + "Inner JOIN t_reportconfig rc on c.cmapid = rc.cmapid "
//            + "INNER JOIN t_dim d on rc.dimid = d.dimid "
//            + "INNER JOIN t_dimtype dt on d.dimtid = dt.dimtid "
//            + "WHERE r.reportname like %:REPORTNAME%")
//    List<Object> findByReportConfigNameContaining(@Param(value = "REPORTNAME") String REPORTNAME);
	
}
