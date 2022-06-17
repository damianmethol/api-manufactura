package com.damian.api.rest.challenge.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.challenge.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query(value = "select * from users where username like %?1%", nativeQuery = true)
	public Iterable<User> findByUsername(String username);

	
}
