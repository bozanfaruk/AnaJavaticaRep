package anajavatica.pattern.creational.prototype;

@SuppressWarnings("javadoc")
public class BasicPrototype implements IProtoype<BasicPrototype>, Cloneable {

	private String color = "";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public BasicPrototype clone() {
		BasicPrototype newInstance = null;

		try {
			newInstance = (BasicPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return newInstance;
	}

}
