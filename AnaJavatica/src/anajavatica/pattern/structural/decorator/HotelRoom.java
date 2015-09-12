package anajavatica.pattern.structural.decorator;

public class HotelRoom implements IRoom {

	@Override
	public void prepareRoom() {
		System.out.println("Hotel room prepared...");
	}

}
