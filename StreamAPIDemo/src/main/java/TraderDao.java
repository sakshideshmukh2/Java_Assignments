import java.util.Arrays;
import java.util.List;

public class TraderDao {

	public List<Trader> findAllTraders() {
		List<Trader> list = Arrays.asList(
			new Trader("Sakshi", "Indore"),
			new Trader("Dhruv", "Mumbai"),
			new Trader("Shivam", "Bhopal"),
			new Trader("Yash", "Pune"),
			new Trader("Diksha","Pune"),
			new Trader("Arun","Ujjain"));
		
		return list;
}
}