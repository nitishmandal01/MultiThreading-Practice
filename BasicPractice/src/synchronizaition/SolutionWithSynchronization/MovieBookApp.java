package synchronizaition.SolutionWithSynchronization;

public class MovieBookApp extends Thread {
int seats;
static BookTheaterSeatSynchronizedMehtod b;
@Override
	public void run() {
		b.bookSeats(seats);
	}

public static void main(String[] args) {
	
	b =new BookTheaterSeatSynchronizedMehtod();
	
	MovieBookApp t1 = new MovieBookApp();
	t1.seats = 7; // here thread1 is booking 7 seats
	t1.start();
	
	MovieBookApp t2 = new MovieBookApp();
	t2.seats = 6; // here therad2 booking 6 seats
	t2.start();
	
}
}
