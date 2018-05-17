package board.dao;

import static org.junit.Assert.*;

import java.util.List;

import notice.dao.NoticeDao;
import notice.dao.NoticeDaoInf;
import notice.model.NoticeVO;

import org.junit.Before;
import org.junit.Test;

public class NoticeDaoTest {


	@Test
	public void getNoticeAllTest() {
		/***Given***/
		NoticeDaoInf dao = NoticeDao.getInstance();

		/***When***/
		List<NoticeVO> listNotice = dao.getNoticeAll();

		/***Then***/
		assertNotNull(listNotice);
		assertEquals(3, listNotice.size());

	}
	
	
	@Test
	public void noticeRegTest(){
		/***Given***/
		NoticeDaoInf dao = NoticeDao.getInstance();
		NoticeVO vo = new NoticeVO("누가바", "a001");
		
		/***When***/
		int noticeOk = dao.noticeReg(vo);
		
		/***Then***/
		assertNotNull(noticeOk);
		assertEquals(1, noticeOk);

	}

}
