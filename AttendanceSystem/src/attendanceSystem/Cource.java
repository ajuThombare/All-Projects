package attendanceSystem;

import java.util.ArrayList;
import java.util.List;

public class Cource {
	String id, name, teacher;
	static List<Student> enrolledStudents = new ArrayList<Student>();
	static List<String> lectures = new ArrayList<>();

	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cource(String id, String name, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
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

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public static void getEnrolledStudents() {
		enrolledStudents.forEach(a -> System.out.println("Student [id=" + a.getId() + ", name=" + a.getName()
				+ ", password=" + a.getPassword() + ", email=" + a.getEmail() + "]"));

	}

}
