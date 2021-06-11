

public class Player extends User {
	private String name, email, password, location;
	private int id;
	private Team team;
	private float eWalletBalance;
	private String paymentMethod;
	private Booking myBooking;
	
	

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float geteWalletBalance() {
		return eWalletBalance;
	}

	public void seteWalletBalance(float eWalletBalance) {
		this.eWalletBalance = eWalletBalance;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Booking getMyBooking() {
		return myBooking;
	}

	public void setMyBooking(Booking myBooking) {
		this.myBooking = myBooking;
	}
	
	public void bookPlayground(String paymentMethod, float money, Booking b, Playground p) {
		if (p.checkAvailability(b) == true && money >= p.getPrice()) {
			System.out.println("Playground booked successfully!");
		} else if (p.checkAvailability(b) == false ) {
			System.out.println("Playground not available at this time!");
		} else if (money < p.getPrice()) {
			System.out.println("Not enough money!");
		}
	}
	
	public void joinTeam(Team team, float eWalletBalance, String paymentMethod) {
		this.setTeam(team);
		this.seteWalletBalance(eWalletBalance);
		this.setPaymentMethod(paymentMethod);
	}
}
