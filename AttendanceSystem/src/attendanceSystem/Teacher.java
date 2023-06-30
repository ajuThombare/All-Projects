package attendanceSystem;

public class Teacher {
	String id, name, password, email;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String id, String name, String password, String email) {
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

	public void addLectures(String lecture) {
		// TODO Auto-generated method stub
		Cource.lectures.add(lecture);
	}

	public void viewLectures() {
		// TODO Auto-generated method stub
		Cource.lectures.forEach(a -> System.out.println(a));
	}

	public void enrollStudentForCource(Student std) {
		// TODO Auto-generated method stub
		Cource.enrolledStudents.add(std);
	}

	public void viewEnrolledStudenta() {
		// TODO Auto-generated method stub
		Cource.enrolledStudents.forEach(a -> System.out.println("Id: " + a.getId() + " Name: " + a.getName()));
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
