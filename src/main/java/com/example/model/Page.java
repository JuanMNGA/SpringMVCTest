package com.example.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "page")
public class Page {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "page_id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty(message = "Por favor, introduzca el nombre de la pagina")
	private String name;
	
	@Column(name = "active")
	private int active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "chapter_page", joinColumns = @JoinColumn(name = "page_id"), inverseJoinColumns = @JoinColumn(name = "chapter_id"))
	private Chapter chapter;

	
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

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

}
