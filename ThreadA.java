package oops;

public class ThreadA implements Runnable{
	//public synchronized void start()
	//{
		//super.start();
		//System.out.println("pppppp");
		
	//}
public void run() {
	task1();
	task2();
	task3();
	task4();
	task5();
	//System.out.println("bbbbbbbbyykkkkkk");
}

void task1() {
	System.out.println("this is myff 111task");
}
void task2() {
	System.out.println("this is my 222yytask");
}
void task3() {
	System.out.println("this is my 3333hhtask");
}
void task4() {
	System.out.println("this is myjj 4444task");
}
void task5() {
	System.out.println("this is my 5555bbbtask");
}
}
class ThreadB{
	public static void main(String[] args) {
		ThreadA mat1=new ThreadA();
		Thread rat1=new Thread(mat1);
		rat1.start();
		
		ThreadA mat2=new ThreadA();
		Thread rat2=new Thread(mat1);
		rat2.start();
		
		ThreadA mat3=new ThreadA();
		Thread rat3=new Thread(mat1);
		rat3.start();
		
		ThreadA mat4=new ThreadA();
		Thread rat4=new Thread(mat1);
		rat4.start();
		
		ThreadA mat5=new ThreadA();
		Thread rat5=new Thread(mat1);
		rat5.start();
		
		//mat.start();
		//Runnable rb=mat;
		//rb.start();
		//Thread rat=mat;Thread r
		//at1=new Thread(mat1);
		/*Thread rat1=new Thread(mat1);
		Thread rat2=new Thread(mat2);
		Thread rat3=new Thread(mat3);
		Thread rat4=new Thread(mat4);
		Thread rat5=new Thread(mat5);*/

		/*rat1.start();
		rat2.start();
		rat3.start();
		rat4.start();
		rat5.start();*/
	}
}