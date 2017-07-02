package anajavatica.pattern.structural.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

@SuppressWarnings("javadoc")
public class ClientMain {

	public static void main(String[] args) {

		try {
			ISum sumObj = (ISum) Naming.lookup("rmi://127.0.0.1/" + "SumImpl");
			System.out.println(sumObj.sum(1, 2));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

	}

}
