package board.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.NoticeVO;
import notice.service.NoticeService;
import notice.service.NoticeServiceInf;
import board.model.BoardVO;
import board.service.BoardService;
import board.service.BoardServiceInf;

@WebServlet("/boardUser")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BoardServiceInf board_service;
	private NoticeServiceInf notice_service;
    
	
    public BoardServlet() {
        super();
        board_service = BoardService.getInstance();
        notice_service = NoticeService.getInstance();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setCharacterEncoding("utf-8");
    	response.setCharacterEncoding("utf-8");
    	
    	// 게시판 번호 가져오기
    	String fnotice_seq = (String)request.getParameter("notice_seq");
    	// 게시판 이름 가져오기
    	String notice_title = (String) request.getParameter("notice_title");
    	
    	// 게시글 모두 조회
    	List<BoardVO> listBoardVO = board_service.getBoardAll(fnotice_seq);
    	// 게시판 모두 조회
		List<NoticeVO> listNoticeVO = notice_service.getNoticeAll();
		
		
		/* 페이징 */
		String pageString = request.getParameter("page");
		
		int page = pageString == null ? 1 : Integer.parseInt(pageString);
		
		int notice_seq = Integer.parseInt(fnotice_seq);
		
		Map<String, Object> boardMap = new HashMap<String, Object>();
		boardMap.put("page", page);
		boardMap.put("notice_seq", notice_seq);
		boardMap.put("notice_title", notice_title);
		
		
		
		Map<String, Object> resultMap = board_service.getBoardPageList(boardMap);	
		
		
		// 게시판 이름 
		request.setAttribute("listNoticeVO", listNoticeVO);
		// 게시판 번호
		request.setAttribute("notice_seq", fnotice_seq);
		// 게시판 이름
		request.setAttribute("notice_title", notice_title);
		request.setAttribute("listBoardVO", listBoardVO);
		// 페이징
		request.setAttribute("listBoardVO", resultMap.get("boardList"));
		request.setAttribute("pageNav", resultMap.get("pageNav"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/categoryBoard.jsp");
		rd.forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
