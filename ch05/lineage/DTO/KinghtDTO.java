package ch05.lineage.DTO;

public class KinghtDTO extends HumanDTO {

	private String sowrd ;
	private String Armor ;
	private String shield ;
	private String Name ;
	private String Gender ;
	private String leverl ;

	
	
	
	public String getSowrd() {
		return sowrd;
	}
	public String getArmor() {
		return Armor;
	}
	public String getShield() {
		return shield;
	}
	public String getName() {
		return Name;
	}
	public String getGender() {
		return Gender;
	}
	public String getLeverl() {
		return leverl;
	}
	
	
	public void setSowrd(String sowrd) {
		this.sowrd = sowrd;
	}
	public void setArmor(String armor) {
		Armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public void setLeverl(String leverl) {
		this.leverl = leverl;
	}
		
	
	
	public KinghtDTO() {
		super();
	}
	
	
	public KinghtDTO(String sowrd, String armor, String shield, String name, String gender, String leverl, String hp,
			String mp, String money) {
		super();
		this.sowrd = sowrd;
		Armor = armor;
		this.shield = shield;
		Name = name;
		Gender = gender;
		this.leverl = leverl;

	}
	
	
	
	
	
	
	
	
	
}
