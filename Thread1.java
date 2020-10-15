package oops;

public class Thread1 {
	
 void printable(int n) {
	
	Thread ref=Thread.currentThread();
	System.out.println("Name:"+ref.getName());
	
	synchronized ( this) {
		for(int i=1;i<5;i++) {
		System.out.println(n*i);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	}
}
}
class Thread2 extends Thread{
	Thread1 t1;
	public Thread2(Thread1 t1) {
		this.t1=t1;
	}
	public void run() {
		t1.printable(5);
	}
	
}
class Thread3 extends Thread{
	Thread1 t1;
	public Thread3(Thread1 t1) {
		this.t1=t1;
	}
	public void run() {
		t1.printable(7);
	}
}
class Thread4{
	public static void main(String[] args) {

		Thread1 obj=new Thread1();
		Thread2 obj1=new Thread2(obj);
		Thread3 obj2=new Thread3(obj);
		obj1.setName("sumit");
		obj2.setName("Aumit");
		obj1.start();
		obj2.start();
	}
}