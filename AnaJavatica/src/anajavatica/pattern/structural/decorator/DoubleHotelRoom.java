package anajavatica.pattern.structural.decorator;

@SuppressWarnings("javadoc")
public class DoubleHotelRoom extends HotelRoomDecorator {

	public DoubleHotelRoom(IRoom room) {
		super(room);
	}

	@Override
	public void prepareRoom() {
		prepareDoubleBed();
		getHotelRoom().prepareRoom();
	}

	public void prepareDoubleBed() {
		System.out.println("Double bed room prepared...");
	}

}
