package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String Announcement;

	public String getAnnouncement() {
		return Announcement;
	}

	public void setAnnouncement(String announcement) {
		Announcement = announcement;
	}

	public Announcement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
