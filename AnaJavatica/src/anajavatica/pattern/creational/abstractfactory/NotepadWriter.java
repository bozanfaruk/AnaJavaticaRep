package anajavatica.pattern.creational.abstractfactory;

public class NotepadWriter implements IFileWriter {

	@Override
	public void writeToFile(String data) {
		System.out.println("Data sent to notepad: " + data);
	}

}
