package attendanceSystem;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		boolean mainFlag = true;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Choose Option: ");
			System.out.println("1.Admin.");
			System.out.println("2.Teacher.");
			System.out.println("3.Student.");
			System.out.println("4.Exit.");

			int mainOption = sc.nextInt();

			switch (mainOption) {
			case 1:
				boolean adminFlag = true;
				System.out.println("Enter admin password:");
				if (sc.next().equals("123")) {
					Admin objAdmin = new Admin();
					do {
						System.out.println("1.Add New Teacher.");
						System.out.println("2.Add New Student.");
						System.out.println("3.Add New Admin.");
						System.out.println("4.Add New Subject.");

						System.out.println("5.View All the Data.");

						System.out.println("6.Modify Teachers.");
						System.out.println("7.Modify Student.");
						System.out.println("8.Modify Admin.");

						System.out.println("9.Remove Teacher.");
						System.out.println("10.Remove Student.");

						int option1 = sc.nextInt();
						String ids = null, names = null, passwords = null, emails = null;
						if (option1 >= 1 && option1 <= 4) {
							if (option1 == 4) {
								System.out.println("Enter subject to Add: ");
								names = sc.next();
							} else {
								System.out.println("Enter id: ");
								ids = sc.next();
								System.out.println("Enter Name: ");
								names = sc.next();
								System.out.println("Enter Password: ");
								passwords = sc.next();
								System.out.println("Enter Email: ");
								emails = sc.next();
							}
						} else if (option1 >= 6 && option1 <= 8) {
							System.out.println("Enter id to be modified: ");
							ids = sc.next();
							System.out.println("Enter New Password: ");
							passwords = sc.next();
						} else if (option1 == 9) {
							System.out.println("Enter Teacher id to Remove: ");
							ids = sc.next();
						} else if (option1 == 10) {
							System.out.println("Enter Student id to Remove: ");
							ids = sc.next();
						}
						switch (option1) {

						case 1:
							Teacher tr1 = new Teacher(ids, names, passwords, emails);
							objAdmin.addNewTeacher(tr1);
							break;
						case 2:
							Student tr2 = new Student(ids, names, passwords, emails);
							objAdmin.addNewStudent(tr2);
							break;
						case 3:
							Admin tr3 = new Admin(ids, names, passwords, emails);
							objAdmin.addNewAdmin(tr3);
							break;
						case 4:
							objAdmin.addNewSubject(names);
							break;
						case 5:
							System.out.println("Admins->");
							objAdmin.viewAllAdmins();
							System.out.println("Teachers->");
							objAdmin.viewAllTeachers();
							System.out.println("Students->");
							objAdmin.viewAllStudents();
							System.out.println("Subjects->");
							objAdmin.viewAllSubject();
							break;

						case 6:
							objAdmin.modifyTeacher(ids, passwords);
							break;
						case 7:
							objAdmin.modifyStudent(ids, passwords);
							break;
						case 8:
							objAdmin.modifyAdmin(ids, passwords);
							break;
						case 9:
							objAdmin.removeTeacher(ids);
							break;
						case 10:
							objAdmin.removeStudent(ids);
							break;
						default:
							System.out.println("Please Select valied Option.");
							break;
						}
						System.out.println("You want to Continue? y/n");
						char state = sc.next().charAt(0);
						if (state == 'n' || state == 'N') {
							adminFlag = false;
						}
					} while (adminFlag);
				}
				break;
			case 2:
				boolean teacherFlag = true;
				Teacher objTeacher = new Teacher();
				do {
					System.out.println("1.Add Lectures.");
					System.out.println("2.Enroll Student.");
					System.out.println("3.View Enroll Students.");
					System.out.println("4.View Lectures.");

//					System.out.println("4.Add New Subject.");

					int option2 = sc.nextInt();

					String ids = null, names = null, passwords = null, emails = null, cource = null;
					if (option2 == 2) {
						System.out.println("Enter student id: ");
						ids = sc.next();
						System.out.println("Enter student Name: ");
						names = sc.next();
						System.out.println("Enter student Password: ");
						passwords = sc.next();
						System.out.println("Enter student Email: ");
						emails = sc.next();
//						System.out.println("Enter Cource Name: ");
//						cource = sc.next();
					} else if (option2 == 1) {
						System.out.println("Enter subject : ");
						names = sc.next();
					}
					try {
						switch (option2) {
						case 1:
							objTeacher.addLectures(names);
							break;
						case 2:
							Student std = new Student(ids, names, passwords, emails);
							objTeacher.enrollStudentForCource(std);
							break;
						case 3:
							objTeacher.viewEnrolledStudenta();
							break;
						case 4:
							objTeacher.viewLectures();
							break;
						default:
							System.out.println("Please Select valied Option.");
							break;
						}
					} catch (Exception e) {
						System.out.println("Please Select valied Option.");
					}
					System.out.println("You want to Continue? y/n");
					char state = sc.next().charAt(0);
					if (state == 'n' || state == 'N') {
						teacherFlag = false;
					}
				} while (teacherFlag);
				break;

			case 3:
				boolean studentFlag = true;
				Student objstudent = new Student();
				do {

					System.out.println("1.View Lectures.");
					System.out.println("2.Check Eligibility.");

					int option3 = sc.nextInt();
					int marks = 0;
					if (option3 == 2) {
						System.out.println("Enter Your final marks (0-100): ");
						marks = sc.nextInt();
					}
					try {
						switch (option3) {
						case 1:
							objstudent.viewLectures();
							break;
						case 2:
							objstudent.checkEligibility(marks);
							break;
						default:
							System.out.println("Please Select valied Option.");
							break;
						}
					} catch (Exception e) {
						System.out.println("Please Select valied Option.");
					}
					System.out.println("You want to Continue? y/n");
					char state = sc.next().charAt(0);
					if (state == 'n' || state == 'N') {
						studentFlag = false;
					}
				} while (studentFlag);
				break;

			case 4:
				System.out.println("Bye");
				mainFlag = false;
				break;
			default:
				System.out.println("Please Select valied Option.");
				break;

			}

		} while (mainFlag);
	}

}