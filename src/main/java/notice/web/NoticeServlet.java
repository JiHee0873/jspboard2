package notice.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.service.BoardServiceInf;
import notice.model.NoticeVO;
import notice.service.NoticeService;
import notice.service.NoticeServiceInf;

/**
 * Servlet implementation class NoticeServlet
 */
@WebServlet("/noticeUser")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NoticeServiceInf service;
       
    public NoticeServlet() {
        super();
        service = NoticeService.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 모든 게시판 조회
		List<NoticeVO> listNoticeVO = service.getNoticeAll();
		

		request.setAttribute("listNoticeVO", listNoticeVO);
		RequestDispatcher rd = request.getRequestDispatcher("/board/manageBoard.jsp");
		rd.forward(request, response);
		
	
	}

}
