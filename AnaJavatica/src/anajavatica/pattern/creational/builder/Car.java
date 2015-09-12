package anajavatica.pattern.creational.builder;

import java.awt.Color;

public class Car {

	private Color carColor = null;

	private String carName = "";

	private int hp = 0;

	public Car(CarBuilder carBuilder) {
		this.carColor = carBuilder.getCarColor();
		this.carName = carBuilder.getCarName();
		this.hp = carBuilder.getHp();
	}

	public Color getCarColor() {
		return carColor;
	}

	public String getCarName() {
		return carName;
	}

	public int getHp() {
		return hp;
	}

}
