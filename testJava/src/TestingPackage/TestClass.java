package TestingPackage;

import departmentpackage.Department;
import departmentpackage.Project;
import employeepackage.Employee;
import employeepackage.Manager;

public class TestClass {
	public static void main(String[] args) {
		Employee Emp1 = new Manager("Ajay", 27);
		Emp1.leaveTime();
		Emp1.officeTime();
		Emp1.tasksStatus();
		Employee Emp2 = new Manager("Vijay", 28);
		Emp2.leaveTime();
		Emp2.officeTime();
		Emp2.tasksStatus();

		Department dep1 = new Project("IT department", "Project1");
		dep1.getDName();
		dep1.getPName();

		Department dep2 = new Project("Finance department", "Project2");
		dep2.getDName();
		dep2.getPName();

	}
}
