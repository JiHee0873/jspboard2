package board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dao.BoardDao;
import board.dao.BoardDaoInf;
import board.model.BoardVO;

public class BoardService implements BoardServiceInf {
	
	private static BoardServiceInf service =  new BoardService();
	
	private BoardDaoInf dao;
	
	private BoardService(){
		dao = BoardDao.getInstance();
	}
	
	public static BoardServiceInf getInstance(){
		return service;
	}

	@Override
	public List<BoardVO> getBoardAll(String fNotice_seq) {
		return dao.getBoardAll(fNotice_seq);
	}

	@Override
	public Map<String, Object> getBoardPageList(Map<String, Object> boardMap) {
	
		List<BoardVO> boardList = dao.getBoardPageList(boardMap);	
		int notice_seq = (int) boardMap.get("notice_seq");
		String pageNav = makePageNav(boardMap, dao.getBoardCnt(notice_seq));
			
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("boardList", boardList);
		map.put("pageNav", pageNav);
		
		return map;
	}

	private String makePageNav(Map<String, Object> boardListMap, int boardCnt) {
		
		int page = (int) boardListMap.get("page");
		int notice_seq = (int) boardListMap.get("notice_seq");
		String notice_title =  (String) boardListMap.get("notice_title");
		
		int pageCnt = (int)Math.ceil((double)boardCnt/10);
		
		// 총페이지 / 10
		StringBuffer pageNav = new StringBuffer();
		// 맨 왼쪽
		pageNav.append("<nav>");
		pageNav.append("   <ul class='pagination'>");
		pageNav.append("      <li>");
		pageNav.append("		<a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page=1' aria-label='Previous'>");
		pageNav.append("		  <span aria-hidden='true'>&laquo;</span>");
		pageNav.append("		</a>");
		pageNav.append("	  </li>");
		
		// 한칸씩 왼쪽
		
		pageNav.append("     <li>");
		pageNav.append("		<a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page=" + (page-1) + "'>");
		pageNav.append("		  <span aria-hidden='true'>&lt;</span>");
		pageNav.append("		</a>");
		pageNav.append("     </li>");
		
		
		// pageCnt 만큼 루프를 돌리기
		for(int i=1; i<=pageCnt; i++){
			if(i==page){
				pageNav.append("	<li class='active'><a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page=" + i+"'>"+ i +"</a></li>");
			}else{
				pageNav.append("	<li><a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page=" + i + "'>" + i +"</a></li>");
			}
		}

		
		// 한칸씩 오른쪽
		pageNav.append("     <li>");
		pageNav.append("		<a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page="+ (page+1) +"'>");
		pageNav.append("		  <span aria-hidden='true'>&gt;</span>");
		pageNav.append("		</a>");
		pageNav.append("     </li>");
		
		
		// 맨 오른쪽
		pageNav.append("	<li>");
		pageNav.append("	  <a href='boardUser?notice_seq="+ notice_seq +"&notice_title="+ notice_title +"&page="+pageCnt+"' aria-label='Next'>");
		pageNav.append("		<span aria-hidden='true'>&raquo;</span>");
		pageNav.append("      </a>");
		pageNav.append("	</li>");
		pageNav.append("  </ul>");
		pageNav.append("</nav>");
		
		return pageNav.toString();
	}
	
	
}
