package Code;

public class SingleTonTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		objSingle ob1 = objSingle.getInstance();
		System.out.println(ob1.hashCode());
		objSingle ob2 = objSingle.getInstance();
		System.out.println(ob2.hashCode());
		objSingle ob3 = (objSingle) ob2.clone();

		System.out.println(ob1 == ob2);
	}
}

class objSingle implements Cloneable {
	static objSingle inst = null;

	private objSingle() {
	}

	public static objSingle getInstance() {
		if (inst == null)
			inst = new objSingle();

		return inst;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}