package VolatileExample;

public class VolatileExample {

	public static void main(String[] args) throws InterruptedException {
		Task t = new Task();
		Thread t1 = new Thread(t);
		
		t1.start();
		
		System.out.println("Before Sleep");
		Thread.sleep(10000);
		t.flag=false;
		System.out.println("After sleep setting the flag to false");
	}
}
class Task implements Runnable {
	public volatile  boolean flag=true;

	@Override
	public void run() {
		int i=0;
		try {
		while(flag) {
			
				Thread.sleep(100);
			
			System.out.println("count :" + ++i);
		}
		System.out.println("Flag stopped in thread");
			}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
