package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "comic")
public class Comic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comic_id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty(message = "Por favor, introduzca el nombre del comic")
	private String name;
	
	@Column(name = "active")
	private int active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "channel_comic", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "channel_id"))
	private Channel channel;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "comic_chapter", joinColumns = @JoinColumn(name = "comic_id"), inverseJoinColumns = @JoinColumn(name = "chapter_id"))
	private Set<Chapter> chapters;
	

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

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Set<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter> chapters) {
		this.chapters = chapters;
	}

}
