package anajavatica.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("javadoc")
public class LevelCaretaker {

	private List<LevelMemento> mementoList = new ArrayList<LevelMemento>();

	public LevelMemento getLevelMemento(int index) {
		return mementoList.get(index);
	}

	public void addLevelMemento(LevelMemento memento) {
		mementoList.add(memento);
	}

}
