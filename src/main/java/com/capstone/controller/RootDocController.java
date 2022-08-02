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
import com.capstone.model.RootDoc;
import com.capstone.repository.RootDocRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class RootDocController {

	@Autowired
	private RootDocRepository rootDocRepository;
	

	@GetMapping("/rootdocs")
	public List<RootDoc> getAllRootDocs(){
		return rootDocRepository.findAll();
	}
	    
	@GetMapping("/rootdocs/results/{title}")
	  public ResponseEntity<List<Object>> findByActiveAndNameContaining(@PathVariable String title) {
	      List<Object> rootDocs = rootDocRepository.findByRootDocTitleContaining(title);
	      return ResponseEntity.ok(rootDocs);
	      
	  }
	
	@DeleteMapping("/rootdocs/live/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteRootDoc(@PathVariable Long id){
		RootDoc rootDoc = rootDocRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Root Doc does not exist with id :" + id));
		
		rootDocRepository.delete(rootDoc);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
