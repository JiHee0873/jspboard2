package notice.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import notice.model.NoticeVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * NoticeDao.java
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
public class NoticeDao implements NoticeDaoInf {
	
	private static NoticeDaoInf dao = new NoticeDao();
	
	private SqlSessionFactory sqlSessionFactory;
	
	private NoticeDao(){
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static NoticeDaoInf getInstance(){
		return dao;
	}

	
	@Override
	public List<NoticeVO> getNoticeAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<NoticeVO> listNotice = sqlSession.selectList("notice.getNoticeAll");
		sqlSession.close();
		return listNotice;
	}

	@Override
	public List<NoticeVO> getNotice(String notice_seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<NoticeVO> listNotice = sqlSession.selectList("notice.getNotice", notice_seq);
		sqlSession.close();
		return listNotice;
	}

	@Override
	public int noticeReg(NoticeVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int noticeRegOk = sqlSession.insert("notice.noticeReg", vo);
		sqlSession.commit();
		sqlSession.close();
		return noticeRegOk;
	}

}
