package OneToMany;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Answer {
@Id
@Column(name = "Ans_id")
private int anid;
private String answ;
@ManyToOne
private Question question;
public int getAid() {
	return anid;
}
public void setAid(int aid) {
	this.anid = aid;
}
public String getAnsw() {
	return answ;
}
public void setAnsw(String answ) {
	this.answ = answ;
}
public Question getQuestion() {
		return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public Answer(int aid, String answ, Question question) {
	super();
	this.anid = aid;
	this.answ = answ;
	this.question = question;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}


}
