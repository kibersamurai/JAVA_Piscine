public class Program {
	public static void main(String[] args) {
		User rob = new User("ROB", 2700);
		User bob = new User("Bob", 3000);

		rob.printInfo();
		bob.printInfo();

		Transaction transaction1 = new Transaction(rob, bob, 2000);

		rob.printInfo();
		bob.printInfo();
		transaction1.printInfo();
		rob.printInfo();
		bob.printInfo();

		Transaction transaction2 = new Transaction(rob, bob, 10000);
		transaction2.printInfo();
		rob.printInfo();
		bob.printInfo();
	}
}