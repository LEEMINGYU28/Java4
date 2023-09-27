package c230926.boardSev;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.board.BoardDAO;
import c230926.board.BoardDTO;
import c230926.board.BoardVO;


/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	private BoardDAO dao; 
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
        super.init();
    dao = new BoardDAO();    
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	ArrayList<BoardVO> boardList = dao.boardList();
    	
	String html = "<html>";
	html += "<head>";
	html += "<meta charset='UTF-8' />";
	html += "<title>";
	html += "게시판";
	html += "</title>";
	html += "<style>";
	html += "h2 { font-size: 16px; }";
	html += "</style>";
	html += "</head>";
	html += "<body>";
	html += "<h1>게시물 목록</h1>";
	html += "<hr/>";
	html += "<ul>";
	 for (BoardVO board : boardList) {
    html += "<li>";
    html += "<table border='1'>"; 
    html += "<th><h2>번호: " + board.getbId() + "</h2></th>";
    html += "<th><h2>제목: " + board.getbTitle() + "</h2></th>";
    html += "<th><h2>글쓴이:<a href='boardWrite ?bId="+ board.getbName() + "</h2></th>";
    html += "<h2>내용: " + board.getbContent() + "<br></h2>";
    html += "<a href='EditboardWrite?bId=" + board.getbId() + "'>수정</a> ";
    html += "<a href='DeleteBoard?bId=" + board.getbId() + "'>삭제</a>";
    html += "</table>";
    html += "</li>";
     }
	html += "</ul>";
	html += "<a href='./BoardWrite'>"
			+ "<button>글쓰기</button>"
			+ "</a>";
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
	}

}
