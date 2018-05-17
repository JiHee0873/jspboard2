package board.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import board.dao.BoardDao;
import board.dao.BoardDaoInf;
import board.model.BoardVO;

public class BoardServiceTest {

	@Test
	public void getBoardAllTest() {
		/***Given***/
		BoardServiceInf service = BoardService.getInstance();
		String fNotice_seq = "4";
		
		/***When***/
		List<BoardVO> listBoardVO = service.getBoardAll(fNotice_seq);
		
		/***Then***/
		assertNotNull(listBoardVO);
		assertEquals(3, listBoardVO.size());
		
	}
	
	
	@Test 
	public void getBoardPageListTest(){
		/***Given***/
		BoardServiceInf service = BoardService.getInstance();
		int page = 2;
		int notice_seq = 2;

		/***When***/
//		List<BoardVO> boardList = service.getBoardPageList(page);
//		Map<String, Object> map = service.getBoardPageList(page, notice_seq);
		
		/***Then***/
//		assertNotNull(map);
//		assertEquals("boardList", map.get("boardList"));
//		assertEquals("pageNav", map.get("pageNav"));
	}
	
	
	// 총페이지수 계산
	@Test
	public void boardPageCntTest(){
		/***Given***/
		int boardCnt = 14;

		/***When***/
		int pageCnt = (int)Math.ceil((double)boardCnt/10);

		/***Then***/
		assertEquals(2, pageCnt);

	}
	
	
}
