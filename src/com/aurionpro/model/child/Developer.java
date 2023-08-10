package com.aurionpro.model.child;

import com.aurionpro.model.Employee;

public class Developer extends Employee {

	private double pa;
	private double ota;

	public Developer(int id, String name, double basic) {
//		super(id, name, basic);
		
		this.id = id;
		this.name = name;
		this.basic = basic;
		
		this.pa = basic * 0.25;
		this.ota = basic * 0.1;
	}

	public double getPa() {
		return pa;
	}

	public void setPa(double pa) {
		this.pa = pa;
	}

	public double getOta() {
		return ota;
	}

	public void setOta(double ota) {
		this.ota = ota;
	}

	public double calculateMonthlySalary() {

		return (this.basic+pa+ota);
	}

	public double calculateAnnualCtc() {

		return calculateMonthlySalary()*12;
	}

	@Override
	public String toString() {
		return "\nRole: Developer \n\nid = " + this.id + "\nname = " + this.name + "\nbasic salary = "				// NO GETTERS & SETTERS
				+ this.basic + "\npa = " + pa + "\nota = " + ota + "\nMonthly Salary ="
				+ calculateMonthlySalary() + "\ncalculateAnnualCtc()=" + calculateAnnualCtc();
	}

}
