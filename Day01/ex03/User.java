import java.util.UUID;

public class User {
	private final Integer id;
	private String name;
	private Integer balance;
	private TransactionsList transactions;

	public User(String name, Integer balance) {
		id = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = balance >= 0 ? balance : 0;
		transactions = new TransactionsLinkedList();
	}

	public Integer getId() { return this.id; }

	public String getName() { return this.name; }

	public Integer getBalance() { return this.balance; }

	public void printInfo() {
		System.out.printf("username: %s, id: %d, balance: %d\n", name, id, balance);
	}

	public void addTransaction(Transaction transaction) {
		transactions.addTransaction(transaction);
	}

	public void changeBalance(int value) { balance += value; }

	public void removeTransaction(UUID uuid) throws TransactionNotFoundException {
		transactions.remove(uuid);
	}

	public Transaction[] getTransactions() {
		return transactions.toArray();
	}
}