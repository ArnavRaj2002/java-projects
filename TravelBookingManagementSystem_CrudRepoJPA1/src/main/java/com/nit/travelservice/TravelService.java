package com.nit.travelservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.TravelEntity;
import com.nit.repository.TravelRepository;

@Service
public class TravelService implements ITravelService {
	@Autowired
	private TravelRepository travelRepo;

	@Override
	public void addTravel(TravelEntity travel) {
		TravelEntity travelEntity = travelRepo.save(travel);
	}

	@Override
	public Iterable<TravelEntity> getAllTravels() {
		return travelRepo.findAll();
	}

	@Override
	public Optional<TravelEntity> findTravelById(Long id) {
		
		 Optional<TravelEntity> travelById = travelRepo.findById(id);
		 if(travelById.isPresent())
		 {
			 System.out.println(travelById);
			 System.out.println(travelById.get());
			 System.out.println("Record having ID : " + id +" Found !!");
			 return travelById;
		 }
		 else {
				System.out.println("Record having ID : " + id +" Not Found!!");
				return Optional.empty();
		 }
	}

	@Override
	public void deleteTravelById(Long id) {
		if (travelRepo.existsById(id)) 
		{
			travelRepo.deleteById(id);
			System.out.println("id :: " + id + " found in DB and 1 record deleted sucessfully");
		} 
		else 
		{
			System.out.println("Id not found");
		}
	}

	@Override
	public boolean existsById(Long id) {
		  boolean existsById = travelRepo.existsById(id);
		if(existsById) 
			{
			System.out.println("is ID :: "+ id+" exist in DB ?? "+existsById);
			return true;
			}
		else{
			System.out.println("is ID :: "+ id+" exist in DB ?? "+existsById);
			return false;
		}
		
	}

	@Override
	public long count() {
		return travelRepo.count();
	}

	@Override
	public void delete(TravelEntity travel) {
		Optional<TravelEntity> byId = travelRepo.findById(travel.getId());
		if(byId.get()!=null)
			//if(byId.isEmpty())
		{
		travelRepo.delete(travel);
		System.out.println("One record deleted sucessfully from DB!!");
		}
		else System.out.println("One record Not deleted sucessfully from DB!!");

	}

	@Override
	public void deleteAll() {
		travelRepo.deleteAll();
		  
	}

}
