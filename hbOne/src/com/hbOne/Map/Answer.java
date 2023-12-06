package com.hbOne.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="Ans_id")
	private int aid;
	private String answ;
	public int getAid() {
		return aid;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aid, String answ) {
		super();
		this.aid = aid;
		this.answ = answ;
	}
	public String getAnsw() {
		return answ;
	}
	public void setAnsw(String answ) {
		this.answ = answ;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
}