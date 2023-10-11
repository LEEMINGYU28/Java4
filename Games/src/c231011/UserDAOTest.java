package c231011;

public class UserDAOTest {
	public static void main(String[] args) throws Exception {
		OracleConnectionMaker maker = new OracleConnectionMaker();
		UserDAO dao = new UserDAO(maker);

		UserBean user = new UserBean();
		user.setName("임현규");
		user.setUserId("hk");
		user.setPassword("486");
		dao.add(user);

		System.out.println("추가 성공");

		UserBean createdUser = dao.get("hk");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassword());

	}
}
