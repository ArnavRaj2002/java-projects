package com.nit.travelservice;

import java.util.Optional;

import com.nit.entity.TravelEntity;

public interface ITravelService {
	void addTravel(TravelEntity travel);
	Iterable<TravelEntity> getAllTravels();
	Optional<TravelEntity> findTravelById(Long id);
	void deleteTravelById(Long id);
	boolean existsById(Long id);
	long count();
	void delete(TravelEntity travel);
	void deleteAll();
}
