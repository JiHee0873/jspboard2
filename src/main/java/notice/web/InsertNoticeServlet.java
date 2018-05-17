package notice.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import notice.model.NoticeVO;
import notice.service.NoticeService;
import notice.service.NoticeServiceInf;

/**
 * Servlet implementation class InsertNoticeServlet
 */
@WebServlet("/insertNotice")
public class InsertNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NoticeServiceInf service;
       
    public InsertNoticeServlet() {
        super();
        service = NoticeService.getInstance();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 게시판 추가
		HttpSession session = request.getSession();
		String notice_mem_id = (String) session.getAttribute("userId");
		System.out.println("notice_mem_id : " + notice_mem_id);
		String notice_title = request.getParameter("notice_title");
		System.out.println("notice_title : " + notice_title);
		
		NoticeVO vo = new NoticeVO(notice_title, notice_mem_id);
		
		int noticeRegOk = service.noticeReg(vo);
		
		if(noticeRegOk == 1){
			response.sendRedirect(request.getContextPath() +"/noticeUser");
		}
		
	}

}
