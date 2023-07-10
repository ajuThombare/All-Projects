package FactoryPatternTest;

public class PersonFactory {
	public Person getObject(String name) {
		if (name.equalsIgnoreCase("student")) {
			return new Student();
		} else if (name.equalsIgnoreCase("customer")) {
			return new Customer();
		} else if (name.equalsIgnoreCase("Employee")) {
			return new Employee();
		}

		return null;
	}
}
