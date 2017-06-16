package com.example.dto;

import java.util.Set;

public class ComicDTO {

	private int id;
	
	private String name;
	
	private int active;
	
	private ChannelDTO channel;
	
	private Set<ChapterDTO> chapters;
	

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

	public ChannelDTO getChannel() {
		return channel;
	}

	public void setChannel(ChannelDTO channel) {
		this.channel = channel;
	}

	public Set<ChapterDTO> getChapters() {
		return chapters;
	}

	public void setChapters(Set<ChapterDTO> chapters) {
		this.chapters = chapters;
	}

}
