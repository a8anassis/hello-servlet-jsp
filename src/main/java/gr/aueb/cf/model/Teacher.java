package gr.aueb.cf.model;

public class Teacher {
	private Long id;
	private String ssn;
	private String firstname;
	private String lastname;
	
	public Teacher() {}
	
	
	public Teacher(Long id, String ssn, String firstname, String lastname) {
		super();
		this.id = id;
		this.ssn = ssn;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
