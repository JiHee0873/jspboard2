package member.dao;

import member.model.MemberVO;


/**
 * MemberDaoInf.java
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
public interface MemberDaoInf {
	
	/**
	 * Method : getMemberTotal
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : G.J.H
	 * 변경이력 :
	 * @param mem_id
	 * @return
	 * Method 설명 : 회원 상세 조회
	 */
	public MemberVO getMemberTotal(MemberVO memVO);
	
	

}
