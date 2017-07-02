package anajavatica.pattern.behavioral.memento;

@SuppressWarnings("javadoc")
public class MementoMain {

	public static void main(String[] args) {
		LevelCaretaker caretaker = new LevelCaretaker();
		Game game = new Game();

		game.printLevel();
		game.setLevel(1);
		game.printLevel();
		game.setLevel(2);
		caretaker.addLevelMemento(game.saveLevel());
		game.printLevel();

		game.setLevel(3);
		game.printLevel();
		game.setLevel(4);
		game.printLevel();
		System.out.println("Failed! Returning first save point...");

		game.loadLevel(caretaker.getLevelMemento(0));
		game.printLevel();
	}

}
