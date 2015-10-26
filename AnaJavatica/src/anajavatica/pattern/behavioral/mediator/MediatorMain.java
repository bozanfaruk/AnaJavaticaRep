package anajavatica.pattern.behavioral.mediator;

public class MediatorMain {

	public static void main(String[] args) {

		Flight flight1 = new Flight("Flight1");
		Flight flight2 = new Flight("Flight2");
		Flight flight3 = new Flight("Flight3");
		Flight flight4 = new Flight("Flight4");
		FlightControl flightControl = new FlightControl();
		flightControl.addFlight(flight1);
		flightControl.addFlight(flight2);
		flightControl.addFlight(flight3);
		flightControl.addFlight(flight4);

		flight3.requestLand(flightControl);
		flight4.requestLand(flightControl);
		flight1.requestLand(flightControl);
		flight2.requestLand(flightControl);

	}

}
