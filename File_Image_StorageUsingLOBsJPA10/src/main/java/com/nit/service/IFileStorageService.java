package com.nit.service;

import java.util.Optional;

import com.nit.entity.FileRecord;

public interface IFileStorageService 
{
public FileRecord storeFileAndImage(String textFilePath, String imageFilePath) throws Exception;
public void retrieveAndWriteToDisk(Long id, String outputTextPath, String outputImagePath)throws Exception;
	 
}
