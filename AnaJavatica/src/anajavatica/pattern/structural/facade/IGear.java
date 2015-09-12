package anajavatica.pattern.structural.facade;

public interface IGear {

	public static final int GEAR_MAN = 1;

	public static final int GEAR_AUTO = 2;

	public int gearUp();

	public int gearDown();

}
