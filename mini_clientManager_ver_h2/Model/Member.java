package Model;

public class Member {

	private int no;
	private String name;
	private String mail;
	private String phone;

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", mail=" + mail + ", phone=" + phone + "]";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Member() {
		this(0, "", "", "");

	}

	
	public Member(int no, String name, String mail, String phone) {
		this.no = no;
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	}

}
