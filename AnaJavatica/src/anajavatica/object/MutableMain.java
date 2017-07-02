package anajavatica.object;

@SuppressWarnings("javadoc")
public class MutableMain {

	private static final int LOOP = 100000;

	public static void main(String[] args) {

		String immutable = "";

		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; i++)
			immutable += "a";
		System.out.println(System.currentTimeMillis() - start);
		System.out.println(immutable.length());

		StringBuffer mutable = new StringBuffer();
		start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; i++)
			mutable.append("a");

		System.out.println(System.currentTimeMillis() - start);

	}

}
