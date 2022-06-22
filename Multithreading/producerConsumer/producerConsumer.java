package producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class producerConsumer {
static ReentrantLock lock = new ReentrantLock();
static Condition fullQueue = lock.newCondition();
static Condition emptyQueue = lock.newCondition();
static Queue<Integer> q= new LinkedList<Integer>();
static int maxCapacity=5;
static  AtomicBoolean flag = new AtomicBoolean();
public static void main(String args[]) throws InterruptedException {
	flag.set(true);
Consumer c= new Consumer(q, lock, fullQueue, emptyQueue, maxCapacity,flag);
Producer p = new Producer(q, lock, fullQueue, emptyQueue, maxCapacity,flag);
	Thread t1= new Thread(c);
	t1.start();
	Thread t2 = new Thread(p);
	t2.start();
	Thread.sleep(10000);
	System.out.println("stopping");
	flag.set(false);
}
     

}
class Consumer implements Runnable{
	Queue<Integer> q;
	ReentrantLock lock;
	Condition fullQueue;
	Condition emptyQueue;
	int maxCapacity;
	AtomicBoolean flag;
	Consumer(Queue<Integer>  q,ReentrantLock lock,Condition fullQueue,Condition emptyQueue,int maxCapacity,AtomicBoolean flag){
		this.q=q;
		this.lock=lock;
		this.emptyQueue=emptyQueue;
		this.fullQueue=fullQueue;
		this.maxCapacity=maxCapacity;
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void consumer() throws InterruptedException {
		try {
		lock.lock();
		while(flag.get()) {
		while(q.isEmpty()) {
			System.out.println("I am waiting");
			emptyQueue.await();
		}
	q.poll();
	System.out.println("I am consuming");
	Thread.sleep(1000);
	 fullQueue.signalAll();
		}
		
		}
	 finally {
		 lock.unlock();
	 }
	}
}
class Producer implements Runnable {
	Queue<Integer> q;
	ReentrantLock lock;
	Condition fullQueue;
	Condition emptyQueue;
	int maxCapacity;
	AtomicBoolean flag;
	Producer(Queue<Integer>  q,ReentrantLock lock,Condition fullQueue,Condition emptyQueue,int maxCapacity,AtomicBoolean flag){
		this.q=q;
		this.lock=lock;
		this.emptyQueue=emptyQueue;
		this.fullQueue=fullQueue;
		this.maxCapacity=maxCapacity;
		this.flag=flag;
	}
	@Override
	public void run() {
		
		try {
			producer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void producer() throws InterruptedException {
		try {
		lock.lock();
		while(flag.get()) {
		while(q.size()==maxCapacity) {
			System.out.println("Queue is full");
			fullQueue.await();
		}
	 q.add((int)Math.random());
	 System.out.println("I am in adding progress");
	 Thread.sleep(1000);
	 System.out.println("I am in adding done");
	 emptyQueue.signalAll();
		}
		}
	 finally {
		 lock.unlock();
	 }
	}
	
}
