import java.util.UUID;

public class Program {
	public static void main(String[] args) {
		User jimmy = new User("Jimmy", 4200);
		User rob = new User("rob", 2100);
		User mike = new User("Mike", 6600);
		User bob = new User("Bob", -1200);

		Transaction transaction1 = new Transaction(rob, jimmy, Category.DEBITS , -2000);
		Transaction transaction2 = new Transaction(rob, jimmy, Category.CREDITS, 5000);
		Transaction transaction3 = new Transaction(mike, bob, Category.CREDITS, 1500);
		Transaction transaction4 = new Transaction(mike, bob, Category.DEBITS, -1000);
		Transaction transaction5 = new Transaction(rob, mike, Category.DEBITS, -340);
		Transaction transaction6 = new Transaction(mike, jimmy, Category.CREDITS, 1000);

		TransactionsLinkedList list = new TransactionsLinkedList();
		list.addTransaction(transaction1);
		list.addTransaction(transaction2);
		list.addTransaction(transaction3);
		list.addTransaction(transaction4);
		list.addTransaction(transaction5);
		list.addTransaction(transaction6);

		Transaction[] array = list.toArray();
		for (int i = 0; i < array.length; i++)
			array[i].printInfo();
		System.out.println("\n");

		list.remove(transaction1.getIdentifier());

		array = list.toArray();
		for (int i = 0; i < array.length; i++)
			array[i].printInfo();
		System.out.println("\n");

		list.remove(transaction4.getIdentifier());

		array = list.toArray();
		for (int i = 0; i < array.length; i++)
			array[i].printInfo();
		System.out.println("\n");

	   list.remove(transaction6.getIdentifier());

		array = list.toArray();
		for (int i = 0; i < array.length; i++)
			array[i].printInfo();
		System.out.println("\n");
	}
}
