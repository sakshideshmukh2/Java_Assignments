import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionDao {
public List<Transaction> findAllTransactions() {
 final List<Transaction> list = Arrays.asList(
		 new Transaction("Sakshi", "Indore", 2011, 250),
			new Transaction("Dhruv", "Mumbai", 2013, 150),
			new Transaction("Shivam", "Bhopal", 2015, 200),
			new Transaction("Yash", "Pune", 2011, 180),
			new Transaction("Diksha","Pune", 2018, 300),
			new Transaction("Arun","Ujjain", 2016, 220));
 
return list;

}

}
