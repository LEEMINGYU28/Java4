package c231004;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // 사과 주세요 == Apple Please == 링고 구다사이
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session = request.getSession();
		
		response.getWriter().println(session.getId()+"<br />");
		response.getWriter().println(session.getCreationTime()+"<br />"); //utc방식 숫자(int)로만 나타냄
		response.getWriter().println(session.getMaxInactiveInterval()+"<br />"); //세컨드로 표시
		response.getWriter().println(session.getLastAccessedTime()+"<br />"); //
		response.getWriter().println(session.getAttribute("test-session")+"<br />");

		session.setMaxInactiveInterval(10); //초단위로 넣는다. 로그인 만료시간
		
		session.setAttribute("test-session","하이염");
		//		session.invalidate(); // 세션을 즉시 삭제한다.
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
