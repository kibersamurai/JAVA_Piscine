import java.util.UUID;

class TransactionNotFoundException extends RuntimeException {
	public String toString() {
		return "transaction with non-existent ID";
	}
}

public interface TransactionsList {
	public void addTransaction(Transaction transaction);

	public void remove(UUID uuid) throws TransactionNotFoundException;

	public Transaction[] toArray();
}