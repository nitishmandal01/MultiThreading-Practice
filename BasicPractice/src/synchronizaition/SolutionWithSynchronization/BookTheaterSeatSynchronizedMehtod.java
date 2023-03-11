package synchronizaition.SolutionWithSynchronization;

public class BookTheaterSeatSynchronizedMehtod {
int totalSeat = 10;

synchronized void bookSeats(int seats) {
	if(totalSeat>=seats) {
		System.out.println(seats+" seats booked successfully");
		totalSeat = totalSeat-seats;
		System.out.println(totalSeat+" seats left");
	}else {
		System.out.println("Cannot book "+seats+" seats");
		System.out.println("only "+totalSeat+" seats left");
	}
}
}
