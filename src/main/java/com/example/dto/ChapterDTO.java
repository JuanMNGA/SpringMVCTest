package com.example.dto;

import java.util.Set;

public class ChapterDTO {

	private int id;
	
	private String name;
	
	private int active;
	
	private ComicDTO comic;
	
	private Set<PageDTO> pages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public ComicDTO getComic() {
		return comic;
	}

	public void setComic(ComicDTO comic) {
		this.comic = comic;
	}

	public Set<PageDTO> getPages() {
		return pages;
	}

	public void setPages(Set<PageDTO> pages) {
		this.pages = pages;
	}

}
