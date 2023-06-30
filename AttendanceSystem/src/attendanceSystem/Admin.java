package attendanceSystem;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	String id, name, password, email;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	static List<Teacher> teacher = new ArrayList<Teacher>();

	public void addNewTeacher(Teacher tr) {
		// TODO Auto-generated method stub
		teacher.add(tr);
	}

	public void modifyTeacher(String id, String password) {
		// TODO Auto-generated method stub
		for (int i = 0; i < teacher.size(); i++) {
			if (teacher.get(i).getId().equals(id)) {
				Teacher nw = teacher.get(i);
				nw.setPassword(password);
				teacher.set(i, nw);

			}
		}
	}

	public void removeTeacher(String id) {

		for (int i = 0; i < teacher.size(); i++) {
			if (teacher.get(i).getId().equals(id)) {
				teacher.remove(i);
			}
		}
		// TODO Auto-generated method stub
	}

	public void viewAllTeachers() {
		// TODO Auto-generated method stub
		teacher.forEach(a -> System.out.println("Teacher [id=" + a.getId() + ", name=" + a.getName() + ", password="
				+ a.getPassword() + ", email=" + a.getEmail() + "]"));
	}

	static List<Student> student = new ArrayList<Student>();

	public void addNewStudent(Student tr) {
		// TODO Auto-generated method stub
		student.add(tr);
	}

	public void modifyStudent(String id, String password) {
		// TODO Auto-generated method stub
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getId().equals(id)) {
				Student nw = student.get(i);
				nw.setPassword(password);
				student.set(i, nw);

			}
		}
	}

	public void removeStudent(String id) {

		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getId().equals(id)) {
				student.remove(i);
			}
		}
		// TODO Auto-generated method stub
	}

	public void viewAllStudents() {
		// TODO Auto-generated method stub
		student.forEach(a -> System.out.println("Student [id=" + a.getId() + ", name=" + a.getName() + ", password="
				+ a.getPassword() + ", email=" + a.getEmail() + "]"));
	}

	static List<Admin> admin = new ArrayList<Admin>();

	public void addNewAdmin(Admin tr) {
		// TODO Auto-generated method stub
		admin.add(tr);
	}

	public void modifyAdmin(String id, String password) {
		// TODO Auto-generated method stub
		for (int i = 0; i < admin.size(); i++) {
			if (admin.get(i).getId().equals(id)) {
				Admin nw = admin.get(i);
				nw.setPassword(password);
				admin.set(i, nw);

			}
		}
	}

	public void removeAdmin(String id) {

		for (int i = 0; i < admin.size(); i++) {
			if (admin.get(i).getId().equals(id)) {
				admin.remove(i);
			}
		}
		// TODO Auto-generated method stub
	}

	public void viewAllAdmins() {
		// TODO Auto-generated method stub
		admin.forEach(a -> System.out.println("Admin [id=" + a.getId() + ", name=" + a.getName() + ", password="
				+ a.getPassword() + ", email=" + a.getEmail() + "]"));
	}

	static List<String> subject = new ArrayList<>();

	public void addNewSubject(String tr) {
		// TODO Auto-generated method stub
		subject.add(tr);
	}

	public void removeSubject(String sub) {
		// TODO Auto-generated method stub
		subject.add(sub);
	}

	public void viewAllSubject() {
		// TODO Auto-generated method stub
		subject.forEach(a -> System.out.println(a));
	}

	public void enrollStudentForCource(Student std) {
		// TODO Auto-generated method stub
		Cource.enrolledStudents.add(std);
	}

	public void unenrollStudentForCource(String id) {
		// TODO Auto-generated method stub
		for (Student a : Cource.enrolledStudents) {
			if (a.getId().equals(id)) {
				Cource.enrolledStudents.remove(a);
			}
		}
	}

}
