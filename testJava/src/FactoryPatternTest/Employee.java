package FactoryPatternTest;

public class Employee implements Person {

	private String name, mobile, email, designatio;
	int age, cust_id, salery;

	public Employee() {
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

	public String getDesignatio() {
		return designatio;
	}

	public void setDesignatio(String designatio) {
		this.designatio = designatio;
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

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee [name=" + name + ", mobile=" + mobile + ", email=" + email + ", designatio="
				+ designatio + ", age=" + age + ", cust_id=" + cust_id + ", salery=" + salery + "]");

	}

	@Override
	public void loadData(String name, String mobile, String email, String designatio, int age, int cust_id, int salery,
			int marks) {
		// TODO Auto-generated method stub
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.designatio = designatio;
		this.age = age;
		this.cust_id = cust_id;
		this.salery = salery;
	}

}
