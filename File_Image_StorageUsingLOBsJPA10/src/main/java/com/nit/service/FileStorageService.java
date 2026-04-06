package com.nit.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.FileRecord;
import com.nit.repo.FileRecordRepository;

@Service
public class FileStorageService implements IFileStorageService {

    @Autowired
    private FileRecordRepository fileRepo;

    @Override
    public FileRecord storeFileAndImage(String textFilePath, String imageFilePath) throws IOException {

        Path pathText = Paths.get(textFilePath);
        Path pathImg = Paths.get(imageFilePath);

        byte[] allBytes = Files.readAllBytes(pathImg);
        String string = Files.readString(pathText);

        FileRecord fRecord = new FileRecord(string, allBytes);
        fRecord.setFileName(pathText.getFileName().toString());  // only text file name stored

        FileRecord save = fileRepo.save(fRecord);
        return save;
    }

    @Override
    public void retrieveAndWriteToDisk(Long id, String outputTextPath, String outputImagePath) throws Exception {

        FileRecord f = fileRepo.findById(id)
                .orElseThrow(() -> new Exception("ID not exist !!"));

        // ✅ Correct order
        Files.writeString(Paths.get(outputTextPath), f.getFileText());
        Files.write(Paths.get(outputImagePath), f.getFileImage());
    }
}
