package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import factory.*;

//User의 DAO를 테스트
public class Test {

	public static void main(String[] args) throws Exception {
//		UserDAO dao = new DAOFactory().userDAO();

		//전체적인 데이터를 저장
		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
		UserDAO dao = context.getBean("userDAO", UserDAO.class);

//		UserDAO dao1 = context.getBean("userDAO", UserDAO.class);
//		UserDAO dao2 = context.getBean("userDAO", UserDAO.class);
//		System.out.println(dao1);
//		System.out.println(dao2);
//		
//		UserDAO dao3 = new DAOFactory().userDAO();
//		
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
