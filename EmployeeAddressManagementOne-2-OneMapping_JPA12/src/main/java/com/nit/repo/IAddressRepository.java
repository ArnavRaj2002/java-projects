package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Address;

public interface IAddressRepository extends JpaRepository<Address,Long>{

}
