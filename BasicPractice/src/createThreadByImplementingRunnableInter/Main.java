package createThreadByImplementingRunnableInter;
/*
 * When we implements Runnable interface, there's 3 steps
 * 1. Extends thread and override run() method
 * 2. Creating object of that class
 * 3.Create object of THread class, and pass that object. The same object will tell thread 
 * which run method to run
 * 4. with that object, call .start() method with that thread class object
 * */
public class Main implements Runnable{

	@Override
	public void run() {
		System.out.println("Task of RUnnable Interface");
	}

	public static void main(String[] args) {
		Main m = new Main();
		Thread th = new Thread(m);
		
		th.start();
	}
}
