package com.nit.Scheduling;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class HeartbeatScheduler implements IHeartbeatService {
 @Scheduled(fixedDelay = 3000)
	//@Scheduled(fixedRate = 5000)
	@Override
	public void sendPing() {
		 try
		 {
			// System.out.println("PING Thread :: " + Thread.currentThread().getName());

			 System.out.println("\nSTART of Ping Methods "+LocalDateTime.now());
			 Thread.sleep(5000);

		 }
		 catch(Exception e)
		 {
			 
		 }
		 System.out.println("\nEND of Ping Methods "+LocalDateTime.now());
		 
	}

}
