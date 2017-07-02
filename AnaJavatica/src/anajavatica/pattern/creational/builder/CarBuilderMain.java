package anajavatica.pattern.creational.builder;

import java.awt.Color;

@SuppressWarnings("javadoc")
public class CarBuilderMain {

	public static void main(String[] args) {

		CarBuilder carBuilder = new CarBuilder();

		Car carA = carBuilder.setCarColor(Color.black).setCarName("CarA").setHp(100).buildCar();
		Car carB = carBuilder.setCarColor(Color.white).setCarName("CarB").setHp(200).buildCar();

		System.out.println(carA.getCarColor());
		System.out.println(carA.getCarName());
		System.out.println(carA.getHp());

		System.out.println(carB.getCarColor());
		System.out.println(carB.getCarName());
		System.out.println(carB.getHp());

	}

}
