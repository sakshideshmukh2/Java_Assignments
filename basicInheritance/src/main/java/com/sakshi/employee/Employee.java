package com.sakshi.employee;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double hra, double medical, double pf,
			double pt, double netSalary, double grossSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.medical = medical;
		this.pf = pf;
		this.pt = pt;
		this.netSalary = netSalary;
		this.grossSalary = grossSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public double setHra(double hra) {
		return this.hra = 0.5 * getBasicSalary();
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPf() {
		return pf;
	}

	public double setPf(double pf) {
		return this.pf = 0.12 * getBasicSalary();
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public double setNetSalary(double netSalary) {
		return this.netSalary = getGrossSalary() - (getPt() + getPf());
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double setGrossSalary() {
		this.grossSalary = getBasicSalary() + getHra() + getMedical();
		return grossSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]";
	}

	public double setGrossSalary1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
