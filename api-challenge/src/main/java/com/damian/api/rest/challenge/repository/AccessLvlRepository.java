package com.damian.api.rest.challenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.challenge.entity.AccessLvl;

@Repository
public interface AccessLvlRepository extends CrudRepository<AccessLvl, Long>{

	
}
