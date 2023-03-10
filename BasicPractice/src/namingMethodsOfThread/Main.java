package namingMethodsOfThread;

class Test extends Thread{
	@Override
	public void run() {
		System.out.println("inside thread " + Thread.currentThread().getName());
	}
}

class Test2 extends Thread{
	@Override
	public void run() {
		System.out.println("inside thread " + Thread.currentThread().getName());
	}
}

public class Main extends Thread{

public static void main(String[] args) {
	
	String currentThread = Thread.currentThread().getName();
	System.out.println(currentThread); //printing currentThread i.e.e main thread name
	currentThread().setName("MyThread");//setting name for current  thread
	
	System.out.println(currentThread().getName());//printing updated main thread name
	
	
//	creating thread1
	Test t1 = new Test();
	t1.setName("SalmanThread");
	t1.start();
	
//	creating threa2
	Test2 t2= new Test2();
	t2.setName("HritikThread");
	t2.start();
	
	//checking if t1 is still alive or not?
	System.out.println("is t1 thread is still alive or not: "+t1.isAlive()); 
	
	
}
}
