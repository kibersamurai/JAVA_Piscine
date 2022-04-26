public class Program {
	public static void main(String[] args) throws UserNotFoundException {
		UsersArrayList users = new UsersArrayList();
		for (int i = 0; i < 21; i++)
			users.addUser(new User("User_" + (i + 1), i  * 666));
		
			System.out.println("users count: " + users.retrieveNumberOfUsers());

			users.retrieveUserById(11).printInfo();

			users.retrieveUserByIndex(15).printInfo();

			if (users.retrieveUserByIndex(42) != null)
				users.retrieveUserByIndex(42).printInfo();
			else 
				System.out.println("Index 42 - user with a non-existent ID");
	}
}