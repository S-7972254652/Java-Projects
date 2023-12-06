package com.springcoresetterinjection;

public class Employee {

	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeAddress;
	
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	
	public Employee(int employeeId, String employeeName, String employeeAddress) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAddress="
				+ EmployeeAddress + "]";
	}
	
	
	

}
