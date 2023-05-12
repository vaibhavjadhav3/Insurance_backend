package com.application.controller;
 import com.application.model.Announcement;
import com.application.model.Hospital;
import com.application.service.AnnouncementService;

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
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amt")
@CrossOrigin(origins = "http://localhost:3000")
public class AnnoucementController 
{
	
	@Autowired
	private AnnouncementService amtService;
	
	
	@PostMapping("/save")
	public String saveamt(@RequestBody Announcement announcement)
	{	amtService.saveAnnouncement(announcement);
		return "Saved the Annoucement ";
		
	}
	
	
	@GetMapping("/getlist")
	public ResponseEntity<?> getAllhospital()
	{
		return new ResponseEntity<>(amtService.getAllannouncement(),HttpStatus.OK);
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> gethospitalById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(amtService.getAnnouncementById(id),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletehospital(@PathVariable Integer id)
	{
		amtService.deleteAnnouncement(id);
		return new ResponseEntity<>(amtService.getAllannouncement(),HttpStatus.OK);
			
		
	}
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody Announcement announcement,@PathVariable Integer id)
	{
		amtService.editAnnouncement(announcement,id);
		return "Edited hospital";
		
	}
	
	

}
