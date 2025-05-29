package ch04.MarioKart.dto;

public class MemberDTO {
	// 객체
	
	private String id;
	private String pw;
	private String nickName;
	private String email;
	
	private CharacterDTO characterDTO ; // 사용자가 선택한 캐릭터 연결용
	private CartDTO cartDTO ;
	
	// 생성자
	
	
	
	// 메서드
	
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
	public CharacterDTO getCharacterDTO() {
		return characterDTO;
	}
	public CartDTO getCartDTO() {
		return cartDTO;
	}
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
	public void setCharacterDTO(CharacterDTO characterDTO) {
		this.characterDTO = characterDTO;
	}
	public void setCartDTO(CartDTO cartDTO) {
		this.cartDTO = cartDTO;
	}
	
}
