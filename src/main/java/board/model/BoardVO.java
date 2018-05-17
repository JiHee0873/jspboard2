package board.model;

import java.util.Date;

public class BoardVO {
	
	private Integer board_seq;
	private Integer pboard_seq;
	private Integer board_notice_seq;
	private String board_mem_id;
	private Integer board_group_seq;
	private String board_title;
	private String board_content;
	private Date board_dt;
	private String board_del_yn;
	
	public Integer getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(Integer board_seq) {
		this.board_seq = board_seq;
	}
	public Integer getPboard_seq() {
		return pboard_seq;
	}
	public void setPboard_seq(Integer pboard_seq) {
		this.pboard_seq = pboard_seq;
	}
	public Integer getBoard_notice_seq() {
		return board_notice_seq;
	}
	public void setBoard_notice_seq(Integer board_notice_seq) {
		this.board_notice_seq = board_notice_seq;
	}
	public String getBoard_mem_id() {
		return board_mem_id;
	}
	public void setBoard_mem_id(String board_mem_id) {
		this.board_mem_id = board_mem_id;
	}
	public Integer getBoard_group_seq() {
		return board_group_seq;
	}
	public void setBoard_group_seq(Integer board_group_seq) {
		this.board_group_seq = board_group_seq;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public Date getBoard_dt() {
		return board_dt;
	}
	public void setBoard_dt(Date board_dt) {
		this.board_dt = board_dt;
	}
	public String getBoard_del_yn() {
		return board_del_yn;
	}
	public void setBoard_del_yn(String board_del_yn) {
		this.board_del_yn = board_del_yn;
	}
	
	

}
