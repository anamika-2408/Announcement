package com.axis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.Announcement;
@Repository

public interface AnnouncementRepository extends JpaRepository<Announcement,String> {

}
