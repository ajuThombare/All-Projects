package FactoryPatternTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Object u wanna create?");
		System.out.println("1. Student");
		System.out.println("2. Employee");
		System.out.println("3. Customer");

		int a = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Mobile Number: ");
		String mobile = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		Person p = null;
		PersonFactory ft = new PersonFactory();
		if (a == 1) {
			p = ft.getObject("student");
			System.out.println("Enter Student Id:");
			int s_id = sc.nextInt();
			System.out.println("Enter Student Marks:");
			int marks = sc.nextInt();
			p.loadData(name, mobile, email, "", age, s_id, 0, marks);
		} else if (a == 2) {
			System.out.println("Enter Employee Id:");
			int e_id = sc.nextInt();
			System.out.println("Enter Employee Designation:");
			String des = sc.next();
			System.out.println("Enter Employee Salery:");
			int salery = sc.nextInt();
			p = ft.getObject("Employee");
			p.loadData(name, mobile, email, des, age, e_id, salery, 0);
		} else if (a == 3) {
			System.out.println("Enter Customer Id:");
			int c_id = sc.nextInt();
			p = ft.getObject("customer");
			p.loadData(name, mobile, email, "", age, c_id, 0, 0);
		}
		p.display();
		sc.close();
	}
}
