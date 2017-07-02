package anajavatica.object;

@SuppressWarnings("javadoc")
public class ImmutableObject {

	private int aField = 0;

	public ImmutableObject(int aField) {
		this.aField = aField;
	}

	public int getaField() {
		return aField;
	}

}
