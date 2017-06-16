package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	@Query(value = "SELECT u from User as u where (u.id like %:id% OR :id is null) AND"
			+ "(u.name like %:name%) AND " + "(u.last_name like %:last_name% OR :last_name is null) AND"
			+ "(u.email like %:email% OR :email is null)")
	// por dni o por nombre
	List<User> findParams(@Param(value = "id") String id, @Param(value = "name") String name,
			@Param(value = "last_name") String last_name, @Param(value = "email") String email, Pageable pageable);

}