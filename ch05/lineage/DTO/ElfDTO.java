package ch05.lineage.DTO;

public class ElfDTO extends HumanDTO {
	
	private String bow ;
	private String dress ;
	private String arrow ;
	private String name ;
	private String gender ;
	private String level ;

	
	
	
	public String getBow() {
		return bow;
	}
	public String getDress() {
		return dress;
	}
	public String getArrow() {
		return arrow;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getLevel() {
		return level;
	}

	
	public void setBow(String bow) {
		this.bow = bow;
	}
	public void setDress(String dress) {
		this.dress = dress;
	}
	public void setArrow(String arrow) {
		this.arrow = arrow;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	
	
	
	
	public ElfDTO() {
		super();
	}
	
	
	
	public ElfDTO(String bow, String dress, String arrow, String name, String gender, String level, String hp,
			String mp, String money) {
		super();
		this.bow = bow;
		this.dress = dress;
		this.arrow = arrow;
		this.name = name;
		this.gender = gender;
		this.level = level;

	}

	
	
	
	
	
	
	
	
	
}
