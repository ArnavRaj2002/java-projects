package com.nit.travelcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.TravelEntity;
import com.nit.travelservice.TravelService;
@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
	public void addTravel(TravelEntity travel) {
		travelService.addTravel(travel);
		 
	}

	public Iterable<TravelEntity> retrieveAllTravels() {
		Iterable<TravelEntity> allTravels = travelService.getAllTravels();
		return allTravels;
	}

	public Optional<TravelEntity> findTravelById(Long id) {
		Optional<TravelEntity> travelById = travelService.findTravelById(id);
		return travelById;
	}
	public void deleteTravelById(Long id) 
	{
		
		travelService.deleteTravelById(id);
	}
	public boolean existsById(Long id)
	{
		boolean existsById = travelService.existsById(id);
		return existsById;
	}
	public long count() {
		long count = travelService.count();
		return count;
	}
	public void delete(TravelEntity travel)
	{
		travelService.delete(travel);
	}
	public void deleteAll()
	{
		travelService.deleteAll();
	}
}
