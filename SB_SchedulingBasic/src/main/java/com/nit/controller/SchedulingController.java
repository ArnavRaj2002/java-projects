package com.nit.controller;

import java.time.LocalDateTime;
/*
| Feature      | Depends On                       | Waits For Method Finish?                         |
| -------------| -------------------------------- | ------------------------------------------------ |
| fixedRate    | Start time of previous execution | ❌No(if thread pool)/✔Yes(default 1 thread) |
| fixedDelay   | End time of previous execution   | ✔Always yes 

🟩 fixedRate(X)
Start method every X milliseconds based on previous START time.
Does NOT wait for completion (unless only 1 thread exists).

🟧 fixedDelay(X)
Wait X milliseconds after method finishes, then start again.|
 */
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/*
 🟩fixedDelay (2000) [depends on Start time of previous execution]
Start next execution 2 seconds AFTER the previous execution finishes.
Wait 2 seconds AFTER the method finishes, then start again.
 🟩 fixedRate (3000) [End time of previous execution]
Start task every 3 seconds (from START of previous run).
Does NOT wait for finish.
 */
@Component
public class SchedulingController {
//@Scheduled(  fixedRate  =3000) //after 3 seconds again method execution starts[fixedRate is ignored when only 1 thread exists.,Spring behaves like fixedDelay, waiting for the task to finish.][Next execution cannot start until previous finishes,So it behaves like fixedDelay]
	@Scheduled(  fixedDelay =3000)

	//@Scheduled(cron="5 * * * * *")
	public void wishMessageGenerator()
	{
		System.out.println("\nHello form SB Scheduler @ "+LocalDateTime.now());
	try {
		Thread.sleep(5000);
		//Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("\nEnd form SB Scheduler @ "+LocalDateTime.now());
	}

}
/*
 * 🟧 1. fixedDelay (X)

After the method FINISHES, wait X milliseconds, then start again.
✔ It depends on previous method END time.
 * 🟩 2. fixedRate (X)

Start the method every X milliseconds from the START of the previous run.
✔ It depends on previous START time, NOT finish time.
✔ It does NOT wait for method to finish (IF multiple threads available).
✔ With single thread (default Spring): it looks like it waits (but this is thread limit, not fixedRate logic).

Spring Boot's default scheduler uses ONE thread, so:

It cannot start the next execution until the previous one finishes

So it appears to wait for completion

But this is because of the single-thread limitation, NOT because of fixedRate
 * */
