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
@Table(name = "chapter")
public class Chapter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chapter_id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty(message = "Por favor, introduzca el nombre del capitulo")
	private String name;
	
	@Column(name = "active")
	private int active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "comic_chapter", joinColumns = @JoinColumn(name = "chapter_id"), inverseJoinColumns = @JoinColumn(name = "comic_id"))
	private Comic comic;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "chapter_page", joinColumns = @JoinColumn(name = "chapter_id"), inverseJoinColumns = @JoinColumn(name = "page_id"))
	private Set<Page> pages;
	

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

	public Comic getComic() {
		return comic;
	}

	public void setComic(Comic comic) {
		this.comic = comic;
	}

	public Set<Page> getPages() {
		return pages;
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}

}
