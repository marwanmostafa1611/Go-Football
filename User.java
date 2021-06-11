
public class User {
	private String name, email, password, location;
	private int id;
	
	public void signUp(String name, String email, String password, String location, int id) {
		this.setName(name);
		this.setEmail(email);
		this.setPassword(password);
		this.setLocation(location);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
