package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Vehicle;

public interface IVehicleRepository extends CrudRepository<Vehicle,Long> 
{

}
