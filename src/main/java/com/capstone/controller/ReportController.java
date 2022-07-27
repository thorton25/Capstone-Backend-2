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
import com.capstone.model.Report;
import com.capstone.repository.ReportRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ReportController {

	@Autowired
	private ReportRepository reportRepository;
	

	@GetMapping("/reports")
	public List<Report> getAllReportss(){
		return reportRepository.findAll();
	}		
	
	@PostMapping("/reports")
	public Report createReport(@RequestBody Report report) {
		return reportRepository.save(report);
	}
	

	@GetMapping("/reports/{id}")
	public ResponseEntity<Report> getReportById(@PathVariable Long id) {
		Report report = reportRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + id));
		return ResponseEntity.ok(report);
	}
	
	
	@PutMapping("/reports/{id}")
	public ResponseEntity<Report> updateReports(@PathVariable Long id, @RequestBody Report reportDetails){
		Report report = reportRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + id));
		
		report.setName(reportDetails.getName());
		
		Report updatedReport = reportRepository.save(report);
		return ResponseEntity.ok(updatedReport);
	}
	
	@DeleteMapping("/reports/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteReport(@PathVariable Long id){
		Report report = reportRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Report does not exist with id :" + id));
		
		reportRepository.delete(report);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
