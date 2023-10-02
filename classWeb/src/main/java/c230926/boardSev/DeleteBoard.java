package c230926.boardSev;

import java.io.IOException;
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

               
                int result = boardDAO.deleteBoard(bId);

                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();

                if (result > 0) {
                    
                    out.println("게시물 삭제 성공");
                } else {
                    
                	out.println("게시물 삭제 실패");
                }

                out.close();
            } catch (Exception e) {
                out.close();
            }
        } else {
            out.close();
        }
    }
}
