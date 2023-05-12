package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.model.Announcement;

public interface AnnouncementRespository extends JpaRepository<Announcement,Integer> {

}
