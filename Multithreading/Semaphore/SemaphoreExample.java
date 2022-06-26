package Semaphore;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
static Semaphore semaphore = new Semaphore(1);
	public static void main(String[] args) {
	
   ExecutorService ex = Executors.newFixedThreadPool(2);
   for(int i=0;i<5;i++) {
	   ex.submit(new Task(semaphore));
   }
	}

}
class Task implements Runnable{
	Semaphore semaphore;
	Task(Semaphore semaphore){
		this.semaphore=semaphore;
	}

	@Override
	public void run() {
		try {
			System.out.println("Available Permits count : " + semaphore.availablePermits()+" Thread "+ Thread.currentThread().getName());
		semaphore.acquire();
		System.out.println(Thread.currentThread().getName()+" accquired ");
			Thread.sleep(10000);
			semaphore.release();
			System.out.println(Thread.currentThread().getName()+" Released ");
		} 
		catch (InterruptedException e) {
			System.out.println("Thread Interuptted");
		}
		
		
	}
	
}
