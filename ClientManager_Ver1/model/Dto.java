package model;

public class Dto {

	private int idx;
	private String name;
	private String mail;
	private String phone;
	
	

	
	
	
	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
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


	public Dto(int idx2, String name2, String mail2, String phone2) {
		this.idx = idx;
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	}
	
		
	public Dto() {
		this(0,"","","");
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idx+","+name+","+mail+","+phone;
	}
	
	
	
	
}
