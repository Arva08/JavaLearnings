package CountDownLatch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
	static CountDownLatch countDownLatch = new CountDownLatch(3);

	public static void main(String[] args) throws InterruptedException {
		 List<Task> list  = new ArrayList<Task>();
		Task t1 = new Task(countDownLatch);
		list.add(t1);
		Task t2 = new Task(countDownLatch);
		list.add(t2);
		Task t3 = new Task(countDownLatch);
       list.add(t3);
        ExecutorService ex =Executors.newFixedThreadPool(3);
        for(Task t: list) {
        	ex.submit(t);
        }
        System.out.println("waiting for all tasks" + System.currentTimeMillis());
        countDownLatch.await();
        System.out.println("completed task @ " + System.currentTimeMillis());

	}

}
class Task implements Runnable {

	CountDownLatch countDownLatch;
	Task(CountDownLatch countDownLatch){
		this.countDownLatch=countDownLatch;
	}
	@Override
	public void run() {
			System.out.println( Thread.currentThread().getId()+ " processing ");
		
			System.out.println(Thread.currentThread().getId() + "ended");
			countDownLatch.countDown();
		 
		
	}
	
}
