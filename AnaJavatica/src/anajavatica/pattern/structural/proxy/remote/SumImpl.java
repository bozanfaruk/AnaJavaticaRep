package anajavatica.pattern.structural.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("javadoc")
public class SumImpl extends UnicastRemoteObject implements ISum {

	protected SumImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public double sum(double value1, double value2) throws RemoteException {
		return (value1 + value2);
	}

}
