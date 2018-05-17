package member.dao;

import java.io.IOException;
import java.io.InputStream;

import member.model.MemberVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * MemberDao.java
 *
 * @author G.J.H
 * @since 2018. 5. 14.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 14. G.J.H 최초 생성
 *
 * </pre>
 */
public class MemberDao implements MemberDaoInf {
	
	private static MemberDaoInf memDao = new MemberDao();
	
	private SqlSessionFactory sqlSessionFactory;
	
	private MemberDao(){
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static MemberDaoInf getInstance(){
		return memDao;
	}
	
	
	/**
	 * 
	 * Method : getMemberTotal
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param mem_id
	 * @return
	 * Method 설명 : 회원 상세 조회
	 */
	@Override
	public MemberVO getMemberTotal(MemberVO memVO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MemberVO vo  = sqlSession.selectOne("member.getMemberTotal", memVO);
		sqlSession.close();
		return vo;
	}

}
