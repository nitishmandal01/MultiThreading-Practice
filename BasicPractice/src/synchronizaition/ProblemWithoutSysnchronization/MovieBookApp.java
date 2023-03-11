package synchronizaition.ProblemWithoutSysnchronization;

public class MovieBookApp extends Thread {
	static BookThreaterSeat b;
	int seats;
	
	@Override
	public void run() {
		b.bookseats(seats);
	}
public static void main(String[] args) {
		b = new BookThreaterSeat();
		
	MovieBookApp thread1=  new MovieBookApp();
	thread1.seats = 6;
	thread1.start();
	
	
	MovieBookApp thread2 = new MovieBookApp();
	thread2.seats = 7;
	thread2.start();
	
		
}

}
