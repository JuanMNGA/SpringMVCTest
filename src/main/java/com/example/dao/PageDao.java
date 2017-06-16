package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Page;

@Repository("pageRepository")
public interface PageDao extends JpaRepository<Page, Long> {
	 Page findById(int id);
}
