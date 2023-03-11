package synchronizaition.solutionWithSinchronizedBlock;

public class BookTheaterSeatSynchronizedBlock {
int totalSeat = 10;

synchronized void bookSeats(int seats) {
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	
	
//	we want to synchronized only this if else bloc...not anything else..so we'll use synchronized block here, not method
	synchronized(this) {
		if(totalSeat>=seats) {
			System.out.println(seats+" seats booked successfully");
			totalSeat = totalSeat-seats;
			System.out.println(totalSeat+" seats left");
		}else {
			System.out.println("Cannot book "+seats+" seats");
			System.out.println("only "+totalSeat+" seats left");
		}
	}
	
//	and now after this, both thread caan execute codes successfully
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
	System.out.println("hello "+Thread.currentThread().getName());
}
}
