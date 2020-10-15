package oops;

public class Task {
boolean flag = false;

synchronized void question (String qus) {
	if(flag) {
		try {
			wait();
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	flag=true;
	notify();
	System.out.println(qus);
}
synchronized void answer(String ans) {
	if(!flag) {
		try {
			wait();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	flag=true;
	notify();
	System.out.println(ans);
}
}
class ThreadBoy implements Runnable{
	Task t1;
	String quests[]= {"hello","H R U","W A U F",};
	
	public ThreadBoy(Task t1) {
		this.t1=t1;
		new Thread(this).start();
			
	}
	public void run() {
		for(String qus : quests) {
			t1.question(qus);
		}
			
	}
}
class ThreadGirl implements Runnable{
	Task t1;
	String answers[]= {"hii","f9","bhopal"};
	
	public ThreadGirl(Task t1) {
		this.t1=t1;
		new Thread(this).start();
	}
	
	public void run() {
		for(String ans : answers) {
			t1.answer(ans);
		}
	}
}

class Ram{
	public static void main(String[] args) {
		Task a1= new Task();
		
a1.answer();
	}
}