package c230926.boardSev;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	String html = "<html>";
	
	html += "<head>";
	html += "<meta charset='UTF-8' />";
	html += "<title>";
	html += "게시판";
	html += "</title>";
    html += "<style>";
    html += "table {";
    html += "text-align: center;";
    html += "margin: 0 auto;";
    html += "margin-top: 20px;";
    html +=	"}";
    html +=	".writeBtn {";
    html +=	"text-decoration: none;";    
    html +=	"color: black;";
    html +=	"border: 1px solid #000;";
    html +=	"padding: 10px 20px;";
    html +=	"display: flex;";
    html +=	"margin: 0 auto;";
    html +=	"justify-content: center;";
    html += "align-items: center;";
    html += "width: 100px;";
    html += "margin-top: 50px;";
    html +=	"}"
	html +=	"</style>";
	html += "<body>";
	html += "<div>";
	html += "<h1>게시판</h1>";
	html += "</div>";
	html += "<div>";
	html +="<a class='writeBtn' href="">글작성하기</a>";
    html +="<table>";
    html +="<th>글번호</th>";
    html +="<th>제목</th>";
    html +="<th>작성자</th>";
    html +="<tr>";
    html +="<td>1</td>";
    html +="<td><a href="#">쓴 글 1</a></td>";
    html +="<td></td>";
    html +="</tr>";
    html +="<tr>";
    html +="<td>2</td>";
    html +="<td>쓴 글 2</td>";
    html +="<td></td>";
    html +="</tr>";
    html +="</table>";
	html += "</div>";
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
