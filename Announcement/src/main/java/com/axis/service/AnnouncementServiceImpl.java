package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Announcement;
import com.axis.repository.AnnouncementRepository;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {
@Autowired
AnnouncementRepository announcementRepository;
	@Override
	public List<Announcement> getAnnouncement() {
		// TODO Auto-generated method stub
	return announcementRepository.findAll() ;
	}
	
	@Override
	public Announcement addAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		return announcementRepository.save(announcement);
	}

	@Override
	public List<Announcement> getAllAnnouncement() {
		// TODO Auto-generated method stub
		return null;
	}

}
