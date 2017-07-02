package anajavatica.pattern.creational.builder;

import java.awt.Color;

@SuppressWarnings("javadoc")
public class CarBuilder {

	private Color carColor = null;

	private String carName = "";

	private int hp = 0;

	public Color getCarColor() {
		return carColor;
	}

	public CarBuilder setCarColor(Color carColor) {
		this.carColor = carColor;
		return this;
	}

	public String getCarName() {
		return carName;
	}

	public CarBuilder setCarName(String carName) {
		this.carName = carName;
		return this;
	}

	public int getHp() {
		return hp;
	}

	public CarBuilder setHp(int hp) {
		this.hp = hp;
		return this;
	}

	public Car buildCar() {
		return new Car(this);
	}

}
