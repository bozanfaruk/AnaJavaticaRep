package anajavatica.pattern.structural.flyweight.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerMain {

	public static void main(String[] args) {

		try {
			ISum sumObj = new SumImpl();
			Naming.rebind("SumImpl", sumObj);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
