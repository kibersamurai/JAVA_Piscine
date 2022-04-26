public class UserIdsGenerator {
	private static Integer id = 1;
	private static UserIdsGenerator instance;

	private UserIdsGenerator () {}

	public static UserIdsGenerator getInstance() {
		if (instance == null) {
			instance = new UserIdsGenerator();
		}
		return instance;
	}

	public Integer generateId() { return id++; }
}