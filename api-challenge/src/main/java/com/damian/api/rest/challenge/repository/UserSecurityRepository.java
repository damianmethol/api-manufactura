package com.damian.api.rest.challenge.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.challenge.entity.UserSecurity;

@Repository
public interface UserSecurityRepository extends CrudRepository<UserSecurity, Long>{

	@Query(value = "select username, group_name FROM user_security WHERE username LIKE %?1%", nativeQuery = true)
	public List<UserSecurity> getGroupByUsername(String username);

}
