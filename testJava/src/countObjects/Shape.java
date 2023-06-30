package countObjects;

public class Shape {
	String type;
	int size;
	static int count = 0;

	public Shape() {
		count++;
	}

	public Shape(String type, int size) {
		super();
		this.type = type;
		this.size = size;
		count++;
	}

	public void getCount() {
		System.out.println(count);
	}
}
