package comments.model;

public class CommentsVO {
	
	private Integer cmt_seq;
	private Integer cmt_board_seq;
	private String cmt_content;
	private String cmt_dt;
	private String cmt_yn;
	private String cmt_mem_id;
	
	public Integer getCmt_seq() {
		return cmt_seq;
	}
	public void setCmt_seq(Integer cmt_seq) {
		this.cmt_seq = cmt_seq;
	}
	public Integer getCmt_board_seq() {
		return cmt_board_seq;
	}
	public void setCmt_board_seq(Integer cmt_board_seq) {
		this.cmt_board_seq = cmt_board_seq;
	}
	public String getCmt_content() {
		return cmt_content;
	}
	public void setCmt_content(String cmt_content) {
		this.cmt_content = cmt_content;
	}
	public String getCmt_dt() {
		return cmt_dt;
	}
	public void setCmt_dt(String cmt_dt) {
		this.cmt_dt = cmt_dt;
	}
	public String getCmt_yn() {
		return cmt_yn;
	}
	public void setCmt_yn(String cmt_yn) {
		this.cmt_yn = cmt_yn;
	}
	public String getCmt_mem_id() {
		return cmt_mem_id;
	}
	public void setCmt_mem_id(String cmt_mem_id) {
		this.cmt_mem_id = cmt_mem_id;
	}
	
	

}
