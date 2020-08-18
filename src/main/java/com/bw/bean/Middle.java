package com.bw.bean;

public class Middle {
	private int sid;
	private int cid;
	public Middle(int sid, int cid) {
		super();
		this.sid = sid;
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Middle [sid=" + sid + ", cid=" + cid + "]";
	}
	public Middle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
