package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.application.model.Policy;
import com.application.service.policyService;

@RestController
@RequestMapping("/policy")
@CrossOrigin(origins = "http://localhost:3000")

public class PolicyController {
	
	@Autowired
	private policyService policyService;
	
	@PostMapping("/savepolicy")
	public ResponseEntity<?> savePolicy(@RequestBody Policy policy){
		return new ResponseEntity<>(policyService.savePolicy(policy), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getlist")
	public ResponseEntity<?> getAllPolicy()
	{
		return new ResponseEntity<>(policyService.getAllPolicy(),HttpStatus.OK);
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getPolicyById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(policyService.getPolicyById(id),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePolicy(@PathVariable Integer id)
	{
		policyService.deletePolicy(id);
		return "Policy deleted";
			
		
	}
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody Policy policy,@PathVariable Integer id)
	{
		policyService.editPolicy(policy,  id);
		return "Edited policy";
		
	}
	
	
	
	
	

}
