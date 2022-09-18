package com.question4;

import java.util.Scanner;;

public class Main {
	
	public void findChar(String str, int index) {
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==index) {
				System.out.println(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String :-");
		String str = sc.next();
		
		System.out.println("Enter a position :-");
		int pos = sc.nextInt();
		
		if(pos>str.length()) {
			System.out.println("Invalid position, Please enter a valid position =>");
			pos = sc.nextInt();
		}else {
			m.findChar(str, pos);
		}
		
		
		

	}

}
