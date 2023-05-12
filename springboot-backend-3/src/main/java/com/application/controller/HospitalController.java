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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Hospital;
import com.application.service.HospitalService;


@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS })
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/savehospital")
	public ResponseEntity<?> savehospital(@RequestBody Hospital hospital){
		hospitalService.saveHospital(hospital);
		return new ResponseEntity<>(hospitalService.getAllHospital(),HttpStatus.OK);
	}
	
	@GetMapping("/getlist")
	public ResponseEntity<?> getAllhospital() {
		return new ResponseEntity<>(hospitalService.getAllHospital(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> gethospitalById(@PathVariable Integer id) {
		return new ResponseEntity<>(hospitalService.getHospitalById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public String deletehospital(@PathVariable Integer id) {
		hospitalService.deleteHospital(id);
		return "Deleted Hospital";
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody Hospital hospital2,@PathVariable Integer id) {
		hospitalService.editHospital(hospital2, id);
		return "Announcement edited";
		
	}
}
