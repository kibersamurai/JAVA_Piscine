public class User {
	private Integer id;
	private String name;
	private Integer balance;
	private static Integer userCount = 1;

	public User(String name, Integer balance) {
		id = userCount++;
		this.name = name;
		this.balance = balance >= 0 ? balance : 0;
	}

	public void changeBalance(int value) { balance += value; }

	public Integer getId() { return this.id; }

	public String getName() { return this.name; }

	public Integer getBalance() { return this.balance; }

	public void printInfo() {
		System.out.printf("username: %s, id: %d, balance: %d\n", name, id, balance);
	}
}