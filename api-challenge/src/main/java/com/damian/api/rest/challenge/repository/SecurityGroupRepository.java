package com.damian.api.rest.challenge.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.challenge.entity.SecurityGroup;

@Repository
public interface SecurityGroupRepository extends CrudRepository<SecurityGroup, Long>{
	
	
}
