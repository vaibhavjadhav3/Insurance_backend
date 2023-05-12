package com.application.service;

import java.util.List;

import com.application.model.Announcement;
//import com.application.model.announcement;

public interface  AnnouncementService 
{
	
		
		public Announcement saveAnnouncement(Announcement announcement);
		public List<Announcement> getAllannouncement();
		public  Announcement getAnnouncementById(Integer id);
		public void deleteAnnouncement(Integer id);
		public void editAnnouncement(Announcement announcement,Integer id );
		
		

	

}
