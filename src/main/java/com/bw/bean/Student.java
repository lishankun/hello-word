package com.bw.bean;

public class Student {
	private int sid;
	private String sname;
	private String gender;
	private int age;
	private String cname;
	private String hobbys;
	public Student(int sid, String sname, String gender, int age, String cname, String hobbys) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.age = age;
		this.cname = cname;
		this.hobbys = hobbys;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", age=" + age + ", cname=" + cname
				+ ", hobbys=" + hobbys + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	
	
}
