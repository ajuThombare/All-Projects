package FactoryPatternTest;

public class Customer implements Person {

	private String name, mobile, email;
	int age, cust_id;

	public Customer() {
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

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Student [name=" + name + ", mobile=" + mobile + ", email=" + email + ", age=" + age
				+ ", cust_id=" + cust_id + "]");

	}

	@Override
	public void loadData(String name, String mobile, String email, String designatio, int age, int cust_id, int salery,
			int marks) {
		// TODO Auto-generated method stub
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.cust_id = cust_id;
	}
}
