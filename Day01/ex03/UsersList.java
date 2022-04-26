class UserNotFoundException extends Exception {
	public String toString() {
		return "user with a non-existent ID";
	}
}

public interface UsersList {
	public void addUser(User user);

	public User retrieveUserById(Integer id) throws UserNotFoundException;

	public User retrieveUserByIndex(Integer index);

	public Integer retrieveNumberOfUsers();
}