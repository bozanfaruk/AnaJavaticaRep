package anajavatica.pattern.structural.decorator;

@SuppressWarnings("javadoc")
public abstract class HotelRoomDecorator implements IRoom {

	private IRoom hotelRoom = null;

	public HotelRoomDecorator(IRoom room) {
		this.hotelRoom = room;
	}

	public IRoom getHotelRoom() {
		return hotelRoom;
	}

}
