package board.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.BoardVO;


/**
 * BoardDao.java
 *
 * @author G.J.H
 * @since 2018. 5. 15.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 15. G.J.H 최초 생성
 *
 * </pre>
 */
public class BoardDao implements BoardDaoInf {
	
	private static BoardDaoInf dao = new BoardDao();
	
	private SqlSessionFactory sqlSessionFactory;
	
	private BoardDao(){
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BoardDaoInf getInstance(){
		return dao;
	}

	@Override
	public List<BoardVO> getBoardAll(String fNotice_seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession(); 
		System.out.println("=======================================================");
		System.out.println("fNotice_seq : " + fNotice_seq);
		int board_notice_seq = Integer.parseInt(fNotice_seq);
		System.out.println("board_notice_seq" + board_notice_seq);
		List<BoardVO> listBoardVO = sqlSession.selectList("board.getBoardAll", board_notice_seq);
		sqlSession.close();
		return listBoardVO;
	}

	@Override
	public List<BoardVO> getBoardPageList(Map<String, Object> boardMap) {
		SqlSession sqlSession =  sqlSessionFactory.openSession();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("page", page);
//		map.put("notice_seq", notice_seq);
		
		List<BoardVO> boardList = sqlSession.selectList("board.getBoardPageList",boardMap);
		sqlSession.close();
		return boardList;
	}

	@Override
	public int getBoardCnt(int notice_seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int boardCnt = sqlSession.selectOne("board.getBoardCnt", notice_seq);
		sqlSession.close();
		return boardCnt;
	}
	
	

}
