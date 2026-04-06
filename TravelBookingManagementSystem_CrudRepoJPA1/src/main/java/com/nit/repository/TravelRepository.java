package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.TravelEntity;

public interface TravelRepository extends CrudRepository<TravelEntity,Long>
{
	
}
