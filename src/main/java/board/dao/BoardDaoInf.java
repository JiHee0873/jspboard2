package board.dao;

import java.util.List;
import java.util.Map;

import board.model.BoardVO;

public interface BoardDaoInf {
	
	/**
	 * Method : getBoardAll
	 * 최초작성일 : 2018. 5. 16.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param fNotice_seq
	 * @return
	 * Method 설명 : 게시판번호에 맞는 게시글 모두 조회
	 */
	public List<BoardVO> getBoardAll(String fNotice_seq);

	/**
	 * Method : getBoardPageList
	 * 최초작성일 : 2018. 5. 16.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 게시글 페이지 리스트 조회
	 */
	public List<BoardVO> getBoardPageList(Map<String, Object> boardListMap);

	public int getBoardCnt(int notice_seq);

	

}
