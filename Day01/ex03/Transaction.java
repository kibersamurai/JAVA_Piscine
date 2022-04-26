import java.util.UUID;

enum Category {
	CREDITS, DEBITS
}

public class Transaction {
	private Integer amount;
	private UUID identifier;
	private User sender;
	private User recipient;
	private Category category;
	private boolean success;

	public Transaction(User sender, User recipient, Category category, Integer amount) {
		identifier = UUID.randomUUID();
		this.recipient = recipient;
		this.sender = sender;
		this.category = category;
		this.amount = amount;
		if (category == Category.CREDITS) {
			if (sender.getBalance() - amount >= 0)
				success = true;
			if (amount < 0)
				success = false;
		}
		else {
			if (recipient.getBalance() + amount >= 0) 
				success = true;
			if (amount > 0)
				success = false;
		}
		if (success) {
			this.sender.changeBalance(-amount);
			this.recipient.changeBalance(amount);
		}
	}

	public UUID getIdentifier() { return identifier; }

	public User getRecipient() { return recipient; }

	public User getSender() { return sender; }

	public Integer getAmount() { return amount; }

	public Category getCategory() { return category; }

	public void printInfo() {
		System.out.printf("status - %s ", success ? "success" : "failure");
		System.out.printf("sender: %s, recipient: %s, category: %s, amount: %d, transaction id: %s\n", 
				sender.getName(), recipient.getName(), category, amount, identifier.toString());
	}
}