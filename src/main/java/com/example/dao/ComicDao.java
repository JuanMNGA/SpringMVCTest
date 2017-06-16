package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Comic;

@Repository("comicRepository")
public interface ComicDao extends JpaRepository<Comic, Long> {
	 Comic findById(int id);
}
