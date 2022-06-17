package com.damian.api.rest.challenge.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.challenge.entity.UserSecurity;

@Repository
public interface UserSecurityRepository extends CrudRepository<UserSecurity, Long>{

	@Query(value = "select s.group_name FROM user_security us INNER JOIN users u ON us.user_id=u.id INNER JOIN security_groups s ON us.group_id=s.id WHERE u.username LIKE %?1%", nativeQuery = true)
	public List<UserSecurity> getGroupByUsername(String username);

}
