
public class Transaction {

	private String name;
	private String city;
	private int year;
	private int value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [name=" + name + ", city=" + city + ", year=" + year + ", value=" + value + "]";
	}

	public Transaction(String name, String city, int year, int value) {
		super();
		this.name = name;
		this.city = city;
		this.year = year;
		this.value = value;
	}

	public Transaction() {
		super();
	}

}
