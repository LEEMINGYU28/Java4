package c231004;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnotationTest
 */
@WebServlet(
		urlPatterns = { "/AnnotationTest","/AnnotationTest1" }, 
				//같은 서블릿을 호출해주는 라우터가 2개가 된다.
		initParams = { 
				@WebInitParam(name = "a_test_name", value = "권원준"), 
				@WebInitParam(name = "a_test_class", value = "Java 디지털 컨버전스")
								//String만 넣을 수 있다.ㄴ
		})
public class AnnotationTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnotationTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print(getInitParameter("a_test_name")+"<br />");
		response.getWriter().print(getInitParameter("a_test_class")+"<br />");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
