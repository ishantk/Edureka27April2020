package co.edureka.threads;

class MovieTicket{
	
	int seatNumber;
	boolean isAvailable;
	
	MovieTicket(int seatNumber){
		this.seatNumber = seatNumber;
		isAvailable = true;
	}
	
	//synchronized void processPayments(String email, int amount) { // lock on a method of the object
	void processPayments(String email, int amount) {
		if(isAvailable) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(">> Thank you for paying \u20b9"+amount);
			System.out.println(">> We have sent the confirmation on your email "+email+" with Seat Number: "+seatNumber);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}else {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(">> Sorry the Ticket is Already Booked");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
}

class BookTicketTask extends Thread{
	
	MovieTicket ticket;
	String email;
	int amount;
	
	boolean isUserPrime;
	
	BookTicketTask(MovieTicket ticket, String email, int amount, boolean isUserPrime){
		this.ticket = ticket;
		this.email = email;
		this.amount = amount;
		this.isUserPrime = isUserPrime;
	}
	
	public void run() {
		// we are locking the entire object
		synchronized (ticket) {	// here a lock will be acquired on the ticket object.
			
			if(!isUserPrime) {
				System.out.println(">> "+email+" not a Prime User. Please Wait !!");
				try {
					ticket.wait();		// we want Thread to wait for its further execution
					//ticket.wait(500);	// Timed Waiting
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(">> BookTicketTask for "+email);
			ticket.processPayments(email, amount);
			ticket.isAvailable = false;	// We will update the status of ticket
			
			ticket.notify();// to notify any waiting thread to resume execution
			
		} // lock will be released here at the end of block
		// Till time lock is not released no other thread can use the ticket object
	}
}

public class SyncThreads {

	public static void main(String[] args) {
		
		MovieTicket ticket1 = new MovieTicket(10);
		MovieTicket ticket2 = new MovieTicket(20);
		MovieTicket ticket3 = new MovieTicket(30);
		MovieTicket ticket4 = new MovieTicket(40);
		MovieTicket ticket5 = new MovieTicket(50);
		
		BookTicketTask user1 = new BookTicketTask(ticket1, "john@example.com", 200, true);
		BookTicketTask user2 = new BookTicketTask(ticket1, "fionna@example.com", 200, false);
		
		// Both the Threads Runs ASYNCHORNOUSLY -> i.e. they run together in parallel
		// Challenge: When Multiple Threads works on the same object :)
		user2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(">> user2 state is: "+user2.getState()); // AnyTime we can read the state of a Thread
		user1.start();	
		
		/*
		 	Object class is Parent to All the Classes in Java :)
			Object oRef = new MovieTicket(10);
			oRef = new Thread();
			oRef = new BookTicketTask(ticket1, "john@example.com", 200, true);
		*/
	}
}

// In java every class is the Child of Object class.
// You write it or you don't write it
// wait, notify, notifyAll belongs to Object class
/*class AnyClass extends Object{
	
}*/
