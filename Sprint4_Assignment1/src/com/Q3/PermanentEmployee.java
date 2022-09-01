package com.Q3;

public class PermanentEmployee extends Employee {

	private double basicPay;

	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		
		double PF_Amount = basicPay * 0.12;
		
		salary = basicPay - PF_Amount;
		
		System.out.println(salary);
		
	}
	

}
