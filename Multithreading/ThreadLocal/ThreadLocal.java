package ThreadLocal;



public class ThreadLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p = new Pair();
		for(int i=0;i<4;i++)
	new Thread(()-> {
      p.Date();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
System.out.println(p.i);
}
).start();

	}
}
class Pair{
	int i=0;
	Pair(){
		
	}
	public void Date(){
		i++;
		System.out.println("Inside"+i);
	}
}
