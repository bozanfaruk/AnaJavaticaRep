package anajavatica.pattern.behavioral.observer;

@SuppressWarnings("javadoc")
public class ObserverMain {

	public static void main(String[] args) {

		ObserverMain observerMain = new ObserverMain();
		Observer observer = new Observer();
		IObserverListener listener1 = new Listener1();
		IObserverListener listener2 = new Listener2();
		observer.addListener(listener1);
		observer.addListener(listener2);

		observer.fireAction(observerMain);

		observer.removeListener(listener1);

		observer.fireAction(observerMain);

	}
}

@SuppressWarnings("javadoc")
class Listener1 implements IObserverListener {

	@Override
	public void doAction(ObserverEvent e) {
		System.out
				.println("Listener 1: ".concat(e.getSourceObject().toString()).concat(" -> ").concat(this.toString()));
	}
}

@SuppressWarnings("javadoc")
class Listener2 implements IObserverListener {

	@Override
	public void doAction(ObserverEvent e) {
		System.out
				.println("Listener 2: ".concat(e.getSourceObject().toString()).concat(" -> ").concat(this.toString()));
	}
}
