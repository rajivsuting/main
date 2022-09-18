package com.question6;

import java.util.Scanner;

public class ArtStudent implements Student {
	
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		ArtStudent as = new ArtStudent();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for Hindi");
		int hi = sc.nextInt();
		as.setHindiMarks(hi);
		
		
		System.out.println("Enter marks for English");
		int eng = sc.nextInt();
		as.setEnglishMarks(eng);
		
		
		System.out.println("Enter marks for History");
		int hs = sc.nextInt();
		as.setHistoryMarks(hs);
		
		double percent = ((as.getEnglishMarks()+as.getHindiMarks() + as.getHistoryMarks())/300)*100;
		
		return percent;
	}
	

}
