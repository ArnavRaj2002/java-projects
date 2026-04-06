package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
