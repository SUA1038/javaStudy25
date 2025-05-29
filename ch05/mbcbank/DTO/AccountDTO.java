package ch05.mbcbank.DTO;

public class AccountDTO {
	// 객체
	private String ano; // 계좌번호
	private String owner ; // 계좌주
	private int balnce ; // 잔액
	private String bankName ; // 은행명

	
	
	// 생성자
	public AccountDTO(String ano, String owner, int balnce, String bankName) {
		// super();
		this.ano = ano;
		this.owner = owner;
		this.balnce = balnce;
		this.bankName = bankName;
	} // 생성자 종료


	// 기본생성자
	public AccountDTO() {
		// super();
	} // 기본생성자 종료


	// 메서드
	
	public String getAno() {
		return ano;
	}


	public String getOwner() {
		return owner;
	}


	public int getBalnce() {
		return balnce;
	}


	public String getBankName() {
		return bankName;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public void setBalnce(int balnce) {
		this.balnce = balnce;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balnce=" + balnce + ", bankName=" + bankName + "]";
	}
	
	
} // 클래스 종료
