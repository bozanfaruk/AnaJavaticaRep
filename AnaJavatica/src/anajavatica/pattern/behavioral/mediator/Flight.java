package anajavatica.pattern.behavioral.mediator;

@SuppressWarnings("javadoc")
public class Flight {

	private String flightName = "";

	public Flight(String flightName) {
		super();
		this.flightName = flightName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void land() {
		System.out.println("Landing: " + getFlightName());
	}

	public void pass() {
		System.out.println("Passing: " + getFlightName());
	}

	public void requestLand(FlightControl flightControl) {
		flightControl.requestLand(this);
	}

}
