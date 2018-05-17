package board.service;

import static org.junit.Assert.*;
import member.dao.MemberDao;
import member.dao.MemberDaoInf;
import member.model.MemberVO;
import member.service.MemberService;
import member.service.MemberServiceInf;

import org.junit.Before;
import org.junit.Test;

public class MemberServiceTest {

	@Test
	public void getMemberTotalTest() {
		/***Given***/
		MemberServiceInf service = MemberService.getInstance();
		String mem_id = "a001";
		String mem_pass = "1234";
		MemberVO vo = new MemberVO();
		vo.setMem_id(mem_id);
		vo.setMem_pass(mem_pass);

		/***When***/
		MemberVO resultVO  = service.getMemberTotal(vo);

		/***Then***/
		assertNotNull(resultVO);
		assertEquals(vo.getMem_id(), resultVO.getMem_id());
		assertEquals(vo.getMem_pass(), resultVO.getMem_pass());

	}

}
