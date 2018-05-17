package notice.dao;

import java.util.List;

import notice.model.NoticeVO;


/**
 * NoticeDaoInf.java
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
public interface NoticeDaoInf {
	
	/**
	 * Method : getNoticeAll
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @return
	 * Method 설명 : 게시판 전체 정보 조회
	 */
	public List<NoticeVO> getNoticeAll();
	
	/**
	 * Method : getNotice
	 * 최초작성일 : 2018. 5. 15.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param notice_yn
	 * @return
	 * Method 설명 : 활성화된 게시판 정보 조회
	 */
	public List<NoticeVO>getNotice(String notice_seq);

	
	/**
	 * Method : noticeReg
	 * 최초작성일 : 2018. 5. 16.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param vo
	 * @return
	 * Method 설명 : 게시판 추가 
	 */
	public int noticeReg(NoticeVO vo);
	
	
	
}
