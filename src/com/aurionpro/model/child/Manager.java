package com.aurionpro.model.child;

import com.aurionpro.model.Employee;

public class Manager extends Employee {

	private double hra;
	private double da;
	private double ta;

	public Manager(int id, String name, double basic) {
//		super(id, name, basic);

		this.id = id;
		this.name = name;
		this.basic = basic;

		this.hra = this.basic * 0.4;
		this.da = this.basic * 0.3;
		this.ta = this.basic * 0.1;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {

		if (hra == 40 % (this.basic)) {
			this.hra = hra;
		}

	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double calculateMonthlySalary() {

		return (this.basic + hra + da + ta);
	}

	public double calculateAnnualCtc() {

		return calculateMonthlySalary() * 12;
	}

	@Override
	public String toString() {
		return "\nRole: Manager \n\nid = " + this.id + "\nname = " + this.name + "\nbasic salary = " + this.basic
				+ "\nhra = " + hra + "\nda = " + da + "\nta = " + ta + "\nMonthly Salary = " + calculateMonthlySalary()
				+ "\nAnnual Ctc = " + calculateAnnualCtc();
	}

}
