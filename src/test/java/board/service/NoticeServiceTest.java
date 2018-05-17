package board.service;

import static org.junit.Assert.*;

import java.util.List;

import notice.dao.NoticeDao;
import notice.dao.NoticeDaoInf;
import notice.model.NoticeVO;
import notice.service.NoticeService;
import notice.service.NoticeServiceInf;

import org.junit.Before;
import org.junit.Test;

public class NoticeServiceTest {


	@Test
	public void getNoticeAllTest() {
		/***Given***/
		NoticeServiceInf service = NoticeService.getInstance();

		/***When***/
		List<NoticeVO> listNotice = service.getNoticeAll();

		/***Then***/
		assertNotNull(listNotice);
		assertEquals(3, listNotice.size());

	}
	
	
	@Test
	public void noticeRegTest(){
		/***Given***/
		NoticeServiceInf service = NoticeService.getInstance();
		NoticeVO vo = new NoticeVO("수박바", "a001");
		
		/***When***/
		int noticeOk = service.noticeReg(vo);
		
		/***Then***/
		assertNotNull(noticeOk);
		assertEquals(1, noticeOk);

	}

}
