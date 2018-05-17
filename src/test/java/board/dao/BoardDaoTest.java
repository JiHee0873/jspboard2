package board.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import board.model.BoardVO;

public class BoardDaoTest {


	@Test
	public void getBoardAllTest() {
		/***Given***/
		BoardDaoInf dao = BoardDao.getInstance();
		String fNotice_seq = "4";
		
		/***When***/
		List<BoardVO> listBoardVO = dao.getBoardAll(fNotice_seq);
		
		/***Then***/
		assertNotNull(listBoardVO);
		assertEquals(3, listBoardVO.size());
		
	}
	
	
	@Test 
	public void getBoardPageListTest(){
		/***Given***/
		BoardDaoInf dao = BoardDao.getInstance();
		int page = 2;

		/***When***/
//		List<BoardVO> boardList = dao.getBoardPageList(page);
		
		/***Then***/
//		assertNotNull(boardList);
//		assertEquals(8, boardList.size());
		
	}

}
