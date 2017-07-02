package anajavatica.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("javadoc")
public class ListPrototype implements IProtoype<ListPrototype>, Cloneable {

	private List<String> colorList = new ArrayList<String>();

	public List<String> getColorList() {
		return colorList;
	}

	public void setColorList(List<String> colorList) {
		this.colorList = colorList;
	}

	@Override
	public ListPrototype clone() {
		ListPrototype newInstance = null;

		try {
			newInstance = (ListPrototype) super.clone();
			newInstance.getColorList().clear();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return newInstance;
	}

}
