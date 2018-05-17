package notice.service;

import java.util.List;

import notice.dao.NoticeDao;
import notice.dao.NoticeDaoInf;
import notice.model.NoticeVO;


/**
 * NoticeService.java
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
public class NoticeService implements NoticeServiceInf {
	
	private static NoticeServiceInf service = new NoticeService();
	
	private NoticeDaoInf dao;
	
	private NoticeService(){
		dao = NoticeDao.getInstance();
	}
	
	public static NoticeServiceInf getInstance(){
		return service;
	}

	
	@Override
	public List<NoticeVO> getNoticeAll() {
		return dao.getNoticeAll();
	}

	@Override
	public List<NoticeVO> getNotice(String notice_seq) {
		return dao.getNotice(notice_seq);
	}

	
	@Override
	public int noticeReg(NoticeVO vo) {
		return dao.noticeReg(vo);
	}
	
	

}
