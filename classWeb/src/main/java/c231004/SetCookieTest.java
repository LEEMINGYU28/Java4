package c231004;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetCookieTest
 */
@WebServlet("/SetCookieTest")
public class SetCookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookieTest() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/html;charset=utf-8");
		Cookie cookie = new Cookie("test-cookie", URLEncoder.encode("now testing cookies","utf-8"));
													//utf-8을 URLEncoder방식으로 바꿔달라.
//		cookie.setMaxAge(10);
		cookie.setMaxAge(-1);
		
		HttpSession session = request.getSession();
		//세션 불러서 유저 아이디가 있는지 getAttribute로 확인하고 
		//있다면 현재글을 적은 사람인가 확인할 수있다.
		//세션으로 추가해두고 다른 서블릿에서 사용할 수 있다.
		// 다른 서블릿에 요청하기 전에 필터에서 세션이라는 것을 중간처리를 해준다.
		
		response.addCookie(cookie);
		response.getWriter().print(session.getAttribute("testing"));
		response.getWriter().print(request.getAttribute("userId"));
		//	요청이 들어왔을때 응답을 하면서 이 쿠키를 설정하라는 의미
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
