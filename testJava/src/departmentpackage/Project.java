package departmentpackage;

public class Project extends Department {
	String PName;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name, String pName) {
		super();
		PName = pName;
		this.name = name;
	}

	@Override
	public void getPName() {
		System.out.println(" The Project is:" + this.PName);

	}
}
