import java.time.*;

public class Playground {
	private String name, location;
	private float size, price;
	private String startTime, endTime;
	
	public Playground(String name, String location, float size, float price, String startTime, String endTime) {
		super();
		this.setName(name);
		this.setLocation(location);
		this.setSize(size);
		this.price = price;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	
	public float getPrice() {
		return price;
	}
	
	
	public boolean checkAvailability(Booking b) {
		LocalTime sTime = LocalTime.parse(getStartTime());
		LocalTime eTime = LocalTime.parse(getEndTime());
		LocalTime bookTime =  LocalTime.parse(b.getTime());
		if (bookTime.compareTo(eTime) < 0 && bookTime.compareTo(sTime) > 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
}
