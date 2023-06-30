package employeepackage;

public class Employee {
	String name;
	int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void tasksStatus() {
		System.out.println("Task status is invalid.");
	}

	public void officeTime() {
		System.out.println("Office Time invalid.");
	}

	public void leaveTime() {
		System.out.println("Leave Time invalid.");
	}
}
