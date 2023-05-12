package com.application.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.application.model.Announcement;
import com.application.repository.AnnouncementRespository;
import com.application.service.AnnouncementService;


@Service
public class AnnouncementServiceImpl implements AnnouncementService{

	@Autowired
	 private AnnouncementRespository amtrepo;
	 
	@Override
	public Announcement saveAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		return amtrepo.save(announcement);
	}

	@Override
	public List<Announcement> getAllannouncement() {
		// TODO Auto-generated method stub
		return amtrepo.findAll();
	}

	@Override
	public Announcement getAnnouncementById(Integer id) {
		// TODO Auto-generated method stub
		return amtrepo.findById(id).get();
	}

	@Override
	public void deleteAnnouncement(Integer id) {
		
		amtrepo.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editAnnouncement(Announcement announcement, Integer id) {
	    Announcement oldAnnouncement = amtrepo.findById(id).get();
	    oldAnnouncement.setTitle(announcement.getTitle());
	    oldAnnouncement.setDescription(announcement.getDescription());
	    oldAnnouncement.setDate(announcement.getDate());
	     amtrepo.save(oldAnnouncement);
	}


}
