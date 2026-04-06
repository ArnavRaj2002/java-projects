package com.nit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Member;

public interface IMemberRepo extends JpaRepository<Member, Long> {
	// find expired members: expiryDate before given date
     List<Member> findByExpiryDateBefore(LocalDate date);
}
