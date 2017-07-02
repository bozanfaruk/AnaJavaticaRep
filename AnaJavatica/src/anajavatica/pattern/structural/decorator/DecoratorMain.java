package anajavatica.pattern.structural.decorator;

@SuppressWarnings("javadoc")
public class DecoratorMain {

	public static void main(String[] args) {

		IRoom classicRoom = new HotelRoom();
		IRoom doubleRoom = new DoubleHotelRoom(classicRoom);

		classicRoom.prepareRoom();
		doubleRoom.prepareRoom();

	}

}
