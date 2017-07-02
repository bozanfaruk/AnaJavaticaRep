package anajavatica.pattern.creational.abstractfactory;

@SuppressWarnings("javadoc")
public interface IAbstractWriter {

	public IFileWriter getFileWriter(FileWriterEnum type);

	public IPortWriter getPortWriter(PortWriterEnum type);

}
