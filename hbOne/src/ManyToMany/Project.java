package ManyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int pid;
@Column(name = "proj_name")
private String Pname;
@ManyToMany(mappedBy = "p")
private List<Emp> e;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public List<Emp> getE() {
	return e;
}
public void setE(List<Emp> e) {
	this.e = e;
}
public Project(int pid, String pname, List<Emp> e) {
	super();
	this.pid = pid;
	Pname = pname;
	this.e = e;
}
public Project() {
	super();
	// TODO Auto-generated constructor stub
}

}
