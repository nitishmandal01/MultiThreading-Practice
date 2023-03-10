package multipleThreadSingleTask;

public class TestWithRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("task under run method");
	}
	
	public static void main(String[] args) {
		TestWithRunnable testObj =  new TestWithRunnable();
		Thread t1= new Thread(testObj); // here we create thread and passed TestWithRunnable object
		t1.start();  //here we start the thread t1
		
	
		TestWithRunnable testObj2 = new TestWithRunnable();
		Thread t2 = new Thread(testObj2);
		t2.start();
	}

}
