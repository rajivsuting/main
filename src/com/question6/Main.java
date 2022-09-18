package com.question6;

import java.util.Scanner;

public class Main {
	
	public static double getStudent(int choice) {
		if(choice == 1) {
			ArtStudent as = new ArtStudent();
			double p = as.findPercentage();
			return p;
		}else if(choice == 2) {
			ScienceStudent ss = new ScienceStudent();
			double p = ss.findPercentage();
			return p;
		}else if(choice == 3) {
			CommerceStudent cs = new CommerceStudent();
			double p = cs.findPercentage();
			return p;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. Art Student");
		System.out.println("2. Science Student");
		System.out.println("3. Commerce Student");
		int choice = sc.nextInt();
		
		double p = getStudent(choice);
		System.out.println("Percentage is "+p+"%");
		

	}

}
