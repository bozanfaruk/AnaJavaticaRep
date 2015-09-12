package anajavatica.pattern.structural.facade;

public class GearFactory {

	private static GearFactory instance = new GearFactory();

	private GearFactory() {
	}

	public static GearFactory instance() {
		return instance;
	}

	public IGear buildGear(int gearType) {
		switch (gearType) {
		case IGear.GEAR_MAN:
			return new ManGear();
		case IGear.GEAR_AUTO:
			return new AutoGear();
		default:
			return null;
		}
	}

}
