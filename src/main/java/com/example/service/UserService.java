package com.example.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.dto.UserDTO;
import com.example.model.User;


public interface UserService {

	/**
	 * Realiza la busqueda de todos los libros existentes
	 * 
	 * @return listado de libros
	 */
	List<UserDTO> findAll();

	/**
	 * Transforma un libro en un libroDTO
	 * 
	 * @param user
	 * @return
	 */
	UserDTO transform(User user);

	/**
	 * Transforma un libroDTO en un libro
	 * 
	 * @param user
	 * @return
	 */
	User transform(UserDTO user);

	/**
	 * Transforma una lista de libros en una lista de librosDTO
	 * @param List<User>
	 * @return List<UserDTO>
	 */
	List<UserDTO> transform(List<User> user);
	
	/**
	 * Crea un libroDTO
	 * @param UserDTO
	 * @return UserDTO
	 * @throws InvalidDataException 
	 */
	UserDTO create(UserDTO user);
	
	/**
	 * Devuelve, si existe, un libro cuyo id corresponda con el introducido
	 * @param id
	 * @return UserDTO
	 * @throws UserNotFoundException 
	 */
	User getById(Integer id);

	/**
	 * Devuelve, si existe, un libro cuyo id corresponda con el introducido
	 * @param id
	 * @return UserDTO
	 * @throws UserNotFoundException 
	 */
	UserDTO getByIdDTO(Integer id);
	
	/**
	 * Devuelve, si existe, los libros cuyo nombre, isbn o autor correspondan con los introducidos
	 * @param name
	 * @param isbn
	 * @param author
	 * @return List<UserDTO>
	 * @throws UserNotFoundException 
	 */
	List<UserDTO> getByParams(String id, String name, String lastName, String email, Pageable pageable);
	
	/**
	 * Permite la modificacion de un libro concreto
	 * @param user
	 * @throws InvalidDataException 
	 */
	void update(UserDTO user);

	/**
	 * Elimina un libro cuyo id corresponda con el introducido
	 * @param id
	 * @throws UserNotFoundException 
	 */
	void delete(Integer id);


}