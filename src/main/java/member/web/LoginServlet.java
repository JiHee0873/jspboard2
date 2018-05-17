package member.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.MemberVO;
import member.service.MemberService;
import member.service.MemberServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginUser")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberServiceInf service;
       
    public LoginServlet() {
        super();
        service = MemberService.getInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mem_id = request.getParameter("mem_id");
		String mem_pass = request.getParameter("mem_pass");
		
		MemberVO vo = new MemberVO();
		vo.setMem_id(mem_id);
		vo.setMem_pass(mem_pass);
		
		MemberVO memVO = service.getMemberTotal(vo);
		
		//세션에 아이디넣기
		HttpSession session = request.getSession();
		String userId = memVO.getMem_id();
		
		session.setAttribute("userId", userId);
		
		
//			RequestDispatcher rd = request.getRequestDispatcher("/boardUser");
		RequestDispatcher rd = request.getRequestDispatcher("/noticeUser");
		rd.forward(request, response);
	
	}

}
