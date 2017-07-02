package anajavatica.pattern.behavioral.iterator;

@SuppressWarnings("javadoc")
public interface Iterator<T> {

	public boolean hasNext();

	public T nextElement();

}
