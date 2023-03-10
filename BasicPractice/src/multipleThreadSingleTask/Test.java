package multipleThreadSingleTask;

public class Test extends Thread {
@Override
public void run() {
	System.out.println("Under run mthod Task");;
}


public static void main(String[] args) {
	Test t1 =  new Test();
	t1.start(); // this will start one thread & do run method task
	
	Test t2 =  new Test();
	t2.start();  //This will also start second thread and do same Run method task
}



}
