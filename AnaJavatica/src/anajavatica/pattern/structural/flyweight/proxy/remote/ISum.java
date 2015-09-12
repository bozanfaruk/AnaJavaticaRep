package anajavatica.pattern.structural.flyweight.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISum extends Remote {

	public double sum(double value1, double value2) throws RemoteException;

}
