package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.Announcement;
import com.axis.repository.AnnouncementRepository;



@RestController
@RequestMapping("/announcement")

public class AnnouncementController {
	@Autowired
	private AnnouncementRepository announcementRepository;
	 @GetMapping("/getAll")
	    public @ResponseBody List<Announcement> getAllAnnouncement() {
	        return announcementRepository.findAll();
	    }
	
	@PostMapping("/add")
	public ResponseEntity<Announcement> addAnnouncement(@RequestBody Announcement Announcement){
	
	Announcement announcement1= announcementRepository.save(Announcement);
	return ResponseEntity.ok(announcement1);
	
	
	}

	}
