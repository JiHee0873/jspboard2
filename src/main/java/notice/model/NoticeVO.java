package notice.model;

import java.util.Date;

public class NoticeVO {
	
	private Integer notice_seq;
	private String notice_title;
	private String notice_mem_id;
	private Date notice_dt;
	private String notice_yn;
	
	
	
	public NoticeVO() {
		super();
	}


	public NoticeVO(String notice_title, String notice_mem_id) {
		this.notice_title = notice_title;
		this.notice_mem_id = notice_mem_id;
	}
	
	
	public Integer getNotice_seq() {
		return notice_seq;
	}
	public void setNotice_seq(Integer notice_seq) {
		this.notice_seq = notice_seq;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_mem_id() {
		return notice_mem_id;
	}
	public void setNotice_mem_id(String notice_mem_id) {
		this.notice_mem_id = notice_mem_id;
	}
	public Date getNotice_dt() {
		return notice_dt;
	}
	public void setNotice_dt(Date notice_dt) {
		this.notice_dt = notice_dt;
	}
	public String getNotice_yn() {
		return notice_yn;
	}
	public void setNotice_yn(String notice_yn) {
		this.notice_yn = notice_yn;
	}
	
	
	

}
