package ThreadInterrupt;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadInterrupt {
	static ReentrantLock r= new ReentrantLock();
public static void main(String args[]) {
	Thread t1=  new Thread(new TaskB(r));
	t1.start();
     Thread t2 = new Thread(new Task(r));
t2.start();
t2.interrupt();
}
}
class Task implements Runnable{
ReentrantLock r ;
Task(ReentrantLock r) {
	this.r=r;
}
	@Override
	public void run() {
		try {
		r.lock();
		if(Thread.interrupted()) {
			System.out.println("Thread Interrupted");
		}
		}
		finally {
		r.unlock();
		}	
	}
}
	class TaskB implements Runnable{
		ReentrantLock r ;
		TaskB(ReentrantLock r) {
			this.r=r;
		}
			@Override
			public void run() {
				r.lock();
				r.unlock();
			}
	}
