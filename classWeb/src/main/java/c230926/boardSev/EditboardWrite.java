@WebServlet("/Edit")
public class EditboardWrite extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BoardDAO boardDAO;

    public EditboardWrite() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {
        super.init();
        boardDAO = new BoardDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bIdParam = request.getParameter("bId");
        
        if (bIdParam != null && !bIdParam.isEmpty()) {
            try {
       
                int bId = Integer.parseInt(bIdParam);
                
            
                BoardVO board = boardDAO.getBoardById(bId);
                
                if (board != null) {
              
                    String html = "<html>";
                    html += "<head>";
                    html += "<meta charset='UTF-8' />";
                    html += "<title>게시물 수정</title>";
                    html += "</head>";
                    html += "<body>";
                    html += "<h1>게시물 수정</h1>";
                    html += "<form action='EditboardWrite' method='post'>";
                    html += "<input type='hidden' name='bId' value='" + bId + "'>"; // 수정할 게시물의 ID를 숨겨진 필드로 전달
                    html += "<label for='bName'>글쓴이</label>";
                    html += "<input type='text' id='bName' name='bName' value='" + board.getbName() + "'><br>";
                    html += "<label for='bTitle'>제목</label>";
                    html += "<input type='text' id='bTitle' name='bTitle' value='" + board.getbTitle() + "'><br>";
                    html += "<label for='bContent'>내용</label>";
                    html += "<textarea id='bContent' name='bContent' rows='4' cols='50'>" + board.getbContent() + "</textarea>";
                    html += "<input type='submit' value='게시물 수정'>";
                    html += "</form>";
                    html += "</body>";
                    html += "</html>";

                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().append(html);
                } else {
                  
                    response.getWriter().println("해당 게시물을 찾을 수 없습니다.");
                }
            } catch (NumberFormatException e) {
                                response.getWriter().println("잘못된 요청입니다.");
            }
        } else {
      
            response.getWriter().println("잘못된 요청입니다.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        
        int bId = Integer.parseInt(request.getParameter("bId"));
        String bName = request.getParameter("bName");
        String bTitle = request.getParameter("bTitle");
        String bContent = request.getParameter("bContent");
        
        int result = boardDAO.updateBoard(bId, bName, bTitle, bContent);
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (result > 0) {
    
            out.println("게시물 수정 성공");
        } else {

            out.println("게시물 수정 실패");
        }

        out.close();
    }
}
