package OneToM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salary {
	@Id
	@Column(name = "Sal_id")
	private int said;
	private int salary;
	
}
