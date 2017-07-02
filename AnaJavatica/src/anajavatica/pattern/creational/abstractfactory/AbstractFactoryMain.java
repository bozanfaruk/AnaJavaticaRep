package anajavatica.pattern.creational.abstractfactory;

@SuppressWarnings("javadoc")
public class AbstractFactoryMain {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = AbstractFactory.getInstance();

		IAbstractWriter fileFactory = abstractFactory.getAbstractWriter(AbstractWriterEnum.FileWriter);
		IAbstractWriter portFactory = abstractFactory.getAbstractWriter(AbstractWriterEnum.PortWriter);

		IFileWriter pdfWriter = fileFactory.getFileWriter(FileWriterEnum.PdfWriter);
		IFileWriter notepadWriter = fileFactory.getFileWriter(FileWriterEnum.NotepadWriter);

		IPortWriter serialWriter = portFactory.getPortWriter(PortWriterEnum.SerialPortWriter);
		IPortWriter parallelWriter = portFactory.getPortWriter(PortWriterEnum.ParallelPortWriter);

		pdfWriter.writeToFile("Pdf data");
		notepadWriter.writeToFile("Notepad data");

		serialWriter.sendData("Serial port data");
		parallelWriter.sendData("Parallel port data");

	}

}
