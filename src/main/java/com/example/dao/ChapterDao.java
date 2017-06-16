package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Chapter;

@Repository("chapterRepository")
public interface ChapterDao extends JpaRepository<Chapter, Long> {
	 Chapter findById(int id);
}
