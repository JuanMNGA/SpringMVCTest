package com.example.dto;

public class PageDTO {

	private int id;
	
	private String name;
	
	private int active;
	
	private ChapterDTO chapter;

	
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

	public ChapterDTO getChapter() {
		return chapter;
	}

	public void setChapter(ChapterDTO chapter) {
		this.chapter = chapter;
	}

}
