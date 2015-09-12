package anajavatica.pattern.structural.flyweight;

public class FlyweightMain {
	public static void main(String[] args) {
		RoadRunner runner = new RoadRunner();
		runner.fillRoad();
		runner.fillRoadWithFlyweight();
	}

}