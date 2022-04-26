public class Program {
	public static void main(String[] args) {
		UserIdsGenerator instance1 = UserIdsGenerator.getInstance();
		UserIdsGenerator instance2 = UserIdsGenerator.getInstance();

		System.out.println(instance1 == instance2);

		System.out.println(instance1.generateId() + " " + instance2.generateId());

		User rob = new User("Rob", 1000);
		User bob = new User("Bob", 2700);
		User mike = new User("Mike", 3900);
		User jimmy = new User("Jimmy", -1020);

		rob.printInfo();
		bob.printInfo();
		mike.printInfo();
		jimmy.printInfo();
	}
}