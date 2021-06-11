
public class Main {
	public static void main(String args[]) {
		// We'll create a team so that we can assign the player to it
		Team t1 = new Team("Zamalek", "White", "Friday", 5);
		
		/* We'll register a new player and let him join this team declaring
		the balance he wants to add to his e-Wallet
		and his payment method*/
		Player p1 = new Player();
		p1.signUp("Marwan", "marwan@gmail.com", "****", "Mohandessin", 20190516);
		p1.joinTeam(t1, 500, "Cash");
		
		/* Now we'll create the playground where the user will make his booking
		and determine its opening and closing time */ 
		Playground pg1 = new Playground("Eagles Playground", "Agouza", 500, 50, "02:00:00" , "08:00:00");
		
		// Now we'll create a booking and the player will use it to book the playground
		Booking b1 = new Booking();
		b1.setDate("11/6/2021");
		b1.setTime("05:00:00"); // time is in 24-hour format
		
		System.out.println("First test case:");
		p1.bookPlayground(p1.getPaymentMethod(),60, b1, pg1);
	    
		// The time is available and the entered cash is enough
		// So the playground will be booked successfully
		
		/* Now we'll do the same steps and test it with an exception case
		   Exceptions cases we have in our program are:
		   1- User entered cash less than the price of the playground
		   2- User made a booking in a time that the playground isn't available
		 */
		
		Player p2 = new Player();
		p2.signUp("Omar", "omar@gmail.com", "******", "Dokki", 20190347);
		p2.joinTeam(t1, 100, "Credit-Card");
		Booking b2 = new Booking();
		b2.setDate("13/6/2021");
		b2.setTime("04:00:00");
		
		System.out.println("Second test case:");
		p2.bookPlayground(p2.getPaymentMethod(),40, b2, pg1);
		/* In this case, the player picked a time where the playground
		is available but he didn't pay enough money */
	
		
	}
}
