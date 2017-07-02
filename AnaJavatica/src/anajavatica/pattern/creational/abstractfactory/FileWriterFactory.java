package anajavatica.pattern.creational.abstractfactory;

@SuppressWarnings("javadoc")
public class FileWriterFactory implements IAbstractWriter {

	@Override
	public IFileWriter getFileWriter(FileWriterEnum type) {
		switch (type) {
		case PdfWriter:
			return new PdfWriter();
		case NotepadWriter:
			return new NotepadWriter();
		}
		return null;
	}

	@Override
	public IPortWriter getPortWriter(PortWriterEnum type) {
		return null;
	}

}
