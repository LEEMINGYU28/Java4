package servletTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateServ
 */
@WebServlet("/create")
public class CreateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
//		response.sendRedirect("./first"); // 다른페이지로 바로 이동
		
		response.getWriter()
		.append("<html>")
		.append("<head>")
		.append("<meta charset='UTF-8' />"
				+"<title>추리게임</title>"
				+"<style>"
				+ "body {"
				+ "background-image:url('https://newsimg.sedaily.com/2021/05/24/22MHIKL7Y1_17.jpg');\r\n"
				+ "background-size : cover ;"
				+ "}"
				+ "</style>"
				+"</head>"
				+ "<body>"
				+ "<div style=\"font-size: 2.0em;\">"
				+ "<div style = \"position:absolute; left:860; top: 200;\">"
				+ "<font color=\"blue\">"
				+ "<h1>추리게임</h1>"
				+ "</font></br>"
				+ "</div>"
				+ "</div>"
				+ "<div style=\"position:absolute; left:880; top:560;\">"
				+ "<button style=\"font-size: 1.9em;\""
				+ "<button onclick=\"location.href='http://localhost/classWeb/game'\">게임시작하기</button>"
				+ "</html>")
		.append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
