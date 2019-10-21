import java.util.Arrays;
import java.util.List;

public class FruitDao {
	
	public List<Fruit> findAllFruits() {
		List<Fruit> fruits = Arrays.asList(
			new Fruit("Orange", 50, 100, "Orange"),
			new Fruit("Grapes", 120, 50, "Green"),
			new Fruit("Papaya", 45, 80, "Yellow"),
			new Fruit("Apple", 110, 180, "Red"),
			new Fruit("Watermelon", 60, 70, "Dark Green"),
			new Fruit("Pomogranate", 130, 150, "Red"),
			new Fruit("Banana", 200, 40, "Yellow"));
		
		return fruits;
	}
}
