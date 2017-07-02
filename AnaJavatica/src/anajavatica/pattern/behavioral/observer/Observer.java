package anajavatica.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("javadoc")
public class Observer {

	private List<IObserverListener> listenerList = new ArrayList<IObserverListener>();

	public void addListener(IObserverListener listener) {
		if (!listenerList.contains(listener))
			listenerList.add(listener);
	}

	public void removeListener(IObserverListener listener) {
		if (listenerList.contains(listener))
			listenerList.remove(listener);
	}

	public void fireAction(Object sourceObject) {
		System.out.println("Firing action...");
		for (IObserverListener listener : listenerList)
			listener.doAction(new ObserverEvent(sourceObject));
	}

}
