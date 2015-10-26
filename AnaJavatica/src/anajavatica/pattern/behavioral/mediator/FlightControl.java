package anajavatica.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class FlightControl {

	private List<Flight> flightList = new ArrayList<Flight>();

	public void requestLand(Flight flight) {
		flight.land();
		removeFlight(flight);
		for (Flight f : flightList) {
			f.pass();
		}
	}

	public void addFlight(Flight flight) {
		flightList.add(flight);
	}

	private void removeFlight(Flight flight) {
		flightList.remove(flight);
	}

}
