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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "channel")
public class Channel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "channel_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "active")
	private int active;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "channel_comic", joinColumns = @JoinColumn(name = "channel_id"), inverseJoinColumns = @JoinColumn(name = "comic_id"))
	private Set<Comic> comics;

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
	
	public Set<Comic> getComics() {
		return comics;
	}

	public void setComics(Set<Comic> comics) {
		this.comics = comics;
	}
}
