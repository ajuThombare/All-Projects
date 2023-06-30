package employeepackage;

public class Admin extends Employee {
	public Admin() {
		// TODO Auto-generated constructor stub
//		Locale locale = new Locale("fr", "FR");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(new Date());
	}

	public Admin(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void leaveTime() {
		System.out.println("The office leave time of " + this.name + " Admin is 6PM");
	}

	@Override
	public void tasksStatus() {
		System.out.println("Some task are pending for " + this.name);
	}

	@Override
	public void officeTime() {
		System.out.println("The office office time of " + this.name + " Admin is 10AM");
	}
}
