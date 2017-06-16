package com.example.dto;

import java.util.Set;

public class ChannelDTO {

	private int id;
	private String name;
	private int active;
	private Set<ComicDTO> comics;

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
	
	public Set<ComicDTO> getComics() {
		return comics;
	}

	public void setComics(Set<ComicDTO> comics) {
		this.comics = comics;
	}

	@Override
	public String toString() {
		return "ChannelDTO [id=" + id + ", name=" + name + ", active=" + active + ", comics=" + comics + "]";
	}
}
