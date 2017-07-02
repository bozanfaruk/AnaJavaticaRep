package anajavatica.pattern.behavioral.iterator;

@SuppressWarnings("javadoc")
public class NotebookIterator implements Iterator<Notebook> {

	private Notebook[] notebookList = null;
	private int index = 0;

	public NotebookIterator(Notebook[] notebookList) {
		super();
		this.notebookList = notebookList;
	}

	@Override
	public boolean hasNext() {
		return index < notebookList.length ? true : false;
	}

	@Override
	public Notebook nextElement() {
		Notebook element = notebookList[index];
		index++;
		return element;
	}

}
