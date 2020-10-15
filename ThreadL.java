package oops;

public class ThreadL extends Thread {
	
public void run() {
	System.out.println("happy new year:2020");
}

}

 class Demo1{
	 
	public static void main(String[] args) {
	ThreadL t1 = new ThreadL();
	ThreadL t2 = new ThreadL();
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	t1.setName("OIST");
	t2.setName("sistec");
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	Thread t=Thread.currentThread();
	System.out.println(t.getName());
	
}
 }