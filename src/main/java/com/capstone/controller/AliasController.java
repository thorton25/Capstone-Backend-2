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
import com.capstone.model.Alias;
import com.capstone.repository.AliasRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AliasController {

	@Autowired
	private AliasRepository aliasRepository;
	
	    
	@GetMapping("/aliases/results/{aliasName}")
	  public ResponseEntity<List<Object>> findByAliasNameContaining(@PathVariable String aliasName) {
	      List<Object> aliases = aliasRepository.findAliasByAliasNameContaining(aliasName);
	      return ResponseEntity.ok(aliases);
	      
	  }
	
	@PostMapping("/aliases")
	public Alias createAlias(@RequestBody Alias alias) {
		return aliasRepository.save(alias);
	}
	
	@GetMapping("/aliases/reports/results/{reportName}")
	  public ResponseEntity<List<Object>> findByReportNameContaining(@PathVariable String reportName) {
	      List<Object> aliases = aliasRepository.findAliasByReportNameContaining(reportName);
	      return ResponseEntity.ok(aliases);
	      
	  }
	
	
	
//	@PutMapping("/aliases/{id}")
//	public ResponseEntity<Alias> updateReports(@PathVariable Long id, @RequestBody Alias aliasDetails){
//		Alias alias = aliasRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Alias does not exist with id :" + id));
//		
//		alias.setAliasName(aliasDetails.getAliasName());
//		
//		Alias updatedAlias = aliasRepository.save(alias);
//		return ResponseEntity.ok(updatedAlias);
//	}
	
	
	
	@DeleteMapping("/aliases/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAlias(@PathVariable Long id){
		Alias alias = aliasRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Alias does not exist with id :" + id));
		aliasRepository.delete(alias);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}