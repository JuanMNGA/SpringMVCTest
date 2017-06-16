package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.UserDTO;
import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class LoginController {

	@Autowired
	private UserService userService;


	@RequestMapping(method = { RequestMethod.POST })
	public UserDTO create(@RequestBody UserDTO user) {
		return userService.create(user);
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	public UserDTO get(@PathVariable("id") Integer id) {
		return userService.getByIdDTO(id);
	}

	@RequestMapping(method = { RequestMethod.GET })
	public List<UserDTO> get(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(value = "size", required = false, defaultValue = "10") Integer size){

		return userService.getByParams(id, name, lastName, email, new PageRequest(page, size));
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody UserDTO user){
		userService.update(user);
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id){
		userService.delete(id);
	}
	
}
