package c230926.boardSev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.board.BoardDAO;

/**
 * Servlet implementation class BoardWrite
 */
@WebServlet("/BoardWrite")
public class BoardWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardDAO boardDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	super.init();
	boardDAO = new BoardDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
			//게시물 작성
		String html = "<html>";
	html += "<head>";  
	html += "<meta charset='UTF-8' />";
	html += "<title>";
	html += "게시물 작성";
	html += "</title>";
	html += "</head>";
	html += "<body>";
	html += "<h1>게시물 작성</h1>";
	html += "<form action='BoardWrite' method='post'>";
	html += "<label for='bName'>글쓴이";
	html += "</label>";
	html += "<input type='text' id='bName' name='bName'><br>";
	html += "<label for='bTitle'>제목";
	html +=	"</label>";
	html += "<input type'text' id='bTitle' name='bTitle'><br>";
	html += "<label for='bContent'>내용";
	html += "<label>";
	html += "<textarea id='bContent' name='bContent' rows='4' cols='50'>";
	html += "</textarea>";
	html += "<input type='submit' value='게시물 작성'>";
	html += "</form>";
	html += "</body>";
	html += "</html>";
	
	response.setCharacterEncoding("UTF-8");
	response.getWriter().append(html);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		doGet(request, response);
		String bName = request.getParameter("bName");
        String bTitle = request.getParameter("bTitle");
        String bContent = request.getParameter("bContent");

        // 게시물을 데이터베이스에 작성
        int result = boardDAO.write(bName, bTitle, bContent);
        
        // 응답 설정
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (result > 0) {
            // 게시물 작성 성공 시, 성공 메시지 출력
            response.getWriter().println("게시물 작성 성공");
        } else {
            // 게시물 작성 실패 시, 에러 메시지 출력
            response.getWriter().println("게시물 작성 실패");
        }
       
        out.close();
	}

}
