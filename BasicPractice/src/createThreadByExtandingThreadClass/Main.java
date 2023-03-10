package createThreadByExtandingThreadClass;
/*
 * When we extend thread class, there's 3 steps
 * 1. Extends thread and override run() method
 * 2. Creating object of that class
 * 3. with that object, call .start() method
 * */
public class Main extends Thread {
	@Override
	public void run() { //step 1 - overriding run method
		System.out.println("Task Completed");
	}
	
	public static void main(String[] args) {
		Main m = new Main(); //step 2 - creating Main class object
//		Thread m = new Main(); this is also same like Main m = new Main();
		
		m.start();//step 3 - call .start(); method
	}
}
