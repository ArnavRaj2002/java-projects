/*package com.nit.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.FileRecord;
import com.nit.repo.FileRecordRepository;
import com.nit.service.IFileStorageService;

@Component
public class FileRunner implements CommandLineRunner {
	@Autowired
	private IFileStorageService fileService;
	@Autowired
	private FileRecordRepository fileRepo;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {
		while(true)
		{
			//System.out.println("1. Insert Records to DB");
			System.out.println("2. Reading files from disk...");
			System.out.println("3. store File / Image into database...");
			System.out.println("==================================");
			System.out.println("Enter Your Choice :-");
			int choice=sc.nextInt();
			switch(choice)
			{
//			case 1:
//				List<FileRecord> listOfRecords=List.of
//				 (new FileRecord("My Document", "C:\\Users\\gaynu\\OneDrive\\Desktop\\PrimeServlet.java", "C:\\Users\\gaynu\\OneDrive\\Desktop\\my_pic.jpg"));
//				List<FileRecord> saveAll = fileRepo.saveAll(listOfRecords);
//				System.out.println(saveAll.size()+" records Inserted Sucesssfully in DB !!");
//				break;
			case 2:
				System.out.println("Enter i/p Image File Path ");
				String inputImage=sc.next();
				InputStream is=new FileInputStream(inputImage);
				byte[] picData=new byte[is.available()];
				picData= is.readAllBytes();
				
				System.out.println("Enter i/p Text File Path ");
				String inputText=sc.next();
				File file=new File(inputText);
				Reader reader=new FileReader(file);
				char textContent[]=new char[(int)file.length()];
				reader.read(textContent);
				fileService.storeFileAndImage(inputText, inputImage);
				FileRecord fileRecord1= new FileRecord(file.getName().toString(), inputText, picData);
				fileRepo.save(fileRecord1);
				System.out.println("Data saved successfully with ID: " + fileRecord1.getId());
				break;
			case 3:
				 System.out.println("Enter ID to retrieve:");
				Long id=sc.nextLong();
				System.out.println("Enter o/p Text File Path ");
				String outputText=sc.next();
				System.out.println("Enter o/p Image File Path ");
				String outputImage=sc.next();
				Optional<FileRecord> retriveFromDisk = fileService.retrieveAndWriteToDisk(id, outputText, outputImage);
				if(retriveFromDisk.isPresent())
				{
					FileRecord fileRecord = retriveFromDisk.get();
					OutputStream out=new FileOutputStream("my_pic.jpg");
					out.write(fileRecord.getFileImage());
					out.flush();
					Writer write=new FileWriter("PrimeServlet.java");
					write.write(fileRecord.getFileText());
					write.flush();
					out.close();
					write.close();
				}
				else System.out.println("Records not Found !!");
				break;
				default:System.out.println("Invalid Choice");
			}
		}
		
	}

} */


package com.nit.runner;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.FileRecord;
import com.nit.service.IFileStorageService;

@Component
public class FileRunner implements CommandLineRunner {

    @Autowired
    private IFileStorageService fileService;

    @Override
    public void run(String... args) throws Exception {

        String imgPath = "C:\\Users\\gaynu\\OneDrive\\Desktop\\my_pic.jpg";
        String textPath = "C:\\Users\\gaynu\\OneDrive\\Desktop\\SpringBoot_TaskOn_LargeObjects[1].txt";

        String outputDir = "C:\\Users\\gaynu\\output\\";
        Files.createDirectories(Paths.get(outputDir));

        String outputImage = outputDir + "output_pic.jpg";
        String outputText = outputDir + "output_text.txt";

        // ✅ Correct parameter order: text first, image second
        FileRecord r = fileService.storeFileAndImage(textPath, imgPath);
        System.out.println("✅ Data stored successfully with ID: " + r.getId());

        // ✅ Correct output paths
        fileService.retrieveAndWriteToDisk(r.getId(), outputText, outputImage);

        System.out.println("✅ Files retrieved successfully and written to disk.");
    }
}
