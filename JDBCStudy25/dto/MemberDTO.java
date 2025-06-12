package dto;

import java.sql.Date;

public class MemberDTO {

	private int mno;
	private String bwriter ;
	private String id ;
	private String pw ;
	private Date regidate;

	// 기본 생성자
	public MemberDTO() {
		super();
	}

	// 메서드 (게터/세터)
	public int getMno() {
		return mno;
	}

	public String getBwriter() {
		return bwriter;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public Date getRegidate() {
		return regidate;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	
	
} /// 클래스 종료
