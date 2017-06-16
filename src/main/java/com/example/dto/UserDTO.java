package com.example.dto;

import java.io.Serializable;
import java.util.Set;

public class UserDTO implements Serializable {

	private int id;
	private String email;
	private String password;
	private String name;
	private String lastName;
	private int active;
	private Set<RoleDTO> roles;
	private Set<ChannelDTO> channels;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDTO> roles) {
		this.roles = roles;
	}

	public Set<ChannelDTO> getChannels() {
		return channels;
	}

	public void setChannels(Set<ChannelDTO> channels) {
		this.channels = channels;
	}

	public UserDTO(int id, String email, String password, String name, String lastName, int active, Set<RoleDTO> roles,
			Set<ChannelDTO> channels) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.active = active;
		this.roles = roles;
		this.channels = channels;
	}
	

	public UserDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", lastName="
				+ lastName + ", active=" + active + ", roles=" + roles + ", channels=" + channels + "]";
	}

}
