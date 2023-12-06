package com.hbOne.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
@Id

@Column(name="Question-id")
private int qid;
private String Ques;
@OneToOne
private Answer ans;
public int getQid() {
	return qid;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int qid, String ques, Answer ans) {
	super();
	this.qid = qid;
	Ques = ques;
	this.ans = ans;
}
public String getQues() {
	return Ques;
}
public void setQues(String ques) {
	Ques = ques;
}
public Answer getAns() {
	return ans;
}
public void setAns(Answer ans) {
	this.ans = ans;
}
public void setQid(int qid) {
	this.qid = qid;
}

}