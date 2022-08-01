package com.capstone.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.model.RootDoc;

@Repository
public interface RootDocRepository extends JpaRepository<RootDoc, Long>{
	
	
	@Query(value = "SELECT A.RDOCID, date_format(A.RDOCCDATE, '%Y-%m-%d') "
			+ "as cdate, A.RDOCTITLE, A.RDOCDESC, REPLACE(a.rdocrtime, ' ', 0) as rtime, "
			+ "date_format(A.PDATE, '%Y-%m-%d %h:%i:%s') as adate "
			+ "FROM T_ROOTDOC A WHERE A.RDOCTITLE = 0710 ORDER BY PDATE DESC", nativeQuery=true)
	List<RootDoc> findByRootDocTitleContaining(@Param(value="title")String title);
	
}