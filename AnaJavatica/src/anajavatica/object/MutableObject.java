package anajavatica.object;

@SuppressWarnings("javadoc")
public class MutableObject {

	private int aField = 0;

	public MutableObject(int aField) {
		this.aField = aField;
	}

	public int getaField() {
		return aField;
	}

	public void setaField(int aField) {
		this.aField = aField;
	}

}
