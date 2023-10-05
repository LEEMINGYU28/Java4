package c231004;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterTest
 */
@WebFilter("/api")
public class FilterTest extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FilterTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		
		//필터에서 세션을 한번 만들어 준다.
		HttpSession session = ((HttpServletRequest)request).getSession();
		//형 변환
		session.setAttribute("testing","ㅇㅎㅇㅎㅇ");
		request.setAttribute("userId","이민규");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("<html><head></head><body><h1>");
		// 값이 있다면 이민규라고 뜨게됨 게시글에 작성자 인지 판별 가능
		response.getWriter().print("</h1></body></html>");
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
