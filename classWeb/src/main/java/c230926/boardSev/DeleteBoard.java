package c230926.boardSev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.board.BoardDAO;

@WebServlet("/DeleteBoard")
public class DeleteBoard extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BoardDAO boardDAO;

    public DeleteBoard() {
        super();
    }

    public void init() throws ServletException {
        super.init();
        boardDAO = new BoardDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String bIdParam = request.getParameter("bId");

        if (bIdParam != null && !bIdParam.isEmpty()) {
            try {
                
                int bId = Integer.parseInt(bIdParam);

               
                int result = boardDAO.delete(bId);

                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();

                if (result > 0) {
                    
                    out.println("게시물 삭제 성공");
                    out.println("<a href='Board'>메인 페이지로 돌아가기</a>");
                } else {
                    
                	out.println("게시물 삭제 실패");
                	out.println("<a href='Board'>메인 페이지로 돌아가기</a>");
                }

                out.close();
            } catch (Exception e) {
                
            }
        } else {
            
        }
    }
}
