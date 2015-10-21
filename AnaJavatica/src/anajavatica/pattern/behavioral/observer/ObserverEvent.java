package anajavatica.pattern.behavioral.observer;

public class ObserverEvent {

	private Object sourceObject;

	public ObserverEvent(Object sourceObject) {
		this.sourceObject = sourceObject;
	}

	public Object getSourceObject() {
		return sourceObject;
	}

}
