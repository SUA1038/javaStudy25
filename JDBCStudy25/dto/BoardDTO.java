package dto;

import java.sql.Date;

public class BoardDTO {

	// 필드
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;

	
	// 기본 생성자
	public BoardDTO() {
		super();
	}



	
	
	// 메서드 (게터/세터)
	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getBtitle() {
		return btitle;
	}


	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public String getBwriter() {
		return bwriter;
	}


	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	
}
