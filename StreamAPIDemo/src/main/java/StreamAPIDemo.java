import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {

//		FruitDao dao = new FruitDao();
//		List<Fruit> list = dao.findAllFruits();

		// <<----------------- fruits less than 100 calories --------------------->>

//		Comparator<Fruit> c = (f1, f2) -> {
//			int result = Double.compare(f2.getCalories(), f1.getCalories());
//			return result;
//		};
//
//		Predicate<Fruit> p = (e) -> e.getCalories() < 100;
//		List<Fruit> l = list.stream().filter(p).sorted(c).collect(Collectors.toList());
//
//		l.forEach(e -> System.out.println(e));

		// <<---------------------- Display color wise list of fruit names ---------------------->>

//		Predicate<Fruit> p = (e) -> e.getColor().equals("Yellow");
//
//		List<Fruit> color = list.stream().filter(p).collect(Collectors.toList());
//
//		color.forEach(e -> System.out.println(e));
//
//		Predicate<Fruit> p1 = (e) -> e.getColor().equals("Green");
//
//		List<Fruit> color2 = list.stream().filter(p1).collect(Collectors.toList());
//
//		color2.forEach(e -> System.out.println(e));

		// <<--------------- only RED color fruits sorted as per their price in ascending order ---------------->>

//		Comparator<Fruit> c = (f1, f2) -> {
//			int result = Integer.compare(f1.getPrice(),f2.getPrice());
//			return result;
//		};
//			Predicate<Fruit> p = (e) -> e.getColor().equals("Yellow");
//			
//				List<Fruit> color = list.stream().filter(p).sorted(c).collect(Collectors.toList());
//		
//				color.forEach(e -> System.out.println(e));


		// <<------------------- Display all the unique cities where the traders work ----------------------->>

//		TraderDao dao = new TraderDao();
//		List<Trader> list = dao.findAllTraders();
//				
//		List<String> uniqueNames = list.stream()
//		              				    .map((e) -> e.getCity())
//		              				    .distinct()
//		               					.collect(Collectors.toList());
//		
//		uniqueNames.forEach(e -> System.out.println(e));

//		<<------------------------ Find all traders from Pune and sort them by name ------------------------->>

//		Predicate<Trader> p = (e) -> e.getCity().equals("Pune");
//		
//				List<Trader> color = list.stream().filter(p).collect(Collectors.toList());
//		
//				color.forEach(e -> System.out.println(e));

//		<<----------------------- Return a string of all traders’ names sorted alphabetically --------------------->>

//		
//		Comparator<Trader> c = (Trader t1, Trader t2) ->
//        t1.getName().compareTo( t2.getName() );
//		
//		List<Trader> sortedNames = list.stream()
//		               					.sorted(c)
//		               					.collect(Collectors.toList());
//		
//		sortedNames.forEach(e -> System.out.println(e));

//		<<------------------------- Are any traders based in Indore -------------------------->>

//		Predicate<Trader> p = (e) -> e.getCity().equals("Indore");
//		
//				List<Trader> trader = list.stream().filter(p).collect(Collectors.toList());
//		
//				trader.forEach(e -> System.out.println(e));

//		<<------------------- Print all transactions’ values from the traders living in Delhi -------------------->>

		TransactionDao dao = new TransactionDao();
		List<Transaction> list = dao.findAllTransactions();
//
//		List<String> traders = list.stream().filter(e -> e.getCity().equals("Delhi")).map((t) -> t.getName())
//				.collect(Collectors.toList());
//		traders.forEach(e -> System.out.println(e));

//		<<-------------------------- Highest value of all the transactions ----------------------------->>

//		int highestTransactions = list.stream().mapToInt(e -> e.getValue()).max().getAsInt();
//
//		System.out.println("Highest Transaction: " + highestTransactions);

//		<<------------------------- Smallest Value of all the transactions ----------------------------->>

//		int smallestTransactions = list.stream().mapToInt(e -> e.getValue()).min().getAsInt();
//
//		System.out.println("Highest Transaction: " + smallestTransactions);
		
//		<<----------------- all transactions in the year 2011 and sort them by value (small to high) ------------------>>
		
		Comparator<Transaction> c = (t1,t2) -> {
			int result = Integer.compare(t1.getValue(), t2.getValue());
			if(result==0)
				t1.getName().compareTo(t2.getName());
			return result;
		};
		List<Transaction> allTransaction = list.stream().filter((e)-> e.getYear() == 2011)
		               					.sorted(c)
		               					.collect(Collectors.toList());
		
		allTransaction.forEach(e -> System.out.println(e));
	}
}
