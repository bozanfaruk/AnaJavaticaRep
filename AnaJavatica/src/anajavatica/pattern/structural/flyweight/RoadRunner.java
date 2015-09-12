package anajavatica.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoadRunner {
	private Obstacle[] road = new Obstacle[10000];
	private Map<String, Obstacle> map = new HashMap<String, Obstacle>();

	public void fillRoad() {
		int counter = 0;
		for (int i = 0; i < road.length; i++) {
			int mode = i % 4;
			switch (mode) {
			case 1:
				road[i] = new Rock();
				counter++;
				break;
			case 2:
				road[i] = new Water();
				counter++;
				break;
			case 3:
				road[i] = new Pit();
				counter++;
				break;
			}
		}
		System.out.println(counter + " objects created...");
	}

	public void fillRoadWithFlyweight() {
		int counter = 0;
		for (int i = 0; i < road.length; i++) {
			int mode = i % 4;
			switch (mode) {
			case 1:
				if (!map.containsKey("Rock")) {
					map.put("Rock", new Rock());
					counter++;
				}
				road[i] = map.get("Rock");
				break;
			case 2:
				if (!map.containsKey("Water")) {
					map.put("Water", new Water());
					counter++;
				}
				road[i] = map.get("Water");
				break;
			case 3:
				if (!map.containsKey("Pit")) {
					map.put("Pit", new Pit());
					counter++;
				}
				road[i] = map.get("Pit");
				break;
			}
		}
		System.out.println(counter + " objects created...");
	}

}