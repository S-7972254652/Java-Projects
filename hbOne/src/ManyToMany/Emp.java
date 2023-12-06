package ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
@Id
private int eid;
private String ename;
@ManyToMany
private List<Project> p;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public List<Project> getP() {
	return p;
}
public void setP(List<Project> p) {
	this.p = p;
}
public Emp(int eid, String ename, List<Project> p) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.p = p;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

}
