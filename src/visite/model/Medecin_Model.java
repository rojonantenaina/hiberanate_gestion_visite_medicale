package visite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medecin")
public class Medecin_Model {
	
	@Id
	@Column(name = "medecin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medecinId;
	
	@Column(name = "medecin_code")
	private String medecinCode;
	
	@Column(name = "medecin_name")
	private String medecinName;
	
	@Column(name = "medecin_first_name")
	private String medecinFirstName;
	
	@Column(name = "medecin_grade")
	private String medecinGrade;

	public Integer getMedecinId() {
		return medecinId;
	}

	public void setMedecinId(Integer medecinId) {
		this.medecinId = medecinId;
	}

	public String getMedecinCode() {
		return medecinCode;
	}

	public void setMedecinCode(String medecinCode) {
		this.medecinCode = medecinCode;
	}

	public String getMedecinName() {
		return medecinName;
	}

	public void setMedecinName(String medecinName) {
		this.medecinName = medecinName;
	}

	public String getMedecinFirstName() {
		return medecinFirstName;
	}

	public void setMedecinFirstName(String medecinFirstName) {
		this.medecinFirstName = medecinFirstName;
	}

	public String getMedecinGrade() {
		return medecinGrade;
	}

	public void setMedecinGrade(String medecinGrade) {
		this.medecinGrade = medecinGrade;
	}
	
	
}
