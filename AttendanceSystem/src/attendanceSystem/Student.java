package attendanceSystem;

public class Student {
	String id, name, password, email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void viewLectures() {
		// TODO Auto-generated method stub
		Cource.lectures.forEach(a -> System.out.println(a));
	}

	public void checkEligibility(int mark) {
		// TODO Auto-generated method stub
		if (mark > 100) {
			System.out.println("Please enter marks from 0 to 100.");
		} else if (mark > 40 && mark < 100) {
			System.out.println("You are eligible.");
		} else {
			System.out.println("You are not eligible.");
		}
	}
}
