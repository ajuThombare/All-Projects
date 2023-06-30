package employeepackage;

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
//		Locale locale = new Locale("fr", "FR");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(new Date());
	}

	public Manager(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void leaveTime() {
		System.out.println("The office leave time of " + this.name + " Manager is 6PM");
	}

	@Override
	public void tasksStatus() {
		System.out.println("Some task are pending from satuerday for " + this.name);
	}

	@Override
	public void officeTime() {
		System.out.println("The office office time of " + this.name + " Manager is 10AM");
	}

}
