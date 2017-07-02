package anajavatica.pattern.behavioral.iterator;

@SuppressWarnings("javadoc")
public class IteratorMain {

	public static void main(String[] args) {

		NotebookStore store = new NotebookStore();
		Iterator<Notebook> iterator = store.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.nextElement().getName());
		}

	}

}
