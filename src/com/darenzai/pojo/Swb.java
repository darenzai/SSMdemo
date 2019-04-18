package com.darenzai.pojo;

public class Swb {
	int id;
	int dorm;
	
	String dengji;
	public String getDengji() {
		return dengji;
	}
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}

	String tongbao;
	String time;
	String reason;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDorm() {
		return dorm;
	}
	public void setDorm(int dorm) {
		this.dorm = dorm;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getTongbao() {
		return tongbao;
	}
	public void setTongbao(String tongbao) {
		this.tongbao = tongbao;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Swb [id=" + id + ",'s dorm=" + dorm + ", reason=" + reason + ", dengji=" + dengji + ", tongbao=" + tongbao
				+ ", time=" + time + "]";
	}
	
	
}
