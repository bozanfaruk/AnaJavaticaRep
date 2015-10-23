package anajavatica.pattern.behavioral.memento;

public class Game {

	private int level = 0;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public LevelMemento saveLevel() {
		return new LevelMemento(getLevel());
	}

	public void loadLevel(LevelMemento memento) {
		setLevel(memento.getLevel());
	}

	public void printLevel() {
		System.out.println("Level: " + getLevel());
	}

}

class LevelMemento {

	private int level = 0;

	public LevelMemento(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}
