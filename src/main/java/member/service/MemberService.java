package member.service;

import member.dao.MemberDao;
import member.dao.MemberDaoInf;
import member.model.MemberVO;


/**
 * MemberService.java
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
public class MemberService implements MemberServiceInf {
	
	private static MemberServiceInf service = new MemberService();
	
	private MemberDaoInf memDao;
	
	private MemberService(){
		memDao = MemberDao.getInstance();
	}
	
	public static MemberServiceInf getInstance(){
		return service;
	}

	@Override
	public MemberVO getMemberTotal(MemberVO memVO) {
		return memDao.getMemberTotal(memVO);
	}
	
	

}
