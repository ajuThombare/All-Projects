package countObjects;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape("Circle", 12);
		Shape s3 = new Shape("Square", 15);
		s1.getCount();
		s2.getCount();
		s3.getCount();
	}
}
