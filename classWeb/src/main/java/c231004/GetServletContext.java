package c231004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServletContext
 */
@WebServlet("/GetServletContext")
public class GetServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServletContext() {
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
		ServletContext context = getServletContext();
		
		List testArr = (ArrayList) context.getAttribute("testArr");
		
		InputStream is = context.getResourceAsStream("/WEB-INF/bin/test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//조금더 빨리 받아오기위해 사용
		
		StringTokenizer st = new StringTokenizer(br.readLine(),","); 
//		엔터 단위로 끊어서 가져온다. ","을 넣어서 , 단위로 끊어달라 지정 할 수있다.
		
		response.getWriter().print(context.getAttribute("test")+"<br />");
		response.getWriter().print(testArr.get(0)+"<br />");
		response.getWriter().print(testArr.get(1)+"<br />");
		response.getWriter().print(context.getInitParameter("test_xml")+"<br />");
		response.getWriter().print(br.readLine()+"<br />");
		response.getWriter().print(st.nextToken()+"<br />");
		response.getWriter().print(st.nextToken()+"<br />");
		//변수에 넣고싶으면 int temp = (Integer) testArr.get(1);
		//앞에 int만 넣는다면 무슨타입인지 모르기 때문에 에러 형변환해줘야함.
	} 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
