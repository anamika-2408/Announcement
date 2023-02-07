package com.axis.service;

import java.util.List;

import com.axis.model.Announcement;

public interface AnnouncementService {
	public List<Announcement> getAnnouncement();
	public List<Announcement> getAllAnnouncement();

	public Announcement addAnnouncement(Announcement announcement); 

}
