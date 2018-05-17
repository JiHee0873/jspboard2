package board.service;

import java.util.List;
import java.util.Map;

import board.model.BoardVO;

public interface BoardServiceInf {

	List<BoardVO> getBoardAll(String fNotice_seq);

	public Map<String, Object> getBoardPageList(Map<String, Object> boardListMap);

}
