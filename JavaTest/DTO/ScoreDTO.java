package JavaTest.DTO;

public class ScoreDTO {
	
	private int kor ;
	private int eng ;
	private int mat ;
	
	
	
	
	public ScoreDTO() {
		super();
	}



	public ScoreDTO(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}


	
	
	
	

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
