package com.capstone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.dao.AliasMapper;
import com.capstone.exception.ResourceNotFoundException;
import com.capstone.model.Alias;
import com.capstone.repository.AliasRepository;
import com.capstone.repository.ReportRepository;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AliasController {

	@Autowired
	private AliasRepository aliasRepository;
	
	@Autowired
	private AliasMapper aliasMapper;
	
	    
	@GetMapping("/aliases/results/{aliasName}")
	  public ResponseEntity<List<Alias>> findByAliasNameContaining(@PathVariable String aliasName) {
	      List<Alias> aliases = aliasRepository.findByAliasNameContaining(aliasName);
	      return ResponseEntity.ok(aliases);
	      
	  }
	
	@PostMapping("/aliases")
	public Alias createAlias(@RequestBody Alias alias) {
		return aliasRepository.save(alias);
	}
	
	@GetMapping("/aliases/results/reports/{reportName}")
	  public ResponseEntity<List<Alias>> findByReportNameContaining(@PathVariable String reportName) {
	      List<Alias> aliases = aliasRepository.findByAliasNameContaining(reportName);
	      return ResponseEntity.ok(aliases);
	      
	  }
	
	
	
//	@PutMapping("/reports/{id}")
//	public ResponseEntity<Report> updateReports(@PathVariable Long id, @RequestBody Report reportDetails){
//		Report report = reportRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + id));
//		
//		report.setName(reportDetails.getName());
//		
//		Report updatedReport = reportRepository.save(report);
//		return ResponseEntity.ok(updatedReport);
//	}
	
	
	
	@DeleteMapping("/reports/live/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAlias(@PathVariable Long id){
		Alias alias = aliasRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Alias does not exist with id :" + id));
		
		aliasRepository.delete(alias);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}