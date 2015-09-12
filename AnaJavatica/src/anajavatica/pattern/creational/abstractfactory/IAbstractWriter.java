package anajavatica.pattern.creational.abstractfactory;

public interface IAbstractWriter {

	public IFileWriter getFileWriter(FileWriterEnum type);

	public IPortWriter getPortWriter(PortWriterEnum type);

}
