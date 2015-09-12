package anajavatica.pattern.creational.abstractfactory;

public class PortWriterFactory implements IAbstractWriter {

	@Override
	public IPortWriter getPortWriter(PortWriterEnum type) {
		switch (type) {
		case SerialPortWriter:
			return new SerialPortWriter();
		case ParallelPortWriter:
			return new ParallelPortWriter();
		}
		return null;
	}

	@Override
	public IFileWriter getFileWriter(FileWriterEnum type) {
		return null;
	}

}
