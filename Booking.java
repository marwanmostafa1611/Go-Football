
public class Booking {
	private int bookingNum;
	private String date, time;
	private static int bookingCounter = 0;
	
	
	public Booking() {
		bookingCounter++;
		bookingNum = bookingCounter;
	}
	public int getBookingNum() {
		return bookingNum;
	}
	public void setBookingNum(int bookingNum) {
		this.bookingNum = bookingNum;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static int getBookingCounter() {
		return bookingCounter;
	}
	
}
