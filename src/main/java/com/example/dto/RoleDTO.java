package com.example.dto;

public class RoleDTO {
	
	private int id;
	
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", role=" + role + "]";
	}
	
}
