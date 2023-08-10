package com.aurionpro.model;

public abstract class Employee {

	protected int id;
	protected String name;
	protected double basic;

	
	public abstract double calculateMonthlySalary();

	public abstract double calculateAnnualCtc();

	

}
