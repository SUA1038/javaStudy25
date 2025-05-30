package JavaTest.DTO;

public class MemberDTO {
	
	
	private String name ;	// 이름
	private String id ;		// 아이디
	private String pw ;		// 비밀번호
	private int StudentNum ;	// 학생번호
	
	private ScoreDTO scoreDTO;

	
	public MemberDTO(String name, String id, String pw, int age, String gender, int StudentNum) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.StudentNum = StudentNum;
	}




	public MemberDTO() {
		
	}




	public String getName() {
		return name;
	}




	public String getId() {
		return id;
	}




	public String getPw() {
		return pw;
	}



	public int getStudentNum() {
		return StudentNum;
	}




	public ScoreDTO getScoreDTO() {
		return scoreDTO;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setId(String id) {
		this.id = id;
	}




	public void setPw(String pw) {
		this.pw = pw;
	}




	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}




	public void setScoreDTO(ScoreDTO scoreDTO) {
		this.scoreDTO = scoreDTO;
	}




	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", id=" + id + ", pw=" + pw + ", StudentNum=" + StudentNum + ", scoreDTO="
				+ scoreDTO + "]";
	}






	

}
