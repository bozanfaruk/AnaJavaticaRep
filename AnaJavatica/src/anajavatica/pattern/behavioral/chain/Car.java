package anajavatica.pattern.behavioral.chain;

@SuppressWarnings("javadoc")
public class Car {

	private int type = CAR_TYPE_AUDI;

	public static final int CAR_TYPE_AUDI = 1;

	public static final int CAR_TYPE_BMW = 2;

	public Car(int type) {
		setType(type);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
