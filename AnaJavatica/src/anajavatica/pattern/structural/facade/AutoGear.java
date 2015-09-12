package anajavatica.pattern.structural.facade;

public class AutoGear implements IGear {

	private final int MAX_GEAR = 4;

	private int gear = 0;

	@Override
	public int gearUp() {
		if (gear == MAX_GEAR) {
			System.out.println("Max gear");
		} else {
			gear++;
			// Other auto gear steps.
		}
		return gear;
	}

	@Override
	public int gearDown() {
		if (gear == 0) {
			System.out.println("Min gear");
		} else {
			gear--;
			// Other auto gear steps.
		}
		return gear;
	}

}
