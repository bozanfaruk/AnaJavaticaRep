package anajavatica.pattern.creational.prototype;

@SuppressWarnings("javadoc")
public class PrototypeMain {

	public static void main(String[] args) {

		IProtoype<BasicPrototype> b1 = new BasicPrototype();
		((BasicPrototype) b1).setColor("blue");

		BasicPrototype b2 = b1.clone();
		System.out.println(b2.getColor());

		IProtoype<ListPrototype> l1 = new ListPrototype();
		((ListPrototype) l1).getColorList().add("blue");

		ListPrototype l2 = l1.clone();
		System.out.println(l2.getColorList().size());

	}

}
