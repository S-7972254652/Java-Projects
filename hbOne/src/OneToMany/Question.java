package OneToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
@Id
@Column(name = "Question-id")
private int qid;
private String Ques;
@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
private List<Answer>ans;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQues() {
	return Ques;
}
public void setQues(String ques) {
	Ques = ques;
}
public List<Answer> getAns() {
	return ans;
}
public void setAns(List<Answer> ans) {
	this.ans = ans;
}
public Question(int qid, String ques, List<Answer> ans) {
	super();
	this.qid = qid;
	Ques = ques;
	this.ans = ans;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}

}
