package multipleThreadMultipleTask;

public class Main {
	
public static void main(String[] args) {
	//Multiple Thread multi task with Extending thread class
	ExtandThread1 ext1 = new ExtandThread1();
	ext1.start();//one thread performing ExtandTHread1 task
	
	ExtandThread2 ext2 = new ExtandThread2();
	ext2.start(); //second thread performing ExtandTHread2 task.
	
	
	//multi thread multi task with implementing runnable
	ImplRunnable1 er1 = new ImplRunnable1();
	
	Thread t3 = new Thread(er1);
	t3.start(); // here 3rd thread running on ImplRunnable2's run() method
	
	ImplRunnable2 er2 =new ImplRunnable2();
	
	Thread t4 = new Thread(er2);
	t4.start(); //  here 4th thread running on ImpleRunnable's run() method
	
	
}
}
