package ch05.lineage.DTO;

public class AccountDTO {
	
	// 필드
	private String id ;
	private String pw ;
	private String nickName ;
	private String email ;
	private ElfDTO elfDTO ;
	private KinghtDTO kinghtDTO ;
	
	

	// 생성자
	public AccountDTO() {
		super();
	}
	
	
	
	
	
	
	public AccountDTO(String id, String pw, String nickName, String email, ElfDTO elfDTO, KinghtDTO kinghtDTO) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.email = email;
		this.elfDTO = elfDTO;
		this.kinghtDTO = kinghtDTO;
	}






	// 메서드
	// getter
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}
	public String getEmail() {
		return email;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public KinghtDTO getKinghtDTO() {
		return kinghtDTO;
	}
	
	
	// setter
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public void setKinghtDTO(KinghtDTO kinghtDTO) {
		this.kinghtDTO = kinghtDTO;
	}






	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", pw=" + pw + ", nickName=" + nickName + ", email=" + email + ", elfDTO="
				+ elfDTO + ", kinghtDTO=" + kinghtDTO + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
