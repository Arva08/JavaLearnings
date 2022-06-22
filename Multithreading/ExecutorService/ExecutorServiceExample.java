package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
public static void main(String args[]) throws InterruptedException, ExecutionException {
	ExecutorService executorService = Executors.newScheduledThreadPool(10);
	Future<Long> future =null;
	List<Future> futurLists =new ArrayList<Future>() ;
	for(int i=0;i<100;i++) {
		future =executorService.submit(new Task());
	futurLists.add(future);
	}
	
	for(Future f: futurLists) {
	//	System.out.println(f.get());
	}
	System.out.println("A");
}

}
class Task implements Callable<Long>{

	

	@Override
	public Long call() throws Exception {
		//Thread.currentThread().sleep(1000);
		System.out.println(Thread.currentThread().getId());
		return Thread.currentThread().getId();
	}
	
}
