package anajavatica.pattern.creational.abstractfactory;

public class PdfWriter implements IFileWriter {

	@Override
	public void writeToFile(String data) {
		System.out.println("Data sent to Pdf: " + data);
	}

}
