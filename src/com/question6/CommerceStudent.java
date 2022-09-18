package com.question6;

import java.util.Scanner;

public class CommerceStudent implements Student {
	
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		CommerceStudent cs = new CommerceStudent();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter marks for Accounts :");
		int ac = sc.nextInt();
		cs.setAccountMarks(ac);
		
		System.out.println("Enter marks for Economics :");
		int eco = sc.nextInt();
		cs.setEconomicsMarks(eco);
		
		System.out.println("Enter marks for Business Studies :");
		int bs = sc.nextInt();
		cs.setBusinessStudiesMarks(bs);
		
		double percent = ((cs.getAccountMarks() + cs.getBusinessStudiesMarks() + cs.getEconomicsMarks())/300) * 100;
	
		
		return percent;
	}

}
