package com.nit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.FileRecord;

public interface FileRecordRepository extends JpaRepository<FileRecord,Long>
{
 
}