package servletTest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
// HttpServlet extends GebericServlet : HTTP 기능을 갖고있는 클래스;
// GebericServlet implements Servlet, ServletConfig : 공통된 서블릿
// Servle : 서블릿 기본 메서드를 포함
// ServletConfig : 기본 기능을 포함한다.


public class FirstServ extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("요청 받아서 컨테이너 세팅");
	}
	
	@Override
	public void destroy() {
		System.out.println("컨테이너 종료시 삭제");
	}
	
	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse res
			) throws ServletException, IOException {
		System.out.println("Get 받았음");
	}
}
