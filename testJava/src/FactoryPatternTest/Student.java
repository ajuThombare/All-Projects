package FactoryPatternTest;

public class Student implements Person {
	private String name, mobile, email;
	int age, std_id, marks;

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Student [name=" + name + ", mobile=" + mobile + ", email=" + email + ", age=" + age
				+ ", std_id=" + std_id + ", marks=" + marks + "]");
	}

	@Override
	public void loadData(String name, String mobile, String email, String designatio, int age, int cust_id, int salery,
			int marks) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.std_id = cust_id;
		this.marks = marks;

	}

}
