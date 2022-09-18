package com.question6;

import java.util.Scanner;

public class ScienceStudent implements Student {
	
	private int physicsMarks;
	private int chenistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	public int getPhysicsMarks() {
		return 0;
	}
	
	public int getChenistryMarks() {
		return chenistryMarks;
	}

	public void setChenistryMarks(int chenistryMarks) {
		this.chenistryMarks = chenistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		ScienceStudent ss = new ScienceStudent();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for Physics");
		int phy = sc.nextInt();
		ss.setPhysicsMarks(phy);
		
		
		System.out.println("Enter marks for Chemistry");
		int ch = sc.nextInt();
		ss.setChenistryMarks(ch);
		
		
		System.out.println("Enter marks for Maths");
		int ma = sc.nextInt();
		ss.setMathsMarks(ma);
		
		System.out.println("Enter marks for Biolagy");
		int bio = sc.nextInt();
		ss.setBiologyMarks(bio);
		
		double percent = ((ss.getPhysicsMarks() + ss.getChenistryMarks() + ss.getMathsMarks() + ss.getBiologyMarks()) /400)*100;
		
		return percent;
	}
}
