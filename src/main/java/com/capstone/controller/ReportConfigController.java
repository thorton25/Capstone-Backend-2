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

import com.capstone.exception.ResourceNotFoundException;
import com.capstone.model.ReportConfig;
import com.capstone.repository.ReportConfigRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ReportConfigController {

	@Autowired
	private ReportConfigRepository reportConfigRepository;
	

	@GetMapping("/reportconfigs")
	public List<ReportConfig> getAllReportss(){
		return reportConfigRepository.findAll();
	}
	    
//	@GetMapping("/reportconfigs/results/{configId}")
//	  public ResponseEntity<List<ReportConfig>> findByActiveAndNameContaining(@PathVariable Long configId) {
//	      List<ReportConfig> reportConfigs = reportConfigRepository.findByConfigIdContaining(configId);
//	      return ResponseEntity.ok(reportConfigs);
//	      
//	  }
	
	@GetMapping("/reportconfigs/results/{reportName}")
	  public ResponseEntity<List<Object>> findByActiveAndNameContaining(@PathVariable String reportName) {
	      List<Object> reportConfigs = reportConfigRepository.findByReportConfigNameContaining(reportName);
	      return ResponseEntity.ok(reportConfigs);
	      
	  }
	
	@PostMapping("/reportconfigs")
	public ReportConfig createReportConfig(@RequestBody ReportConfig reportConfig) {
		return reportConfigRepository.save(reportConfig);
	}
	

	@GetMapping("/reportconfigs/{id}")
	public ResponseEntity<ReportConfig> getReportById(@PathVariable Long id) {
		ReportConfig reportConfig = reportConfigRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("ReportConfig does not exist with id :" + id));
		return ResponseEntity.ok(reportConfig);
	}
	
	
	@PutMapping("/reportconfigs/{id}")
	public ResponseEntity<ReportConfig> updateReportConfigs(@PathVariable Long id, @RequestBody ReportConfig reportConfigDetails){
		ReportConfig reportConfig = reportConfigRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("ReportConfig does not exist with id :" + id));
		
		//reportConfig.setName(reportConfigDetails.getName());
		
		ReportConfig updatedReportConfig = reportConfigRepository.save(reportConfig);
		return ResponseEntity.ok(updatedReportConfig);
	}
	
	@PutMapping("/reportconfigs/deactivate/{id}")
	public ResponseEntity<ReportConfig> deactivateReportConfig(@PathVariable Long id){ //@RequestBody Report reportDetails){
		ReportConfig reportConfig = reportConfigRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + id));
		
		//report.setName(reportDetails.getName());
		reportConfig.setStatus('D');
		//report.setDeletedBy(reportDetails.getDeletedBy());
		
		ReportConfig updatedReportConfig = reportConfigRepository.save(reportConfig);
		return ResponseEntity.ok(updatedReportConfig);
	}

}
