package synchronizaition.ProblemWithoutSysnchronization;

public class BookThreaterSeat {
	int total_seats = 10;
	void bookseats(int seats) {
		if(total_seats >= seats) {
			System.out.println(seats+" seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println(total_seats+" left");
		}else {
			System.out.println("seats cannot be booked");
			System.out.println("only "+total_seats+" left");
		}
	}
}
