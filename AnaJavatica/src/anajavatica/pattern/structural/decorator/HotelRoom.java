package anajavatica.pattern.structural.decorator;

@SuppressWarnings("javadoc")
public class HotelRoom implements IRoom {

	@Override
	public void prepareRoom() {
		System.out.println("Hotel room prepared...");
	}

}
