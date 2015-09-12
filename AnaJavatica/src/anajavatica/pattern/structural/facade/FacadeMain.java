package anajavatica.pattern.structural.facade;

public class FacadeMain {

	public static void main(String[] args) {

		IGear manGear = GearFactory.instance().buildGear(IGear.GEAR_MAN);
		IGear autoGear = GearFactory.instance().buildGear(IGear.GEAR_AUTO);

		for (int i = 0; i < 10; i++) {
			System.out.println(manGear.gearUp());
			System.out.println(autoGear.gearUp());
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(manGear.gearDown());
			System.out.println(autoGear.gearDown());
		}

	}

}
