package c230926.sudentSev;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.student.StudentDAO;
import c230926.student.StudentVO;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(request.getParameter("id :"));
		StudentDAO dao = new StudentDAO();
        List<StudentVO> list = dao.getList();
        StudentVO student = null;
        if((request.getParameter("id")) != null) {
        		student = dao.getStudent(
        		Integer.parseInt(request.getParameter("id"))
        		);
        }
//        System.out.println(list.size());  
        
        String html = "<html>";
        
        html += "<head>";
        html += "<meta charset='UTF-8' />";
        html += "<title>";
        html += "학생목록";
        html += "</title>";
        html += "</head>";
        
        html += "<body>";
        if(student == null) {
        html += "<form action='Student' method='post'>";
        html += "<input type='text' name='student-id' placeholder='ID' />";
        html += "<input type='text' name='student-pw' placeholder='PASSWORD' />";
        html += "<button>로그인</button>";
        html += "</form>";
        }else {
        	html += "<div>";
        	html += student.getName() + "님 어서오세요.";
        	html += "</div>";
        	html += "<a href='./Student'>"
        			+ "<button>로그아웃</button>"
        			+ "</a>";
        }
        html += "<form action='Student'>";
        html += "<input type='text' id='id' name='id' placeholder='아이디'title ='아이디' />";
        html += "<br>";
        html += "<input type='password' id='pw' name='pw'placeholder='비밀번호' title='비밀번호' />";
        html += "<br>";
        html += "<input type='email' id='email' name='eamil'placeholder='이메일' title='이메일' />";
        html += "</form>";
        html += "</body>";
        html += "</html>";
        response.setCharacterEncoding("UTF-8");
//        System.out.println(html);
        response.getWriter().append(html);	
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */										//응답하다 						요청하다
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String studentId = request.getParameter("student-id");
		StudentDAO dao = new StudentDAO();
		StudentVO temp = dao.getStudent(studentId);
//		StudentVO temp1 = dao.getStudent1(studentPw);
		System.out.println(temp);
//		System.out.println(temp1);
		if(temp !=null && temp.getStudentPw().equals(request.getParameter("student-pw"))
				)response.sendRedirect("Student"+"?id="+temp.getIds());
		else
			response.sendRedirect("Student");
		
			
	}

}
